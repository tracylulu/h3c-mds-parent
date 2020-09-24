package com.h3c.mds.finance.notes;

import java.util.List;

import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.NotesProjectCode;

public interface NotesServicebak {
	
	/**
	 * 第一次初始化notes数据到财务参考信息
	 * @return
	 */
	boolean isInitNotesData();
	
	
	/**
	 * 
	 * @return
	 */
	boolean transAllNotesDataToFProjectCode();
	
	boolean isExistProjectCode(FProjectCode fProjectCode, FProjectProductRel FProjectProductRel);
	
	
	boolean isExistProjectCodeProductRel(FProjectCode fProjectCode, FProjectProductRel FProjectProductRel);
	/**
	 * 获取所有的有关项目编码的notes数据
	 * @return
	 */
	List<NotesProjectCode> getAllProjectCodeFromNotes();
	
	
	
	FProjectProductRel buildProjectCodeAndProductCodeRel(NotesProjectCode notesProjectCode);
	
	
	FProjectCode   buildFProjectCode(NotesProjectCode notesProjectCode);
}
