<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>columnconfig</title>
</head>
<body>
<div class="userClass">
<div class="titleClass">表单配置</div>
<div class="searchClass" >
	<!--搜索框-->
			<span>类型:</span>&nbsp;
				<select id="type" name="type" class="easyui-combobox" style="width: 120px" >
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
				</select> &nbsp; &nbsp; 
				
				<input id="searchStr"
				class="easyui-textbox" type="text" prompt="请输入搜索内容"
				style="width: 400px;" /> &nbsp; <a href="javascript:void(0)"
				class="easyui-linkbutton default" onclick="doSearch1();">搜 索 </a>&nbsp;
				</div>
	
	<div style="width:100%;">
		<table id="tbl_grid" class="easyui-datagrid" style="width:100%;"></table>
	</div>
	<input id="singletan" value="" type="hidden"/>
	
</div>
	<script type="text/javascript">
		$(function(){
			InitGrid();
		});
		
		function InitGrid(){
			$("#tbl_grid").datagrid({
				title:"表单配置",
				url: "product/columnConfig/findByPage",		        
		        pagination: true,//允许分页
		        rownumbers: true,//行号
		        singleSelect: true,//只选择一行
		        pageSize: 15,//每一页数据数量
		        checkOnSelect: false,
		        fitColumns:true, //列宽自适应
		        height : window.innerHeight - window.innerHeight * 0.23,
		        pageList: [15,20,30,40,50,60],
		        toolbar : [
		        // 		{
                //     id : 'add',
                //     text : '添加',
                //     handler : function() {
                //        //alert("添加")
                //        //displayPage('add');
                //        if ($('#mainUrl').tabs('exists', "新增配置项")) {
	            // 	       $('#mainUrl').tabs('select', "新增配置项");
	            // 	     } else {
	            // 	       $('#mainUrl').tabs('add', {
	            // 	         title : "新增配置项",
	            // 	         href : 'product/columnConfig/add',
	            // 	         closable : true
	            // 	       });
	            // 	     }
                //     }
                // },'-',
					{
                    id : 'edit',    
                    text : '编辑',
                    handler : function() {
                    	var id = $("#singletan").val();
                    	if(id == ""){
                    		alert("请选择要编辑的数据!");
                    	}else{
                    		if ($('#mainUrl').tabs('exists', "编辑配置项"+id)) {
      	            	       $('#mainUrl').tabs('select', "编辑配置项"+id);
      	            	     } else {
      	            	       $('#mainUrl').tabs('add', {
      	            	         title : "编辑配置项"+id,
      	            	         href : 'product/columnConfig/add?id='+id,
      	            	         closable : true
      	            	       });
      	            	     }
                    	}
                    	
                    }
                }],
		        columns: [[
		        	{field: 'id', checkbox: false,hidden:true},
		        	{field: "columncode",title: "列名",align: "center",width:100}, 
		        	{field: "columnname",title: "列中文名",align: "center",width:100}, 
		        	{field: "columnorder",title: "配置列顺序",align: "center",width:100}, 
		        	{field: "columngroup", title: "分组", align: "center",width:100},
		        	{field: "grouporder",title: "分组排序",align: "center",width:100},
		        	{field: "queryorder",title: "查询排序",align: "center",width:100},
		        	{field: "type",title: "类型",align: "center",width:100},
		        	{field: "flag",title: "状态",align: "center",width:100},
		        	{field: "queryflag",title: "查询状态",align: "center",width:100},
		        	{field: "columnflag",title: "属性状态",align: "center",width:100},
		        	{field: "editstatus",title: "是否可编辑",align: "center",width:100},
		        	{field: "ipmtcheck",title: "是否需要IPMT秘书审核",align: "center",width:100},
		        	{field: "createuser",title: "创建人",align: "center",width:100},
		        	{field: "createdate",title: "创建时间",align: "center",width:100},
		        	{field: "modifyuser",title: "修改人",align: "center",width:100},
		        	{field: "modifydate",title: "修改时间",align: "center",width:100},
		        	{field: "remark",title: "备注",align: "center",width:100}
		        ]]
			});
		}
		
		function jsonDataFomat(val, row){
			if(val!=null){
				var str1 = val.indexOf("(")
	            var str2 = val.lastIndexOf(")");
	            var dateValue = val.substring(str1 + 1, str2);
	            var date = new Date(parseInt(dateValue));
	            return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + " " + date.getHours() + ":" + date.getMinutes();
			}
			return "";
		}
		
		$('#tbl_grid').datagrid({
			onSelect: function(rowIndex,rowData){
				$("#singletan").val(rowData.id);
			}
		});
		$('#searchStr${id_suffix }').textbox({
			inputEvents : $.extend({}, $.fn.textbox.defaults.inputEvents, {
				keypress : function test() {
					if (event.keyCode == 13) {
						//回车搜索
						doSearch1();
					}
				}
			})
		
		});
		
		function doSearch1(){
			$('#tbl_grid').datagrid('load',{
				type: $("#type").val(),
				searchStr: $("#searchStr").val()
			});
		}
	</script>
</body>
</html>