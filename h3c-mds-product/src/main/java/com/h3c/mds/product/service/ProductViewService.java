package com.h3c.mds.product.service;

import com.h3c.mds.product.entity.ProductView;


import java.util.List;
import java.util.Map;

public interface ProductViewService {




    List<ProductView> getDataList(Map<String, String> map);
    
    ProductView selectByCode(String code);
}
