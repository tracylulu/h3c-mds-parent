package com.h3c.mds.product.entity;

public class view_StopUsingProducts {
    private Integer id;

    private String prodlineno;

    private String prodline;

    private String productno;

    private String product;

    private String releaseno;

    private String release;

    private String type;

    private String code;

    private String name;

    private String engname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdlineno() {
        return prodlineno;
    }

    public void setProdlineno(String prodlineno) {
        this.prodlineno = prodlineno == null ? null : prodlineno.trim();
    }

    public String getProdline() {
        return prodline;
    }

    public void setProdline(String prodline) {
        this.prodline = prodline == null ? null : prodline.trim();
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno == null ? null : productno.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getReleaseno() {
        return releaseno;
    }

    public void setReleaseno(String releaseno) {
        this.releaseno = releaseno == null ? null : releaseno.trim();
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release == null ? null : release.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname == null ? null : engname.trim();
    }
}