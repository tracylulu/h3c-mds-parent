<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>
	<div class="toptoolbar" style="position: fixed;">
		<a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存退出</a>
	</div>
	<div class="toptoolbarhr" style="margin-top: 2%;"></div>
	<form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}'>
		<p style="text-align: center;">
			<span style="font-size: 20px;">${title} </span>
		</p>

		<h2 class="subfild" id="h_Config${id_suffix}">
			<span>人员配置</span>
		</h2>
		<div id="SUBFORM_T00000${id_suffix}">
			<table class="linkeytable" data-sort="sortDisabled">
				<tbody>
					<tr class="hidden" style="display: none">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">隐藏信息</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input type="hidden" name="id">
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">所属电子流</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="processCode" style="width: 400px; height: 30px;" id="cb_processCode${id_suffix}" value="" size="30"
								data-options="valueField: 'code', textField: 'name',  
								url: '/flowable/processConfig/getComboxList',required:true,missingMessage:'不能为空'" class="easyui-combobox" />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">人员</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="checkerName" style="width: 400px; height: 30px;" id="txt_user${id_suffix}" value="" size="30" type="textbox" data-options="required:true,missingMessage:'不能为空'"
								class="auto_selusers_false" />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">所属角色</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="processRoleCode" id="cb_roleCode${id_suffix}" style="width: 400px; height: 30px;" value="" size="30"
								data-options="valueField: 'code', textField: 'note', 
						 required:true,missingMessage:'不能为空'" class="easyui-combobox" />

						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">所属部门</td>

						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="deptCode" style="width: 400px; height: 30px;" value="" size="30"
								data-options="valueField:'value', textField:'text',url:'/product/comboboxDicdata/list?type=20', 
						 required:false,missingMessage:'不能为空'" class="easyui-combobox" />

						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">备注</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input name="note" style="width: 400px; height: 30px;" id="txt_Note${id_suffix}" value="" size="30" data-options="required:false" class="textbox-value" />
						</td>
					</tr>

				</tbody>
			</table>
		</div>
	</form>

	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<script type="text/javascript">
	$(function() {
		
		var id = '${id}';
		
		if (id != null&&id!=undefined) {
			$.post('/flowable/processConfigPerson/getByCode/'+id, function(result) {
				$('#linkeyform${id_suffix}').form('load', result.data);
			});
		}
		
		$('#btnQuit${id_suffix}').linkbutton({    
		    iconCls: 'fa fa-save',
		    onClick: postSave${id_suffix}
		});
		
		$('#cb_processCode${id_suffix}').combobox({
            onSelect: function (rec) {           	
                var url = '/flowable/processConfigItem/getComboxList/' + rec.code;
                $('#cb_roleCode${id_suffix}').combobox('reload', url);
            }
        });
	});
	
	
		function postSave${id_suffix}(){
			$('#btnQuit${id_suffix}').linkbutton('disable');
	    	 
	    	if('${IsEdit}'=='true'){
	    	  url="/flowable/processConfigPerson/configPersonEdit";//编辑
	    	}else{
	    	  url="/flowable/processConfigPerson/configPersonAdd";//新增
	    	}
	    	
	    	$('#linkeyform${id_suffix}').form('submit', {
				url : url,
				onSubmit : function(param) {	

					 //验证不通过按钮设置为可点击
					if	(!$(this).form('enableValidation').form('validate')){
						 $('#btnQuit${id_suffix}').linkbutton('enable');
					} 
					 
					return $(this).form('enableValidation').form('validate');
				},
				success : function(data) {
					
					//跳转查询页面
								
					eval("var obj = " + data)
					
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