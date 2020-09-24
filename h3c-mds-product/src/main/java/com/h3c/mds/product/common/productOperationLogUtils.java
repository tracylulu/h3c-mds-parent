package com.h3c.mds.product.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h3c.mds.product.entity.IBDSProject;
import com.h3c.mds.product.entity.IBDS_BaseLine;
import com.h3c.mds.product.entity.IBDS_Bversion;
import com.h3c.mds.product.entity.IBDS_Feature;
import com.h3c.mds.product.entity.IBDS_Module;
import com.h3c.mds.product.entity.IBDS_ModuleVersion;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import com.h3c.mds.product.entity.IBDS_PRODLINE;
import com.h3c.mds.product.entity.IBDS_Product;
import com.h3c.mds.product.entity.IBDS_Release;
import com.h3c.mds.product.entity.IBDS_SubFeature;
import com.h3c.mds.product.entity.IBDS_SubSystem;
import com.h3c.mds.product.entity.IBDS_Team;
import com.h3c.mds.product.entity.IBDS_Version;

@Component
public class productOperationLogUtils {
	@Autowired
	private OperationLogUtils<IBDS_PLIPMT> ipmtOptLog;
	@Autowired
	private OperationLogUtils<IBDS_PRODLINE> prodLineOptLog;
	@Autowired
	private OperationLogUtils<IBDS_PDT> pdtOptLog;
	@Autowired
	private OperationLogUtils<IBDS_Product> productOptLog;
	@Autowired
	private OperationLogUtils<IBDSProject> projectOptLog;
	@Autowired
	private OperationLogUtils<IBDS_Version> versionOptLog;
	@Autowired
	private OperationLogUtils<IBDS_Release> releaseOptLog;
	@Autowired
	private OperationLogUtils<IBDS_Bversion> bVersionOptLog;
	@Autowired
	private OperationLogUtils<IBDS_BaseLine> baseLineOptLog;
	@Autowired
	private OperationLogUtils<IBDS_Feature> featureOptLog;
	@Autowired
	private OperationLogUtils<IBDS_SubFeature> subFeatureOptLog;
	@Autowired
	private OperationLogUtils<IBDS_Team> teamOptLog;
	@Autowired
	private OperationLogUtils<IBDS_SubSystem> subSystemOptLog;
	@Autowired
	private OperationLogUtils<IBDS_Module> moduleOptLog;
	@Autowired
	private OperationLogUtils<IBDS_ModuleVersion> moduleVersionOptLog;
	
	public void saveOperationLog(IBDS_PLIPMT bef,IBDS_PLIPMT aft,String code) {
		ipmtOptLog.RecordOpearteLog(bef, aft, code);
	}

	public void saveOperationLog(IBDS_PRODLINE bef,IBDS_PRODLINE aft,String code) {
		prodLineOptLog.RecordOpearteLog(bef, aft, code);
	}

	public void saveOperationLog(IBDS_PDT bef,IBDS_PDT aft,String code) {
		pdtOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_Product bef,IBDS_Product aft,String code) {
		productOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDSProject bef,IBDSProject aft,String code) {
		projectOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_Version bef,IBDS_Version aft,String code) {
		versionOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_Release bef,IBDS_Release aft,String code) {
		releaseOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_Bversion bef,IBDS_Bversion aft,String code) {
		bVersionOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_BaseLine bef,IBDS_BaseLine aft,String code) {
		baseLineOptLog.RecordOpearteLog(bef, aft, code);
	}	
	
	public void saveOperationLog(IBDS_Feature bef,IBDS_Feature aft,String code) {
		featureOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_SubFeature bef,IBDS_SubFeature aft,String code) {
		subFeatureOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_Team bef,IBDS_Team aft,String code) {
		teamOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_SubSystem bef,IBDS_SubSystem aft,String code) {
		subSystemOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_Module bef,IBDS_Module aft,String code) {
		moduleOptLog.RecordOpearteLog(bef, aft, code);
	}
	
	public void saveOperationLog(IBDS_ModuleVersion bef,IBDS_ModuleVersion aft,String code) {
		moduleVersionOptLog.RecordOpearteLog(bef, aft, code);
	}
}
