<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--jsp页面必须引入jstl标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基础信息配置</title>
</head>
<body>
	<div id="index${id_suffix }">
		<!--布局-->
		<div class="index-4">
			<!--搜索框-->
			<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%;" />
			&nbsp;
			<a href="javascript:void(0)" class="easyui-linkbutton default" id="btn_query${id_suffix}" onclick="doSearch${id_suffix}();">搜 索 </a>
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

			</div>
		</div>
	</div>
	<script type="text/javascript">

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
				/* {
					id : 'add${id_suffix }',
					text : '创建${title}',
					iconCls : 'tabs-icon fa fa-plus-square',
					handler : function() {
						if ($('#mainUrl').tabs('exists', "新增基础信息")) {
		           	       $('#mainUrl').tabs('select', "新增基础信息");
		           	     } else {		           	    	 
		           	       $('#mainUrl').tabs('add', {
		           	         	title : "新增基础信息",
		           	         	href : '/flowable/processConfig/add',
		           	         	closable : true
		           	       });
		           	     }
					}
				},"-", */
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
					
						//重新加载
						$("#tg${id_suffix }").treegrid("reload");
					}
				} ],
				collapsible : false,
				url : 'flowable/processConfig/listData',  /*<!--***url需要更改 ***--> */
				method : 'post',
				idField : 'code',/* <!--***idField需要更改 ***--> */
				treeField : 'content',/* <!--***treeField需要更改 ***--> */
				striped:true, 
				height : window.innerHeight	- window.innerHeight * 0.28,
				fitColumns : true,
				columns:[[ 
							/* {title:'id',field:'id',hidden:true,width:180},   */
					 		{title:'编码',field:'code',hidden:true,width:180},  
					 		{title:'编码',field:'configCode',hidden:true,width:180},  					 		
					        {title:'信息类型',field:'content',width:180,formatter:function(value,row,index)
					        	{
					        		if(value==undefined||value==null||value==''){
					        			return "";
					        		}else{
					        			return value;
					        		}
					        		
					        	}},    
					        {title:'内容（PDT）',field:'note',width:60,},    
					        {title:'财务接口人',field:'fprodPerson',width:80}
				]]  , 
				onBeforeExpand : function(row) {//异步架加载树
					var url = "flowable/processConfig/listData";
					$("#tg${id_suffix }").treegrid("options").url = url;
					return true;
				},
				onDblClickRow : function(rowData) {debugger
					if(rowData!=null&& rowData.configCode!=null&&rowData.configCode!=undefined){
					
						 $('#mainUrl').tabs('add',{
									title : "修改基础信息",
									href : 'flowable/processConfig/edit/'+rowData.configCode,
									closable : true
								}); 
						}
					}					
				
			});
			

		});
		
		function doSearch${id_suffix}(){			
			$("#tg${id_suffix }").treegrid('load',{				
				searchParas: $("#searchStr${id_suffix}").val()
			});
		}
		
		
	</script>
</body>
</html>
