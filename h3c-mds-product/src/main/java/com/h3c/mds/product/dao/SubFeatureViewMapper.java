package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.BusinessFilter;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.SubFeatureView;
import com.h3c.mds.product.entity.SubFeatureViewExample;

public interface SubFeatureViewMapper {
    long countByExample(SubFeatureViewExample example);

    int deleteByExample(SubFeatureViewExample example);

    int insert(SubFeatureView record);

    int insertSelective(SubFeatureView record);

    List<SubFeatureView> selectByExample(SubFeatureViewExample example);

    int updateByExampleSelective(@Param("record") SubFeatureView record, @Param("example") SubFeatureViewExample example);

    int updateByExample(@Param("record") SubFeatureView record, @Param("example") SubFeatureViewExample example);

    @BusinessFilter(type="treeFilter",strategy = "subfeatureFilterStrategy")
    List<SubFeatureView> getTreeData(@Param("param") Map<String, String> param);//selectByCode
    
    SubFeatureView selectByCode(@Param("code") String code);
    
    SubFeatureView selectByID(@Param("code") Integer code);
    
    String getMaxCode();
    
    List<SubFeatureView> getExportList(@Param("param") Map<String, String> param);

}