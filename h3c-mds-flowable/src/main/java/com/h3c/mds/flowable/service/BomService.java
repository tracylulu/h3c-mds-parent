package com.h3c.mds.flowable.service;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.flowable.entity.Bom;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BomService {
    @Transactional(readOnly = true)
    PageInfo findByPage(Integer page, Integer rows, String searchStr);

    @Transactional
    Bom getByBomCode(String bomCode);

    @Transactional
    List<Bom> getAll();

    @Transactional(readOnly = true)
    String getBomDescByBomCode(String bomCode);

    Boolean hasBomCode(String bomCode);
}
