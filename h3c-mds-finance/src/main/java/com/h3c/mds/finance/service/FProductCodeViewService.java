package com.h3c.mds.finance.service;

import com.h3c.mds.finance.entity.FProductCodeView;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface FProductCodeViewService {
    @Transactional(readOnly = true)
    List<FProductCodeView> getDataList(Map<String, Object> params);
    
    List<FProductCodeView> getExportList(Map<String, Object> params);

    List<FProductCodeView> getProdTreeData(Map<String, Object> searchMap);
}
