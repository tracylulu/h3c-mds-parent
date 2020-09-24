<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
</head>
<body>
<div class="userClass">
<div class="titleClass">角色管理</div>
	<table id="dg_role" class="easyui-datagrid" style="width:100%;">   
	    <thead>   
	        <tr>   
	            <!-- <th data-options="field:'hrlName',width:100">角色名称</th>   
	            <th data-options="field:'hrlCode',width:100">角色编码</th>   
	            <th data-options="field:'flag',width:100">状态</th>
	            <th data-options="field:'remark',width:100">描述</th> 
	         --></tr>   
	    </thead>   
	</table>
	
	<div id="roleWin" class="easyui-window" title="角色" style="width:600px;height:400px"
	    data-options="iconCls:'icon-save',modal:true,closed:true" >
		<form id="roleForm" method="post">   
		    <div>   
		        <label for="hrlName">角色名称</label>    
		        <input class="easyui-validatebox" type="text" name="hrlName" data-options="required:true" />   
		    </div>   
		    <div>   
		        <label for="Remark">角色描述</label>   
		        <input class="easyui-validatebox" type="text" name="remark" data-options="required:true"/>   
		    </div>
		    <div>   
		        <input class="easyui-validatebox" type="hidden" name="roleCode"/>   
		    </div>  
		</form>  

		<div style="padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitRoleForm()">提交</a>
	    	<!-- <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a> -->
	   	</div>
	</div>
	
	<div id="addRoleWin" class="easyui-window" title="新增角色" style="width:600px;height:400px"
	    data-options="iconCls:'icon-save',modal:true,closed:true" >
		<form id="addRoleForm" method="post">   
		    <div>   
		        <label for="hrlName">角色名称</label>   
		        <input class="easyui-validatebox" type="text" name="hrlName" data-options="required:true"/>   
		    </div>   
		    <div>   
		        <label for="Remark">角色描述</label>   
		        <input class="easyui-validatebox" type="text" name="remark" data-options="required:true"/>   
		    </div> 
		</form>  

		<div style="padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="addRole()">新增</a>
	    	<!-- <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a> -->
	   	</div>
	</div>
	<div id="resourceWin${timestamp}" class="easyui-window" title="分配资源" style="width:600px;height:400px"
	    data-options="iconCls:'icon-save',modal:true,closed:true" >
	    <div class="index-4" >
	    	<input id="roleCode${timestamp}" type="hidden" value=""/>
         	<ul id="tt${timestamp}" >
					
			</ul>
			<div style="margin:20px 0;text-align:center;">
		<a href="#" class="easyui-linkbutton" onclick="getChecked${timestamp}()">保存</a>
	</div>
    	</div>
	</div>
	<div id="winUser${timestamp}" title="人员信息"   style="display: none; min-width: 300px; min-height: 400px; width: 30%;">
		<div style="overflow-y: scroll; min-height: 280px; max-height: 450px;">
			<input type='hidden' id='roleCode${timestamp}' name='roleCode'>
			<table id="tbl_User${timestamp}" class="easyui-datagrid" data-options=""></table>
		</div>
	</div>
	<div id="winAddUser${timestamp}" title="设置人员角色信息"   style="display: none; man-width: 30%; min-height: 400px; width: 30%;">
		<div style="overflow-y: scroll; min-height: 200px; max-height: 240px;">
			<table width="100%"  id="tblAddUser${timestamp}">
				<tr>
					<td class="text-center"  style="width:20%">人员</td>
					<td class="text-left" style="width:75%"><input type='text' name='user'  style="width:60%;margin: 10px 0px!important;line-height: 30px;">
					<div class="fa fa-minus" onclick="removeRow${timestamp}(this)" id="removeRow${ timestamp}" style="margin-left:10px;">
					</div><div id="addRow${ timestamp}" onclick="addRow${timestamp}()" class="fa fa-plus" style="margin-left:10px;"></div> </td>
				</tr>
			</table>	
			
		</div>
		<div style="padding:5px 20px 0 0">
	    		<a href="javascript:void(0)"  class="easyui-linkbutton pull-right" style="padding-right:20px;" id="addUser${timestamp}" onclick="saveUser${timestamp}()">提交</a>	    	
	   		</div>
	</div>
	</div>
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<script type="text/javascript">
		function submitRoleForm(){
			$('#roleForm').form('submit',{
				url:"role/updateRole",
				dataType:'json',
				onSubmit : function(){
					return $(this).form('enableValidation').form('validate'); 
				},
				success:function(data){   
					var json = eval("(" + data + ")");
					alert(json.msg);
			           $("#roleWin").window("close");
			           $("#dg_role").datagrid("reload",{ });
			    } 
			});
		}
		function addRole(){
			$('#addRoleForm').form('submit',{
				url:"role/addRole",
				onSubmit : function(){
					return $(this).form('enableValidation').form('validate'); 
				},
				success:function(data){    
			           alert(data);
			           $("#addRoleWin").window("close");
			    } 
			});
		}
		$(function(){
			$("#dg_role").datagrid({
				columns:[[   
				          {field:'hrlName',title:'角色名称',width:100},   
				          {field:'hrlCreateUser',title:'创建人',width:100},
				          {field:'remark',title:'描述',width:100},
				          {field:'hrlId',title:'操作',formatter:function(value, row, index){
				        	  return "<a onclick='editRole(\"" + row.hrlCode + "\"" + "," + "\"" + row.hrlName +  "\")' href='#'" + ">编辑角色</a>" 
				        	  	+"		<a class='easyui-linkbutton' onclick='delRole(\"" + row.hrlCode + "\")' href='#'" + ">删除角色</a>" 
								+"      <a onclick='designResource${timestamp}(\""+row.hrlCode+"\")'  href='#'" + ">分配资源</a>"
								+"      <a onclick='showUser${timestamp}(\""+row.hrlCode+"\",\""+row.hrlName+"\")'  href='#'" + ">查看人员</a>";
								   
				        	  showUser
							},width:100}   
				      ]],
				toolbar:[{
                    id : 'collapse',    
                    text : '新增角色',
                    handler : function() {
                    	$('#addRoleForm').form('clear');
                    	$('#addRoleForm').form('reset');
                    	$("#addRoleWin").window("open");
                    	}
					}
				],
				url:"role/pageOfRole",
				fitColumns:true,
				height : window.innerHeight - window.innerHeight * 0.23,
				singleSelect:true, 
				pagination:true, 
				pageNumber:1, 
				pageSize:20,
	            pageList:[20,30,40,50,60],
	            rownumbers:true
			});
		});
		
		function editRole(roleId, roleName){
			if("管理员" == roleName){
				alert("不能修改管理员角色");
				return;
			}
			$("#roleWin").window("open");
			$('#roleForm').form('load','role/getRoleByRoleCode?roleCode='+roleId);
		}
		
		function delRole(roleId){
			$.ajax({
				type:"GET",
				//dataType:"json",
				url: 'role/delRole?roleCode='+roleId,
				success: function(data){
					alert(data)
					$("#dg_role").datagrid("reload")
				}
			}); 
			
			/*  $.get('role/delRole?roleCode='+roleId, function(result){
				    alert(result)
				  }); */
			
		}
		
		function designResource${timestamp}(roleCode){
			$("#roleCode${timestamp}").val(roleCode);
			$('#tt${timestamp}').tree({
			    url:"resource/getResourceTreeCheckBox?roleCode="+roleCode,
			    animate:true,
			    checkbox:true,
				cascadeCheck:false
			});
			
			/* $('#tt').prop("url","resource/getResourceTreeCheckBox?roleCode="+roleCode);
			alert($('#tt').prop("url"));
			$('#tt').tree('reload'); */
			$('#resourceWin${timestamp}').window('open');
		}
		
		function getChecked${timestamp}(){
			var roleCode = $("#roleCode${timestamp}").val();
			var nodes = $('#tt${timestamp}').tree('getChecked');
			var array = new Array();
			for(var i=0; i<nodes.length; i++){
				if('root' == nodes[i].code ) continue;
				array[i]={hrrrHrlCode:roleCode,hrrrHresCode:nodes[i].code};
				
			}
			
				
			$.ajax({
		        type: "POST",
		        url: "roleResourceRelation/distributionResourceForRole?roleCode="+roleCode,
		        contentType: "application/json; charset=utf-8",
		        data: JSON.stringify(array),
		        dataType: "json",
		        success: function (message) {
		            if (message.status == 200) {
		                alert("保存成功");
		                $('#resourceWin${timestamp}').window('close');
		            }else{
		            	 alert("保存失败");
		            }
		        },
		        error: function (message) {
		        	alert("保存失败");
		        }
		    });
		}
		
		function showUser${timestamp}(roleCode,roleName){
			$("#winUser${timestamp}").window({				
				iconCls:"icon-save",
			    modal:true  
			});
			$("#roleCode${timestamp}").val(roleCode);
			$("#tbl_User${timestamp}").datagrid({
				columns:[[   
				          {field:'name',title:'姓名',width:100},   
				          {field:'uda10512',title:'工号',width:100},				         
				          {field:'uda10511',title:'操作',formatter:function(value, row, index){
				        	  return "<a onclick=\"deleteUser${timestamp}('" + roleCode + "' , '" + row.uda10511 +"' )\" href='#' >移除</a>" ;
							},width:100}    
				      ]],
				toolbar:[{
                    id : 'collapse',    
                    text : '新增人员',
                    handler : function() {
                    	showAddUserWin${timestamp}(roleName);
                    }
				}], 
				queryParams:{roleCode:roleCode},
				url:"/user/pageOfUserByRole",
				fitColumns:true,
				//height : window.innerHeight - window.innerHeight * 0.23,
				singleSelect:true, 
				pagination:true, 
				pageNumber:1, 
				pageSize:10,
	            pageList:[10,15,20,30],
	            rownumbers:true
			});
		}
		
		function deleteUser${timestamp}(roleCode,domainCode){
			$.post('/role/delUserRole',{roleCode:roleCode,domainCode:domainCode},function(data){
				if(data.status=="200"){
					$("#tbl_User${timestamp}").datagrid('reload'); 
				}else{
					$.messager.alert("提示",data.message);
				}
			});
		}
		
		function showAddUserWin${timestamp}(roleName){
			$("#winAddUser${timestamp}").window({
				title:'设置角色【'+roleName+'】',
				iconCls:"icon-save",
			    modal:true  
			});
			var _tr=$("#tblAddUser${timestamp} tr:last").clone();				
			$("#tblAddUser${timestamp} tr").remove();
			$("#tblAddUser${timestamp}").append(_tr);	
			$("#tblAddUser${timestamp} tr:last").find("input").val('');
			autoComplete${id_suffix}($("#tblAddUser${timestamp} tr:last").find("input"));
			
			/* 
			$("#tblAddUser${timestamp}").find("input").off('autocomplete');
			autoComplete${id_suffix}($("#tblAddUser${timestamp}").find("input")); */
		}
		
		function addRow${timestamp}(){
			var _tr=$("#tblAddUser${timestamp} tr:last").clone();				
			$("#tblAddUser${timestamp}").append(_tr);
			$("#tblAddUser${timestamp} tr:last").find("input").val('');
			autoComplete${id_suffix}($("#tblAddUser${timestamp} tr:last").find("input"));
		}
		
		function removeRow${timestamp}(obj){
			if($("#tblAddUser${timestamp} tr").length>1){
				$(obj).parents("tr").remove();
			}	
		}
		
		function saveUser${timestamp}(){
			var roleCode=$("#roleCode${timestamp}").val();
			
			var users="";
			$("#tblAddUser${timestamp}").find("input").each(function(i){
				var user=$(this).val();
				$.each(user.split(','),function(i,item){
					if(item!=null&&item!=undefined&&item!=''&&users.indexOf(item)==-1){
						if(users==""){
							users=item;
						}else{
							users+=','+item;
						}
					}
				});								
			});
			
			$.post('/role/addUserRole',{roleCode:roleCode,users:users},function(data){
				if(data.status=="200"){
					//$.messager.alert("提示","ok");
					$("#winAddUser${timestamp}").window("close");
				}else{
					$.messager.alert("提示",data.message);
				}
			});
		}
		
		function autoComplete${id_suffix}(obj){
			$(obj).off('autocomplete').autocomplete("/product/userlink/list?userCode=liucaixuan", {
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
		    });
		}
	</script>
</body>
</html>