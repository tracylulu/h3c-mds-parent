package com.h3c.mds.sysmgr.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.sysmgr.entity.NotesGroup;
import com.h3c.mds.sysmgr.entity.UserGroup;


public interface NotesGroupService {

	
	/**
	 * 群组联想
	 * @param param
	 * @return
	 */
	public List<NotesGroup> selGroupbyparam(Map<String,String> param);
	/**
	 * admp群组对应的人员
	 * @param param
	 * @return
	 */
	public List<UserGroup> selUserGroupbyparam(Map<String,String> param);
}
