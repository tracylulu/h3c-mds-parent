<%@ page language='java' contentType='text/html; charset=UTF-8' pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
<head>
<!--jsp页面必须引入jstl标签-->
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>字典列表</title>
</head>
<body>
	<div id='index${id_suffix }' class="userClass">
		<div class='index-4'>
			&nbsp;
			&nbsp;
			<div class="titleClass">数据字典配置</div>
          <div style="float: right;width: 70%;text-align: right;height: 28px;margin: -13px 0px;" >
			<span>类型:</span>
			&nbsp;
			<input class='easyui-combobox' id='dicTypecode${id_suffix}' name='dicTypecode' style='width:15%'  data-options="" />
			&nbsp;			
			<input id='searchStr${id_suffix}' class='easyui-textbox' type='text' prompt='请输入搜索内容' style='width:400px;' />
			&nbsp;
			<a href='javascript:void(0)' class='easyui-linkbutton default' id='btn_query${id_suffix}' onclick='doSearch${id_suffix}();'>搜 索 </a>
			&nbsp;
		</div>
			<table class='easyui-datagrid' id='tbl_grid${id_suffix}'></table>
		</div>
	</div>
	</div>

	<script type='text/javascript'>
	$(function(){
		
		//搜索框绑定回车事件
		$('#searchStr${id_suffix}').textbox({
			inputEvents : $.extend({}, $.fn.textbox.defaults.inputEvents, {
				keypress : function test() {
					if (event.keyCode == 13) {
						//doSearch(); //回车搜索
						$('#btn_query${id_suffix}').click()
					}
				}
			})			
		});
		
		initGrid${id_suffix}();
		
		$('#dicTypecode${id_suffix}').combobox({
			valueField:'dicTypecode',
			textField:'dicTypename',
			url:'/product/dic/getDicTypeComb',			
			onLoadSuccess:function(){
				$('#dicTypecode${id_suffix}').combobox('select','');
			}
		})
	});
	
	function initGrid${id_suffix}(){
		$('#tbl_grid${id_suffix}').datagrid({
			url: 'product/dic/getList',		        
	        pagination: true,//允许分页
	        rownumbers: true,//行号
	        singleSelect: true,//只选择一行
	        pageSize: 15,//每一页数据数量
	        checkOnSelect: false,
	        fitColumns:true, //列宽自适应
	        width:'100%',
	        height : window.innerHeight - window.innerHeight * 0.28,
	        pageList: [15,20,30,40,50,60],
	        toolbar : [ {
                id : 'add',    
                text : '添加',
                handler : function() {
          
                   if ($('#mainUrl').tabs('exists', '字典配置新增')) {
            	       $('#mainUrl').tabs('select', '字典配置新增');
            	     } else {
            	       $('#mainUrl').tabs('add', {
            	         title : '字典配置新增',
            	         href : 'product/dic/add',
            	         closable : true
            	       });
            	     }
                }
            }],
	        columns: [[
	        	{field:'id',hidden:true},
	        	{field: 'dicValue', hidden:true},
	        	{field: 'dicTypecode',title:'类型编码',width:100},	        
	        	{field: 'dicTypename',title: '类型名称',width:100}, 
	        	{field: 'dicName',title: '字典名称',width:100}	        	     	
	        ]],
			onDblClickRow : function(index,rowData) {					
				if(rowData.id!=null){
					 $('#mainUrl').tabs('add', {
            	         title : '字典配置新增',
            	         href : 'product/dic/edit/'+rowData.id,
            	         closable : true
            	       });
				}
			}
				
		});
	}
	
	function doSearch${id_suffix}(){
		$('#tbl_grid${id_suffix}').datagrid('load',{
			dicTypeCode: $('#dicTypecode${id_suffix}').combobox('getValue'),
			searchStr: $('#searchStr${id_suffix}').val()
		});
	}
		
		

	</script>
</body>
</html>