<%@page import="java.lang.reflect.Field"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
   String obj_fields = "";
   Object obj = request.getAttribute("showComboboxData");
   if(obj != null) {
	  Class clazz = obj.getClass();
	  Field [] fields =  clazz.getDeclaredFields();
	  for(Field field: fields)
	  {
	  	obj_fields += field.getName() +",";
	  }
	  pageContext.setAttribute("obj_fields", obj_fields);
   }

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增R版本</title>
</head>
<body>
	<div class="toptoolbar" style="position: fixed;margin:0px 20px;z-index:9000;">
		<a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存退出</a>
		<c:if test="${IsEdit=='true'}">
		| <a href="#"
			id="btnSave${id_suffix}" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'fa fa-save'"
			>保存</a>
			</c:if>
	</div>
	<br>
	<br>
	<p >
			<span class="title191030" >${title} </span>
		</p>
	<div class="toptoolbarhr" style="margin-top: 2%;margin:0px 20px;"></div>
	<form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}' style="margin:0px 20px;">
		
		<c:forEach var="group" items="${groups}">
			<%-- <p>
				<span id="T00000${group }${id_suffix}" class="CollapseSubForm" >${group }</span>
			</p> --%>
			<h2 class="subfild" id="T00000${group }${id_suffix}">
				<span>${group }</span>
			</h2>
			<div id="SUBFORM_T00000${group }${id_suffix}">
				<table class="linkeytable" data-sort="sortDisabled">
					<!-- linkeytable -->
					<tbody>

						<c:forEach var="colunmConfigList" items="${colunmConfigList}">

							<c:if test="${group eq colunmConfigList.columngroup }">
							
							 <c:if test="${colunmConfigList.columntype == 'hidden' &&colunmConfigList.columnname.contains('内码')}">
									<tr class="firstRow" style="">
										<td width="15%" align="right" style="word-break: break-all;">${colunmConfigList.columnname}</td>
										<td  style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
											<input name="${colunmConfigList.columncode}" id="${colunmConfigList.columncode}${id_suffix}" readonly="readonly"
											style="width:800px;height:30px;" size="30"
												class="${colunmConfigList.columnclass} " />
										</td>
									</tr>
								</c:if> 

								<c:if test="${colunmConfigList.columntype != 'hidden'}">
									<tr class="firstRow">
										<!-- firstRow -->
										<td width="15%" align="right" style="word-break: break-all;">${colunmConfigList.columnname}</td>
										<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
											<%-- <c:if test="${empty colunmConfigList.columnvalidate}"> --%>
											<c:if
												test="${colunmConfigList.columncode!='baseline1'&&colunmConfigList.columncode!='baseline1name'&&colunmConfigList.columncode!='remark'&&colunmConfigList.columnclass!='table'&&colunmConfigList.columncode!='status' && colunmConfigList.columncode!='ifofficialnaming'  && (isGroupOrder!=true||(isGroupOrder==true&&colunmConfigList.grouporder!=1))&& !colunmConfigList.columnname.contains('曾用名')&&colunmConfigList.columncode!='remark'}">
												<input name="${colunmConfigList.columncode}" style="width:800px;height:${colunmConfigList.columncode eq 'remark'? '100px':'30px'};"
													id="${colunmConfigList.columncode}${id_suffix}" value="${colunmConfigList.columncode eq 'readers'?'*/huawei-3com, */h3c,':''}" size="30" type="${colunmConfigList.columntype}"
													data-options="multiline:${colunmConfigList.columncode eq 'remark'? true:false},validType:'${colunmConfigList.validatelength==null||colunmConfigList.validatelength eq '' ? false:colunmConfigList.validatelength }',required:${colunmConfigList.columnvalidate  == null ||  colunmConfigList.columnvalidate eq '' ? false: colunmConfigList.columnvalidate},missingMessage:'${colunmConfigList.columnmessage }'"
													class="${colunmConfigList.columnclass eq 'easyui-combobox' ? 'easyui-combobox-type' :  colunmConfigList.columnclass} " />
											
											<c:if test="${colunmConfigList.columncode=='readers'}">
											
											<br>
											<span>*表示所有人能够看到，否则请用群组或ID来控制读者</span>
											</c:if>
											
											</c:if>
											
											<%-- 	<c:if
												test="${colunmConfigList.ipmtcheck!=1 && (isGroupOrder!=true||(isGroupOrder==true&&colunmConfigList.grouporder!=1))&& (colunmConfigList.columncode.contains('bversioncname')|| colunmConfigList.columncode.contains('bversionename'))}">
												<input name="${colunmConfigList.columncode}" readonly="readonly"  style="width:800px;height:${colunmConfigList.columncode eq 'remark'? '100px':'30px'};"
													id="${colunmConfigList.columncode}${id_suffix}" value="${colunmConfigList.columncode eq 'readers'?'*/huawei-3com, */h3c,':''}" size="30" type="${colunmConfigList.columntype}"
													data-options="multiline:${colunmConfigList.columncode eq 'remark'? true:false},validType:'${colunmConfigList.validatelength==null||colunmConfigList.validatelength eq '' ? false:colunmConfigList.validatelength }',required:${colunmConfigList.columnvalidate  == null ||  colunmConfigList.columnvalidate eq '' ? false: colunmConfigList.columnvalidate},missingMessage:'${colunmConfigList.columnmessage }'"
													class="${colunmConfigList.columnclass eq 'easyui-combobox' ? 'easyui-combobox-type' :  colunmConfigList.columnclass} " />
														<c:if test="${colunmConfigList.columncode=='readers'}">
											
											<br>
											<span>*表示所有人能够看到，否则请用群组或ID来控制读者</span>
											</c:if>
													</c:if> --%>
											<!-- 基线平台下拉树改为弹出框 -->
											<c:if test="${colunmConfigList.columncode=='baseline1name'}">
											<input name="baseline1" class="easyui-textbox" readonly="readonly" style="width:100px;height:28px;margin: -10px 0px;" id="baseline1${id_suffix}" />
												<input name="${colunmConfigList.columncode}" readonly="readonly" class="easyui-textbox" style="width:500px;height:28px;margin: -10px 0px;" id="${colunmConfigList.columncode}${id_suffix}" /> 
											<c:if test="${((IsEdit=='true'&&isCheck=='false') || isGroupOrder=='true'&&colunmConfigList.grouporder==1)}">
											
											<a href="javascript:void(0)" style="height:28px;margin:0px;pointer-events:none;width:190px;"  readOnly="readOnly" class="easyui-linkbutton" onclick="dialogBaseline1Name${id_suffix}()">选择对应的平台基线版本号</a>
											<span style="color: red; margin-left:2px">POP/CMO无权限编辑 </span>
											</c:if>
											<c:if test="${isGroupOrder!=true||(colunmConfigList.grouporder!=1)}">
											<a href="javascript:void(0)" style="height:28px;margin:0px;width:190px;"" class="easyui-linkbutton" onclick="dialogBaseline1Name${id_suffix}()">选择对应的平台基线版本号</a>
											</c:if>
											</c:if>
											<!-- 备注高度只适应 -->
											<c:if test="${colunmConfigList.columncode=='remark'}" >
												<c:if test="${isGroupOrder==true&&colunmConfigList.grouporder==1}">
														<textarea name="${colunmConfigList.columncode}" autoHeight="true" style="width:800px;" readOnly="readOnly" id="${colunmConfigList.columncode}${id_suffix}" ></textarea>
														<span style="color: red; margin-left: 2px;">POP/CMO无权限编辑 </span>
													</c:if>
												 <c:if test="${isGroupOrder!=true||(colunmConfigList.grouporder!=1)}">
												 <textarea name="${colunmConfigList.columncode}" autoHeight="true" style="width:800px;" id="${colunmConfigList.columncode}${id_suffix}" ></textarea>
												 </c:if>
											</c:if>
											<c:if test="${colunmConfigList.columnclass=='table'}">
											<table style="width:800px;height:auto;table-layout:fixed;">
											<c:forEach var="projectInfo" items="${projectInfo}">
											  		  <tr><td style="word-wrap:break-word;width:17%;">${projectInfo.projectno}</td>
											  <td style="word-wrap:break-word;width:17%;">${projectInfo.fProjno}</td>
											  <td style="word-wrap:break-word;width:33%;">${projectInfo.project}</td>
											  <td style="word-wrap:break-word;width:33%;">${projectInfo.engproject}</td>
											  </tr>
											  </c:forEach>
											  </table>
											</c:if>
											<c:if test="${colunmConfigList.columnname.contains('曾用名')}">
												<input name="${colunmConfigList.columncode}" style="width:800px;height:${colunmConfigList.columncode eq 'remark'? '100px':'30px'};"
													id="${colunmConfigList.columncode}${id_suffix}" value="" size="30" type="${colunmConfigList.columntype}"
													data-options="multiline:${colunmConfigList.columncode eq 'remark'? true:false},validType:'${colunmConfigList.validatelength==null||colunmConfigList.validatelength eq '' ? false:colunmConfigList.validatelength }',required:${colunmConfigList.columnvalidate  == null ||  colunmConfigList.columnvalidate eq '' ? false: colunmConfigList.columnvalidate},missingMessage:'${colunmConfigList.columnmessage }'"
													class="${colunmConfigList.columnclass eq 'easyui-combobox' ? 'easyui-combobox-type' :  colunmConfigList.columnclass} " readonly="readonly"/>
												</c:if>
											<c:if
												test="${colunmConfigList.columnclass!='table'&&colunmConfigList.columncode!='status' && colunmConfigList.columncode!='ifofficialnaming'  && ((isGroupOrder==true&&colunmConfigList.grouporder==1))&& !colunmConfigList.columnname.contains('曾用名')&&colunmConfigList.columncode!='remark'&&colunmConfigList.columncode!='baseline1name'}">
												<!-- 修改需判断字段是否需要IPMT执行秘书审核 -->
												<c:if test="${((IsEdit=='true'&&isCheck=='false') || isGroupOrder=='true'&&colunmConfigList.grouporder==1)}">
													<input name="${colunmConfigList.columncode}" style="width:800px;height:${colunmConfigList.columncode eq 'remark'? '100px':'30px'};" readonly="readonly"
														id="${colunmConfigList.columncode}${id_suffix}" value="${colunmConfigList.columncode eq 'readers'?'*/huawei-3com, */h3c,':''}" size="30" type="${colunmConfigList.columntype}"
														data-options="multiline:${colunmConfigList.columncode eq 'remark'? true:false},validType:'${colunmConfigList.validatelength==null||colunmConfigList.validatelength eq '' ? false:colunmConfigList.validatelength }',required:${colunmConfigList.columnvalidate  == null ||  colunmConfigList.columnvalidate eq '' ? false: colunmConfigList.columnvalidate},missingMessage:'${colunmConfigList.columnmessage }'"
														class="${colunmConfigList.columnclass eq 'easyui-combobox' ? 'easyui-combobox-type' :  colunmConfigList.columnclass} " />
													<%-- <c:if test="${colunmConfigList.ipmtcheck==1}">
														<span style="color: red; margin-left: 2px;">需要IPMT执行秘书审核 </span>
													</c:if> --%>
													<c:if test="${isGroupOrder==true&&colunmConfigList.grouporder==1}">
														<span style="color: red; margin-left: 2px;">POP/CMO无权限编辑 </span>
													</c:if>
													<c:if test="${colunmConfigList.columncode=='readers'}">
											<br>
											<span>*表示所有人能够看到，否则请用群组或ID来控制读者</span>
											</c:if>
												</c:if>
												<!-- 新增放开IPMT执行秘书审核 -->
												<c:if test="${IsEdit=='false'||(IsEdit=='true'&&isCheck=='true')}">
													<input name="${colunmConfigList.columncode}" style="width:800px;height:${colunmConfigList.columncode eq 'remark'? '100px':'30px'};"
														id="${colunmConfigList.columncode}${id_suffix}" value="${colunmConfigList.columncode eq 'readers'?'*/huawei-3com, */h3c,':''}" size="30" type="${colunmConfigList.columntype}"
														data-options="multiline:${colunmConfigList.columncode eq 'remark'? true:false},validType:'${colunmConfigList.validatelength==null||colunmConfigList.validatelength eq '' ? false:colunmConfigList.validatelength }',required:${colunmConfigList.columnvalidate  == null ||  colunmConfigList.columnvalidate eq '' ? false: colunmConfigList.columnvalidate},missingMessage:'${colunmConfigList.columnmessage }'"
														class="${colunmConfigList.columnclass eq 'easyui-combobox' ? 'easyui-combobox-type' :  colunmConfigList.columnclass} " />
												<c:if test="${colunmConfigList.columncode=='readers'}">
											<br>
											<span>*表示所有人能够看到，否则请用群组或ID来控制读者</span>
											</c:if>
												</c:if>



											</c:if>
											<!-- 父版本 -->
											<c:if test="${colunmConfigList.columncode=='parentitem'}">
												<c:if test="${((IsEdit=='true'&&isCheck=='false') || isGroupOrder=='true'&&colunmConfigList.grouporder==1)}">
												
												<a href="javascript:void(0)" class="easyui-linkbutton" style="pointer-events:none;" readOnly="readOnly" onclick="dialogOpen${id_suffix}('BL')">基线版本</a>
												<a href="javascript:void(0)" class="easyui-linkbutton" style="pointer-events:none;" readOnly="readOnly" onclick="dialogOpen${id_suffix}('PR')">路标版本</a>
											    </c:if>
											    <c:if test="${isGroupOrder!=true||(isGroupOrder==true&&colunmConfigList.grouporder!=1)}">
											    
											    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="dialogOpen${id_suffix}('BL')">基线版本</a>
												<a href="javascript:void(0)" class="easyui-linkbutton" onclick="dialogOpen${id_suffix}('PR')">路标版本</a>
											    
											    </c:if>
											</c:if>
											
											<%-- </c:if> --%>
											<!-- 隐藏状态实际值   -->
											<c:if test="${colunmConfigList.columncode=='status'}">
												<input type="hidden" name="${colunmConfigList.columncode}" id="${colunmConfigList.columncode}${id_suffix}" checked/>
												<c:if test="${(colunmConfigList.editstatus==0 || (isGroupOrder==true&&colunmConfigList.grouporder==1))}">
													<input style="height: 30px;" id="${colunmConfigList.columncode}${id_suffix}01" value="" size="30" type="${colunmConfigList.columntype}"
														data-options="readonly:true,onText:'有效',offText:'失效'" class="${colunmConfigList.columnclass}" />
												</c:if>

												<c:if test="${colunmConfigList.editstatus!=0 && (isGroupOrder!=true||(isGroupOrder==true&&colunmConfigList.grouporder!=1))}">
													<input style="height: 30px;" id="${colunmConfigList.columncode}${id_suffix}01" value="" size="30" type="${colunmConfigList.columntype}"
														data-options="onText:'有效',offText:'失效',checked:true" class="${colunmConfigList.columnclass}" />
												</c:if>
													<c:if test="${isGroupOrder==true&&colunmConfigList.grouporder==1}">
														<span style="color: red; margin-left: 2px;">POP/CMO无权限编辑 </span>
													</c:if>
											</c:if>
											<!-- 隐藏是否已正式命名实际值   -->
											<c:if test="${colunmConfigList.columncode=='ifofficialnaming'}">
												<input type="hidden" name="${colunmConfigList.columncode}" id="${colunmConfigList.columncode}${id_suffix}" />
												<c:if test="${(colunmConfigList.editstatus==0 || (isGroupOrder==true&&colunmConfigList.grouporder==1))}">
													<input style="height: 30px;" id="${colunmConfigList.columncode}${id_suffix}01" value="" size="30" type="${colunmConfigList.columntype}"
														data-options="readonly:true,onText:'是',offText:'否'" class="${colunmConfigList.columnclass}" />
												</c:if>
												<c:if test="${colunmConfigList.editstatus!=0 && (isGroupOrder!=true||(isGroupOrder==true&&colunmConfigList.grouporder!=1))}">
													<input style="height: 30px;" id="${colunmConfigList.columncode}${id_suffix}01" value="" size="30" type="${colunmConfigList.columntype}"
														data-options="onText:'是',offText:'否'" class="${colunmConfigList.columnclass}" />
												</c:if>
													<c:if test="${isGroupOrder==true&&colunmConfigList.grouporder==1}">
														<span style="color: red; margin-left: 2px;">POP/CMO无权限编辑 </span>
													</c:if>
											</c:if>

											<%-- <c:if test="${not empty colunmConfigList.columnvalidate }">
											<input name="${colunmConfigList.columncode.toLowerCase()}"
												id="${colunmConfigList.columncode.toLowerCase()}" value=""
												size="30" type="${colunmConfigList.columntype}"
												data-options="required:true,validType:'${colunmConfigList.columnvalidate}'"
												class="${colunmConfigList.columnclass}" />
										</c:if> --%>
										</td>
										<%-- ${colunmConfigList.ColumnValidate } eq '' ? '': 'required:true,validType:'${colunmConfigList.ColumnValidate }' --%>
									</tr>
								</c:if>

								<c:if test="${colunmConfigList.columntype == 'hidden' && !colunmConfigList.columnname.contains('内码')}">
									<tr class="firstRow" style="display: none">
										<td width="15%" align="right" style="word-break: break-all;"></td>
										<td>
											<input name="${colunmConfigList.columncode}" id="${colunmConfigList.columncode}${id_suffix}" value="" size="30" type="${colunmConfigList.columntype}"
												class="${colunmConfigList.columnclass eq 'easyui-combobox' ? 'easyui-combobox-type' :  colunmConfigList.columnclass} " />
										</td>
									</tr>
								</c:if>

							</c:if>
							<!-- 隐藏域 -->

						</c:forEach>

					</tbody>
				</table>
			</div>

		</c:forEach>

		<br>
		<br>
		<br>
	</form>
	<div id="win"></div>
	<div id="winparentversion${id_suffix}" title="所属父版本" style="hidden: hidden; width: 600px; height: 400px">
		<form id="selparentversion${id_suffix}" method="get" style="height: 400px">
			<table id="parentversion${id_suffix}">
			</table>
		</form>
	</div>
	
	<div id="winbaseline1name${id_suffix}" title="对应的平台基线版本号" class="winHeight"
		style="display: none; width: 80%;min-height:60%px!important;padding:0px 10px;margin:0px auto;">
		<input id="searchStr${id_suffix}" class="easyui-textbox" type="text"
			prompt="请输入搜索内容" style="width: 65%;height:28px;" /> &nbsp; 
		<a	id="btn${id_suffix}" href="#" class="easyui-linkbutton default"
			onclick="search${id_suffix}();" style="height:28px;">搜 索 </a>&nbsp;

		<table id="tabbaseline1name${id_suffix}" style="width: 100%;min-height:450px!important;">
		</table>
		<br>
		<br>
		<br>
		<br>

	</div>
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<script type="text/javascript" src="common/js/prBelowApply.js"></script>
<style>

/* 只读数据不显示边框 */
 #linkeyform${id_suffix} input[readonly] {
border:none!important;
/* 禁用事件  针对人员控件会清空数据的情况 */
pointer-events:none;
} 
#linkeyform${id_suffix} textarea[readonly]{
border:none!important;
}

#linkeyform${id_suffix} .textbox-readonly {
border:none!important;
}

</style>
	<script type="text/javascript">
	$(function(){
	$('input:not([autocomplete]),textarea:not([autocomplete]),select:not([autocomplete])').attr('autocomplete', 'off');
	});
	//格式化以及自动换行
	function formatProgress${id_suffix}(value,rowData,rowIndex) {
		//writeObj(rowData)
		if (value == "underfined" || value == null) {
			return "";
		} else {
			
			if(rowData)	{
				if(rowData.ColumnCode == 'status') {
					if(rowData.value == 1){
						rowData.value= "有效";
					} 
					if(rowData.value == 0){
						rowData.value="失效";
					}					
				}
				
				if(rowData.ColumnCode=='ifofficialnaming'){					
					if(rowData.value == 1){
						rowData.value="是";
					}
					if(rowData.value == 0){
						rowData.value="否";
					}
				}
				
				if(rowData.ColumnCode=='projectstatus'){					
					if(rowData.value == 1){
						rowData.value="在研";
					}
					else if(rowData.value == 2){
						rowData.value="终止";
					}
					else if(rowData.value == 3){
						rowData.value="挂起";
					}
				} 
				
				if(rowData.projectstatus == 1){
					rowData.projectstatus="在研";
				}
				else if(rowData.projectstatus == 2){
					rowData.projectstatus="终止";
				}
				else if(rowData.projectstatus == 3){
					rowData.projectstatus="挂起";
				}
				
				if(rowData.ifofficialnaming == 1){
					rowData.ifofficialnaming="是";
				}
				if(rowData.ifofficialnaming == 0){
					rowData.ifofficialnaming="否";
				}				 
			}
			return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
					+ value + '</div>';
		}
	}
	
	
		$(function() {
			//多个人员联想
			 if($("#linkeyform${id_suffix} input[class*='auto_selusers_true']").length>0){
		    	 $("#linkeyform${id_suffix} input[class*='auto_selusers_true']").each(function(index,element){
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
			
			$('textarea[autoHeight]').autoHeight(); 
			//保存退出
			/* $('#btnQuit${id_suffix}').linkbutton({    
			    iconCls: 'fa fa-save',
			    onClick: "postSave${id_suffix}('0')"
			});  */
			$('#btnQuit${id_suffix}').bind('click',"0",function(){
				var tag="0";
				postSave${id_suffix}(tag);
				
			});
			
			
			//保存
			$('#btnSave${id_suffix}').bind('click',"1", function(){
				var tag="1";
				postSave${id_suffix}(tag);
			});
			/* $('#btnSave${id_suffix}').linkbutton({    
			    iconCls: 'fa fa-save',
			    onClick: "postSave${id_suffix}('1')"
			});  */
		     
			
			/*基线版本 下拉树表格显示*/
			if($("#linkeyform${id_suffix} input[class*='combotreegrid']").length>0){
				 $("#linkeyform${id_suffix} input[class*='combotreegrid']").each(function(index,element){
					 var type=$(this).attr("type");
					 /*PR版本*/
					 if(type=="PR"){
						 if($("#releaseSoftware${id_suffix}").length > 0&& $("#releaseSoftware${id_suffix}").attr("type")!="hidden"){
							
							 $('#releaseSoftware${id_suffix}').combotreegrid({
			         		    method:'get',
			 					width:'800px',
			 					panelWidth:500,
			 					label:'',
			 					labelPosition:'top',
			 					url:'/product/comboboxtree/prdata',        
			 					idField:'plipmtno',
			 					treeField:'pdt',
			 					onlyLeafCheck:true,
			 					onBeforeExpand : function(row) {//异步架加载树
			 						var url = "/product/comboboxtree/prdata";/*<!--***url需要更改 ***--> */
			 						$("#releaseSoftware${id_suffix}").combotreegrid("options").url = url;
			 						
			 						return true;
			 					},
			 					 onBeforeSelect:function(node){
			 	                     if(node.state=="closed"){
			 	                        $("#releaseSoftware${id_suffix}").combotreegrid("unselect");
			 	                       
			 	                    }
 
			 	                },
			 					onClickRow : function(rowData) { //单击事件
			 				
			 					$("#releaseSoftware${id_suffix}").combotreegrid("setText",rowData.release)
			 					if($("#releasenoSoftware${id_suffix}").length>0){
			 					$("#releasenoSoftware${id_suffix}").combotreegrid("setValue",$("#releaseSoftware${id_suffix}").combotreegrid("getValue"))
			 					}
			 					
			 					//alert($("#releasenoSoftware${id_suffix}").combotreegrid("getValue"));
			 					
			 						},
			                   columns:[[
			                 	  {field:'plipmtno',title:'产品编码',width:200,hidden:true,formatter:formatProgress${id_suffix}},
			                       {field:'pdt',title:'产品',width:200,formatter:formatProgress${id_suffix}},
			                       {field:'release',title:'产品R级',width:200,formatter:formatProgress${id_suffix}},
			                       {field:'releaseno',title:'对象项目财务编码',width:200,formatter:formatProgress${id_suffix}}
			                   ]]
			               }); 
						 }
						 /*基线版本*/
					 }else if(type=="BL"){
						/*  if($("#baseline1name${id_suffix}").length > 0&& $("#baseline1name${id_suffix}").attr("type")!="hidden"){
							 $('#baseline1name${id_suffix}').combotreegrid({
				         		    method:'get',
				 					width:'400px',
				 					panelWidth:500,
				 					label:'',
				 					labelPosition:'top',
				 					url:'/product/comboboxtree/bldata',        
				 					idField:'prodlineno',
				 					treeField:'prodline',
				 					onBeforeExpand : function(row) {//异步架加载树
				 						var url = "/product/comboboxtree/bldata";
				 						$("#baseline1name${id_suffix}").combotreegrid("options").url = url;
				 						return true;
				 					},
				 					onBeforeSelect:function(node){
				 	                     if(node.state=="closed"){
				 	                        $("#baseline1name${id_suffix}").combotreegrid("unselect");
				 	                    }
	 
				 	                },
				 					onClickRow : function(rowData) { //单击事件
					 					$("#baseline1name${id_suffix}").combotreegrid("setText",rowData.baseline)
				 						//alert($("#baseline1name${id_suffix}").combotreegrid("getValue"));
					 					 
					 					if($("#baseline1${id_suffix}").length>0){
					 					$("#baseline1${id_suffix}").combotreegrid("setValue",$("#baseline1name${id_suffix}").combotreegrid("getValue"))
					 					} 
				 						},
				                   columns:[[
				                	   {field:'prodlineno',title:'产品编码',width:200,hidden:true,formatter:formatProgress${id_suffix}},
				                       {field:'prodline',title:'产品线',width:200,formatter:formatProgress${id_suffix}},
				                       {field:'product',title:'产品',width:200,formatter:formatProgress${id_suffix}},
				                       {field:'release',title:'产品R级',width:200,formatter:formatProgress${id_suffix}},
				                       {field:'baseline',title:'版本名称',width:200,formatter:formatProgress${id_suffix}},
				                       {field:'baselineOut',title:'对外版本名称',width:200,formatter:formatProgress${id_suffix}}
				                   ]]
				               }); 
							 }*/
						 } 
				 });
			}
			/*下拉框显示*/
			
			
			     if($("#linkeyform${id_suffix} input[class*='combobox']").length>0){
			    	 
			    	 $("#linkeyform${id_suffix} input[class*='combobox']").each(function(index,element){
			    		 var type=$(this).attr("type");
			    		 if(type=="PI"){
			    		 $(this).combobox({
								url : '/product/comboboxdata/list?type='+type+'&code=',
								method : "post",
								valueField : 'value',
								textField : 'text',
								editable:false,
								required:true,
								missingMessage:"请选择所属IPMT",
								onChange:function(newValue,oldValue){
									 if($("#prodlineno${id_suffix}").length > 0&&$("#prodlineno${id_suffix}").attr("type")!=undefined&& $("#prodlineno${id_suffix}").attr("type")!="hidden"){
								    	$('#prodlineno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PL&code='+newValue+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue")); 
									} 
								},
								 onSelect: function(rec){
								
									if($("#prodlineno${id_suffix}").length > 0&&$("#prodlineno${id_suffix}").attr("type")!=undefined&& $("#prodlineno${id_suffix}").attr("type")!="hidden"){
								    	$('#prodlineno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PL&code='+rec.value+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue")); 
									}
								}, 
								onLoadSuccess: function () {
									//用于创建继承
									 if($("#plipmtno${id_suffix}").length > 0&&$("#plipmtno${id_suffix}").attr("type")!=undefined&& $("#plipmtno${id_suffix}").attr("type")!="hidden"){
										if('${obj_fields}' != ""){
							    		      <%if( obj_fields.contains("plipmtno,")  ) { %>
							    		      var valueField = $(this).combobox("options").valueField;
							    		      var allData = $(this).combobox("getData");
							    		      for (var i = 0; i < allData.length; i++) {
							    		    	if ('${showComboboxData.plipmtno}' == allData[i][valueField]) {
							    		    		 $(this).combobox('select','${showComboboxData.plipmtno}');
							    		    	break;
							    		    	}
							    		      }
							    		  
						    				   
						    				 <%}%>
							    		 }
									} 
								}
							});
			    		 }
			    		 else  if(type=="PL"){
				    		 $(this).combobox({
									data : '[]',
									method : "post",
									valueField : 'value',
									textField : 'text',
									editable:false,
									required:true,
									missingMessage:"请选择所属产品线",
									/* onChange:function(newValue,oldValue){
										if($("#pdtno${id_suffix}").length > 0 &&$("#pdtno${id_suffix}").attr("type")!=undefined&& $("#pdtno${id_suffix}").attr("type")!="hidden"){
									     	$('#pdtno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PT&code='+newValue+'&sub_code=' +$('#pdtno${id_suffix}').combobox("getValue")); 
										}
										if($("#productno${id_suffix}").length > 0&&$("#productno${id_suffix}").attr("type")!=undefined&&$("#productno${id_suffix}").attr("type")!="hidden"){
									     	$('#productno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PP&code='+newValue + '&sub_code=' +$('#productno${id_suffix}').combobox("getValue")); 
										}
									}, */
									 onSelect: function(rec){
										//alert(rec.value)
										if($("#pdtno${id_suffix}").length > 0 &&$("#pdtno${id_suffix}").attr("type")!=undefined&& $("#pdtno${id_suffix}").attr("type")!="hidden"){
									     	$('#pdtno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PT&code='+rec.value+'&sub_code=' +$('#pdtno${id_suffix}').combobox("getValue")); 
										}
										if($("#productno${id_suffix}").length > 0&&$("#productno${id_suffix}").attr("type")!=undefined&&$("#productno${id_suffix}").attr("type")!="hidden"){
									     	$('#productno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PP&code='+rec.value + '&sub_code=' +$('#productno${id_suffix}').combobox("getValue")); 
										}
									}, 
									onLoadSuccess: function () {
										//用于创建继承
										 if($("#prodlineno${id_suffix}").length > 0&&$("#prodlineno${id_suffix}").attr("type")!=undefined&& $("#prodlineno${id_suffix}").attr("type")!="hidden"){
											if('${obj_fields}' != ""){
								    		      <%if( obj_fields.contains("prodlineno,")  ) { %>
								    		      var valueField = $(this).combobox("options").valueField;
								    		      var allData = $(this).combobox("getData");
								    		      for (var i = 0; i < allData.length; i++) {
								    		    	if ('${showComboboxData.prodlineno}' == allData[i][valueField]) {
								    		    		 $(this).combobox('select','${showComboboxData.prodlineno}');  
								    		    	break;
								    		    	}
								    		      }
							    				 
							    				 <%}%>
								    		 }
										} 
									}
									
									
								});
				    	 }
			    		 else  if(type=="PT"){
				    		 
				    		  $(this).combobox({
									data : '[]',
									method : "post",
									valueField : 'value',
									textField : 'text',
									required:true,
									missingMessage:"请选择所属PDT",
									editable:false,
									onSelect: function(rec){
										/*  if($("#releaseno${id_suffix}").length > 0&& $("#releaseno${id_suffix}").attr("type")!="hidden"){
									     	$('#releaseno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PR&code='+rec.value+'&sub_code=' + $('#releaseno${id_suffix}').combobox("getValue")); 
										}  */
									},onLoadSuccess: function () {
										//用于创建继承
										 if($("#pdtno${id_suffix}").length > 0 &&$("#pdtno${id_suffix}").attr("type")!=undefined&& $("#pdtno${id_suffix}").attr("type")!="hidden"){
											if('${obj_fields}' != ""){
								    		      <%if( obj_fields.contains("pdtno,")  ) { %>
								    		      var valueField = $(this).combobox("options").valueField;
								    		      var allData = $(this).combobox("getData");
								    		      for (var i = 0; i < allData.length; i++) {
								    		    	if ('${showComboboxData.pdtno}' == allData[i][valueField]) {
								    		    		$(this).combobox('select','${showComboboxData.pdtno}');
								    		    	break;
								    		    	}
								    		      }
							    				    
							    				 <%}%>
								    		 }
										} 
									}
									
									
								}); 
				    	 } 
			    		 else  if(type=="PP"){
				    		 $(this).combobox({
									data : '[]',
									method : "post",
									valueField : 'value',
									textField : 'text',
									required:true,
									missingMessage:"请选择所属产品",
									editable:false,
									/* onChange:function(newValue,oldValue){
										if($("#versionno${id_suffix}").length > 0&&$("#versionno${id_suffix}").attr("type")!=undefined&& $("#versionno${id_suffix}").attr("type")!="hidden"){
									     	$('#versionno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PV&code='+newValue +'&sub_code=' + $('#versionno${id_suffix}').combobox("getValue")); 
										}
									}, */
									 onSelect: function(rec){
										if($("#versionno${id_suffix}").length > 0&&$("#versionno${id_suffix}").attr("type")!=undefined&& $("#versionno${id_suffix}").attr("type")!="hidden"){
									     	$('#versionno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PV&code='+rec.value +'&sub_code=' + $('#versionno${id_suffix}').combobox("getValue")); 
										}
									}, 
									onLoadSuccess: function () {
										//用于创建继承
										 if($("#productno${id_suffix}").length > 0&&$("#productno${id_suffix}").attr("type")!=undefined&&$("#productno${id_suffix}").attr("type")!="hidden"){
											if('${obj_fields}' != ""){
								    		      <%if( obj_fields.contains("productno,")  ) { %>
								    		      var valueField = $(this).combobox("options").valueField;
								    		      var allData = $(this).combobox("getData");
								    		      for (var i = 0; i < allData.length; i++) {
								    		    	if ('${showComboboxData.productno}' == allData[i][valueField]) {
								    		    		 $(this).combobox('select','${showComboboxData.productno}');  
								    		    	break;
								    		    	}
								    		      }
							    				 
							    				 <%}%>
								    		 }
										} 
									}
									
									
								});
				    		 }else  if(type=="PV"){
		    		
		    		  $(this).combobox({
							data : '[]',
							method : "post",
							valueField : 'value',
							textField : 'text',
							required:true,
							missingMessage:"请选择所属V级",
							editable:false,
							/* onChange:function(newValue,oldValue){
								 if($("#releaseno${id_suffix}").length > 0&&$("#releaseno${id_suffix}").attr("type")!=undefined&& $("#releaseno${id_suffix}").attr("type")!="hidden"){
								     	$('#releaseno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PR&code='+newValue+'&sub_code=' + $('#releaseno${id_suffix}').combobox("getValue")); 
									} 
								}, */
							onSelect: function(rec){
					
								 if($("#releaseno${id_suffix}").length > 0&&$("#releaseno${id_suffix}").attr("type")!=undefined&& $("#releaseno${id_suffix}").attr("type")!="hidden"){
							     	$('#releaseno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PR&code='+rec.value+'&sub_code=' + $('#releaseno${id_suffix}').combobox("getValue")); 
								} 
							}, 
							onLoadSuccess: function () {
								//用于创建继承
								 if($("#versionno${id_suffix}").length > 0&&$("#versionno${id_suffix}").attr("type")!=undefined&& $("#versionno${id_suffix}").attr("type")!="hidden"){
									if('${obj_fields}' != ""){
						    		      <%if( obj_fields.contains("versionno,")  ) { %>
						    		      var valueField = $(this).combobox("options").valueField;
						    		      var allData = $(this).combobox("getData");
						    		      for (var i = 0; i < allData.length; i++) {
						    		    	if ('${showComboboxData.versionno}' == allData[i][valueField]) {
						    		    		$(this).combobox('select','${showComboboxData.versionno}');  
						    		    	break;
						    		    	}
						    		      }
					    				  
					    				 <%}%>
						    		 }
								} 
							}
							
							
						}); 
		    	 }else  if(type=="PR"){
		    		 
		    		  $(this).combobox({
							data : '[]',
							method : "post",
							valueField : 'value',
							textField : 'text',
							required:true,
							missingMessage:"请选择所属R级",
							editable:false,
							/* onChange:function(newValue,oldValue){
								 if($("#featureno${id_suffix}").length > 0&&$("#featureno${id_suffix}").attr("type")!=undefined&& $("#featureno${id_suffix}").attr("type")!="hidden"){
								     	$('#featureno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=FT&code='+newValue+'&sub_code=' + $('#featureno${id_suffix}').combobox("getValue")); 
									} 
									 if($("#subsystemno${id_suffix}").length > 0&&$("#subsystemno${id_suffix}").attr("type")!=undefined&& $("#subsystemno${id_suffix}").attr("type")!="hidden"){
									     	$('#subsystemno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=SS&code='+newValue+'&sub_code=' + $('#subsystemno${id_suffix}').combobox("getValue")); 
										} 
									 
								}, */
							 onSelect: function(rec){
								 if($("#featureno${id_suffix}").length > 0&&$("#featureno${id_suffix}").attr("type")!=undefined&& $("#featureno${id_suffix}").attr("type")!="hidden"){
							     	$('#featureno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=FT&code='+rec.value+'&sub_code=' + $('#featureno${id_suffix}').combobox("getValue")); 
								} 
								 if($("#subsystemno${id_suffix}").length > 0&&$("#subsystemno${id_suffix}").attr("type")!=undefined&& $("#subsystemno${id_suffix}").attr("type")!="hidden"){
								     	$('#subsystemno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=SS&code='+rec.value+'&sub_code=' + $('#subsystemno${id_suffix}').combobox("getValue")); 
									} 
								 
							}, 
							onLoadSuccess: function () {
								//用于创建继承
								 if($("#releaseno${id_suffix}").length > 0&&$("#releaseno${id_suffix}").attr("type")!=undefined&& $("#releaseno${id_suffix}").attr("type")!="hidden"){
									if('${obj_fields}' != ""){
						    		      <%if( obj_fields.contains("releaseno,")  ) { %>
						    		      var valueField = $(this).combobox("options").valueField;
						    		      var allData = $(this).combobox("getData");
						    		      for (var i = 0; i < allData.length; i++) {
						    		    	if ('${showComboboxData.releaseno}' == allData[i][valueField]) {
						    		    		$(this).combobox('select','${showComboboxData.releaseno}'); 
						    		    	break;
						    		    	}
						    		      }
					    				 <%}%>
						    		 }
								} 
								
								
							}
							
							
						}); 
		    		
		    	 }else  if(type=="FT"){
		    		  $(this).combobox({
							data : '[]',
							method : "post",
							valueField : 'value',
							textField : 'text',
							required:true,
							missingMessage:"请选择特性",
							editable:false,
							onSelect: function(rec){
								
							},onLoadSuccess: function () {
								//用于创建继承
								  if($("#featureno${id_suffix}").length > 0&&$("#featureno${id_suffix}").attr("type")!=undefined&& $("#featureno${id_suffix}").attr("type")!="hidden"){
									 if('${obj_fields}' != ""){
						    		      <%if( obj_fields.contains("featureno,")  ) { %>
						    		      var valueField = $(this).combobox("options").valueField;
						    		      var allData = $(this).combobox("getData");
						    		      for (var i = 0; i < allData.length; i++) {
						    		    	if ('${showComboboxData.featureno}' == allData[i][valueField]) {
						    		    		$(this).combobox('select','${showComboboxData.featureno}'); 
						    		    	break;
						    		    	}
						    		      }
					    				 <%}%>
						    		 }
										
								 } 
							}
							
							
						}); 
		    	 }else  if(type=="SS"){
		    		 
		    		  $(this).combobox({
							data : '[]',
							method : "post",
							valueField : 'value',
							textField : 'text',
							required:true,
							missingMessage:"请选择子系统",
							editable:false,
							/* onChange:function(newValue,oldValue){
								 if($("#moduleno${id_suffix}").length > 0&&$("#moduleno${id_suffix}").attr("type")!=undefined&& $("#moduleno${id_suffix}").attr("type")!="hidden"){
								     	$('#moduleno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=MD&code='+newValue+'&sub_code=' + $('#moduleno${id_suffix}').combobox("getValue")); 
									} 
								}, */
							 onSelect: function(rec){
								 if($("#moduleno${id_suffix}").length > 0&&$("#moduleno${id_suffix}").attr("type")!=undefined&& $("#moduleno${id_suffix}").attr("type")!="hidden"){
							     	$('#moduleno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=MD&code='+rec.value+'&sub_code=' + $('#moduleno${id_suffix}').combobox("getValue")); 
								} 
							}, 
							onLoadSuccess: function () {
								//用于创建继承
								  if($("#subsystemno${id_suffix}").length > 0&&$("#subsystemno${id_suffix}").attr("type")!=undefined&& $("#subsystemno${id_suffix}").attr("type")!="hidden"){
									 if('${obj_fields}' != ""){
						    		      <%if( obj_fields.contains("subsystemno,")  ) { %>
						    		      var valueField = $(this).combobox("options").valueField;
						    		      var allData = $(this).combobox("getData");
						    		      for (var i = 0; i < allData.length; i++) {
						    		    	if ('${showComboboxData.subsystemno}' == allData[i][valueField]) {
						    		    		$(this).combobox('select','${showComboboxData.subsystemno}'); 
						    		    	break;
						    		    	}
						    		      }
					    				 <%}%>
						    		 }
										
								 } 
								
							}
							
							
						}); 
		    	 }   else  if(type=="MD"){
		    		 $(this).combobox({
							data : '[]',
							method : "post",
							valueField : 'value',
							textField : 'text',
							required:true,
							missingMessage:"请选择所属模块",
							editable:false,
							onSelect: function(rec){
								/* if($("#versionno${id_suffix}").length > 0&& $("#versionno${id_suffix}").attr("type")!="hidden"){
							     	$('#versionno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PV&code='+rec.value +'&sub_code=' + $('#versionno${id_suffix}').combobox("getValue")); 
								} */
							},onLoadSuccess: function () {
								//用于创建继承
								 if($("#moduleno${id_suffix}").length > 0&&$("#moduleno${id_suffix}").attr("type")!=undefined&& $("#moduleno${id_suffix}").attr("type")!="hidden"){
									 if('${obj_fields}' != ""){
						    		      <%if( obj_fields.contains("moduleno,")  ) { %>
						    		      var valueField = $(this).combobox("options").valueField;
						    		      var allData = $(this).combobox("getData");
						    		      for (var i = 0; i < allData.length; i++) {
						    		    	if ('${showComboboxData.moduleno}' == allData[i][valueField]) {
						    		    		$(this).combobox('select','${showComboboxData.moduleno}'); 
						    		    	break;
						    		    	}
						    		      }
					    				 <%}%>
						    		 }										
								 } 
							}						
							
						});
		    		 }else if(type.indexOf("dic")!=-1){		    			 
			    			$(this).combobox({
								url : '/product/comboboxDicdata/list?type='+type.split("_")[1],
								method : "post",
								valueField : 'value',
								textField : 'text',
								editable:false,
								selected : 'selected'
							});				    		 
			    		}			    	
			    	 });			    	 
			    	
			     }
			     
			     //编辑 根据选中code加载数据
			      if('${IsEdit}'=='true'){
			    	
			    	//加载数据
			    	  $.ajax({
			    	        type : "POST",
			    	        url : "product/data/${type}codeedit?code=${code}&id=${id}",
			    	        data : null,
			    	        dataType : 'json',
			    	        success : function(result) {debugger
			    	        	$('#linkeyform${id_suffix}').form("load",result);
			    	        debugger
			    	        	$('textarea[autoHeight]').autoHeight(); 
			    	        	if($('#status${id_suffix}01').length>0){
			    	        		if(result.status=='1'){
			    	        			$("#status${id_suffix}01").switchbutton("check");
			    	        		}else{
			    	        			$("#status${id_suffix}01").switchbutton("uncheck");
			    	        		}
			    	        	}
			    	        	if($("#releaseSoftware${id_suffix}").length>0){
			    	        	$("#releaseSoftware${id_suffix}").combotreegrid("setValue",result.releaseSoftware);
			    	        
			    	        	}
			    	        	if($("#releasenoSoftware${id_suffix}").length>0){
			 					$("#releasenoSoftware${id_suffix}").combotreegrid("setValue",result.releasenoSoftware);
			 					
			    	        	}
			    	        	/* if($("#baseline1name${id_suffix}").length>0){
				    	        	$("#baseline1name${id_suffix}").combotreegrid("setValue",result.baseline1name);
				    	        
				    	        	} */
			    	        
				    	        	/* if($("#baseline1${id_suffix}").length>0){
				 					$("#baseline1${id_suffix}").combotreegrid("setValue",result.baseline1);
				 					
				    	        	} */
			    	        	if($('#ifofficialnaming${id_suffix}01').length>0){
			    	        		if(result.ifofficialnaming=='1'){
				    	        		$("#ifofficialnaming${id_suffix}01").switchbutton("check");
				    	        	}else{
				    	        		$("#ifofficialnaming${id_suffix}01").switchbutton("uncheck");
				    	        	}
			    	        	}
			    	        	
			    	        	 
			    	        },
			    	        error : function(result) {

			    	        }
			    	    });
			    	
			      }else{
			    	  if($('#status${id_suffix}01')){debugger
			    		  //$('#status${id_suffix}01').switchbutton({options}).switchbutton("check");
			    	  }
			      }
			
		});
		<c:forEach var="group" items="${groups}">
		$("[id^='T00000_'][id$='${id_suffix}']").each(function () {
	        var id = $(this).prop("id");
	        var display = $('#SUBFORM_'+id).css('display');
	        if (display == 'none') {
	          $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
	         // 重新加载easyui样式
	        } else {
	        	 $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
	        }
	    });
		
			$("#T00000${group }${id_suffix}").click(function(){
				var display = $('#SUBFORM_T00000${group }${id_suffix}').css('display');
				if (display == 'none') {
					$('#SUBFORM_T00000${group }${id_suffix}').show();
					$(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
				} else {
					$('#SUBFORM_T00000${group }${id_suffix}').hide();
					$(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
				}
				
			})
		
		</c:forEach>
			
			//保存方法   直接用jq的click事件easyui低版本不识别无法禁用
			function postSave${id_suffix}(para){
				$('#btnQuit${id_suffix}').linkbutton('disable');
				debugger
				if($('#btnSave${id_suffix}').length>0){
				$('#btnSave${id_suffix}').linkbutton('disable');
				}
				
		    	 
		    	if('${IsEdit}'=='true'){
		    	  url="product/data/${type}edit";//编辑
		    	}else{
		    	  url="product/data/${type}add";//新增
		    	}
		    	
		    	$('#linkeyform${id_suffix}').form('submit', {
					url : url,
					onSubmit : function() {								
						 if('${IsEdit}'=='true'){
							 if($("#status${id_suffix}01").length>0){
								if($("#status${id_suffix}01").switchbutton("options").checked){
									$("#status${id_suffix}").val("1");
								}else{
									$("#status${id_suffix}").val("0");
								}
							 }
						 }
						 if($("#ifofficialnaming${id_suffix}01").length>0){
						 	if($("#ifofficialnaming${id_suffix}01").switchbutton("options").checked){
								$("#ifofficialnaming${id_suffix}").val("1");
							}else{
								$("#ifofficialnaming${id_suffix}").val("0");
							}
						 }
						 
						 //验证不通过按钮设置为可点击
						 if	(!$(this).form('enableValidation').form('validate')){
							 $('#btnQuit${id_suffix}').linkbutton('enable');
							 if($('#btnSave${id_suffix}').length>0){
							 $('#btnSave${id_suffix}').linkbutton('enable');
							 }
						 } 
						 
						 return $(this).form('enableValidation').form('validate');
					},
					async: true,
					success : function(data) {
						//跳转查询页面
						//{"success:true,msg:xxx"}
						//{"success:false,msg:xxx"}						
						eval("var obj = " + data)
						
						if(obj.success){
							//授权用户
							 var userIpmt="";
								var userCmo="";
								var userPop="";
								var tag="";
								//保存成功后授权用户
								if('${type eq "pi"}' == 'true'){
									//授权IPMT执行秘书
									userIpmt=$("#plimptSecretary${id_suffix}").val();
								}else if('${type eq "pt" || type eq "pp" || type eq "pv" || type eq "pr" || type eq "pb"}'=='true'){
									userCmo=$("#cmoId${id_suffix}").val();
									userPop=$("#popId${id_suffix}").val();
								} 
								if(userIpmt!=''||userCmo!=''||userPop!=''){
									$.ajax({
						                type: "POST",
						                url: "/product/data/setUserPower",
						                data:{userIpmt:userIpmt,userCmo:userCmo,userPop:userPop},
						                async: false,
						                success: function (result) {
						                	
						                }
								 	}); 
								}
								//保存退出 关闭当前窗口 刷新树表格
								
							if(para=="0"){
								
								 //成功后跳转页面
								var tab = $('#mainUrl').tabs('getSelected');
								var index = $('#mainUrl').tabs('getTabIndex', tab);
								$("#mainUrl").tabs("close", index);
								//重新加载树表格	
							//重新加载
							$("#tg${tg}").treegrid("reload");
							var p = $("#cc${tg }").layout("panel", "east")[0].clientWidth
							if (p != 0) {
								$('#pg${tg }').propertygrid('loadData', {
									rows : []
								});
								$("#cc${tg }").layout("collapse", "east")
							}
							}else{
								$.messager.alert("提示","保存成功","");
								$('#btnQuit${id_suffix}').linkbutton('enable');	
								if($('#btnSave${id_suffix}').length>0){
								$('#btnSave${id_suffix}').linkbutton('enable');
								}
							}
						} else {
							$.messager.alert("提示",obj.msg,"");
							/* alert(obj.msg); */
							$('#btnQuit${id_suffix}').linkbutton('enable');	
							if($('#btnSave${id_suffix}').length>0){
							$('#btnSave${id_suffix}').linkbutton('enable');
							}
						}
					}
				});
			}
			
			//父版本 基线版本BL  路标版本LB
			function dialogOpen${id_suffix}(tag){
			var code="";
			if(tag=="BL"){
				code=$("#releaseno${id_suffix}").val();
			}else{
				code=$("#versionno${id_suffix}").val();
			}
				$('#winparentversion${id_suffix}').window({  
				    iconCls:"icon-save",
				    modal:true   
				}); 
				$("#selparentversion${id_suffix}").datagrid({
					rownumbers:true,
					columns:[[   
							  {field:'value',title:'版本编码', hidden:true},
					          {field:'text',title:'版本名称',width:100}
					      ]],
					onBeforeLoad: function (param) {  
				              /*   var firstLoad = $(this).attr("firstLoad");  
				                if (firstLoad == "false" || firstLoad == "undefined"|| firstLoad == undefined)  
				                {  
				                    $(this).attr("firstLoad","true");  
				                    return false;  
				                } 
				               
				                return true;   */
				    }, 
					url:"/product/combobox/getparentitemnoByCode?type="+tag+"&code="+ code,
					onLoadSuccess: function(data){
						//alert(data);
						
					},
					onLoadError:function(data){
						//alert("error");
					},
					onDblClickRow:function(rowData,row) {
						$('#winparentversion${id_suffix}').window("close");
					/* 	alert(row.text);
						$("#parentitemno${id_suffix}").val(row.text);
						alert("value:"+$("#parentitemno${id_suffix}").val()); */
						$("#parentitemno${id_suffix}").textbox("setValue",row.value);
						$("#parentitem${id_suffix}").textbox("setText",row.text);
					},	
					fitColumns:true,
				});
			}
			
			$("#parentitem${id_suffix}").textbox({width:'248px',readonly:true});
			
		     //对应的基线平台版本号--改为弹框形式 
            function dialogBaseline1Name${id_suffix}(){
              		$('#winbaseline1name${id_suffix}').window({  
                    	    iconCls:"icon-save",
                    	    modal:true,
                    	    onClose:function(){
                    	    	$("#tabbaseline1name${id_suffix}").treegrid("remove","PL000024");
                    	    }
                    	}); 
              		$("#tabbaseline1name${id_suffix}").empty();
              	  $("#tabbaseline1name${id_suffix}").treegrid({
              		  iconCls : 'icon-ok',
              		  collapsible : false,
              		  url : 'product/treegrid/bldata?adt='+new Date().getTime(),
              		  method : 'get',
              		  idField : 'prodlineno',
              		  treeField : 'prodline',
              		  
              		  striped:true,
                  	  columns:[[
                  		    /*  {field:'id',title:'',formatter:formatcheckbox}, */
                  			 {field:'prodlineno',title:'产品编码',width:200,hidden:true,formatter:formatProgress${id_suffix}},
                               {field:'prodline',title:'产品线',width:200,formatter:formatProgress${id_suffix}},
                               {field:'product',title:'产品',width:200,formatter:formatProgress${id_suffix}},
                               {field:'release',title:'产品R级',width:200,formatter:formatProgress${id_suffix}},
                               {field:'baseline',title:'版本名称',width:200,formatter:formatProgress${id_suffix}},
                               {field:'baselineno',title:'版本内码',hidden:true,width:200,formatter:formatProgress${id_suffix}},
                               {field:'baselineOut',title:'对外版本名称',width:200,formatter:formatProgress${id_suffix}}
                  	   ]],
                		   toolbar : [{
                			id : 'add${id_suffix }',
                			text : '确定',
                			handler : function() {
                				//根据选中项赋值
                   				var rowData=$("#tabbaseline1name${id_suffix}").treegrid("getSelected");
                				if(rowData!=null&&rowData.baselineno!=null){
                				$('#winbaseline1name${id_suffix}').window("close");
                        			$("#baseline1name${id_suffix}").textbox("setText",rowData.baseline);
                        			$("#baseline1${id_suffix}").textbox("setText",rowData.baselineno);
                        			$("#baseline1name${id_suffix}").textbox("setValue",rowData.baseline);
                         			$("#baseline1${id_suffix}").textbox("setValue",rowData.baselineno);
                			      }else{
                						$.messager.alert("提示","请选择要添加的平台基线版本号！！！","");
                					}
                				/* $("#tabbaseline1name${id_suffix}").treegrid("remove","PL000024");
                				$("#tabbaseline1name${id_suffix}").empty(); */
               			}
                		   }],
                			
                			fitColumns : true,
                			fit:true,
                	    	onBeforeExpand : function(row) {//异步架加载树
                			var url = "product/treegrid/bldata";
                			$("#tabbaseline1name${id_suffix}").treegrid("options").url = url;
                			return true;
                		 },onDblClickRow : function(rowData) {
                			//根据选中项赋值
             				if(rowData!=null&&rowData.baselineno!=null){
             				$('#winbaseline1name${id_suffix}').window("close");
                     			$("#baseline1name${id_suffix}").textbox("setText",rowData.baseline);
                     			$("#baseline1${id_suffix}").textbox("setText",rowData.baselineno);
                     			$("#baseline1name${id_suffix}").textbox("setValue",rowData.baseline);
                     			$("#baseline1${id_suffix}").textbox("setValue",rowData.baselineno);
             			      }else{
             						$.messager.alert("提示","请选择要添加的平台基线版本号！！！","");
             					}            			
                			/* $("#tabbaseline1name${id_suffix}").treegrid("remove","PL000024");
                			$("#tabbaseline1name${id_suffix}").empty(); */
                		 }
              	  });
                
            }

			
	</script>
</body>
</html>