package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.NotesProjectCode;
import com.h3c.mds.finance.entity.NotesProjectCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotesProjectCodeMapper {
    long countByExample(NotesProjectCodeExample example);

    int deleteByExample(NotesProjectCodeExample example);

    int insert(NotesProjectCode record);

    int insertSelective(NotesProjectCode record);

    List<NotesProjectCode> selectByExample(NotesProjectCodeExample example);

    int updateByExampleSelective(@Param("record") NotesProjectCode record, @Param("example") NotesProjectCodeExample example);

    int updateByExample(@Param("record") NotesProjectCode record, @Param("example") NotesProjectCodeExample example);
}