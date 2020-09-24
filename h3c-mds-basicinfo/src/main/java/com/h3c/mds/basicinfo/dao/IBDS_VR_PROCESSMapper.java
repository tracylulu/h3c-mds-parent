package com.h3c.mds.basicinfo.dao;

import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESS;
import com.h3c.mds.basicinfo.entity.IBDS_VR_PROCESSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IBDS_VR_PROCESSMapper {
    long countByExample(IBDS_VR_PROCESSExample example);

    int deleteByExample(IBDS_VR_PROCESSExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IBDS_VR_PROCESS record);

    int insertSelective(IBDS_VR_PROCESS record);

    List<IBDS_VR_PROCESS> selectByExample(IBDS_VR_PROCESSExample example);

    IBDS_VR_PROCESS selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IBDS_VR_PROCESS record, @Param("example") IBDS_VR_PROCESSExample example);

    int updateByExample(@Param("record") IBDS_VR_PROCESS record, @Param("example") IBDS_VR_PROCESSExample example);

    int updateByPrimaryKeySelective(IBDS_VR_PROCESS record);

    int updateByPrimaryKey(IBDS_VR_PROCESS record);

    String getMaxCode();

    //int updateByApplyCode(IBDS_VR_PROCESS record);

    int insertSelectiveBackID(IBDS_VR_PROCESS record);
}