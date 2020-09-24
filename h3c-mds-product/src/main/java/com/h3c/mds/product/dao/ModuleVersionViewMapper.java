package com.h3c.mds.product.dao;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.product.entity.ModuleVersionView;
import com.h3c.mds.product.entity.ModuleVersionViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ModuleVersionViewMapper {
    long countByExample(ModuleVersionViewExample example);

    int deleteByExample(ModuleVersionViewExample example);

    int insert(ModuleVersionView record);

    int insertSelective(ModuleVersionView record);

    List<ModuleVersionView> selectByExample(ModuleVersionViewExample example);

    int updateByExampleSelective(@Param("record") ModuleVersionView record, @Param("example") ModuleVersionViewExample example);

    int updateByExample(@Param("record") ModuleVersionView record, @Param("example") ModuleVersionViewExample example);

    @BusinessFilter(type = "treeFilter",strategy = "moduleVersionFilterStrategy")
    List<ModuleVersionView> getDataList(@Param("param") Map<String, String> searchMap);

    ModuleVersionView selectByCode(String code);
    
    ModuleVersionView selectByID(Integer code);
    
    List<ModuleVersionView> getExportList(@Param("param") Map<String, String> searchMap);
}