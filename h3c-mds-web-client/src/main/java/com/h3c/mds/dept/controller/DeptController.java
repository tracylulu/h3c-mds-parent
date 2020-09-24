package com.h3c.mds.dept.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.StringBuilders;
import org.apache.poi.ss.usermodel.Row;
import org.apache.shiro.SecurityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.h3c.mds.utils.HttpClientUtil;
import com.h3c.mds.utils.easyui.EasyUIJSONUtils;
import com.h3c.mds.utils.excel.ExportExcelWrapper;
import com.h3c.mds.dept.entity.DeptData;
import com.h3c.mds.dept.entity.IBDS_Dept_MgnRole;
import com.h3c.mds.dept.entity.IBDS_Dept_SysPersonRole;
import com.h3c.mds.dept.entity.view_DeptWithLevel;
import com.h3c.mds.dept.service.DeptDataService;
import com.h3c.mds.dept.service.DeptMgnRoleService;
import com.h3c.mds.dept.service.DeptService;
import com.h3c.mds.flowable.excel.AbstractExcelReader;
import com.h3c.mds.flowable.exception.FlowableException;
import com.h3c.mds.sysmgr.UserUtil;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.response.ResponseResult;
import com.h3c.mds.sysmgr.service.UserService;


@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	@Autowired
	private DeptMgnRoleService deptMgnRoleService;
	@Autowired
	private UserService userService;
	@Autowired
	private DeptDataService deptDataService;
	
	/**
	 * 返回列表页面
	 * @param level
	 * @return
	 */
	@RequestMapping("/list/{level}")
	@ResponseBody
	public ModelAndView getDeptList(@PathVariable("level")Integer level) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("level", level);	
		mv.addObject("title",level.equals(2)?"二级部门信息":"三级部门信息");
		mv.addObject("isImport", checkImportPermiss());
		mv.setViewName("dept/SecondDept/list");
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
	@RequestMapping("/listData/{level}")
	@ResponseBody
	public String Treedata(@PathVariable("level")Integer level,Integer currentlevel,String id, String searchStr) {
		currentlevel=currentlevel==null?0:currentlevel;
		Map<String,Object> param=new HashMap<>();
		param.put("id", id);
		param.put("level", level);
		param.put("searchParam", searchStr);
		param.put("isEnd", level.equals(currentlevel+1)?1:0);
		List<view_DeptWithLevel> lst=deptService.getList(param);
		return !level.equals(currentlevel+1) ? EasyUIJSONUtils.list2EasyUiTreeGrid_close(lst)
				: EasyUIJSONUtils.list2EasyUiTreeGrid_open(lst);
	}
	
	/**
	 * 校验导入按钮权限，管理员有权限 
	 * @return
	 */
	private boolean checkImportPermiss() {
		if(UserUtil.checkIsAdmin()) {
			return true;
		}
		String code = ((User) SecurityUtils.getSubject().getSession().getAttribute("current_user")).getUda10512();
		List<IBDS_Dept_SysPersonRole> lst = deptService.getRoleListByCode(code);

		return lst != null && lst.size() > 0 ? true : false;
	}
	
	/**
	 * 
	 * @param level 层级
	 * @param code 修改的部门编码
	 * @param firstLevel 修改的部门一级编码（权限验证用）
	 * @return
	 */
	@RequestMapping("/edit/{level}/{code}")
	@ResponseBody
	public ModelAndView edit(@PathVariable("level")Integer level,@PathVariable("code")String code,String firstCode,String pid) {
		ModelAndView mv=new ModelAndView();
		String userCode=((User)SecurityUtils.getSubject().getSession().getAttribute("current_user")).getUda10512();
		boolean isEdit=deptService.checkPower(firstCode, userCode);
		mv.addObject("isEdit", UserUtil.checkIsAdmin()?true:isEdit);
		mv.addObject("id_suffix", new Date().getTime());
		mv.addObject("level", level);	
		mv.addObject("title", level.equals(2)?"二级部门信息":"三级部门信息");	
		mv.addObject("code", code);	
		mv.addObject("firstCode", firstCode);
		mv.addObject("pid",pid);
		mv.setViewName("dept/SecondDept/edit");
		
		return mv;
	}
	
	/**
	 * 根据编码获取数据
	 * @param code 部门编码
	 * @return
	 */
	@RequestMapping(value="/getByCode/{code}")	
	public ResponseResult getDeptByCode(@PathVariable("code")String code) {
		return ResponseResult.success(deptService.getByCode(code));
	}
	
	@RequestMapping(value="/save", produces = "text/html;charset=utf-8")	
	public ResponseResult editData(IBDS_Dept_MgnRole dept) {
		try {		
			deptService.edit(dept);
			return ResponseResult.success("ok");
		}catch(Exception e) {
			return ResponseResult.fail(e.getMessage());
		}		
	}
	
	/**
	 * 根据姓名+空格+工号获取名称  多个用逗号分隔
	 * @param pCode
	 * @param lst
	 * @return
	 */
	private String getUserName(String pCode,List<User> lst) {
		List<String> lstName=new ArrayList<>();
		for(String code:pCode.split(",")) {
			if(StringUtils.isBlank(code))continue;
			Optional<User> temp=lst.stream().filter(o->code.equals(o.getUda10509()+" "+o.getUda10512())).findFirst();
			if(temp.isPresent()) {
				lstName.add(temp.get().getName());
			}
		}
		
		return String.join(",", lstName);
	}
	
	/**
	 * 导出
	 * @param level 导出部门层级（1-4）
	 * @param searchStr 查询条件
	 * @param response
	 */
	@RequestMapping("/export")
	public void export(Integer level, String searchStr,HttpServletResponse response) {
		
		String[] header = new String[] { "一级部门编码", "一级部门名称", "二级部门编码", "二级部门名称",
				"三级部门编码", "三级部门名称","四级部门编码", "四级部门名称",
				"财务编码", "部门英文名称", "部门性质", "主管姓名", "主管ID",
				"部门秘书","秘书ID", "部门委托机要员", "部门计划员" };
		String[] column = new String[] { "Firstcode", "Firstname", "Secondcode", "Secondname",
				"Thirdcode", "Thirdname","Fourthcode", "Fourthname",
				"Coacode",	"Nameeng", "Nature", "Managername", "Manager", 
				"Secretaryname","Secretary","Consignor","Deptplanner" };
		Map<String, Object> param = new HashMap<>();
		param.put("level", level);
		param.put("searchParam", searchStr);
		
		if (level.equals(1)) {
			List<String> lstHeader = Arrays.asList(header);
			List<String> lsth = new ArrayList<>(lstHeader);
			lsth.remove("二级部门编码");
			lsth.remove("二级部门名称");
			lsth.remove("三级部门编码");
			lsth.remove("三级部门名称");
			lsth.remove("四级部门编码");
			lsth.remove("四级部门名称");
			
			//add by chenlulu 
			lsth.add("部门简称");
			lsth.add("计划处审批人员");
			lsth.add("PR录入员");
			
			header = (String[]) lsth.toArray(new String[lsth.size()]);
			List<String> lstcolumn = Arrays.asList(column);
			List lstc = new ArrayList(lstcolumn);
			lstc.remove("Secondcode");
			lstc.remove("Secondname");
			lstc.remove("Thirdcode");
			lstc.remove("Thirdname");
			lstc.remove("Fourthcode");
			lstc.remove("Fourthname");
			
			//add by chenlulu 
			lstc.add("Abbreviation");
			lstc.add("Planapprover");
			lstc.add("Pr");
			
			column = (String[]) lstc.toArray(new String[lstc.size()]);
		}
		if (level.equals(2)) {
			List<String> lstHeader = Arrays.asList(header);
			List<String> lsth = new ArrayList<>(lstHeader);
			lsth.remove("三级部门编码");
			lsth.remove("三级部门名称");
			lsth.remove("四级部门编码");
			lsth.remove("四级部门名称");
			lsth.remove("部门委托机要员");
			header = (String[]) lsth.toArray(new String[lsth.size()]);
			List<String> lstcolumn = Arrays.asList(column);
			List lstc = new ArrayList(lstcolumn);
			lstc.remove("Thirdcode");
			lstc.remove("Thirdname");
			lstc.remove("Fourthcode");
			lstc.remove("Fourthname");
			lstc.remove("Consignor");
			column = (String[]) lstc.toArray(new String[lstc.size()]);
		}

		if (level.equals(3)) {
			List<String> lstHeader = Arrays.asList(header);
			List<String> lsth = new ArrayList<>(lstHeader);

			lsth.remove("四级部门编码");
			lsth.remove("四级部门名称");
			lsth.remove("部门委托机要员");
			header = (String[]) lsth.toArray(new String[lsth.size()]);
			List<String> lstcolumn = Arrays.asList(column);
			List lstc = new ArrayList(lstcolumn);

			lstc.remove("Fourthcode");
			lstc.remove("Fourthname");
			lstc.remove("Consignor");
			column = (String[]) lstc.toArray(new String[lstc.size()]);
		}
		if (level.equals(4)) {
			List<String> lstHeader = Arrays.asList(header);
			List<String> lsth = new ArrayList<>(lstHeader);

			lsth.remove("部门委托机要员");
			header = (String[]) lsth.toArray(new String[lsth.size()]);
			List<String> lstcolumn = Arrays.asList(column);
			List lstc = new ArrayList(lstcolumn);

			lstc.remove("Consignor");
			column = (String[]) lstc.toArray(new String[lstc.size()]);
		}
		
		try {
			List<view_DeptWithLevel> lst = deptService.getExportList(param);
			ExportExcelWrapper<view_DeptWithLevel> excelWrapper = new ExportExcelWrapper<view_DeptWithLevel>();

			excelWrapper.exportExcel("部门编码导出", "部门编码导出", header, column, lst, response, "2007");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 导入方法
	 * @param file
	 * @param level
	 * @return
	 */
	@RequestMapping(value ="/2/importDept", produces = "text/html;charset=utf-8")
	public ResponseResult importDept(@RequestParam("file") MultipartFile file) {
		try {
			StringBuffer  err= new StringBuffer();
			List<User> lstUser=userService.getAll();
			List<DeptData> lstDept=deptService.getAll();
			List<IBDS_Dept_SysPersonRole> lstPower=deptService.getAllPower();
			String userCode=((User)SecurityUtils.getSubject().getSession().getAttribute("current_user")).getUda10512();
			String fileName = file.getOriginalFilename();
			if(fileName.indexOf("\\")>-1){
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			}
			AbstractExcelReader excelReader = new AbstractExcelReader(file.getInputStream(), fileName);
			
			Row rowTitle =excelReader.firstRow();
			String coaTitle = excelReader.readCellValue(rowTitle.getCell(4));
			if(!"财务编码".equals(coaTitle)) {
				return ResponseResult.fail("导入模板不正确！");
			}
			
			//数据验证处理
			List<IBDS_Dept_MgnRole> list = new ArrayList<>();
			while (excelReader.hasNextRow()){
				IBDS_Dept_MgnRole mgnRole=new IBDS_Dept_MgnRole();
				Row row = excelReader.nextRow();
				String firstCode = excelReader.readCellValue(row.getCell(0));
				String firstName = excelReader.readCellValue(row.getCell(1));
				if(StringUtils.isBlank(firstCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不能为空，请核对数据！<br/>");
				}else {
					Optional<IBDS_Dept_SysPersonRole> tempPower=lstPower.stream().filter(o->o.getSapcode().equals(firstCode)
								&&o.getPersoncode().equals(userCode)).findAny();
					if(!tempPower.isPresent()&&!UserUtil.checkIsAdmin()) {
						err.append("第 "+(row.getRowNum()+1)+"行数据，您没有编辑权限！<br/>");
					}
					if(!checkDept(lstDept,firstCode,firstName)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不存在，请核对数据！<br/>");
					}
				}
				
				String secondCode = excelReader.readCellValue(row.getCell(2));
				String secondName = excelReader.readCellValue(row.getCell(3));
				if(StringUtils.isBlank(secondCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，二级编码不能为空，请核对数据！<br/>");
				}else {
					if(!checkDeptLevel(lstDept, secondCode, firstCode)){
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，当前一级部门下未找到此二级部门编码，请核对数据！<br/>");
					}
					if(!checkDept(lstDept,secondCode,secondName)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，二级编码 不存在，请核对数据！<br/>");
					}else {
						mgnRole.setCode(secondCode);
					}
				}			
	
				String manager=excelReader.readCellValue(row.getCell(8));
				if(StringUtils.isNotBlank(manager)) {
					if(manager.indexOf(",")!=-1) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管只能为单值，请核对数据！<br/>");						
					}else {
						User mgnUser=checkuser(lstUser,manager);
						if(mgnUser!=null) {
							mgnRole.setManager(mgnUser.getUda10509()+" "+mgnUser.getUda10512());
						}else {
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管不存在，请核对数据！<br/>");
						}
					}					
				}else {
					mgnRole.setManager("");
				}
				
				String secreatary=excelReader.readCellValue(row.getCell(10));
				if(StringUtils.isNotBlank(secreatary)) {
					String secUser=checkUserMulti(lstUser,secreatary);
					if(StringUtils.isNotBlank(secUser)) {
						mgnRole.setSecretary(secUser);
					}else {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书不存在，请核对数据！<br/>");
					}
				}else {
					mgnRole.setSecretary("");
				}								
				
				String consignor=excelReader.readCellValue(row.getCell(11));
				if(StringUtils.isNotBlank(consignor)) {
					String consignorUser=checkUserMulti(lstUser,consignor);
					if(StringUtils.isNotBlank(consignorUser)) {
						mgnRole.setConsignor(consignorUser);
					}else {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门委托机要员不存在，请核对数据！<br/>");
					}
				}else {
					mgnRole.setConsignor("");
				}				
				 
				String planner=excelReader.readCellValue(row.getCell(11));
				if(StringUtils.isNotBlank(planner)) {
					if(planner.indexOf(",")!=-1) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员只能为单值，请核对数据！<br/>");						
					}else {
						User plannerUser=checkuser(lstUser,planner);
						if(plannerUser!=null) {
							mgnRole.setDeptplanner(plannerUser.getUda10509()+" "+plannerUser.getUda10512());
						}else {
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员不存在，请核对数据！<br/>");
						}
					}
				}else {
					mgnRole.setDeptplanner("");
				}			
				
				list.add(mgnRole);
			}
			//保存数据
			if(StringUtils.isNotBlank(err.toString())) {
				return ResponseResult.fail(null,err.toString());
			}else {
				//存储数据，更新表
				deptMgnRoleService.eidtMulti(list);
			}
			return ResponseResult.success("部门导入成功");
		}catch (FlowableException e){
			return ResponseResult.fail(e.getMessage());
		}catch (Exception e){			
			return ResponseResult.fail("部门导入失败");
		}
	}
	
	/**
	 * 导入方法
	 * @param file
	 * @param level
	 * @return
	 */
	@RequestMapping(value ="/3/importDept", produces = "text/html;charset=utf-8")
	public ResponseResult importDeptThird(@RequestParam("file") MultipartFile file) {
		try {
			StringBuffer  err= new StringBuffer();
			List<User> lstUser=userService.getAll();
			List<DeptData> lstDept=deptService.getAll();
			List<IBDS_Dept_SysPersonRole> lstPower=deptService.getAllPower();
			String userCode=((User)SecurityUtils.getSubject().getSession().getAttribute("current_user")).getUda10512();
			String fileName = file.getOriginalFilename();
			if(fileName.indexOf("\\")>-1){
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			}
			AbstractExcelReader excelReader = new AbstractExcelReader(file.getInputStream(), fileName);
			
			Row rowTitle =excelReader.firstRow();
			String coaTitle = excelReader.readCellValue(rowTitle.getCell(6));
			if(!"财务编码".equals(coaTitle)) {
				return ResponseResult.fail("导入模板不正确！");
			}
			
			//数据验证处理
			List<IBDS_Dept_MgnRole> list = new ArrayList<>();
			while (excelReader.hasNextRow()){
				IBDS_Dept_MgnRole mgnRole=new IBDS_Dept_MgnRole();
				Row row = excelReader.nextRow();
				String firstCode = excelReader.readCellValue(row.getCell(0));
				String firstName = excelReader.readCellValue(row.getCell(1));
				if(StringUtils.isBlank(firstCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不能为空，请核对数据！<br/>");
				}else {
					Optional<IBDS_Dept_SysPersonRole> tempPower=lstPower.stream()
							.filter(o->o.getSapcode().equals(firstCode)
									&&o.getPersoncode().equals(userCode)).findAny(); 
					if(!tempPower.isPresent()&&!UserUtil.checkIsAdmin()) {						
					    err.append("第 "+(row.getRowNum()+1)+"行数据，您没有编辑权限！<br/>"); 
					}
					 
					if(!checkDept(lstDept,firstCode,firstName)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，一级编码不存在，请核对数据！<br/>");
					}
				}
				
				String secondCode = excelReader.readCellValue(row.getCell(2));
				String secondName = excelReader.readCellValue(row.getCell(3));
				if(StringUtils.isBlank(secondCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，二级编码不能为空，请核对数据！<br/>");
				}else {
					if(!checkDeptLevel(lstDept, secondCode, firstCode)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，当前一级部门下未找到此二级部门编码，请核对数据！<br/>");
					}
					if(!checkDept(lstDept,secondCode,secondName)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，二级编码不存在，请核对数据！<br/>");
					}
				}	
				
				String thirdCode = excelReader.readCellValue(row.getCell(4));
				String thirdName = excelReader.readCellValue(row.getCell(5));
				if(StringUtils.isBlank(secondCode)) {
					err.append("第 "+(row.getRowNum()+1)+"行数据有误，三级编码不能为空，请核对数据！<br/>");
				}else {
					if(!checkDeptLevel(lstDept, thirdCode, secondCode)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，当前二级部门下未找到此三级部门编码，请核对数据！<br/>");
					}
					if(!checkDept(lstDept,thirdCode,thirdName)) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，三级编码不存在，请核对数据！<br/>");
					}else {
						mgnRole.setCode(thirdCode);
					}
				}				
							
				String manager=excelReader.readCellValue(row.getCell(10));
				if(StringUtils.isNotBlank(manager)) {
					if(manager.indexOf(",")!=-1) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管只能为单值，请核对数据！<br/>");						
					}else {
						User mgnUser=checkuser(lstUser,manager);
						if(mgnUser!=null) {
							mgnRole.setManager(mgnUser.getUda10509()+" "+mgnUser.getUda10512());
						}else {
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门主管不存在，请核对数据！<br/>");
						}
					}	
				}else {
					mgnRole.setManager("");
				}
				 
				String secreatary=excelReader.readCellValue(row.getCell(12));
				if(StringUtils.isNotBlank(secreatary)) {
					String secUser=checkUserMulti(lstUser,secreatary);
					if(StringUtils.isNotBlank(secUser)) {
						mgnRole.setSecretary(secUser);
					}else {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门秘书不存在，请核对数据！<br/>");
					}					
				}else {
					mgnRole.setSecretary("");
				}								
				 
				String planner=excelReader.readCellValue(row.getCell(13));
				if(StringUtils.isNotBlank(planner)) {					
					if(planner.indexOf(",")!=-1) {
						err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员只能为单值，请核对数据！<br/>");						
					}else {
						User plannerUser=checkuser(lstUser,planner);
						if(plannerUser!=null) {
							mgnRole.setDeptplanner(plannerUser.getUda10509()+" "+plannerUser.getUda10512());
						}else {
							err.append("第 "+(row.getRowNum()+1)+"行数据有误，部门计划员不存在，请核对数据！<br/>");
						}
					}
				}else {
					mgnRole.setDeptplanner("");
				}				
				
				list.add(mgnRole);
			}
			//保存数据
			if(StringUtils.isNotBlank(err.toString())) {
				return ResponseResult.fail(null,err.toString());
			}else {
				//存储数据，更新表
				deptMgnRoleService.eidtMulti(list);
			}
			return ResponseResult.success("部门导入成功");
		}catch (FlowableException e){
			return ResponseResult.fail(e.getMessage());
		}catch (Exception e){
			return ResponseResult.fail("部门导入失败");
		}
	}
	
	/**
	 * 验证部门是否存在
	 * @param lstDept
	 * @param code
	 * @param name
	 * @return
	 */
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
	
	//测试接口
		@RequestMapping("/eos/data")
		public void test() {
			String eosAPI_loginUrl ="http://api.eos.h3c.com/user/v1.0/account/token";
			String deptAPI_httpUrl ="http://api.eos.h3c.com/orgbaseinfo/v1.0/views/ibds_depts";
			String eosAPI_account ="ibds";
			String eosAPI_password ="A3ws4gctpA4ML4rD";
			System.out.println("DeptQuartzJobBean job start");
			String deptData =null;
			try {
//				1.调用中台接口，获取token
//				2.拿token 调用组织架构数据接口
				deptData = new HttpClientUtil().getDataPost(eosAPI_loginUrl,eosAPI_account,eosAPI_password, deptAPI_httpUrl);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			3.如果架构数据非空，调用server 更新组织架构数据（一个事务），清表、全量同步数据
			if(deptData!=null && deptData.length()!=0) {
				
				JSONObject result=new JSONObject(deptData) ;
				int code = Integer.parseInt(result.get("code").toString());
				if(code==20216) {
					List<Map> deptDataList = (List<Map>)result.toMap().get("data");
					deptDataService.renewDeptDataTemp(deptDataList);
					System.out.println("部门组织架构临时表已更新");
					deptDataService.renewDeptData();
					System.out.println("部门组织架构数据表已更新");
				}
				else {
					System.out.println("接口："+deptAPI_httpUrl+"连接失败");
				}
//				JSONArray datas = new JSONArray(result.get("data").toString());
//				
//				for (Object object : datas) {
//					JSONObject obj = (JSONObject) object;
//					System.out.println("no. ===   " + obj.toMap());
//				}
			}
			else {
				System.out.println("接口：:"+deptAPI_httpUrl+"异常，无数据");	
			}
//			4.更新部门角色信息表（新增的部门，对表中数据进行初始化）
			deptDataService.insertDeptMgn();
//		    5.新增一级部门情况，发送邮件给接口人（应该从视图中获取部门接口人非空的情况）
			System.out.println("DeptQuartzJobBean job end");
//			Map m=new HashMap();
//			m.put("deptCode", "50040001");
////			m.put("deptLevel", 1);
//			System.out.println(deptDataService.selectDeptDataByParam(m).toString());

		}


}
