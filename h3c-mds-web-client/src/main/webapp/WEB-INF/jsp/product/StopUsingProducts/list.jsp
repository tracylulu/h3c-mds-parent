<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!--jsp页面必须引入jstl标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>已失效项目列表</title>
</head>
<body>
	<div id="index${id_suffix }">
		<div class="index-4">
			<span>类型:</span>
			&nbsp;
			<select id="type${id_suffix}" name="type" class="easyui-combobox" style="width: 120px">
				<option value="">请选择</option>
				<option value="PLIPMT">IPMT</option>
				<option value="PRODUCTLINE">产品线</option>
				<option value="PDT">PDT</option>
				<option value="PRODUCT">研发产品</option>
				<option value="Version">产品V级</option>
				<option value="RELEASE">产品R级</option>
				<option value="BVERSION">产品B级</option>
				<option value="PROJECT">研发项目</option>
				<option value="BASELINE">基线版本</option>
				<option value="FEATURE">特性</option>
				<option value="SUBFEATURE">子特性</option>
				<option value="TEAM">项目组</option>
				<option value="SUBSYSTEM">子系统</option>
				<option value="MODULE">模块</option>
				<option value="MODULEVERSION">模块版本</option>
			</select>
			&nbsp; &nbsp;
			<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%;" />
			&nbsp;
			<a href="javascript:void(0)" class="easyui-linkbutton default" style="background-color: #3498DB"  id="btn_query${id_suffix}" onclick="doSearch${id_suffix}();">搜 索 </a>
			&nbsp;

			<div id="cc${id_suffix }" class="easyui-layout" style="width: 100%; height: auto;">
				<!--左布局  center-->
				<!--***title需要更改 ***-->
				<div data-options="region:'center',title:'${title}'" style="width: 100%; height: 100%;">
					<!--左侧树形表格-->
					<div class="index-1">
						<table class="easyui-datagrid" id="tbl_grid${id_suffix}">
						</table>
					</div>
				</div>

				<div data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true" style="width: 20%;" id="east">
					<!--propertygrid动态属性-->
					<table id="pg${id_suffix }">
					</table>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
	$(function(){
		//设定布局高度
		$("#cc${id_suffix }").layout({
			height : window.innerHeight - window.innerHeight * 0.231
		});
		
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
		
		InitStopUsingproductsGrid();
	});
		
		function InitStopUsingproductsGrid(){
			$('#tbl_grid${id_suffix}').datagrid({
				/* title:"已停用", */
				url: "product/StopUsingProducts/listdata",		        
		        pagination: true,//允许分页
		        rownumbers: true,//行号
		        singleSelect: true,//只选择一行
		        pageSize: 15,//每一页数据数量
		        checkOnSelect: false,
		        fitColumns:true, //列宽自适应
		        width:'100%',
		        height : window.innerHeight - window.innerHeight * 0.28,
		        pageList: [15,20,30,40,50,60],
		        columns: [[
		        	{field:'id',hidden:true},
		        	{field: 'code', hidden:true},
		        	{field: "type",title: "类型",align: "center",width:100}, 
		        	{field: "name",title: "中文名",align: "center",width:100}, 
		        	{field: "engname",title: "英文名",align: "center",width:100}		        	
		        ]],
				onClickRow : function(index,rowData) { //单击事件					
					//获取布局右侧面板的宽度					
					var p = $("#cc${id_suffix }").layout("panel", "east")[0].clientWidth
					
					//如果宽度为0,展开面板	
					if (p == 0) {						
						$("#cc${id_suffix }").layout("expand", "east")
					}
				
					var type=rowData.code==undefined||rowData.code==""?"pi":rowData.code.substring(0,2).toLowerCase();
					
					//加载属性表格
					$('#pg${id_suffix }').propertygrid({
						url : 'product/prop/'+type+'data?code='
								+ rowData.code+'&id='+rowData.id,/*<!--***url需要更改 ***--> */
						showGroup : true,
						scrollbarSize : 0,
						height : window.innerHeight
								- window.innerHeight
								* 0.28,
						width : '100%',
						columns :  [[
				            {field:'name',title:'属性名',width:100,sortable:false,formatter:formatProgress${id_suffix}},
				            {field:'value',title:'属性值',width:100,resizable:false,formatter:formatProgress${id_suffix}}
				        ]]
					});
				},
				onDblClickRow : function(index,rowData) {					
					var type=rowData.code==undefined||rowData.code==""?"pi":rowData.code.substring(0,2).toLowerCase();
					var href_url="";
					if('${isAdmin}'=='true'){
						href_url='product/pages/'+type+'edit/'+rowData.code+'/'+rowData.id+'/${id_suffix}/true/1';
					}else{
						href_url='product/pages/'+type+'edit/'+rowData.code+'/'+rowData.id+'/${id_suffix}/false/1';
					}
					 $('#mainUrl').tabs('add',
							{
								title : "修改"+rowData.type,
								href : href_url,
								closable : true
							}); 
					}
					
				
			});
		}
		
		function doSearch${id_suffix}(){
			//获取布局右侧面板的宽度
			var p = $("#cc${id_suffix }").layout("panel", "east")[0].clientWidth
				
			if (p != 0) {
				$('#pg${id_suffix }').propertygrid('loadData', {
					rows : []
				});
				$("#cc${id_suffix }").layout("collapse", "east")
			}
			$('#tbl_grid${id_suffix}').datagrid('load',{
				proType: $("#type${id_suffix}").val(),
				searchStr: $("#searchStr${id_suffix}").val()
			});
		}
		
		//格式化以及自动换行
		function formatProgress${id_suffix}(value,rowData,rowIndex) {
			//writeObj(rowData)
			if (value == "underfined" || value == null) {
				return "";
			} else {
				
				if(rowData)
				{
					if(rowData.ColumnCode == 'status') {
						if(rowData.value == 1)
						{
							rowData.value= "有效";
						} 
						if(rowData.value == 0){
							rowData.value="失效";
						}
						
					}
					
					if(rowData.ColumnCode=='ifofficialnaming'){
						
						if(rowData.value == 1)
						{
							rowData.value="是";
						}
						if(rowData.value == 0){
							rowData.value="否";
						}
					}
					
					if(rowData.ColumnCode=='projectstatus'){
						
						if(rowData.value == 1)
						{
							rowData.value="在研";
						}
						else if(rowData.value == 2){
							rowData.value="终止";
						}
						else if(rowData.value == 3){
							rowData.value="挂起";
						}
					} 
					
					if(rowData.projectstatus == 1)
					{
						rowData.projectstatus="在研";
					}
					else if(rowData.projectstatus == 2){
						rowData.projectstatus="终止";
					}
					else if(rowData.projectstatus == 3){
						rowData.projectstatus="挂起";
					}
					
					if(rowData.ifofficialnaming == 1)
					{
						rowData.ifofficialnaming="是";
					}
					if(rowData.ifofficialnaming == 0)
					{
						rowData.ifofficialnaming="否";
					}
					
					/* if(rowData.producttype!='undefined'&&rowData.producttype!="undefined"&&rowData.producttype!=undefined){
						
						 $.ajax({
				    	        type : "POST",
				    	        url : "product/data/dicvalue?type=4&value="+rowData.producttype,
				    	        //dataType : 'json',
				    	        async: true,
				    	        success : function(result) {
				    	        	rowData.producttype=result;
				    	        	alert(rowData.producttype);
				    	        },
				    	        error : function(result) {
				    	        	rowData.producttype=result;
				    	        }
				    	    });
					} */
					
				
					 
				}
				return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
						+ value + '</div>';
			}
		}
	</script>
</body>
</html>