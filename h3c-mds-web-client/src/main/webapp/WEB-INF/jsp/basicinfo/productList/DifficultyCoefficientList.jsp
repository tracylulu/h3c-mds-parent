
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>难度系数查询</title>
     <%String pgs = (String)request.getAttribute("page"); %>
</head>
<body>
<div id="index${id_suffix }" style="margin:0px 20px;">
		<!--布局-->
		<div class="index-4" style="text-align:right;height:28px;margin:10px 0px;">
	<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 400px;" />
			&nbsp;
	<a href="javascript:void(0)" class="easyui-linkbutton default" id="btn_query${id_suffix}" onclick="doSearch${id_suffix}();" style="margin-right:2%;color:white;background-color:#3498DB;">搜 索 </a>
			&nbsp;
<!--左右布局 easyui-layout-->
			<div id="cc${id_suffix }" class="easyui-layout" style="width: 100%; height: 'auto';">
				<!--左布局  center-->
				<!--***title需要更改 ***-->
				<div data-options="region:'center',title:'${title}'" style="width: 100%; height: 100%;">

					<!--左侧树形表格-->
					<div class="index-1" style="margin:10px 0px;">
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
					{
						id : 'add${id_suffix }',
						text : '难度系数申请',
						iconCls : 'tabs-icon fa fa-save',
						handler : function() {
							 //如果选中当前列，新增继承
							 var row=$("#tg${id_suffix }").treegrid("getSelected");
							//新增
							if ($('#mainUrl').tabs('exists', "难度系数申请")) {
		            	       $('#mainUrl').tabs('select', "难度系数申请");
		            	     } else {
		            	    	 $('#mainUrl').tabs('add',{
									 title : "难度系数申请",
									 href : '/basicinfo/DifficultyCoefficient/add?selId='+(row!=null&&row.code!=null?(row.id!=undefined?row.id:0):0),
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
						//取消选中其他行
						$("#tg${id_suffix }").treegrid("unselectAll");
						//重新加载
						$("#tg${id_suffix }").treegrid("reload");
					}
				} ],
				collapsible : false,
				url : 'basicinfo/productList/difficultyListdata',  /*<!--***url需要更改 ***--> */
				method : 'post',
				idField : 'prodlineno',/* <!--***idField需要更改 ***--> */
				treeField : 'prodline',/* <!--***treeField需要更改 ***--> */
				striped:true, 
				height : window.innerHeight	- window.innerHeight * 0.28,
				fitColumns : true,
				columns:[[   
							{title:'流程id',field:'id',hidden:true,width:180},  
					 		{title:'产品线编码',field:'prodlineno',hidden:true,width:180},
					        {title:'产品线',field:'prodline',width:180,formatter:function(value,row,index)
					        {
					        		if(value==undefined||value==''){
					        			return "";
					        		}else{
					        			return value;
					        		}
					        		
					        }},     
					        {title:'产品',field:'product',width:80},
					        {title:'版本',field:'version',width:80},
					        {title:'当前责任人',field:'responsible',width:80,formatter:function(value,row,index)
					        	{
				        		if(value==undefined||value==''){
				        			return "";
				        		}else{
				        			return value;
				        		}
				        		
				   		    }},
					        {title:'申请人',field:'createUser',width:80},
					        {title:'流程状态',field:'statusname',width:80},
					        {title:'创建时间',field:'createDate',width:80,formatter: formatDatebox},
					        {title:'产品Sn',field:'prodifficult',width:80},
					        {title:'硬件Sn',field:'harddifficult',width:80},
				]]  , 
				onBeforeExpand : function(row) {//异步架加载树
					var url = "basicinfo/productList/difficultyListdata";
					$("#tg${id_suffix }").treegrid("options").url = url;
					return true;
				},
				onDblClickRow : function(rowData) {
					 if(rowData!=null&& rowData.id!=null&&rowData.id!=undefined){
						 $('#mainUrl').tabs(
								'add',
								{
									title : "修改难度系数",
									href : '/basicinfo/DifficultyCoefficient/edit/'+rowData.id,
									closable : true
								}); 
						 
					} 				
				}
			});
			
			
			});
			
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
	      /*   var h = date.getHours();
	        var minute = date.getMinutes();
	        minute = minute < 10 ? ('0' + minute) : minute;
	        var second= date.getSeconds();
	        second = second < 10 ? ('0' + second) : second; */
	        return y + '-' + m + '-' + d;//+' '+h+':'+minute+':'+ second;
	    };

	
	function doSearch${id_suffix}(){
			//获取布局右侧面板的宽度
			
			$("#tg${id_suffix }").treegrid('load',{
				searchStr: $("#searchStr${id_suffix}").val()
			});
		}
		
		
	</script>
</body>
</html>
