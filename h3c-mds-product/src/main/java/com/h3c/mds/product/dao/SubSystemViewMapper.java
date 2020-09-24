package com.h3c.mds.product.dao;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.product.entity.ProdLineVew;
import com.h3c.mds.product.entity.SubSystemView;
import com.h3c.mds.product.entity.SubSystemViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SubSystemViewMapper {
    long countByExample(SubSystemViewExample example);

    int deleteByExample(SubSystemViewExample example);

    int insert(SubSystemView record);

    int insertSelective(SubSystemView record);

    List<SubSystemView> selectByExample(SubSystemViewExample example);

    int updateByExampleSelective(@Param("record") SubSystemView record, @Param("example") SubSystemViewExample example);

    int updateByExample(@Param("record") SubSystemView record, @Param("example") SubSystemViewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "subsystemFilterStrategy")
    List<SubSystemView> getDataList(@Param("param") Map<String, String> searchMap);

    SubSystemView selectByCode(String code);
    
    SubSystemView selectByID(Integer code);
    
    List<SubSystemView> getExportList(@Param("param") Map<String, String> searchMap);
}