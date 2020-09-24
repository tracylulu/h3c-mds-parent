package com.h3c.mds.finance.dao;

import com.h3c.mds.finance.entity.NotesProjectCodeTmp;
import com.h3c.mds.finance.entity.NotesProjectCodeTmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotesProjectCodeTmpMapper {
    long countByExample(NotesProjectCodeTmpExample example);

    int deleteByExample(NotesProjectCodeTmpExample example);

    int insert(NotesProjectCodeTmp record);

    int insertSelective(NotesProjectCodeTmp record);

    List<NotesProjectCodeTmp> selectByExample(NotesProjectCodeTmpExample example);

    int updateByExampleSelective(@Param("record") NotesProjectCodeTmp record, @Param("example") NotesProjectCodeTmpExample example);

    int updateByExample(@Param("record") NotesProjectCodeTmp record, @Param("example") NotesProjectCodeTmpExample example);
}