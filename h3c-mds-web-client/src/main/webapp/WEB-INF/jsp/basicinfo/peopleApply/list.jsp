
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>产品信息查询</title>
</head>
<body>
<input name="type" id="$type{id_suffix}" type="hidden" />
	<div id="index${id_suffix }">
		<!--布局-->
		<div class="index-4">
			<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%;" />
			&nbsp;
			<a href="javascript:void(0)" class="easyui-linkbutton default" id="btn_query${id_suffix}" style="background-color: #3498DB" onclick="doSearch${id_suffix}();">搜 索 </a>
			&nbsp;
			<!--左右布局 easyui-layout-->
			<div id="cc${id_suffix }" class="easyui-layout" style="width: 100%; height: 'auto';">
				<!--左布局  center-->
				<!--***title需要更改 ***-->
				<div data-options="region:'center'" style="width: 100%; height: 100%;">

					<!--左侧树形表格-->
					<div class="index-1">
						<table id="tg${id_suffix }" style="width: 100%; heght: 100%;">
						</table>
					</div>
				</div>
				<!--右布局  east-->
				<%-- <div data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true" style="width: 20%;" id="east">
					<!--propertygrid动态属性-->
					<table id="pg${id_suffix }">
					</table>
				</div> --%>

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
		
		var type='${type}';
		if(type=="user"){
			initUserTree${id_suffix}();
		}else{
			initDateTree${id_suffix}();
		}
		
	});
	
	function initUserTree${id_suffix}(){
		//加载树
		$("#tg${id_suffix }").treegrid({
			iconCls : 'icon-ok',
			toolbar : [ 
				{
					id : 'add${id_suffix }',
					text : '人员信息修改申请',
					iconCls : 'tabs-icon fa fa-minus-square',
					handler : function() {
						//新增
						if ($('#mainUrl').tabs('exists', "人员信息修改申请")) {
	            	       $('#mainUrl').tabs('select', "人员信息修改申请");
	            	     } else {
	            	    	 $('#mainUrl').tabs('add',{
								 title : "人员信息修改申请",
								 href : '/basicinfo/peopleApply/add',
								 closable : true
							 }); 
	            	     }						
					}
				},"-",
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
				}
			],
			collapsible : false,
			url : 'basicinfo/peopleApply/listData',  /*<!--***url需要更改 ***--> */
			method : 'post',
			idField : 'key',/* <!--***idField需要更改 ***--> */
			treeField : 'createUser',/* <!--***treeField需要更改 ***--> */
			striped:true, 
			height : window.innerHeight	- window.innerHeight * 0.28,
			fitColumns : true,
			queryParams : {				
				type : '${type}'
			},
			columns:[[   
				{title:'id',field:'id',hidden:true,width:180},  
				{title:'procode',field:'procode',width:80,hidden:true},
				{title:'申请人',field:'createUser',width:180}, 			
				{title:'当前责任人',field:'responsible',width:80,formatter:function(value,row,index)
		        	{
	        		if(value==undefined||value==''){
	        			return "";
	        		}else{
	        			return value;
	        		}
	        		
	   		    }},
				{title:'创建时间',field:'createDate',width:60,formatter: formatDatebox},    
				{title:'状态',field:'statusname',width:80},    
				{title:'修改信息',field:'proname',width:80}				        
			]], 
			onBeforeExpand : function(row) {//异步架加载树
				var url = "basicinfo/peopleApply/listData";
				$("#tg${id_suffix }").treegrid("options").url = url;
				return true;
			},
			loadFilter:function(data){		    	
				if(data!=null&&data.length>0){	
					$.each(data,function(i,item){
						if(item.id!=null&&item.id!=undefined){
							data[i].key=item.id+'_'+item.procode+'_'+item.itemId
						}else{
							data[i].key=item.createUser
						}						
					});
					return data;
				}
		    	return data;
			},
			onDblClickRow : function(rowData) {
				 if(rowData!=null&& rowData.id!=null&&rowData.id!=undefined){
					 $('#mainUrl').tabs('add',{
						 title : "修改人员信息修改申请",
						 href : '/basicinfo/peopleApply/edit/'+rowData.id,
						 closable : true
					 }); 
				}	 				
			}
		});
	}
	
	function initDateTree${id_suffix}(){
		//加载树
		$("#tg${id_suffix }").treegrid({
			iconCls : 'icon-ok',
			toolbar : [
				{
					id : 'add${id_suffix }',
					text : '申请人员信息修改',
					iconCls : 'tabs-icon fa fa-minus-square',
					handler : function() {
						//新增
						if ($('#mainUrl').tabs('exists', "人员信息修改申请")) {
	            	       $('#mainUrl').tabs('select', "人员信息修改申请");
	            	     } else {
	            	    	 $('#mainUrl').tabs('add',{
								 title : "人员信息修改申请",
								 href : '/basicinfo/peopleApply/add',
								 closable : true
							 }); 
	            	     }						
					}
				},"-",
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
				} 
			],
			collapsible : false,
			url : 'basicinfo/peopleApply/listData',  /*<!--***url需要更改 ***--> */
			method : 'post',
			idField : 'key',/* <!--***idField需要更改 ***--> */
			treeField : 'yearandmonth',/* <!--***treeField需要更改 ***--> */
			striped:true, 
			height : window.innerHeight	- window.innerHeight * 0.28,
			fitColumns : true,
			queryParams : {				
				type : '${type}'
			},
			columns:[[   
				{title:'id',field:'id',hidden:true,width:180},  
				{title:'procode',field:'procode',hidden:true,width:180}, 
				{title:'创建时间',field:'yearandmonth',width:60},   
				{title:'申请人',field:'createUser',width:180}, 				 		
				{title:'状态',field:'statusname',width:80},    
				{title:'修改信息',field:'proname',width:80}				        
			]], 
			onBeforeExpand : function(row) {//异步架加载树
				var url = "basicinfo/peopleApply/listData";
				$("#tg${id_suffix }").treegrid("options").url = url;
				return true;
			},
			loadFilter:function(data){		    	
				if(data!=null&&data.length>0){	
					$.each(data,function(i,item){
						if(item.id!=null&&item.id!=undefined){
							data[i].key=item.id+'_'+item.procode+'_'+item.itemId;
						}else{
							data[i].key=item.yearandmonth
						}						
					});
					return data;
				}
		    	return data;
			},
			onDblClickRow : function(rowData) {
				 if(rowData!=null&& rowData.id!=null&&rowData.id!=undefined){
					 $('#mainUrl').tabs('add',{
						 title : "人员信息修改申请",
						 href : '/basicinfo/peopleApply/edit/'+rowData.id,
						 closable : true
					 }); 
				}	 				
			}
		});
	}
			
	function formatDatebox(value) {  
	    if (value == null || value == '') {  
	        return '';  
	    }  
	    var dt;  
	    if (value instanceof Date) {  
	        dt = value;  
	    } else {  
	        var dt = new Date(Date.parse(value.replace(/-/g, "/")));
            dt.setHours(dt.getHours()-14);
            dt=jsonDataFomat${id_suffix }(dt);
	    }  
	    return dt; 
	} 
	 function jsonDataFomat${id_suffix }(date){
	        var y = date.getFullYear();
	        var m = date.getMonth() + 1;
	        m = m < 10 ? ('0' + m) : m;
	        var d = date.getDate();
	        d = d < 10 ? ('0' + d) : d;
	        var h = date.getHours();
	        var minute = date.getMinutes();
	        minute = minute < 10 ? ('0' + minute) : minute;
	        var second= date.getSeconds();
	        second = second < 10 ? ('0' + second) : second;
	        return y + '-' + m + '-' + d+' '+h+':'+minute+':'+ second;
	    };

	
	function doSearch${id_suffix}(){
			//获取布局右侧面板的宽度
			
			$("#tg${id_suffix }").treegrid('load',{
				type: '${type}',
				searchStr: $("#searchStr${id_suffix}").val()
			});
		}
		
		
	</script>
</body>
</html>
