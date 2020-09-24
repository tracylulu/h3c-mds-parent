package com.h3c.mds.flowable.service;

import com.h3c.mds.flowable.entity.BasisMaterial;

public interface BasisMaterialService {

    void create(BasisMaterial basisMaterial);

    BasisMaterial getById(String id);

    void update(BasisMaterial basisMaterial);

    void deleteById(String id);
}
