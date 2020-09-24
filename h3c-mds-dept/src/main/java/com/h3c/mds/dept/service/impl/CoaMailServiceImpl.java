package com.h3c.mds.dept.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
import com.h3c.mds.dept.entity.view_DeptWithLevel;
import com.h3c.mds.dept.service.CoaMailService;
import com.h3c.mds.dept.service.DeptDataService;
import com.h3c.mds.dept.service.DeptService;
import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.utils.MailUtils;

@Service
public class CoaMailServiceImpl implements CoaMailService {

	@Autowired
	private UserService userService;
	
	@Autowired
	private DeptService deptService;
	
	@Autowired
	DeptDataService deptDataService;
	
	@Override
	public void sendMailForCoa(String personcode,String sapCcode,String deptName) {
		
		//获取发送地址，也就是发送人的域账号
		//根据工号查询该用户信息
		String siteMainUrl = ((Environment)SpringContextUtils.getBean(Environment.class)).getProperty("sso.main.url");
		List<User> lstUser=userService.getAll();
		List<String> sendList = new ArrayList<>();
        List<String> ccList = new ArrayList<>();
        //改了下这个方法，不让它使用if了，因为sonar检测出报了一个错：Refactor this code to not nest more than 3 if/for/while/switch/try statements.
        String sendTo=checkuser(lstUser,personcode);
        //sendTo="cYS1425";
        sendList.add(sendTo+"@h3c.com");
		
		
		//邮件标题
		String subject = "您有部门信息待维护";
		StringBuilder stringBuilder = new StringBuilder();
		//邮件内容
		String content = "<div>请维护"+"\""+deptName+"\""+"部门信息</div></br>";
		content += "<div>文档链接：<a href='"+siteMainUrl+"/mailLoginForCOA?code="+sapCcode+"'>打开文档</a></div>";
		stringBuilder.append(content);
		stringBuilder.append("<div>此邮件来自：基础数据平台http://ibds.h3c.com/。</br>" +
			"如有使用问题请联系管理员，请勿直接回信。 </div>");
		
		MailUtils.sendMail(sendList,ccList, subject, stringBuilder.toString());
	}

	
	//获取域账号
	public String checkuser(List<User> lst,String code) {
			Optional<User> temp=lst.stream().filter(o->code.equals(o.getUda10512())).findFirst();
			if(temp.isPresent()) {
				return temp.get().getUda10511();
			}
			return null;
		}





	@Override
	public void sendMailForP04() {
		String siteMainUrl = ((Environment)SpringContextUtils.getBean(Environment.class)).getProperty("sso.main.url");
		List<User> lstUser=userService.getAll();
		List<String> personcodeList = new ArrayList<>();
		List<String> sendList = new ArrayList<>();
		Map<String,Object> param=new HashMap<>();
		String deptName="";
		String sendTo="";
		//维护的部门的中文名和发送地址用map形式保存
		//处理sonar检测的问题：Replace the type specification in this constructor call with the diamond operator ("<>").
		List<Map<String, Object>> resultList = new ArrayList<>();
		//List<DeptData> deptDataList = deptDataService.selectDeptData();
		List<IBDS_Dept_SysPersonRole> roleListFoeP04 = deptService.getRoleListByroletypecode("P04");
		//for (int i = 0; i < deptDataList.size(); i++) {
			for (int j = 0; j < roleListFoeP04.size(); j++) {
				//if(deptDataList.get(i).getDeptCode().equals(roleListFoeP04.get(j).getSapcode()) && deptDataList.get(i).getDeptLevel().equals("1")) {
					param.put("deptCode", roleListFoeP04.get(j).getSapcode());
					List<DeptData> selectDeptList = deptDataService.selectDeptDataByParam(param);
					if(selectDeptList.size()>0) {
						if(selectDeptList.get(0).getDeptLevel().intValue()==1) {
							//需要维护的部门的中文名
							deptName = selectDeptList.get(0).getDeptName();
							String personcode = roleListFoeP04.get(j).getPersoncode();
							personcodeList.add(personcode);
							String sendTo1=checkuser(lstUser,personcode);
					        sendTo = sendTo1+"@h3c.com";
					        Map<String, Object> map = new HashMap<>();
					        map.put("deptName", deptName);
					        map.put("sendTo", sendTo);
					        map.put("Sapcode", roleListFoeP04.get(j).getSapcode());
					        resultList.add(map);
						}
					}
					
					
				//}
				
			}
			
		//}
		
		for (int k = 0; k < resultList.size(); k++) {
			Map<String,Object> map1 = resultList.get(k);
		    String value1 = map1.get("deptName").toString();
		    String value2 = map1.get("sendTo").toString();
		    String value3 = map1.get("Sapcode").toString();
		    sendList.clear();
		    //邮件标题
			sendList.add(value2);
			List<String> ccList = new ArrayList<>();
			String subject = "您有部门信息待维护";
			StringBuilder stringBuilder = new StringBuilder();
			//邮件内容
			String content = "<div>请维护"+"\""+value1+"\""+"部门信息</div></br>";
			content += "<div>文档链接：<a href='"+siteMainUrl+"/mailLoginForCOA?code="+value3+"'>打开文档</a></div>";
			stringBuilder.append(content);
			stringBuilder.append("<div>此邮件来自：基础数据平台http://ibds.h3c.com/。</br>" +
				"如有使用问题请联系管理员，请勿直接回信。 </div>");
			
			MailUtils.sendMail(sendList,ccList, subject, stringBuilder.toString());
		}
		
		
		}


	//add by chenlulu on 20200507
	@Override
	public void sendMailForQuartzCheck() {
		List<User> lstUser=userService.getAll();
		StringBuffer  err= new StringBuffer();
		StringBuffer  errBlank1= new StringBuffer();StringBuffer  infoBlank1= new StringBuffer();
		StringBuffer  errCheck1= new StringBuffer();StringBuffer  infoCheck1= new StringBuffer();
		StringBuffer  errBlank2= new StringBuffer();StringBuffer  infoBlank2= new StringBuffer();
		StringBuffer  errCheck2= new StringBuffer();StringBuffer  infoCheck2= new StringBuffer();
		StringBuffer  errBlank3= new StringBuffer();StringBuffer  infoBlank3= new StringBuffer();
		StringBuffer  errCheck3= new StringBuffer();StringBuffer  infoCheck3= new StringBuffer();
		StringBuffer  errBlank4= new StringBuffer();StringBuffer  infoBlank4= new StringBuffer();
		StringBuffer  errCheck4= new StringBuffer();StringBuffer  infoCheck4= new StringBuffer();
		Map<String,Object> param=new HashMap<>();
		param.put("level", 1);
		List<view_DeptWithLevel> deptList = deptService.getyijiDeptList(param);
		for (int i = 0; i < deptList.size(); i++) {
			//各个一级部门的code
			String firstcode = deptList.get(i).getFirstcode();
			List<view_DeptWithLevel> listByfirstCode = deptService.getListByfirstCode(firstcode);
			errBlank1.setLength(0);infoBlank1.setLength(0);
			errBlank2.setLength(0);infoBlank2.setLength(0);
			errBlank3.setLength(0);infoBlank3.setLength(0);
			errBlank4.setLength(0);infoBlank4.setLength(0);
			errCheck1.setLength(0);infoCheck1.setLength(0);
			errCheck2.setLength(0);infoCheck2.setLength(0);
			errCheck3.setLength(0);infoCheck3.setLength(0);
			errCheck4.setLength(0);infoCheck4.setLength(0);
			
			for (int j = 0; j < listByfirstCode.size(); j++) {
				//一级部门
				if(listByfirstCode.get(j).getLevel().intValue()==1) {
					
					String firstname = listByfirstCode.get(j).getFirstname();
					
					//部门简称空值校验
					String abbreviation = listByfirstCode.get(j).getAbbreviation();
					if(StringUtils.isBlank(abbreviation)) {
						errBlank1.append("部门简称,");
					}
					
					//主管空值和有效性校验
					String manager=listByfirstCode.get(j).getManager();
					if(StringUtils.isBlank(manager)) {
						errBlank1.append("主管");
					}else {
						String mgnUser=checkUserMulti1(lstUser,manager);
						if(StringUtils.isBlank(mgnUser)) {
							errCheck1.append(firstname+"主管,");
							infoCheck1.append(firstname+"主管,");
						}
					}
					
					//部门计划员空值和有效性校验
					String deptplanner=listByfirstCode.get(j).getDeptplanner();
					if(StringUtils.isBlank(deptplanner)) {
						errBlank1.append("部门计划员");
					}else {
						String deptplannerUser=checkUserMulti1(lstUser,deptplanner);
						if(StringUtils.isBlank(deptplannerUser)) {
							errCheck1.append(firstname+"部门计划员,");
							infoCheck1.append(firstname+"部门计划员,");
						}
					}
					
					//计划处审批人员空值和有效性校验
					String panapprover=listByfirstCode.get(j).getPlanapprover();
					if(StringUtils.isBlank(panapprover)) {
						errBlank1.append("计划处审批人员");
					}else {
						String panapproverUser=checkUserMulti1(lstUser,panapprover);
						if(StringUtils.isBlank(panapproverUser)) {
							errCheck1.append(firstname+"计划处审批人员,");
							infoCheck1.append(firstname+"计划处审批人员,");
						}
					}
					
					//PR录入员空值和有效性校验
					String pr=listByfirstCode.get(j).getPr();
					if(StringUtils.isBlank(pr)) {
						errBlank1.append("PR录入员");
					}else {
						String prUser=checkUserMulti1(lstUser,pr);
						if(StringUtils.isBlank(prUser)) {
							errCheck1.append(firstname+"PR录入员,");
							infoCheck1.append(firstname+"PR录入员,");
						}
					}
					
					//秘书有效性校验
					String secretary=listByfirstCode.get(j).getSecretary();
					if(StringUtils.isBlank(secretary)) {
						//err.append("秘书");
					}else {
						String secretaryUser=checkUserMulti1(lstUser,secretary);
						if(StringUtils.isBlank(secretaryUser)) {
							errCheck1.append(firstname+"秘书,");
							infoCheck1.append(firstname+"秘书,");
						}
					}
					
					//部门委托机要员有效性校验
					String consignor=listByfirstCode.get(j).getConsignor();
					if(StringUtils.isBlank(consignor)) {
						//err.append("部门委托机要员");
					}else {
						String consignorUser=checkUserMulti1(lstUser,consignor);
						if(StringUtils.isBlank(consignorUser)) {
							errCheck1.append(firstname+"部门委托机要员,");
							infoCheck1.append(firstname+"部门委托机要员,");
						}
					}
					
					if(StringUtils.isNotBlank(errBlank1.toString())) {
						infoBlank1.append(firstname+",");
					}else {
						//infoBlank1.append("无"); 
					}
					/*if(StringUtils.isNotBlank(errCheck1.toString())) {
						infoCheck1.append(errCheck1);
					}else {
						//infoCheck1.append("无"); 
					}*/
					
				//二级部门
				}else if(listByfirstCode.get(j).getLevel().intValue()==2) {
					
					String secondname = listByfirstCode.get(j).getSecondname();
					
					//主管空值和有效性校验
					String manager=listByfirstCode.get(j).getManager();
					if(StringUtils.isBlank(manager)) {
						errBlank2.append("主管");
					}else {
						String mgnUser=checkUserMulti1(lstUser,manager);
						if(StringUtils.isBlank(mgnUser)) {
							errCheck2.append(secondname+"主管,");
							infoCheck2.append(secondname+"主管,");
						}
					}
					
					//部门计划员空值和有效性校验
					String deptplanner=listByfirstCode.get(j).getDeptplanner();
					if(StringUtils.isBlank(deptplanner)) {
						errBlank2.append("部门计划员");
					}else {
						String deptplannerUser=checkUserMulti1(lstUser,deptplanner);
						if(StringUtils.isBlank(deptplannerUser)) {
							errCheck2.append(secondname+"部门计划员,");
							infoCheck2.append(secondname+"部门计划员,");
						}
					}
					
					//秘书有效性校验
					String secretary=listByfirstCode.get(j).getSecretary();
					if(StringUtils.isBlank(secretary)) {
						//err.append("秘书");
					}else {
						String secretaryUser=checkUserMulti1(lstUser,secretary);
						if(StringUtils.isBlank(secretaryUser)) {
							errCheck2.append(secondname+"秘书,");
							infoCheck2.append(secondname+"秘书,");
						}
					}
					
					//部门委托机要员有效性校验
					String consignor=listByfirstCode.get(j).getConsignor();
					if(StringUtils.isBlank(consignor)) {
						//err.append("部门委托机要员");
					}else {
						String consignorUser=checkUserMulti1(lstUser,consignor);
						if(StringUtils.isBlank(consignorUser)) {
							errCheck2.append(secondname+"部门委托机要员,");
							infoCheck2.append(secondname+"部门委托机要员,");
						}
					}
					
					if(StringUtils.isNotBlank(errBlank2.toString())) {
						infoBlank2.append(secondname+",");
					}else {
						//infoBlank2.append("无"); 
					}
					/*if(StringUtils.isNotBlank(errCheck2.toString())) {
						infoCheck2.append(errCheck2);
					}else {
						//infoCheck2.append("无"); 
					}*/
					
					
				//三级部门
				}else if(listByfirstCode.get(j).getLevel().intValue()==3) {
					String thirdname = listByfirstCode.get(j).getThirdname();
					
					//主管空值和有效性校验
					String manager=listByfirstCode.get(j).getManager();
					if(StringUtils.isBlank(manager)) {
						errBlank3.append("主管");
					}else {
						String mgnUser=checkUserMulti1(lstUser,manager);
						if(StringUtils.isBlank(mgnUser)) {
							errCheck3.append(thirdname+"主管,");
							infoCheck3.append(thirdname+"主管,");
						}
					}
					
					//部门计划员空值和有效性校验
					String deptplanner=listByfirstCode.get(j).getDeptplanner();
					if(StringUtils.isBlank(deptplanner)) {
						errBlank3.append("部门计划员");
					}else {
						String deptplannerUser=checkUserMulti1(lstUser,deptplanner);
						if(StringUtils.isBlank(deptplannerUser)) {
							errCheck3.append(thirdname+"部门计划员,");
							infoCheck3.append(thirdname+"部门计划员,");
						}
					}
					
					//秘书有效性校验
					String secretary=listByfirstCode.get(j).getSecretary();
					if(StringUtils.isBlank(secretary)) {
						//err.append("秘书");
					}else {
						String secretaryUser=checkUserMulti1(lstUser,secretary);
						if(StringUtils.isBlank(secretaryUser)) {
							errCheck3.append(thirdname+"秘书,");
							infoCheck3.append(thirdname+"秘书,");
						}
					}
					
					if(StringUtils.isNotBlank(errBlank3.toString())) {
						infoBlank3.append(thirdname+",");
					}else {
						//infoBlank3.append("无"); 
					}
					/*if(StringUtils.isNotBlank(errCheck3.toString())) {
						infoCheck3.append(errCheck3);
					}else {
						//infoCheck3.append("无"); 
					}*/
					
					
				//四级部门
				}else {
					String fourthname = listByfirstCode.get(j).getFourthname();
					
					//主管空值和有效性校验
					String manager=listByfirstCode.get(j).getManager();
					if(StringUtils.isBlank(manager)) {
						errBlank4.append("主管");
					}else {
						String mgnUser=checkUserMulti1(lstUser,manager);
						if(StringUtils.isBlank(mgnUser)) {
							errCheck4.append(fourthname+"主管,");
							infoCheck4.append(fourthname+"主管,");
						}
					}
					
					//部门计划员空值和有效性校验
					String deptplanner=listByfirstCode.get(j).getDeptplanner();
					/*if(StringUtils.isBlank(deptplanner)) {
						errBlank4.append("部门计划员");
					}else {*/
						String deptplannerUser=checkUserMulti1(lstUser,deptplanner);
						if(StringUtils.isBlank(deptplannerUser)) {
							errCheck4.append(fourthname+"部门计划员,");
							infoCheck4.append(fourthname+"部门计划员,");
						}
					//}
					
					//秘书有效性校验
					String secretary=listByfirstCode.get(j).getSecretary();
					if(StringUtils.isBlank(secretary)) {
						//err.append("秘书");
					}else {
						String secretaryUser=checkUserMulti1(lstUser,secretary);
						if(StringUtils.isBlank(secretaryUser)) {
							errCheck4.append(fourthname+"秘书 ,");
							infoCheck4.append(fourthname+"秘书 ,");
						}
					}
					
					if(StringUtils.isNotBlank(errBlank4.toString())) {
						infoBlank4.append(fourthname+",");
					}else {
						//infoBlank4.append("无"); 
					}
					/*if(StringUtils.isNotBlank(errCheck4.toString())) {
						infoCheck4.append(errCheck4);
					}else {
						//infoCheck4.append("无"); 
					}*/
					
				}
				
			}
			
			//一级部门秘书
			String secretary=deptList.get(i).getSecretary();
			String secUser=checkUserMulti1(lstUser,secretary);
			//User u1=new User();
			if(StringUtils.isNotBlank(secUser)) {
				String[] split = secUser.split(",");
		    	for(String item:split) {
					Optional<User> temp=lstUser.stream().filter(o->item.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
					if(temp.isPresent()) {
						User u1=temp.get();
						 //邮件标题
						List<String> sendList = new ArrayList<>();
						List<String> ccList = new ArrayList<>();
						sendList.clear();
						String code = u1.getCode();
						String sendTo = code+"@h3c.com";
						sendList.add(sendTo);
						String subject = "请您及时登录系统维护部门数据";
						StringBuilder stringBuilder = new StringBuilder();
						stringBuilder.setLength(0);
						String content="";
						//邮件内容
						if(StringUtils.isNotBlank(infoBlank1.toString()) || StringUtils.isNotBlank(infoBlank2.toString()) || 
								StringUtils.isNotBlank(infoBlank3.toString()) || StringUtils.isNotBlank(infoBlank4.toString()) ) {
							content = "<div>以下部门中部门简称、主管、部门计划员、计划处审批人员、PR录入员信息不全待维护：</div>";
						}
						
						if(StringUtils.isNotBlank(infoBlank1.toString())) {
							infoBlank1.deleteCharAt(infoBlank1.length() - 1); 
							content += "一级部门："+infoBlank1+"</br>";
						}
						if(StringUtils.isNotBlank(infoBlank2.toString())) {
							infoBlank2.deleteCharAt(infoBlank2.length() - 1); 
							content += "二级部门："+infoBlank2+"</br>";
						}
						if(StringUtils.isNotBlank(infoBlank3.toString())) {
							infoBlank3.deleteCharAt(infoBlank3.length() - 1); 
							content += "三级部门："+infoBlank3+"</br>";
						}
						if(StringUtils.isNotBlank(infoBlank4.toString())) {
							infoBlank4.deleteCharAt(infoBlank4.length() - 1); 
							content += "四级部门："+infoBlank4+"</br>";
						}
						
						if(StringUtils.isNotBlank(infoCheck1.toString()) || StringUtils.isNotBlank(infoCheck2.toString()) || 
								StringUtils.isNotBlank(infoCheck3.toString()) || StringUtils.isNotBlank(infoCheck4.toString()) ) {
							content += "</br><div>以下部门信息中，有失效人员待维护：</div>";
						}
						
						if(StringUtils.isNotBlank(infoCheck1.toString())) {
							infoCheck1.deleteCharAt(infoCheck1.length() - 1); 
							content += "一级部门："+infoCheck1+"</br>";
						}
						if(StringUtils.isNotBlank(infoCheck2.toString())) {
							infoCheck2.deleteCharAt(infoCheck2.length() - 1); 
							content += "二级部门："+infoCheck2+"</br>";
						}
						if(StringUtils.isNotBlank(infoCheck3.toString())) {
							infoCheck3.deleteCharAt(infoCheck3.length() - 1); 
							content += "三级部门："+infoCheck3+"</br>";
						}
						if(StringUtils.isNotBlank(infoCheck4.toString())) {
							infoCheck4.deleteCharAt(infoCheck4.length() - 1); 
							content += "四级部门："+infoCheck4+"</br>";
						}
						
						stringBuilder.append(content);
						stringBuilder.append("</br><div>此邮件来自：基础数据平台http://ibds.h3c.com/。</br>" +
							"如有使用问题请联系管理员，请勿直接回信。 </div>");
						err.append(stringBuilder.toString()+"</br>");
						if(StringUtils.isNotBlank(infoBlank1.toString()) || StringUtils.isNotBlank(infoBlank2.toString()) ||
								StringUtils.isNotBlank(infoBlank3.toString()) || StringUtils.isNotBlank(infoBlank4.toString()) ||
								StringUtils.isNotBlank(infoCheck1.toString()) || StringUtils.isNotBlank(infoCheck2.toString()) ||
								StringUtils.isNotBlank(infoCheck3.toString()) || StringUtils.isNotBlank(infoCheck4.toString()) ) {
							System.out.println(sendList);
							System.out.println(stringBuilder.toString());
							MailUtils.sendMail(sendList,ccList, subject, stringBuilder.toString());
						}else {
						}
						
					}
		    	}
			}
		}
	}
		
		
	//检查是不是姓名+ 工号的形式
	private static String checkUserMulti1(List<User> lst,String codeCollect) {
		List<String> lstUser=new ArrayList<>();
		for(String code:codeCollect.split(",")) {
			if(StringUtils.isBlank(code)) continue;
			Optional<User> temp=lst.stream().filter(o->code.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
			if(temp.isPresent()) {
				User user=temp.get();
				lstUser.add(user.getUda10509()+" "+user.getUda10512());
			}else {
				lstUser.clear();
			}		
		}
		return String.join(",",lstUser);
	}	
		
		
		

}
