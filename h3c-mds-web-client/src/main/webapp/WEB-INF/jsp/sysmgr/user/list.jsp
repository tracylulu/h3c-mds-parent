<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户</title>
<!--jsp页面必须引入jstl标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div class="userClass">
<div class="titleClass">用户管理</div>
<div class="searchClass" >
	<input onkeydown="inpKeyDown();" id="searchParas" class="easyui-textbox" prompt="请输入搜索内容"  style="width: 400px; height: 30px; line-height: 30px;margin-left:10px"   />
	<a href="javascript:void(0)" class="easyui-linkbutton default" onclick="doSearch();">搜 索 </a>
	</div>
	<table id="dg" style="width: 100%;">   
	    <thead>   
	        <tr>   
	            <!-- <th data-options="field:'name',width:100">姓名</th>   
	            <th data-options="field:'code',width:100">工号</th>   
	            <th data-options="field:'email',width:100,align:'right'">操作</th> -->
	        </tr>   
	    </thead>   
	</table>
	
	<div id="winRole" title="分配角色" style="hidden:hidden; width:800px;height:600px" >
	<form id="saveUserRole" method="get">
			<input type="hidden" name="userCode" id="userCode1"/>
			<input type="hidden" name="roles" id="roles1"/>
			<a href="#" class="easyui-linkbutton" onclick="submitForm()" style="width:80px">保存</a>
		     <table id="userRole" style="hidden:true">   
			    <thead>   
			        <tr>   
			            <!-- <th data-options="field:'name',width:100">姓名</th>   
			            <th data-options="field:'code',width:100">工号</th>   
			            <th data-options="field:'email',width:100,align:'right'">操作</th> -->
			        </tr>   
			    </thead>   
	</table>
	</form>
	</div>
	</div>
	<script type="text/javascript">
		var roles = "";
		var selectUserCode = "";
		$(function(){
			$("#winRole").hide();
			$("#dg").datagrid({
				columns:[[   
				          {field:'name',title:'姓名',width:100},   
				          {field:'uda10511',title:'工号',width:100},   
				          {field:'name1',title:'操作',formatter:function(value, row, index){
								return "<a onclick='designRole(this)'" +"code='" + row.uda10511 + "' href='#'" + ">分配角色</a>";
							},width:100}   
				      ]],
				url:"user/userList",
				height : window.innerHeight - window.innerHeight * 0.23,
				fitColumns:true,
				singleSelect:true, 
				pagination:true, 
				pageNumber:1, 
				pageSize:20,
	            pageList:[20,30,50],
	            rownumbers:true
			});
			
		});
				
		function designRole(row){
			var a = $(row);
			var code = a.attr("code");
			$('#winRole').window({    
			    //width:600,   
			    //height:400,
			    iconCls:"icon-save",
			    modal:true   
			});
			
			//展现权限相关的
			$("#userRole").datagrid({
				columns:[[   
						  {field:'hrlCode',title:'', checkbox:true},
				          {field:'hrlName',title:'角色名称',width:100}
				          /* {field:'hrlName',title:'用户名称',width:100}, */
				           /* {field:'hrlCode',title:'用户工号',width:100,hidden:true} */ 
				      ]],
				url:"role/getAllRoleByUserCode?code="+ code,
				onLoadSuccess: function(data){
					if(data.rows.length > 0){
						for (var i = 0; i < data.rows.length; i++) {
		                    //$("input[type='checkbox']")[i + 1].checked = data.rows[i].checkbox;
							 /* <c:forEach items="${roles}" var="role">
								alert("${role.hrlName}");
								if("${role.hrlCode}" == data.rows[i].hrlCode){
									$("input[type='checkbox']")[i + 1].checked = true;
									//$("#userRole").datagrid("checkRow",data.rows[i].hrlCode);
									//alert("${role.hrlCode}")
								}
							</c:forEach> */
							/* if(data.selfRoles.length > 0){
								for(var j = 0; j < data.selfRoles.length; j++){
									if(data.selfRoles[j].hrlCode == data.rows[i].hrlCode){
										//$("input[type='checkbox']")[i + 1].checked = true;
										$("#userRole").datagrid("checkRow",data.rows[i].hrlCode);
										//alert("${role.hrlCode}")
									}
								}
							} */
						}
					}
					selectUserCode = code;
				},
				
				/* onSelect: function(index, row){
					//debugger;
					roles += row.hrlCode + ",";
				}, */
				fitColumns:true,
			});
		}		
		function submitForm(){
			/* var roles = $("#userRole").datagrid("getSelections");//getChecked  getSelections
			var roles_str = "";
			for( var i=0;i<roles.length;i++) {
				roles_str += roles[i].hrlCode+",";
			} */
			var roles = $("#saveUserRole input:checked");
			var roles_str = "";
			for( var i=0;i<roles.length;i++) {
				roles_str += $(roles[i]).val()+",";
			}
			var param = [{
				"userCode":selectUserCode,
				"roles":roles_str
				
			}];
			$("#userCode1").val(selectUserCode);
			$("#roles1").val(roles_str);
			
			 $('#saveUserRole').form("submit",{ 
				method:"post",
			    url:"/role/saveOrUpdateUserRole",
			    queryParams:param,
			    onSubmit: function(){  
			    	//一般做校验
			           return true;
			    },    
			    success:function(data){
			    	alert(data)
			        $('#winRole').window('close');
			    }    
			});
			 /* $.ajax({
				url:"role/saveOrUpdateUserRole?userCode=" + selectUserCode + "&roles=" + roles_str,
				method:"GET",
				dataType:"json",
				success: function(data){
					alert(data)
				}
			}); 	 */
			
			
		} 
		//查询事件
		  function doSearch(){
			  $("#dg").datagrid("load",{
				  name:$("#searchParas").val(),
				  code:$("#searchParas").val()
			  });
		  }
		
		//搜索回车事件
		   function inpKeyDown(){
		  	var event = arguments.callee.caller.arguments[0] || window.event;// 消除浏览器差异
		  	$(document).keydown(function(event) {alert(222)
		  		if (event.keyCode == 13) {
		    		  doSearch();		//回车搜索
		  		}
		  	}); 
		  }
	</script>
</body>
</html>