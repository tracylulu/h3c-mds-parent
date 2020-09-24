package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IBDS_Dic;
import com.h3c.mds.product.entity.IBDS_DicExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface IBDS_DicMapper {
    long countByExample(IBDS_DicExample example);

    int deleteByExample(IBDS_DicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_Dic record);

    int insertSelective(IBDS_Dic record);

    List<IBDS_Dic> selectByExample(IBDS_DicExample example);

    IBDS_Dic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_Dic record, @Param("example") IBDS_DicExample example);

    int updateByExample(@Param("record") IBDS_Dic record, @Param("example") IBDS_DicExample example);

    int updateByPrimaryKeySelective(IBDS_Dic record);

    int updateByPrimaryKey(IBDS_Dic record);
    
    List<IBDS_Dic> getDic(@Param("param") Map<String,String> param);
    
    List<IBDS_Dic> getList(@Param("param") Map<String,String> param);
    
    List<IBDS_Dic> getDicTypeComb();
    
    List<IBDS_Dic> getValidation(@Param("param") Map<String,String> param);
}