package com.h3c.mds.product.dao;

import com.h3c.mds.auth.annotation.BusinessFilter;
import com.h3c.mds.product.entity.ModuleView;
import com.h3c.mds.product.entity.ModuleViewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ModuleViewMapper {
    long countByExample(ModuleViewExample example);

    int deleteByExample(ModuleViewExample example);

    int insert(ModuleView record);

    int insertSelective(ModuleView record);

    List<ModuleView> selectByExample(ModuleViewExample example);

    int updateByExampleSelective(@Param("record") ModuleView record, @Param("example") ModuleViewExample example);

    int updateByExample(@Param("record") ModuleView record, @Param("example") ModuleViewExample example);

    @BusinessFilter(type="treeFilter",strategy = "moduleFilterStrategy")
    List<ModuleView> getDataList(@Param("param") Map<String, String> searchMap);

    ModuleView selectByCode(String code);
    
    ModuleView selectByID(Integer code);
    
    List<ModuleView> getExportList(@Param("param") Map<String, String> searchMap);
}