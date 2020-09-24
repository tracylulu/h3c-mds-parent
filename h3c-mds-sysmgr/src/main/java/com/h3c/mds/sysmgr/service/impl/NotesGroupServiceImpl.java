package com.h3c.mds.sysmgr.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.sysmgr.dao.NotesGroupMapper;
import com.h3c.mds.sysmgr.dao.UserGroupMapper;
import com.h3c.mds.sysmgr.entity.NotesGroup;
import com.h3c.mds.sysmgr.entity.UserGroup;
import com.h3c.mds.sysmgr.service.NotesGroupService;



@Service
public class NotesGroupServiceImpl implements NotesGroupService{
	
	@Autowired
	private NotesGroupMapper groupMapper;
	
	@Autowired
	private UserGroupMapper admpMapper;
	/**
	 * 群组联想
	 * @param param
	 * @return
	 */
	@Override
	public List<NotesGroup> selGroupbyparam(Map<String,String> param) {
		List<NotesGroup> list = groupMapper.selGroupbyparam(param);
		return list;
	}
	
	/**
	 * admp群组对应的人员
	 * @param param
	 * @return
	 */
	public List<UserGroup> selUserGroupbyparam(Map<String,String> param){
		return admpMapper.selUserGroupbyparam(param);
	}
	
}
