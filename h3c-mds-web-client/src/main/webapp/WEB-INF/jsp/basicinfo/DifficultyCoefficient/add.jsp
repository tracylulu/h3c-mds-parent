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
<title>难度系数新增</title>
</head>
<body>
<div class="diffC" id="diffC${id_suffix}">
	<div>
		<div class="toptoolbar" style="position: fixed;z-index:9000">
			<c:if test="${currentNode=='userTask1' && isHandler || isEdit == 'editable'}">
				<a href="#" id="btnSave${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存</a>
			</c:if>
			<a href="#" id="btnFold${id_suffix}" class="easyui-linkbutton" plain="true" onclick="tabFlodOrOpen${id_suffix}(false)" data-options="iconCls:'fa fa-minus'">折叠</a>
			<a href="#" id="btnOpen${id_suffix}" class="easyui-linkbutton" plain="true" onclick="tabFlodOrOpen${id_suffix}(true)" data-options="iconCls:'fa fa-plus'">展开</a>
			<a href="#" id="btnCopy${id_suffix}" class="easyui-linkbutton" plain="true" onclick="copyLink('/basicinfo/DifficultyCoefficient/edit/${id}','修改难度系数','${id}','${copyTitle}')"
				data-options="iconCls:'fa fa-files-o'">复制链接</a>
			<a href="#" id="btnDel${id_suffix}" class="easyui-linkbutton" plain="true" onclick="delProcess${id_suffix}()"
				data-options="iconCls:'fa fa-trash '">废弃</a>
		</div>
	</div>
	<!-- <div class="toptoolbarhr" style="margin-top: 2%;"></div> -->
	<br>
	<br>
	<p>
		<span class="title191030">${title}</span>
	</p>
	<div class="toptoolbarhr"></div>
	<div id="winparentversion${id_suffix}" title="B版本信息" style="display: none; min-width: 200px; min-height: 350px; width: 30%;">
		<div style="overflow-y: scroll; min-height: 280px;">
			<input type="hidden" id="hid_BversionIndex${id_suffix}" />
			<table id="tbl_Bversion${id_suffix}" class="easyui-datagrid"></table>
		</div>
		<div>
			<button type="button" onclick="confirm${id_suffix}()">确定</button>
			<button type="button" onclick="$('#winparentversion${id_suffix}').window('close');">取消</button>
		</div>
	</div>
	<div class="flow-content">
		<form id="diffApply${id_suffix}" method='post'>
			<input id="applyID${id_suffix}" type="hidden" />
			<input id="processID${id_suffix}" type="hidden" />
			<input id="instanseId${id_suffix}" name="instanseId" type="hidden" />
			<input id="ipmtsecretary${id_suffix}" name="ipmtsecretary" type="hidden" />
			<input id="applycode${id_suffix}" name="applyCode" type="hidden" value="${code}" />
			<input id="process${id_suffix}" name="processCode" type="hidden" value="${code}" />
			<!-- 隐藏判断下拉赋值  应用强级联-->
			<input type="hidden" id="btn_test${id_suffix}" style="display: none" />
			<input type="hidden" id="btn_test1${id_suffix}" style="display: none" />
			<input type="hidden" id="btn_test2${id_suffix}" style="display: none" />
			<div style="font-size: 13px">
				<table cellspacing="0" width="100%" style="border-color: #ABABAB; margin: auto; border: none">
					<tr>
						<td width="20%">
							所处环节：&nbsp;
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
				<span style="width: 16%">1.产品POP提出申请</span>
			</h2>
			<div id="SUBFORM-T00000-1-${id_suffix}" class="textBoxFrom">
				<div style="font-size: 13px; margin: 1%">
					<!-- <span style="color: #f25aef; font-size: 17px;; margin: auto" width="98%">请先选择IPMT、研发产品线、产品：</span> -->
					<table class="product" id="tabPr${id_suffix}" border="1" cellspacing="0" width="100%" style="margin: auto">
						<tr>
							<td class="text-right" style="width: 7%">IPMT:</td>
							<td style="width: 17%">
								<input name="plipmtno" style="width: 96%; height: 30px;" id="plipmtno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/Releaselist?type=PI&UpperCode=&code=',required:true,missingMessage:'请选择IPMT'"
									class="easyui-combobox" />
							</td>
							<td class="text-right" style="width: 9%">研发产品线:</td>
							<td width="17%">
								<input name="prodlineno" style="width: 96%; height: 30px;" id="prodlineno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/Releaselist?type=PL&UpperCode=&code=',required:true,missingMessage:'请选择研发产品线'"
									Class="easyui-combobox" />
							</td>
							<td class="text-right" style="width: 8%">产品:</td>
							<td width="17%">
								<input name="productno" style="width: 96%; height: 30px;" id="productno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/Releaselist?type=PP&UpperCode=&code=',required:true,missingMessage:'请选择产品'"
									class="easyui-combobox" />
							</td>
							<td class="text-right" style="width: 8%">V版本:</td>
							<td width="17%">
								<input name="versionno" style="width: 96%; height: 30px;" id="versionno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/Releaselist?type=PV&UpperCode=&code=',required:true,missingMessage:'请选择V版本'"
									class="easyui-combobox" />
							</td>
						</tr>
						<tr>
							<td class="text-right" style="width: 8%">R版本:</td>
							<td width="17%">
								<input name="releaseno" style="width: 96%; height: 30px;" id="releaseno${id_suffix}"
									data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/Releaselist?type=PR&UpperCode=&code=',required:true,missingMessage:'请选择R版本'"
									class="easyui-combobox" />
							<td colspan="6">
								<a href="#" class="easyui-linkbutton" id="copyComboboxRelease" name="copyComboboxRelease" onclick="selectComboboxProject${id_suffix}();">选择版本</a>
							</td>
						</tr>
						<%-- <tr>
							<td width="20%">B版本:</td>
							<td width="80%">
								<input type="text" class="easyui-textbox" name="bversion" id="bversionnoText${id_suffix}" data-options="" />
								<input type="hidden" name="bversionno" id="bversionno${id_suffix}" />
								<button type="button" onclick="selectProject${id_suffix}()">..</button>
								<span>（提醒：申请了B版本的Sn后，原R版本的Sn将失效）</span>
							</td>
						</tr>
						<tr>
							<td width="20%">是否打包申请:</td>
							<td width="80%">
								<input type="checkbox" name="isPack" value="0" id="isPack${id_suffix}" />
								是
							</td>
						</tr> --%>
					</table>
				</div>
				<br>
				<div style="margin-left: 1%">
					<table id="tbl_Sn${id_suffix}" class="easyui-datagrid"></table>
				</div>
				<div style="margin: 1%">
					<table class="product" border="1" cellspacing="0" width="100%" style="margin: auto;">
						<tr style="height: 28px;">
							<td>Sn申请模板:</td>
							<td colspan="2">
								<a style="cursor: pointer;" href="excel/难度系数及DI计算方法.xls">产品难度系数申请模板</a>
								&nbsp;&nbsp;
								<a style="cursor: pointer;" href="excel/模板_硬件难度系数申请表 .xls">硬件难度系数申请模板</a>
							</td>
						</tr>
						<tr>
							<td width="9%">产品Sn附件:</td>
							<td width="41%">
								<%-- <a href="#" id="fileContent_Prod_${id_suffix}" onclick="downloadFile${id_suffix}('Prod')"></a> --%>

								<input id="basisMaterial_Prod_${id_suffix}" name="prodBasismaterial" type="hidden" />
								<input id="basisMaterialId_Prod_${id_suffix}" name="prodBasismaterialid" type="hidden" />
								<button type="button" id="btn_Prod_${id_suffix}" onclick="layoutFileWin${id_suffix}('Prod')">&nbsp;&nbsp;&nbsp;</button>
								<%-- <a href="#" id="deleteFile_Prod_${id_suffix}" onclick="deleteFile${id_suffix}('Prod')"></a> --%>
							</td>
							<td width="9%">产品Sn附件说明:</td>
							<td width="41%">
								<input name="prosnremark" style="width: 85%; height: 30px;" id="prosnremark${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
						</tr>
						<tr>
							<td width="9%">硬件Sn附件:</td>
							<td width="41%">
								<%-- <a href="#" id="fileContent_Hard_${id_suffix}" onclick="downloadFile${id_suffix}('Hard')"></a> --%>
								<input id="basisMaterial_Hard_${id_suffix}" name="hardBasismaterial" type="hidden" />
								<input id="basisMaterialId_Hard_${id_suffix}" name="hardBasismaterialid" type="hidden" />
								<button type="button" id="btn_Hard_${id_suffix}" onclick="layoutFileWin${id_suffix}('Hard')">&nbsp;&nbsp;&nbsp;</button>
								<%-- <a href="#" id="deleteFile_Hard_${id_suffix}" onclick="deleteFile${id_suffix}('Hard')"></a> --%>
							</td>
							<td width="9%">硬件Sn附件说明:</td>
							<td width="41%">
								<input name="hardsnremark" style="width: 85%; height: 30px;" id="hardsnremark${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
						</tr>
						<%-- <tr>
							<td width="20%">产品Sn附件说明:</td>
							<td width="80%">
								<input name="prosnremark" style="width: 50%; height: 30px;" id="prosnremark${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
						</tr>
						<tr>
							<td width="20%">硬件Sn附件说明:</td>
							<td width="80%">
								<input name="hardsnremark" style="width: 50%; height: 30px;" id="hardsnremark${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox" />
							</td>
						</tr> --%>
						<tr>
							<td width="9%">抄送人员:</td>
							<td colspan="3">
								<input name="copyto" style="width: 45%; height: 30px;" id="copyto${id_suffix}" value="" size="30" type="" data-options="" class="auto_selusers_true" />
							</td>
						</tr>
						<tr>
							<td width="7%">备注:</td>
							<td colspan="3">
								<div>
									<input name="remark" style="width: 45%; height: 30px;" id="remark${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox " />
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
							</td>
						</tr>

					</table>
				</div>
				<br>
				<br>				
			</div>
			<h2 class="subfild" id="T00000-2-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-2-${id_suffix}')">
				<span style="width: 16%">2.质量管理部经理给出难度系数</span>
			</h2>
			<div id="SUBFORM-T00000-2-${id_suffix}">
				<div style="font-size: 13px; margin: 1%;">
					<div>

						审批意见:

						<input name="mgnOpinion" style="width: 45%; height: 30px;" id="mgnOpinion${id_suffix}" value="" size="30" data-options="readonly:true" class="easyui-textbox" />

						<a href="#" id="btn_MgnAgree${id_suffix}" class=" easyui-linkbutton" onclick="check${id_suffix}('1','mgn')"
							style="color: white; background-color: #3498DB; height: 30px; margin: 0PX 1% 0px 1%">同意</a>
						<a href="#" id="btn_MgnBack${id_suffix}" class=" easyui-linkbutton" onclick="check${id_suffix}('0','mgn')" style="color: #3498DB; background-color: white; height: 30px;">驳回</a>
						<span style="font-size: 14px; margin-left: 4%">
							签名：
							<ibds:userAccount account="${mgnSign}" />
						</span>
						<span style="font-size: 14px; margin-left: 6%;">
							时间:
							<fmt:formatDate value="${mgnDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						</span>
					</div>
				</div>
				<br>
			</div>			
			<h2 class="subfild" id="T00000-3-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-3-${id_suffix}')">
				<span style="width: 16%">3.运作与质量管理部部长审批</span>
			</h2>
			<div id="SUBFORM-T00000-3-${id_suffix}">
				<div style="font-size: 13px; margin: 1%;">
					<div>

						审批意见:

						<input name="qualityOpinion" style="width: 45%; height: 30px;" id="qualityOpinion${id_suffix}" value="" size="30" data-options="readonly:true" class="easyui-textbox" />

						<a href="#" id="btn_QualityAgree${id_suffix}" class="easyui-linkbutton" onclick="check${id_suffix}('1','quality')"
							style="color: white; background-color: #3498DB; height: 30px; margin: 0PX 1% 0px 1%">同意</a>
						<a href="#" id="btn_QualityBack${id_suffix}" class="easyui-linkbutton" onclick="check${id_suffix}('0','quality')"
							style="color: #3498DB; background-color: white; height: 30px;">驳回</a>

						<span style="font-size: 14px; margin-left: 4%">
							签名：
							<ibds:userAccount account="${qualitySign}" />
						</span>
						<span style="font-size: 14px; margin-left: 6%;">
							时间:
							<fmt:formatDate value="${qualityDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						</span>
					</div>
				</div>
				<br>
			</div>
			
			<h2 class="subfild" id="T00000-4-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-4-${id_suffix}')">
				<span style="width: 16%">4.IPMT执行秘书审核并处理</span>
			</h2>
			<div id="SUBFORM-T00000-4-${id_suffix}">
				<div style="font-size: 13px; margin: 1%;">
					<div>

						审批意见:

						<input name="ipmtOpinion" style="width: 45%; height: 30px;" id="ipmtOpinion${id_suffix}" value="" size="30" data-options="readonly:true" class="easyui-textbox" />

						<a href="#" id="btn_IPMTAgree${id_suffix}" class="easyui-linkbutton" onclick="check${id_suffix}('1','IPMT')"
							style="color: white; background-color: #3498DB; height: 30px; margin: 0PX 1% 0px 1%">同意</a>
						<a href="#" id="btn_IPMTBack${id_suffix}" class="easyui-linkbutton" onclick="check${id_suffix}('0','IPMT')" style="color: #3498DB; background-color: white; height: 30px;">驳回</a>

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
				<br />
			</div>

		</form>
		
		<h2 class="subfild" id="T00000-5-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-5-${id_suffix}')">
			<span style="width: 16%">管理区段</span>
		</h2>
		<div id="SUBFORM-T00000-5-${id_suffix}" style="display: none; height: 40px;">
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
		<h2 class="subfild" id="T00000-6-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-6-${id_suffix}')" style="margin-top: 10px;">
			<span class="subfild_span">处理记录</span>
		</h2>
		<div id="SUBFORM-T00000-6-${id_suffix}" style="display: none;">
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
			<br />
			<hr>
		</div>
	</div>
	<br />
	<br />
	<br />
	<!--上传文件（多选）-->
	<div id="baseInfoFile${id_suffix}" class="easyui-window" title="上传文件" style="width: 400px; height: 200px" data-options="iconCls:'icon-save',modal:true,closed:true">
		<input id="current_file_type${id_suffix}" type="hidden" value="" />
		<form id="baseInfoFileForm${id_suffix}" method="post" enctype="multipart/form-data">
			<br>
			<br>
			<table width="100%">
				<tr>
					<td width="88%" align="center">
						<input id="file${id_suffix}" name="file" class="easyui-filebox" data-options="buttonText:'选择文件',required:true,multiple:true" style="width: 300px">
					</td>
				</tr>
				<tr>
					<td align="center">
						<br>
						<div>
							<a href="#" class="easyui-linkbutton" onclick="confirmFile${id_suffix}();" id="confirmFile${id_suffix}">确认</a>
							<a href="#" class="easyui-linkbutton" onclick="cancleFile${id_suffix}();" id="cancleFile${id_suffix}">取消</a>
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="winparentrelease${id_suffix}" title="产品信息" style="display: none; width: 1100px; height: 600px; overflow: visible;">
		<span>项目状态:</span>
		&nbsp;
		<input id="projectStatu${id_suffix }" name="projectStatu" class="easyui-combobox ui-text" type="text" value="" style="width: 120px" />
		&nbsp; &nbsp;
		<input id="searchParasRelease${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%;" />
		&nbsp;
		<a id="btnRelease${id_suffix}" href="#" class="easyui-linkbutton default" onclick="btnSearchRelease${id_suffix}();">搜 索 </a>
		&nbsp;
		<form id="selparentrelease${id_suffix}" method="post" style="height: 100%; overflow: hidden;">
			<table id="parentrelease${id_suffix}" style="height: 100%; overflow: hidden;">
			</table>
		</form>
	</div>
	</div>
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<style type="text/css">
.textBoxFrom .textbox {
	margin: 5px 0px !important;
}

.subfild_span {
	width: 16%;
}
</style>
	<script>
	//状态，为处理展开当前节点
	var isExpandALl${id_suffix}=false;
	var exeandAll_ID${id_suffix}='';
	$(function(){	
		
		//多个人员联想
		 if($("#diffC${id_suffix} input[class*='auto_selusers_true']").length>0){
	  	 $("#diffC${id_suffix} input[class*='auto_selusers_true']").each(function(index,element){
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
		
		setTabFlodOrOpen('T00000-1-${id_suffix}',true);
		setTabFlodOrOpen('T00000-2-${id_suffix}',true);
		setTabFlodOrOpen('T00000-3-${id_suffix}',true);
		setTabFlodOrOpen('T00000-4-${id_suffix}',true);
		setTabFlodOrOpen('T00000-5-${id_suffix}',false);
		setTabFlodOrOpen('T00000-6-${id_suffix}',false);
		
		//新增选择版本后  禁用下拉框内容
		/*   $("#tabPr${id_suffix} input[class*='easyui-combobox']").each(function(index,element){
				$(this).combobox({readonly:true});
		  }); */
		
		//选择版本 R版本状态
		//项目状态下拉框初始化
		$("#projectStatu${id_suffix }").combobox({
			valueField : 'statuValue',
			textField : 'statuText',
			panelHeight : 'auto',
			multiple:true,
			editable:false,
			formatter: function (row) {
				 var opts = $(this).combobox('options');
				 if(row.statuValue==""||row.statuValue=="undefined"||row.statuValue==null){
					 return "";
				 }
				 return '<input type="checkbox" class="combobox-checkbox"> ' + row[opts.textField]
			},  onSelect: function (row) {
				                    var opts = $(this).combobox('options');
				                    var el = opts.finder.getEl(this, row[opts.valueField]);
				                    el.find('input.combobox-checkbox')._propAttr('checked', true);
				                },
				                onUnselect: function (row) {
				                    var opts = $(this).combobox('options');
				                    var el = opts.finder.getEl(this, row[opts.valueField]);
				                    el.find('input.combobox-checkbox')._propAttr('checked', false);
				                }
		});
		
		var data = [];//创建数组
		//数组添加值
		
		
		data.push({
			"statuValue" : "在研",
			"statuText" : "在研"
		});
		data.push({
			"statuValue" : "终止",
			"statuText" : "终止"
		});
		
		data.push({
			"statuValue" : "挂起",
			"statuText" : "挂起"
		});
		data.push({
			"statuValue" : "无",
			"statuText" : "无状态"
		});
		
		
		$("#projectStatu${id_suffix }").combobox({
			data: data,
			onLoadSuccess:function(){
				$("#projectStatu${id_suffix }").combobox("select","在研");
			}});//下拉框加载数据
		//页面控制
		pageControl${id_suffix}();
		initgrid${id_suffix}();
		
		var id = "${id}";
		if (id!=null&&id!=undefined&&id!='') {
			$("#mainUrl").tabs("loading","loading...");
			/* $.messager.progress({
				msg:'loading...'
			}); */
			$.post('/basicinfo/DifficultyCoefficient/getDiffByID/'+id, function(result) {
				$('#diffApply${id_suffix}').form('load', result.data);
				$("#applyID${id_suffix}").val(result.data.id);
				$("#processID${id_suffix}").val(result.data.processid);
				$('#tbl_Sn${id_suffix}').datagrid('reload',{diffid:id});
				if(result.data.prodBasismaterial!=null&&result.data.prodBasismaterial!=""){
	            	 var arrFileName=result.data.prodBasismaterial.split(",");
	            	 var arrFileID=result.data.prodBasismaterialid.split(",");
	            	 $.each(arrFileName,function(i,item){
	            		var _html= "<a href=\"#\"  onclick=\"downloadFile${id_suffix}('"+item+"','"+arrFileID[i]+"')\">"+item+"</a>&nbsp&nbsp";
	   	             		
	            		if("${currentNode=='usertask1' && isHandler || isEdit == 'editable'}"=="true"
	            				||"${currentNode=='usertask2' && isHandler || isEdit == 'editable'}"=="true"){
	            			_html+="<a href=\"#\" id=\"deleteFile_Prod_${id_suffix}\" onclick=\"deleteFile${id_suffix}(this,'"+item+"','"+arrFileID[i]+"','Prod')\">删除</a>&nbsp&nbsp";
	    				}
	   	             	$("#basisMaterial_Prod_${id_suffix}").parent("td").append(_html);	
	            	 });
	             }
				if(result.data.hardBasismaterial!=null&&result.data.hardBasismaterial!=""){
	            	 var arrFileName=result.data.hardBasismaterial.split(",");
	            	 var arrFileID=result.data.hardBasismaterialid.split(",");
	            	 $.each(arrFileName,function(i,item){
	            		var _html= "<a href=\"#\"  onclick=\"downloadFile${id_suffix}('"+item+"','"+arrFileID[i]+"')\">"+item+"</a>&nbsp&nbsp";
	   	             		
	   	             	if("${currentNode=='usertask1' && isHandler || isEdit == 'editable'}"=="true"
	   	             			||"${currentNode=='usertask2' && isHandler || isEdit == 'editable'}"=="true"){
	   	             		_html+="<a href=\"#\" id=\"deleteFile_Prod_${id_suffix}\" onclick=\"deleteFile${id_suffix}(this,'"+item+"','"+arrFileID[i]+"','Hard')\">删除</a>&nbsp&nbsp";
	   	             	}
	   	             	$("#basisMaterial_Hard_${id_suffix}").parent("td").append(_html);	
	            	 });
	             }	
				
				if(result.data.remark!=null){
					$('#remark${id_suffix}').parents('td').find('input').attr('title',result.data.remark);
				}
				if(result.data.mgnOpinion!=null){
					$('#mgnOpinion${id_suffix}').parents('td').find('input').attr('title',result.data.mgnOpinion);
				}
				if(result.data.qualityOpinion!=null){
					$('#qualityOpinion${id_suffix}').parents('td').find('input').attr('title',result.data.qualityOpinion);
				}
				if(result.data.ipmtOpinion!=null){
					$('#ipmtOpinion${id_suffix}').parents('td').find('input').attr('title',result.data.ipmtOpinion);
				}
				//$.messager.progress('close');
				$("#mainUrl").tabs("loaded");
			}); 
		}
		
		//绑定下拉框联动事件
		initVRCombox${id_suffix}();
		
		$('#btnSave${id_suffix}').linkbutton({    
		    iconCls: 'fa fa-save',
		    onClick: postSaveDraft${id_suffix}
		});
		$('#btnsubmit${id_suffix}').linkbutton({    
		    iconCls: 'fa fa-save',
		    onClick: postSave${id_suffix}
		});
	});

	function pageControl${id_suffix}(){
		//无编辑权限，页面无法编辑
		if("${currentNode=='usertask1' && isHandler || isEdit == 'editable'}"=="true"){
			$("#btn_MgnAgree${id_suffix}").hide();
			$("#btn_MgnBack${id_suffix}").hide();			
			$("#btn_QualityAgree${id_suffix}").hide();
			$("#btn_QualityBack${id_suffix}").hide();
			$("#btn_IPMTAgree${id_suffix}").hide();
			$("#btn_IPMTBack${id_suffix}").hide();
			if(('${state}'!=0&&'${state}'!=-1)||'${state}'==''){
				$("#btnDel${id_suffix}").hide();	
			}			
		}else if("${currentNode=='usertask2' && isHandler || isEdit == 'editable'}"=="true"){
			$("#btnDel${id_suffix}").hide();
			$("#tabPr${id_suffix} tr td").removeAttr('onclick');
			$("#copyComboboxRelease").hide();
			$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");
		 	/* $("#btn_Prod_${id_suffix}").hide();
			$("#btn_Hard_${id_suffix}").hide(); */
			$("#mgnOpinion${id_suffix}").textbox({readonly:false});
			$("#btn_QualityAgree${id_suffix}").hide();
			$("#btn_QualityBack${id_suffix}").hide();		
			$("#btn_IPMTAgree${id_suffix}").hide();
			$("#btn_IPMTBack${id_suffix}").hide();
			$("#btnsubmit${id_suffix}").hide();
		}else if("${currentNode=='usertask3' && isHandler || isEdit == 'editable'}"=="true"){
			$("#btnDel${id_suffix}").hide();
			$("#tabPr${id_suffix} tr td").removeAttr('onclick');
			$("#copyComboboxRelease").hide();
			$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");		
			$("#btn_Prod_${id_suffix}").hide();
			$("#btn_Hard_${id_suffix}").hide();
			$("#btn_MgnAgree${id_suffix}").hide();
			$("#btn_MgnBack${id_suffix}").hide();
			$("#qualityOpinion${id_suffix}").textbox({readonly:false});			
			$("#btn_IPMTAgree${id_suffix}").hide();
			$("#btn_IPMTBack${id_suffix}").hide();
			$("#btnsubmit${id_suffix}").hide();debugger
			$("#tbl_Sn${id_suffix}").find("button").hide();
		}else if("${currentNode=='usertask4' && isHandler || isEdit == 'editable'}"=="true"){
			$("#btnDel${id_suffix}").hide();
			$("#tabPr${id_suffix} tr td").removeAttr('onclick');
			$("#copyComboboxRelease").hide();
			$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");
			$("#btn_Prod_${id_suffix}").hide();
			$("#btn_Hard_${id_suffix}").hide();
			$("#btn_MgnAgree${id_suffix}").hide();
			$("#btn_MgnBack${id_suffix}").hide();
			$("#btn_QualityAgree${id_suffix}").hide();
			$("#btn_QualityBack${id_suffix}").hide();
			$("#ipmtOpinion${id_suffix}").textbox({readonly:false});
			$("#btnsubmit${id_suffix}").hide();
			$("#tbl_Sn${id_suffix}").find("button").hide();
		}else{
			$("#btnDel${id_suffix}").hide();
			$("#tabPr${id_suffix} tr td").removeAttr('onclick');
			$("#copyComboboxRelease").hide();
			$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");
			$("#btn_Prod_${id_suffix}").hide();
			$("#btn_Hard_${id_suffix}").hide();
			$("#btn_MgnAgree${id_suffix}").hide();
			$("#btn_MgnBack${id_suffix}").hide();		
			$("#btn_QualityAgree${id_suffix}").hide();
			$("#btn_QualityBack${id_suffix}").hide();
			$("#btn_IPMTAgree${id_suffix}").hide();
			$("#btn_IPMTBack${id_suffix}").hide();
			$("#btnsubmit${id_suffix}").hide();
			$("#tbl_Sn${id_suffix}").find("button").hide();
			
		}
		
		if('${isChangeUser}'!='true'){
			$("#btn_changeHandler${id_suffix}").parent("div").hide();
		}
	}
	
	function initgrid${id_suffix}(){
		$("#tbl_Sn${id_suffix}").datagrid({
			url:'/basicinfo/DifficultyCoefficient/dataList',  
			//rownumbers : true,
			width:'95%',
			singleSelect : true,
			fitColumns:true,
			pagination : false,
			toolbar : [
				{
					text : '增行',
					//iconCls : 'icon-add',
					handler : function() {	
						var rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");
						$("#tbl_Sn${id_suffix}").datagrid("insertRow", {
							index :rows==null||rows==undefined?0:rows.length,
							row : {id:'',bversionno:'',bversion:'',prodifficult:'',harddifficult:''}
						});					
						
						rowNumber = rows==null||rows==undefined?0:$("#tbl_Sn${id_suffix}").datagrid(
								"getRowIndex", rows[rows.length-1]);							
						$("#tbl_Sn${id_suffix}").datagrid("beginEdit",rowNumber);
					}
				},
				{
					text:'删行',
					//iconCls:'icon-save',
					handler:function(){
						//var rows = $('#tbl_Sn${id_suffix}').datagrid("getRows");
						var hasSelect = $("#tbl_Sn${id_suffix}").datagrid("getSelections");
						if(hasSelect!=null&&hasSelect.length>0){
							var index=$("#tbl_Sn${id_suffix}").datagrid("getRowIndex",hasSelect[0]);
							$('#tbl_Sn${id_suffix}').datagrid("deleteRow", index);
							
							unEditGrid${id_suffix}();							
							//获取当前列表数据
							var rows = $('#tbl_Sn${id_suffix}').datagrid("getRows");
							//重新加载列表数据
							$('#tbl_Sn${id_suffix}').datagrid("loadData", rows);
							editGrid${id_suffix}();
						}else{
							 $.messager.alert("提示信息","请选择要移除的列！");
						}
					}
				}
			],
		    columns:[[   
		    	{field:'id',title:'主键',hidden:true,width:100}, 
		    	{field:'_operate',width:80,align:'center',formatter:formatOper${id_suffix}},
		    	{field:'bversion',title:'B版本',width:100}, 
		    	{field:'bversionno',title:'B版本编码',width:100},  
		        {field:'prodifficult',title:'产品Sn（请用数字格式，填写新增或修改后的值）',width:100,
		    		editor:{type:'combobox',
						options:{
							editable:false,data:[
							{'id':'','text':'请选择'},
							{'id':'0.15','text':'0.15'},
							{'id':'0.2','text':'0.2'},
							{'id':'0.3','text':'0.3'},
							{'id':'0.4','text':'0.4'},
							{'id':'0.5','text':'0.5'},
							{'id':'0.6','text':'0.6'},
							{'id':'0.7','text':'0.7'},
							{'id':'0.8','text':'0.8'},
							{'id':'0.9','text':'0.9'},
							{'id':'1','text':'1'},
							],
							valueField : "id",
							textField : "text"}
					}
		    		/* editor : {
					type : 'numberbox',					
					options : {min:0,max:1,precision:2,required:false,missingMessage:"请用数字格式，填写新增或修改后的值"}},
					formatter: function(value,row,index){
						if(value==undefined||value==null||value==0)return '';
						return value;
					} */
		        },    
		        {field:'harddifficult',title:'硬件Sn（请用数字格式，填写新增或修改后的值）',width:100,
		        	editor:{type:'combobox',
						options:{
							editable:false,data:[
							{'id':'','text':'请选择'},
							{'id':'0.15','text':'0.15'},
							{'id':'0.2','text':'0.2'},
							{'id':'0.3','text':'0.3'},
							{'id':'0.4','text':'0.4'},
							{'id':'0.5','text':'0.5'},
							{'id':'0.6','text':'0.6'},
							{'id':'0.7','text':'0.7'},
							{'id':'0.8','text':'0.8'},
							{'id':'0.9','text':'0.9'},
							{'id':'1','text':'1'},
							],
							valueField : "id",
							textField : "text"}
					}
		        	/* editor : {
					type : 'numberbox',					
					options : {min:0,max:1,precision:2,required:false,missingMessage:"请用数字格式，填写新增或修改后的值"}},
					formatter: function(value,row,index){
						if(value==undefined||value==null||value==0)return '';
						return value;
					} */
		        }    
		    ]],
			onLoadSuccess:function(data){  
				if("${(currentNode=='usertask1'||currentNode=='usertask2') && isHandler || isEdit == 'editable'}"=="true"){
					var rows = data.rows;
					if(rows==null||rows.length==0){
						$("#tbl_Sn${id_suffix}").datagrid("insertRow", {
							index :rows==null||rows==undefined?0:rows.length,
							row : {id:'',bversionno:'',bversion:'',prodifficult:'',harddifficult:''}
						});							
					}
					
					editGrid${id_suffix}();					
				}else{
					$("#SUBFORM-T00000-1-${id_suffix} .datagrid-toolbar ").hide();
				}
        	}
		});
	}

	function formatOper${id_suffix}(val,row,index){  
		if("${(currentNode=='usertask1' ||currentNode=='usertask2') && isHandler || isEdit == 'editable'}"=="true"){
			return '<a  class="easyui-linkbutton l-btn l-btn-small"  onclick="selectProject${id_suffix}('+index+')" '
			+'data-options=""><span class="l-btn-left" style="margin-top: 3px;"> <span class="l-btn-text">选择B版本</span></span></a>'
		}
		return;
		
	} 
	
	//checkbox隐藏显示
	function tableShowOrHide(obj,hide_id){
		if($(obj).is(':checked')){
			$("#"+hide_id).show();
			//重新刷新样式
			$.parser.parse($("#"+hide_id));				
		}else{
			$("#"+hide_id).hide();
		}
	}
	
	function tabShowOrHide(id){
		$("#"+id).toggle();	
		if($('#'+id).css('display')=='none'){
			setTabFlodOrOpen(id.replace('SUBFORM-',''),false);
		}else{
			setTabFlodOrOpen(id.replace('SUBFORM-',''),true);
		}
	}
	
	function initVRCombox${id_suffix}(){
		$("#plipmtno${id_suffix}").combobox({
			onSelect: function (rec) {
				//if(index__ != 0 && $('#btn_test${id_suffix}').val() != 1){
				$('#prodlineno${id_suffix}').combobox("clear");
				$('#productno${id_suffix}').combobox("clear");
				$('#versionno${id_suffix}').combobox("clear");
				$('#releaseno${id_suffix}').combobox("clear");
				//}
                 var url = '/product/comboboxdata/Releaselist?type=PL&UpperCode=&code=' + rec.value+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue");
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
		 var index__ = 0;
		$("#prodlineno${id_suffix}").combobox({
			onSelect: function (rec) {        
				//清空下拉框值，实现强级联
		 		var productnoSel=$('#productno${id_suffix}').combobox("getValue");
		 		if(index__ != 0 && $('#btn_test${id_suffix}').val() != 1){
					$('#productno${id_suffix}').combobox("clear");
					$('#versionno${id_suffix}').combobox("clear");
					$('#releaseno${id_suffix}').combobox("clear");
					}
		 		var upperNo=$("#plipmtno${id_suffix}").combobox("getValue")+"_";
                 var url = '/product/comboboxdata/Releaselist?type=PP&UpperCode='+upperNo+rec.value+'&code=' + rec.value+'&sub_code=' + $('#productno${id_suffix}').combobox("getValue");
                $('#productno${id_suffix}').combobox('reload', url); 
            	// 1 级联选择   2.继承复制 3.选择版本4.修改流程
		    	if(index__ == 0 || $('#btn_test${id_suffix}').val() == 1){
		    		$('#productno${id_suffix}').combobox("select",productnoSel);
		    		index__++;
		    		$('#btn_test${id_suffix}').val(0); 
		    		
		    	}
            },onLoadSuccess:function(){
            	
					//创建继承
				if('${obj_fields}' != ""){
				 <%if( obj_fields.contains("prodlineno,")  ) { %> //2.选择版本
				 var prodlineno;
				if('${apply}'!=""&&'${apply.prodlineno}'!=""){
					prodlineno='${apply.prodlineno}';
				}
				var allData=$("#prodlineno${id_suffix}").combobox("getData");
				if(allData!="[]"){
				for (var i = 0; i < allData.length; i++) {
					if (prodlineno == allData[i]["value"]) {
                        $("#prodlineno${id_suffix}").combobox('select',prodlineno); 
                        break;
              		 }

				}
				}
				//$("#prodlineno${id_suffix}").combobox('select',prodlineno);   
				<%}%>
					}else{
				 var prodlineno;
					if('${viewDiffProcess.prodlineno}'!=""){
						prodlineno='${viewDiffProcess.prodlineno}';
					}
					var allData=$("#prodlineno${id_suffix}").combobox("getData");
					if(allData!="[]"){
					for (var i = 0; i < allData.length; i++) {
						if (prodlineno == allData[i]["value"]) {
                            $("#prodlineno${id_suffix}").combobox('select',prodlineno); 
                            break;
                  		 }

					}
					}
					}
				
            }
		});
		 var index1__=0;
		$("#productno${id_suffix}").combobox({
			onSelect: function (rec) {   
				//清空下拉框值，实现强级联
				 var versionnoSel=$('#versionno${id_suffix}').combobox("getValue");
				 if(index1__ != 0 && $('#btn_test1${id_suffix}').val() != 1){
						$('#versionno${id_suffix}').combobox("clear");
						$('#releaseno${id_suffix}').combobox("clear");
						}
				 var upperNo=$('#plipmtno${id_suffix}').combobox("getValue")+"_"+$('#prodlineno${id_suffix}').combobox("getValue")+"_";
				 var url = '/product/comboboxdata/Releaselist?type=PV&UpperCode='+upperNo+rec.value+'&code=' + rec.value+'&sub_code=' + $('#versionno${id_suffix}').combobox("getValue");            	
                $('#versionno${id_suffix}').combobox('reload', url); 
                if(index1__ == 0 || $('#btn_test1${id_suffix}').val() == 1){
		    		$('#versionno${id_suffix}').combobox("select",versionnoSel);
		    		index1__++;
		    		$('#btn_test1${id_suffix}').val(0); 
		    		
		    	}
            },onLoadSuccess:function(){
            	
					//创建继承
					if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("productno,")  ) { %>
					  var productno;
					if('${apply}'!=""&&'${apply.productno}'!=""){
						productno='${apply.productno}';
					}
					var allData=$("#productno${id_suffix}").combobox("getData");
					if(allData!="[]"){
					for (var i = 0; i < allData.length; i++) {
						if (productno == allData[i]["value"]) {
                            $("#productno${id_suffix}").combobox('select',productno); 
                            break;
                  		 }

					}
					}
					//$("#productno${id_suffix}").combobox('select',productno);   
					<%}%>
					}else{
						var productno;
						if('${viewDiffProcess.productno}'!=""){
							productno='${viewDiffProcess.productno}';
						}
						var allData=$("#productno${id_suffix}").combobox("getData");
						if(allData!="[]"){
						for (var i = 0; i < allData.length; i++) {
							if (productno == allData[i]["value"]) {
	                            $("#productno${id_suffix}").combobox('select',productno); 
	                            break;
	                  		 }

						}
						}
					}
				
            }
		});
		 var index2__=0;
		$("#versionno${id_suffix}").combobox({
			onSelect: function (rec) {           
				 var releasenoSel=$('#releaseno${id_suffix}').combobox("getValue");
					//清空下拉框值，实现强级联
				 if(index2__ != 0 && $('#btn_test2${id_suffix}').val() != 1){
						$('#releaseno${id_suffix}').combobox("clear");
						}
				 var upperNo=$('#plipmtno${id_suffix}').combobox("getValue")+"_"+$('#prodlineno${id_suffix}').combobox("getValue")+"_"+$('#productno${id_suffix}').combobox("getValue")+"_";
					var url = '/product/comboboxdata/Releaselist?type=PR&UpperCode='+upperNo+rec.value+'&code=' + rec.value+'&sub_code=' + $('#releaseno${id_suffix}').combobox("getValue");            	
                $('#releaseno${id_suffix}').combobox('reload', url); 
                if(index2__ == 0 || $('#btn_test2${id_suffix}').val() == 1){
		    		$('#releaseno${id_suffix}').combobox("select",releasenoSel);
		    		index2__++;
		    		$('#btn_test2${id_suffix}').val(0); 
		    		
		    	}
            },onLoadSuccess:function(){
            	
					//创建继承
					if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("versionno,")  ) { %>
					  var versionno;
					if('${apply}'!=""&&'${apply.versionno}'!=""){
						versionno='${apply.versionno}';
					}
					//$("#versionno${id_suffix}").combobox('select',versionno);  
					var allData=$("#versionno${id_suffix}").combobox("getData");
					if(allData!="[]"){
					for (var i = 0; i < allData.length; i++) {
						if (versionno == allData[i]["value"]) {
                            $("#versionno${id_suffix}").combobox('select',versionno); 
                            break;
                  		 }

					}
					}
					<%}%>
					}else{
						var versionno;
						if('${viewDiffProcess.versionno}'!=""){
							versionno='${viewDiffProcess.versionno}';
						}
						var allData=$("#versionno${id_suffix}").combobox("getData");
						if(allData!="[]"){
						for (var i = 0; i < allData.length; i++) {
							if (versionno == allData[i]["value"]) {
	                            $("#versionno${id_suffix}").combobox('select',versionno); 
	                            break;
	                  		 }

						}
						}
					}
				
            }
		});
		$("#releaseno${id_suffix}").combobox({
			onLoadSuccess:function(){
				//创建继承
				if('${obj_fields}' != ""){
			 <%if( obj_fields.contains("releaseno,")  ) { %>
			 	 var releaseno;
				if('${apply}'!=""&&'${apply.releaseno}'!=""){
					releaseno='${apply.releaseno}';
				}
				var allData=$("#releaseno${id_suffix}").combobox("getData");
				if(allData!="[]"){
				for (var i = 0; i < allData.length; i++) {
					if (releaseno == allData[i]["value"]) {
                        $("#releaseno${id_suffix}").combobox('select',releaseno); 
                        break;
              		 }

				}
				}
				<%}%>
				}else{
					var releaseno;
					if('${viewDiffProcess.releaseno}'!=""){
						releaseno='${viewDiffProcess.releaseno}';
					}
					var allData=$("#releaseno${id_suffix}").combobox("getData");
					if(allData!="[]"){
					for (var i = 0; i < allData.length; i++) {
						if (releaseno == allData[i]["value"]) {
                            $("#releaseno${id_suffix}").combobox('select',releaseno); 
                            break;
                  		 }

					}
					}
				}
				
        }
	});
	}
	
	//展开折叠所有   isShow：true：默认展开，false：默认折叠
	function tabFlodOrOpen${id_suffix}(isShow){
		$("#SUBFORM-T00000-1-${id_suffix}").toggle(isShow);	
		$("#SUBFORM-T00000-2-${id_suffix}").toggle(isShow);	
		$("#SUBFORM-T00000-3-${id_suffix}").toggle(isShow);	
		$("#SUBFORM-T00000-4-${id_suffix}").toggle(isShow);	
		$("#SUBFORM-T00000-5-${id_suffix}").toggle(isShow);	
		$("#SUBFORM-T00000-6-${id_suffix}").toggle(isShow);
		setTabFlodOrOpen('T00000-1-${id_suffix}',isShow);
		setTabFlodOrOpen('T00000-2-${id_suffix}',isShow);
		setTabFlodOrOpen('T00000-3-${id_suffix}',isShow);
		setTabFlodOrOpen('T00000-4-${id_suffix}',isShow);
		setTabFlodOrOpen('T00000-5-${id_suffix}',isShow);
		setTabFlodOrOpen('T00000-6-${id_suffix}',isShow);
	}
	
	function selectProject${id_suffix}(index){

       if( !$("#releaseno${id_suffix}").combobox("getValue")){    	  
    	   $.messager.alert("提示信息","请先选择对应的产品信息！");
    	   return;
       }
        
       $('#winparentversion${id_suffix}').window({  
		    iconCls:"icon-save",
		    modal:true   
	   }); 
       $("#hid_BversionIndex${id_suffix}").val(index);
       $("#tbl_Bversion${id_suffix}").datagrid({
    		url:'/product/comboboxdata/list',  
			rownumbers : true,
			singleSelect : false,
			fitColumns:true,
			pagination : false,
			queryParams: {
				type: 'PB',
				code: $("#releaseno${id_suffix}").combobox("getValue")
			},			
		    columns:[[   
		    	{field:'value', checkbox:true},
		    	{field:'code',title:'编码',width:100},  
		        {field:'text',title:'B版本',width:100}
		    ]],
		    loadFilter:function(data){		    	
				if(data!=null&&data.length>0){	
					$.each(data,function(i,item){						
						data[i].code=item.value;
					});
					return data;
				}
		    	return data;
			},
		    onLoadSuccess:function(data){  
            	var rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");		           
             	
            	editGrid${id_suffix}();           	
        	}
		});
    }
	
	function confirm${id_suffix}(){
		var index= $("#hid_BversionIndex${id_suffix}").val();
		var checkedItems = $('#tbl_Bversion${id_suffix}').datagrid('getChecked');
		/* var _list=new Array();
		var isPR=false; */
		var code='',name='',message='';
		if(checkedItems!=null&&checkedItems.length>0){
			$.each(checkedItems,function(i,item){
				if(code==""){
					code+=item.value;
					name+=item.text;
				}else{
					code+=","+item.value;
					name+=","+item.text;
				}			
			});
			
			var rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");
			$.each(code.split(','),function(i,item){
				for(var k=0;k<rows.length;k++){
					//要覆盖的当前修改行不判断
					if(k!=index&&rows[k].bversionno!=''&&rows[k].bversionno.indexOf(item)!=-1){
						message+="【"+item+"】本次申请已存在！\n";
					}
				}
			});
						
			if(message!=""){
				$.messager.alert("操作提示",message);
				return;
			}
			
			$('#tbl_Sn${id_suffix}').datagrid('updateRow',{
				index: index,
				row: {
					id:'',
					bversionno: code,
					bversion: name,
					prodifficult:'',
					harddifficult:''
				}
			});
			$("#tbl_Sn${id_suffix}").datagrid("beginEdit",index);
			
			$('#winparentversion${id_suffix}').window("close");
		}
	}
	
	function validateList${id_suffix}(){
		var code="",name="",message="";
		var rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");
		
		$.each(rows,function(index,val){
			var _arr=val.bversionno.split(',');
			$.each(_arr,function(i,item){
				for(var k=0;k<rows.length;k++){
					if(k!=index&&rows[k].bversionno!=''&&rows[k].bversionno.indexOf(item)!=-1&&item!=''){
						message+="【"+item+"】本次申请已存在！\n";
					}
				}				
			});
		});			
			
		return message;
	}
	
	//启用编辑
	function editGrid${id_suffix}(){
		var rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");	
		if($("#isPack${id_suffix}").is(":checked")){
			if(rows.length>0){
				$("#tbl_Sn${id_suffix}").datagrid("beginEdit",0);
			}			
		}else{
			$.each(rows,function(i,item){
				var rowNumber = $("#tbl_Sn${id_suffix}").datagrid("getRowIndex", item);
				$("#tbl_Sn${id_suffix}").datagrid("beginEdit",rowNumber);
			});
		}		
	}
	
	//编辑完成
	function unEditGrid${id_suffix}(){
		var rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");
		$.each(rows,function(i,item){		
			$("#tbl_Sn${id_suffix}").datagrid("endEdit",$("#tbl_Sn${id_suffix}").datagrid("getRowIndex", item));
		});
		
		$.each($('#tbl_Sn${id_suffix}').datagrid("getRows"),function(i,item){
			if(item.prodifficult=='0.00'){
				item.prodifficult='';
			}
			if(item.harddifficult=='0.00'){
				item.harddifficult='';
			}
		});
	}
    
	
	//保存草稿
	function postSaveDraft${id_suffix}(){
		$("#mainUrl").tabs("loading","处理中...");
	
		$('#btnSave${id_suffix}').linkbutton('disable');
		
		//验证草稿状态不存储附件
		if($("#basisMaterial_Prod_${id_suffix}").val()!=""||$("#basisMaterial_Hard_${id_suffix}").val()!=""){
			$('#btnSave${id_suffix}').linkbutton('enable');
			$("#mainUrl").tabs("loaded");
			$.messager.alert("提示","草稿状态无法上传附件！");	
			return;
		}
	
    	$('#diffApply${id_suffix}').form('submit', {
			url : '/basicinfo/DifficultyCoefficient/save',
			onSubmit : function(param) {
				unEditGrid${id_suffix}();
				if ($('#tbl_Sn${id_suffix}').datagrid('getChanges').length) {
					var itemList=$('#tbl_Sn${id_suffix}').datagrid("getRows");
					
					if(itemList.length>0){
						param.itemList=JSON.stringify(itemList);
					}
				 }
				
				param.applyID=$("#applyID${id_suffix}").val();
				param.processID=$("#processID${id_suffix}").val();
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
					/* $.messager.progress('close'); */
					$('#btnSave${id_suffix}').linkbutton('disable');
				
					var tab = $('#mainUrl').tabs('getSelected');		
				    tab.panel('refresh', "/basicinfo/DifficultyCoefficient/edit/"+obj.size);
					
				} else {
					$("#mainUrl").tabs("loaded");
					//$.messager.progress('close');
					$.messager.alert("提示",obj.msg);					
					$('#btnSave${id_suffix}').linkbutton('enable');	
				}	
				 
			},
			error:function(a,b,c){
				$("#mainUrl").tabs("loaded");
				//$.messager.progress('close');
				$.messager.alert("提示",a);
			}
		});
	}
	
	
	function postSave${id_suffix}(){
		$("#mainUrl").tabs("loading","处理中...");
		
		//isPSn 为true需验证产品附件，isHSn 为true需要验证硬件Sn附件
		var errMsg="",isPSn=false,isHSn=false;
		$('#btnsubmit${id_suffix}').linkbutton('disable');
		unEditGrid${id_suffix}();
		
		if($('#tbl_Sn${id_suffix}').datagrid("getRows").length==0){
			$("#mainUrl").tabs("loaded");
			//$.messager.progress('close');
			$.messager.alert("提示信息","请选择B版本，并填写难度系数");			
			editGrid${id_suffix}();	
			return;
		}
		$('#tbl_Sn${id_suffix}').datagrid("getRows")
		errMsg=validateList${id_suffix}();
		if(errMsg!=""){
			$("#mainUrl").tabs("loaded");
			//$.messager.progress('close');
			$.messager.alert("提示信息",errMsg);
			$('#btnsubmit${id_suffix}').linkbutton('enable');
			editGrid${id_suffix}();				
			return;
		}
		
		//修改前给出难度系数修改提示
		var _rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");
		var proCode="",hardCode="";
		$.each(_rows,function(i,item){
			if(item.bversionno==null||item.bversionno==undefined||item.bversionno==''){
				errMsg+="请选择B版本\n";				
			}
			if((item.prodifficult==null||item.prodifficult==undefined||item.prodifficult=='')
					&&(item.harddifficult==null ||item.harddifficult==undefined ||item.harddifficult=='')){
				errMsg+="请填写难度系数\n";
				return false;
			}
			if(item.prodifficult!=null &&item.prodifficult!=undefined &&item.prodifficult!=''){
				if(item.prodifficult==0&&errMsg.indexOf("产品Sn必须大于零")==-1){
					errMsg+="产品Sn必须大于零\n";
				}
				if(parseFloat(item.prodifficult)>0){
					isPSn=true;
				}
				if(proCode==""){
					proCode+=item.bversionno
				}
				else{
					proCode+=","+item.bversionno
				}
			}
			if(item.harddifficult!=null &&item.harddifficult!=undefined &&item.harddifficult!=''){
				if(item.harddifficult==0&&errMsg.indexOf("硬件Sn必须大于零")==-1){
					errMsg+="硬件Sn必须大于零\n";
				}
				if(parseFloat(item.harddifficult)>0){
					isHSn=true;
				}
				if(hardCode==""){
					hardCode+=item.bversionno
				}
				else{
					hardCode+=","+item.bversionno
				}
			}
		
			 
		});
		
		if(errMsg!=""){
			$("#mainUrl").tabs("loaded");
			
			$.messager.alert("提示消息",errMsg);
			$('#btnsubmit${id_suffix}').linkbutton('enable');
			editGrid${id_suffix}();				
			return;
		}
		
		if(isPSn&&$("#basisMaterialId_Prod_${id_suffix}").val()==""){
			$("#mainUrl").tabs("loaded");
			
			$.messager.alert("提示消息","请上传产品Sn附件！");
			$('#btnsubmit${id_suffix}').linkbutton('enable');	
			editGrid${id_suffix}();				
			return;
		}
		if(isHSn&&$("#basisMaterialId_Hard_${id_suffix}").val()==""){
			$("#mainUrl").tabs("loaded");
			
			$.messager.alert("提示消息","请上传硬件Sn附件！");
			$('#btnsubmit${id_suffix}').linkbutton('enable');
			editGrid${id_suffix}();	
			
			return;
		}
		
		var msg="";		
		$.ajax({
			url:"/basicinfo/DifficultyCoefficient/getTipMsg",
			async:false,
			type:"post",
			data:{proCode:proCode,hardCode:hardCode},
			success:function(result){
				msg=result.message;
			}
		});
		
		if(msg!=""&&msg!=null){
			$.messager.confirm({
				width: 600,
			    title: '操作确认',
			    msg: msg,
			    fn: function (r) {
			    	 if(r){
			           	postFormData${id_suffix}();
			         }else{
			           	$('#btnsubmit${id_suffix}').linkbutton('enable');
			           	$("#mainUrl").tabs("loaded");
			           	return;
			         }
			    }
			});			
		}else{
			postFormData${id_suffix}();
		}
	}
	
	function postFormData${id_suffix}(){
		$('#diffApply${id_suffix}').form('submit', {
			url : '/basicinfo/DifficultyCoefficient/submit',
			onSubmit : function(param) {
				unEditGrid${id_suffix}();
				if ($('#tbl_Sn${id_suffix}').datagrid('getChanges').length) {
					
					var itemList=$('#tbl_Sn${id_suffix}').datagrid("getRows");
					
					if(itemList.length>0){
						param.itemList=JSON.stringify(itemList);
					}
				 }
				param.applyID=$("#applyID${id_suffix}").val();
				param.processID=$("#processID${id_suffix}").val();
				 //验证不通过按钮设置为可点击
				if	(!$(this).form('enableValidation').form('validate')){
					 $("#mainUrl").tabs("loaded");					
					 $('#btnsubmit${id_suffix}').linkbutton('enable');
				}	
				 
				return $(this).form('enableValidation').form('validate');
			},
			success : function(data) {				
				//跳转查询页面										
				eval("var obj = " + data);				
				if(obj.success){
					$("#mainUrl").tabs("loaded");					
					$('#btnsubmit${id_suffix}').linkbutton('enable');	
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
	
	function getParam${id_suffix}(result,type){
		 var opinion = "", itemList="", 
		 checkDate="", checkPerson="", resultName="", opinionName="",
		 hardFileID="",hardFileName="",proFileID="",proFileName="";
		if(type=="mgn"){
			opinion = $("#mgnOpinion${id_suffix}").val();
        	checkDate="mgnDate";
        	checkPerson="mgnSign";
        	resultName="mgnResult";
        	opinionName="mgnOpinion";
        	hardFileID=$("#basisMaterialId_Hard_${id_suffix}").val();
        	hardFileName=$("#basisMaterial_Hard_${id_suffix}").val();
        	proFileID=$("#basisMaterialId_Prod_${id_suffix}").val();
        	proFileName=$("#basisMaterial_Prod_${id_suffix}").val();
			unEditGrid${id_suffix}();
                
			if ($('#tbl_Sn${id_suffix}').datagrid('getChanges').length) {
				var rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");
				
				if(rows.length>0){
					itemList=JSON.stringify(rows);
				}
			}				
        }else if(type=="quality"){
        	opinion = $("#qualityOpinion${id_suffix}").val();
        	resultName="qualityResult";
        	checkDate="qualityDate";
        	checkPerson="qualitySign";
        	opinionName="qualityOpinion"
        }else if(type=="IPMT"){
        	opinion = $("#ipmtOpinion${id_suffix}").val();
        	resultName="ipmtResult";
        	checkDate="ipmtDate";
        	checkPerson="ipmtSign";
        	opinionName="ipmtOpinion"
        }
		var param = {
                "checkDate":checkDate,
                "checkPerson":checkPerson,
                "checkResult":result,
                "type":type,
                "itemList":itemList,
                "hardFileID":hardFileID,
                "hardFileName":hardFileName,
                "proFileID":proFileID,
                "proFileName":proFileName,
                "checkResultForRole":{
                    "resultName":resultName,
                    "resultValue":result
                },
                "checkOpinionForRole":{
                    "opinionName":opinionName,
                    "opinionValue":opinion
                },
                applyID:$("#applyID${id_suffix}").val()
            };
		return param;
	}
	
	function check${id_suffix}(result,type) {
		if(type=="mgn"&&result==1){
			$("#mainUrl").tabs("loading","处理中...");
			var errMsg="",isPSn=false,isHSn=false;
			$('#btnsubmit${id_suffix}').linkbutton('disable');
			unEditGrid${id_suffix}();
			
			if($('#tbl_Sn${id_suffix}').datagrid("getRows").length==0){
				$("#mainUrl").tabs("loaded");
				$.messager.alert("提示信息","请选择B版本，并填写难度系数");			
				editGrid${id_suffix}();	
				return;
			}
			$('#tbl_Sn${id_suffix}').datagrid("getRows")
			errMsg=validateList${id_suffix}();
			if(errMsg!=""){
				$("#mainUrl").tabs("loaded");
				$.messager.alert("提示信息",errMsg);
				$('#btnsubmit${id_suffix}').linkbutton('enable');
				editGrid${id_suffix}();				
				return;
			}
			
			var _rows=$('#tbl_Sn${id_suffix}').datagrid("getRows");
			$.each(_rows,function(i,item){
				if(item.bversionno==null||item.bversionno==undefined||item.bversionno==''){
					errMsg+="请选择B版本\n";				
				}
				if((item.prodifficult==null||item.prodifficult==undefined||item.prodifficult=='')
						&&(item.harddifficult==null ||item.harddifficult==undefined ||item.harddifficult=='')){
					errMsg+="请填写难度系数\n";
					return false;
				}
				if(item.prodifficult!=null &&item.prodifficult!=undefined &&item.prodifficult!=''){
					if(item.prodifficult==0&&errMsg.indexOf("产品Sn必须大于零")==-1){
						errMsg+="产品Sn必须大于零\n";
					}
					if(parseFloat(item.prodifficult)>0){
						isPSn=true;
					}
					
				}
				if(item.harddifficult!=null &&item.harddifficult!=undefined &&item.harddifficult!=''){
					if(item.harddifficult==0&&errMsg.indexOf("硬件Sn必须大于零")==-1){
						errMsg+="硬件Sn必须大于零\n";
					}
					if(parseFloat(item.harddifficult)>0){
						isHSn=true;
					}					
				}
			});
			
			if(errMsg!=""){
				$("#mainUrl").tabs("loaded");
				$.messager.alert("提示消息",errMsg);
				$('#btnsubmit${id_suffix}').linkbutton('enable');
				editGrid${id_suffix}();				
				return;
			}
			
			if(isPSn&&$("#basisMaterialId_Prod_${id_suffix}").val()==""){
				$("#mainUrl").tabs("loaded");
				$.messager.alert("提示消息","请上传产品Sn附件！");
				$('#btnsubmit${id_suffix}').linkbutton('enable');	
				editGrid${id_suffix}();				
				return;
			}
			if(isHSn&&$("#basisMaterialId_Hard_${id_suffix}").val()==""){
				$("#mainUrl").tabs("loaded");
				$.messager.alert("提示消息","请上传硬件Sn附件！");
				$('#btnsubmit${id_suffix}').linkbutton('enable');
				editGrid${id_suffix}();	
				return;
			}
			$("#mainUrl").tabs("loaded");
		}
		
		$("#mainUrl").tabs("loading","处理中...");        
        
        if(result!='1'&&type=="mgn"&&$("#mgnOpinion${id_suffix}").val()==''){
        	 $.messager.alert('提示','审核意见不能为空！');    
        	 $("#mainUrl").tabs("loaded");
        	 return;
        }else if(result!='1'&&type=="quality"&& $("#qualityOpinion${id_suffix}").val()==''){
        	 $.messager.alert('提示','审核意见不能为空！');
        	 $("#mainUrl").tabs("loaded");
        	 return;
        }else if(result!='1'&&type=="IPMT"&&$("#ipmtOpinion${id_suffix}").val()==''){
        	 $.messager.alert('提示','审核意见不能为空！');
        	 $("#mainUrl").tabs("loaded");
        	 return;
        }
        
        var id=$("#processID${id_suffix}").val();
		var param=getParam${id_suffix}(result,type)
        $.ajax({
            type: "POST",
            url: "/basicinfo/DifficultyCoefficient/check/"+id+"/${taskId}",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(param),
            dataType: "json",
            success: function (message) {
            	successCheck(message);
                /* if (message.status == 200) {
                	$("#mainUrl").tabs("loaded");
                	//$.messager.progress('close');
                	$.messager.alert("操作提示","审核成功！");
                    var tab = $('#mainUrl').tabs('getSelected');
					var index = $('#mainUrl').tabs('getTabIndex', tab);
					$("#mainUrl").tabs("close", index);                           
                }else{
                	$("#mainUrl").tabs("loaded");
                	//$.messager.progress('close');
                	$.messager.alert("操作提示","审核失败");
                }      */                   
            },
            error: function (message) {
            	errorCheck(message)
            /* 	$("#mainUrl").tabs("loaded");
            	//$.messager.progress('close');
            	$.messager.alert("操作提示","审核失败");    */                     
            }
        });		
       
    }
	
	function changeHandler${id_suffix}() {
		$("#mainUrl").tabs("loading","处理中...");

        var id=$("#processID${id_suffix}").val();
        var userId = $("#assign${id_suffix}").val();
        if(userId==undefined||userId==null||userId==""){
        	$("#mainUrl").tabs("loaded");
        	$.messager.alert("提示","请填写处理人!");
        	return;
        }
        $.post("/basicinfo/DifficultyCoefficient/changeHandler",{id:id,taskId:"${taskId}",userId:userId},function (result) {
        	eval("var obj = " + result);
        	successChangePerson(obj);
            /* if(obj.status == 200){
            	$("#mainUrl").tabs("loaded");
            	//$.messager.progress('close');
            	$.messager.alert("提示","修改当前处理人成功");
                var tab = $('#mainUrl').tabs('getSelected');
				var index = $('#mainUrl').tabs('getTabIndex', tab);
				$("#mainUrl").tabs("close", index);  
            }else{
            	$("#mainUrl").tabs("loaded");
            	//$.messager.progress('close');
                $.messager.alert("提示",obj.message);
            }   */          
        });
    }
	
	 function layoutFileWin${id_suffix}(type){
	     $("#current_file_type${id_suffix}").val(type);
	     $("#baseInfoFile${id_suffix}").window('open');
	 }

	    //文件提示框取消
	 function cancleFile${id_suffix}(){
	     $("#current_file_type${id_suffix}").val("");
	     $('#file${id_suffix}').filebox("clear");
	     $("#baseInfoFile${id_suffix}").window('close');
	 }
	 
	//文件提示框确认
	 function confirmFile${id_suffix}() {
		 $("#mainUrl").tabs("loading","上传中...");
	     
		 //var file =$("#file${id_suffix}").parent("td").find("[type='file']").eq(0).files;
	     var files = document.getElementById($("#file${id_suffix}").parent("td").find("[type='file']").attr("id")).files;
		 var fileSize = 0;
		 var allFileSize = 0;
		 var errMsg="";
	     $.each(files,function(i,file){	
	    	 fileSize = 0
			 var isIE = /msie/i.test(navigator.userAgent) && !window.opera; ;
			 if (isIE && !obj.files) {
				 var filePath = obj.value ;
				 var fileSystem = new ActiveX0bject("Scripting.FileSystem0bject");
				 var file = fileSystem.GetFile(filePath);
				 fileSize = file.Size;
			}else {
				 fileSize = file.size;
			     fileSize=Math. round( fileSize/1024*100)/100; //単 位カKBif(fileSize>1024){				
			 }
			 
			 allFileSize+=fileSize;
			 if(fileSize>10240){
				 errMsg="第"+(i+1)+"个附件不能超过10M，请重新上传!";				
				 return false;
			  }else{
				 return true;
			  }			
	     });
	     
	     if(errMsg!=''){
	    	 $.messager.alert("提示",errMsg);
			 $("#mainUrl").tabs("loaded");
			 return;
	     }
	     
	     if(allFileSize>10240){
	    	 $.messager.alert("提示","一次性上传附件不能大于10M！");
			 $("#mainUrl").tabs("loaded");
			 return ;
	     } 
		 
	     
	     $('#baseInfoFileForm${id_suffix}').form('submit', {
	         url: "/flowable/file/uploadFileMulti",
	         onSubmit: function(){
	             var isValid = $(this).form('validate');
	             if (!isValid){
	            	 $("#mainUrl").tabs("loaded");
	                 //$.messager.progress('close');	// hide progress bar while the form is invalid
	             }
	             return isValid;	// return false will stop the form submission
	         },
	         success: function(str){
	             var type = $("#current_file_type${id_suffix}").val();
	             var data = JSON.parse(str).data;
	             if(data.fileName.indexOf(",")){
	            	 var arrFileName=data.fileName.split(",");
	            	 var arrFileID=data.fileId.split(",")
	            	 $.each(arrFileName,function(i,item){
	            		var _html= "<a href=\"#\"  onclick=\"downloadFile${id_suffix}('"+item+"','"+arrFileID[i]+"')\">"+item+"</a>&nbsp&nbsp"+
	   	             		"<a href=\"#\" id=\"deleteFile_Prod_${id_suffix}\" onclick=\"deleteFile${id_suffix}(this,'"+item+"','"+arrFileID[i]+"','"+type+"')\">删除</a>&nbsp&nbsp"
	   	             	$("#basisMaterial_"+type+"_${id_suffix}").parent("td").append(_html);	
	            	 });
	             }
	             if($("#basisMaterial_"+type+"_${id_suffix}").val()!=null&&
	            		 $("#basisMaterial_"+type+"_${id_suffix}").val()!=''){
	            	 $("#basisMaterial_"+type+"_${id_suffix}").val($("#basisMaterial_"+type+"_${id_suffix}").val()+","+data.fileName);
		             $("#basisMaterialId_"+type+"_${id_suffix}").val($("#basisMaterialId_"+type+"_${id_suffix}").val()+","+data.fileId);
	             }else{
	            	 $("#basisMaterial_"+type+"_${id_suffix}").val(data.fileName);
		             $("#basisMaterialId_"+type+"_${id_suffix}").val(data.fileId);
	             }
	            
	             $("#mainUrl").tabs("loaded");

	             cancleFile${id_suffix}();// hide progress bar while submit successfully
	         }
	     });

	 }

	    //删除文件
	 function deleteFile${id_suffix}(obj,fileName,fileId,type){
		 $.messager.confirm('确认','您确认想要删除附件【'+fileName+'】吗？',function(r){    
			    if (r){
			    	$.post("/flowable/file/deleteFile",{"fileId":fileId},function (result) {
				         if(result.status==200){
				        	 $(obj).prev().remove();
				        	 $(obj).remove();
				             var names=$("#basisMaterial_"+type+"_${id_suffix}").val();
				             var ids=$("#basisMaterialId_"+type+"_${id_suffix}").val();
				             names=replaceMoreComma(names.replace(fileName,'').trim());
				             ids=replaceMoreComma(ids.replace(fileId,'').trim());
				             $("#basisMaterial_"+type+"_${id_suffix}").val(names);
				             $("#basisMaterialId_"+type+"_${id_suffix}").val(ids);
				         }else{
				             alert(result.message);
				         }
				     });    
			    }    
			}); 
	     
	 }

	 function downloadFile${id_suffix}(fileName,fileId) {
	    /*  var fileName = $("#basisMaterial_"+index+"_${id_suffix}").val()
	     var fileId = $("#basisMaterialId_"+index+"_${id_suffix}").val() */	    
	     window.open("/flowable/file/downloadFile?fileId="+fileId+"&fileName="+encodeURI(fileName));
	 }
	 
	//格式化
	 function formatProgress${id_suffix}(value,rowData,rowIndex){
	 	if (value == "underfined" || value == null) {
	 		return "";
	 	} else {
	 		return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
	 		+ value + '</div>';
	 	}
	 }
	
	//选择版本 赋值下拉框  简化操作
	 function selectComboboxProject${id_suffix}(){
		//强级联判断是否选择版本
		$('#btn_test${id_suffix}').val(1);
		$('#btn_test1${id_suffix}').val(1);
		$('#btn_test2${id_suffix}').val(1);
	 
	 	$('#selparentrelease${id_suffix}').val("");
	 	$('#projectStatu${id_suffix }').combobox('clear');
	 	$("#projectStatu${id_suffix }").combobox("select","在研");
	 	$('#searchParasRelease${id_suffix}').textbox("setValue","");
	 	$('#searchParasRelease${id_suffix}').textbox("setText","");
	 	 $('#winparentrelease${id_suffix}').window({  
	 		    iconCls:"icon-save",
	 		    modal:true   
	 		}); 
	 		$("#selparentrelease${id_suffix}").treegrid({
	 			iconCls : 'icon-ok',
	 			collapsible : false,
	 			url : 'product/data/prdata',
	 			method : 'get',
	 			idField : 'plipmtno',
	 			treeField : 'plipmt',
	 			 striped:true,
	 			 queryParams : {
	 					projectStatus : '在研'
	 				},
	 			 columns:[[
	 			           
	 			           {title:'IPMT',field:'plipmt',width:'15%', formatter:formatProgress${id_suffix}},
	 			           {title:'研发产品线',field:'prodline',width:'15%', formatter:formatProgress${id_suffix}},    
	 			           {title:'PDT',field:'pdt',width:'15%', formatter:formatProgress${id_suffix}}, 
	 			           {title:'产品',field:'product',width:'15%', formatter:formatProgress${id_suffix}},    
	 			           {title:'产品V级',field:'version',width:'12%', formatter:formatProgress${id_suffix}},
	 			           {title:'产品R级内码',field:'releaseno',width:'9%',formatter:formatProgress${id_suffix}}, 
	 			           {title:'产品R级中文名称',field:'release',width:'15%', formatter:formatProgress${id_suffix}}
	 			           
	 			       ]],
	 			height : window.innerHeight
	 					- window.innerHeight * 0.28,
	 					fitColumns : false,
	 			onBeforeExpand : function(row) {//异步架加载树
	 				var url = "product/data/prdata";
	 				$("#selparentrelease${id_suffix}").treegrid("options").url = url;
	 				return true;
	 			},onDblClickRow : function(rowData) {
	 				
	 				//根据选中的版本、路标版本查询下面的特性、子特性赋值
	 				if(rowData!=null&&rowData.plipmtno.indexOf('_')!=-1&&rowData.plipmtno.indexOf('PR')!=-1){
	 					$('#winparentrelease${id_suffix}').window("close");
	  					for (var i = rowData.plipmtno.split('_').length-1; i>=0 ; i--) {
	  						
	 						if(rowData.plipmtno.split('_')[i].indexOf('PI')!=-1){
	 							$("#plipmtno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 						}
	 						if(rowData.plipmtno.split('_')[i].indexOf('PL')!=-1){
	 							$("#prodlineno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 						}
	 						if(rowData.plipmtno.split('_')[i].indexOf('PP')!=-1){
	 							$("#productno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 						}
	 						if(rowData.plipmtno.split('_')[i].indexOf('PV')!=-1){
	 							$("#versionno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 						}
	 						if(rowData.plipmtno.split('_')[i].indexOf('PR')!=-1){
	 							
	 							//如果选择框的值和原下拉值一致，清空
								if($("#releaseno${id_suffix}").combobox('getValue')==rowData.plipmtno.split('_')[i])
									{
						    	$('#btn_test${id_suffix}').val(0);
						    	$('#btn_test1${id_suffix}').val(0);
						    	$('#btn_test2${id_suffix}').val(0);
									}
	 							$("#releaseno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 						}
	 					}
	 				}else{
	 					$.messager.alert("提示","请选择要添加的R级数据！！！","");
	 				}
	 			},toolbar : [{
	 	     			id : 'addSelectProjectRelease${id_suffix }',
	 	     			text : '确定',
	 	     			iconCls : 'tabs-icon fa fa-plus-square',
	 	     			handler : function() {
	 	     				
	 	     				//根据选中项赋值
	 	     				var rowData=$("#selparentrelease${id_suffix}").treegrid("getSelected");
	 	     				if(rowData!=null&&rowData.plipmtno.indexOf('_')!=-1&&rowData.plipmtno.indexOf('PR')!=-1){
	 	     					$('#winparentrelease${id_suffix}').window("close");
	 	     					for (var i = rowData.plipmtno.split('_').length-1; i>=0 ; i--) {
	 		  						
	 		 						if(rowData.plipmtno.split('_')[i].indexOf('PI')!=-1){
	 		 							$("#plipmtno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 		 						}
	 		 						if(rowData.plipmtno.split('_')[i].indexOf('PL')!=-1){
	 		 							$("#prodlineno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 		 						}
	 		 						if(rowData.plipmtno.split('_')[i].indexOf('PP')!=-1){
	 		 							$("#productno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 		 						}
	 		 						if(rowData.plipmtno.split('_')[i].indexOf('PV')!=-1){
	 		 							$("#versionno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 		 						}
	 		 						if(rowData.plipmtno.split('_')[i].indexOf('PR')!=-1){
	 		 							//如果选择框的值和原下拉值一致，清空
	 									if($("#releaseno${id_suffix}").combobox('getValue')==rowData.plipmtno.split('_')[i])
	 										{
	 							    	$('#btn_test${id_suffix}').val(0);
	 							    	$('#btn_test1${id_suffix}').val(0);
	 							    	$('#btn_test2${id_suffix}').val(0);
	 										}
	 		 							$("#releaseno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
	 		 						}
	 		 					}
	 	     				}else{
	 	     					$.messager.alert("提示","请选择要添加的R级数据！！！","");
	 	     				}
	 	     			}
	 			   },'-',
	 			  {
	 				  id : 'open${id_suffix }',
						text : '展开当前节点',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {							
							var selectNode = $("#selparentrelease${id_suffix}").treegrid('getSelected');
							 exeandAll_ID${id_suffix}=selectNode.plipmtno
							 $("#selparentrelease${id_suffix}").treegrid("expandAll",selectNode.plipmtno);									
							isExpandALl${id_suffix}=true;
							
						}
	 			   }],
					onLoadSuccess : function(row,data) {						
						 var _rowID=row!=null?row.plipmtno:'';
						
						 if(row!=null&&isExpandALl${id_suffix}){
							 if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
								 if(row.children!=null){
									 $.each(row.children,function(i,item){
										 $("#selparentrelease${id_suffix }").treegrid("expand",item.plipmtno);
									 });	
								 }							 
							}else{								
								var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
								if(root){
									 if(row!=null&&row.children!=null){
										 $.each(row.children,function(i,item){
											 $("#selparentrelease${id_suffix }").treegrid("expand",item.plipmtno);
										 });	
									 }									
								 }
							}
						 }
					},	
					onExpand:function(row){	
						var _rowID=row!=null?row.plipmtno:'';
						if(_rowID.substr(0,2)=='PI'&&_rowID!=exeandAll_ID${id_suffix}){
							 isExpandALl${id_suffix}=false;
							 exeandAll_ID${id_suffix}='';
						}else{
							var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
							if(!root){
								 isExpandALl${id_suffix}=false;
								 exeandAll_ID${id_suffix}='';
							 }
						}						 
					}
	 			
	 		});
	 }
	 
	 
	//版本搜索
	 function btnSearchRelease${id_suffix}(){		 
		isExpandALl${id_suffix}=false;
		exeandAll_ID${id_suffix}=''; 
	 	var status=$('#projectStatu${id_suffix }').combobox('getValues');
	 	status=status.join(',');
	 	$("#selparentrelease${id_suffix}").treegrid("load",{
	 		searchParas : $("#searchParasRelease${id_suffix}").val(),
	 		projectStatus : status
	 	});
	 }
	 
	 function replaceMoreComma(vue){
		 var value=vue.replace(",,",",");
		 
		 if(value.indexOf(",,")!=-1){
			 value= value.replace(",,",",");
		 }
		 return value;
	 }
	 
	//作废单据
	function delProcess${id_suffix}(){
		$.post("/basicinfo/DifficultyCoefficient/delProcess",{processID:'${processID}'},function(result){
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