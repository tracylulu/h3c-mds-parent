<%@page import="java.lang.reflect.Field"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld"%>
<%
	String obj_fields = "";
	Object obj = request.getAttribute("apply");
	if (obj != null) {
		Class clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			obj_fields += field.getName() + ",";
		}
		pageContext.setAttribute("obj_fields", obj_fields);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VR产品新增</title>
</head>
<style>
.aFont {
	color: #FFF !important;
}

.textBoxFrom .textbox {
	margin: 20px 0px !important;
}
</style>

<body>
<jsp:include page="/WEB-INF/jsp/ueditor/easyui-ueditor.jsp">
	<jsp:param name="module" value="vrApply"/>
	<jsp:param name="field" value="fileId"/>
</jsp:include>
<div class="VrClass" id="VrClass${id_suffix}">
	<div>
		<div class="toptoolbar" style="position: fixed;;z-index:9000">
			<c:if test="${currentNode=='userTask1' && isHandler || isEdit == 'editable'}">
				<a href="#" id="btnSave${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存</a>
				<!-- ,disabled:true -->
			</c:if>
			<a href="#" id="btnFold${id_suffix}" class="easyui-linkbutton" plain="true" onclick="tabFlodOrOpen${id_suffix}(false)" data-options="iconCls:'fa fa-minus'">折叠</a>
			<a href="#" id="btnOpen${id_suffix}" class="easyui-linkbutton" plain="true" onclick="tabFlodOrOpen${id_suffix}(true)" data-options="iconCls:'fa fa-plus'">展开</a>
			<a href="#" id="btnCopy${id_suffix}" class="easyui-linkbutton" plain="true" onclick="copyLink('/basicinfo/VRApply/edit/${id}','产品VR版本申请','${id}','${copyTitle}')"
				data-options="iconCls:'fa fa-files-o'">复制链接</a>
			<a href="#" id="btnDel${id_suffix}" class="easyui-linkbutton" plain="true" onclick="delProcess${id_suffix}()"
				data-options="iconCls:'fa fa-trash '">废弃</a>
		</div>
	</div>
	<!-- <div class="toptoolbarhr" style="margin-top: 2%;"></div> -->
	<br />
	<br />
	<p>
		<span class="title191030">${title}</span>
	</p>
	<div class="toptoolbarhr" style=""></div>

	<div class="flow-content" class="textBoxFrom">
		<form id="VRApply${id_suffix}" method='post'>
			<input id="id${id_suffix}" name="id" type="hidden" />
			<input id="processID${id_suffix}" name="processID" type="hidden" value="${processID}"/>
			<input id="instanseId${id_suffix}" name="instanseId" type="hidden" />
			<input id="ipmtsecretary${id_suffix}" name="ipmtsecretary" type="hidden" />
			<input id="applycode${id_suffix}" name="applyCode" type="hidden" value="${code}" />
			<input id="process${id_suffix}" name="processCode" type="hidden" value="${code}" />

			<div style="font-size: 13px">
				<table cellspacing="0" width="100%" style="margin: auto; border: none;">
					<tr>
						<td width="20%">
							&nbsp;&nbsp;所处环节：&nbsp;
							<span style="color: #3A5FCD">${currentNodeDesc}</span>
							&nbsp;&nbsp;
						</td>
						<td width="20%">
							&nbsp;&nbsp;当前责任人：&nbsp;&nbsp;&nbsp;&nbsp;
							<span style="color: #3A5FCD">
								<ibds:userAccount account="${Handler}" />
							</span>
							&nbsp;&nbsp;
						</td>
						<td width="20%">
							&nbsp;&nbsp;当前状态描述：
							<span style="color: #3A5FCD">${currentNodeDesc}</span>
							&nbsp;&nbsp;
						</td>
						<td width="20%">
							&nbsp;&nbsp;单号：
							<span style="color: #3A5FCD">${code}<input type="hidden" value="${code}" name="code" />
							</span>
							&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</div>
			<br />
			<h2 class="subfild" id="T00000-1-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-1-${id_suffix}')">
				<span>1.产品POP提出修改申请</span>
			</h2>
			<div id="SUBFORM-T00000-1-${id_suffix}" class="textBoxFrom">
				<div style="font-size: 13px; margin: 1%">
					<!-- <span style="color: #f25aef; font-size: 17px;; margin: auto" width="98%">请先选择IPMT、研发产品线、产品：</span> -->
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto">
						<tr>
							<td width="30%" align="">
								<span style="color: red">*</span>
								&nbspIPMT:
								<input name="plipmtno" style="width: 50%; height: 30px;" id="plipmtno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/list?type=PI&code=',required:true,missingMessage:'请选择IPMT'"
									class="easyui-combobox" />
							</td>
							<td width="30%" align="">
								<span style="color: red">*</span>
								&nbsp研发产品线:
								<input name="prodlineno" style="width: 50%; height: 30px;" id="prodlineno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/list?type=PL&code=',required:true,missingMessage:'请选择研发产品线'"
									Class="easyui-combobox" />
							</td>
							<td width="30%" align="">
								<span style="color: red">*</span>
								&nbsp产品:
								<input name="productno" style="width: 50%; height: 30px;" id="productno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/list?type=PP&code=',required:true,missingMessage:'请选择产品'"
									class="easyui-combobox" />
							</td>
						</tr>
					</table>
				</div>
				<br>
				<h2 class="subfild" id="T00000-V-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-V-${id_suffix}')">
					<span>产品V级版本信息修改</span>
				</h2>
				<div id="SUBFORM-T00000-V-${id_suffix}" style="margin: 1%;">
					<!-- <a href="#" class="easyui-linkbutton" onclick="showVList('V')">查看已有产品V级清单</a> -->
					<!-- <br> -->
					<input type="checkbox" class="combobox-checkbox" id="newpv${id_suffix}" name="newpv" onclick="tableShowOrHide${id_suffix}(this,'tbl_newpv${id_suffix}');setROperationState${id_suffix}(this,true,'tbl_newpv${id_suffix}')" value="1" style="margin-top: 2px;">
					&nbsp;
					<span class="span28" style="font-weight: 600; line-height: 40px;">增加产品V级版本</span>
					<br>
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto; display: none;" id="tbl_newpv${id_suffix}">
						<tr>							
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp要新增产品V级中文名称:
								<input name="versionnew" style="width: 50%; height: 30px;" id="versionnew${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp要新增产品V级英文名称:
								<input name="engversionnew" style="width: 50%; height: 30px;" id="engversionnew${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								要新增产品V级内码:
								<input name="versionnewno" style="width: 50%; height: 30px;" readonly='readonly' id="versionnewno" size="30" class="easyui-textbox" />
							</td>
						</tr>
					</table>
					<hr>
					<input type="checkbox" class="combobox-checkbox" id="modpv${id_suffix}" name="modpv" value="1" style="margin-top: 2px;" onclick="tableShowOrHide${id_suffix}(this,'tbl_modpv${id_suffix}');setROperationState${id_suffix}(this,false,'tbl_modpv${id_suffix}')">
					&nbsp;
					<span class="span28" style="font-weight: 600; line-height: 40px;">修改产品V级版本</span>
					<br>
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto; display: none;" id="tbl_modpv${id_suffix}">
						<tr>
							<td  align="right">
								<span>
									<span style="color: red">*</span>
									&nbsp请选择要修改的产品V级信息:
								</span>
								&nbsp
								<input style="width: 50%; height: 30px;" id="versionnewCom${id_suffix}" size="30"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/listWithEng?type=PV&code=',required:false,missingMessage:'不能为空'"
									class="easyui-combobox" />
							</td>
							<td align="right">
								产品V级内码:
								<input name="versionoldno" style="width: 50%; height: 30px;" readonly='readonly' id="versionoldno${id_suffix}" value="" size="30" type="" data-options=""
									class="easyui-textbox" />
							</td>
						</tr>
						<tr>							
							<td width="30%" align="right">
								原产品V级中文名称:
								<input name="versionold" style="width: 50%; height: 30px;" readonly='readonly' id="versionold${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp新产品V级中文名称:
								<input name="versionnow" style="width: 50%; height: 30px;" id="versionnow${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>							
						</tr>
						<tr>
							<td width="30%" align="right">
								原产品V级英文名称:
								<input name="engversionold" style="width: 50%; height: 30px;" readonly='readonly' id="engversionold${id_suffix}" value="" size="30" type="" data-options=""
									class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp新产品V级英文名称:
								<input name="engversionnow" style="width: 50%; height: 30px;" id="engversionnow${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
						</tr>
					</table>
					<hr>
					<input type="checkbox" class="combobox-checkbox" id="delpv${id_suffix}" name="delpv" value="1" style="margin-top: 2px;" onclick="tableShowOrHide${id_suffix}(this,'tbl_delpv${id_suffix}');setROperationState${id_suffix}(this,false,'tbl_delpv${id_suffix}')">
					&nbsp;
					<span class="span28" style="font-weight: 600; line-height: 40px;">删除产品V级版本</span>
					<br>
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto; display: none;" id="tbl_delpv${id_suffix}">
						<tr>
							<td width="30%" align="right">
								<span>
									<span style="color: red">*</span>
									&nbsp请选择要删除的产品V级信息:
								</span>
								&nbsp
								<input style="width: 50%; height: 30px;" id="versiondelCom${id_suffix}" size="30"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/listWithEng?type=PV&code=',required:false,missingMessage:'不能为空'"
									class="easyui-combobox" />
							</td>
							<td colspan="2"></td>
						</tr>
						<tr>

							<td width="30%" align="right">
								要删除的产品V级内码:
								<input name="versiondelno" style="width: 50%; height: 30px;" readonly='readonly' id="versiondelno${id_suffix}" value="" size="30" type="" data-options=""
									class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								要删除的产品V级中文名称:
								<input name="versiondel" style="width: 50%; height: 30px;" readonly='readonly' id="versiondel${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								要删除的产品V级英文名称:
								<input name="engversiondel" style="width: 50%; height: 30px;" readonly='readonly' id="engversiondel${id_suffix}" value="" size="30" type="" data-options=""
									class="easyui-textbox" />
							</td>
						</tr>
						<tr>
							<td width="100%" colspan="2" style="color: red">注:停用该产品会停用该产品以下级别的信息：包括产品R级、版本、项目组、特性、子特性、子系统、模块、模块版本</td>
						</tr>
					</table>
					<hr>

				</div>
				
				<h2 class="subfild" id="T00000-R-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-R-${id_suffix}')">
					<span>产品R级版本信息修改</span>
				</h2>
				<div id="SUBFORM-T00000-R-${id_suffix}" style="margin: 1%">
				
							<span style="color: pink; ">产品R级信息修改操作之前请先选择产品V级（只能单选），如果V级是本次新增的，就不需再选择。</span>
					<table class="product" border="1" cellspacing="0" width="100%" style="margin:none!important">
						<tr>
							<td width="30%" align="" style="padding:1px 0px 1px 0px!important">
								<span style="color: red">*</span>
								&nbsp产品V级:
								<input name="versionno" style="width: 50%; height: 30px;" id="versionno${id_suffix}" value="" size="30"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/listWithEng?type=PV&code=',required:false,missingMessage:'不能为空'"
									class="easyui-combobox" class="easyui-combobox" />
							</td>
							<td colspan="2"></td>
						</tr>
					</table>
				
					<!-- <a href="#" class="easyui-linkbutton" onclick="showVList('R')">查看已有产品R级清单</a> -->
					
					<input type="checkbox" class="combobox-checkbox" id="newpr${id_suffix}" name="newpr" value="1" style="margin-top: 2px;" >
					&nbsp;
					<span class="span28" style="font-weight: 600; line-height: 40px;">增加产品R级版本</span>
					<br>
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto; display: none;" id="tbl_newpr${id_suffix}">
						<tr>							
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp要新增产品R级中文名称:
								<input name="releasenew" style="width: 50%; height: 30px;" id="releasenew${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp要新增产品R级英文名称:
								<input name="engreleasenew" style="width: 50%; height: 30px;" id="engreleasenew${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp要新增产品R级的内码:
								<input name="releasenewno" style="width: 50%; height: 30px;" readonly='readonly' id="releasenewno${id_suffix}" value="" size="30" type="" data-options=""
									class="easyui-textbox" />
							</td>
						</tr>
						<tr>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp请选择对应的PDT:
								<input name="pdtno" style="width: 50%; height: 30px;" id="pdtno${id_suffix}" value="" size="30" type="" data-options="" class="easyui-combobox" />
							</td>
							<td width="30%" align="right">
								<!-- <span style="color: red">*</span> -->
								&nbsp请选择对应的软件平台版本:
								<input type="hidden" name="releasenoSoftware" id="releasenoSoftware${id_suffix}" />
								<input name="releaseSoftware" style="width: 50%; height: 30px;" id="releaseSoftware${id_suffix}" value="此项必选，如不涉及，请在备注中说明" size="30" type="" data-options="" class="easyui-combotreegrid" />
							</td>
							<td width="30%" align="right">
								<!-- <span style="color: red">*</span> -->
								&nbsp请选择继承角色信息的版本号:
								<input style="width: 50%; height: 30px;" id="inheritrelease${id_suffix}" name="inheritrelease" size="30" editable="false"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/listWithEng?type=PR&code=',required:false,missingMessage:'不能为空'"
									class="easyui-combobox" />
							</td>
						</tr>
					</table>
					<hr>
					<input type="checkbox" class="combobox-checkbox" id="modpr${id_suffix}" name="modpr" value="1" style="margin-top: 2px;" >
					&nbsp;
					<span class="span28" style="font-weight: 600; line-height: 40px;">修改产品R级版本</span>
					
					<br>
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto; display: none;" id="tbl_modpr${id_suffix}">
					
						<tr>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp;请选择要修改的产品R级: &nbsp;
								<input style="width: 50%; height: 30px;"  id="releaseoldCom${id_suffix}" size="30"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/listWithEng?type=PR&code=',required:false,missingMessage:'不能为空'"
									class="easyui-combobox" />
							</td>
							<td width="30%" align="right">
								产品R级内码:
								<input name="releaseoldno" style="width: 50%; height: 30px;" readonly='readonly' id="releaseoldno${id_suffix}" size="30" data-options="" class="easyui-textbox" />
							</td>

						</tr>
						<tr>
							<td width="30%" align="right">
								原产品R级中文名称:
								<input name="releaseold" style="width: 50%; height: 30px;" readonly='readonly' id="releaseold${id_suffix}" size="30" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp;新产品R级中文名称:
								<input name="releasenow" style="width: 50%; height: 30px;" id="releasenow${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
						</tr>
						<tr>
							<td width="30%" align="right">
								原产品R级英文名称:
								<input name="engreleaseold" style="width: 50%; height: 30px;" readonly='readonly' id="engreleaseold${id_suffix}" size="30" t data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp;新产品R级英文名称:
								<input name="engreleasenow" style="width: 50%; height: 30px;" id="engreleasenow${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
						</tr>
						<tr>
							<td width="30%" align="right">								
								&nbsp;原所属PDT:
								<input id="pdtold${id_suffix}" type="hidden" name="pdtold"/>
								<input name="pdtoldno" style="width: 50%; height: 30px;" readonly='readonly' id="pdtoldno${id_suffix}" value="" size="30" type="" data-options="" class="easyui-combobox" />
							</td>
							<td width="30%" align="right">
								<span style="color: red">*</span>
								&nbsp;新所属PDT:
								<input name="pdtnowno" style="width: 50%; height: 30px;" id="pdtnowno${id_suffix}" editable="false" value="" size="30" type="" data-options="" class="easyui-combobox" />
							</td>						
						</tr>
						<tr>
							<td width="30%" align="right">
								原产品R级对应的软件平台版本:
								<input type="hidden" name="releasenoSoftwareold" id="releasenoSoftwareold${id_suffix}" />
								<input name="releaseSoftwareold" style="width: 50%; height: 30px;" readonly='readonly' id="releaseSoftwareold${id_suffix}" value="" size="30"  data-options=""
									class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								新产品R级对应的软件平台版本:
								<input type="hidden" name="releasenoSoftwarenow" id="releasenoSoftwarenow${id_suffix}" />
								<input name="releaseSoftwarenow" style="width: 50%; height: 30px;" id="releaseSoftwarenow${id_suffix}" value="此项必选，如不涉及，请在备注中说明"  size="30"  data-options=""
									class="easyui-combotreegrid" />
							</td>
						</tr>
					</table>
					<hr>
					<input type="checkbox" class="combobox-checkbox" id="delpr${id_suffix}" name="delpr" value="1" style="margin-top: 2px;" >
					&nbsp;
					<span class="span28" style="font-weight: 600; line-height: 40px;">删除产品R级版本</span>
					<br>
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto; display: none;" id="tbl_delpr${id_suffix}">
						<tr>
							<td width="30%" align="right">
								<span>
									<span style="color: red">*</span>
									&nbsp请选择要删除的产品R级信息:
								</span>
								&nbsp
								<input style="width: 50%; height: 30px;" id="releasedelCom${id_suffix}" size="30"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/listWithEng?type=PR&code=',required:false,missingMessage:'不能为空'"
									class="easyui-combobox" />
							</td>
							<td colspan="2"></td>
						</tr>
						<tr>
							<td width="30%" align="right">
								要删除的产品R级内码:
								<input name="releasedelno" style="width: 50%;" id="releasedelno${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								要删除的产品R级中文名称:
								<input name="releasedel" style="width: 50%; height: 30px;" readonly='readonly' id="releasedel${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
							<td width="30%" align="right">
								要删除的产品R级英文名称:
								<input name="engreleasedel" style="width: 50%; height: 30px;" readonly='readonly' id="engreleasedel${id_suffix}" value="" size="30" type="" data-options=""
									class="easyui-textbox" />
							</td>
						</tr>
						<tr>
							<td width="100%" colspan="2" style="color: red">注:停用该产品会停用该产品以下级别的信息：包括版本、项目组、特性、子特性、子系统、模块、模块版本</td>
						</tr>
					</table>
					<hr>
				</div>
				<div style="margin: 1%">
					<div>
						抄送人员:
						<input name="copyto" style="width: 45%; height: 30px;" id="copyto${id_suffix}" value="" data-options="" class="auto_selusers_true"  />
					</div>
					<div>
						依据材料:&nbsp;&nbsp;&nbsp;
						<input id="fileId_1_${timestamp}" name="fileId" value="${fileId}" type="hidden"/>

						<a href="#">
							<img id="fileIcon_${timestamp}" src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}(1)">
						</a>


						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注:
						<input name="remark" style="width: 45%; height: 30px;" id="remark${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
						<a href="#" class="easyui-linkbutton" style="color: white; background-color: #3498DB; height: 30px; margin: 0PX 4% 0px 1%;" id="btnsubmit${id_suffix}">提交</a>
						<span style="font-size: 14px;">
							签名：
							<ibds:userAccount account="${subSign}" />
						</span>
						<span style="font-size: 14px; margin-left: 6%;">
							时间:
							<fmt:formatDate value="${submitDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						</span>
					</div>

				</div>
				<br>
			</div>

			
			<h2 class="subfild" id="T00000-2-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-2-${id_suffix}')">
				<span>2.IPMT执行秘书审核并处理</span>
			</h2>
			<div id="SUBFORM-T00000-2-${id_suffix}">
				<div style="font-size: 13px; margin: 1%;">
					<div>

						审批意见:

						<input name="suggestion" style="width: 45%; height: 30px;" id="suggestion${id_suffix}" value="" size="30" data-options="readonly:true" class="easyui-textbox" />

						<a href="#" id="btn_agree${id_suffix}" class="easyui-linkbutton" onclick="check${id_suffix}('1')"
							style="color: white; background-color: #3498DB; height: 30px; margin: 0PX 1% 0px 1%">同意</a>
						<a href="#" id="btn_back${id_suffix}" class="easyui-linkbutton" onclick="check${id_suffix}('0')" style="color: #3498DB; background-color: white; height: 30px;">驳回</a>

						<span style="font-size: 14px; margin-left: 4%">
							签名：
							<ibds:userAccount account="${IPMTSign}" />
						</span>
						<span style="font-size: 14px; margin-left: 6%;">
							时间:
							<fmt:formatDate value="${IPMTDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						</span>
					</div>
				</div>
			</div>
		</form>
		<h2 class="subfild" id="T00000-3-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-3-${id_suffix}')">
			<span>管理区段</span>
		</h2>
		<div id="SUBFORM-T00000-3-${id_suffix}"  style="height: 30px;display:none;height:40px;">
			<div style="float: left; width: 30%">
				<span>
					&nbsp;&nbsp;&nbsp;处理人：
					<input id="assign${id_suffix}" class="auto_selusers_false" value="" style="width: 300px !important" />
				</span>
				<input id="assign" value="" type="hidden" />
			</div>

			<div style="float: left; width: 70%; text-align: left;">
				<a href="#" class="easyui-linkbutton" id="btn_changeHandler${id_suffix}" style="color: white; background-color: #3498DB; margin-top: 10px;"
					onclick="changeHandler${id_suffix}()">修改当前处理人</a>
			</div>
		</div>
		<h2 class="subfild" id="T00000-4-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-4-${id_suffix}')"  style="margin-top:10px;">
			<span>处理记录</span>
		</h2>
		<div id="SUBFORM-T00000-4-${id_suffix}" style="display:none;">
			<c:forEach var="processLog" items="${logs}">
				<div>
					<span>
						系统时间：
						<fmt:formatDate value="${processLog.checkDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						&nbsp;&nbsp;
						<ibds:userAccount account="${processLog.checkAccount}" />
						&nbsp;&nbsp; ${processLog.checkResult}&nbsp;&nbsp; （意见：${processLog.checkOpion}&nbsp;&nbsp;）—》 ${processLog.checkStatus}&nbsp;&nbsp;

					</span>
				</div>
			</c:forEach>

			<br>
			<hr>
		</div>
	</div>
	<br />
	<br />
	<br />
</div>
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<style type="text/css">
/* .product {
	border-collapse: collapse;
	border-spacing: 0;
	border-left: 1px solid #888;
	border-top: 1px solid #888;;
	border-bottom: 1px solid #888
}

.product td {
	border-right: 1px solid #888;
	border-bottom: 1px solid #888;
	padding: 5px 15px;
} */
.VrClass input[readonly]{
background-color: #f1f1f5
}

</style>
	<script>
	var index_load${id_suffix}=0;
	$(function(){
		//多个人员联想
		 if($("#VrClass${id_suffix} input[class*='auto_selusers_true']").length>0){
	  	 $("#VrClass${id_suffix} input[class*='auto_selusers_true']").each(function(index,element){
	  		 $(this).autocomplete("/product/userlink/list?userCode=liucaixuan", {
	  			    multiple: true,
	  			  	max : 20, //列表里的条目数
	  				minChars : 2, //自动完成激活之前填入的最小字符
	  				width : "400px", //提示的宽度，溢出隐藏
	  				scrollHeight : 400, //提示的高度，溢出显示滚动条
	  				matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
	  				autoFill : false, //自动填充
	  				mustMatch: true,
	  				multipleSeparator:",",
	  				parse : function(data) {
	  					return $.map(eval(data), function(row) {
	  						return {
	  							data : row,
	  							value : row.groupname,
	  							result :row.groupname
	  						}
	  					}); //对ajax页面传过来的数据进行json转码
	  				},
	  				formatItem : function(row, i, max) {
	  					//document.getElementById('cmoid').value = "";
	  					return row.groupname + ' | ' + row.deptname;
	  				}
	  		    })
	  	 });
	  	 }
		
		
		var currentNode="${currentNode}";
		
		//设置页面编辑权限
		setPagePower${id_suffix}();
		setTabFlodOrOpen('T00000-1-${id_suffix}',true);
		setTabFlodOrOpen('T00000-2-${id_suffix}',true);
		setTabFlodOrOpen('T00000-3-${id_suffix}',false);
		setTabFlodOrOpen('T00000-4-${id_suffix}',false);
		setTabFlodOrOpen('T00000-V-${id_suffix}',true);
		 

		var id = "${id}";
		if (id!=null&&id!=undefined&&id!="") {
			$("#mainUrl").tabs("loading","loading...");
			
			$.post('/basicinfo/VRApply/getByApplyCode/'+id, function(result) {
				$('#VRApply${id_suffix}').form('load', result.data);
				if(result.data.newpv!=null&&result.data.newpv==1){
					$("#tbl_newpv${id_suffix}").toggle(true);
					$.parser.parse($("#tbl_newpv${id_suffix}"));
					setROperationState${id_suffix}($('#newpv${id_suffix}'),true,'tbl_newpv${id_suffix}')
				}
				if(result.data.modpv!=null&&result.data.modpv==1){
					$("#tbl_modpv${id_suffix}").toggle(true);
					$.parser.parse($("#tbl_modpv${id_suffix}"));
					setROperationState${id_suffix}($('#modpv${id_suffix}'),false,'tbl_modpv${id_suffix}')
				}
				if(result.data.delpv!=null&&result.data.delpv==1){
					$("#tbl_delpv${id_suffix}").toggle(true);
					$.parser.parse($("#tbl_delpv${id_suffix}"));
					setROperationState${id_suffix}($('#delpv${id_suffix}'),false,'tbl_delpv${id_suffix}')
				}
				if((result.data.newpv==null||(result.data.newpv!=null&&result.data.newpv!=1))
						&&(result.data.modpv==null||(result.data.modpv!=null&&result.data.modpv!=1))
						&&(result.data.delpv==null||(result.data.delpv!=null&&result.data.delpv!=1))){
						$("#SUBFORM-T00000-V-${id_suffix}").hide();
						setTabFlodOrOpen('T00000-V-${id_suffix}',false);
				}
				if(result.data.newpr!=null&&result.data.newpr==1){$("#tbl_newpr${id_suffix}").toggle(true);$.parser.parse($("#tbl_newpr${id_suffix}"));}
				if(result.data.modpr!=null&&result.data.modpr==1){$("#tbl_modpr${id_suffix}").toggle(true);$.parser.parse($("#tbl_modpr${id_suffix}"));}
				if(result.data.delpr!=null&&result.data.delpr==1){$("#tbl_delpr${id_suffix}").toggle(true);$.parser.parse($("#tbl_delpr${id_suffix}"));}
				if(result.data.versionoldno!=null){
					//修改V					
					$("#versionnewCom${id_suffix}").combobox({
						onLoadSuccess: function () {	
							$("#versionnewCom${id_suffix}").combobox('setText',result.data.versionold+' | '+result.data.engversionold);
							$("#versionold${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(result.data.versionold));
			            	$("#engversionold${id_suffix}").textbox("setValue",result.data.engversionold);
			            	$("#versionnow${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(result.data.versionnow));
			            	$("#engversionnow${id_suffix}").textbox("setValue",result.data.engversionnow);
			            	$('#versionnewCom${id_suffix}').unbind("onLoadSuccess");
			            }
					});
					$("#versionnewCom${id_suffix}").combobox("setValue",result.data.versionoldno);
				}
				if(result.data.versiondelno!=null){
					$("#versiondelCom${id_suffix}").combobox("setValue",result.data.versiondelno);
				}
				if(result.data.releaseoldno!=null){
					//修改R赋值				
					/*  */
					$('#releaseoldCom${id_suffix}').combobox({
						onLoadSuccess: function () {							
							$('#releaseoldCom${id_suffix}').combobox("setText",fmoatStr${id_suffix}(result.data.releaseold)+' | '+fmoatStr${id_suffix}(result.data.engreleaseold)); 	
					        $('#releaseoldCom${id_suffix}').unbind("onLoadSuccess");
				         }
					});	
				}
				 
				$("#releaseold${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(result.data.releaseold));  
			    $("#engreleaseold${id_suffix}").textbox("setValue", fmoatStr${id_suffix}(result.data.engreleaseold)); 
		        $("#releasenow${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(result.data.releasenow));  
		        $("#engreleasenow${id_suffix}").textbox("setValue", fmoatStr${id_suffix}(result.data.engreleasenow));  
		        $("#pdtoldno${id_suffix}").combobox("setValue",fmoatStr${id_suffix}(result.data.pdtoldno));
				$("#pdtoldno${id_suffix}").combobox('setText',fmoatStr${id_suffix}(result.data.pdtold));
				$("#pdtnowno${id_suffix}").combobox("setValue",fmoatStr${id_suffix}(result.data.pdtnowno));		
				$("#releasenoSoftwareold${id_suffix}").val(fmoatStr${id_suffix}(result.data.releasenoSoftwareold));
				$("#releaseSoftwareold${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(result.data.releaseSoftwareold));
				$("#releaseSoftwarenow${id_suffix}").combotreegrid("setValue",fmoatStr${id_suffix}(result.data.releaseSoftwarenow));
				$("#releasenoSoftwarenow${id_suffix}").val(fmoatStr${id_suffix}(result.data.releasenoSoftwarenow));		
				if(result.data.releasedelno!=null){
					$("#releasedelCom${id_suffix}").combobox("setValue",result.data.releasedelno);
				}
				if(result.data.pdtno!=null){
					$("#pdtno${id_suffix}").combobox("setValue",result.data.pdtno);
				}
				/* if(result.data.pdtoldno!=null){
					$("#pdtoldno${id_suffix}").combobox("setValue",result.data.pdtoldno);
					$("#pdtoldno${id_suffix}").combobox('setText',result.data.pdtold);
				} */
				/* if(result.data.pdtnowno!=null){
					$("#pdtnowno${id_suffix}").combobox("setValue",result.data.pdtnowno);
				} */
				if(result.data.inheritrelease!=null){
					$("#inheritrelease${id_suffix}").combobox("setValue",result.data.inheritrelease);
				}
				if(result.data.ipmtOpinion!=null){
					$("#suggestion${id_suffix}").textbox("setValue",result.data.ipmtOpinion);
					$("#suggestion${id_suffix}").parents('td').find('input').attr('title',result.data.ipmtOpinion);
				}
				if(result.data.versionnow!=null){
					$("#versionnow${id_suffix}").textbox("setValue",result.data.versionnow);
				}
				
				if(result.data.releasenoSoftware!=null){
					$("#releaseSoftware${id_suffix}").combotreegrid("setValue",result.data.releaseSoftware);
					$("#releasenoSoftware${id_suffix}").val(result.data.releasenoSoftware);
				}
				
				/* if(result.data.releasenoSoftwarenow!=null){
					$("#releaseSoftwarenow${id_suffix}").combotreegrid("setValue",result.data.releaseSoftwarenow);
					$("#releasenoSoftwarenow${id_suffix}").val(result.data.releasenoSoftwarenow);
				}	 */			
				if(result.data.remark!=null){
					$('#remark${id_suffix}').parents('td').find('input').attr('title',result.data.remark);
				}
				$("#mainUrl").tabs("loaded");
			});
		}else{
			$("#SUBFORM-T00000-V-${id_suffix}").hide();
			setTabFlodOrOpen('T00000-V-${id_suffix}',false);
		}
		
		//绑定下拉框联动事件
		initVRCombox${id_suffix}();
		
		$('#btnSave${id_suffix}').linkbutton({    
		    iconCls: 'fa fa-save',
		    onClick: postSaveVRDraft${id_suffix}
		}); 
		$('#btnsubmit${id_suffix}').linkbutton({    
		    iconCls: 'fa fa-save',
		    onClick: postSaveVR${id_suffix}
		});
	});
	
	function bindRCheckClick${id_suffix}(){
		$('#newpr${id_suffix}').click(function(){
			tableShowOrHide${id_suffix}($(this),'tbl_newpr${id_suffix}');
		});
		$('#modpr${id_suffix}').click(function(){
			tableShowOrHide${id_suffix}($(this),'tbl_modpr${id_suffix}');
		});
		$('#delpr${id_suffix}').click(function(){
			tableShowOrHide${id_suffix}($(this),'tbl_delpr${id_suffix}');
		});
	}
	
	//设置页面权限
	function setPagePower${id_suffix}(){
		var currentNode="${currentNode}";
		//无编辑权限，页面无法编辑
		if("${currentNode=='usertask1' && isHandler || isEdit == 'editable'}"=="true"){
			$("#btn_agree${id_suffix}").hide();	
			$("#btn_back${id_suffix}").hide();
			if(('${state}'!=0&&'${state}'!=-1)||'${state}'==''){
				$("#btnDel${id_suffix}").hide();	
			}
			bindRCheckClick${id_suffix}();
		}else if("${currentNode=='usertask2' && isHandler || isEdit == 'editable'}"=="true"){			
			$("#btnDel${id_suffix}").hide();			
			$('#btnsubmit${id_suffix}').hide();
			$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");
			$("#plipmtno${id_suffix}").combobox({disabled: true});
			$("#prodlineno${id_suffix}").combobox({disabled: true});
			$("#productno${id_suffix}").combobox({disabled: true});
			$("#versionnewCom${id_suffix}").combobox({disabled: true});
			$("#versiondelCom${id_suffix}").combobox({disabled: true});
			$("#releaseoldCom${id_suffix}").combobox({disabled: true});
			$("#releasedelCom${id_suffix}").combobox({disabled: true});
			$("#pdtno${id_suffix}").combobox({disabled: true});	
			$("#suggestion${id_suffix}").textbox({readonly:false});
			$("#SUBFORM-T00000-V-${id_suffix}").find("[type='checkbox']").off("click").attr("disabled","disabled");
			$("#SUBFORM-T00000-R-${id_suffix}").find("[type='checkbox']").off("click").attr("disabled","disabled");
			$("#fileIcon_${timestamp}").attr("onclick","showUeditorContent${timestamp}(1)");
		}else{			
			$("#btnDel${id_suffix}").hide();
			$("#btn_agree${id_suffix}").hide();	
			$("#btn_back${id_suffix}").hide();			
			$('#btnsubmit${id_suffix}').hide();
			$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");
			$("#plipmtno${id_suffix}").combobox({disabled: true});
			$("#prodlineno${id_suffix}").combobox({disabled: true});
			$("#productno${id_suffix}").combobox({disabled: true});
			$("#versionnewCom${id_suffix}").combobox({disabled: true});
			$("#versiondelCom${id_suffix}").combobox({disabled: true});
			$("#releaseoldCom${id_suffix}").combobox({disabled: true});
			$("#releasedelCom${id_suffix}").combobox({disabled: true});
			$("#pdtno${id_suffix}").combobox({disabled: true});			
			$("#SUBFORM-T00000-V-${id_suffix}").find("[type='checkbox']").removeAttr("onclick").attr("disabled","disabled");;
			$("#SUBFORM-T00000-R-${id_suffix}").find("[type='checkbox']").removeAttr("onclick").attr("disabled","disabled");;
			$("#fileIcon_${timestamp}").attr("onclick","showUeditorContent${timestamp}(1)");
		}	
		
		if('${isChangeUser}'!='true'){
			$("#btn_changeHandler${id_suffix}").parent("div").hide();
		}		
	}
	
	//checkbox隐藏显示
	function tableShowOrHide${id_suffix}(obj,hide_id){
		var isCheck=false;
		if($(obj).is(':checked')){
			$("#"+hide_id).show();			
			//重新刷新样式
			isCheck=true;
			setInputCheck${id_suffix}(hide_id,isCheck);
			$.parser.parse($("#"+hide_id));				
		}else{
			isCheck=false;
			setInputCheck${id_suffix}(hide_id,isCheck);
			$("#"+hide_id).hide();
		}	
	}
	
	//设置V修改删除R无法操作
	function setROperationState${id_suffix}(obj,isAdd,panelID){
		var isConfirm=false;
		if($("#newpr${id_suffix}").is(':checked')||$("#modpr${id_suffix}").is(':checked')||$("#delpr${id_suffix}").is(':checked')){
			isConfirm=true;
		}
		
		if(isConfirm&&!isAdd){
			if($(obj).is(':checked')){
				$.messager.confirm('确认','对V版本修改或删除时，R版本禁止操作！',function(r){    
				    if (r){  
				    	rOperationState(obj,isAdd,panelID);				    	
				    }else{			    	
				    	$(obj).prop('checked',false);
				    	$("#"+panelID).hide();
				    }    
				}); 
			}			
		}else {
			rOperationState(obj,isAdd,panelID);
		}
		
		if(!$('#modpv${id_suffix}').is(':checked')&&!$('#delpv${id_suffix}').is(':checked')){
			bindRCheckClick${id_suffix}();
			$("#newpr${id_suffix}").removeAttr('disabled');
	    	$("#modpr${id_suffix}").removeAttr('disabled');
	    	$("#delpr${id_suffix}").removeAttr('disabled');
		}
	}
	
	//设置V修改删除R无法操作
	function rOperationState(obj,isAdd,panelID){
		if(!isAdd){
			if($("#newpr${id_suffix}").is(':checked')){
	    		$("#tbl_newpr${id_suffix}").hide();
	    		setInputCheck${id_suffix}('tbl_newpr${id_suffix}',false);	    		
	    	}
	    	if($("#modpr${id_suffix}").is(':checked')){
	    		$("#tbl_modpr${id_suffix}").hide();	
	    		setInputCheck${id_suffix}('tbl_modpr${id_suffix}',false);	  
	    	}
	    	if($("#delpr${id_suffix}").is(':checked')){
	    		$("#tbl_delpr${id_suffix}").hide();
	    		setInputCheck${id_suffix}('tbl_delpr${id_suffix}',false);	  
	    	}					
	    	$("#newpr${id_suffix}").prop('checked',false).off("click").attr('disabled','disabled');
	    	$("#modpr${id_suffix}").prop('checked',false).off("click").attr('disabled','disabled');
	    	$("#delpr${id_suffix}").prop('checked',false).off("click").attr('disabled','disabled');
		}		
    	
		if($("#newpv${id_suffix}").is(':checked')||$("#modpv${id_suffix}").is(':checked')||$("#delpv${id_suffix}").is(':checked')){
			$("#versionno${id_suffix}").combobox('setValue','');
			$("#versionno${id_suffix}").combobox('disable');
		}
    	
    	if(!$("#newpv${id_suffix}").is(':checked')&&!$("#modpv${id_suffix}").is(':checked')&&!$("#delpv${id_suffix}").is(':checked')){
    		$("#versionno${id_suffix}").combobox('enable');
    	}
	}
	
	function setInputCheck${id_suffix}(hide_id,isCheck){
		if(hide_id=="tbl_newpv${id_suffix}"){
			$("#versionnew${id_suffix}").textbox({required:isCheck});
			$("#engversionnew${id_suffix}").textbox({required:isCheck});
		}
		else if(hide_id=="tbl_modpv${id_suffix}"){
			$("#versionnewCom${id_suffix}").combobox({required:isCheck});				
			$("#versionnow${id_suffix}").textbox({required:isCheck});
			$("#engversionnow${id_suffix}").textbox({required:isCheck});				
		}else if(hide_id=="tbl_delpv${id_suffix}"){
			$("#versiondelCom${id_suffix}").combobox({required:isCheck});	
		}else if(hide_id=="tbl_newpr${id_suffix}"){
			$("#releasenew${id_suffix}").textbox({required:isCheck});	
			$("#engreleasenew${id_suffix}").textbox({required:isCheck});	
			$("#pdtno${id_suffix}").combobox({required:isCheck});	
			//$("#releaseSoftware${id_suffix}").combotreegrid({required:isCheck});
		}else if(hide_id=="tbl_modpr${id_suffix}"){
			$("#releaseoldCom${id_suffix}").combobox({required:isCheck});	
			$("#releasenow${id_suffix}").textbox({required:isCheck});	
			$("#engreleasenow${id_suffix}").textbox({required:isCheck});	
			//$("#pdtoldno${id_suffix}").combobox({required:isCheck});
			$("#pdtnowno${id_suffix}").combobox({required:isCheck,missingMessage:'不能为空'});
			
			//$("#releaseSoftwarenow${id_suffix}").combotreegrid({required:isCheck});
		}else if(hide_id=="tbl_delpr${id_suffix}"){
			$("#releasedelCom${id_suffix}").combobox({required:isCheck});	
		}
	}
	
	function initVRCombox${id_suffix}(){
		$("#plipmtno${id_suffix}").combobox({
			onSelect: function (rec) {           	
                var url = '/product/comboboxdata/list?type=PL&code=' + rec.value+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue");
                $('#prodlineno${id_suffix}').combobox('reload', url);
            },onLoadSuccess:function(){
            	//创建继承
				if('${obj_fields}' != ""){
					 <%if (obj_fields.contains("plipmtno,")) {%>
				if('${apply.plipmtno}'!=""){
					$("#plipmtno${id_suffix}").combobox('select','${apply.plipmtno}'); 
				}
				
				<%}%> 
				}
				
				
            }
		});
		$("#prodlineno${id_suffix}").combobox({
			onChange:function(rec){
				$('#pdtnowno${id_suffix}').combobox('setValue','');
				$('#pdtnowno${id_suffix}').combobox('setText','');
				$('#pdtnowno${id_suffix}').combobox('clear');
				$('#pdtnowno${id_suffix}').combobox('loadData', {});
			},
			onSelect: function (rec) { 
				
                var url = '/product/comboboxdata/list?type=PP&code=' + rec.value+'&sub_code=' + $('#productno${id_suffix}').combobox("getValue");
                $('#productno${id_suffix}').combobox('reload', url);
                var pdturl = '/product/comboboxdata/list?type=PT&code=' + rec.value+'&sub_code=' + $('#pdtno${id_suffix}').combobox("getValue");
                $('#pdtno${id_suffix}').combobox('reload', pdturl);
                var pdtoldurl = '/product/comboboxdata/list?type=PT&code=' + rec.value+'&sub_code=' + $('#pdtoldno${id_suffix}').combobox("getValue");
                $('#pdtoldno${id_suffix}').combobox('reload', pdtoldurl);
                var pdtnowurl = '/product/comboboxdata/list?type=PT&code=' + rec.value;
                $('#pdtnowno${id_suffix}').combobox('reload', pdtnowurl);
                /*$('#pdtnowno${id_suffix}').combobox({
                	 onLoadSuccess:function(){debugger
                		
                		$('#pdtnowno${id_suffix}').unbind("onLoadSuccess");
                	}
                	onSelect:function(rec){
                		debugger
                	}
                }); */
               
            },onLoadSuccess:function(){
            	//创建继承
				if('${obj_fields}' != ""){
				 <%if (obj_fields.contains("prodlineno,")) {%>
			if('${apply.prodlineno}'!=""){
				$("#prodlineno${id_suffix}").combobox('select','${apply.prodlineno}'); 
			}
			
			<%}%> 
				}
				
            }
		});
		$("#productno${id_suffix}").combobox({
			onSelect: function (rec) {           	
                var url = '/product/comboboxdata/listWithEng?type=PV&code=' + rec.value;            	
				//$('#versionnewCom${id_suffix}').unbind("onLoadSuccess");
                $('#versionnewCom${id_suffix}').combobox('reload', url+'&sub_code=' + $('#versionnewCom${id_suffix}').combobox("getValue"));
                $('#versiondelCom${id_suffix}').combobox('reload', url+'&sub_code=' + $('#versiondelCom${id_suffix}').combobox("getValue"));  
                $('#versionno${id_suffix}').combobox('reload', url+'&sub_code=' + $('#versionno${id_suffix}').combobox("getValue"));
            },onLoadSuccess:function(){
            	//创建继承
				if('${obj_fields}' != ""){
				 <%if (obj_fields.contains("productno,")) {%>
			if('${apply.productno}'!=""){
				//$("#productno${id_suffix}").combobox('select','${apply.productno}'); 
				var allData=$("#productno${id_suffix}").combobox("getData");
				for (var i = 0; i < allData.length; i++) {
					if ('${apply.productno}' == allData[i]["value"]) {
                        $("#productno${id_suffix}").combobox('select','${apply.productno}'); 
                        break;
              		 }

				}
			}
			
			<%}%> 
				}
				
            }
		});
		
		//加载R级下拉框
		$("#versionno${id_suffix}").combobox({
			onSelect: function (rec) {  
				var url = '/product/comboboxdata/listWithEng?type=PR&code=' + rec.value;				
				//$('#releaseoldCom${id_suffix}').unbind("onLoadSuccess");
	            $('#releaseoldCom${id_suffix}').combobox('reload', url+'&sub_code=' + $('#releaseoldCom${id_suffix}').combobox("getValue")); 	           
	            $('#releasedelCom${id_suffix}').combobox('reload', url+'&sub_code=' + $('#releasedelCom${id_suffix}').combobox("getValue"));
	            $('#inheritrelease${id_suffix}').combobox('reload', url+'&sub_code=' + $('#releaseoldCom${id_suffix}').combobox("getValue")); 	   
            },onLoadSuccess:function(){
            	//创建继承
				if('${obj_fields}' != ""){
				 <%if (obj_fields.contains("versionno,")) {%>
			if('${apply.versionno}'!=""){
				//$("#versionno${id_suffix}").combobox('select','${apply.versionno}'); 
				var allData=$("#versionno${id_suffix}").combobox("getData");
				for (var i = 0; i < allData.length; i++) {
					if ('${apply.versionno}' == allData[i]["value"]) {
                        $("#versionno${id_suffix}").combobox('select','${apply.versionno}'); 
                        break;
              		 }

				}
			}
			
			<%}%> 
				}
				
            }
		});	
		//修改V
		$("#versionnewCom${id_suffix}").combobox({
			onSelect: function (rec) {
				if("${currentNode=='usertask1'}"=="true"){
					$("#versionoldno${id_suffix}").textbox("setValue", rec.value);               
	            	var _text=rec.text.split('|');
	            	$("#versionold${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[0]));
	         		$("#engversionold${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[1]));
	            	$("#versionnow${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[0]));
	            	$("#engversionnow${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[1])); 
				}              
            }
		});
		//删除V
		$("#versiondelCom${id_suffix}").combobox({
			onSelect: function (rec) {  
				$("#versiondelno${id_suffix}").textbox("setValue", rec.value);  
            	var _text=rec.text.split('|');
           	 	$("#versiondel${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[0]));  
         		$("#engversiondel${id_suffix}").textbox("setValue", fmoatStr${id_suffix}(_text[1]));    
            }
		});
		 //修改R赋值
		 $('#releaseoldCom${id_suffix}').combobox({
			onSelect: function (rec) {
				if("${currentNode=='usertask1'}"=="true"){
					$("#releaseoldno${id_suffix}").textbox("setValue", rec.value);  
			        var _text=rec.text.split('|');
			        $("#releaseold${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[0]));  
			        $("#engreleaseold${id_suffix}").textbox("setValue", fmoatStr${id_suffix}(_text[1])); 
			        $("#releasenow${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[0]));  
			        $("#engreleasenow${id_suffix}").textbox("setValue", fmoatStr${id_suffix}(_text[1])); 
			        $.post('product/data/{type}getInfobyCode',{code:rec.value},function(result){
			        	$('#pdtoldno${id_suffix}').combobox('setValue',result.pdtno);
			        	$('#pdtoldno${id_suffix}').combobox('setText',result.pdt);
			        	$('#pdtold${id_suffix}').val(result.pdt);
			        	var data=$('#pdtnowno${id_suffix}').combobox("getData");
			        	var isSetValue${id_suffix}=false;
			        	$.each(data,function(i,item){
			        		if(item.value==result.pdtno){
			        			isSetValue${id_suffix}=true;
			        			return false;
			        		}
			        	});
			        	if(isSetValue${id_suffix}){
			        		$('#pdtnowno${id_suffix}').combobox('setValue',result.pdtno);
			        	}		        	
			        
						$("#releaseSoftwarenow${id_suffix}").combotreegrid("setValue",result.releaseSoftware);
						$("#releasenoSoftwarenow${id_suffix}").val(result.releasenoSoftware);
						$("#releaseSoftwareold${id_suffix}").textbox("setValue",result.releaseSoftware);
						$("#releasenoSoftwareold${id_suffix}").val(result.releasenoSoftware);
			        });
				}				 
	         }
		});	
		//删除R赋值
		$("#releasedelCom${id_suffix}").combobox({
			onSelect: function (rec) {  
				$("#releasedelno${id_suffix}").textbox("setValue", rec.value);  
	            var _text=rec.text.split('|');
	            $("#releasedel${id_suffix}").textbox("setValue",fmoatStr${id_suffix}(_text[0]));  
	            $("#engreleasedel${id_suffix}").textbox("setValue", fmoatStr${id_suffix}(_text[1]));            
	        }
		});
		
		initSoftWare${id_suffix}('releasenoSoftware${id_suffix}','releaseSoftware${id_suffix}');		
		initSoftWare${id_suffix}('releasenoSoftwarenow${id_suffix}','releaseSoftwarenow${id_suffix}');
	}
	
	function initSoftWare${id_suffix}(id,textid){
		$('#'+textid).combotreegrid({				 
 		    method:'get',
			width:'50%',
			panelWidth:500,
			label:'',
			labelPosition:'top', 			
			url:'/product/comboboxtree/prdata',        
			idField:'plipmtno',
			treeField:'pdt',
			onlyLeafCheck:true,
			columns:[[
	         	 {field:'plipmtno',title:'产品编码',width:200,hidden:true},
	             {field:'pdt',title:'产品',width:200,formatter:function(value,row,index){
	            	 if(value==null||value==undefined){
	            		 return '';
	            	 }
	            	 return value;
	             }},
	             {field:'release',title:'产品R级',width:200},
	             {field:'releaseno',title:'对象项目财务编码',width:200}
	          ]],	         
			  onBeforeExpand : function(row) {//异步架加载树
				var url = "/product/comboboxtree/prdata";
				$('#'+textid).combotreegrid("options").url = url;				
				return true;
			}, 
			onBeforeSelect:function(node){
                 if(node.state=="closed"){
                    $("#"+id).combotreegrid("unselect");                    
               	}
            },
			onClickRow : function(rowData) { //单击事件						
				$("#"+textid).combotreegrid("setText",rowData.release);
				$("#"+id).val($("#"+textid).combotreegrid("getValue"));			
			}
       	}); 
	}
	
	function fmoatStr${id_suffix}(str){
		if(str==null||str==undefined) return '';		
		return str.trim();		
	}
	
	function tabShowOrHide(id){
		$("#"+id).toggle();	
		if($('#'+id).css('display')=='none'){
			setTabFlodOrOpen(id.replace('SUBFORM-',''),false);
		}else{
			setTabFlodOrOpen(id.replace('SUBFORM-',''),true);
		}
	}
	
	//展开折叠所有   isOpen：默认展开，false：默认折叠
	function tabFlodOrOpen${id_suffix}(isOpen){
		$("#SUBFORM-T00000-1-${id_suffix}").toggle(isOpen);	
		$("#SUBFORM-T00000-2-${id_suffix}").toggle(isOpen);	
		$("#SUBFORM-T00000-3-${id_suffix}").toggle(isOpen);	
		$("#SUBFORM-T00000-4-${id_suffix}").toggle(isOpen);
		setTabFlodOrOpen('T00000-1-${id_suffix}',isOpen);
		setTabFlodOrOpen('T00000-2-${id_suffix}',isOpen);
		setTabFlodOrOpen('T00000-3-${id_suffix}',isOpen);
		setTabFlodOrOpen('T00000-4-${id_suffix}',isOpen);
	}
	
	//保存草稿
	function postSaveVRDraft${id_suffix}(){
		$("#mainUrl").tabs("loading","处理中..."); 
		
		$('#btnSave${id_suffix}').linkbutton('disable');

    	$('#VRApply${id_suffix}').form('submit', {
			url : '/basicinfo/VRApply/save',
			onSubmit : function(param) {
				param.applyID=$('#id${id_suffix}').val();
				param.processID=$('#processID${id_suffix}').val();
				 //验证不通过按钮设置为可点击
				if	(!$(this).form('enableValidation').form('validate')){
					 $('#btnSave${id_suffix}').linkbutton('enable');
				}				 
			},
			success : function(data) {				
				//跳转查询页面										
				eval("var obj = " + data);				
				if(obj.success){
					$("#mainUrl").tabs("loaded");
					
					var tab = $('#mainUrl').tabs('getSelected');					
					//var url = $(tab.panel('options')).attr('href');
				    tab.panel('refresh', "/basicinfo/VRApply/edit/"+obj.size);
				} else {
					$("#mainUrl").tabs("loaded");
					$.messager.alert("提示",obj.msg);					
					$('#btnSave${id_suffix}').linkbutton('enable');	
				}
				
			},
			error:function(a,b,c){
				$("#mainUrl").tabs("loaded");
				$.messager.alert("提示",a);
			}
		});
	}
	
	function postSaveVR${id_suffix}(){		
		
		var msg='';
		if($('#modpv${id_suffix}').is(':checked')){
			msg='您申请修改的V级版本下属所有R级版本也将同时修改，请谨慎操作！'
		}
		if($('#delpv${id_suffix}').is(':checked')){
			msg+='<br/>您申请删除的V级版本下属所有R级版本也将同时删除，请谨慎操作！'
		}
		
		if(msg!=''){
			$.messager.confirm({
				width: 500,
			    title: '操作确认',
			    msg: msg,
			    fn: function (r) {
			    	 if(r){
			    		postFormData${id_suffix}();
			         }
			    }
			});				
			
		}else{
			postFormData${id_suffix}();
		}
	}
	
	function postFormData${id_suffix}(){
		$("#mainUrl").tabs("loading","处理中..."); 
		$('#btnsubmit${id_suffix}').linkbutton('disable');

    	$('#VRApply${id_suffix}').form('submit', {
			url : '/basicinfo/VRApply/submit',
			onSubmit : function(param) {
				if($("#fileId_1_${timestamp}").val() == "" || $("#fileId_1_${timestamp}").val() == null){
					$("#mainUrl").tabs("loaded");
					$.messager.alert("提示","依据材料不能为空！！！","");
                    $('#btnsubmit${id_suffix}').linkbutton('enable');
					return false;
				}
				//处理平台版本提示
				if($("#releaseSoftware${id_suffix}").length>0&&$("#releaseSoftware${id_suffix}").combotreegrid("getValue").indexOf("PR")==-1){
					$("#releaseSoftware${id_suffix}").combotreegrid("setValue","");
					
				}
				//处理平台版本提示
				if($("#releaseSoftwarenow${id_suffix}").length>0&&$("#releaseSoftwarenow${id_suffix}").combotreegrid("getValue").indexOf("PR")==-1){
					$("#releaseSoftwarenow${id_suffix}").combotreegrid("setValue","");
					
				}
				
				param.applyID=$('#id${id_suffix}').val();
				param.processID=$('#processID${id_suffix}').val();
				 //验证不通过按钮设置为可点击
				if	(!$(this).form('enableValidation').form('validate')){
					 $('#btnsubmit${id_suffix}').linkbutton('enable');
					 $("#mainUrl").tabs("loaded");
				}	
				 
				return $(this).form('enableValidation').form('validate');
			},
			success : function(data) {				
				//跳转查询页面										
				eval("var obj = " + data);				
				if(obj.success){
					$("#mainUrl").tabs("loaded");
					//$.messager.alert("提示","提交成功");
					var tab = $('#mainUrl').tabs('getSelected');
					var index = $('#mainUrl').tabs('getTabIndex', tab);
					$("#mainUrl").tabs("close", index);
				} else {
					$("#mainUrl").tabs("loaded");
					$.messager.alert('提示',obj.msg);
					$('#btnsubmit${id_suffix}').linkbutton('enable');	
				}
				
			},
			error:function(a,b,c){
				$("#mainUrl").tabs("loaded");
				$.messager.alert('提示',a);
			}
		});
	}
	
	function check${id_suffix}(result) {
		$("#mainUrl").tabs("loading","处理中...");
    	
        var opinion = $("#suggestion${id_suffix}").val();
        if(result!='1'&&opinion==''){
        	$("#mainUrl").tabs("loaded");
        	$.messager.alert('提示','审核意见不能为空！');                	
        	return;
        }
        var param = {
        	"id":"${id}",
            "checkDate":"ipmtDate",
            "checkPerson":"ipmtSign",
            "checkResult":result,
            "checkResultForRole":{
                "resultName":"ipmtResult",
                "resultValue":result
            },
            "checkOpinionForRole":{
                "opinionName":"ipmtOpinion",
                "opinionValue":opinion
            }
        };
        
        var id=$("#id${id_suffix}").val();

        $.ajax({
            type: "POST",
            url: "/basicinfo/VRApply/check/"+id+"/${taskId}",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(param),
            dataType: "json",
            success: function (message) {
            	successCheck(message);
                /* if (message.status == 200) {
                	if(window.location.href.indexOf('eipLogin') > -1){
                		var data = {};
                    	data.Code = 11;
                    	data.Msg = "审批成功";
                    	PM.send(top.window.parent, "fromSource", data); 
                    }else{
                    	$("#mainUrl").tabs("loaded");
                    	$.messager.alert("提示","审核成功");
                    	var tab = $('#mainUrl').tabs('getSelected');
    					var index = $('#mainUrl').tabs('getTabIndex', tab);
    					$("#mainUrl").tabs("close", index);
                    }                        	
                }else{
                	$("#mainUrl").tabs("loaded");
                	$.messager.alert("提示","审核失败");
                }   */                      
            },
            error: function (message) {                    	
            	errorCheck(message);
            }
        });
    }
	
	function changeHandler${id_suffix}() {
		$("#mainUrl").tabs("loading","处理中..."); 
		
        var id=$("#id${id_suffix}").val();
        var userId = $("#assign${id_suffix}").val();
        if(userId==undefined||userId==null||userId==""){
        	$("#mainUrl").tabs("loaded");
        	$.messager.alert("提示","请填写处理人!");
        	return;
        }
        $.post("/basicinfo/VRApply/changeHandler",{id:id,taskId:"${taskId}",userId:userId},function (result) {
        	var data=JSON.parse(result)
            successChangePerson(data);        
        });
    }
	
	function showVList(type){
		if(type=="V"){
			if ($('#mainUrl').tabs('exists', '产品V级')){
				$('#mainUrl').tabs('select', '产品V级');
			}else{
				 $('#mainUrl').tabs('add',{
					 title : '产品V级',
					 href : '/product/pages/pv',
					 closable : true
				 });					
			}
		}else if(type=="R"){
			if ($('#mainUrl').tabs('exists', '产品R级')){
				$('#mainUrl').tabs('select', '产品R级');
			}else{
				 $('#mainUrl').tabs('add',{
					 title : '产品R级',
					 href : '/product/pages/pr',
					 closable : true
				 });					
			}
		}
	}
	
	//作废单据
	function delProcess${id_suffix}(){
		$.post("/basicinfo/VRApply/delProcess",{processID:'${processID}'},function(result){
			var obj = $.parseJSON(result);
     	   if(obj.success){
     	   
       	        var tab = $('#mainUrl').tabs('getSelected');
			        var index = $('#mainUrl').tabs('getTabIndex', tab);
			        $("#mainUrl").tabs("close", index)
     	   }else{
     		   $.messager.alert("提示",obj.message,"");
     		   $('#btnDel${id_suffix}').linkbutton('enable');
     	   }
		});		
	}
	
	
</script>
</body>
</html>