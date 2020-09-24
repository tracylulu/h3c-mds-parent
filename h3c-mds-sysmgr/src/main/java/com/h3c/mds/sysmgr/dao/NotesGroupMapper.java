package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.NotesGroup;
import com.h3c.mds.sysmgr.entity.NotesGroupExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface NotesGroupMapper {
    long countByExample(NotesGroupExample example);

    int deleteByExample(NotesGroupExample example);

    int insert(NotesGroup record);

    int insertSelective(NotesGroup record);

    List<NotesGroup> selectByExampleWithBLOBs(NotesGroupExample example);

    List<NotesGroup> selectByExample(NotesGroupExample example);

    int updateByExampleSelective(@Param("record") NotesGroup record, @Param("example") NotesGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") NotesGroup record, @Param("example") NotesGroupExample example);

    int updateByExample(@Param("record") NotesGroup record, @Param("example") NotesGroupExample example);
    
    /**
	 * 群组联想
	 * @param param
	 * @return
	 */
	List<NotesGroup> selGroupbyparam(@Param("param") Map<String,String> param);
}