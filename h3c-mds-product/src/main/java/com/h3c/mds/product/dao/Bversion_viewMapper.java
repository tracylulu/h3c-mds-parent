package com.h3c.mds.product.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.BusinessFilter;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.product.entity.Bversion_view;
import com.h3c.mds.product.entity.Bversion_viewExample;

public interface Bversion_viewMapper {
    long countByExample(Bversion_viewExample example);

    int deleteByExample(Bversion_viewExample example);

    int insert(Bversion_view record);

    int insertSelective(Bversion_view record);

    List<Bversion_view> selectByExample(Bversion_viewExample example);

    int updateByExampleSelective(@Param("record") Bversion_view record, @Param("example") Bversion_viewExample example);

    int updateByExample(@Param("record") Bversion_view record, @Param("example") Bversion_viewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "bversionFilterStrategy")
    List<Bversion_view> getTreeData(@Param("param") Map<String, String> param);//selectByCode
    
    Bversion_view selectByCode(@Param("code") String code);
    
    Bversion_view selectByID(@Param("code") Integer code);
    
    String getMaxCode();
    
    List<Bversion_view> getExportList(@Param("param") Map<String, String> param);
}