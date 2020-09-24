package com.h3c.mds.utils.excel;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

@SuppressWarnings("serial")
public class ExcelProjectCodeModel extends BaseRowModel implements Serializable{
	
	@ExcelProperty(value = "序号" ,index = 0)
	private String no;

	@ExcelProperty(value = "所属产品线" ,index = 1)
	private String prodlineName;
	@ExcelProperty(value = "所属PDT" ,index = 2)
    private String pdtName;
	@ExcelProperty(value = "项目类别" ,index = 3)
	private String proCa;
	@ExcelProperty(value = "项目名称" ,index = 4)
    private String proName;
	@ExcelProperty(value = "B版本" ,index = 5)
    private String bversion;
//	@ExcelProperty(value = "项目编码" ,index = 1)
//    private String proNumber;
//	@ExcelProperty(value = "序号" ,index = 1)
//    private String proCa;
//	@ExcelProperty(value = "序号" ,index = 1)
//    private String proProdlineNo;
	@ExcelProperty(value = "项目代号" ,index = 6)
    private String proNo;
	@ExcelProperty(value = "对应的版本" ,index = 7)
    private String version;
	@ExcelProperty(value = "对应的评审点" ,index = 8)
    private String proPoint;
//	@ExcelProperty(value = "序号" ,index = 1)
//    private String proManager;
	@ExcelProperty(value = "立项时间" ,index = 9)
    private Date proTime;
	
	@ExcelProperty(value = "费用分摊运营商比重" ,index = 10)
    private String probizhong;
	@ExcelProperty(value = "费用分摊非运营商比重" ,index = 11)
    private String profbizhong;
	@ExcelProperty(value = "备注" ,index = 12)
    private String remark;
	@ExcelProperty(value = "服务产品个数" ,index = 13)
    private Integer productnum;
	@ExcelProperty(value = "服务的产品名称" ,index = 14)
	private String productName;
	@ExcelProperty(value = "服务的产品编码" ,index = 15)
	private String productCode;
	@ExcelProperty(value = "所属pdt" ,index = 16)
	private String productPdt;
	@ExcelProperty(value = "此产品应该分摊的项目费用比例" ,index = 17)
	private String rate;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getProdlineName() {
		return prodlineName;
	}
	public void setProdlineName(String prodlineName) {
		this.prodlineName = prodlineName;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	public String getProCa() {
		return proCa;
	}
	public void setProCa(String proCa) {
		this.proCa = proCa;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getBversion() {
		return bversion;
	}
	public void setBversion(String bversion) {
		this.bversion = bversion;
	}
	public String getProNo() {
		return proNo;
	}
	public void setProNo(String proNo) {
		this.proNo = proNo;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getProPoint() {
		return proPoint;
	}
	public void setProPoint(String proPoint) {
		this.proPoint = proPoint;
	}
	public Date getProTime() {
		return proTime;
	}
	public void setProTime(Date proTime) {
		this.proTime = proTime;
	}
	public String getProbizhong() {
		return probizhong;
	}
	public void setProbizhong(String probizhong) {
		this.probizhong = probizhong;
	}
	public String getProfbizhong() {
		return profbizhong;
	}
	public void setProfbizhong(String profbizhong) {
		this.profbizhong = profbizhong;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getProductnum() {
		return productnum;
	}
	public void setProductnum(Integer productnum) {
		this.productnum = productnum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductPdt() {
		return productPdt;
	}
	public void setProductPdt(String productPdt) {
		this.productPdt = productPdt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	
}
