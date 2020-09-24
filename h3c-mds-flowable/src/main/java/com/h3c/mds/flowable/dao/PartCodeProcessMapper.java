package com.h3c.mds.flowable.dao;

import java.util.List;
import java.util.Map;

import com.h3c.mds.auth.annotation.DataAuth;
import org.apache.ibatis.annotations.Param;

import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.entity.PartCodeProcessExample;
import com.h3c.mds.flowable.entity.PartCodeProcessExt;

public interface PartCodeProcessMapper {
    long countByExample(PartCodeProcessExample example);

    int deleteByExample(PartCodeProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartCodeProcess record);

    int insertSelective(PartCodeProcess record);

    List<PartCodeProcess> selectByExample(PartCodeProcessExample example);

    PartCodeProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartCodeProcess record, @Param("example") PartCodeProcessExample example);

    int updateByExample(@Param("record") PartCodeProcess record, @Param("example") PartCodeProcessExample example);

    int updateByPrimaryKeySelective(PartCodeProcess record);

    int updateByPrimaryKey(PartCodeProcess record);
    
    int insertSelectiveAndGetId(PartCodeProcess record);

    @DataAuth(resource = "partCode",type="userRole",field = "APPLY_PERSON")
    List<PartCodeProcess> findByPage( @Param("param") Map<String, Object> param);

    PartCodeProcessExt getExtById(Integer id);
    
    //获取申请单号
    String getMaxApplyCode();

    @DataAuth(resource = "partCode",type="userRole",field = "APPLY_PERSON")
    List<Map<String, Object>> findPartCodeByCurHandler(@Param("param") Map<String, Object> param);

    @DataAuth(resource = "partCode",type="userRole",field = "APPLY_PERSON")
    List<Map<String, Object>> findPartCodeByApplyer(@Param("param") Map<String, Object> param);

    @DataAuth(resource = "partCode",type="userRole",field = "APPLY_PERSON")
    List<Map<String, Object>> findPartCodeByStatus(@Param("param") Map<String, Object> param);

    @DataAuth(resource = "partCode",type="userRole",field = "APPLY_PERSON")
    List<Map<String, Object>> findPartCodeByCloseProcess(@Param("param") Map<String, Object> param);
    
    int countPartCodeByCloseProcess(@Param("param") Map<String, Object> param);
}