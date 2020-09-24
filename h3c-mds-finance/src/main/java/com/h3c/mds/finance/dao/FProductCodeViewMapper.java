package com.h3c.mds.finance.dao;

import com.h3c.mds.auth.annotation.DataAuth;
import com.h3c.mds.finance.entity.FProductCodeView;
import com.h3c.mds.finance.entity.FProductCodeViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface FProductCodeViewMapper {
    long countByExample(FProductCodeViewExample example);

    int deleteByExample(FProductCodeViewExample example);

    int insert(FProductCodeView record);

    int insertSelective(FProductCodeView record);

    List<FProductCodeView> selectByExample(FProductCodeViewExample example);

    int updateByExampleSelective(@Param("record") FProductCodeView record, @Param("example") FProductCodeViewExample example);

    int updateByExample(@Param("record") FProductCodeView record, @Param("example") FProductCodeViewExample example);

    @DataAuth(resource = "productCode",type = "userRole")
    List<FProductCodeView> getDataList(@Param("param") Map<String, Object> params);

    @DataAuth(resource = "productCode",type = "userRole")
    List<FProductCodeView> getExportList(@Param("param") Map<String, Object> params);

    List<FProductCodeView> getProdTreeData(@Param("param") Map<String, Object> searchMap);
}