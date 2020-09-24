package com.h3c.mds.finance.service.impl;

import com.h3c.mds.finance.dao.FProductCodeViewMapper;
import com.h3c.mds.finance.entity.FProductCodeView;
import com.h3c.mds.finance.service.FProductCodeViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class FProductCodeViewServiceImpl implements FProductCodeViewService {

    @Autowired
    private FProductCodeViewMapper fProductCodeViewMapper;

    @Transactional(readOnly = true)
    @Override
    public List<FProductCodeView> getDataList(Map<String,Object> params){
        return fProductCodeViewMapper.getDataList(params);
    }
    
    @Transactional(readOnly = true)
    @Override
    public  List<FProductCodeView> getExportList(Map<String, Object> params){
    	return fProductCodeViewMapper.getExportList(params);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FProductCodeView> getProdTreeData(Map<String, Object> searchMap) {
        return fProductCodeViewMapper.getProdTreeData(searchMap);
    }
}
