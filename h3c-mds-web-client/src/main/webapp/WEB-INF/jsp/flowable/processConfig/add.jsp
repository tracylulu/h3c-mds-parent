<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="toptoolbar" style="position: fixed;margin:0px 20px;">
		<a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存退出</a>
	</div>
	<div class="toptoolbarhr" style="margin-top: 2%;"></div>
	<form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}' >
		<p style="text-align: center;">
			<span style="font-size: 20px;">${title} </span>
		</p>

		<h2 class="subfild hidden" id="h_Config${id_suffix}">
			<span>基础信息配置</span>
		</h2>
		<div id="SUBFORM_T00000${id_suffix}" class="hidden" >
			<table class="linkeytable" data-sort="sortDisabled">
				<tbody>
					<tr class="hidden" style="display:none">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">隐藏信息</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input type="hidden" name="id">							
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">信息类型编码</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="code" style="width: 400px; height: 30px;" id="txt_Code${id_suffix}" value="" size="30" type="textbox" data-options="required:true,missingMessage:'不能为空'"
								class="textbox-value"  />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">信息类型</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="name" style="width: 400px; height: 30px;" id="txt_Name${id_suffix}" value="" size="30" type="textbox" data-options="required:true,missingMessage:'不能为空'"
								class="textbox-value"  />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">类型</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%"  >
							<input name="type" style="width: 400px; height: 30px;" id="txt_Code${id_suffix}" value="" size="30"
								data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxDicdata/list?type=19',required:true,missingMessage:'不能为空'" class="easyui-combobox" />
							
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">备注</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input   name="note" style="width: 400px; height: 30px;" id="txt_Note${id_suffix}" value="" size="30" type="textbox" data-options="required:false" class="textbox-value" />
						</td>
					</tr>

				</tbody>
			</table>
		</div>



	</form>
	<h2 class="subfild" id="h_ConfigItem${id_suffix}" style="margin:0px 20px;">
		<span>基础信息子项配置</span>
	</h2>
	<div style="margin-bottom:5%;overflow-y: auto;margin:0px 20px;">
		<table id="dg${id_suffix}" class="easyui-datagrid" style="width: 80%; height: auto；margin-left:10%">
		</table>
	</div>
	<br/>
	<br/>
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<script src="easyui/jquery.autocomplete.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<script type="text/javascript">
	
	$(function() {
		
		var code = "${code}";
		
		if (code == "") {
		} else {
			$.post('/flowable/processConfig/getByCode/'+code, function(result) {
				$('#linkeyform${id_suffix}').form('load', result.data);
			});
		} 
		InitEditGrid();
		
		$('#btnQuit${id_suffix}').linkbutton({    
		    iconCls: 'fa fa-save',
		    onClick: postSave${id_suffix}
		});
		/* $("#btnQuit${id_suffix}").click(function(){
			
			getConfigItem();
		}) */

	});
	
	function getConfigItem(){
		var _json=new Array();
		var rows=$('#dg${id_suffix}').datagrid("getRows");
		$.each(rows,function(i,item){
			var obj=new Object();
			obj.note=item.note;
			obj.type=item.type;
			obj.fprodPerson=item.fprodPerson;
			obj.pdtMgn=item.pdtMgn;
			/* obj.configCode=$('#txt_Code${id_suffix}').getText(); */
			_json.push(obj);
			
		});
		return _json;
	}
		
		
		function InitEditGrid() {
			$("#dg${id_suffix}").datagrid({
				url : '/flowable/processConfigItem/getDataList/${code}',
				rownumbers : true,
				singleSelect : true,
				fitColumns:true,
				//fit:true,
				pagination : false,
				toolbar : [
					{
						text : '增行',
						handler : function() {
							var rows=$('#dg${id_suffix}').datagrid("getRows");
							$("#dg${id_suffix}").datagrid("insertRow", {
								index :rows==null||rows==undefined?0:rows.length,
								row : {code:'',note:'',type:'',fprodPerson:'',pdtMgn:''}
							});
							
							var rows=$('#dg${id_suffix}').datagrid("getRows");
							rowNumber = rows==null||rows==undefined?0:$("#dg${id_suffix}").datagrid(
									"getRowIndex", rows[rows.length-1]);							
							$("#dg${id_suffix}").datagrid("beginEdit",rowNumber);
							bindAutocomplete(rowNumber)
						}
					},
					{
						text : '启用编辑',
						handler : function() {
							var hasSelect = $("#dg${id_suffix}").datagrid("getSelections");
							if (hasSelect.length == 1) {								
								var row = hasSelect[0];
								rowNumber = $("#dg${id_suffix}").datagrid("getRowIndex", row);
								
								bindAutocomplete(rowNumber);
							}else{
								$.messager.alert("提示","请选择要编辑的行！")
							}
						}
					},
					{
						text:'编辑完成',
						handler:function(){
							var rows=$('#dg${id_suffix}').datagrid("getRows");
							$.each(rows,function(i,item){
								rowNumber = rows==null||rows==undefined?0:$("#dg${id_suffix}").datagrid("getRowIndex", rows[i]);			
								$("#dg${id_suffix}").datagrid("endEdit",rowNumber);
							});
						}
					},
					{
						text:'删行',
						handler:function(){
							var rows = $('#dg${id_suffix}').datagrid("getRows");
							var hasSelect = $("#dg${id_suffix}").datagrid("getSelections");
							if(hasSelect!=null&&hasSelect.length>0){
								var index=$("#dg${id_suffix}").datagrid("getRowIndex",hasSelect[0]);
								$('#dg${id_suffix}').datagrid("deleteRow", index);
							}else{
								 $.messager.alert("请选择要移除的列");
							}
						
							//$('#FileTable').datagrid('deleteRow',index);
						    //var rows = $('#FileTable').datagrid("getRows");    //重新获取数据生成行号
						    //$('#FileTable').datagrid("loadData", rows);
						}
					}
				],
				columns : [[ 
					{title : "id",field : "id",checkbox : true}, 
					/* {title : "编码",field : "code",width : 100,editor : {
						type : 'validatebox',
						options : {required:true,missingMessage:"不能为空"}}
					},  */
					{title : "内容",field : "note",width : 100,editor : {
								type : 'validatebox',
								options : {required:true,missingMessage:"不能为空"}}
					}, 
					{title : "类型",field : "type",width : 100,hidden:true,editor:{type:'combobox',
								options:{
									editable:false,data:[
									{'id':'current_user','text':'current_user'},
									{'id':'bean','text':'bean'},
									{'id':'PROCESS_ROLE','text':'PROCESS_ROLE'}
									],
									valueField : "id",
									textField : "text"}
						}
					
					},
					{title : "财务接口人",field : "fprodPerson",width:80,editor:'text'}, 	
					{title : "PDT管理员",field : "pdtMgn",width:80,editor:'text'}, 
					]],
				onLoadSuccess:function(data){  
		            var rows=$('#dg${id_suffix}').datagrid("getRows");		           
		            if (rows==null||rows==undefined||rows.length == 0) {
		            	$("#dg${id_suffix}").datagrid("insertRow", {
		            		index :rows==null||rows==undefined?0:rows.length,
							row : {code:'',note:'',type:'',fprodPerson:'',pdtMgn:''}
						});
		            }
		        }
			});
		}
		
		//绑定联想输入
		function bindAutocomplete(rowNumber){
			$("#dg${id_suffix}").datagrid("beginEdit",	rowNumber);
			
			var editors = $('#dg${id_suffix}').datagrid('getEditors', rowNumber);    
			var _input_fprodPerson=editors[2].target[0];
			singleUserAutocomplete(_input_fprodPerson);								
			var _input_pdtMgn=editors[3].target[0];
			singleUserAutocomplete(_input_pdtMgn);
		}
		
		function singleUserAutocomplete(obj){
			//单个人员联想
			 $(obj).autocomplete("/product/userlink/list?userCode=liucaixuan", {
				 multiple: false,
				 max : 20, //列表里的条目数
				 minChars : 2, //自动完成激活之前填入的最小字符
				 width : "400px", //提示的宽度，溢出隐藏
				 scrollHeight : 400, //提示的高度，溢出显示滚动条
				 matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
				 autoFill : false, //自动填充
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
			 });
		}
		
		function postSave${id_suffix}(){
			$('#btnQuit${id_suffix}').linkbutton('disable');
			
			var rows=$('#dg${id_suffix}').datagrid("getRows");
			$.each(rows,function(i,item){
				rowNumber = rows==null||rows==undefined?0:$("#dg${id_suffix}").datagrid(
						"getRowIndex", rows[i]);			
				$("#dg${id_suffix}").datagrid("endEdit",rowNumber);
			});
			var checked=true;debugger
			$.each($('#dg${id_suffix}').datagrid("getRows"),function(i,item){
				if(item.note==null||item.note==undefined||item.note==""){
					checked=false;				
					return false;
				}
			});
			if(!checked){
				$.messager.alert("提示","请填写内容列！");
				$('#btnQuit${id_suffix}').linkbutton('enable');
				return;
			}
	    	 
	    	if('${IsEdit}'=='true'){
	    	  url="/flowable/processConfig/configEdit";//编辑
	    	}else{
	    	  url="/flowable/processConfig/configAdd";//新增
	    	}
	    	
	    	$('#linkeyform${id_suffix}').form('submit', {
				url : url,
				onSubmit : function(param) {	
					//$('#dg${id_suffix}').datagrid('endEdit', indexId);//结束编辑

					if ($('#dg${id_suffix}').datagrid('getChanges').length) {
						
						//获得增加数据  
					    var inserted = $('#dg${id_suffix}').datagrid('getChanges', "inserted");  
					    //获得修改数据  
					    var updated = $('#dg${id_suffix}').datagrid('getChanges', "updated"); 
					
						var deleted=$('#dg${id_suffix}').datagrid('getChanges', "deleted");  

					    if (inserted.length) {  
					        param.inserted = JSON.stringify(inserted);  					           
					    }    
					    if (updated.length) {  
					        param.updated = JSON.stringify(updated);  					            
					    } 
					 	if (deleted.length) {  					 			 
						    param.deleted = JSON.stringify(deleted);  							      
						} 
					}				
					 
					 //验证不通过按钮设置为可点击
					if	(!$(this).form('enableValidation').form('validate')){
						 $('#btnQuit${id_suffix}').linkbutton('enable');
					} 
					 
					return $(this).form('enableValidation').form('validate');
				},
				success : function(data) {					
					//跳转查询页面
					//{"success:true,msg:xxx"}
					//{"success:false,msg:xxx"}						
					eval("var obj = " + data)
					
					if(obj.success){
						var tab = $('#mainUrl').tabs('getSelected');
						var index = $('#mainUrl').tabs('getTabIndex', tab);
						//$('#btnQuit${id_suffix}').linkbutton('enable');	
						$("#mainUrl").tabs("close", index)
					} else {
						$.messager.alert("提示",obj.msg);
						$('#btnQuit${id_suffix}').linkbutton('enable');	
					}
				},
				error:function(a,b,c){
					alert(a);
				}
			});
		}
	</script>
</body>
</html>