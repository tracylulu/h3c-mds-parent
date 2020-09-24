<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>edit</title>
</head>
<body>
	<div class="toptoolbar" style="position: fixed; margin: 0px 20px; z-index: 9000;">
		<a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存退出</a>
		<c:if test="${IsEdit=='true'}">
		| <a href="#" id="btnSave${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存</a>
		</c:if>
	</div>
	<br>
	<br>
	<p>
	<p>
		<span class="title191030">${title} </span>
	</p>
	<div class="toptoolbarhr" style="margin-top: 2%; margin: 0px 20px;"></div>
	<form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}' style="margin: 0px 20px;">
		<h2 class="subfild" id="T00000_dept_${id_suffix}">
			<span>部门信息</span>
		</h2>
		<div id="SUBFORM_T00000_dept_${id_suffix}">
			<table class="linkeytable" data-sort="sortDisabled">
				<!-- linkeytable -->
				<tbody>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">SAP编码</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px; pointer-events:none;" width="85%">
							<input style="height: 30px;" name="code"  id="code${id_suffix}" readOnly="readOnly" value="" size="30" type="text" data-options="" class="easyui-textbox" />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">部门中文名称</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
			
							<input style="height: 30px;" name="name" id="name${id_suffix}" value="" size="30" type="text" data-options="readonly:true" class="easyui-textbox" />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">财务编码</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							
							<input style="height: 30px;" name="coacode" readonly="readonly"  id="coacode${id_suffix}" value="" size="30" type="text" data-options="readonly:true" class="easyui-textbox" />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">部门性质</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
						
							<input style="height: 30px;" name="nature" id="nature${id_suffix}" value="" size="30" type="text" readonly="readonly" data-options="readonly:true" class="easyui-textbox" />
						</td>
					</tr>	
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">部门英文名称</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
						
							<input style="height: 30px;" name="nameeng" id="nameeng${id_suffix}" value="" size="30" type="text" data-options="" class="easyui-textbox" />
						</td>
					</tr>									
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">主管</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input style="height: 30px;" name="manager" id="manager${id_suffix}" value="" size="30" type="text" data-options="" class="ac_input" />
						</td>
					</tr>
					
					<tr class="firstRow ">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">秘书</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input style="height: 30px;" name="secretary" id="secretary${id_suffix}" value="" size="30" type="text" data-options="" class="ac_input"  onmouseover="this.title=this.value"/>
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">部门委托机要员</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input style="height: 30px;" name="consignor" id="consignor${id_suffix}" value="" size="30" type="text" data-options=""class="ac_input" onmouseover="this.title=this.value" />
						</td>
					</tr>
					<tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">部门计划员</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input style="height: 30px;" name="deptplanner" id="deptplanner${id_suffix}" value="" size="30" type="text" data-options=""  class="ac_input" />
						</td>
					</tr>
					<%-- <tr class="firstRow">
						<!-- firstRow -->
						<td width="15%" align="right" style="word-break: break-all;">部门审批人员</td>
						<td style="word-break: break-all; padding-left: 20px; height: 30px" width="85%">
							<input style="height: 30px;" name="approver" id="approver${id_suffix}" value="" size="30" type="text" data-options="" class=" ac_input" />
						</td>
					</tr> --%>
				</tbody>
			</table>
		</div>

		<br>
		<br>
		<br>
	</form>
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<style>
		#linkeyform${id_suffix} .textbox-readonly {
			border:none!important;
		}	
	</style>
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<script type="text/javascript">
		$(function(){
			$('#btnSave${id_suffix}').linkbutton({    
			    iconCls: 'fa fa-save',
			    onClick: function(){postSave${id_suffix}(false);}
			});
			$('#btnQuit${id_suffix}').linkbutton({    
			    iconCls: 'fa fa-save',
			    onClick:  function(){postSave${id_suffix}(true);}
			});
			if('${isEdit}'!='true'){
				 $('#btnSave${id_suffix}').linkbutton('disable');
     			 $('#btnQuit${id_suffix}').linkbutton('disable');
			}
			if('${level}'=='3'){
				$('#consignor${id_suffix}').parents('tr').addClass("hidden");
			}
			initForm${id_suffix}();
			
			initAuto${id_suffix}();
			$("T00000_dept_${id_suffix}").click(function(){
				$("#SUBFORM_T00000_dept_${id_suffix}").toggle();
				if($('#SUBFORM_T00000_dept_${id_suffix}').css('display')=='none'){			
					$("#T00000_dept_${id_suffix}").css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");		 
				}else{
					$("#T00000_dept_${id_suffix}").css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
				}
			});	
			
		});
		
		function initAuto${id_suffix}(){
			autoUserSingle($("#manager${id_suffix}"));
			autoUserMulti($("#secretary${id_suffix}"));
			autoUserMulti($("#consignor${id_suffix}"));
			autoUserSingle($("#deptplanner${id_suffix}"));
			autoUserSingle($("#approver${id_suffix}"));			
		}
		
		function initForm${id_suffix}(){
			$.post('/dept/getByCode/${code}',function(result){
				$('#linkeyform${id_suffix}').form('load', result.data);				
			});
		}
		
		function initTooltip(id,value){
			$('#'+id).tooltip({
			    position: 'bottom',
			    content: '<span style="color:#fff">'+value+'</span>',
			    onShow: function(){
					$(this).tooltip('tip').css({
						backgroundColor: '#666',
						borderColor: '#666'
					});
			    }
			});
		}
		
		function postSave${id_suffix}(isQuit){
			$("#mainUrl").tabs("loading","处理中...");
			
			$('#btnSave${id_suffix}').linkbutton('disable');
			$('#btnQuit${id_suffix}').linkbutton('disable');			
		
	    	$('#linkeyform${id_suffix}').form('submit', {
				url : '/dept/save',
				onSubmit : function(param) {					
					 //验证不通过按钮设置为可点击
					if	(!$(this).form('enableValidation').form('validate')){
						 $('#btnSave${id_suffix}').linkbutton('enable');
						 $('#btnQuit${id_suffix}').linkbutton('enable');
					}				 
				},
				success : function(data) {				
					//跳转查询页面										
					eval("var obj = " + data);				
					if(obj.success){
						if(isQuit){
							$("#btn_query${pid}").click();

							//$("#mainUrl").tabs("loaded");					
							$('#btnsubmit${id_suffix}').linkbutton('enable');
							$('#btnQuit${id_suffix}').linkbutton('enable');
							var tab = $('#mainUrl').tabs('getSelected');
							var index = $('#mainUrl').tabs('getTabIndex', tab);
							$("#mainUrl").tabs("close", index);
						}else{
							$("#mainUrl").tabs("loaded");
							$('#btnSave${id_suffix}').linkbutton('disable');
							$('#btnQuit${id_suffix}').linkbutton('enable');
							var tab = $('#mainUrl').tabs('getSelected');		
						    tab.panel('refresh', "/dept/edit/${level}/${code}?firstCode=${firstCode}&pid=${pid}");
						}						
						
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
	</script>
</body>
</html>