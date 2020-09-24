<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看日志信息</title>
</head>
<body>
	<div id="sellog${id_suffix}"  style="margin-left:10%;margin-right:10%;overflow:hidden;">
	<p style="text-align: center;">
			<span style="font-size: 20px;">部门日志 </span>
		</p>
		<br>
		<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%;" />
      		&nbsp;
			<a href="javascript:void(0)" class="easyui-linkbutton default" id="btn_query${id_suffix}" onclick="doSearch${id_suffix}();">搜 索 </a>
			&nbsp;
      	<div style="width:100%"  class="index-1">
		     <table id="log${id_suffix}" class="easyui-datagrid" data-options="">   
			</table>
			</div>
			<div id="showEdit${id_suffix}" style="width:100%;display:none">
			<br><br>
			<hr style="width:100%;">
			<div style="float:left;width:48%;" >
		     <table id="log1${id_suffix}">   
			</table>
			<br><br>
			</div>
			<div style="float:center;width:4%;"></div>
			<div  style="float:right;width:48%;">
		     <table id="log2${id_suffix}">   
			</table>
			<br><br>
			</div>
			<br><br>
			</div>
			
			<br><br>
	</div>

		<script type="text/javascript">
		$(function(){
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
			var selectId;
			var mark=0;
			$("#log${id_suffix}").datagrid({
				url: "dept/log/listData?code=${code}",		        
		        pagination: true,//允许分页
		        rownumbers: true,//行号
		        singleSelect: true,//只选择一行
		        pageSize: 10,//每一页数据数量
		        checkOnSelect: false,
		        fitColumns:true, //列宽自适应
		        width:'100%',
		        idFiled:'id',
		        height : window.innerHeight - window.innerHeight * 0.28,
		        pageList: [10,20,30,40,50,60],
		        columns: [[
		        	{field:'id',hidden:true},
		        	{field: 'opttype', hidden:true},
		        	{field: "opttypename",title: "操作类型",align: "center",width:'15%',formatter:formatProgress${id_suffix}}, 
		        	{field: "code",title: "SAP编码",align: "center",width:'20%',formatter:formatProgress${id_suffix}},
		        	{field: "deptname",title: "部门名称",align: "center",width:'20%',formatter:formatProgress${id_suffix}},
		        	{field: "operator",title: "操作人",align: "center",width:'20%',formatter:formatProgress${id_suffix}},
		        	{field: "opttime",title: "操作时间",align: "center",width:'25%',formatter: formatDatebox${id_suffix}}	
		        ]],
				onClickRow : function(index,rowData) { //单击事件
					selectId=index;
					//取消选中其他行
					$("#log${id_suffix }").datagrid("unselectAll");
					
					//取消选中当前行
					if(mark==1){
						$("#log${id_suffix }").datagrid("selectRow",selectId);
					    selectId=-1;
					}
					
					if(mark==0){
					 $("#log${id_suffix}").datagrid({height:(window.innerHeight - window.innerHeight * 0.28)/1.7});
					 mark=1;
					}
					
					
					
					$("#showEdit${id_suffix}").show();
					
					getEditBefore${id_suffix}(rowData.id);
					getEditAfter${id_suffix}(rowData.id); 
					
					
				},onLoadSuccess:function(){
					//取消选中其他行
					$("#log${id_suffix }").datagrid("unselectAll");
					//选中当前行
					
					if(selectId!=-1){
					$("#log${id_suffix }").datagrid("selectRow",selectId);
					}
					selectId=-1;
			
				 }
			});
		});
		//时间格式化
		function formatDatebox${id_suffix}(value) {  
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
				$('#log${id_suffix}').datagrid('load',{
					proType: '${code}',
					searchStr: $("#searchStr${id_suffix}").val()
				});
			}
		    
		
		function getEditBefore${id_suffix}(id){
			$("#log1${id_suffix}").propertygrid({
				url : 'dept/log/getEditBefore?code=${code}&id='+id,/*<!--***url需要更改 ***--> */
			showGroup : true,
			scrollbarSize : 0,
			title:"变更前数据",
			height : window.innerHeight
					- window.innerHeight
					* 0.28,
			width : '100%',
			columns :  [[
	            {field:'name',title:'属性名',width:'30%',sortable:false,formatter:formatProgress${id_suffix}},
	            {field:'value',title:'属性值',width:'70%',resizable:false,formatter:formatProgress${id_suffix}}
	        ]]
		    });
		}
		
		function getEditAfter${id_suffix}(id){
			$("#log2${id_suffix}").propertygrid({
				url : 'dept/log/getEditAfter?code=${code}&id='+id,/*<!--***url需要更改 ***--> */
			showGroup : true,
			scrollbarSize : 0,
			title:"变更后数据",
			height : window.innerHeight
					- window.innerHeight
					* 0.28,
			width : '100%',
			columns :  [[
	            {field:'name',title:'属性名',width:'30%',sortable:false,formatter:formatProgress${id_suffix}},
	            {field:'value',title:'属性值',width:'70%',resizable:false,formatter:formatProgress${id_suffix}}
	        ]]
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
					
					
					
					if(rowData.ifofficialnaming == 1)
					{
						rowData.ifofficialnaming="是";
					}
					if(rowData.ifofficialnaming == 0)
					{
						rowData.ifofficialnaming="否";
					}
				}
				return '<div style="width:92%;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
						+ value + '</div>';
			}
		}
		</script>
</body>
</html>