package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.finance.entity.FProjectCodeViewAll;
import com.h3c.mds.finance.entity.FProjectCodeViewAllExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface FProjectCodeViewAllMapper {
    long countByExample(FProjectCodeViewAllExample example);

    int deleteByExample(FProjectCodeViewAllExample example);

    int insert(FProjectCodeViewAll record);

    int insertSelective(FProjectCodeViewAll record);

    List<FProjectCodeViewAll> selectByExample(FProjectCodeViewAllExample example);

    int updateByExampleSelective(@Param("record") FProjectCodeViewAll record, @Param("example") FProjectCodeViewAllExample example);

    int updateByExample(@Param("record") FProjectCodeViewAll record, @Param("example") FProjectCodeViewAllExample example);
    
    List<Map<String, Object>> listOfProjectCodeAll(@Param("param")Map<String, Object> param);
    
    public int countListOfProjectCodeAll(@Param("param")Map<String, Object> param);
    
  //获取导出数据列表
    public List<FProjectCodeViewAll> getExportList(@Param("param")Map<String, Object> param);

    public List<FProjectCodeViewAll> getExportList2(@Param("param")Map<String, Object> param);
}