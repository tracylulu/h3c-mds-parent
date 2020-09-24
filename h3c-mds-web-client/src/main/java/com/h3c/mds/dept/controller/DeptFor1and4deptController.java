package com.h3c.mds.dept.controller;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
import com.h3c.mds.dept.entity.view_DeptWithLevel;
import com.h3c.mds.dept.service.DeptDataService;
import com.h3c.mds.dept.service.DeptService;
import com.h3c.mds.finance.entity.FProductCode;
import com.h3c.mds.finance.entity.FProjectCode;
import com.h3c.mds.finance.entity.FProjectCodeView;
import com.h3c.mds.flowable.excel.AbstractExcelReader;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.flowable.util.SpringContextUtils;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.entity.Role;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.entity.UserRoleRelation;
import com.h3c.mds.sysmgr.entity.viewDomainGroupMember;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserRoleRelationService;
import com.h3c.mds.sysmgr.service.UserService;


@RestController
@RequestMapping("/dept")
public class DeptFor1and4deptController {
	
	@Autowired
	private DeptService deptService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	DeptDataService deptDataService;
	
	@Autowired
	private UserRoleRelationService userRoleRelationService;
	
	//-------------------一级部门页面的相关controller-----------------------------
	
	@RequestMapping("/list1/{level}")
	@ResponseBody
	public ModelAndView getDeptList(@PathVariable("level")Integer level) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("level", level);	
		mv.setViewName("dept/FirstDept/yijiDeptList");
		return mv;
	}
	
	
	@RequestMapping("/listYiJiDept/{level}")
	@ResponseBody
	public String listYiJiDept(@PathVariable("level")Integer level,String searchStr){
		Map<String,Object> param=new HashMap<>();
		//param.put("page", page);
		//param.put("rows", rows);
		param.put("level", level);
		param.put("searchParam", searchStr);
		List<view_DeptWithLevel> deptList = this.deptService.getyijiDeptList(param);
		/*JSONObject json = new JSONObject();
		try {
			json.put("rows", pageInfo.getList());
			json.put("total", pageInfo.getTotal());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return EasyUIJSONUtils.list2EasyUiTreeGrid_close(deptList);
	}
	
	//部门详情展示信息页面
    @RequestMapping("/toAddYiJiDept")
    public ModelAndView toAddYiJiDept(String code,String tid){
    	//isEdit  true为新增   false为修改
    	ModelAndView mv=new ModelAndView();
		mv.addObject("id_suffix", System.currentTimeMillis());
		mv.addObject("code", code);	
		mv.addObject("tid",tid);
		//mv.addObject("name", name);	
		mv.setViewName("dept/FirstDept/yijiDeptListDetail");
    	return mv;
    }
    
    //一级部门适用，因为传过来的是一级部门code
    //判断当前用户在IBDS_Dept_SysPersonRole中维护的是不是表中设置的一级部门，
    //且一级部门秘书、部门信息维护员、部门委托人、部门接口人，有所在一级部门及以下部门信息修改权限
    @RequestMapping("/judgeAddYiJiDept")
	@ResponseBody
	public String judgeAddYiJiDept(String code){
		Map<String,Object> param=new HashMap<>();
		JSONObject json = new JSONObject();
		//判断当前用户在IBDS_Dept_SysPersonRole中维护的是不是自己的一级部门，
		Subject subject = SecurityUtils.getSubject();
  		User user = (User) subject.getSession().getAttribute("current_user");
  		List<IBDS_Dept_SysPersonRole> list01=deptService.getRoleListByNameAndP01(user.getCode(),"P01");
		List<IBDS_Dept_SysPersonRole> list02=deptService.getRoleListByNameAndP01(user.getCode(),"P02");
		List<IBDS_Dept_SysPersonRole> list03=deptService.getRoleListByNameAndP01(user.getCode(),"P03");
		List<IBDS_Dept_SysPersonRole> list04=deptService.getRoleListByNameAndP01(user.getCode(),"P04");
		List list01SAPCode=new ArrayList<>();List list02SAPCode=new ArrayList<>();
		List list03SAPCode=new ArrayList<>();List list04SAPCode=new ArrayList<>();
		String flag="";
		String code01="";String code02="";String code03="";String code04="";
		if(list01.size()>0){
			for (int i = 0; i < list01.size(); i++) {
				list01SAPCode.add(list01.get(i).getSapcode());
			}
		}
		if(list02.size()>0){
			for (int i = 0; i < list02.size(); i++) {
				list02SAPCode.add(list02.get(i).getSapcode());
			}
		}
		if(list03.size()>0){
			for (int i = 0; i < list03.size(); i++) {
				list03SAPCode.add(list03.get(i).getSapcode());
			}
		}
		if(list04.size()>0){
			for (int i = 0; i < list04.size(); i++) {
				list04SAPCode.add(list04.get(i).getSapcode());
			}
		}
		//确认是不是管理员，是的话可以修改
		Boolean checkIsAdmin = UserUtil.checkIsAdmin();
		if(list01.size()>0 || list02.size()>0 || list03.size()>0 || list04.size()>0 || checkIsAdmin) {
			if(list01SAPCode.contains(code) || list02SAPCode.contains(code) || 
					list03SAPCode.contains(code) || list04SAPCode.contains(code) ||checkIsAdmin ) {
				flag="ok";
			}else {
				flag="error";
			}
		}else {
			flag="noPermiss";
		}
		try {
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return flag;
	}
    
    //四级部门适用，因为传过来的是四级部门code，判断它属于哪个一级部门
    //判断当前用户在IBDS_Dept_SysPersonRole中维护的是不是表中设置的一级部门，
    //且一级部门秘书、部门信息维护员、部门委托人、部门接口人，有所在一级部门及以下部门信息修改权限
    @RequestMapping("/judgeAddSiJiDept")
	@ResponseBody
	public String judgeAddSiJiDept(String code,String level){
		Map<String,Object> param=new HashMap<>();
		JSONObject json = new JSONObject();
		List<view_DeptWithLevel> firstDeptCodeList=new ArrayList<>();
		String yiJideptCode="";
		//判断当前需要编辑的二级三级四级部门属于哪个一级部门
		if(level.equals("2")) {
			firstDeptCodeList = deptService.getFirstDeptCodeBy2DeptCode(code);
			yiJideptCode=firstDeptCodeList.get(0).getFirstcode();
		}else if(level.equals("3")){
			firstDeptCodeList = deptService.getFirstDeptCodeBy3DeptCode(code);
			yiJideptCode=firstDeptCodeList.get(0).getFirstcode();
		}else {
			firstDeptCodeList = deptService.getFirstDeptCodeByFourthDeptCode(code);
	  		yiJideptCode=firstDeptCodeList.get(0).getFirstcode();
		}
		//判断当前用户在IBDS_Dept_SysPersonRole中维护的是不是自己的一级部门，
		Subject subject = SecurityUtils.getSubject();
  		User user = (User) subject.getSession().getAttribute("current_user");
		List<IBDS_Dept_SysPersonRole> list01=deptService.getRoleListByNameAndP01(user.getCode(),"P01");
		List<IBDS_Dept_SysPersonRole> list02=deptService.getRoleListByNameAndP01(user.getCode(),"P02");
		List<IBDS_Dept_SysPersonRole> list03=deptService.getRoleListByNameAndP01(user.getCode(),"P03");
		List<IBDS_Dept_SysPersonRole> list04=deptService.getRoleListByNameAndP01(user.getCode(),"P04");
		List list01SAPCode=new ArrayList<>();List list02SAPCode=new ArrayList<>();
		List list03SAPCode=new ArrayList<>();List list04SAPCode=new ArrayList<>();
		String flag="";
		String code01="";String code02="";String code03="";String code04="";
		if(list01.size()>0){
			for (int i = 0; i < list01.size(); i++) {
				list01SAPCode.add(list01.get(i).getSapcode());
			}
		}
		if(list02.size()>0){
			for (int i = 0; i < list02.size(); i++) {
				list02SAPCode.add(list02.get(i).getSapcode());
			}
		}
		if(list03.size()>0){
			for (int i = 0; i < list03.size(); i++) {
				list03SAPCode.add(list03.get(i).getSapcode());
			}
		}
		if(list04.size()>0){
			for (int i = 0; i < list04.size(); i++) {
				list04SAPCode.add(list04.get(i).getSapcode());
			}
		}
		Boolean checkIsAdmin = UserUtil.checkIsAdmin();
		if(list01.size()>0 || list02.size()>0 || list03.size()>0 || list04.size()>0 || checkIsAdmin) {
			if(list01SAPCode.contains(yiJideptCode) || list02SAPCode.contains(yiJideptCode) || 
					list03SAPCode.contains(yiJideptCode) || list04SAPCode.contains(yiJideptCode) || checkIsAdmin) {
				flag="ok";
			}else {
				flag="error";
			}
		}else {
			flag="noPermiss";
		}
		try {
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return flag;
	}

    //判断当前登录人有没有工作委托的权限，只有一级部门秘书、部门信息维护员才有权限
    @RequestMapping("/judgeAddWorkPerson")
	@ResponseBody
	public String judgeAddWorkPerson(){
    	String flag="";
    	Subject subject = SecurityUtils.getSubject();
		//当前登录人的域账号
		String user = (String)subject.getSession().getAttribute("UserIdentity");
		//根据当前登录人的域账号获取当前登录人的姓名
		User u= userService.getUserByAccount(user);
		
		//根据当前登录人的code和P01这个角色，查询在用户角色表中是有存在该用户，也就是判断是不是一级部门秘书的角色
    	List<IBDS_Dept_SysPersonRole> list01=deptService.getRoleListByNameAndP01(u.getCode(),"P01");
    	//根据当前登录人的code和P02这个角色，查询在用户角色表中是有存在该用户，也就是判断是不是部门维护员的角色
    	List<IBDS_Dept_SysPersonRole> list02=deptService.getRoleListByNameAndP01(u.getCode(),"P02");
    	//根据当前登录人的code(创建人角色)和P03这个角色，查询在用户角色表中该用户有没有设置过P03
    	List<IBDS_Dept_SysPersonRole> list03=deptService.getRoleListByNameAndP03(u.getCode(),"P03");
    	if(list01.size()>0 || list02.size()>0) {
    		//有权限
    		flag="havePermiss";
    	}else {
    		//无权限
    		flag="notHavePermiss";
    		//一级部门秘书、信息维护员角色用户失效时，被工作委托的用户也要失效
    		//没有的话算了，有的话删除设置好的委托人用户信息
    		int count = deptService.deleteRoleByCreatorCode(u.getCode(),"P03");
    	}
		try {
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return flag;
	}
    
    //一级部门页面判断当前登录人有没有导入的权限，只有管理员，P01，P02,P03,P04才有权限
    @RequestMapping("/judgeImport")
	@ResponseBody
	public String judgeImport(){
    	String flag="";
    	Subject subject = SecurityUtils.getSubject();
		//当前登录人的域账号
		String user = (String)subject.getSession().getAttribute("UserIdentity");
		//根据当前登录人的域账号获取当前登录人的姓名
		User u= userService.getUserByAccount(user);
		List<IBDS_Dept_SysPersonRole> roleList = deptService.getRoleListByCode(u.getCode());
		//确认是不是管理员，是的话可以导入
		Boolean checkIsAdmin = UserUtil.checkIsAdmin();
    	if(roleList.size()>0 || checkIsAdmin) {
    		//有权限
    		flag="haveImportPermiss";
    	}else {
    		//无权限
    		flag="notHaveImportPermiss";
    	}
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
    
    //四级部门页面判断当前登录人有没有导入的权限，只有P01，P02,P03,P04才有权限
    @RequestMapping("/judgeImport4")
	@ResponseBody
	public String judgeImport4(){
    	String flag="";
    	Subject subject = SecurityUtils.getSubject();
		//当前登录人的域账号
		String user = (String)subject.getSession().getAttribute("UserIdentity");
		//根据当前登录人的域账号获取当前登录人的姓名
		User u= userService.getUserByAccount(user);
		List<IBDS_Dept_SysPersonRole> roleList = deptService.getRoleListByCode(u.getCode());
		//确认是不是管理员，是的话可以导入
		Boolean checkIsAdmin = UserUtil.checkIsAdmin();
    	if(roleList.size()>0 || checkIsAdmin) {
    		//有权限
    		flag="haveImportPermiss4";
    	}else {
    		//无权限
    		flag="notHaveImportPermiss4";
    	}
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
    
    //获取一级部门页面按钮coa电子流的链接
    @RequestMapping("/toCoaLinkPage")
	@ResponseBody
	public String toCoaLinkPage(){
    	String siteMainUrl = ((Environment)SpringContextUtils.getBean(Environment.class)).getProperty("sso.main.coa.url");
    	String coaLink=siteMainUrl.trim()+"/bpm/r?wf_num=P_h3c32N007_001";
    	System.out.println(coaLink);
		return coaLink;
	}
    
    
    @RequestMapping("/getYIJiDeptListByCodeAndName")
    @ResponseBody
    public Map<String, Object> getYIJiDeptListByCodeAndName(String code){
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("code", code);
    	//param.put("name", name);
    	Map<String, Object> yiJiDeptMgnRoleByCode = deptService.getYiJiDeptMgnRoleByCode(param);
    	System.out.println(yiJiDeptMgnRoleByCode);
		return deptService.getYiJiDeptMgnRoleByCode(param);
    	
    }
    
    //工作委托功能，页面回显
    //IE下Ajax请求无效是因为IE有个缓存机制，会对请求的url进行判断，发现短时间内请求url相同，则使用缓存的数据而不是重新去服务器获取一次数据，
    //在url后面加时间戳或者随机数传到后台。可以通过如下两种方式来解决这个问题
    @RequestMapping("/getWorkPerson")
    @ResponseBody
    public String getWorkPerson(String d){
    	List<User> lstUser=userService.getAll();
    	User u1=new User();
    	Subject subject = SecurityUtils.getSubject();
		//当前登录人的域账号
		String user = (String)subject.getSession().getAttribute("UserIdentity");
		//根据当前登录人的域账号获取当前登录人的姓名
		User u= userService.getUserByAccount(user);
    	//根据当前登录人的code(创建人角色)和P03这个角色，查询在用户角色表中该用户有没有设置过P03
	    List<IBDS_Dept_SysPersonRole> list03=deptService.getRoleListByNameAndP03(u.getCode(),"P03");
	    String name =null;
	    if(list03.size()>0) {
	    	String personcode = list03.get(0).getPersoncode();
	    	Optional<User> temp=lstUser.stream().filter(o->personcode.equals(o.getUda10512())).findFirst();
			if(temp.isPresent()) {
				u1 = temp.get();
			}
			String personEngName = u1.getUda10509();
	    	name=personEngName+" "+personcode;
	    }
		return name;
    	
    }
    
    
    //一级部门模块编辑信息
    @RequestMapping(value="editYiJiDept", produces="text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult editYiJiDept(IBDS_Dept_MgnRole mgnRole){
    	
    	User u1=new User();
    	List<User> lstUser=userService.findAll();
    	Subject subject = SecurityUtils.getSubject();
  		User user = (User) subject.getSession().getAttribute("current_user");
  		
  		List<IBDS_Dept_MgnRole> mgnRoleList = deptService.getMgnRoleListByCode(mgnRole.getCode());
  		
  		deptService.editYiJiDeptById(mgnRole,mgnRoleList);
    	
    	//获取提交人ID信息，在用户角色表中判断用户角色
    	//List<IBDS_Dept_SysPersonRole> list=deptService.getRoleListByCode(user.getCode());
    	//维护用户角色表中一级部门秘书信息,先删除在添加
    	//String roletypecode = list.get(0).getRoletypecode();
    	int count = deptService.deleteRoleByCode(mgnRole.getCode(),"P01");
		//新申请一级部门情况，将COA电子流申请人设置为部门接口人。接口人解决部门白板问题，一级部门秘书信息被维护后，该接口人权限回收。
    	if(!mgnRole.getSecretary().equals("")) {
    		int deleteRoleForP04 = deptService.deleteRoleByCode(mgnRole.getCode(),"P04");
    	}
    	
    	//Secretary秘书字段例如：chenxiaoyan 00157,likunkun 12328,
    	//当输入的秘书是多值的时候，循环遍历往用户角色表添加信息
    	//List<UserRoleRelation> lst=new ArrayList();
    	//一级部门对于的code
		//String roleCode = "R_000012";
		//List<UserRoleRelation> lstRelation=userRoleRelationService.getUserRoleRelListByRoleCode(roleCode);
    	String sname=mgnRole.getSecretary();
    	String[] split = sname.split(",");
    	if(!sname.equals("")) {
    	for(String item:split) {
			System.out.println(item);
			Optional<User> temp=lstUser.stream().filter(o->item.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
			if(temp.isPresent()) {
				u1=temp.get();
				/*User u2=temp.get();
				//已拥有此角色的人员不添加 
				//IBDS_User_Role  维护用户和角色的关系，这样权限管理这块创建的一级部门角色下才能有加的角色人员
				Optional<UserRoleRelation> tempRelation=lstRelation.stream().filter(o->u2.getUda10511().equals(o.getHurrHulCode())).findFirst();
				if(!tempRelation.isPresent()) {
					UserRoleRelation relation=new UserRoleRelation();
					relation.setHurrHrlCode(roleCode);
					relation.setHurrHulCode(u2.getUda10511());
					lst.add(relation);
				}*/
			}
			/*if(lst!=null&&lst.size()>0) {
				userRoleRelationService.addUserRoleBatch(lst);
			}*/
			
			//根据姓名+空格+工号 返回当前员工域账号
			//String account = userService.backDomainAccount(split[i]);
			//根据域账号获取用户姓名
			//User u1= userService.getUserByAccount(account);
			
			IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
	    	role.setSapcode(mgnRole.getCode());
	    	role.setRoletypecode("P01");
			role.setPersoncode(u1.getCode());
			role.setPersonname(u1.getName());
			role.setCreatorcode(user.getCode());
			role.setCreatorname(user.getName());
			role.setCreatetime(new Date());
			deptService.create(role);
			}
    	}
    	return ResponseResult.success("修改成功");
    }
    
    //点击保存按钮展示信息页面
    @RequestMapping("/saveToList/{code}")
    public ModelAndView saveToList(@PathVariable("code")String code,String tid){
    	ModelAndView mv=new ModelAndView();
		mv.addObject("id_suffix", System.currentTimeMillis());
		mv.addObject("code", code);	
		mv.addObject("tid", tid);	
		mv.setViewName("dept/FirstDept/yijiDeptListDetail");
    	return mv;
    }
    
    //设置工作委托人员
  	@RequestMapping(value="/setWorkPerson", produces="text/html;charset=utf-8")
  	@ResponseBody
  	public String setWorkPerson(String users){	
  		try {
  			System.out.println(users);
  			//页面填了不为空的值
			if(!users.equals("")) {
				List<User> lstUser=userService.findAll();
	  			Subject subject = SecurityUtils.getSubject();
	  			//当前登录人的域账号
	  			String user = (String)subject.getSession().getAttribute("UserIdentity");
	  			//根据当前登录人的域账号获取当前登录人的姓名
	  			User u= userService.getUserByAccount(user);
	  			
	  			//根据当前登录人的code和P01这个角色，查询在用户角色表中是有存在该用户，也就是判断是不是一级部门秘书的角色
	  	    	List<IBDS_Dept_SysPersonRole> list01=deptService.getRoleListByNameAndP01(u.getCode(),"P01");
	  	    	//根据当前登录人的code和P02这个角色，查询在用户角色表中是有存在该用户，也就是判断是不是部门维护员的角色
	  	    	List<IBDS_Dept_SysPersonRole> list02=deptService.getRoleListByNameAndP01(u.getCode(),"P02");
	  	    	//根据当前登录人的code(创建人角色)和P03这个角色，查询在用户角色表中该用户有没有设置过P03
	  	    	List<IBDS_Dept_SysPersonRole> list03=deptService.getRoleListByNameAndP03(u.getCode(),"P03");
	  	    	if(list01.size()>0 || list02.size()>0) {
	  	    	//当前登录人有信息维护权限的用户（一级部门秘书、信息维护员）有此功能权限，仅能设置委托一人
	  	    		//每次新增P03之前，,先删除之前表中当前登录人存储的P03，再添加
	  	    		int count = deptService.deleteRoleByCreatorCode(u.getCode(),"P03");
	  	    		IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
	  	  			//users的格式为 maxianpeng 09212
	  	    		User u1=checkuser(lstUser,users);
	  	  			String[] arr_User=users.split(",");
	  	  			for(String item:arr_User) {
	  	  				Optional<User> temp=lstUser.stream().filter(o->item.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
	  	  				if(temp.isPresent()) {
	  	  					u1=temp.get();
	  	  				}
	  	  			}
	  	  			//获取当前设置人的部门，当前登录人的
	  	  			//当前人员的子部门
	  	  	  		User current_user = (User) subject.getSession().getAttribute("current_user");
	  	  	  		List<viewDomainGroupMember> lstmember = userService.selectDeptCode(current_user.getCode());
	  	  	  		//当前人员的一级部门code
	  	  	  		String yiJideptCode="";
	  	  	  		//List<view_DeptWithLevel> firstDeptCodeList = deptService.getFirstDeptCodeByCode(lstmember.get(0).getDeptcode());
	  	  	  		List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P01");
	  	  	  		List<IBDS_Dept_SysPersonRole> RoleList2 = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P02");
	  	  	  		//P01有多个
		  	  	  	if(RoleList.size()>1) {
		  	  	  		return "新增失败,您是多个部门的一级部门秘书，不允许增加工作委托人！";
		  	  	  	}
	  	  	  		if(RoleList.size()>0) {
	  	  	  			//是p01角色
	  	  	  			yiJideptCode=RoleList.get(0).getSapcode();
	  	  	  		}else {
	  	  	  			//是p02角色
	  	  	  			yiJideptCode=RoleList2.get(0).getSapcode();
	  	  	  		}
	  	  	  		
	  	  	  		//不为空说明不是错误填写，是可以在数据库中查到填写的人员。
					if(u1!=null) {
						Map<String,Object> param3=new HashMap<>();
						param3.put("personcode", u1.getCode());
						param3.put("roletypecode", "P03");
						//param.put("sapcode", yiJideptCode);
						List<IBDS_Dept_SysPersonRole> listForP03 = deptService.selectRoleListByParam(param3);
						if(listForP03.size()>0) {
							//存在重复记录
							return "infoForP03";
						}else {
							role.setSapcode(yiJideptCode);
			  	  			role.setRoletypecode("P03");
			  	  			role.setPersoncode(u1.getUda10512());
			  	  			role.setPersonname(u1.getName());
			  	  			role.setCreatorcode(u.getUda10512());
			  	  			role.setCreatorname(u.getName());
			  	  			role.setCreatetime(new Date());
			  	  			deptService.create(role);
			  	  			return "ok,新增成功!";
						}	
						
					}else {
						//为空说明是错误填写
						return "sorry,新增人员不存在，新增失败!";
						}
	  	    	}else {
	  	    		//一级部门秘书、信息维护员角色用户失效时，被工作委托的用户也要失效
	  	    		//没有的话算了，有的话删除设置好的委托人用户信息
	  	    		int count = deptService.deleteRoleByCreatorCode(u.getCode(),"P03");
	  	    		return "新增失败，您没有权限添加委托人!";
	  	    	}
			}else {
				//页面没有填值，传过来为空
				return "sorry,新增人员未填写，新增失败!";
			}
  		}catch(Exception e) {
  			return "您已无权限操作，请刷新页面或退出重登";
  		}
  	}
    
  //-------------------四级部门页面的相关controller-----------------------------
    @RequestMapping("/list4/{level}")
  	@ResponseBody
  	public ModelAndView get4DeptList(@PathVariable("level")Integer level) {
  		ModelAndView mv=new ModelAndView();
  		mv.addObject("id_suffix", new Date().getTime());
  		mv.addObject("level", level);	
  		mv.setViewName("dept/FourDept/sijiDeptList");
  		return mv;
  	}
    
    /**
	 * 获取列表数据
	 * @param level 列表层级
	 * @param currentlevel 当前展开节点层级
	 * @param id 节点id
	 * @param searchStr 查询条件
	 * @return
	 */
	@RequestMapping("/list4TreeData/{level}")
	@ResponseBody
	public String Treedata(@PathVariable("level")Integer level,Integer currentlevel,String id, String searchStr) {
		currentlevel=currentlevel==null?0:currentlevel;
		Map<String,Object> param=new HashMap<>();
		param.put("id", id);
		param.put("level", level);
		param.put("searchParam", searchStr);
		param.put("isEnd", level.equals(currentlevel+1)?1:0);
		param.put("currentlevel", currentlevel);
		List<view_DeptWithLevel> lst=deptService.get4DeptList(param);
		return !level.equals(currentlevel+1) ? EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst);
	}
    
	//部门详情展示信息页面
    @RequestMapping("/toAddSiJiDept")
    public ModelAndView toAddSiJiDept(String code,String tid){
    	//isEdit  true为新增   false为修改
    	ModelAndView mv=new ModelAndView();
		mv.addObject("id_suffix", System.currentTimeMillis());
		mv.addObject("code", code);	
		//mv.addObject("name", name);	
		mv.addObject("tid",tid);
		mv.setViewName("dept/FourDept/sijiDeptListDetail");   	
    	
    	return mv;
    }
    
  //四级部门模块编辑信息
    @RequestMapping(value="editSiJiDept", produces="text/html;charset=utf-8")
    @ResponseBody
    public ResponseResult editSiJiDept(IBDS_Dept_MgnRole mgnRole){
    	
    	Subject subject = SecurityUtils.getSubject();
  		User user = (User) subject.getSession().getAttribute("current_user");
    	//deptService.editYiJiDeptById(mgnRole);
    	
  		List<IBDS_Dept_MgnRole> mgnRoleList = deptService.getMgnRoleListByCode(mgnRole.getCode());
  		
    	deptService.editYiJiDeptById(mgnRole,mgnRoleList);
    	
    	return ResponseResult.success("修改成功");
    }
    
  //点击保存按钮展示信息页面
    @RequestMapping("/saveTo4List/{code}")
    public ModelAndView saveTo4List(@PathVariable("code")String code,String tid){
    	ModelAndView mv=new ModelAndView();
		mv.addObject("id_suffix", System.currentTimeMillis());
		mv.addObject("code", code);	
		mv.addObject("tid", tid);	
		mv.setViewName("dept/FourDept/sijiDeptListDetail"); 
    	return mv;
    }
    
  //-------------------部门信息维护员管理页面的相关controller-----------------------------
	
  	@RequestMapping("/list5/{level}")
  	@ResponseBody
  	public ModelAndView getDeptInfoManageList(@PathVariable("level")Integer level) {
  		
  		Subject subject = SecurityUtils.getSubject();
  		User user = (User) subject.getSession().getAttribute("current_user");
  		ModelAndView mv=new ModelAndView();
  		mv.addObject("id_suffix", new Date().getTime());
  		mv.addObject("level", level);	
  		mv.setViewName("dept/deptManage/deptInfoManage");
  		return mv;
  	}
    
    
    //展示列表信息
  	@RequestMapping("/listDeptInfo")
	@ResponseBody
	public String pageOfUserManageByCode(String code,Integer page, Integer rows,String searchStr){
		Map<String,String> param=new HashMap<>();
		JSONObject json =  new JSONObject();
		
		Subject subject = SecurityUtils.getSubject();
  		User user = (User) subject.getSession().getAttribute("current_user");
  		
  		//确认是不是管理员，是的话可以看到所有秘书设置的P02
		Boolean checkIsAdmin = UserUtil.checkIsAdmin();
		
  		//根据一级秘书的部门查询自己部门名下的维护人员信息
  		//当前人员的子部门
  		//Map<String,String> param1=new HashMap<>();
		//param1.put("code", user.getUda10509()+" "+user.getUda10512());
  		//List<IBDS_Dept> DeptCode = deptService.selectDeptCode(param1);
  		//List<viewDomainGroupMember> lstmember = userService.selDomainGroupMemberByparam(param1);
  		List<viewDomainGroupMember> lstmember = userService.selectDeptCode(user.getCode());
  		//当前人员的一级部门code
  		//List<view_DeptWithLevel> firstDeptCodeList = deptService.getFirstDeptCodeByCode(lstmember.get(0).getDeptcode());
  		//String yiJideptCode=firstDeptCodeList.get(0).getFirstcode();
  		List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P01");
  		if(checkIsAdmin) {
  	  		param.put("roleTypeCode", "P02");
  	  		param.put("searchParam", searchStr);
  	  		PageInfo<Map> pageInfo = deptService.pageofUserByCodeForAdmin(param, page, rows);
  			json.put("total", pageInfo.getTotal());
  			json.put("rows", pageInfo.getList());
  	  		System.out.println(json.toString());
  		}else {
  			Long totalCount=(long) 0;
  		  	List<Map> allList=new ArrayList<>();
  	  		for (int i = 0; i < RoleList.size(); i++) {
  	  			param.put("code", RoleList.get(i).getSapcode());
  	  			param.put("roleTypeCode", "P02");
  	  		    param.put("searchParam", searchStr);
  	  			PageInfo<Map> pageInfo = deptService.pageofUserByCode(param, page, rows);
  	  			long total = pageInfo.getTotal();
  	  			List<Map> list = pageInfo.getList();
  	  			totalCount+=total;
  	  			allList.addAll(list);
  			}
  	  		PageInfo<Map> pageInfoAll =new PageInfo<>();
  	  		pageInfoAll.setTotal(totalCount);
  	  		pageInfoAll.setList(allList);
  			json.put("total", pageInfoAll.getTotal());
  			json.put("rows", pageInfoAll.getList());
  	  		System.out.println(json.toString());
  		}
  		
  		
  		
  		
		/*param.put("code", RoleList.get(0).getSapcode());
		param.put("roleTypeCode", "P02");
		PageInfo<Map> pageInfo = deptService.PageofUserByCode(param, page, rows);
		
		JSONObject json =  new JSONObject();
		
		json.put("total", pageInfo.getTotal());
		json.put("rows", pageInfo.getList());*/
		
		return json.toString();
	}
    
    //移除功能
  	@RequestMapping(value="/delUser", produces="text/html;charset=utf-8")
	@ResponseBody
	public String delUser(String personcode,String deptCode){
  		System.out.println(personcode);
		int count = deptService.deleteWorkPerson(personcode, deptCode, "P02");
		return "ok,删除成功！";
	}
    
	//获取下拉框的下拉列表
	@RequestMapping(value="/setdCombobox")
	@ResponseBody
	public List<Map<String, Object>> setdCombobox(){	
		Map<String,Object> param=new HashMap<>();
		//list存放map，map存放kv值（json）
    	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		//当前登录人员
		Subject subject = SecurityUtils.getSubject();
  		User current_user = (User) subject.getSession().getAttribute("current_user");
  		List<viewDomainGroupMember> lstmember = userService.selectDeptCode(current_user.getCode());
  		//当前人员的在角色表中存储的P01
  		List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P01");
  		
  		//确认是不是管理员，是的话可以设置所有一级部门的秘书
  		Boolean checkIsAdmin = UserUtil.checkIsAdmin();
  		if(checkIsAdmin) {
  			Map<String,Object> paramNew=new HashMap<>();
  			paramNew.put("level", 1);
  			List<view_DeptWithLevel> deptList = deptService.getyijiDeptList(paramNew);
  			for (int i = 0; i < deptList.size(); i++) {
  				Map<String, Object> map = new HashMap<String, Object>();
  	    		//只取classid、ClassName即可。
  	    		String deptCode = deptList.get(i).getFirstcode();
  	    		//获取部门中文名称
  	    		param.put("deptCode", deptCode);
  	    		param.put("deptLevel", 1);
  	    		List<DeptData> selectDeptDataForLervel = deptDataService.selectDeptDataByParam(param);
  	    		String deptName = selectDeptDataForLervel.get(0).getDeptName();
  	    		//map存放键值对
  	    		map.put("deptCode",deptCode);
  		    	map.put("deptName",deptName);
  		    	//list存放map
  		    	list.add(map);
			}
  		}else {
  			for (IBDS_Dept_SysPersonRole role : RoleList) {
  	    		Map<String, Object> map = new HashMap<String, Object>();
  	    		//只取classid、ClassName即可。
  	    		String deptCode = role.getSapcode().toString();
  	    		//获取部门中文名称
  	    		param.put("deptCode", deptCode);
  	    		param.put("deptLevel", 1);
  	    		List<DeptData> selectDeptDataForLervel = deptDataService.selectDeptDataByParam(param);
  	    		String deptName = selectDeptDataForLervel.get(0).getDeptName();
  	    		//map存放键值对
  	    		map.put("deptCode",deptCode);
  		    	map.put("deptName",deptName);
  		    	//list存放map
  		    	list.add(map);
  			}
  		}
  		System.out.println("json格式:"+list); //打印出来就成为了json格式
		return list;
		
	}
    
  	//移除设置的工作委托人
  	@RequestMapping(value="/delWorkPerson")
	@ResponseBody
	public String delWorkPerson(String workPerson,String d){
  		List<User> lstUser=userService.findAll();
  		User u1=checkuser(lstUser,workPerson);
  		System.out.println(workPerson);
  		Subject subject = SecurityUtils.getSubject();
  		User current_user = (User) subject.getSession().getAttribute("current_user");
  		//List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP03(current_user.getCode(), "P03");
  		//String yiJideptCode=RoleList.get(0).getSapcode();
  		Map<String,Object> param=new HashMap<>();
  		param.put("creatorcode", current_user.getCode());
  		param.put("personcode", u1.getCode());
		param.put("roletypecode", "P03");
		List<IBDS_Dept_SysPersonRole> list03 = deptService.selectRoleListByParam(param);
		String yiJideptCode=list03.get(0).getSapcode();
		int count = deptService.deleteWorkPerson(u1.getCode(),yiJideptCode,"P03");
		return "ok,删除成功！";
	}
  	
    
  	/**
	 * 人员联想
	 */
	@RequestMapping("/userlink/list")
	public List<viewDomainGroupMember> getSingUser(String q) {
		Map<String, String> param = new HashMap<>();
		param.put("name", q);
		// return userService.selUserbyparam(param);--selDomainGroupMemberByparam
		// notes群组人员改为域群组人员
		return userService.selDomainGroupMemberByparam(param);
	}
    
	//新增人员
	@RequestMapping(value="/addUserRole")
	@ResponseBody
	public String addUserRole(String users,String comboboxValue){	
		try {
			System.out.println(users);
			//页面中选择的一级部门code
			System.out.println(comboboxValue);
			Map<String,Object> param=new HashMap<>();
			Subject subject = SecurityUtils.getSubject();
			//当前登录人的域账号
			String user = (String)subject.getSession().getAttribute("UserIdentity");
			//根据当前登录人的域账号获取当前登录人的姓名
			User u= userService.getUserByAccount(user);
			List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01(u.getCode(), "P01");
			//确认是不是管理员，是的话可以设置所有一级部门的P02
	  		Boolean checkIsAdmin = UserUtil.checkIsAdmin();
			
			//有一级部门秘书的权限
			if(RoleList.size()>0 || checkIsAdmin) {
				//页面填了不为空的值
				if(!users.equals("")) {
					IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
					//users的格式为 maxianpeng 09212
					//根据姓名+空格+工号 返回当前员工域账号
					//String account = userService.backDomainAccount(users);
					//根据域账号获取用户姓名
					//User u1= userService.getUserByAccount(account);
					//User u1=new User();
					List<User> lstUser=userService.findAll();
					User u1=checkuser(lstUser,users);
					/*String[] arr_User=users.split(",");
					for(String item:arr_User) {
						Optional<User> temp=lstUser.stream().filter(o->item.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
						if(temp.isPresent()) {
							u1=temp.get();
						}
					}*/
					
					//获取当前设置人的部门，当前登录人的
					//当前人员的子部门
			  		User current_user = (User) subject.getSession().getAttribute("current_user");
			  		//List<viewDomainGroupMember> lstmember = userService.selectDeptCode(current_user.getCode());
			  		
			  		//当前人员的一级部门code
			  		//List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P01");
			  		//String yiJideptCode=RoleList.get(0).getSapcode();
					//不为空说明不是错误填写，是可以在数据库中查到填写的人员。
					if(u1!=null) {
						//判断当前人是不是已经存在P02的角色，否的话就添加，是的话就不增加了，弹出错误提示框
						//List<IBDS_Dept_SysPersonRole> list02=deptService.getRoleListByNameAndP01(u1.getCode(),"P02");
						//这块有修改，一个部门维护员可以维护多个部门
						param.put("personcode", u1.getCode());
						param.put("roletypecode", "P02");
						//param.put("sapcode", yiJideptCode);
						List<IBDS_Dept_SysPersonRole> list02 = deptService.selectRoleListByParam(param);
						if(list02.size()>0) {
							//存在重复记录
							//Map<String,String> param2=new HashMap<>();
							//param.put("deptCode", list02.get(0).getSapcode());
							//List<DeptData> selectDeptList = deptDataService.selectDeptDataByParam(param2);
							//需要维护的部门的中文名
							//String deptName = selectDeptList.get(0).getDeptName();
							return "info";
						}else {
							role.setSapcode(comboboxValue);
							role.setRoletypecode("P02");
							role.setPersoncode(u1.getUda10512());
							role.setPersonname(u1.getName());
							role.setCreatorcode(u.getUda10512());
							role.setCreatorname(u.getName());
							role.setCreatetime(new Date());
							deptService.create(role);
							return "ok,新增成功!";
						}
						
					}else {
						//为空说明是错误填写
						return "sorry,新增人员不存在，新增失败!";
					}
					
				}else {
					//页面没有填值，传过来为空
					return "sorry,新增人员未填写，新增失败!";
				}
			}else {
				return "您已无权限操作，请重新退出登录系统";
			}
		}catch(Exception e) {
			return "error";
		}
	}
	
	
	//获取部门的中文名称(P02使用)
	@RequestMapping(value="/getdeptName")
	@ResponseBody
	public String getdeptName(String users){	
		System.out.println(users);
		Map<String,Object> param=new HashMap<>();
		List<User> lstUser=userService.findAll();
		User u1=checkuser(lstUser,users);
		param.put("personcode", u1.getCode());
		param.put("roletypecode", "P02");
		List<IBDS_Dept_SysPersonRole> list02 = deptService.selectRoleListByParam(param);
		if(list02.size()>0) {
			//存在重复记录
			Map<String,String> param2=new HashMap<>();
			param2.put("deptCode", list02.get(0).getSapcode());
			List<DeptData> selectDeptList = deptDataService.selectDeptDataByParam(param2);
			//需要维护的部门的中文名
			String deptName = selectDeptList.get(0).getDeptName();
			return deptName;
		}else {
			return "sorry,新增人员不存在，新增失败!";
		}
		
	}
	
	//获取部门的中文名称(P03使用)
	@RequestMapping(value="/getdeptNameForP03")
	@ResponseBody
	public String getdeptNameForP03(String users){	
		System.out.println(users);
		Map<String,Object> param=new HashMap<>();
		List<User> lstUser=userService.findAll();
		User u1=checkuser(lstUser,users);
		param.put("personcode", u1.getCode());
		param.put("roletypecode", "P03");
		List<IBDS_Dept_SysPersonRole> list03 = deptService.selectRoleListByParam(param);
		if(list03.size()>0) {
			//存在重复记录
			Map<String,String> param2=new HashMap<>();
			param2.put("deptCode", list03.get(0).getSapcode());
			List<DeptData> selectDeptList = deptDataService.selectDeptDataByParam(param2);
			//需要维护的部门的中文名
			String deptName = selectDeptList.get(0).getDeptName();
			return deptName;
		}else {
			return "sorry,新增人员不存在，新增失败!";
		}
		
	}
		
	//是否重新覆盖P02角色
	@RequestMapping(value="/reCoverP02")
	@ResponseBody
	public String reCoverP02(String users,String comboboxValue){	
		try {
			System.out.println(users);
			System.out.println(comboboxValue);
			Map<String,Object> param=new HashMap<>();
			//页面填了不为空的值
			if(!users.equals("")) {
				Subject subject = SecurityUtils.getSubject();
				//当前登录人的域账号
				String user = (String)subject.getSession().getAttribute("UserIdentity");
				//根据当前登录人的域账号获取当前登录人的姓名
				User u= userService.getUserByAccount(user);
				
				IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
				
				List<User> lstUser=userService.findAll();
				User u1=checkuser(lstUser,users);
				
				//获取当前设置人的部门，当前登录人的
				//当前人员的子部门
		  		User current_user = (User) subject.getSession().getAttribute("current_user");
		  		//List<viewDomainGroupMember> lstmember = userService.selectDeptCode(current_user.getCode());
		  		
		  		//当前人员的一级部门code
		  		//List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P01");
		  		//String yiJideptCode=RoleList.get(0).getSapcode();
				//不为空说明不是错误填写，是可以在数据库中查到填写的人员。
				if(u1!=null) {
					//覆盖原来的P02，先删除在增加
					deptService.deleteRoleByPersonCode(u1.getUda10512(), "P02");
					role.setSapcode(comboboxValue);
					role.setRoletypecode("P02");
					role.setPersoncode(u1.getUda10512());
					role.setPersonname(u1.getName());
					role.setCreatorcode(u.getUda10512());
					role.setCreatorname(u.getName());
					role.setCreatetime(new Date());
					deptService.create(role);
					return "ok,新增成功!";
				}else {
					//为空说明是错误填写
					return "sorry,新增人员不存在，新增失败!";
				}
				
			}else {
				//页面没有填值，传过来为空
				return "sorry,新增人员未填写，新增失败!";
			}
			
		}catch(Exception e) {
			return "error";
		}
	}
	
	
	//是否重新覆盖P03角色
	@RequestMapping(value="/reCoverP03")
	@ResponseBody
	public String reCoverP03(String users){	
		try {
			System.out.println(users);
			Map<String,Object> param=new HashMap<>();
			//页面填了不为空的值
				Subject subject = SecurityUtils.getSubject();
				//当前登录人的域账号
				String user = (String)subject.getSession().getAttribute("UserIdentity");
				//根据当前登录人的域账号获取当前登录人的姓名
				User u= userService.getUserByAccount(user);
				IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
				List<User> lstUser=userService.findAll();
				User u1=checkuser(lstUser,users);
				//获取当前设置人的部门，当前登录人的
  	  			//当前人员的子部门
  	  	  		User current_user = (User) subject.getSession().getAttribute("current_user");
  	  	  		List<viewDomainGroupMember> lstmember = userService.selectDeptCode(current_user.getCode());
  	  	  		//当前人员的一级部门code
  	  	  		String yiJideptCode="";
  	  	  		//List<view_DeptWithLevel> firstDeptCodeList = deptService.getFirstDeptCodeByCode(lstmember.get(0).getDeptcode());
  	  	  		List<IBDS_Dept_SysPersonRole> RoleList = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P01");
  	  	  		List<IBDS_Dept_SysPersonRole> RoleList2 = deptService.getRoleListByNameAndP01(lstmember.get(0).getCode(), "P02");
  	  	  		//P01有多个
	  	  	  	if(RoleList.size()>1) {
	  	  	  	return "新增失败,您是多个部门的一级部门秘书，不允许增加工作委托人！";
	  	  	  	}
  	  	  		if(RoleList.size()>0) {
  	  	  			//是p01角色
  	  	  			yiJideptCode=RoleList.get(0).getSapcode();
  	  	  		}else {
  	  	  			//是p02角色
  	  	  			yiJideptCode=RoleList2.get(0).getSapcode();
  	  	  		}
				//覆盖原来的P03，先删除在增加
				deptService.deleteRoleByPersonCode(u1.getUda10512(), "P03");
				role.setSapcode(yiJideptCode);
				role.setRoletypecode("P03");
				role.setPersoncode(u1.getUda10512());
				role.setPersonname(u1.getName());
				role.setCreatorcode(u.getUda10512());
				role.setCreatorname(u.getName());
				role.setCreatetime(new Date());
				deptService.create(role);
				return "ok,新增成功!";
			
		}catch(Exception e) {
			return "error";
		}
	}
		
	/**
	 * 一级部门导入方法
	 * @param file
	 * @param level
	 * @return
	 */
	@RequestMapping(value ="/1/importDept", produces = "text/html;charset=utf-8")
	public ResponseResult importDept(@RequestParam("file") MultipartFile file) {
		try {
			StringBuffer  err= new StringBuffer();
			System.out.println("111"+new Date());
			List<User> lstUser=userService.getAll();
			System.out.println("lstUser"+new Date());
			List<DeptData> lstDept=deptService.getAll();
			System.out.println("lstDept"+new Date());
			List<IBDS_Dept_SysPersonRole> lstPower=deptService.getAllPower();
			System.out.println("lstPower"+new Date());
			String userCode=((User)SecurityUtils.getSubject().getSession().getAttribute("current_user")).getUda10512();
			String fileName = file.getOriginalFilename();
			if(fileName.indexOf("\\")>-1){
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			}
			AbstractExcelReader excelReader = new AbstractExcelReader(file.getInputStream(), fileName);
			
			Row rowTitle =excelReader.firstRow();
			String coaTitle = excelReader.readCellValue(rowTitle.getCell(2));
			if(!"财务编码".equals(coaTitle)) {
				return ResponseResult.fail("导入模板不正确！");
			}
			
			//数据验证处理
			//确认是不是管理员，是的话可以导入
			Boolean checkIsAdmin = UserUtil.checkIsAdmin();
			
			List<IBDS_Dept_MgnRole> list = new ArrayList<>();
			while (excelReader.hasNextRow()){
				IBDS_Dept_MgnRole mgnRole=new IBDS_Dept_MgnRole();
				Row row = excelReader.nextRow();
				
				/*//根据coacode判断是不是1级部门的数据模板，只能导入1级部门的数据
				String coaCode = excelReader.readCellValue(row.getCell(2));
				Map<String,Object> param=new HashMap<>();
				if(!coaCode.equals("")) {
					param.put("coaCode", coaCode);
					List<DeptData> selectDeptDataForLervel = deptDataService.selectDeptDataByParam(param);
					if(selectDeptDataForLervel.size()>0) {
						if(selectDeptDataForLervel.get(0).getDeptLevel().intValue()==1) {
						}else {
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，财务编码不是该一级部门对应的编码，请核对数据！");
							//break;
						}
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，导入模板错误，请核对数据！");
						//break;
						return ResponseResult.fail("导入模板不正确！");
					}
				}else {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，财务编码不能为空，请核对数据！");
					//break;
				}*/
				
				String firstCode = excelReader.readCellValue(row.getCell(0));
				String firstName = excelReader.readCellValue(row.getCell(1));
				if(StringUtils.isBlank(firstCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不能为空，请核对数据！<br/>");
					//break;
				}else {
					Optional<IBDS_Dept_SysPersonRole> tempPower=lstPower.stream().filter(o->o.getSapcode().equals(firstCode)
								&&o.getPersoncode().equals(userCode)).findAny();
					if(checkIsAdmin) {
					}else {
						if(!tempPower.isPresent()) {
							//err.append("第 "+(row.getRowNum()+1)+"行数据，您没有编辑一级编码："+firstCode+" 权限！");
							err.append("第 "+(row.getRowNum()+1)+"行数据，您没有编辑权限！<br/>");
							//break;
						}
					}
					
					if(!checkDept(lstDept,firstCode,firstName)) {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码："+firstCode+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不存在，请核对数据！<br/>");
						break;
					}else {
						mgnRole.setCode(firstCode);
					}
				}
							
				
				String nameEng=excelReader.readCellValue(row.getCell(3));
				if(StringUtils.isBlank(nameEng)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门英文名称不能为空，请核对数据！");
					//break;
					mgnRole.setNameeng("");
				}else {
					mgnRole.setNameeng(nameEng);
				}
				
				String manager=excelReader.readCellValue(row.getCell(6));
				if(StringUtils.isBlank(manager)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管不能为空，请核对数据！");
					//break;
					mgnRole.setManager("");
				}else {
					String mgnUser=checkUserMulti1(lstUser,manager);
					if(StringUtils.isNotBlank(mgnUser)) {
						String[] split =mgnUser.split(",");
						if(split.length>1) {
							//多值的情况
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管："+manager+" 只能为单值，请核对数据！");
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管只能为单值，请核对数据！<br/>");
							//break;
						}else {
							mgnRole.setManager(mgnUser);
						}
						
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管："+manager+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管不存在，请核对数据！<br/>");
						//break;
					}
				}
				
				String secreatary=excelReader.readCellValue(row.getCell(8));
				String secUser="";
				if(StringUtils.isBlank(secreatary)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书不能为空，请核对数据！");
					//break;
					mgnRole.setSecretary("");
				}else {
					secUser=checkUserMulti1(lstUser,secreatary);
					if(StringUtils.isNotBlank(secUser)) {
						mgnRole.setSecretary(secUser);
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书："+secUser+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书不存在，请核对数据！<br/>");
						//break;
					}
				}
				if(StringUtils.isNotBlank(secUser)) {
					//维护用户角色表中一级部门秘书信息,先删除在添加
					User u1=new User();
			    	Subject subject = SecurityUtils.getSubject();
			  		User user = (User) subject.getSession().getAttribute("current_user");
			    	//获取提交人ID信息，在用户角色表中判断用户角色
			    	//List<IBDS_Dept_SysPersonRole> list1=deptService.getRoleListByCode(user.getCode());
			    	//String roletypecode = list1.get(0).getRoletypecode();
			    	int count = deptService.deleteRoleByCode(mgnRole.getCode(),"P01");
			    	//新申请一级部门情况，将COA电子流申请人设置为部门接口人。接口人解决部门白板问题，一级部门秘书信息被维护后，该接口人权限回收。
			    	if(!mgnRole.getSecretary().equals("")) {
			    		int deleteRoleForP04 = deptService.deleteRoleByCode(mgnRole.getCode(),"P04");
			    	}
			    	//Secretary秘书字段例如：chenxiaoyan 00157,likunkun 12328,
			    	//当输入的秘书是多值的时候，循环遍历往用户角色表添加信息
			    	//String sname=secUser;
			    	String[] split = secUser.split(",");
			    	for(String item:split) {
						System.out.println(item);
						Optional<User> temp=lstUser.stream().filter(o->item.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
						if(temp.isPresent()) {
							u1=temp.get();
							
							IBDS_Dept_SysPersonRole role=new IBDS_Dept_SysPersonRole();
					    	role.setSapcode(mgnRole.getCode());
					    	role.setRoletypecode("P01");
							role.setPersoncode(u1.getCode());
							role.setPersonname(u1.getName());
							role.setCreatorcode(user.getCode());
							role.setCreatorname(user.getName());
							role.setCreatetime(new Date());
							deptService.create(role);
						}
			    	}
				}
				String consignor=excelReader.readCellValue(row.getCell(9));
				if(StringUtils.isBlank(consignor)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门委托机要员不能为空，请核对数据！");
					//break;
					mgnRole.setConsignor("");
				}else {
					String consignorUser=checkUserMulti1(lstUser,consignor);
					if(StringUtils.isNotBlank(consignorUser)) {
						mgnRole.setConsignor(consignorUser);
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门委托机要员："+consignor+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门委托机要员不存在，请核对数据！<br/>");
						//break;
					}
				}
				
				 
				String planner=excelReader.readCellValue(row.getCell(10));
				if(StringUtils.isBlank(planner)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员不能为空，请核对数据！");
					//break;
					mgnRole.setDeptplanner("");
				}else {
					String plannerUser=checkUserMulti1(lstUser,planner);
					if(StringUtils.isNotBlank(plannerUser)) {
						String[] splitPlannerUser =plannerUser.split(",");
						if(splitPlannerUser.length>1) {
							//多值的情况
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员："+planner+" 只能为单值，请核对数据！");
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员只能为单值，请核对数据！<br/>");
							//break;
						}else {
							mgnRole.setDeptplanner(plannerUser);
						}
						
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员："+planner+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员不存在，请核对数据！<br/>");
						//break;
					}	
				}				
				
				/*String approver=excelReader.readCellValue(row.getCell(11));
				if(StringUtils.isBlank(approver)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门审批人员不能为空，请核对数据！");
					break;
				}else {
					String approverUser=checkUserMulti1(lstUser,approver);
					if(StringUtils.isNotBlank(approverUser)) {
						mgnRole.setApprover(approverUser);
					}else {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门审批人员："+approver+" 不存在，请核对数据！");
						break;
					}
				}*/
				
				String abbreviation=excelReader.readCellValue(row.getCell(11));
				if(StringUtils.isBlank(abbreviation)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门简称不能为空，请核对数据！");
					//break;
					mgnRole.setAbbreviation("");
				}else {
					String regEx="^([\\u4e00-\\u9fa5]{2,5}|[A-Za-z0-9-&]{2,20})$";
					Pattern p=Pattern.compile(regEx);
					Matcher m=p.matcher(abbreviation);
					if(!m.matches()) {
						System.out.println("含有特殊字符");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门简称格式有误，请核对数据！正确格式：英文2-20位，同时支持'-'英文符号的输入或中文2-5位！<br/>");
						//break;
					}else {
						System.out.println("没有特殊字符");
						mgnRole.setAbbreviation(abbreviation);
					}
				}
					
				String planapprover=excelReader.readCellValue(row.getCell(12));
				if(StringUtils.isBlank(planapprover)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，计划处审批人员不能为空，请核对数据！");
					//break;
					mgnRole.setPlanapprover("");
				}else {
					String planapproverUser=checkUserMulti1(lstUser,planapprover);
					if(StringUtils.isNotBlank(planapproverUser)) {
						String[] splitPlanapproverUser =planapproverUser.split(",");
						if(splitPlanapproverUser.length>1) {
							//多值的情况
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，计划处审批人员："+planapprover+" 只能为单值，请核对数据！");
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，计划处审批人员只能为单值，请核对数据！<br/>");
							//break;
						}else {
							mgnRole.setPlanapprover(planapproverUser);
						}
						
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，计划处审批人员："+planapprover+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，计划处审批人员不存在，请核对数据！<br/>");
						//break;
					}
				}
				
				String pr=excelReader.readCellValue(row.getCell(13));
				if(StringUtils.isBlank(pr)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，PR录入员不能为空，请核对数据！");
					//break;
					mgnRole.setPr("");
				}else {
					String prUser=checkUserMulti1(lstUser,pr);
					if(StringUtils.isNotBlank(prUser)) {
						String[] splitPrUser =prUser.split(",");
						if(splitPrUser.length>1) {
							//多值的情况
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，PR录入员："+pr+" 只能为单值，请核对数据！");
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，PR录入员只能为单值，请核对数据！<br/>");
							//break;
						}else {
							mgnRole.setPr(prUser);
						}
						
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，PR录入员："+pr+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，PR录入员不存在，请核对数据！<br/>");
						//break;
					}
				}
				
				list.add(mgnRole);
			}
			//保存数据
			if(StringUtils.isNotBlank(err.toString())) {
				return ResponseResult.fail(null,err.toString());
			}else {
				//存储数据，更新表
				List<IBDS_Dept_MgnRole> mgnRolelistByDeleteflag = deptService.getMgnRoleListByDeleteflag("0");
				
				deptService.uploadMgnRole(list,mgnRolelistByDeleteflag);
				
				//deptService.uploadMgnRole(list);
			}
			System.out.println("333"+new Date());
			return ResponseResult.success("部门导入成功");
		}catch (FlowableException e){
			return ResponseResult.fail(e.getMessage());
		}catch (Exception e){			
			return ResponseResult.fail("部门导入失败");
		}
	}
	
	
	/**
	 * 四级部门导入方法
	 * @param file
	 * @param level
	 * @return
	 */
	@RequestMapping(value ="/4/importDept", produces = "text/html;charset=utf-8")
	public ResponseResult importDeptFour(@RequestParam("file") MultipartFile file) {
		try {
			StringBuffer  err= new StringBuffer();
			List<User> lstUser=userService.getAll();
			//List<IBDS_Dept_MgnRole> lstMgn=deptMgnRoleService.getAll();
			List<DeptData> lstDept=deptService.getAll();
			List<IBDS_Dept_SysPersonRole> lstPower=deptService.getAllPower();
			String userCode=((User)SecurityUtils.getSubject().getSession().getAttribute("current_user")).getUda10512();
			String fileName = file.getOriginalFilename();
			if(fileName.indexOf("\\")>-1){
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			}
			AbstractExcelReader excelReader = new AbstractExcelReader(file.getInputStream(), fileName);
			
			Row rowTitle =excelReader.firstRow();
			String coaTitle = excelReader.readCellValue(rowTitle.getCell(8));
			if(!"财务编码".equals(coaTitle)) {
				return ResponseResult.fail("导入模板不正确！");
			}
			
			//数据验证处理
			//确认是不是管理员，是的话可以导入
			Boolean checkIsAdmin = UserUtil.checkIsAdmin();
			
			List<IBDS_Dept_MgnRole> list = new ArrayList<>();
			while (excelReader.hasNextRow()){
				IBDS_Dept_MgnRole mgnRole=new IBDS_Dept_MgnRole();
				Row row = excelReader.nextRow();
				
				/*//根据coacode判断是不是1级部门的数据模板，只能导入1级部门的数据
				String coaCode = excelReader.readCellValue(row.getCell(8));
				Map<String,Object> param=new HashMap<>();
				if(!coaCode.equals("")) {
					param.put("coaCode", coaCode);
					List<DeptData> selectDeptDataForLervel = deptDataService.selectDeptDataByParam(param);
					boolean flag4=false;
					if(selectDeptDataForLervel.size()>0) {
						for (int i = 0; i < selectDeptDataForLervel.size(); i++) {
							if(selectDeptDataForLervel.get(i).getDeptLevel().intValue()==4) {
								flag4=true;
							}
						}
						if(flag4) {
						}else {
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，财务编码不是该四级部门对应的编码，请核对数据！");
							//break;
						}
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，导入模板错误，请核对数据！");
						//break;
						return ResponseResult.fail("导入模板不正确！");
					}
				}else {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，财务编码不能为空，请核对数据！");
					//break;
				}*/
				
				String firstCode = excelReader.readCellValue(row.getCell(0));
				String firstName = excelReader.readCellValue(row.getCell(1));
				if(StringUtils.isBlank(firstCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不能为空，请核对数据！<br/>");
					//break;
				}else {
					Optional<IBDS_Dept_SysPersonRole> tempPower=lstPower.stream().filter(o->o.getSapcode().equals(firstCode)
							&&o.getPersoncode().equals(userCode)).findAny();
					if(checkIsAdmin) {
					}else {
						if(!tempPower.isPresent()) {
							//err.append("第 "+(row.getRowNum()+1)+"行数据，您没有编辑一级编码："+firstCode+" 权限！");
							err.append("第 "+(row.getRowNum()+1)+"行数据，您没有编辑权限！<br/>");
							//break;
						}
					}
					
					if(!checkDept(lstDept,firstCode,firstName)) {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码："+firstCode+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不存在，请核对数据！<br/>");
						//break;
					}
				}
				
				String secondCode = excelReader.readCellValue(row.getCell(2));
				String secondName = excelReader.readCellValue(row.getCell(3));
				if(StringUtils.isBlank(secondCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，二级编码不能为空，请核对数据！<br/>");
					//break;
				}else {
					if(!checkDeptLevel(lstDept, secondCode, firstCode)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，当前一级部门下未找到此二级部门编码，请核对数据！<br/>");
						//break;
					}
					if(!checkDept(lstDept,secondCode,secondName)) {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，二级编码："+secondCode+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，二级编码不存在，请核对数据！<br/>");
						//break;
					}
				}	
				
				String thirdCode = excelReader.readCellValue(row.getCell(4));
				String thirdName = excelReader.readCellValue(row.getCell(5));
				if(StringUtils.isBlank(thirdCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，三级编码不能为空，请核对数据！<br/>");
					//break;
				}else {
					if(!checkDeptLevel(lstDept, thirdCode, secondCode)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，当前二级部门下未找到此三级部门编码，请核对数据！<br/>");
						//break;
					}
					if(!checkDept(lstDept,thirdCode,thirdName)) {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，三级编码："+thirdCode+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，三级编码不存在，请核对数据！<br/>");
						//break;
					}
				}	
				
				String fourthCode = excelReader.readCellValue(row.getCell(6));
				String fourthName = excelReader.readCellValue(row.getCell(7));
				if(StringUtils.isBlank(fourthCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，四级编码不能为空，请核对数据！<br/>");
					//break;
				}else {
					if(!checkDeptLevel(lstDept, fourthCode, thirdCode)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，当前三级部门下未找到此四级部门编码，请核对数据！<br/>");
						//break;
					}
					if(!checkDept(lstDept,fourthCode,fourthName)) {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，四级编码："+fourthCode+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，四级编码不存在，请核对数据！<br/>");
						//break;
					}else {
						mgnRole.setCode(fourthCode);
						mgnRole.setAbbreviation(fourthName);
					}
				}
				
				String nameEng=excelReader.readCellValue(row.getCell(9));
				if(StringUtils.isBlank(nameEng)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门英文名称不能为空，请核对数据！");
					//break;
					mgnRole.setNameeng("");
				}else {
					mgnRole.setNameeng(nameEng);
				}
				
				String manager=excelReader.readCellValue(row.getCell(12));
				if(StringUtils.isBlank(manager)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管不能为空，请核对数据！");
					//break;
					mgnRole.setManager("");
				}else {
					String mgnUser=checkUserMulti1(lstUser,manager);
					if(StringUtils.isNotBlank(mgnUser)) {
						String[] split =mgnUser.split(",");
						if(split.length>1) {
							//多值的情况
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管："+manager+" 只能为单值，请核对数据！");
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管只能为单值，请核对数据！<br/>");
							//break;
						}else {
							mgnRole.setManager(mgnUser);
						}
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管："+manager+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管不存在，请核对数据！<br/>");
						//break;
					}
				}
				
				String secreatary=excelReader.readCellValue(row.getCell(14));
				String secUser="";
				if(StringUtils.isBlank(secreatary)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书不能为空，请核对数据！");
					//break;
					mgnRole.setSecretary("");
				}else {
					secUser=checkUserMulti1(lstUser,secreatary);
					if(StringUtils.isNotBlank(secUser)) {
						mgnRole.setSecretary(secUser);
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书："+secUser+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书不存在，请核对数据！<br/>");
						//break;
					}
				}
				 
				String planner=excelReader.readCellValue(row.getCell(15));
				if(StringUtils.isBlank(planner)) {
					//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员不能为空，请核对数据！");
					//break;
					mgnRole.setDeptplanner("");
				}else {
					String plannerUser=checkUserMulti1(lstUser,planner);
					if(StringUtils.isNotBlank(plannerUser)) {
						String[] splitPlannerUser =plannerUser.split(",");
						if(splitPlannerUser.length>1) {
							//多值的情况
							//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员："+planner+" 只能为单值，请核对数据！");
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员只能为单值，请核对数据！<br/>");
							//break;
						}else {
							mgnRole.setDeptplanner(plannerUser);
						}
						
						
					}else {
						//err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员："+planner+" 不存在，请核对数据！");
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员不存在，请核对数据！<br/>");
						//break;
					}	
				}				
				
				/*String approver=excelReader.readCellValue(row.getCell(16));
				if(StringUtils.isBlank(approver)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门审批人员不能为空，请核对数据！");
					break;
				}else {
					String approverUser=checkUserMulti1(lstUser,approver);
					if(StringUtils.isNotBlank(approverUser)) {
						mgnRole.setApprover(approverUser);
					}else {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门审批人员："+approver+" 不存在，请核对数据！");
						break;
					}
				}*/
				
				list.add(mgnRole);
			}
			//保存数据
			if(StringUtils.isNotBlank(err.toString())) {
				return ResponseResult.fail(null,err.toString());
			}else {
				//存储数据，更新表
				List<IBDS_Dept_MgnRole> mgnRolelistByDeleteflag = deptService.getMgnRoleListByDeleteflag("0");
				
				deptService.uploadMgnRole(list,mgnRolelistByDeleteflag);
			}
			return ResponseResult.success("部门导入成功");
		}catch (FlowableException e){
			return ResponseResult.fail(e.getMessage());
		}catch (Exception e){
			return ResponseResult.fail("部门导入失败");
		}
	}
	
	//验证部门是否存在
	private Boolean checkDept(List<DeptData> lstDept,String code, String name) {
		Optional<DeptData> temp=lstDept.stream().filter(o->code.equals(o.getDeptCode())).findAny();
		if(temp.isPresent()) {
			return true;
		}
		return false;
	}
	
	private Boolean checkDeptLevel(List<DeptData> lstDept,String code, String parentCode) {
		Optional<DeptData> temp=lstDept.stream().filter(o->code.equals(o.getDeptCode())&&parentCode.equals(o.getSupDeptCode())).findAny();
		if(temp.isPresent()) {
			return true;
		}
		return false;
	}
	
	//检查用户是否存在
	private User checkuser(List<User> lst,String code) {
		Optional<User> temp=lst.stream().filter(o->code.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
		if(temp.isPresent()) {
			return temp.get();
		}
		return null;
	}
	
	private String checkUserMulti(List<User> lst,String codeCollect) {
		List<String> lstUser=new ArrayList<>();
		for(String code:codeCollect.split(",")) {
			if(StringUtils.isBlank(code)) continue;
			Optional<User> temp=lst.stream().filter(o->code.equals(o.getUda10512())).findFirst();
			if(temp.isPresent()) {
				User user=temp.get();
				lstUser.add(user.getUda10509()+" "+user.getUda10512());
			}else {
				lstUser.clear();
			}		
		}
		return String.join(",",lstUser);
	}
	
	//检查是不是姓名+ 工号的形式
	private String checkUserMulti1(List<User> lst,String codeCollect) {
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
