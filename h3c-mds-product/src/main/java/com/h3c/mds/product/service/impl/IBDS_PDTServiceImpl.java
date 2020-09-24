package com.h3c.mds.product.service.impl;


import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.h3c.mds.product.dao.IBDS_PDTMapper;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.entity.IBDS_PDTExample;
import com.h3c.mds.product.entity.IbdsProjectCodeRecommend;
import com.h3c.mds.product.service.IBDS_PDTService;
import com.h3c.mds.product.service.IbdsProjectCodeRecommendService;

@Service
public class IBDS_PDTServiceImpl implements IBDS_PDTService {

    @Autowired
    private IBDS_PDTMapper pdtMapper;



    @Autowired
    private IbdsProjectCodeRecommendService projectCodeRecommendService;

    @Override
    @Transactional
    public int create(IBDS_PDT pdt) {
        pdt.setPdtno(getMaxCode());
        int i = pdtMapper.insertSelective(pdt);

        // 业务要求  同步到项目编码推荐表 lisheng  add
        projectCodeRecommendService.addProjectCodeRecommend(buildProjectCodeRecommend(pdt));
        return i;
    }
    
    private IbdsProjectCodeRecommend buildProjectCodeRecommend(IBDS_PDT pdt){
    	IbdsProjectCodeRecommend projectCodeRecommend = new IbdsProjectCodeRecommend();
    	projectCodeRecommend.setPdtName(pdt.getPdt());
    	projectCodeRecommend.setPdtNo(pdt.getPdtno());
    	projectCodeRecommend.setStatus(pdt.getStatus());
    	return projectCodeRecommend;
    }

    @Override
    @Transactional(readOnly=true)
    public String getMaxCode() {
        String maxCode = pdtMapper.getMaxCode();
        if(maxCode == null){
            maxCode = "PT000000";
        }
        int val = Integer.parseInt(maxCode.substring(2,maxCode.length()))+1;
        String valStr = String.valueOf(val);
        String code = "PT";
        for(int i = 0;i<6-valStr.length();i++){
            code += "0";
        }
        code += valStr;
        return code;
    }

    @Override
    @Transactional
    public void update(IBDS_PDT pdt) {
        IBDS_PDT old = pdtMapper.selectByPrimaryKey(pdt.getId());
        if(old != null && !StringUtils.equals(old.getPdt(), pdt.getPdt())){
            if(StringUtils.isNotBlank(old.getPdtold())){
                pdt.setPdtold(old.getPdtold()+";"+old.getPdt());
            }else{
                pdt.setPdtold(old.getPdt());
            }
        }
        pdtMapper.updateByPrimaryKeySelective(pdt);

        //同步修改项目编码推荐表  lisheng  add
        editProjectCodeRecommend(pdt);
        
    }
    
    private void editProjectCodeRecommend(IBDS_PDT pdt){
    	IbdsProjectCodeRecommend projectCodeRecommend = new IbdsProjectCodeRecommend();
    	projectCodeRecommend.setPdtNo(pdt.getPdtno());
    	projectCodeRecommend.setStatus(pdt.getStatus());
    	projectCodeRecommend.setPdtName(pdt.getPdt());
    	projectCodeRecommendService.editProjectCodeRecommend(projectCodeRecommend);
    }
    @Override
    @Transactional(readOnly=true)
    public IBDS_PDT selectByCode(String code) {
    	return pdtMapper.selectByCode(code);
    }
    
    @Override
    public List<IBDS_PDT> selectByExample(IBDS_PDTExample example){
    	return pdtMapper.selectByExample(example);
    }
    
    
    public List<IBDS_PDT> getPdtByProlineno(Map<String, Object> param){
    	IBDS_PDTExample example = new IBDS_PDTExample();
    	IBDS_PDTExample.Criteria criteria =  example.createCriteria();
    	if(param != null && param.get("prodlineno") != null){
    		criteria.andProdlinenoEqualTo((String)param.get("prodlineno"));    		
    	}
    	return pdtMapper.selectByExample(example);
    }
}
