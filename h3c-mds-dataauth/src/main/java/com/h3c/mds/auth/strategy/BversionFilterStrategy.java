package com.h3c.mds.auth.strategy;

import com.h3c.mds.auth.business.TreeLevel;
import com.h3c.mds.auth.constant.FilterConstant;
import org.apache.ibatis.binding.MapperMethod;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Scope("prototype")
@Component("bversionFilterStrategy")
public class BversionFilterStrategy extends AbstractFilterStrategy{
    @Override
    protected TreeLevel getTreeLevel() {
        if(this.filterParam instanceof MapperMethod.ParamMap){
            Map param = (Map) ((MapperMethod.ParamMap) filterParam).get("param");
            if(param.get("id") == null){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_PLIPMT","PLIPMTNo","Readers","plipmtno");
            }else if(param.get("id") != null && "PI".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_PRODLINE","PRODLINENo","Readers","plipmtno");
            }else if(param.get("id") != null && "PL".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_PDT","PDTNo","Readers","plipmtno");
            }else if(param.get("id") != null && "PT".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_VERSION","VERSIONNo","Readers","plipmtno");
            }else if(param.get("id") != null && "PV".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_TREE,"IBDS_RELEASE","RELEASENo","Readers","plipmtno");
            }else if(param.get("id") != null && "PR".equals(param.get("type"))){
                return new TreeLevel(FilterConstant.LEVEL_TYPE_BASE,"IBDS_bversion","bversionno","Readers","bversionno");
            }
        }
        return null;
    }
}
