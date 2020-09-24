package com.h3c.mds.product.web.service.impl;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.product.entity.IBDS_PDT;
import com.h3c.mds.product.service.IBDS_PDTService;
import com.h3c.mds.product.web.service.PdtTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * PDT 同一事务服务实现类
 */
@Service
public class PdtTransactionServiceImpl implements PdtTransactionService {

    @Autowired
    private IBDS_PDTService pdtService;

    @Autowired
    private ProcessConfigItemService processConfigItemService;

    /**
     * 保证在同一事务中
     * @param pdt
     * @param item
     */
    @Transactional
    @Override
    public void create(IBDS_PDT pdt,ProcessConfigItem item){
        pdtService.create(pdt);
        item.setPdtCode(pdt.getPdtno());
        processConfigItemService.create(item);
    }

    @Transactional
    @Override
    public void update(IBDS_PDT pdt, ProcessConfigItem item){
        pdtService.update(pdt);
        if(item != null){
            processConfigItemService.update(item);
        }
    }
}
