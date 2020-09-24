package com.h3c.mds.auth.strategy;

import com.h3c.mds.auth.business.TreeLevel;
import com.h3c.mds.auth.constant.FilterConstant;
import org.apache.ibatis.binding.MapperMethod;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Scope("prototype")
@Component("pdtFilterStrategy")
public class PdtFilterStrategy extends AbstractFilterStrategy{

    @Override
    protected TreeLevel getTreeLevel() {
        if(this.filterParam instanceof MapperMethod.ParamMap){
            Map param = (Map) ((MapperMethod.ParamMap) filterParam).get("param");
            if(param.get("id") == null){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_PRODLINE","PRODLINENo","Readers","prodlineno");
            }else if(param.get("id") != null && "PL".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_BASE,"IBDS_PRODLINE","PRODLINENo","Readers","prodlineno");
            }
        }
        return null;
    }
}
