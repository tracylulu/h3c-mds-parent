package com.h3c.mds.product.service;

import com.github.pagehelper.PageInfo;
import com.h3c.mds.product.entity.IBDS_PLIPMT;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface IBDS_PLIPMTService {

    /**
     * ibds列表
     * @return
     */
    public PageInfo<IBDS_PLIPMT> findByPage(Integer pageNo, Integer pageSize, Map<String,Object> queryParams);

    List<IBDS_PLIPMT> getByMap(Map<String, String> searchMap);

    /**
     * 创建ipmt
     * @param ipmt
     */
    void create(IBDS_PLIPMT ipmt);

    void update(IBDS_PLIPMT ipmt);

    @Transactional(readOnly=true)
    String getMaxCode();
    
    /**
     * 根据主键查
     * @param id 主键
     * @return
     */
    IBDS_PLIPMT selectByPrimaryKey(Integer id);
    /**
     * 根据内码查询
     * @param code
     * @return
     */
    IBDS_PLIPMT selectByCode(String code);
}
