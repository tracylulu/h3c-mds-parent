package com.h3c.mds.flowable.service;

import java.util.List;
import java.util.Map;

import com.h3c.mds.flowable.entity.PartCodeApply;
import com.h3c.mds.flowable.entity.PartExport;

/**
 * Part编码申请接口类
 */
public interface PartCodeApplyService {

    List<PartCodeApply> getByProcessCode(String applyCode);
    
    List<PartCodeApply> batchGetByProcessCodes(List<String> applyCodeList);

    void update(PartCodeApply apply);

    Integer getZTCountByProductCode(String productCode);

    List<PartCodeApply> getZTByProductCode(String productCode);

    List<PartExport> getExportList(Map<String,Object> param);

    List<String> getZTProcessCodeByProductCode(String productCode);
}
