<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>projectCodeApply</title>
    <script type="text/javascript" src="common/js/common.js"></script>
</head>
<body>
<!--搜索框-->
<div style="margin:0 20px">
	<input id="searchStr${timestamp}"
       class="easyui-textbox" type="text" prompt="请输入搜索内容"
       style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                        class="easyui-linkbutton" onclick="doSearch${timestamp}();">搜 索 </a>&nbsp;


	<div>
    <table id="tbl_grid${timestamp}" class="easyui-datagrid"></table>
    </div>
    <br><br><br><br>
</div>
<%-- <div id="resourceWin${timestamp}" class="easyui-window" title="对话框" style="width:600px;height:400px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <div class="index-4" >

        <div>
            <table>
                <tr>
                    <td>申请人部门</td>
                    <td>
                        <select id="applyDep${timestamp}">
                            <option value="1">研发</option>
                            <option value="2">专业服务部</option>
                            <option value="3">其他</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>变动类型</td>
                    <td>
                        <select id="applyType${timestamp}">
                            <option value="1">新增</option>
                            <option value="2">改变</option>
                            <option value="3">删除</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>申请产品编码数目</td>
                    <td>
                        <select id="applyCount${timestamp}">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </td>
                </tr>
            </table>
        </div>
        <div style="margin:20px 0;text-align:center;">
            <a href="#" class="easyui-linkbutton" onclick="confirm${timestamp}()">确定</a>
            <a href="#" class="easyui-linkbutton" onclick="cancle${timestamp}()">取消</a>
        </div>
    </div>
</div> --%>
<input id="singletan${timestamp}" value="" type="hidden"/>


<script type="text/javascript">
    $(function(){
        InitGrid${timestamp}();
    });

    
    //按照当前责任人查询
    function InitGrid${timestamp}(){
        $("#tbl_grid${timestamp}").treegrid({
            title:"项目编码申请",
            url: "projectWebFlow/findProjectCodeByCurHandler",
            method : 'get',
            idField : 'id',
            nowrap:false,
			treeField : 'curDeal',
            toolbar : [ {
                id : 'add',
                text : '项目编码申请',
                iconCls : 'tabs-icon fa fa-plus-square',
                handler : function() {
                	layoutWin${timestamp}();
                    /* if ($('#mainUrl').tabs('exists', "新增项目编码申请")) {
                        $('#mainUrl').tabs('select', "新增项目编码申请");
                    } else {
                        layoutWin${timestamp}();

                    } */
                }
            },'-',{
                id : 'edit',
                text : '编辑',
                iconCls : 'tabs-icon fa fa-edit',
                handler : function() {
                    var id = $("#singletan").val();
                    if(id == ""){
                        alert("请选择要编辑的数据!");
                    }else{
                        if ($('#mainUrl').tabs('exists', "编辑项目编码申请"+id)) {
                            $('#mainUrl').tabs('select', "编辑项目编码申请"+id);
                        } else {
                            $('#mainUrl').tabs('add', {
                                title : "编辑项目编码申请"+id,
                                href : '/projectWebFlow/edit?applyNo='+applyNo,
                                closable : true
                            });
                        }
                    }

                }
            }],
            columns: [[
                {field: 'processInsId', checkbox: false,hidden:true},
                {field: 'id', checkbox: false,hidden:true},
                {field: "curDeal",title: "当前责任人",align: "center",width:260},
                {field: "applyNo",title: "申请编号",align: "center",width:260},
                {field: "proName",title: "项目名称",align: "center",width:260},
                
                {field: "dept",title: "申请部门",align: "center",width:260},
                {field: "applyer",title: "申请人",align: "center",width:260},
                {field: "curStatus", title: "状态", align: "center",width:260},
                {field: "optType", title: "变动类型", align: "center",width:260},
                /* {field: "proNumber", title: "编码", align: "center",width:260}, */
            ]],
            onBeforeExpand : function(row) {//异步架加载树
				var url = "projectWebFlow/findProjectCodeByCurHandler";
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

    $('#tbl_grid${timestamp}').datagrid({
        onSelect: function(rowIndex,rowData){
            $("#singletan").val(rowData.id);
        },
        onDblClickRow : function(rowIndex,rowData) {
            $('#mainUrl')
                .tabs(
                    'add',
                    {
                        title : "项目编码申请",
                        href : '/projectWebFlow/edit?applyNo='+rowData.applyNo,
                        closable : true
                    });

        }
    });

    function doSearch${timestamp}(){
        $('#tbl_grid').datagrid('load',{
            type: $("#type").val(),
            searchStr: $("#searchStr").val()
        });
    }

    function layoutWin${timestamp}(){
        //$("#resourceWin${timestamp}").window('open');
    	 $('#mainUrl').tabs('add', {
             title : "项目编码申请",
             href : 'projectWebFlow/toAddProjectCode?applyDep=1&applyType=1&applyCount=1',
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
            title : "新增项目编码申请",
            href : 'projectWebFlow/toAddProjectCode?applyDep='+applyDep+'&applyType='+applyType+'&applyCount='+applyCount,
            closable : true
        });
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
</script>
</body>
</html>