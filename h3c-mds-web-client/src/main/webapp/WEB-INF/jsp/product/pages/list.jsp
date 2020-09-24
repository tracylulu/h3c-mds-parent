<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--jsp页面必须引入jstl标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String type = (String)request.getAttribute("type"); 
	Boolean isShowAdd=(Boolean)request.getAttribute("isShowAdd");
	Boolean isShowEdit=(Boolean)request.getAttribute("isShowEdit");
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品R版本</title>
</head>
<body>
	<div id="index${id_suffix }" style="margin:0px 20px;">
		<!--布局-->
		<div class="index-4">
			<!--搜索框-->
			<%-- <span>项目状态:</span>&nbsp;<input id="projectStatu${id_suffix }" name="projectStatu"
				class="easyui-combobox ui-text" type="text" value="请选择"
				style="width: 120px" /> &nbsp; &nbsp; <span>在研 </span><input
				type="checkbox" class="combobox-checkbox" checked="true"
				name="fruit" value="Apple" style="margin-top: 2px;">&nbsp; <span>终止
			</span><input type="checkbox" class="combobox-checkbox" name="fruit"
				value="Apple" style="margin-top: 2px;">&nbsp; <span>挂起
			</span><input type="checkbox" class="combobox-checkbox" name="fruit"
				value="Apple" style="margin-top: 2px;">&nbsp; &nbsp; &nbsp;
			<input id="searchParas${id_suffix }" class="easyui-textbox" type="text"
				prompt="请输入搜索内容" style="width: 65%;" /> &nbsp; <a
				href="javascript:void(0)" class="easyui-linkbutton default"
				onclick="doSearch();">搜 索 </a>&nbsp; --%>
			


			<!--左右布局 easyui-layout-->
			<div id="cc${id_suffix }" class="easyui-layout"
				style="width: 100%; height: 'auto';">
				<!--左布局  center-->
				<!--***title需要更改 ***-->
				<div data-options="region:'center'"
					style="width: 100%; height: 100%;">
					<div style="float:left;font-weight: bold;width:30%;font-size:18px;margin:10px 0px;">${title}</div>
				<div style="float:right;width:70%;text-align:right;height:28px;margin:10px 0px;">
				<c:choose>
				<c:when test="${type eq 'pr'}">
					<%@include file="../search/pr_search.jsp" %>
				</c:when>
				<c:otherwise>
					<%@include file="../search/search.jsp" %>
				</c:otherwise>
			</c:choose>
			</div>

					<!--左侧树形表格-->
					<div class="index-1" >
						<table id="tg${id_suffix }" style="width: 100%; heght: 100%;" class="tg">
							<thead>
								<tr class="firstRow" style="font-weight:bold;">
									<!--循环从配置表中动态获取树形表查询时需要显示的列-->
									<!--***colunmConfigList命名不一致时var、items需要更改***-->
									<c:forEach var="colunmConfigList" items="${colunmConfigList}">
										<!--***colunmConfigList命名不一致时 data-options需要更改***-->
										<th
											data-options="field:'${colunmConfigList.columncode}',width:130,formatter:formatProgress${id_suffix}">${colunmConfigList.columnname}</th>

									</c:forEach>

								</tr>
							</thead>
						</table>
						 <div id="winReleaseUser${id_suffix}" title="查看PDT下的R级人员信息" style="display:none; width:600px;height:600px;overflow:hidden;" >
   	<span>项目状态:</span>&nbsp;<input id="PDTprojectStatu${id_suffix }" 
				class="easyui-combobox ui-text" type="text" value=""
				style="width: 120px" /> &nbsp; &nbsp; 
				<a id="PDTbtn${id_suffix }" href="#" class="easyui-linkbutton default" style="margin-right:2%;color:white;background-color:#3498DB;" onclick="PDTbtn${id_suffix}();">搜 索 </a>&nbsp;
   	<form id="selPdtReleaseUser${id_suffix}" method="post"  style="height:100%;overflow-y:visible;">
		     <table id="pdtreleaseUser${id_suffix}" style="height:95%;overflow-y:visible;">   
	</table>
	</form>
	<br><br><br>
	</div>
	
	<%-- <div id="winLog${id_suffix}" title="查看日志信息" style="hidden:hidden; width:600px;height:600px" >
   	<form id="sellog${id_suffix}" method="post"  style="height:600px ">
      	<div style="">
		     <table id="log${id_suffix}"  style="width:600px;height:300px ">   
			</table>
			</div>
			<div style="width:100%">
			<div style="float:left;width:50%">
		     <table id="log1${id_suffix}">   
			</table>
			</div>
			<div  style="float:right;width:50%">
		     <table id="log2${id_suffix}">   
			</table>
			</div>
			</div>
	</form>
	</div> --%>
					</div>
				</div>
				<!--右布局  east-->
				<div
					data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true"
					style="width: 20%;" id="east">
					<!--propertygrid动态属性-->
					<table id="pg${id_suffix }">
					</table>
				</div>

			</div>
		</div>
		
	</div>
	<style>
	.l-btn-icon-left{
	margin-top:0px!important;
	}
	</style>
	<script type="text/javascript">
$(function(){
		var typeTmp="";
		//项目状态下拉框初始化
		$("#PDTprojectStatu${id_suffix }").combobox({
			valueField : 'statuValue',
			textField : 'statuText',
			panelHeight : 'auto',
			multiple:true,
			editable:false,
			formatter: function (row) {
				 var opts = $(this).combobox('options');
				 if(row.statuValue==""||row.statuValue=="undefined"||row.statuValue==null){
					 return "";
				 }
				 return '<input type="checkbox" class="combobox-checkbox"> ' + row[opts.textField]
			},  onSelect: function (row) {
				                    var opts = $(this).combobox('options');
				                    var el = opts.finder.getEl(this, row[opts.valueField]);
				                    el.find('input.combobox-checkbox')._propAttr('checked', true);
				                },
				                onUnselect: function (row) {
				                    var opts = $(this).combobox('options');
				                    var el = opts.finder.getEl(this, row[opts.valueField]);
				                    el.find('input.combobox-checkbox')._propAttr('checked', false);
				                }
		});
		
		var data = [];//创建数组
		//数组添加值
		
		
		data.push({
			"statuValue" : "在研",
			"statuText" : "在研"
		});
		data.push({
			"statuValue" : "终止",
			"statuText" : "终止"
		});
		
		data.push({
			"statuValue" : "挂起",
			"statuText" : "挂起"
		});
		data.push({
			"statuValue" : "无",
			"statuText" : "无状态"
		});
		
		$("#PDTprojectStatu${id_suffix }").combobox({
			data: data,
			onLoadSuccess:function(){
				$("#PDTprojectStatu${id_suffix }").combobox("select","在研");
			}});//下拉框加载数据
	
	});
	
	function writeObj(obj){ 
		 var description = ""; 
		 for(var i in obj){ 
		 var property=obj[i]; 
		 description+=i+" = "+property+"\n"; 
		 } 
		 alert(description); 
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
				return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;margin:2px;">'
						+ value + '</div>';
			}
		}
		var isExpandALl${id_suffix}=false;
		var exeandAll_ID${id_suffix}='';
		$(function() {
			//设定布局高度
			$("#cc${id_suffix }").layout({
				height : window.innerHeight - window.innerHeight * 0.231
			});
			
			
			
			//根据角色判断新建按钮是否显示
			if("${isShowAdd }"){
				$("#add${id_suffix }").attr("display","none");
			}
			
				//R版本树表格加载
				$("#tg${id_suffix }").treegrid({
					iconCls : 'icon-ok',
					toolbar : [ 
						<% if(!"pb".equals(type)&&isShowAdd==true) { %>
						{
						id : 'add${id_suffix }',
						text : '创建${title}',
						iconCls : 'tabs-icon fa fa-plus-square',
						handler : function() {
							if ($('#mainUrl').tabs('exists', "新增${title}")) {
		            	       $('#mainUrl').tabs('select', "新增${title}");
		            	     } else {
		            	    	 var code="";
		            	    	 var row=$("#tg${id_suffix }").treegrid("getSelected");
		            	    	 if(row){
		            	    		  
		            	    		 if('${type eq "pi" || type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true')
		     						{
		            	    		 code=row.plipmtno.indexOf('_')!=-1?row.plipmtno.split('_')[0]:row.plipmtno;
		            	    		 }else{
		            	    			 code=row.prodlineno.indexOf('_')!=-1?row.prodlineno.split('_')[0]:row.prodlineno;
		            	    		 }
		            	    	 }
		            	       $('#mainUrl').tabs('add', {
		            	         title : "新增${title}",
		            	         href : 'product/pages/${type}add?code='+code+"&tg=${id_suffix }",
		            	         closable : true
		            	       });
		            	     }
						}
					},"-",
					<%} %><%if("pt".equals(type)){%>
					{
						id : 'showR${id_suffix }',
						text : '查看R级人员信息',
						iconCls : 'tabs-icon fa fa-envelope',
						handler : function() {
							var rowData=$("#tg${id_suffix }").treegrid("getSelected");
							if(rowData!=null){
							    if(rowData.prodlineno.indexOf('PT')==-1){
							    	$.messager.alert('','请选择要查看的PDT！！！',"warning");
							    }else{
							    	$('#winReleaseUser${id_suffix}').window({  
							    	    iconCls:"icon-save",
							    	    modal:true,
							    	    shadow:true,
							    	    inline:true,
							    	    minimizable:false
							    	}); 
							    	$("#selPdtReleaseUser${id_suffix}").propertygrid({
									url : 'product/release/data?code='
											+ (rowData.prodlineno.indexOf('_')!=-1?rowData.prodlineno.split('_')[0]:rowData.prodlineno),/*<!--***url需要更改 ***--> */
									showGroup : true,
									scrollbarSize : 0,
									height : '100%',
									width : '100%',
									queryParams : {
										projectStatus : '在研'
									}, 
									columns :  [[
							            {field:'name',title:'属性名',width:100,sortable:false,formatter:formatProgress${id_suffix}},
							            {field:'value',title:'属性值',width:100,resizable:false,formatter:formatProgress${id_suffix}}
							        ]]
								    });
							    	
							    }  
							}else{
								$.messager.alert('','请选择要查看的PDT！！！',"warning");
							} 
						}
					},"-", 
					<%}%>
					{
						id : 'log${id_suffix }',
						text : '查看日志信息',
						iconCls : 'tabs-icon fa fa-envelope',
						handler : function() {
							var rowData=$("#tg${id_suffix }").treegrid("getSelected");
							if(rowData!=null){
							   
							    	if ($('#mainUrl').tabs('exists', "查看${title}日志")) {
					            	       $('#mainUrl').tabs('select', "查看${title}日志");
					            	} else {
					            	    	 var code="";
					            	    	 var row=$("#tg${id_suffix }").treegrid("getSelected");
					            	    	 if(row){
					            	    		  
					            	    		 if('${type eq "pi" || type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true')
					     						{
					            	    		 code=row.plipmtno.indexOf('_')!=-1?row.plipmtno.split('_')[0]:row.plipmtno;
					            	    		 }else{
					            	    			 code=row.prodlineno.indexOf('_')!=-1?row.prodlineno.split('_')[0]:row.prodlineno;
					            	    		 }
					            	    	 }
					            	    	if(code!=""&&code.indexOf('${type}')){
					            	       $('#mainUrl').tabs('add', {
					            	         title : "查看${title}日志",
					            	         href : 'product/log/list?code='+code,
					            	         closable : true
					            	       });
					            	    	}
					            	     
					            	}
							    }
							
						
						}
					}
					<%if(!"pi".equals(type)){%>
					,"-", 
					{
						id : 'collapse${id_suffix }',
						text : '全部折叠',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							//全部折叠
							$("#tg${id_suffix }").treegrid("collapseAll");
						}
					}<%}%>
					<%if( "pl".equals(type) || "pt".equals(type) || "pp".equals(type) || "pv".equals(type) ||
							"pj".equals(type) || "pr".equals(type) || "pb".equals(type)) {%>
					,"-", 
					{
						id : 'open${id_suffix }',
						text : '展开当前节点',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							typeTmp='${type}';
							var selectNode = $("#tg${id_suffix }").treegrid('getSelected');
							 if('${type eq "pi" || type eq "pl" || type eq "pp"  || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true'){
								 exeandAll_ID${id_suffix}=selectNode.plipmtno
								 $("#tg${id_suffix }").treegrid("expandAll",selectNode.plipmtno);
								
								 //$("#tg${id_suffix }").treegrid("expand",selectNode.plipmtno);	
							 }else{
								 exeandAll_ID${id_suffix}=selectNode.prodlineno
								 $("#tg${id_suffix }").treegrid("expandAll",selectNode.prodlineno);
								 //$("#tg${id_suffix }").treegrid("expand",selectNode.prodlineno);	
							 }
							//$("#tg${id_suffix }").treegrid("expand",selectNode.plipmtno);
							isExpandALl${id_suffix}=true;
							//expandThis${id_suffix}(selectNode.plipmtno);
						}
					} <%}%>
						,"-", {
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
							$("#tg${id_suffix }").treegrid("unselectAll");
							//重新加载
							$("#tg${id_suffix }").treegrid("reload");
						}
					}
						
						,"-", {
						id : 'export${id_suffix }',
						text : '导出',
						iconCls : 'tabs-icon fa fa-download',
						handler : function() {	
							var status="";
							var searchParas = $("#searchParas${id_suffix }").val();
							if($('#projectStatu${id_suffix }').length>0){
								status=$('#projectStatu${id_suffix }').combobox('getValues');
								status=status.join(',');
							}
							if('${type}'=="pi"||'${type}'=="pl"||'${type}'=="pt"||'${type}'=="pp"||'${type}'=="pv"||'${type}'=="pr"||'${type}'=="pb"||'${type}'=="pj"){
								window.location.href="/product/export?type=${type}&searchParas="+encodeURIComponent(searchParas)+"&projectStatus="+encodeURIComponent(status);
								
							}else{
								$.messager.alert('','导出的数据稍后会以邮件的形式发送给您！','info');
								$.get("/product/exportByMail?type=${type}&searchParas="+encodeURIComponent(searchParas)+"&projectStatus="+encodeURIComponent(status))
							}
							
						}
					} ],
					collapsible : false,
					url : 'product/data/${type}data',
					method : 'post',
					<% 
						if("pi".equals(type) || "pl".equals(type)  || "pp".equals(type) || "pv".equals(type) ||
								"pj".equals(type) || "pr".equals(type) ||"pb".equals(type) ) { %>
					idField : 'plipmtno',/* <!--***idField需要更改 ***--> */
					treeField : 'plipmt',/* <!--***treeField需要更改 ***--> */
					<%} else {%>
					idField : 'prodlineno',/* <!--***idField需要更改 ***--> */
					treeField : 'prodline',/* <!--***treeField需要更改 ***--> */
					<%}%>
					 striped:true, 
					height : window.innerHeight
							- window.innerHeight * 0.28,
							fitColumns : true,
					<%if("pr".equals(type)) {%>
					queryParams : {
						
						projectStatus : '在研'
					},
					<%}%>
					onBeforeExpand : function(row) {//异步架加载树
						
						//取消选中其他行
						$("#tg${id_suffix }").treegrid("unselectAll");
					
						//选中点击行
						<% 
						if("pi".equals(type) || "pl".equals(type)  || "pp".equals(type) || "pv".equals(type) ||
								"pj".equals(type) || "pr".equals(type) ||"pb".equals(type) ) { %>
						$("#tg${id_suffix }").treegrid("select",
								row.plipmtno);
						<%} else {%>
						$("#tg${id_suffix }").treegrid("select",
								row.prodlineno);
						<%}%>
						/*<!--***url需要更改 ***--> */
						var url ="";
						 url = "product/data/${type}data";
						$("#tg${id_suffix }").treegrid("options").url = url;
						return true;
					},
					onLoadSuccess : function(row,data) {
						 $('#tg${id_suffix }').treegrid('hideColumn', 'id');
						 var _rowID='';
						 if('${type eq "pi" || type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true'){
							 _rowID=row!=null?row.plipmtno:'';
						 }else{
							 _rowID=row!=null?row.prodlineno:'';
						 }
						 if(row!=null&&isExpandALl${id_suffix}){
							 if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
								 if(row!=null&&row.children!=null){
									 $.each(row.children,function(i,item){
										 ExpandedAndcheck${id_suffix}(item);
									 });	
								 }							 
							}else{								
								var root=getTreeRoots(_rowID,0);							
								if(root){
									 if(row!=null&&row.children!=null){
										 $.each(row.children,function(i,item){
											 ExpandedAndcheck${id_suffix}(item);
										 });	
									 }									
								 }
							}
						 }
					},	
					onExpand:function(row){	
						if('${type eq "pi" || type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true'){
							 _rowID=row.plipmtno;
						 }else{
							 _rowID=row.prodlineno;
						 }
						if(_rowID.substr(0,2)=='PI'&&_rowID!=exeandAll_ID${id_suffix}){
							 isExpandALl${id_suffix}=false;
							 exeandAll_ID${id_suffix}='';
						}else{
							var root=getTreeRoots(_rowID,0);							
							if(!root){
								 isExpandALl${id_suffix}=false;
								 exeandAll_ID${id_suffix}='';
							 }
						}
						
						/*  if(isExpandALl${id_suffix}&&row.children!=null){
							 $.each(row.children,function(i,item){
								 ExpandedAndcheck${id_suffix}(item);								 
							 });
						 } */
						 
					},
					onClickRow : function(rowData) { //单击事件
						//取消选中其他行
						$("#tg${id_suffix }").treegrid("unselectAll");
						 
						if('${type eq "pi" || type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true')
						{
							//选中点击行
							$("#tg${id_suffix }").treegrid("select",
									rowData.plipmtno)
							//判断id是否为PR开头 根据内码获取右侧属性列表值并显示右侧属性列表
							if ((rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("${type.toUpperCase()}") != -1||(rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf('SOHO')!=-1) {/*<!--***PR需要更改 ***--> */
								//获取布局右侧面板的宽度
								var p = $("#cc${id_suffix }")
										.layout("panel", "east")[0].clientWidth
								//如果宽度为0,展开面板	
								if (p == 0) {
									$("#cc${id_suffix }").layout("expand", "east")
								}
								//加载属性表格
								$('#pg${id_suffix }').propertygrid({
									url : 'product/prop/${type}data?code='
											+ (rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno)+'&id='+rowData.id,/*<!--***url需要更改 ***--> */
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
							
							}else{
								$("#cc${id_suffix }").layout("collapse", "east")
								/*  $('#pg${id_suffix }').propertygrid('loadData', {
									rows : []
								});  */
							}
							
						} else	{
							
							//选中点击行
							$("#tg${id_suffix }").treegrid("select",
									rowData.prodlineno)
							//判断id是否为PR开头 根据内码获取右侧属性列表值并显示右侧属性列表
							if ((rowData.prodlineno.indexOf('_')!=-1?rowData.prodlineno.split('_')[0]:rowData.prodlineno).indexOf("${type.toUpperCase()}") != -1) {/*<!--***PR需要更改 ***--> */
								//获取布局右侧面板的宽度
								var p = $("#cc${id_suffix }")
										.layout("panel", "east")[0].clientWidth
								//如果宽度为0,展开面板	
								if (p == 0) {
									$("#cc${id_suffix }").layout("expand", "east")
								}
							
								//加载属性表格
								$('#pg${id_suffix }').propertygrid({
									url : 'product/prop/${type}data?code='
											+ (rowData.prodlineno.indexOf('_')!=-1?rowData.prodlineno.split('_')[0]:rowData.prodlineno)+'&id='+rowData.id,/*<!--***url需要更改 ***--> */
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
							
							}else{
								$("#cc${id_suffix }").layout("collapse", "east")
								/* $('#pg${id_suffix }').propertygrid('loadData', {
									rows : []
								});  */
							}
							
						}
						
					}
					,onDblClickRow : function(rowData) {
						//跳转查看页面 编辑按钮显示状态
						var showStatus=false;
						debugger
						<% if(isShowEdit==true) { %>
						showStatus=true;
						<%}else{%>
						showStatus=false;
						
						<%}%>
						if(('${type eq "pi"}'=='true')||'${type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true'){
							
							debugger
							if(('${ipmtno}'!="all"&&'${ipmtno}'.indexOf(rowData.plipmtno.substring(rowData.plipmtno.lastIndexOf('_')+1))==-1)&&'${pdtno}'!="all"&&'${pdtno}'.indexOf(rowData.plipmtno.split('_')[0])==-1)
					    	{showStatus=false;
						   
					        }
					    	
					    	/* if('${type eq "pr" || type eq "pv"|| type eq "pp"}'=='true'&&'${pdtno}'!="all"&&'${pdtno}'.indexOf(rowData.plipmtno.split('_')[0])==-1){
					    		showStatus=false;
					    	} */
							if ((rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("${type.toUpperCase()}") != -1||(rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("SOHO") != -1) {
								 if ((rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("${type.toUpperCase()}") != -1||(rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("SOHO") != -1) {
								     $('#mainUrl').tabs('add',{
											    title : "${title}",
											    href : 'product/pages/${type}edit/'+(rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno)+"/"+rowData.id+"/${id_suffix }/"+showStatus+"/0",
											    closable : true
										   }); 
								}
							}
						}else	{
							debugger
						
								if(('${ipmtno}'!="all"&&'${ipmtno}'.indexOf(rowData.prodlineno.substring(rowData.prodlineno.lastIndexOf('_')+1))==-1) && ('${pdtno}'!="all"&&('${pdtno}'.indexOf(rowData.prodlineno.split('_')[0])==-1)))
						    	{
									showStatus=false;
						    	
						    	}
								
							/* 	if('${pdtno}'!="all"&&'${pdtno}'.indexOf(rowData.prodlineno.split('_')[0])==-1){
								
									showStatus=false;
						    	} */
								
								if ((rowData.prodlineno.indexOf('_')!=-1?rowData.prodlineno.split('_')[0]:rowData.prodlineno).indexOf("${type.toUpperCase()}") != -1) {
									$('#mainUrl')
									.tabs(
											'add',
											{
												title : "${title}",
												href : 'product/pages/${type}edit/'+(rowData.prodlineno.indexOf('_')!=-1?rowData.prodlineno.split('_')[0]:rowData.prodlineno)+'/'+rowData.id+"/${id_suffix }/"+showStatus+"/0",
												closable : true
											}); 
								}
						}
						
						<%-- <% if(isShowEdit==true) { %>
						
						if(('${type eq "pi"}'=='true')||'${type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true'){
							if ((rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("${type.toUpperCase()}") != -1||(rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("SOHO") != -1) {
								//IPMT秘书只能编辑配置为自己的数据
							    //if('${userCode}'!=""&&rowData.plimptSecretary.toUpperCase().indexOf('${userCode}'.toUpperCase())==-1){
							 
							    	
							    	if(('${ipmtno}'!="all"&&'${ipmtno}'.indexOf(rowData.plipmtno.substring(rowData.plipmtno.lastIndexOf('_')+1))==-1))
							    	{$.messager.alert('','您没有该数据的编辑权限！！！',"warning");
								    return;
							        }
							    	
							    	if('${type eq "pr" || type eq "pv"|| type eq "pp"}'=='true'&&'${pdtno}'!="all"&&'${pdtno}'.indexOf(rowData.plipmtno.split('_')[0])==-1){
							    		$.messager.alert('','您没有该数据的编辑权限！！！',"warning");
									    return;
							    	}
							    	
							    if ((rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("${type.toUpperCase()}") != -1||(rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno).indexOf("SOHO") != -1) {
								     $('#mainUrl').tabs('add',{
											    title : "修改${title}",
											    href : 'product/pages/${type}edit/'+(rowData.plipmtno.indexOf('_')!=-1?rowData.plipmtno.split('_')[0]:rowData.plipmtno)+"/"+rowData.id+"/${id_suffix }",
											    closable : true
										   }); 
								}
							}
							
						}else	{
							
							
							if ((rowData.prodlineno.indexOf('_')!=-1?rowData.prodlineno.split('_')[0]:rowData.prodlineno).indexOf("${type.toUpperCase()}") != -1) {
								if(('${ipmtno}'!="all"&&'${ipmtno}'.indexOf(rowData.prodlineno.substring(rowData.prodlineno.lastIndexOf('_')+1))==-1) || ('${pdtno}'!="all"&&('${pdtno}'.indexOf(rowData.prodlineno.split('_')[0])==-1)))
						    	{$.messager.alert('','您没有该数据的编辑权限！！！',"warning");
							    return;
						    	}
								
								if('${type eq "pt"}'=='true'&&'${pdtno}'!="all"&&'${pdtno}'.indexOf(rowData.prodlineno.split('_')[0])==-1){
						    		$.messager.alert('','您没有该数据的编辑权限！！！',"warning");
								    return;
						    	}
								$('#mainUrl')
								.tabs(
										'add',
										{
											title : "修改${title}",
											href : 'product/pages/${type}edit/'+(rowData.prodlineno.indexOf('_')!=-1?rowData.prodlineno.split('_')[0]:rowData.prodlineno)+'/'+rowData.id+"/${id_suffix }",
											closable : true
										}); 
								}
						}
						<%}else{%>
						  $.messager.alert('','您没有该数据的编辑权限！！！',"warning");
						
						<%}%> --%>
						
					}
					
				});
				$("#add${id_suffix }").attr("disabled",true);	

		});
		
		function ExpandedAndcheck${id_suffix}(node){
			if('${type eq "pi" || type eq "pl" || type eq "pp" || type eq "pv"|| type eq "pj"|| type eq "pr" || type eq "pb"}' == 'true'){
				 $("#tg${id_suffix }").treegrid("expand",node.plipmtno);
				 /* switch (node.plipmtno.substr(0,2)){
				 	case 'PI':isExpandALl${id_suffix}=isExpandALl${id_suffix}&&'${type eq "pi"}'; break;
				 	case 'PL':isExpandALl${id_suffix}=isExpandALl${id_suffix}&&'${type eq "pi"}'; break;
				 	case 'PP':isExpandALl${id_suffix}=isExpandALl${id_suffix}&&'${type eq "pi"}'; break;
					case 'PV':isExpandALl${id_suffix}=isExpandALl${id_suffix}&&'${type eq "pi"}'; break;
					case 'PJ':isExpandALl${id_suffix}=isExpandALl${id_suffix}&&'${type eq "pi"}'; break;
					case 'PI':isExpandALl${id_suffix}=isExpandALl${id_suffix}&&'${type eq "pi"}'; break;
				 }
				 if(isExpandALl${id_suffix}&&typeTmp=="pp"&&'${type eq "pp"}'&&node.plipmtno.substr(0,2)=='PP'){
					 isExpandALl${id_suffix}=false;
				 } 
				 if(isExpandALl${id_suffix}&&typeTmp=="pv"&&'${type eq "pv"}'&&node.plipmtno.substr(0,2)=='PV'){
					 isExpandALl${id_suffix}=false;
				 } 
				 if(isExpandALl${id_suffix}&&typeTmp=="pj"&&'${type eq "pj"}'&&node.plipmtno.substr(0,2)=='PJ'){
					 isExpandALl${id_suffix}=false;
				 }
				 if(isExpandALl${id_suffix}&&typeTmp=="pr"&&'${type eq "pr"}'&&node.plipmtno.substr(0,2)=='PR'){
					 isExpandALl${id_suffix}=false;
				 }
				  if(isExpandALl${id_suffix}&&typeTmp=="pb"&&'${type eq "pb"}'&&node.plipmtno.substr(0,2)=='PB'){
					 isExpandALl${id_suffix}=false;
				 } */   
			 }else{
				 $("#tg${id_suffix }").treegrid("expand",node.prodlineno);	
				 /* if(isExpandALl${id_suffix}&&'${type eq "pt"}'&&node.prodlineno.substr(0,2)=='PT'){
					 isExpandALl${id_suffix}=false;
				 }  */
			 }
		}
		
		function getTreeRoots(id,type){
			return id.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;
			/* var arr=id.split('_');
			var len=arr.length;
			return arr[len-1]; */
			/* var root=$('#tg${id_suffix}').treegrid('getParent',id);
			if(root==null) return null;
			if(root!=null&&root.plipmtno.substr(0,2)=="PI") return root;
			else getTreeRoots(root.plipmtno,type) */
		}
		
		//状态版本搜索
		function PDTbtn${id_suffix}(){
			var status=$('#PDTprojectStatu${id_suffix }').combobox('getValues');
			status=status.join(',');
			$("#selPdtReleaseUser${id_suffix}").datagrid("load",{
				projectStatus : status
			});
		}
	</script>
</body>
</html>
