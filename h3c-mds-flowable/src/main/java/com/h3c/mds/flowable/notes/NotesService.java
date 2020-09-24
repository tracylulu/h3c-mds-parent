package com.h3c.mds.flowable.notes;

import java.util.List;

import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeHis;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.FProjectProductRelHis;
import com.h3c.mds.finance.entity.NotesProjectCode;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Release;

public interface NotesService {
	
	/**
	 * 第一次初始化notes数据到财务参考信息
	 * @return
	 */
	boolean isInitNotesData();
	
	
	/**
	 * 
	 * @return
	 */
	void transAllNotesDataToFProjectCode();
	
	boolean isExistUsingProjectCode(FProjectCode fProjectCode, FProjectProductRel FProjectProductRel);
	
	boolean isExistNotUsingProjectCode(FProjectCodeHis fProjectCodehis, FProjectProductRelHis FProjectProductRelHis);
	
	
	boolean isExistUsingProjectCodeProductRel(FProjectCode fProjectCode, FProjectProductRel FProjectProductRel);
	
	boolean isExistNotUsingProjectCodeProductRel(FProjectCodeHis fProjectCodeHis, FProjectProductRelHis FProjectProductRelHis);
	/**
	 * 获取所有的有关项目编码的notes数据
	 * @return
	 */
	List<NotesProjectCode> getUsingProjectCodeFromNotes();
	
	List<NotesProjectCode> getNotUsingProjectCodeFromNotes();
	
	
	
	FProjectProductRel buildProjectCodeAndProductCodeRel(NotesProjectCode notesProjectCode);
	
	
	FProjectCode   buildFProjectCode(NotesProjectCode notesProjectCode);
	
	
	
	IBDS_Release getRelease(String name, String projectCodeNo);
	
	IBDS_Bversion getBversion(String releaseNo, String bVersionName, String releaseName, String projectCodeNo) ;
}
