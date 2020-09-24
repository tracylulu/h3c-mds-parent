package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.NotesGroup;
import com.h3c.mds.sysmgr.entity.UserGroup;
import com.h3c.mds.sysmgr.entity.UserGroupExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserGroupMapper {
    long countByExample(UserGroupExample example);

    int deleteByExample(UserGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    List<UserGroup> selectByExample(UserGroupExample example);

    UserGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
    
    /**
	 * Admp群组联想
	 * @param param
	 * @return
	 */
	List<UserGroup> selUserGroupbyparam(@Param("param") Map<String,String> param);
}