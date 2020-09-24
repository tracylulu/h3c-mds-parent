package com.h3c.mds.finance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.finance.entity.FProjectCodeViewExample;

public interface FProjectCodeViewMapper {
    long countByExample(FProjectCodeViewExample example);

    int deleteByExample(FProjectCodeViewExample example);

    int insert(FProjectCodeView record);

    int insertSelective(FProjectCodeView record);

    List<FProjectCodeView> selectByExample(FProjectCodeViewExample example);

    int updateByExampleSelective(@Param("record") FProjectCodeView record, @Param("example") FProjectCodeViewExample example);

    int updateByExample(@Param("record") FProjectCodeView record, @Param("example") FProjectCodeViewExample example);
    
    
    //项目编码列表
    public List<Map<String, Object>> listOfProjectCode(@Param("param")Map<String, Object> param);
    
    public List<Map<String, Object>> listOfFlowableProjectCode(@Param("param")Map<String, Object> param);
    
    public int countListOfProjectCode(@Param("param")Map<String, Object> param);
    //按照产品线，PDT查询
    public List<Map<String, Object>> listOfProjectCodeByPdt(@Param("param")Map<String, Object> param);
    
    //按产品线，项目类别查询
    public List<Map<String, Object>> listOfProjectCodeByProjType(@Param("param")Map<String, Object> param);
    
    //按产品对应项目查询
    public List<Map<String, Object>> listOfProjectCodeByProd(@Param("param")Map<String, Object> param);
    
    //展现属性
    public List<Map<String, Object>> getProperties(@Param("param")Map<String, Object> param);
    
    //项目编码编辑页面回显
    public List<Map<String, Object>> getFProjectCodeByCode(@Param("param")Map<String, Object> param);
    
    
    //public List<Map<String, Object>> findByPage(@Param("param")Map<String, Object> param);
    
    //获取导出数据列表
    public List<FProjectCodeView> getExportList(@Param("param")Map<String, Object> param);

    public List<FProjectCodeView> getExportList2(@Param("param")Map<String, Object> param);
    
    
    
    public List<Map<String, String>> getAllProdline(@Param("param")Map<String, Object> param);
    
    
    public List<Map<String , String>> getAllPdt(@Param("param")Map<String, Object> param);

	public List<Map<String, String>> getPdtByProlineno(@Param("param")Map<String, Object> param);
    
    
    //public List<Map<String, String>> getPdtByProdlineNo();
}