<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>一级部门信息</title>
</head>
		
<body>

	<div id="index${id_suffix }" style="margin: 0px 20px;">
		<div class="index-4" style=" height: 28px; margin: 10px 0px;">
			<div class="pull-left" style="width:15%"><h3>一级部门信息</h3></div>
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
			<!--左侧树形表格-->
			<div class="index-1" style="margin: 10px 0px;">
				<table id="dg${id_suffix }" style="width: 100%; heght: 100%;">
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript">

	$(function(){
		 initCombox${id_suffix}()
		
		
		
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
		
		
		$("#dg${id_suffix}").datagrid({    
			 //title:"一级部门信息列表",
    	    url:"/dept/listYiJiDept/${level}",
            striped:true, 
    	    toolbar : [ 
            {
                id : 'reload${id_suffix }',
                text : '刷新',
                iconCls : 'tabs-icon fa fa-refresh',
                handler : function() {
                    $("#dg${id_suffix}").datagrid("reload");
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
                      var row=$("#dg${id_suffix}").datagrid("getSelected");
                      //alert(row);
                      if(row){
                        code=row.firstcode; 
                        //alert(code);
                        //var level=$("#dg${id_suffix}").datagrid("getLevel",row.firstcode);
                        //alert(level);
                        //if(level=='${level}'){
                        $('#mainUrl').tabs('add', {
                              title : "查看部门日志",
                              href : 'dept/log/list?code='+code,
                              closable : true
                         });
                       // }
                      }                                   
                  } 
                }
            }
            ,"-",
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
                id : 'import1${id_suffix }',
                text : '导入',
                iconCls : 'tabs-icon fa fa-upload',
                handler : function() {
                	layoutFileWin${id_suffix}();   
                }
            }
            ,"-",
            {
            	id : 'coa${id_suffix }',
                text : 'COA电子流',
                iconCls : 'tabs-icon fa fa-search',
                handler : function() {
                	toCoaPage${id_suffix}();              	              
                }
            }
            ,"-",
            {
                id : 'export3${id_suffix }',
                text : '工作委托',
                iconCls : 'tabs-icon fa fa-envelope',
                handler : function() {
                	toWorkEntrustList${id_suffix}();
                }
            }
            ],
    	    columns:[[    
    	    	{title:'level',field:'level',hidden:true},
    	    	{title:'uda9502',field:'uda9502',hidden:true},
				{title:'SAP编码',field:'firstcode',width:80}, 					 		
				{title:'部门中文名称',field:'firstname',width:120}, 
				{title:'部门英文名称',field:'nameeng',width:80},
				{title:'财务编码',field:'coacode',width:80}, 
				{title:'部门简称',field:'abbreviation',width:80},
				{title:'部门性质',field:'nature',width:50,hidden:true},
				{title:'部门主管姓名',field:'managername',width:80},
				{title:'主管ID',field:'manager',width:80},
				{title:'秘书姓名',field:'secretaryname',width:110,hidden:true},
				{title:'秘书ID',field:'secretary',width:110,hidden:true},
				{title:'部门委托机要员',field:'consignor',width:110,hidden:true},
				{title:'部门计划员',field:'deptplanner',width:80},
				{title:'部门审批人员',field:'approver',width:80,hidden:true },
				{title:'计划处审批人员',field:'planapprover',width:80,hidden:true},
				{title:'PR录入员',field:'pr',width:80,hidden:true}
    	    ]],
    	    //height : window.innerHeight - window.innerHeight * 0.23,
			fitColumns:true,
			singleSelect:true, 
			pagination:false, 
			//pageNumber:1, 
			//pageSize:200,
            //pageList:[20,30,50],
            idField : 'firstcode',/* <!--***idField需要更改 ***--> */
			treeField : 'firstname',/* <!--***treeField需要更改 ***--> */
            //rownumbers:true,
            height : window.innerHeight	- window.innerHeight * 0.28,
            nowrap:false,
            onClickRow : function(index, row){
            	
            	//$("#dg${id_suffix}").datagrid("unselectAll");
            	//$("#dg${id_suffix}").datagrid("selectRow",index);
            	
            	
            },
            onDblClickRow : function(index, row){
            	var title = "一级部门修改";
            	$.ajax({
                    url:'/finance/fprojectCode/checkAuto',
                    type:"get",
                    dataType:"json",
                    success:function(data){
                     	 $('#mainUrl').tabs(
              	                'add',
              	                {
              	                    title : title,
              	                    href : '/dept/toAddYiJiDept?code=' + row.firstcode+'&tid=${id_suffix}',
              	                    closable : true
              	                });
                    },
                    error :function(data){
                    	
                    }
                });
            	
            }
    	});
		
	})

	
	function doSearch${id_suffix}(){
		$("#dg${id_suffix}").datagrid("load",{
			searchStr:$("#searchStr${id_suffix}").val()
		  });
	}
	
	
	/*
	*	查看COA链接
	*/	
	function toCoaPage${id_suffix}(){
		//alert("coa");
		$.ajax({
            url:'/dept/toCoaLinkPage',
            type:"get",
            dataType:"text",
            success:function(data){
            	//alert(data);
            	window.location.href=data;   
            },
            error :function(data){
            	
            }
        });
		
	}
	
	
	function initCombox${id_suffix}(){
		$.ajax({
            url:'/dept/judgeAddWorkPerson',
            type:"get",
            dataType:"text",
            success:function(data){
            	//alert(data);
                 if(data=='havePermiss'){
                	 //alert("可编辑");
                  }else{
                		 //$('#export3${id_suffix }').linkbutton('disable');
                	  	//$('div.datagrid-toolbar a').eq(5).hide();
                	  	$('#export3${id_suffix }').hide();//button隐藏
                 } 
            },
            error :function(data){
            	
            }
        });
		
		$.ajax({
            url:'/dept/judgeImport',
            type:"get",
            dataType:"text",
            success:function(data){
            	//alert(data);
                 if(data=='haveImportPermiss'){
                	 //alert("可编辑");
                  }else{
                		 //$('#export3${id_suffix }').linkbutton('disable');
                	  	//$('div.datagrid-toolbar a').eq(3).hide();
                	  	$('#import1${id_suffix }').hide();//button隐藏
                 } 
            },
            error :function(data){
            	
            }
        });
		
	}
	
	
	

	
	function formatPercent${id_suffix}(value,row,index){  
		if (value == "underfined" || value == null || value=='') {
			return "";
		}else{
			return value + "%";			
		}
	} 
</script>
<jsp:include page="../SecondDept/importDept.jsp"/>
<jsp:include page="workEntrust.jsp"/>
</body>
</html>
