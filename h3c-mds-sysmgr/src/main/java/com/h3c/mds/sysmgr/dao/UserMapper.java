package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.entity.UserExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExampleWithBLOBs(UserExample example);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	User selectByAccount(String account);
	
	List<User> pageOfUser(User user); 
	
	/**
	 * 人员联想
	 * @param param
	 * @return
	 */
	List<User> selUserbyparam(@Param("param") Map<String,String> param);
	
	User selectByCode(@Param("code") String code);
	
	User selectByPCode(@Param("pcode") String pcode);
	
	/*
	 * 根据角色获取用户
	 */
	List<User> getUserByRoleCode(@Param("params")Map<String,String> params);
	
	//add by chenlulu on 20200326
	long getRoleByCodeAndP04(@Param("params")Map<String,String> params);
}