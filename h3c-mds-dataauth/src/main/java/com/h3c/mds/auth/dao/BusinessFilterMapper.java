package com.h3c.mds.auth.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BusinessFilterMapper {

     Map getBySql(@Param("sql") String sql);

     List getListBySql(@Param("sql") String sql);
}
