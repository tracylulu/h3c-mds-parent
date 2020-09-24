<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>按当前责任人</title>
</head>
		
<body>
<div style="margin:0 20px">
	产品线 <input class="easyui-combobox" id="prodlineno${timestamp}" data-options="valueField: 'id', textField: 'prodlineDesc',  
								url: '/finance/fprodLine/getAllWithCom'"/>  
    	PDT <input class="easyui-combobox" id="PDTno${timestamp}" data-options="valueField: 'id', textField: 'note',  
								url: '/flowable/processConfigItem/getComboxList/processPDT'" />		
 		生效时间<input  id="start${timestamp}"  type= "text" class= "easyui-datebox" />~<input  id="end${timestamp}"  type= "text" class= "easyui-datebox" />
	<input id="searchStr${timestamp}"
       class="easyui-textbox" type="text" prompt="请输入搜索内容"
       style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                        class="easyui-linkbutton" onclick="doSearch${timestamp}();">搜 索 </a>&nbsp;
	
	<div>
    	<table id="tbl_grid${timestamp}" class="easyui-treegrid"></table>
	</div>
<br><br><br>
</div>
<script type="text/javascript">

		$(function(){
		    InitGrid${timestamp}();
		});

		
		function InitGrid${timestamp}(){
			$("#tbl_grid${timestamp}").treegrid({
			    title:"Part编码申请",
			    url: "flowable/partCodeProcess/findPartCodeByCurHandler",
			    method : 'get',
			    idField : 'treeId',
				treeField : 'handler',
				fitColumns:true, //列宽自适应
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

	                   
	                    $("#tbl_grid${timestamp}").treegrid("reload");
	                }
	            },"-",
                {
                    id : 'export${timestamp }',
                    text : '导出',
                    iconCls : 'tabs-icon fa fa-download',
                    handler : function() {
                    	doSearch${timestamp}();
                    	var search= $("#searchStr${timestamp}").val();
                    	var prodLine=$("#prodlineno${timestamp}").combobox("getValue");
                    	var pdt=$("#PDTno${timestamp}").combobox("getValue");                    
                        var start=$("#start${timestamp}").datebox('getValue');
                        var end=$("#end${timestamp}").datebox('getValue');
 
                    	window.location.href="/flowable/partCodeProcess/export?searchStr="+encodeURIComponent(search)+"&prodLine="+prodLine+"&pdt="+pdt+"&start="+start+"&end="+end;

                    }
                }],
				columns: [[
			                {field: 'treeId', checkbox: false,hidden:true},
			                {field: 'id', checkbox: false,hidden:true},
			                {field: "handler",title: "当前责任人",align: "left",width:100},
			                {field: "applyCode",title: "申请编号",align: "center",width:100},
			                {field: "applyPerson",title: "申请人",align: "center",width:100},
			                {field: "applyDept",title: "申请部门",align: "center",width:100},
			                {field: "tel",title: "联系电话",align: "center",width:100},
			                {field: "pdmApplyCode",title: "PDM申请单号",align: "center",width:100},
			                {field: "statusDesc", title: "状态", align: "center",width:100},
			            ]],
			    onBeforeExpand : function(row) {//异步架加载树
					var url = "flowable/partCodeProcess/findPartCodeByCurHandler";
					$("#tbl_grid${timestamp}").treegrid("options").url = url;
					return true;
				},
				onDblClickRow : function(rowData) {
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
			$("#tbl_grid${timestamp}").treegrid("load",{
				searchStr:$("#searchStr${timestamp}").val(),
	            prodLine:$("#prodlineno${timestamp}").combobox("getValue"),
	            pdt:$("#PDTno${timestamp}").combobox("getValue"),
	            start:$("#start${timestamp}").datebox('getValue'),
	            end:$("#end${timestamp}").datebox('getValue')
			  });
		}	
		
</script>
</body>
</html>
