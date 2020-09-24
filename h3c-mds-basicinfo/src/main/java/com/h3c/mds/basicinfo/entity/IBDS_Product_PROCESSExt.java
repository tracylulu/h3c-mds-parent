package com.h3c.mds.basicinfo.entity;
import java.util.List;


public class IBDS_Product_PROCESSExt extends IBDS_Product_PROCESS{
	
	 private List<IBDS_Product_Apply> applys;

	    public List<IBDS_Product_Apply> getApplys() {
	        return applys;
	    }

	    public void setApplys(List<IBDS_Product_Apply> applys) {
	        this.applys = applys;
	    }
}