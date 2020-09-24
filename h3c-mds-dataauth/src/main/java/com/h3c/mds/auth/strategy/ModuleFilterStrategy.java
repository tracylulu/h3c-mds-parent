package com.h3c.mds.auth.strategy;

import com.h3c.mds.auth.business.TreeLevel;
import com.h3c.mds.auth.constant.FilterConstant;
import org.apache.ibatis.binding.MapperMethod;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Scope("prototype")
@Component("moduleFilterStrategy")
public class ModuleFilterStrategy extends AbstractFilterStrategy{
    @Override
    protected TreeLevel getTreeLevel() {
        if(this.filterParam instanceof MapperMethod.ParamMap){
            Map param = (Map) ((MapperMethod.ParamMap) filterParam).get("param");
            if(param.get("id") == null){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_PRODLINE","PRODLINENo","Readers","prodlineno");
            }else if(param.get("id") != null && "PL".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_PRODUCT","PRODUCTNo","Readers","prodlineno");
            }else if(param.get("id") != null && "PP".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_RELEASE","RELEASENo","Readers","prodlineno");
            }else if(param.get("id") != null && "PR".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_SUB_SYSTEM","SUBSYSTEMNo","Readers","prodlineno");
            }else if(param.get("id") != null && "SS".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_BASE,"IBDS_MODULE","MODULENo","Readers","moduleno");
            }
        }
        return null;
    }
}
