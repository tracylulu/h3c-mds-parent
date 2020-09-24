package com.h3c.mds.auth.strategy;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.auth.business.TreeLevel;
import com.h3c.mds.auth.constant.FilterConstant;
import com.h3c.mds.auth.dao.BusinessFilterMapper;
import com.h3c.mds.auth.util.DataAuthSpringContextUtils;
import com.h3c.mds.sysmgr.entity.ADMP_MemberGroup;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * 过滤策略抽象类
 */
public abstract class AbstractFilterStrategy<T> implements FilterStrategy<T>{

    private static final Logger logger = LoggerFactory.getLogger(AbstractFilterStrategy.class);

    protected String userDesc;

    protected List<ADMP_MemberGroup> groups;

    protected BusinessFilter businessFilter;

    protected Object filterParam;

    public T checkPermission(T t){
        try {
            if(t == null) return null;
            //如果注解类型为treeFilter，则需要过滤树节点
            if(FilterConstant.FILTER_TYPE_TREEFILTER.equals(businessFilter.type())){
                initFieldValue(t);
            }
            String readers = (String) PropertyUtils.getProperty(t, businessFilter.field());
            if(StringUtils.isBlank(readers) || StringUtils.contains(readers, "*")
            || StringUtils.contains(readers, "EN 8062") || StringUtils.contains(readers, "LE STORAGE")
            || StringUtils.contains(readers, userDesc)){
                return t;
            }
            for(ADMP_MemberGroup group : groups){
                if(StringUtils.contains(readers, group.getGroupname())){
                    return t;
                }
            }
            return null;
        }catch (Exception e){
            logger.error("过滤失败", e);
            throw new RuntimeException("过滤失败");
        }

    }

    /**
     * 初始化树节点的过滤字段值
     * @param t
     * @throws IllegalAccessException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public void initFieldValue(T t) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //获取当前树层级
        TreeLevel level = getTreeLevel();
        //如果为为节点关联查询设值，如果为最底层默认过滤字段有值，不处理
        if(FilterConstant.LEVEL_TYPE_TREE.equals(level.getLevel())){
            Object property = PropertyUtils.getProperty(t, level.getFieldName());
            if(property instanceof String){
                String v = (String) property;
                property = v.split("_")[0];
            }
            //拼接sql查询
            String sql = "SELECT TOP 1 "+level.getQueryFieldName()+" FROM "+level.getTableName()+" WHERE "+level.getConditionFieldName()+" = '"+property+"'";
            BusinessFilterMapper mapper = (BusinessFilterMapper) DataAuthSpringContextUtils.getBean(BusinessFilterMapper.class);
            long i = System.currentTimeMillis();
            Map<String,Object> map = mapper.getBySql(sql);
            long j = System.currentTimeMillis();
            logger.debug("单条查询耗时---"+(j-i)+"毫秒-----");
            PropertyUtils.setProperty(t, businessFilter.field(), map == null?null:map.get(level.getQueryFieldName()));
        }
    }

    protected abstract TreeLevel getTreeLevel();

    @Override
    public void setAttributes(String userDesc, List<ADMP_MemberGroup> groups, BusinessFilter annotation,Object filterParam){
        this.userDesc = userDesc;
        this.groups = groups;
        this.businessFilter = annotation;
        this.filterParam = filterParam;
    }

    @Override
    public String getUserDesc() {
        return userDesc;
    }

    @Override
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    @Override
    public List<ADMP_MemberGroup> getGroups() {
        return groups;
    }

    @Override
    public void setGroups(List<ADMP_MemberGroup> groups) {
        this.groups = groups;
    }

    @Override
    public void setFilterAnnotation(BusinessFilter businessFilter) {
        this.businessFilter = businessFilter;
    }

    public AbstractFilterStrategy(String userDesc, List<ADMP_MemberGroup> groups, BusinessFilter businessFilter, Object filterParam) {
        this.userDesc = userDesc;
        this.groups = groups;
        this.businessFilter = businessFilter;
        this.filterParam = filterParam;
    }

    public AbstractFilterStrategy() {
    }
}
