package com.h3c.mds.flowable.dao;

import com.h3c.mds.auth.annotation.DataAuth;
import com.h3c.mds.flowable.entity.PartExport;
import com.h3c.mds.flowable.entity.PartExportExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface PartExportMapper {
    long countByExample(PartExportExample example);

    int deleteByExample(PartExportExample example);

    int insert(PartExport record);

    int insertSelective(PartExport record);

    List<PartExport> selectByExample(PartExportExample example);

    int updateByExampleSelective(@Param("record") PartExport record, @Param("example") PartExportExample example);

    int updateByExample(@Param("record") PartExport record, @Param("example") PartExportExample example);
    
    @DataAuth(resource = "partCode",type="userRole",field = "APPLY_PERSON")
    List<PartExport> getExportList(@Param("param") Map<String,Object> param);
}