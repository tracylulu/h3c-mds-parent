<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>prductCodeApply</title>
</head>
<body>
<!--搜索框-->
<div style="margin:0px 20px">
    <input id="searchStr${timestamp}"
           class="easyui-textbox" type="text" prompt="请输入搜索内容"
           style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                            class="easyui-linkbutton"  onclick="doSearch${timestamp}();">搜 索 </a>&nbsp;

    <div >
        <table id="tbl_grid${timestamp}" class="easyui-datagrid"></table>
    </div>
    <br/><br/>
</div>

<div id="resourceWin${timestamp}" class="easyui-window" title="对话框" style="width:600px;height:400px"
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
</div>
<input id="singletan${timestamp}" value="" type="hidden"/>


<script type="text/javascript">
    $(function(){
        InitGrid${timestamp}();
    });

    function InitGrid${timestamp}(){
        $("#tbl_grid${timestamp}").datagrid({
            title:"产品编码申请",
            url: "flowable/productCodeApply/findByPage",
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
                text : '产品编码申请',
                iconCls : 'tabs-icon fa fa-plus-square',
                handler : function() {
                    //alert("添加")
                    //displayPage('add');
                    <%--if ($('#mainUrl').tabs('exists', "产品编码申请")) {--%>
                    <%--    $('#mainUrl').tabs('select', "新增产品编码申请");--%>
                    <%--} else {--%>
                    <%--    layoutWin${timestamp}();--%>

                    <%--}--%>
                    layoutWin${timestamp}();
                }
             }
                 ,'-',
                {
                    id : 'reload${timestamp }',
                    text : '刷新',
                    iconCls : 'tabs-icon fa fa-refresh',
                    handler : function() {


                        $("#tbl_grid${timestamp}").datagrid("reload");
                    }
                }
                ],
            columns: [[
                {field: 'id', checkbox: false,hidden:true},
                {field: "applyCode",title: "申请编号",align: "center",width:100},
                {field: "productCodes",title: "产品编码",align: "center",width:100},
                {field: "subSign",title: "申请人",align: "center",width:100},
                {field: "handler",title: "当前责任人",align: "center",width:100},
                {field: "applyDept",title: "申请部门",align: "center",width:100,formatter:function (value,row,index) {
                        if(value == "D0001"){
                            value = "研发";
                        }else if(value == "D0002"){
                            value = "专业服务部";
                        }else if(value == "D0003"){
                            value = "其他";
                        }
                        return value;
                    }},
                {field: "statusDesc", title: "状态", align: "center",width:100,formatter:function (value,row,index) {
                        if(value=="1"){
                            row.status = "在途";
                        }else if(value == "0"){
                            row.status = "草稿";
                        }else if(value == "2"){
                            row.status = "驳回";
                        }else if(value == "10"){
                            row.status == "驳回";
                        }
                        return value;
                    }},
            ]]
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
            $("#singletan${timestamp}").val(rowData.id);
        },
        onDblClickRow : function(rowIndex,rowData) {
            $('#mainUrl')
                .tabs(
                    'add',
                    {
                        title : "查看产品编码申请",
                        href : '/flowable/productCodeApply/edit/'+rowData.id,
                        closable : true
                    });

        }
    });

    function doSearch${timestamp}(){
        $('#tbl_grid${timestamp}').datagrid('load',{
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