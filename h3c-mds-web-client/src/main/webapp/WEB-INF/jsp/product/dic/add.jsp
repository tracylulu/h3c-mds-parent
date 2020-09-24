<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>字典新增</title>
</head>
<body>
	<div class="toptoolbar" style="position: fixed;">
		<a href="#" id="btnSave${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存退出</a>
	</div>
	<div class="toptoolbarhr" style="margin-top: 2%;"></div>
	<form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}'>
		<p style="text-align: center;">
			<span style="font-size: 20px;">${title} </span>
		</p>

		<h2 class="subfild" id="h_Config${id_suffix}">
			<span>基础信息配置</span>
		</h2>
		<div id="SUBFORM_T00000${id_suffix}">
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
						<td width="15%" align="right" style="word-break: break-all;">类型编码</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="dicTypecode" style="width: 400px; height: 30px;" id="txt_Name${id_suffix}" value="" size="30" type="textbox" data-options="required:true,missingMessage:'不能为空'"
								class="textbox-value"  />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">类型名称</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="dicTypename" style="width: 400px; height: 30px;" id="txt_Name${id_suffix}" value="" size="30" type="textbox" data-options="required:true,missingMessage:'不能为空'"
								class="textbox-value"  />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">字典编码</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="dicValue" style="width: 400px; height: 30px;" id="txt_Name${id_suffix}" value="" size="30" type="textbox" data-options="required:true,missingMessage:'不能为空'"
								class="textbox-value"  />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">字典名称</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="dicName" style="width: 400px; height: 30px;" id="txt_Name${id_suffix}" value="" size="30" type="textbox" data-options="required:true,missingMessage:'不能为空'"
								class="textbox-value"  />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">备注</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input   name="remark" style="width: 400px; height: 30px;" id="txt_Note${id_suffix}" value="" size="30" type="textbox" data-options="required:false" class="textbox-value" />
						</td>
					</tr>
					<tr>
						<td width="15%" align="right" style="word-break: break-all;">状态</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
 							<input class="easyui-switchbutton" id="status${id_suffix}" data-options="onText:'有效',offText:'无效'" />
						</td>						
					</tr>
				</tbody>
			</table>
		</div>
	</form>

	<script type="text/javascript">
	$(function() {
		$("#status${id_suffix}").attr("checked",true);
		
		var id = "${id}";
		
		if (id != null && id != undefined && id != "") {
			$.post('/product/dic/get/'+id, function(result) {
				$('#linkeyform${id_suffix}').form('load', result.data);
				if(result.data.flag!=null&&result.data.flag!=undefined&&result.data.flag=="1"){
					$("#status${id_suffix}").attr("checked",true);
				}
			});
		} 		
		
		$('#btnSave${id_suffix}').linkbutton({    
		    iconCls: 'fa fa-save',
		    onClick: postSave${id_suffix}
		});		

	});
		
	function postSave${id_suffix}(){
		$('#btnQuit${id_suffix}').linkbutton('disable');		
		var url='';
		if ("${id}" != null && "${id}" != undefined && "${id}" != "") {
			url='/product/dic/update';
		}else{
			url='/product/dic/save';
		}
	   	$('#linkeyform${id_suffix}').form('submit', {
			url : url,
			onSubmit : function(param) {
				if($("#status${id_suffix}").attr("checked")=="checked"){
					param.flag=1;
				}
				 //验证不通过按钮设置为可点击
				if(!$(this).form('enableValidation').form('validate')){
					$('#btnQuit${id_suffix}').linkbutton('enable');
				} 
				 
				return $(this).form('enableValidation').form('validate');
			},
			success : function(data) {					
				//跳转查询页面				
				eval("var obj = " + data);				
				if(obj.success){
					var tab = $('#mainUrl').tabs('getSelected');
					var index = $('#mainUrl').tabs('getTabIndex', tab);
					//$('#btnQuit${id_suffix}').linkbutton('enable');	
					$("#mainUrl").tabs("close", index)
				} else {
					alert(obj.msg);
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