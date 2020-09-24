package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.view_StopUsingProducts;
import com.h3c.mds.product.entity.view_StopUsingProductsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface view_StopUsingProductsMapper {
    long countByExample(view_StopUsingProductsExample example);

    int deleteByExample(view_StopUsingProductsExample example);

    int insert(view_StopUsingProducts record);

    int insertSelective(view_StopUsingProducts record);

    List<view_StopUsingProducts> selectByExample(view_StopUsingProductsExample example);

    int updateByExampleSelective(@Param("record") view_StopUsingProducts record, @Param("example") view_StopUsingProductsExample example);

    int updateByExample(@Param("record") view_StopUsingProducts record, @Param("example") view_StopUsingProductsExample example);
    
    List<view_StopUsingProducts>  selectGrid(@Param("param") Map<String,String> param);
    
    List<view_StopUsingProducts>  selectTreeGrid(@Param("param") Map<String,String> param);
    
    List<view_StopUsingProducts> findByPage(@Param("param") Map<String,Object> param);
}