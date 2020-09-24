package com.h3c.mds.dept.service;



public interface CoaMailService {
	public void sendMailForCoa(String personcode,String sapCcode,String deptName);

	
	public void sendMailForP04();
	
	public void sendMailForQuartzCheck();
	
}
