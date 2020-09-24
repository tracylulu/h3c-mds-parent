<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--jsp页面必须引入jstl标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>已失效多层</title>
</head>
<body>
	<div id="index${id_suffix }">
		<!--布局-->
		<div class="index-4">
			<span>类型:</span>
			&nbsp;
			<select id="type${id_suffix}" name="type${id_suffix}" class="easyui-combobox" style="width: 120px">
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
			<!--搜索框-->
			<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%;" />
			&nbsp;
			<a href="javascript:void(0)" class="easyui-linkbutton default" style="background-color: #3498DB"  id="btn_query${id_suffix}" onclick="doSearch${id_suffix}();">搜 索 </a>
			&nbsp;


			<!--左右布局 easyui-layout-->
			<div id="cc${id_suffix }" class="easyui-layout" style="width: 100%; height: 'auto';">
				<!--左布局  center-->
				<!--***title需要更改 ***-->
				<div data-options="region:'center',title:'${title}'" style="width: 100%; height: 100%;">

					<!--左侧树形表格-->
					<div class="index-1">
						<table id="tg${id_suffix }" style="width: 100%; heght: 100%;">
						</table>
					</div>
				</div>
				<!--右布局  east-->
				<div data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true" style="width: 20%;" id="east">
					<!--propertygrid动态属性-->
					<table id="pg${id_suffix }">
					</table>
				</div>

			</div>
		</div>
	</div>
	<script type="text/javascript">
	
		//格式化以及自动换行
		function formatProgress${id_suffix}(value,rowData,rowIndex) {
			//writeObj(rowData)
			if (value == "underfined" || value == null) {
				return "";
			} else {				
				if(rowData){
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
						if(rowData.value == 1){
							rowData.value="在研";
						}
						else if(rowData.value == 2){
							rowData.value="终止";
						}
						else if(rowData.value == 3){
							rowData.value="挂起";
						}
					} 
					
					if(rowData.projectstatus == 1){
						rowData.projectstatus="在研";
					}
					else if(rowData.projectstatus == 2){
						rowData.projectstatus="终止";
					}
					else if(rowData.projectstatus == 3){
						rowData.projectstatus="挂起";
					}
					
					if(rowData.ifofficialnaming == 1){
						rowData.ifofficialnaming="是";
					}
					if(rowData.ifofficialnaming == 0){
						rowData.ifofficialnaming="否";
					}
				}
				return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
						+ value + '</div>';
			}
		}

		$(function() {
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
			
			//加载树
			$("#tg${id_suffix }").treegrid({
				iconCls : 'icon-ok',
				toolbar : [ 
				{
					id : 'collapse${id_suffix }',
					text : '全部折叠',
					iconCls : 'tabs-icon fa fa-minus-square',
					handler : function() {
						//全部折叠
						$("#tg${id_suffix }").treegrid("collapseAll");
					}
				},"-", {
					id : 'reload${id_suffix }',
					text : '刷新',
					iconCls : 'tabs-icon fa fa-refresh',
					handler : function() {
						
						var p = $("#cc${id_suffix }").layout("panel", "east")[0].clientWidth
						if (p != 0) {
							$('#pg${id_suffix }').propertygrid('loadData', {
								rows : []
							});
							$("#cc${id_suffix }").layout("collapse", "east")
						}
						//重新加载
						$("#tg${id_suffix }").treegrid("reload");
					}
				} ],
				collapsible : false,
				url : 'product/StopUsingProducts/listTreedata',  /*<!--***url需要更改 ***--> */
				method : 'post',
				idField : 'prodlineno',/* <!--***idField需要更改 ***--> */
				treeField : 'prodline',/* <!--***treeField需要更改 ***--> */
				striped:true, 
				height : window.innerHeight	- window.innerHeight * 0.28,
				fitColumns : true,
				columns:[[    
							{field:'id',hidden:true,title:'id'},
					 		{title:'产品线编码',field:'prodlineno',hidden:true,width:180},  
					        {title:'产品线',field:'prodline',width:180,formatter:function(value,row,index)
					        	{
					        		if(value==undefined||value==''){
					        			return "";
					        		}else{
					        			return value;
					        		}
					        		
					        	}},    
					        {title:'产品',field:'product',width:60,align:'right'},    
					        {title:'产品R级',field:'release',width:80},    
					        {title:'类型',field:'type',width:80},
					        {title:'名称',field:'name',width:80}
				]]  , 
				onBeforeExpand : function(row) {//异步架加载树
					var url = "product/StopUsingProducts/listTreedata";
					$("#tg${id_suffix }").treegrid("options").url = url;
					return true;
				},
				onClickRow : function(rowData) { //单击事件
					//取消选中其他行
					$("#tg${id_suffix }").treegrid("unselectAll")
					//选中点击行
					$("#tg${id_suffix }").treegrid("select",
							rowData.prodlineno)
					//判断id是否为PR开头 根据内码获取右侧属性列表值并显示右侧属性列表
					if (rowData.code!=null&&rowData.code!=undefined) {
						//获取布局右侧面板的宽度
						var p = $("#cc${id_suffix }")
								.layout("panel", "east")[0].clientWidth
						//如果宽度为0,展开面板	
						if (p == 0) {
							$("#cc${id_suffix }").layout("expand", "east")
						}
						
						var type=rowData.code==undefined||rowData.code==""?"pi":rowData.code.substring(0,2).toLowerCase();
						//加载属性表格
						$('#pg${id_suffix }').propertygrid({
							url : 'product/prop/'+type+'data?code='
									+ rowData.code+'&id='+rowData.id,
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
					}
				},
				onDblClickRow : function(rowData) {
					if(rowData!=null&& rowData.type!=null&&rowData.type!=undefined){
						var type=rowData.code==undefined||rowData.code==""?"pi":rowData.code.substring(0,2).toLowerCase();
						if('${isAdmin}'=='true'){
							href_url='product/pages/'+type+'edit/'+rowData.code+'/'+rowData.id+'/${id_suffix}/true/1';
						}else{
							href_url='product/pages/'+type+'edit/'+rowData.code+'/'+rowData.id+'/${id_suffix}/false/1';
						}
						 $('#mainUrl').tabs(
								'add',
								{
									title : "修改"+rowData.type,
									href :href_url,
									closable : true
								}); 
						}
					}					
				
			});
			

		});
		
		function doSearch${id_suffix}(){
			//获取布局右侧面板的宽度
			var p = $("#cc${id_suffix }").layout("panel", "east")[0].clientWidth
				
			if (p != 0) {
				$('#pg${id_suffix }').propertygrid('loadData', {
					rows : []
				});
				$("#cc${id_suffix }").layout("collapse", "east")
			}
			$("#tg${id_suffix }").treegrid('load',{	
				proType: $("#type${id_suffix}").val(),
				searchStr: $("#searchStr${id_suffix}").val()
			});
		}
		
		
	</script>
</body>
</html>
