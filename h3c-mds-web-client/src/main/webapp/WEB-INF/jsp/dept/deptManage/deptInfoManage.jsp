<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门信息维护员管理</title>
</head>
<body>
<div class="userClass">
<div class="titleClass">部门信息维护员管理</div>
<div style="text-align: right;">
				<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 400px;" />
				&nbsp;
				<a href="javascript:void(0)" class="easyui-linkbutton default" id="btn_query${id_suffix}" onclick="doSearch${id_suffix}();"
					style="margin-right: 2%; color: white; background-color: #3498DB;">搜 索 </a>
				&nbsp;
			</div>
	<table id="dg_role" class="easyui-datagrid" style="width:100%;">   
	    <thead>   
	        <tr>   
	        </tr>   
	    </thead>   
	</table>
	
	
	
	<div id="addRoleWin" class="easyui-window" title="新增人员" style="width:600px;height:400px"
	    data-options="iconCls:'icon-save',modal:true,closed:true" >
		<form id="addRoleForm" method="post">   
		    
		    <table width="100%"  id="1111">
		    	<tr>
					<td class="text-center"  style="width:20%">所属一级部门:</td>
		            <td class="text-left">
		                <input class="easyui-combobox" id="comptypeid" style="width:60%;margin: 10px 0px!important;line-height: 30px;" editable="false">
		            </td>
		        </tr>
				<tr>
					<td class="text-center"  style="width:20%">人员</td>
					<td class="text-left" style="width:75%"><input type='text' id="auto${id_suffix}"; name='user'  style="width:60%;margin: 10px 0px!important;line-height: 30px;">
					 </td>
				</tr>
			</table>
		</form>  
		<div style="padding:5px 20px 0 0">
	    		<a href="javascript:void(0)"  class="easyui-linkbutton pull-right" style="padding-right:20px;" id="addUser${timestamp}" onclick="saveUser${timestamp}()">提交</a>	    	
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
					 </td>
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
		$(function(){
			initAuto${id_suffix}();
			
			//搜索框绑定回车事件
			$('#searchStr${id_suffix}').textbox({
				inputEvents : $.extend({}, $.fn.textbox.defaults.inputEvents, {
					keypress : function test() {
						if (event.keyCode == 13) {
							//doSearch(); //回车搜索
							$("#btn_query${id_suffix}").click()
						}
					}
				})			
			});
			
			
			
			$("#dg_role").datagrid({
				columns:[[   
						  {field:'SAPcode',title:'部门编码',width:100,hidden:true},
						  {field:'DeptName',title:'部门',width:100},
				          {field:'PersonName',title:'姓名',width:100},   
				          {field:'PersonCode',title:'工号',width:100},
				          {field:'id',title:'操作',formatter:function(value, row, index){
				        	  return "<a class='easyui-linkbutton' onclick='delUser(\""+row.PersonCode+"\",\""+row.SAPcode+"\")' href='#'" + ">移除</a>"; 
									
							},width:50}   
				      ]],
				toolbar:[{
                    id : 'collapse',    
                    text : '新增人员',
                    handler : function() {
                    	$('#addRoleForm').form('clear');
                    	$('#addRoleForm').form('reset');
                    	$("#addRoleWin").window("open");
                    	//addRole();
                    	
                    	//初始化下拉框的值
              			 $.ajax({
                                type:"GET",
                                url: 'dept/setdCombobox',
                                dataType:"json",
                                success:function(json){
                                console.log(json);
                                $("#comptypeid").combobox({//往下拉框塞值
                                        data:json,
                                        valueField:"deptCode",//value值
                                        textField:"deptName",//文本值
                                        //selected: 'selected',//(设置selected属性，默认第一个选中）
                                        panelHeight:"200",
                                        onLoadSuccess:function(){ //默认选中第一条数据       
                                      	  //debugger
                                      	  var data= $('#comptypeid').combobox("getData");   
                                        //alert(data[0].deptCode);
                                        if (data.length > 0) {                 
                                      	  $('#comptypeid').combobox('select', data[0].deptCode);                 
                                      	  }
                                        }
                                })
                                }
                        	});
                    	
                    	
                    	}
					}
				],
				url:"dept/listDeptInfo",
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
		
		function initAuto${id_suffix}(){
			//alert("1111");
			//autoComplete${id_suffix}($("#1111 tr:last").find("input"));
			//alert($("#auto${id_suffix}"));
			autoUserSingle($("#auto${id_suffix}"));	
		
		}
		
		function delUser(roleId,deptCode){
			//alert(roleId+deptCode);
			$.ajax({
				type:"GET",
				//dataType:"json",
				url: 'dept/delUser?personcode='+roleId+'&deptCode='+deptCode,
				success: function(data){
					alert(data);
					$("#dg_role").datagrid("reload");
				}
			}); 
			
		}
		
		function doSearch${id_suffix}(){
			//alert("1234");
			$("#dg_role").datagrid("load",{
				searchStr:$("#searchStr${id_suffix}").val()
			  });
		}
		
		function saveUser${timestamp}(){
			//var users=$("#1111").find("input").val();
			var comboboxValue=$('#comptypeid').combobox('getValue').toString(); //部门编码
			var comboboxData=$('#comptypeid').combobox('getText').toString(); //部门名称
			//alert(comboboxValue+"---"+comboboxData);
			
			var users=$("input#auto${id_suffix}").val(); 
			//alert(users);
			$.post('/dept/addUserRole',{users:users,comboboxValue:comboboxValue},function(data){
				//alert(data.message+"---"+data.);
				if(data=="info"){
					//获取P02已存在的部门对应的的中文名
					$.ajax({
						type:"GET",
						//dataType:"json",
						url: 'dept/getdeptName?users='+users,
						success: function(data1){
							$.messager.confirm('提示','该人员已经是'+data1+'的维护员角色，请问是否确认覆盖?',function(r){
					            if (r){
					                //alert("确认的值："+r);
					                $.ajax({
					    				type:"GET",
					    				//dataType:"json",
					    				url: 'dept/reCoverP02?users='+users+'&comboboxValue='+comboboxValue,
					    				success: function(data){
					    					alert(data);
					    					$("#addRoleWin").window("close");
					    					$("#dg_role").datagrid("reload");
					    				}
					    			}); 
					            }else {
					                //alert("取消的值："+r)
					            }
					        });
							
						}
					});
					
				}else{
					alert(data);
					$("#dg_role").datagrid("reload");
					$("#addRoleWin").window("close");
				}
				
				
				
			});
		}
		
		/* function autoComplete${id_suffix}(obj){
			alert("12345");
			$(obj).off('autocomplete').autocomplete("/product/userlink/list?userCode=liucaixuan", {
			//$(obj).autocomplete("/product/userlink/list?userCode=liucaixuan", {
				 multiple: false,
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
		} */
	</script>
</body>
</html>