<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>prductCodeApply</title>
</head>
<body>
<!--搜索框-->
<div class="userClass">
<div class="titleClass">推荐项目编码</div>
<div class="searchClass" >
<input id="searchStr${timestamp}"
       class="easyui-textbox" type="text" prompt="请输入搜索内容"
       style="width: 400px;" /> &nbsp; <a href="javascript:void(0)"
                                        class="easyui-linkbutton" onclick="doSearch${timestamp}();">搜 索 </a>&nbsp;
</div>
<div>
    <table id="tbl_grid${timestamp}" class="easyui-datagrid" style="width:100%;"></table>
</div>

<input id="singletan${timestamp}" value="" type="hidden"/>
</div>
</div>
<script type="text/javascript">
    $(function(){
        InitGrid${timestamp}();
    });

    
    function InitGrid${timestamp}(){
    	$("#tbl_grid${timestamp}").treegrid({
            title:"推荐项目编码",
            url: "projectWebFlow/treeRecommendProjectCode",
            method : 'get',
            idField : 'id',
			treeField : 'prodline',
			striped:true, 
			height : window.innerHeight - window.innerHeight * 0.23,
			fitColumns:true,
            toolbar : [ <%-- <% if(isShow==true) { %>
                        {
                id : 'add',
                text : '创建项目编码',
                iconCls : 'tabs-icon fa fa-plus-square',
                handler : function() {
                    if ($('#mainUrl').tabs('exists', "新增项目编码")) {
                        $('#mainUrl').tabs('select', "新增项目编码");
                    } else {
                        
                    	 $('#mainUrl').tabs('add', {
            	             title : "新增项目编码",
            	             href : '/finance/fprojectCode/toAddProjectCode?isEdit=true',
            	             closable : true
            	         });

                    }
                }
            },'-',
            <%} %> --%>
            {
                id : 'add',
                text : '全部折叠',
                handler : function() {
                    $("#tbl_grid${timestamp}").treegrid("collapseAll");
                }
            },"-",
            {
                id : 'reload${id_suffix }',
                text : '刷新',
                handler : function() {

                   
                    $("#tbl_grid${timestamp}").treegrid("reload");
                }
            }],
            columns: [[
                       {field: 'id', checkbox: false,hidden:true},
                       {field: 'prodlineno', hidden:true},
                       {field: 'prodline', title: "所属产品线",align: "left",width:"24%"},
                       {field: "pdtNo",title: "PDT内码",hidden:true},
                       /* {field: "prolineName",title: "产品线名称",align: "center",width:100}, */
                       {field: "pdtName",title: "所属PDT",align: "center",width:"24%"},
                       /* {field: "bversionName",title: "B版本名称",align: "center",width:100}, */
                       {field: "proNumber",title: "项目编码",align: "center",width:"24%"},
                       {field: "remark",title: "备注",align: "center",width:"24%"}
            ]],
            onBeforeExpand : function(row) {//异步架加载树
				//row.plipmtno = row.plipmtno.substr(row.plipmtno.lastIndexOf('_') + 1);
				var url = "projectWebFlow/treeRecommendProjectCode";
				$("#tbl_grid${timestamp}").treegrid("options").url = url;
				return true;
			} ,
            onDblClickRow : function(row){
            	
            	 $('#mainUrl')
	                .tabs(
	                    'add',
	                    {
	                        title : "推荐项目编码",
	                        href : '/projectWebFlow/toAddRecommendProjectCode?id='+row.id,
	                        closable : true
	                    });
	
	        }
            	
        });
	}
    
    
    
   

    function jsonDataFomat(val, row){
        if(val!=null){
            var str1 = val.indexOf("(")
            var str2 = val.lastIndexOf(")");
            var dateValue = val.substring(str1 + 1, str2);
            var date = new Date(parseInt(dateValue));
            return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + " " + date.getHours() + ":" + date.getMinutes();
        }
        return "";
    }

    function doSearch${timestamp}(){
        $('#tbl_grid${timestamp}').treegrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchStr${timestamp}").val()
        });
    }

    function layoutWin${timestamp}(){
        //$("#resourceWin${timestamp}").window('open');
        $('#mainUrl').tabs('add', {
            title : "产品编码申请",
            href : 'flowable/productCodeApply/add?applyDep=1&applyType=1&applyCount=1',
            closable : true
        });
    }

    function cancle${timestamp}(){
        $("#resourceWin${timestamp}").window('close');
    }

    function confirm${timestamp}() {
        $("#resourceWin${timestamp}").window('close');
        var applyDep = $("#applyDep${timestamp}").val();
        var applyType = $("#applyType${timestamp}").val();
        var applyCount = $("#applyCount${timestamp}").val();
        $('#mainUrl').tabs('add', {
            title : "产品编码申请",
            href : 'flowable/productCodeApply/add?applyDep='+applyDep+'&applyType='+applyType+'&applyCount='+applyCount,
            closable : true
        });
    }
</script>
</body>
</html>