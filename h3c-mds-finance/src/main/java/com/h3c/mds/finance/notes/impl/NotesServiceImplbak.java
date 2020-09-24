package com.h3c.mds.finance.notes.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.mds.finance.dao.NotesProjectCodeMapper;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectProductRel;
import com.h3c.mds.finance.entity.NotesProjectCode;
import com.h3c.mds.finance.notes.NotesServicebak;
import com.h3c.mds.finance.service.FProjectCodeService;

//@Service
public class NotesServiceImplbak implements NotesServicebak{

	@Autowired
	private NotesProjectCodeMapper  notesProjectCodeMapper;
	
	@Autowired
	private FProjectCodeService fProjectCodeService;
	
	
	

	@Override
	public boolean isInitNotesData() {
		
		return true;
	}

	@Override
//	@PostConstruct
	public boolean transAllNotesDataToFProjectCode() {
		
		if(isInitNotesData()){
			List<NotesProjectCode> projectCodeList =  getAllProjectCodeFromNotes();
			
			if(CollectionUtils.isNotEmpty(projectCodeList)){
			
				for(int i = 0; i < projectCodeList.size(); i++){
					NotesProjectCode tmpNotesProjectCode = projectCodeList.get(i);
					//项目编码内码是否已经存在了
					FProjectCode fProjectCode = buildFProjectCode(tmpNotesProjectCode);
					
					//1 区分名称是 R还是B版本
					if(StringUtils.isNotBlank(fProjectCode.getfProjname())){
						
						//B版本存在
						if(StringUtils.isNotBlank(endWithBversion(fProjectCode.getfProjname()))){
							String bVersionName = endWithBversion(fProjectCode.getfProjname());
							String releaseName = fProjectCode.getfProjname().replaceAll(bVersionName, "");
							
							
							
							
						}else{//关联R版本
							
							
						}
						
						
						
						
					}else{
						
					}
					
					//找到产品编码
					
					
				}
			}
			
		}
		return false;
	}

	@Override
	public List<NotesProjectCode> getAllProjectCodeFromNotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FProjectProductRel buildProjectCodeAndProductCodeRel(
			NotesProjectCode notesProjectCode) {
		FProjectProductRel tmpFProjectProductRel = new FProjectProductRel();
//		FProjectProductRel fProjectProductRel = new FProjectProductRel();
//		fProjectProductRel.setfProductCode(notesProjectCode.getfProdno());
//		fProjectProductRel.setfProjno(notesProjectCode.getfProjno());
//		fProjectProductRel.setRate(notesProjectCode.getfBili());
//		fProjectProductRel.setfOldProductCode(notesProjectCode.getfProdnoOld());
//		if(StringUtils.isNotBlank(String.valueOf(notesProjectCode.getfBili1()))){
//			fProjectProductRel.setfOldRate(String.valueOf(notesProjectCode.getfBili1()));			
//		}
		
		return tmpFProjectProductRel;
	}

	@Override
	public FProjectCode buildFProjectCode(NotesProjectCode notesProjectCode) {
		FProjectCode tmpFProjectCode = new FProjectCode();
//		tmpFProjectCode.setfObjcaName(notesProjectCode.getfZhonglei());
//		tmpFProjectCode.setfPdtName(notesProjectCode.getfYewubu());
//		tmpFProjectCode.setfProjno(notesProjectCode.getfProjno());
//		tmpFProjectCode.setfProjname(notesProjectCode.getfProjname());
//		tmpFProjectCode.setfProjcode(notesProjectCode.getfProjcode());
//		tmpFProjectCode.setfProductlineName(notesProjectCode.getfLingyu());
//		tmpFProjectCode.setfVersion(notesProjectCode.getfBanben());
//		tmpFProjectCode.setfProductno(notesProjectCode.getfProdno());
////		tmpFProjectCode.setProductna setPRODUCT_NAME_CN("");
////		tmpFProjectCode.setfRate(notesProjectCode.getfBili());
//		tmpFProjectCode.setfBizhong(notesProjectCode.getfBizhong());
//		tmpFProjectCode.setfFbizhong(notesProjectCode.getfFbizhong());
//		tmpFProjectCode.setBegintime(notesProjectCode.getBegintime());
//		tmpFProjectCode.setfProjmng(notesProjectCode.getfJingli());
//		tmpFProjectCode.setfDept(notesProjectCode.getfBumen());
//		tmpFProjectCode.setfStartProjectTime(notesProjectCode.getfLixiang());
//		tmpFProjectCode.setfAssignPointName(notesProjectCode.getfPingshendian());
//		tmpFProjectCode.setRemark(notesProjectCode.getfExplain());
//		tmpFProjectCode.setfOldObjcaName(notesProjectCode.getfZhonglei1());
//		tmpFProjectCode.setfOldPdtName(notesProjectCode.getfYewubu1());
//		tmpFProjectCode.setfOldProjno(notesProjectCode.getfProjno1());
//		tmpFProjectCode.setfOldProjname(notesProjectCode.getfProjname1());
//		tmpFProjectCode.setfOldProjcode(notesProjectCode.getfProjcode1());
//		tmpFProjectCode.setfOldProductlineName(notesProjectCode.getfLingyu1());
//		tmpFProjectCode.setfOldVersion(notesProjectCode.getfBanben1());
//		tmpFProjectCode.setfOldProductno(notesProjectCode.getfProdnoOld());
//		tmpFProjectCode.setfOldProductname(notesProjectCode.getfProdnameOld());
//		tmpFProjectCode.setfOldRate(notesProjectCode.getfBili1());
//		tmpFProjectCode.setfOldBizhong(notesProjectCode.getfBizhong1());
//		tmpFProjectCode.setfOldFbizhong(notesProjectCode.getfFbizhong());
		
		
		return tmpFProjectCode;
	}
	
	private String endWithBversion(String projectName){
		String res = "";
		String[] bArr = {"B01" ,"B02", "B03", "B04", "B05", "B06", "B07", "B08", "B09", "B10", "B11", "B12", "B13", "B14", "B15", "B16"};
		
		for(int i = 0; i < bArr.length; i++){
			if(projectName.endsWith(bArr[i])){
				res =  bArr[i];
				break;
			}
		}
		return res;
	}

	@Override
	public boolean isExistProjectCode(FProjectCode fProjectCode,
			FProjectProductRel FProjectProductRel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExistProjectCodeProductRel(FProjectCode fProjectCode,
			FProjectProductRel FProjectProductRel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
