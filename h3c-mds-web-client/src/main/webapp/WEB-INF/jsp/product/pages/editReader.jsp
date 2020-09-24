<%@page import="java.lang.reflect.Field"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看对象</title>
</head>
<body>
	<div class="toptoolbar" style="position: fixed;margin:0px 20px;z-index:9000">
	<a href="#" id="btnEdit${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-edit',disabled:${showStatus eq 'true'?false:true}">编辑</a>
		<a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save',disabled:true">保存退出</a>
		| <a href="#"
			id="btnSave${id_suffix}" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'fa fa-save',disabled:true"
			>保存</a>
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
							
 							<c:if test="${colunmConfigList.columntype == 'hidden' && colunmConfigList.columnname.contains('内码')}">
									<tr class="firstRow" style="">
										<td width="15%" align="right" style="word-break: break-all;">${colunmConfigList.columnname}</td>
										<td  style="pointer-events:none;word-break: break-all; padding-left: 20px; height: 30px" width="85%">
											<input name="${colunmConfigList.columncode}" id="${colunmConfigList.columncode}${id_suffix}" 
											style="width:800px;height:30px;" size="30"
												class="${colunmConfigList.columnclass} " readOnly="readOnly" />
										</td>
									</tr>
								</c:if>  

								<c:if test="${colunmConfigList.columntype != 'hidden'}">
									<tr class="firstRow">
										<!-- firstRow -->
										<td width="15%" align="right" style="word-break: break-all;">${colunmConfigList.columnname}</td>
										<td style="pointer-events:none;word-break: break-all; padding-left: 20px; height: 30px" width="85%">
											<c:if
												test="${colunmConfigList.columncode!='remark'&&colunmConfigList.columnclass!='table'&&colunmConfigList.columncode!='status' && colunmConfigList.columncode!='ifofficialnaming'}">
												
												 <input name="${colunmConfigList.columncode}" style="width:800px;height:${colunmConfigList.columncode eq 'remark'? '100px':'30px'};"
													id="${colunmConfigList.columncode}${id_suffix}" value="" size="30" type="${colunmConfigList.columntype}"
													data-options="multiline:${colunmConfigList.columncode eq 'remark'? true:false},validType:'${colunmConfigList.validatelength==null||colunmConfigList.validatelength eq '' ? false:colunmConfigList.validatelength }',required:${colunmConfigList.columnvalidate  == null ||  colunmConfigList.columnvalidate eq '' ? false: colunmConfigList.columnvalidate},missingMessage:'${colunmConfigList.columnmessage }'"
													class="${colunmConfigList.columnclass eq 'easyui-combobox' ? 'easyui-combobox-type' :  colunmConfigList.columnclass} "  readOnly="readOnly"/> 
											<c:if test="${colunmConfigList.columncode=='readers'}">
											<br>
											<span>*表示所有人能够看到，否则请用群组或ID来控制读者</span>
											</c:if>
											</c:if>
											<c:if test="${colunmConfigList.columncode=='remark'}" >
												
												<textarea name="${colunmConfigList.columncode}" readOnly="readOnly"  autoHeight="true" style="width:800px;" id="${colunmConfigList.columncode}${id_suffix}" ></textarea> 
											</c:if>
											<c:if test="${colunmConfigList.columnclass=='table'}">
											<table style="width:800px;height:auto;pointer-events:none;table-layout:fixed;">
											<c:forEach var="projectInfo" items="${projectInfo}">
											  <tr><td style="word-wrap:break-word;width:17%;">${projectInfo.projectno}</td>
											  <td style="word-wrap:break-word;width:17%;">${projectInfo.fProjno}</td>
											  <td style="word-wrap:break-word;width:33%;">${projectInfo.project}</td>
											  <td style="word-wrap:break-word;width:33%;">${projectInfo.engproject}</td>
											  </tr>
											  </c:forEach>
											  </table>
											</c:if>
											<!-- 父版本 -->
											<c:if test="${colunmConfigList.columncode=='parentitem'}">

												<a href="javascript:void(0)" class="easyui-linkbutton" style="pointer-events:none;" readOnly="readOnly" onclick="dialogOpen${id_suffix}('BL')">基线版本</a>
												<a href="javascript:void(0)" class="easyui-linkbutton" style="pointer-events:none;" readOnly="readOnly" onclick="dialogOpen${id_suffix}('PR')">路标版本</a>
											</c:if>
											<%-- </c:if> --%>
											<!-- 隐藏状态实际值   -->
											<c:if test="${colunmConfigList.columncode=='status'}">
												<input type="hidden" name="${colunmConfigList.columncode}" id="${colunmConfigList.columncode}${id_suffix}" checked/>
												<input style="height: 30px;pointer-events:none;" id="${colunmConfigList.columncode}${id_suffix}01" value="" size="30" type="${colunmConfigList.columntype}"
														data-options="readonly:true,onText:'有效',offText:'失效'" class="${colunmConfigList.columnclass}" />
												
											</c:if>
											<!-- 隐藏是否已正式命名实际值   -->
											<c:if test="${colunmConfigList.columncode=='ifofficialnaming'}">
												<input type="hidden" name="${colunmConfigList.columncode}" id="${colunmConfigList.columncode}${id_suffix}" />
												
													<input style="height: 30px;pointer-events:none;" id="${colunmConfigList.columncode}${id_suffix}01" value="" size="30" type="${colunmConfigList.columntype}"
														data-options="readonly:true,onText:'是',offText:'否'" class="${colunmConfigList.columnclass}" />
												
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
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<script type="text/javascript" src="common/js/prBelowApply.js"></script>
	<script type="text/javascript">
	$(function(){
		$('textarea[autoHeight]').autoHeight(); 
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
			//编辑
				$('#btnEdit${id_suffix}').bind('click',function(){
					if($(this).linkbutton("options").disabled){
						return;
					}else{
						 var tab = $('#mainUrl').tabs('getSelected');
               			 var index = $('#mainUrl').tabs('getTabIndex', tab);
               			 $("#mainUrl").tabs("close", index);
               			$('#mainUrl')
						.tabs(
								'add',
								{
									title : "修改${title}",
									href : 'product/pages/${type}edit/${code}/${id}/${tg}/${showStatus}/1',
									closable:true
								}); 
						
					}
				});
			
			//保存退出
			/* $('#btnQuit${id_suffix}').linkbutton({    
			    iconCls: 'fa fa-save',
			    onClick: "postSave${id_suffix}('0')"
			});  */
			/* $('#btnQuit${id_suffix}').bind('click',"0",function(){
				var tag="0";
				postSave${id_suffix}(tag);
				
			}); */
			
			
			//保存
			/* $('#btnSave${id_suffix}').bind('click',"1", function(){
				var tag="1";
				postSave${id_suffix}(tag);
			}); */
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
				 					width:'800',
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
							 } */
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
								/* onChange:function(newValue,oldValue){
									if($("#prodlineno${id_suffix}").length > 0&&$("#prodlineno${id_suffix}").attr("type")!=undefined&& $("#prodlineno${id_suffix}").attr("type")!="hidden"){
								    	$('#prodlineno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PL&code='+newValue+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue")); 
									}
								}, */
								 onSelect: function(rec){
								
									if($("#prodlineno${id_suffix}").length > 0&&$("#prodlineno${id_suffix}").attr("type")!=undefined&& $("#prodlineno${id_suffix}").attr("type")!="hidden"){
								    	$('#prodlineno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PL&code='+rec.value+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue")); 
									}
								}, 
								onLoadSuccess: function () {
									<%-- if($("#plipmtno${id_suffix}").length > 0&&$("#plipmtno${id_suffix}").attr("type")!=undefined&& $("#plipmtno${id_suffix}").attr("type")!="hidden"){
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
									} --%>
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
										if($("#pdtno${id_suffix}").length > 0&&$("#pdtno${id_suffix}").attr("type")!=undefined && $("#pdtno${id_suffix}").attr("type")!="hidden"){
											
									     	$('#pdtno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PT&code='+newValue+'&sub_code=');// +$('#pdtno${id_suffix}').combobox("getValue")); 
										} 
										if($("#productno${id_suffix}").length > 0&&$("#productno${id_suffix}").attr("type")!=undefined&&$("#productno${id_suffix}").attr("type")!="hidden"){
									     	$('#productno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PP&code='+newValue + '&sub_code=' +$('#productno${id_suffix}').combobox("getValue")); 
										}
									}, */
									 onSelect: function(rec){
										//alert(rec.value)
										
										if($("#pdtno${id_suffix}").length > 0&&$("#pdtno${id_suffix}").attr("type")!=undefined && $("#pdtno${id_suffix}").attr("type")!="hidden"){
											
									     	$('#pdtno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PT&code='+rec.value+'&sub_code=');// +$('#pdtno${id_suffix}').combobox("getValue")); 
										} 
										if($("#productno${id_suffix}").length > 0&&$("#productno${id_suffix}").attr("type")!=undefined&&$("#productno${id_suffix}").attr("type")!="hidden"){
									     	$('#productno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PP&code='+rec.value + '&sub_code=' +$('#productno${id_suffix}').combobox("getValue")); 
										}
									}, 
									onLoadSuccess: function () {
										<%-- if($("#prodlineno${id_suffix}").length > 0&&$("#prodlineno${id_suffix}").attr("type")!=undefined&& $("#prodlineno${id_suffix}").attr("type")!="hidden"){
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
										} --%>
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
										<%-- if($("#pdtno${id_suffix}").length > 0&&$("#pdtno${id_suffix}").attr("type")!=undefined && $("#pdtno${id_suffix}").attr("type")!="hidden"){
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
										} --%>
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
										<%-- if($("#productno${id_suffix}").length > 0&&$("#productno${id_suffix}").attr("type")!=undefined&&$("#productno${id_suffix}").attr("type")!="hidden"){
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
										} --%>
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
								<%-- if($("#versionno${id_suffix}").length > 0&&$("#versionno${id_suffix}").attr("type")!=undefined&& $("#versionno${id_suffix}").attr("type")!="hidden"){
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
								} --%>
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
								<%-- if($("#releaseno${id_suffix}").length > 0&&$("#releaseno${id_suffix}").attr("type")!=undefined&& $("#releaseno${id_suffix}").attr("type")!="hidden"){
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
								} --%>
								
								
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
								<%--  if($("#featureno${id_suffix}").length > 0&& $("#featureno${id_suffix}").attr("type")!=undefined&& $("#featureno${id_suffix}").attr("type")!="hidden"){
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
										
								 } --%>
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
								 <%-- if($("#subsystemno${id_suffix}").length > 0&&$("#subsystemno${id_suffix}").attr("type")!=undefined&& $("#subsystemno${id_suffix}").attr("type")!="hidden"){
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
										
								 } --%>
								
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
								<%-- if($("#moduleno${id_suffix}").length > 0&&$("#moduleno${id_suffix}").attr("type")!=undefined&& $("#moduleno${id_suffix}").attr("type")!="hidden"){
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
								 } --%>
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
			    	        success : function(result) {
			    	        	$('#linkeyform${id_suffix}').form("load",result);
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
				    	        
				    	        	}
			    	        
				    	        	if($("#baseline1${id_suffix}").length>0){
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
							}
						} else {
							$.messager.alert("提示",obj.msg,"");
							/* alert(obj.msg); */
							$('#btnQuit${id_suffix}').linkbutton('enable');	
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
			
			
			
	</script>
	
</body>
</html>