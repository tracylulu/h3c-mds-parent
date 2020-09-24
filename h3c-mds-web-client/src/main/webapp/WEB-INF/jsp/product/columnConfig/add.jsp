<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增R版本</title>
 <link rel="stylesheet" type="text/css" href="../../easyui/devclient.css" /> 
<!--字体图标-->
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/icons/css/font-awesome.min.css" />
    <!--皮肤-->
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/gray/easyui.css" />
    <link rel="stylesheet" type="text/css" href="../../easyui/css/superBlue.css" />
    <script src="../../easyui/super.js" type="text/javascript" charset="utf-8"></script>
<!--easyui-->
<script src="../../easyui/jquery.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="../../easyui/jquery.easyui.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="../../easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body>
	<div class="toptoolbar" >| 
		<a href="#" id="btnQuit" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'" onclick="submit('Quit');return false;">保存退出</a>|
		<a href="#" id="btnSave" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'" onclick="submit();return false;">保存</a>|
		<a href="#" id="btnBack" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-share'" onclick="close1();return false;">返回</a>
	</div>
	<div class="toptoolbarhr">
	</div>
	<form method='post' name='ff' id='ff'>
		<p style="text-align: center;">
			<span style="font-size: 20px;">配置项信息</span>
		</p>
		
		<div id="SUBFORM_T00000">
			<table class="linkeytable" data-sort="sortDisabled">
				<tbody>

					<input name="id" id="id" value="${id}" type="hidden"/>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">列名：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columncode" id="columncode" value="" size="30" style=""
							data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">列中文名：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columnname" id="columnname" value="" size="30" style=""
							data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">分组：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columngroup" id="columngroup" value="" size="30" style=""
							data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">分组排序：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="grouporder" id="grouporder" value="" size="30" style=""
							data-options="" /></td>
					</tr>
					
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">查询排序：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="queryorder" id="queryorder" value="" size="30" style=""
							data-options="" /></td>
					</tr>
					
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">配置列排序：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columnorder" id="columnorder" value="" size="30" style=""
							data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">新增排序：</td>
						<td style="word-break: break-all;" width="85%"><input
								name="addorder" id="addorder" value="" size="30" style=""
								data-options="" /></td>
					</tr>

					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">编辑排序：</td>
						<td style="word-break: break-all;" width="85%"><input
								name="editorder" id="editorder" value="" size="30" style=""
								data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">类型：</td>
						<td style="word-break: break-all;" width="85%">
							<select	name="type" id="type" class="easyui-combobox" data-options="editable:false" style="width:241px;height:22">
								<option value="">请选择</option>
								<option value="PI">IPMT</option>
								<option value="PL">产品线</option>
								<option value="PT">PDT</option>
								<option value="PP">研发产品</option>
								<option value="PV">产品V级</option>
								<option value="PR">产品R级</option>
								<option value="PB">产品B级</option>
								<option value="PJ">研发项目</option>
								<option value="BL">基线版本</option>
								<option value="FT">特性</option>
								<option value="SF">子特性</option>
								<option value="TM">项目组</option>
								<option value="SS">子系统</option>
								<option value="MD">模块</option>
								<option value="MV">模块版本</option>
							</select>
						</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">状态：</td>
						<td style="word-break: break-all;" width="85%"><input
							type="radio" name="flag" id="flag1"
							value="1" checked="true" /> 是  <input type="radio"
							name="flag" id="flag2" value="0" />否</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">查询状态：</td>
						<td style="word-break: break-all;" width="85%"><input
							type="radio" name="queryflag" id="queryflag1"
							value="1" checked="true" /> 是  <input type="radio"
							name="queryflag" id="queryflag2" value="0" />否</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">属性状态：</td>
						<td style="word-break: break-all;" width="85%"><input
							type="radio" name="columnflag" id="columnflag1"
							value="1" checked="true" /> 是  <input type="radio"
							name="columnflag" id="columnflag2" value="0" />否</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">新增状态：</td>
						<td style="word-break: break-all;" width="85%"><input
								type="radio" name="addflag" id="addflag1"
								value="1" checked="true" /> 是  <input type="radio"
																	  name="addflag" id="addflag2" value="0" />否</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">编辑状态：</td>
						<td style="word-break: break-all;" width="85%"><input
								type="radio" name="editflag" id="editflag1"
								value="1" checked="true" /> 是  <input type="radio"
																	  name="editflag" id="editflag2" value="0" />否</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">是否可编辑：</td>
						<td style="word-break: break-all;" width="85%"><input
							type="radio" name="editstatus" id="editstatus1"
							value="1" checked="true" /> 是  <input type="radio"
							name="editstatus" id="editstatus2" value="0" />否</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">是否需要IPMT秘书：</td>
						<td style="word-break: break-all;" width="85%"><input
							type="radio" name="ipmtcheck" id="ipmtcheck1"
							value="1" checked="true" /> 是  <input type="radio"
							name="ipmtcheck" id="ipmtcheck2" value="0" />否</td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">备注：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="remark" id="remark" value="" size="30"
							style="" data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">样式：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columnclass" id="columnclass" value="" size="30"
							style="" data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">字段类型 关联字典表：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columntype" id="columntype" value="" size="30"
							style="" data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">校验：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columnvalidate" id="columnvalidate" value="" size="30"
							style="" data-options="" /></td>
					</tr>
					<tr class="firstRow">
						<td width="15%" align="right" style="word-break: break-all;">提示信息：</td>
						<td style="word-break: break-all;" width="85%"><input
							name="columnmessage" id="columnmessage" value="" size="30"
							style="" data-options="" /></td>
					</tr>
					
				</tbody>
			</table>

		</div>
	
		
	</form>
	<div id="win"></div>
	<script type="text/javascript">
		function ExpandSubForm(obj) {
			var display = $('#SUBFORM_' + obj.id).css('display');
			if (display == 'none') {
				$('#SUBFORM_' + obj.id).show();
			} else {
				$('#SUBFORM_' + obj.id).hide();
			}

		}
		
		function displayPage(type){
			
			$('#columnWin').window('open');
			$.get('product/columnConfig/getById/1',function(result){
				$('#ff').form('load', result.data);	
			});
			
		}
		
		function submit(e){
			$.messager.progress();	// display the progress bar
			$('#ff').form('submit', {
				url: "product/columnConfig/submit",
				onSubmit: function(){
					var isValid = $(this).form('validate');
					if (!isValid){
						$.messager.progress('close');	// hide progress bar while the form is invalid
					}
					return isValid;	
				},
				success: function(data){
					var obj = JSON.parse(data);
					
					if(obj.status==200){
						alert("保存成功");
					}else{
						alert("保存失败");
					}
					$.messager.progress('close');	// hide progress bar while submit successfully
					if(e == 'Quit'){
						close1();
					}
				}
			});
		}
		$(function(){
			var id = "${id}";
			if(id == ""){
			}else{
				$.get('product/columnConfig/getById/'+id,function(result){
					$('#ff').form('load', result.data);	
				});
			}
				
		});
		
		function close1(){
			var pp = $('#mainUrl').tabs('getSelected');
			var index = $('#mainUrl').tabs('getTabIndex',pp);
			$('#mainUrl').tabs('close',index);
		}
	</script>
</body>
</html>