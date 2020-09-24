package com.h3c.mds.basicinfo.service;

import java.util.List;
import com.h3c.mds.basicinfo.entity.view_ApproveList;

public interface view_ApproveListService {
	
	public List<view_ApproveList> getList(String type);
	
	public List<view_ApproveList> getMyApplicationList(String type);
	
	public List<view_ApproveList> getHistoryList(String type);
}
