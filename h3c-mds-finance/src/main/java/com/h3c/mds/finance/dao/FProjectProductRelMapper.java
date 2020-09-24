package com.h3c.mds.finance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.FProjectProductRelExample;

public interface FProjectProductRelMapper {
    long countByExample(FProjectProductRelExample example);

    int deleteByExample(FProjectProductRelExample example);

    int insert(FProjectProductRel record);

    int insertSelective(FProjectProductRel record);

    List<FProjectProductRel> selectByExample(FProjectProductRelExample example);

    int updateByExampleSelective(@Param("record") FProjectProductRel record, @Param("example") FProjectProductRelExample example);

    int updateByExample(@Param("record") FProjectProductRel record, @Param("example") FProjectProductRelExample example);
    
    
    /**
     * 通过项目编码获取对应的产品信息
     * @param param
     * @return
     */
    public List<Map<String, Object>> getProductByProjectCode(Map<String, Object> param);
    
}