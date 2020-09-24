package com.h3c.mds.product.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.common.ProductConst;
import com.h3c.mds.product.dao.IBDS_VersionMapper;
import com.h3c.mds.product.dao.VersionViewMapper;
import com.h3c.mds.product.entity.IBDS_Version;
import com.h3c.mds.product.entity.IBDS_VersionExample;
import com.h3c.mds.product.entity.IBDS_VersionExample.Criteria;
import com.h3c.mds.product.entity.VersionView;
import com.h3c.mds.product.service.IBDS_VersionService;

@Service
public class IBDS_VersionServiceImpl implements IBDS_VersionService {

	private static final Logger LOG = LoggerFactory.getLogger(IBDS_VersionServiceImpl.class);
	@Autowired
	private VersionViewMapper versionViewMapper;
	
	@Autowired
	private IBDS_VersionMapper iBDS_VERSIONMapper;
	@Override
	@Transactional(readOnly = true)
	public List<VersionView> getTreeData(Map<String, String> param) {
		List<VersionView> versionTreeData = null;
		try {
			versionTreeData = versionViewMapper.getTreeData(param);
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错" + param);
		}
		return versionTreeData;
	}

	@Override
	@Transactional(readOnly = true)
	public VersionView selectByCode(String code) {
		return versionViewMapper.selectByCode(code);
	}

	@Override
	@Transactional
	public int addVersion(IBDS_Version version){
		return iBDS_VERSIONMapper.insertSelective(version);
	}
	
	@Override
	@Transactional
	public int editVersion(IBDS_Version version){
		version.setId(null);
		IBDS_VersionExample example = new IBDS_VersionExample();		
		Criteria criteria = example.createCriteria();
		criteria.andVersionnoEqualTo(version.getVersionno());
		IBDS_Version oldVersion = getVersionByCode(version.getVersionno());
		//处理曾用名
		if(oldVersion != null){
			if(version.getVersion() != null && !version.getVersion().equals(oldVersion.getVersion())){
				if(StringUtils.isNotBlank(oldVersion.getVersionold())){
					version.setVersionold(oldVersion.getVersionold()+ ";" + oldVersion.getVersion());
				}else{
					version.setVersionold(oldVersion.getVersion());
				}
			}
		}
		return iBDS_VERSIONMapper.updateByExampleSelective(version, example);
	}

	@Override
	@Transactional(readOnly = true)
	public String getMaxCode() {
		String maxCode = "";
		try {
			maxCode = versionViewMapper.getMaxCode();
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("查询数据库出错");
		}
		if(maxCode == null){
			maxCode = ProductConst.VERSION_CODE_PREFIX + "000000";
		}
		int val = Integer.parseInt(maxCode.substring(2,maxCode.length()))+1;
	    String valStr = String.valueOf(val);
	    String code = ProductConst.VERSION_CODE_PREFIX;
	    for(int i = 0;i<ProductConst.CODECONST-valStr.length();i++){
	        code += "0";
	    }
	    code += valStr;
	    return code;
	}

	@Override
	@Transactional(readOnly = true,propagation=Propagation.REQUIRES_NEW)
	public IBDS_Version getVersionByCode(String code) {
		IBDS_VersionExample example = new IBDS_VersionExample();
		Criteria criteria = example.createCriteria();
		criteria.andVersionnoEqualTo(code);
		List<IBDS_Version> versionList = iBDS_VERSIONMapper.selectByExample(example);
		if(versionList != null && versionList.size() == 1){
			return  versionList.get(0);
		}else{
			LOG.error("V版本内码: " + code + "  size  " + versionList.size());
			return null;
		}
	}

	@Override
	public IBDS_Version getVersionByName(String versionName) {
		IBDS_VersionExample example = new IBDS_VersionExample();
		Criteria criteria = example.createCriteria();
		criteria.andVersionEqualTo(versionName);
		List<IBDS_Version> versionList = iBDS_VERSIONMapper.selectByExample(example);
		if(versionList != null && versionList.size() == 1){
			return  versionList.get(0);
		}else{
			LOG.error("V版本内码: " + versionName + "  size  " + versionList.size());
			return null;
		}
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<IBDS_Version> getByExample(IBDS_VersionExample example){
		return iBDS_VERSIONMapper.selectByExample(example);
	}
}
