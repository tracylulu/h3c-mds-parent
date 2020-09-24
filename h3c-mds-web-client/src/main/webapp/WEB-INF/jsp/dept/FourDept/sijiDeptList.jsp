<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>四级部门信息</title>
</head>
<body>
	<div id="index${id_suffix }" style="margin: 0px 20px;">
		<!--布局-->
		<div class="index-4" style=" height: 28px; margin: 10px 0px;">
			<div class="pull-left" style="width:15%"><h3>四级部门信息</h3></div>
			<div style="text-align: right;">
				<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 400px;" />
				&nbsp;
				<a href="javascript:void(0)" class="easyui-linkbutton default" id="btn_query${id_suffix}" onclick="doSearch${id_suffix}();"
					style="margin-right: 2%; color: white; background-color: #3498DB;">搜 索 </a>
				&nbsp;
			</div>
			
		</div>
		<!--左右布局 easyui-layout-->
		<div id="cc${id_suffix }" class="easyui-layout" style="width: 100%; height: 'auto';">
			<!--左布局  center-->
			<!--***title需要更改 ***-->
			<div data-options="region:'center',title:'${title}'" style="width: 100%; height: 100%;">
					<!--左侧树形表格-->
				<div class="index-1" style="margin: 10px 0px;">
					<table id="tg${id_suffix }" style="width: 100%; heght: 100%;">
					</table>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	
	$(function() {		
		
		//判断导入的权限
		$.ajax({
            url:'/dept/judgeImport4',
            type:"get",
            dataType:"text",
            success:function(data){
            	//alert(data);
                 if(data=='haveImportPermiss4'){
                	 //alert("可编辑");
                  }else{
                	//alert("不可编辑");
                		 //$('#export3${id_suffix }').linkbutton('disable');
                	  	//$('div.datagrid-toolbar a').eq(4).hide();
                	  	$('#import${id_suffix }').hide();//button隐藏
                 } 
            },
            error :function(data){
            	
            }
        });
		
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
		initGrid${id_suffix }();	
	});
	
	function initGrid${id_suffix }(){
		$("#tg${id_suffix }").treegrid({
			iconCls : 'icon-ok',
			toolbar : [
		    {
                id : 'add',
                text : '全部折叠',
                iconCls : 'tabs-icon fa fa-minus-square',
                handler : function() {
                    $("#tg${id_suffix }").treegrid("collapseAll");
                }
            },"-",	
			{
				id : 'reload${id_suffix }',
				text : '刷新',
				iconCls : 'tabs-icon fa fa-refresh',
				handler : function() {
					var url = '/dept/list4TreeData/${level}';
					//alert(url);
					$("#tg${id_suffix }").treegrid("options").url = url;	
					//重新加载
					$("#tg${id_suffix }").treegrid("reload");
					
				 }
			},"-",
			{
                id : 'log${id_suffix }',
                text : '查看日志信息',
                iconCls : 'tabs-icon fa fa-envelope',
                handler : function() {
                  if ($('#mainUrl').tabs('exists', "查看部门日志")) {
                         $('#mainUrl').tabs('select', "查看部门日志");
                  } else {
                     var code="";
                      var row=$("#tg${id_suffix }").treegrid("getSelected");
                      if(row){
                        code=row.firstcode; 
                        var level=$("#tg${id_suffix }").treegrid("getLevel",row.firstcode);
                        if(level=='${level}')
                        $('#mainUrl').tabs('add', {
                              title : "查看部门日志",
                              href : 'dept/log/list?code='+code,
                              closable : true
                         });
                      }                                   
                  } 
                }
            },"-",
            {
			 	id : 'export${id_suffix }',
                text : '导出',
                iconCls : 'tabs-icon fa fa-download',
                handler : function() {
                	var search= $("#searchStr${id_suffix}").val();
                	window.location.href="/dept/export?level=${level}&searchStr="+encodeURIComponent(search);                	              
                }
            }
            ,"-",
            {
                id : 'import${id_suffix }',
                text : '导入',
                iconCls : 'tabs-icon fa fa-upload',
                handler : function() {
                	layoutFileWin${id_suffix}();   
                }
            }
			],
			collapsible : false,
			url : '/dept/list4TreeData/${level}', 
			method : 'post',
			idField : 'firstcode',
			treeField : 'firstname',
			striped:true, 
			height : window.innerHeight	- window.innerHeight * 0.28,
			fitColumns : true,
			/* queryParams : {					
				type : '${page}'
			}, */
			columns:[[
				{title:'level',field:'level',hidden:true},
				{title:'SAP编码',field:'firstcode',width:80}, 					 		
				{title:'部门中文名称',field:'firstname',width:120}, 
				{title:'部门英文名称',field:'nameeng',width:80},
				{title:'财务编码',field:'coacode',width:80}, 
				{title:'部门简称',field:'abbreviation',width:80,hidden:true},
				{title:'部门性质',field:'nature',width:80,hidden:true},
				{title:'部门主管姓名',field:'managername',width:80},
				{title:'主管ID',field:'manager',width:80},
				{title:'秘书姓名',field:'secretaryname',width:80,hidden:true},
				{title:'秘书ID',field:'secretary',width:80,hidden:true},
				{title:'部门计划员',field:'deptplanner',width:80},
				{title:'部门审批人员',field:'approver',width:80 ,hidden:true}
			]]  , 
			onBeforeExpand : function(row) {//异步架加载树
				
				var level=$("#tg${id_suffix }").treegrid("getLevel",row.firstcode);
				//alert(level);
				var url = '/dept/list4TreeData/${level}?currentlevel='+level;
				$("#tg${id_suffix }").treegrid("options").url = url;
				
				//var url = '/dept/list4TreeData/${level}/'+row.uda9502;
				//$("#tg${id_suffix }").treegrid("options").url = url;
				return true;
			},
			onDblClickRow : function(row){
				//alert("111111");
            	var title = "四级部门修改";
            	var level=$("#tg${id_suffix }").treegrid("getLevel",row.firstcode);
            	//alert(level);
            	if(level==4){
            	//$.ajax({
            		//url:'/finance/fprojectCode/checkAuto',
                    //type:"get",
                    //dataType:"json",
                   // success:function(data){
                      	 $('#mainUrl').tabs(
               	                'add',
               	                {
               	                    title : title,
               	                   href : '/dept/toAddSiJiDept?code=' + row.firstcode+'&tid=${id_suffix}',
               	                    closable : true
               	                });
                   // },
                   // error :function(data){
                   // 	
                   // }
                //});
            	}
            }
		});
	}			

	function doSearch${id_suffix}(){
		var url = '/dept/list4TreeData/${level}';
		$("#tg${id_suffix }").treegrid("options").url = url;		
		$("#tg${id_suffix }").treegrid('load',{
			levle: '${level}',
			searchStr: $("#searchStr${id_suffix}").val()
		});
	}
		
		
	</script>
	<jsp:include page="../SecondDept/importDept.jsp"/>
</body>
</html>