package com.h3c.mds.product.dao;

import com.h3c.mds.product.entity.IbdsProjectCodeRecommend;
import com.h3c.mds.product.entity.IbdsProjectCodeRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IbdsProjectCodeRecommendMapper {
    long countByExample(IbdsProjectCodeRecommendExample example);

    int deleteByExample(IbdsProjectCodeRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IbdsProjectCodeRecommend record);

    int insertSelective(IbdsProjectCodeRecommend record);

    List<IbdsProjectCodeRecommend> selectByExample(IbdsProjectCodeRecommendExample example);

    IbdsProjectCodeRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IbdsProjectCodeRecommend record, @Param("example") IbdsProjectCodeRecommendExample example);

    int updateByExample(@Param("record") IbdsProjectCodeRecommend record, @Param("example") IbdsProjectCodeRecommendExample example);

    int updateByPrimaryKeySelective(IbdsProjectCodeRecommend record);

    int updateByPrimaryKey(IbdsProjectCodeRecommend record);
}