package com.h3c.mds.basicinfo.service;

import com.h3c.mds.basicinfo.entity.view_PeopleApplyList;
import java.util.Map;
import java.util.List;

public interface view_PeopleApplyListService {
	List<view_PeopleApplyList> selectByMap(Map<String,String> param);
}
