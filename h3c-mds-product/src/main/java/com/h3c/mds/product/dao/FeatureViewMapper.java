package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.BusinessFilter;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.FeatureView;
import com.h3c.mds.product.entity.FeatureViewExample;

public interface FeatureViewMapper {
    long countByExample(FeatureViewExample example);

    int deleteByExample(FeatureViewExample example);

    int insert(FeatureView record);

    int insertSelective(FeatureView record);

    List<FeatureView> selectByExample(FeatureViewExample example);

    int updateByExampleSelective(@Param("record") FeatureView record, @Param("example") FeatureViewExample example);

    int updateByExample(@Param("record") FeatureView record, @Param("example") FeatureViewExample example);
    
    @BusinessFilter(type = "treeFilter",strategy = "featureFilterStrategy")
    List<FeatureView> getTreeData(@Param("param") Map<String, String> param);//selectByCode
    
    FeatureView selectByCode(@Param("code") String code);
    
    FeatureView selectByID(@Param("code") Integer code);
    
    String getMaxCode();
    
    List<FeatureView> getExportList(@Param("param") Map<String, String> param);
}