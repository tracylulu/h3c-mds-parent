package com.h3c.mds.product.web.service;

import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.product.entity.IBDS_PDT;
import org.springframework.transaction.annotation.Transactional;

/**
 * PDT同一事务服务接口类
 */
public interface PdtTransactionService {
    @Transactional
    void create(IBDS_PDT pdt, ProcessConfigItem item);

    @Transactional
    void update(IBDS_PDT pdt, ProcessConfigItem item);
}
