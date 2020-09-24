package com.h3c.mds.flowable.dao;

import com.h3c.mds.flowable.entity.IbdsEip;
import com.h3c.mds.flowable.entity.IbdsEipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IbdsEipMapper {
    long countByExample(IbdsEipExample example);

    int deleteByExample(IbdsEipExample example);

    int insert(IbdsEip record);

    int insertSelective(IbdsEip record);

    List<IbdsEip> selectByExample(IbdsEipExample example);

    int updateByExampleSelective(@Param("record") IbdsEip record, @Param("example") IbdsEipExample example);

    int updateByExample(@Param("record") IbdsEip record, @Param("example") IbdsEipExample example);
}