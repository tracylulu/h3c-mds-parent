package com.h3c.mds.sysmgr.dao;

import com.h3c.mds.sysmgr.entity.EmpDeptView;
import com.h3c.mds.sysmgr.entity.EmpDeptViewExample;
import com.h3c.mds.sysmgr.entity.User;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EmpDeptViewMapper {
    long countByExample(EmpDeptViewExample example);

    int deleteByExample(EmpDeptViewExample example);

    int insert(EmpDeptView record);

    int insertSelective(EmpDeptView record);

    List<EmpDeptView> selectByExampleWithBLOBs(EmpDeptViewExample example);

    List<EmpDeptView> selectByExample(EmpDeptViewExample example);

    int updateByExampleSelective(@Param("record") EmpDeptView record, @Param("example") EmpDeptViewExample example);

    int updateByExampleWithBLOBs(@Param("record") EmpDeptView record, @Param("example") EmpDeptViewExample example);

    int updateByExample(@Param("record") EmpDeptView record, @Param("example") EmpDeptViewExample example);
    
    /**
	 * 人员联想
	 * @param param
	 * @return
	 */
	List<EmpDeptView> selUserViewbyparam(@Param("param") Map<String,String> param);
}