<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增R版本</title>
</head>
<body>
	<div class="toptoolbar">
		| <a href="#" id="btnQuit" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'icon-save'"
			onclick="SaveDocument('Quit');return false;">保存退出</a>| <a href="#"
			id="btnSave" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'icon-save'"
			onclick="SaveDocument();return false;">保存</a>| <a href="#"
			id="btnBack" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'icon-back'"
			onclick="closeTab();">返回</a>
	</div>
	<div class="toptoolbarhr"></div>
	<form method='post' name='linkeyform' id='linkeyform'>
		<p style="text-align: center;">
			<span style="font-size: 20px;">研发产品信息 </span>
		</p>
		<c:forEach var="group" items="${groups}">
			<p>
				<span id="T00000${group }" class="CollapseSubForm"
					onclick="ExpandSubForm(this)">${group }</span>
			</p>
			<div id="SUBFORM_T00000${group }">
				<table class="linkeytable" data-sort="sortDisabled">
					<tbody>						<c:forEach var="colunmConfigList" items="${colunmConfigList}">

							<c:if test="${group eq colunmConfigList.columngroup }">
								<tr class="firstRow">
									<td width="15%" align="right" style="word-break: break-all;">${colunmConfigList.columnname}</td>
									<td style="word-break: break-all;" width="85%"><input
										name="${colunmConfigList.columncode.toLowerCase()}"
										id="${colunmConfigList.columncode.toLowerCase()}" value=""
										size="30" type="${colunmConfigList.columntype}"
										data-options="" class="${colunmConfigList.columnclass}" /></td>
								</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>
			</div>

		</c:forEach>


	</form>
	<div id="win"></div>
	<script type="text/javascript">
		$(function(){
			if($("#plipmt").length > 0){
				//下拉框值加载
				$("#plipmt").combobox({
				    url: '/product/releasecomboboxdata/list?type=PL',
				    method : "post",
				    valueField: 'value',
				    textField: 'text',
				    selected: 'selected'
				});
			}
			if($("#prodline").length > 0){
				//下拉框值加载
				$("#prodline").combobox({
				    url: '/product/releasecomboboxdata/list?type=PL',
				    method : "post",
				    valueField: 'value',
				    textField: 'text',
				    selected: 'selected'
				});
			}
			if($("#product").length > 0){
				//下拉框值加载
				$("#product").combobox({
				    url: '/product/releasecomboboxdata/list?type=PL',
				    method : "post",
				    valueField: 'value',
				    textField: 'text',
				    selected: 'selected'
				});
			}
			if($("#pdt").length > 0){
				//下拉框值加载
				$("#pdt").combobox({
				    url: '/product/releasecomboboxdata/list?type=PL',
				    method : "post",
				    valueField: 'value',
				    textField: 'text',
				    selected: 'selected'
				});
			}
			if($("#version").length > 0){
				//下拉框值加载
				$("#version").combobox({
				    url: '/product/releasecomboboxdata/list?type=PL',
				    method : "post",
				    valueField: 'value',
				    textField: 'text',
				    selected: 'selected'
				});
			}
		});
	//折叠面板
		function ExpandSubForm(obj) {
			var display = $('#SUBFORM_' + obj.id).css('display');
			if (display == 'none') {
				$('#SUBFORM_' + obj.id).show();
			} else {
				$('#SUBFORM_' + obj.id).hide();
			}

		}
	//保存
	function SaveDocument(arg){
	  	$('#linkeyform').form('submit', {
	  		 url:"release/submit",
			    onSubmit: function(){
			    	
			    	return $(this).form('enableValidation').form('validate');
			    },
			    success:function(data){
			    	//跳转查询页面
			    }
	  	});
	}
	
	function closeTab(){
		var tab = $('#mainUrl').tabs('getSelected');
		var index = $('#mainUrl').tabs('getTabIndex',tab);
		$("#mainUrl").tabs("close", index) 

	}
	
	
	</script>
</body>
</html>