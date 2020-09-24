package com.h3c.mds.dept.service;

import java.util.List;

import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;

public interface DeptMgnRoleService {
	
	public void eidtMgnRole(IBDS_Dept_MgnRole dept);
	
	List<IBDS_Dept_MgnRole> getAll();
	
	
	void eidtMulti(List<IBDS_Dept_MgnRole> dept);
}
