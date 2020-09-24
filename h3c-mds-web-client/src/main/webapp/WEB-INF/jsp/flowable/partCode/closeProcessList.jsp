<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>按已关闭待更新</title>
</head>
		
<body>
<div style="margin:0 20px">
<input id="searchStr${timestamp}"
       class="easyui-textbox" type="text" prompt="请输入搜索内容"
       style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                        class="easyui-linkbutton" onclick="doSearch${timestamp}();">搜 索 </a>&nbsp;


	<div>
    <table id="tbl_grid${timestamp}" class="easyui-datagrid"></table>
</div>
<br><br><br>
</div>
<script type="text/javascript">

		$(function(){
		    InitGrid${timestamp}();
		});

		
		function InitGrid${timestamp}(){
			$("#tbl_grid${timestamp}").datagrid({
			    title:"Part编码申请",
			    url: "flowable/partCodeProcess/findPartCodeByCloseProcess",
			    pagination: true,//允许分页
	            rownumbers: true,//行号
	            singleSelect: true,//只选择一行
	            pageSize: 15,//每一页数据数量
	            checkOnSelect: false,
	            fitColumns:true, //列宽自适应
	            height : window.innerHeight - window.innerHeight * 0.23,
	            pageList: [15,20,30,40,50,60],
				toolbar : [ {
	                id : 'add',
	                text : '全部折叠',
	                iconCls : 'tabs-icon fa fa-minus-square',
	                handler : function() {
	                    $("#tbl_grid${timestamp}").treegrid("collapseAll");
	                }
	            },"-",
	            {
	                id : 'reload${id_suffix }',
	                text : '刷新',
	                iconCls : 'tabs-icon fa fa-refresh',
	                handler : function() {

	                   
	                    $("#tbl_grid${timestamp}").datagrid("reload");
	                }
	            }],
				columns: [[
			                /* {field: 'treeId', checkbox: false,hidden:true}, */
			                {field: 'id', checkbox: false,hidden:true},
			                {field: "applyCode",title: "申请编号",align: "left",width:100},
			                {field: "productCode",title: "产品编码",align: "center",width:100},
			                {field: "statusDesc", title: "状态", align: "center",width:100},
			            ]],
			    onBeforeExpand : function(row) {//异步架加载树
					var url = "flowable/partCodeProcess/findPartCodeByCloseProcess";
					$("#tbl_grid${timestamp}").datagrid("options").url = url;
					return true;
				},
				onDblClickRow : function(rowIndex, rowData) {
		            $('#mainUrl')
		                .tabs(
		                    'add',
		                    {
		                        title : "Part编码申请",
		                        href : '/flowable/partCodeProcess/edit/'+rowData.id,
		                        closable : true
		                    });

		        }
			});
			
		}
		
		
		function doSearch${timestamp}(){
			$("#tbl_grid${timestamp}").datagrid("load",{
				searchStr:$("#searchStr${timestamp}").val()
			  });
		}		
</script>
</body>
</html>
