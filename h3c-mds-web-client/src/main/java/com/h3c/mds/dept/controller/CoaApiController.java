package com.h3c.mds.dept.controller;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IbdsDeptCoaDataRecord;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
import com.h3c.mds.dept.service.CoaMailService;
import com.h3c.mds.dept.service.DeptDataService;
import com.h3c.mds.dept.service.DeptService;
import com.h3c.mds.dept.service.IbdsDeptCoaDataRecordService;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP; 

@RestController
@RequestMapping("/api")
public class CoaApiController {

	private static final Logger logger = LoggerFactory.getLogger(CoaApiController.class);
	
	@Autowired
	private DeptService deptService;

	@Autowired
	private UserService userService;
	
	@Autowired
	DeptDataService deptDataService;
	
	@Autowired
	CoaMailService COAMailService;
	
	@Autowired
	IbdsDeptCoaDataRecordService CoaDataRecordService;
	
	
	

		
	/**
	 * 提供REST接口给COA系统。新申请COA编码电子流流程结束后，调用接口。传递部门SAP编码和COA流程申请人信息。保存信息到IBDS_Dept_SysPersonRole表中
	 * //访问的url示例：http://localhost:8080/api/COAData
	 * @param  SAPcode
	 * @param  PersonCode
	 * @return
	 */
	/*
	 * {
		"PersonCode":"17740",
		"SapCode":"50040098,50040099"
		}                                                                      
	*/
    @RequestMapping(value="/COAData", method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    @ResponseBody
	public String view(@RequestBody  JSONObject jsonValue){
		//新建个表，存那边传过来的字段,表字段 ：ID SapCode PersonCode 时间  标记（0，1，2），到时候回显
    	//String json1 = "{\"PersonCode\":\"17740\",\"SapCode\":[\"50040098\",\"50040099\",\"50040096\"]}";
        //System.out.println(json1);
        //解析json数据
        //JSONObject jsonObject = new JSONObject();
    	Map<String,Object> param1=new HashMap<>();
    	String massage="";
    	boolean flag=false;
        String pCode=jsonValue.getString("PersonCode");
        String sCode=jsonValue.getString("SapCode");
		
        if(sCode!=null && !sCode.equals("")){
        	JSONArray jsonArray = jsonValue.getJSONArray("SapCode");
            for(int i=0;i<jsonArray.size();i++){
                System.out.println(jsonArray.get(i));
                String SapCode=jsonArray.get(i).toString();
                //获取到的记录存到数据库中IBDS_Dept_CoaDataRecord这个表中
                IbdsDeptCoaDataRecord record =new IbdsDeptCoaDataRecord();
                record.setSapcode(SapCode);
				record.setPersoncode(pCode);
				record.setPassflag("0");
				//record.setOther(null);
				record.setOther(UUID.randomUUID().toString().replace("-", ""));
				record.setPasstime(new Date());
				CoaDataRecordService.insertDataRecord(record);
				this.check(record);
            }
        }
        
        JSONObject json = new JSONObject();
        param1.put("passflag", "0");
        List<IbdsDeptCoaDataRecord> DataRecord = CoaDataRecordService.getListByParam(param1);
        if(DataRecord.size()>0) {
        	flag=false;
        	massage="调用失败！";
        }else {
        	flag=true;
        	massage="调用成功！";
        }
        json.put("flag", flag);
		json.put("massage", massage);
		
        return json.toString();
    }
    
    
    public void check(IbdsDeptCoaDataRecord record) {
    	Map<String,Object> param=new HashMap<>();
		List<User> lstUser=userService.getAll();
		String SAPcode = record.getSapcode();
		String PersonCode = record.getPersoncode();
		//String massage="";
		String deptName="";
		boolean flag1=false;
		//boolean flag=false;
		boolean flagP01=false;
    	String PersonName="";
    	List<DeptData> deptDataList = deptDataService.selectDeptData();
    	//根据传过来的工号查询该用户信息
        User user=checkuser(lstUser,PersonCode);
        if(user!=null) {
        	PersonName = user.getName();
		}else {
			//flag=false;
			//massage="调用失败！";
			logger.info("COA接口调用失败。该用户不存在，请核对数据！传入的SAPcode编码和PersonCode分别为:"+SAPcode+" "+PersonCode);
			//调用完毕后给这条数据进行标记更新。1：成功  2：失败
			record.setPassflag("2:调用失败。该用户不存在！");
			CoaDataRecordService.updateByPrimaryKey(record);
		}
        //SAPcode在角色表中以P01查,不存在说明是需要维护的白板信息
        List<IBDS_Dept_SysPersonRole> roleListP01 = deptService.getRoleListBysapcodeAndP04(SAPcode, "P01");
        if(roleListP01.size()>0) {
        }else {
        	flagP01=true;
        }
    	//SAPcode这个在deptdata表中有没有，没有的话，组织架构不存在，只写记录，不发邮件，存在的话，判断是不是一级部门，
    	//是的话写记录，写记录判断该条记录是不是存在，不存在发邮件存在不发邮件，不是的话返回提示信息费coa
    	//部门组织架构有数据
		if(deptDataList.size()>0) {
			for (int i = 0; i < deptDataList.size(); i++) {
				//if(deptDataList.get(i).getDeptCode().equals(SAPcode) && （sapcode在角色表中以P01查不存在）) {
				if((deptDataList.get(i).getDeptCode().equals(SAPcode)) && flagP01) {
					flag1=true;
				}else {
				}
			}
			System.out.println(flag1);
			//COAMailService.sendMailForP04();
			if(flag1) {
				//传过来的SAPcode在deptdata表中存在
				param.put("deptCode", SAPcode);
				param.put("deptLevel", 1);
				List<DeptData> selectDeptDataForLervel = deptDataService.selectDeptDataByParam(param);
				//判断是不是一级部门，是的话写记录
				//if(selectDeptDataForLervel.get(0).getDeptLevel().intValue()==1) {
				if(selectDeptDataForLervel.size()>0) {
					//需要维护的部门的中文名
					deptName = selectDeptDataForLervel.get(0).getDeptName();
					List<IBDS_Dept_SysPersonRole> roleListFoeP04 = deptService.getRoleListBysapcodeAndP04(SAPcode, "P04");
					//写记录之前判断传过来的SAPcode在角色表中有没有P04的记录，有就是重复记录
					if(roleListFoeP04.size()>0) {
						//存在相同的记录则不发邮件
						//flag=false;
						//massage="调用失败！";
						logger.info("COA接口调用失败。该部门数据重复传递，请核对数据！传入的SAPcode编码和PersonCode分别为:"+SAPcode+" "+PersonCode);
						record.setPassflag("2:调用失败。该部门数据重复传递！");
						CoaDataRecordService.updateByPrimaryKey(record);
					}else {
						//没有则也就没有相同的记录，则写记录并发邮件
						//不存在相同的记录则写记录并发邮件
						IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
				        role.setSapcode(SAPcode);
						role.setRoletypecode("P04");
						role.setPersoncode(PersonCode);
						role.setPersonname(PersonName);
						role.setCreatorcode(null);
						role.setCreatorname(null);
						role.setCreatetime(new Date());
						int createFlag = deptService.create(role);
						if(createFlag>0) {
							//flag=true;
				        	//massage="调用成功！";
							logger.info("调用成功！"+"COA接口调用。传入的SAPcode编码为:"+SAPcode);
							record.setPassflag("1:调用成功！");
							CoaDataRecordService.updateByPrimaryKey(record);
				        }else {
				        	//flag=false;
				        	//massage="调用失败！";
							logger.info("COA接口调用失败。接口异常，请联系管理员！传入的SAPcode编码和PersonCode分别为:"+SAPcode+" "+PersonCode);
							record.setPassflag("2:调用失败。接口异常，请联系管理员！");
							CoaDataRecordService.updateByPrimaryKey(record);
				        }
						COAMailService.sendMailForCoa(PersonCode,SAPcode,deptName);
					}
					
					
				}else {
					//不是一级部门
					//flag=true;
					//massage="调用成功！";
					logger.info("调用成功！"+"COA接口调用。传入的SAPcode编码为:"+SAPcode);
					record.setPassflag("1:调用成功！");
					CoaDataRecordService.updateByPrimaryKey(record);
				}
				
			}else {
				//先判断传过来的sapcode是不是需要维护白板信息的。true为需要维护
				if(flagP01) {
					List<IBDS_Dept_SysPersonRole> roleListFoeP04 = deptService.getRoleListBysapcodeAndP04(SAPcode, "P04");
					//存在相同的记录则不写了
					if(roleListFoeP04.size()>0) {
						logger.info("COA接口调用失败。该部门数据重复传递，请核对数据！传入的SAPcode编码和PersonCode分别为:"+SAPcode+" "+PersonCode);
						record.setPassflag("2:调用失败。该部门数据重复传递！");
						CoaDataRecordService.updateByPrimaryKey(record);
					}else {
						//SAPcode在组织架构不存在，只写记录，不发邮件
						IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
				        role.setSapcode(SAPcode);
						role.setRoletypecode("P04");
						role.setPersoncode(PersonCode);
						role.setPersonname(PersonName);
						role.setCreatorcode(null);
						role.setCreatorname(null);
						role.setCreatetime(new Date());
						int createFlag = deptService.create(role);
						if(createFlag>0) {
							//flag=true;
				        	//massage="调用成功！";
				        	logger.info("调用成功！"+"COA接口调用。传入的SAPcode编码为:"+SAPcode);
				        	record.setPassflag("1:调用成功!");
							CoaDataRecordService.updateByPrimaryKey(record);
				        }else {
				        	//flag=false;
				        	//massage="调用失败！";
							logger.info("COA接口调用失败。接口异常，请联系管理员！传入的SAPcode编码和PersonCode分别为:"+SAPcode+" "+PersonCode);
							record.setPassflag("2:调用失败。接口异常，请联系管理员！");
							CoaDataRecordService.updateByPrimaryKey(record);
				        }
					}
				}else {
					//不需要维护白板信息的。不发邮件，不增加角色表中p04的记录
					logger.info("COA接口调用失败。该部门已有一级部门秘书！传入的SAPcode编码和PersonCode分别为:"+SAPcode+" "+PersonCode);
					record.setPassflag("2:调用失败。该部门已有一级部门秘书！");
					CoaDataRecordService.updateByPrimaryKey(record);
				}
			}
				
		}else {
			//部门组织架构无数据
			//flag=false;
			//massage="调用失败！";
			logger.info("COA接口调用失败。接口异常，请联系管理员！传入的SAPcode编码和PersonCode分别为:"+SAPcode+" "+PersonCode);
			record.setPassflag("2:调用失败。接口异常，请联系管理员！");
			CoaDataRecordService.updateByPrimaryKey(record);
		}
	}
    
    
    
    
    
    public User checkuser(List<User> lst,String code) {
		Optional<User> temp=lst.stream().filter(o->code.equals(o.getUda10512())).findFirst();
		if(temp.isPresent()) {
			return temp.get();
		}
		return null;
	}

     
}
