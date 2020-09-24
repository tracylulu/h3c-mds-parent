<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>财务项目编码列表</title>
</head>
		
<body>
<div style="margin:0 20px">
	<input id="searchStr${timestamp}"
       class="easyui-textbox" type="text" prompt="请输入搜索内容"
       style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                        class="easyui-linkbutton" onclick="doSearch${timestamp}();">搜 索 </a>&nbsp;

	<div>
    <table id="tbl_grid${timestamp}" class="easyui-treegrid">
    </table>
    </div>
    <br><br><br><br>
</div>
<script type="text/javascript">

		$("#tbl_grid${timestamp}").treegrid({
		    title:"项目编码申请",
		    url: "projectWebFlow/findProjectCodeByProcess",
		    method : 'post',
		    idField : 'id',
		    nowrap:false,
			treeField : 'curStatus',
		    toolbar : [ {
		        id : 'add',
		        text : '项目编码申请',
		        iconCls : 'tabs-icon fa fa-plus-square',
		        handler : function() {
		        	layoutWin${timestamp}();
		            /* if ($('#mainUrl').tabs('exists', "新增项目编码申请")) {
		                $('#mainUrl').tabs('select', "新增项目编码申请");
		            } else {
		                
		
		            } */
		        }
		    },'-',{
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
            }],
		    columns: [[
		        {field: 'id', checkbox: false,hidden:true},
		        {field: 'processInsId', checkbox: false,hidden:true},
		        {field: "curStatus", title: "状态", align: "center",width:260, formatter:formatProgress},
		        {field: "applyer",title: "申请人",align: "center",width:260},
		        {field: "applyNo",title: "申请编号",align: "center",width:260},
		        {field: "proName", title: "项目名称", align: "center",width:260},
		        {field: "dept",title: "申请部门",align: "center",width:260},
		        {field: "optType", title: "操作类型", align: "center",width:260},
		        /* {field: "proNumber", title: "编码", align: "center",width:260}, */
		    ]],
		    onBeforeExpand : function(row) {//异步架加载树
				var url = "projectWebFlow/findProjectCodeByProcess";
				$("#tbl_grid${timestamp}").treegrid("options").url = url;
				return true;
			},
			onDblClickRow : function(rowData) {
				if(rowData.applyNo.startsWith("OBC")){
		        $('#mainUrl')
		            .tabs(
		                'add',
		                {
		                    title : "查看项目编码申请",
		                    href : '/projectWebFlow/edit?applyNo='+rowData.applyNo,
		                    closable : true
		                });
					
				}
		
		    }
		});

		function layoutWin${timestamp}(){
	        //$("#resourceWin${timestamp}").window('open');
	    	 $('#mainUrl').tabs('add', {
	             title : "项目编码申请",
	             href : 'projectWebFlow/toAddProjectCode?applyDep=1&applyType=1&applyCount=1',
	             closable : true
	         });
	    }
		
		
		function formatProgress(value,rowData,rowIndex) {
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
				}
				return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
						+ value + '</div>';
			}
		}
		
		String.prototype.startsWith = function(str) {
		    if (!str || str.length > this.length)
		        return false;
		    if (this.substr(0, str.length) == str)
		        return true;
		    else
		        return false;
		    return true;
		}
		
		function doSearch${timestamp}(){
	        $('#tbl_grid${timestamp}').treegrid('load',{
	            //type: $("#type").val(),
	            searchParams: $("#searchStr${timestamp}").val()
	        });
	    }
</script>
</body>
</html>
