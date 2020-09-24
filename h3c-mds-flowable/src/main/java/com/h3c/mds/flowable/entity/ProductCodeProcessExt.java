package com.h3c.mds.flowable.entity;

import java.util.List;

public class ProductCodeProcessExt extends ProductCodeProcess{

    private String code;

    private String name;

    private String fprodPerson;

    private List<ProductCodeApply> applys;

    private String productCodes;

    public List<ProductCodeApply> getApplys() {
        return applys;
    }

    public void setApplys(List<ProductCodeApply> applys) {
        this.applys = applys;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFprodPerson() {
        return fprodPerson;
    }

    public void setFprodPerson(String fprodPerson) {
        this.fprodPerson = fprodPerson;
    }

    public String getProductCodes() {
        return productCodes;
    }

    public void setProductCodes(String productCodes) {
        this.productCodes = productCodes;
    }
}
