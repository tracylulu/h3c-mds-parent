package com.h3c.mds.auth.interceptor;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.auth.annotation.DataAuth;
import com.h3c.mds.auth.constant.FilterConstant;
import com.h3c.mds.auth.entity.DataPerm;
import com.h3c.mds.auth.service.DataPermService;
import com.h3c.mds.auth.util.BusinessFilterThreadContext;
import com.h3c.mds.auth.util.DataAuthSpringContextUtils;
import com.h3c.mds.sysmgr.service.UserService;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statements;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Properties;

/**
 * 基本mybatis拦截器实现的数据权限过滤器
 */
@Intercepts({@Signature(type = Executor.class,method = "query",
        args = {MappedStatement.class,Object.class, RowBounds.class,ResultHandler.class})})
//@Component
public class AuthInterceptor implements Interceptor {

    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        logger.info("拦截器生效-----");
        Object[] args = invocation.getArgs();
        MappedStatement mappedStatements = (MappedStatement) args[0];
        //判断该方法是否有业务过滤注解，有设置过滤状态为启用，无设置为禁用
        BusinessFilter fileterAnnotation = getFileterAnnotation(args);
        if(fileterAnnotation == null){
            BusinessFilterThreadContext.setFilterStatus(FilterConstant.FILTER_STATUS_DISABLE);
        }else{
            BusinessFilterThreadContext.setFilterStatus(FilterConstant.FILTER_STATUS_ENABLE);
            BusinessFilterThreadContext.setFilterParam(args[1]);
            BusinessFilterThreadContext.setFilterAnnotation(fileterAnnotation);
        }
        //获取方法注解，如果注解为空则直接通过
        DataAuth dataAuth = getPermissionByDelegate(mappedStatements);
        if(dataAuth == null){
            Object result =  invocation.proceed();
            return result;
        }
        String sql1 = mappedStatements.getBoundSql(invocation.getArgs()[1]).getSql();
        //获取权限表达式
        String authSql = getAuthSql(dataAuth);
        if(StringUtils.isBlank(authSql)) return invocation.proceed();
        String sql = mappedStatements.getBoundSql(invocation.getArgs()[1]).getSql();
        //包装权限sql
        permissionSql(sql,authSql,invocation);
        Object result = invocation.proceed();
        return result;
    }

    private BusinessFilter getFileterAnnotation(Object[] args) {
        BusinessFilter businessFilter = null;
        MappedStatement mappedStatements = (MappedStatement) args[0];
        try {
            String id = mappedStatements.getId();
            String className = id.substring(0, id.lastIndexOf("."));
            String methodName = id.substring(id.lastIndexOf(".")+1, id.length());
            Class<?> cls = Class.forName(className);
            Method[] methods = cls.getMethods();
            for(Method method : methods){
                if(method.getName().equals(methodName) && method.isAnnotationPresent(BusinessFilter.class)){
                    businessFilter = method.getAnnotation(BusinessFilter.class);
                    break;
                }
            }

        }catch (Exception e){
            logger.error("获取注解失败", e);
        }
        return businessFilter;
    }

    private void permissionSql(String sql, String authSql, Invocation invocation) throws JSQLParserException {
        Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        Object paramObject = args[1];
        BoundSql boundSql = statement.getBoundSql(paramObject);
        MappedStatement newStatement = newMappedStatement(statement,new AuthSqlSource(boundSql));
        MetaObject msObject = MetaObject.forObject(newStatement, new DefaultObjectFactory(), new DefaultObjectWrapperFactory(), new DefaultReflectorFactory());
        //sql拼接  采用sql解析器解析sql 防止 在 order by 后添加条件
        if(!"".equals(authSql.trim()) ){
            authSql = "SELECT 1 FROM A WHERE ("+authSql+")";
            Statements statements = CCJSqlParserUtil.parseStatements(sql);
            //((PlainSelect)((Select)statements.getStatements().get(0)).selectBody).where
            Select select = (Select)statements.getStatements().get(0);
            PlainSelect plainSelect = (PlainSelect)select.getSelectBody();
            Expression where = plainSelect.getWhere();
            Statements statements1 = CCJSqlParserUtil.parseStatements(authSql);
            PlainSelect plainSelect1 = (PlainSelect)((Select)statements1.getStatements().get(0)).getSelectBody();
            Expression where1 = plainSelect1.getWhere();
            if(where == null){
                plainSelect.setWhere(where1);
            }else{
                AndExpression andExpression = new AndExpression(where, where1);
                plainSelect.setWhere(andExpression);
            }
            sql = statements.toString();
        }
        //sql替换
        msObject.setValue("sqlSource.boundSql.sql", sql);
        args[0] = newStatement;
    }

    private MappedStatement newMappedStatement(MappedStatement ms, AuthSqlSource authSqlSource) {
        MappedStatement.Builder builder = new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), authSqlSource,
                ms.getSqlCommandType());
        builder.resource(ms.getResource());
        builder.fetchSize(ms.getFetchSize());
        builder.statementType(ms.getStatementType());
        builder.keyGenerator(ms.getKeyGenerator());
        if (ms.getKeyProperties() != null && ms.getKeyProperties().length != 0) {
            StringBuilder keyProperties = new StringBuilder();
            for (String keyProperty : ms.getKeyProperties()) {
                keyProperties.append(keyProperty).append(",");
            }
            keyProperties.delete(keyProperties.length() - 1, keyProperties.length());
            builder.keyProperty(keyProperties.toString());
        }
        builder.timeout(ms.getTimeout());
        builder.parameterMap(ms.getParameterMap());
        builder.resultMaps(ms.getResultMaps());
        builder.resultSetType(ms.getResultSetType());
        builder.cache(ms.getCache());
        builder.flushCacheRequired(ms.isFlushCacheRequired());
        builder.useCache(ms.isUseCache());

        return builder.build();


    }

    private String getAuthSql(DataAuth dataAuth) {
        //获取分页对象
        Page<Object> localPage = PageHelper.getLocalPage();
        //先清除分页对象
        PageHelper.clearPage();
        String authSql = "";
        DataPermService dataPermService = (DataPermService) DataAuthSpringContextUtils.getBean(DataPermService.class);
        UserService userService = (UserService) DataAuthSpringContextUtils.getBean(UserService.class);
        String resource = dataAuth.resource();
        if(StringUtils.isBlank(resource)) throw new RuntimeException("资源名称必填！");
        String type = dataAuth.type();
        if(StringUtils.isBlank(type)) throw new RuntimeException("过滤类型必填！");

        String account = (String) SecurityUtils.getSubject().getPrincipal();
        String nameDesc = userService.getNameDescByAccount(account);

        List<DataPerm> dataPerms = dataPermService.getByUserAccountAndResource(account,resource,type);
        //查询后再放入分页对象，如果不进行操作 过滤条件的查询会用到业务的分页，导致实际业务方法的分页被清除
        if(localPage != null){
            PageHelper.startPage(localPage.getPageNum(), localPage.getPageSize(),localPage.isCount());
        }
        if("userRole".equals(type)){
            if(CollectionUtils.isEmpty(dataPerms)) throw new RuntimeException("该操作需要用户角色数据权限，请配置权限");

            int i = 0;
            for(DataPerm dataPerm : dataPerms){
                if("ALL".equals(dataPerm.getExpression())){
                  authSql = "";
                  break;
                }
                if(i == 0){
                    authSql += (" "+dataPerm.getExpression()+" ");
                }else{
                    authSql += (" AND "+dataPerm.getExpression()+" ");
                }
                i++;
            }
        }else if("userManager".equals(type)){
            if(CollectionUtils.isEmpty(dataPerms)){
                authSql = dataAuth.field() + "='"+nameDesc+"'";
            }
        }



//        if("userRole".equals(type)){
//            String account = (String) SecurityUtils.getSubject().getPrincipal();
//
//            //获取分页对象
//            Page<Object> localPage = PageHelper.getLocalPage();
//            //先清除分页对象
//            PageHelper.clearPage();
//            List<DataPerm> dataPerms = dataPermService.getByUserAccountAndResource(account,resource,type);
//            //查询后再放入分页对象，如果不进行操作 过滤条件的查询会用到业务的分页，导致实际业务方法的分页被清除
//            if(localPage != null){
//                PageHelper.startPage(localPage.getPageNum(), localPage.getPageSize(),localPage.isCount());
//            }
//            if(CollectionUtils.isEmpty(dataPerms)) throw new RuntimeException("该操作需要用户角色数据权限，请配置权限");
//
//            int i = 0;
//            for(DataPerm dataPerm : dataPerms){
//                if(i == 0){
//                    authSql += (" "+dataPerm.getExpression()+" ");
//                }else{
//                    authSql += (" AND "+dataPerm.getExpression()+" ");
//                }
//                i++;
//            }
//        }else if("userManager".equals(type)){
//            String field = dataAuth.field();
//            if(StringUtils.isBlank(field)) throw new RuntimeException("类型为userManager时，校验字段必填");
//
//        }
        return authSql.replaceAll("CURRENT_USER_DESC", nameDesc).replace("CURRENT_USER_ACCOUNT", account);
    }

    private DataAuth getPermissionByDelegate(MappedStatement mappedStatements) {
        DataAuth dataAuth = null;
        try {
            String id = mappedStatements.getId();
            String className = id.substring(0, id.lastIndexOf("."));
            String methodName = id.substring(id.lastIndexOf(".")+1, id.length());
            Class<?> cls = Class.forName(className);
            Method[] methods = cls.getMethods();
            for(Method method : methods){
                if(method.getName().equals(methodName) && method.isAnnotationPresent(DataAuth.class)){
                    dataAuth = method.getAnnotation(DataAuth.class);
                    break;
                }
            }
        }catch (Exception e){
            logger.error("获取注解失败", e);
        }
        return dataAuth;
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    class AuthSqlSource implements SqlSource{

        private BoundSql boundSql;

        public AuthSqlSource(BoundSql boundSql){
            this.boundSql = boundSql;
        }

        @Override
        public BoundSql getBoundSql(Object o) {
            return this.boundSql;
        }
    }
}
