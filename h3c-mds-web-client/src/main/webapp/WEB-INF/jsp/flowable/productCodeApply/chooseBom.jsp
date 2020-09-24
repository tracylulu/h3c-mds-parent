<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/5/30
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="bomCodeWin${timestamp}" class="easyui-window" title="BOM编码" style="width:80%;height:560px"
         data-options="iconCls:'icon-save',modal:true,closed:true,minimizable:false,maximizable:false" >
        <input id="current_bom_index${timestamp}" type="hidden" value=""/>

        <div style="position:absolute;background:#ffffff;width:100%">
            <a href="javascript:void(0)" style="text-align: right;height: 28px;"
               class="easyui-linkbutton" onclick="chooseBom${timestamp}();">选择BOM </a>&nbsp;

            <br/>
        </div>
        <div style="margin-top: 2.4%;">
            <table id="bomTable${timestamp}" class="product-code" border="1" width="100%">
                <thead>
                <tr>
                    <th width="10%" align="center">BOM编码</th>
                    <th align="center">BOM描述</th>
                    <th align="center">操作</th>
                </tr>
                </thead>
                <tbody>

                </tbody>

            </table>
        </div>

        <br><br><br>
        <div style="position:absolute;background:#ffffff;width:100%;text-align:center;bottom:0;">
            <a href="#" class="easyui-linkbutton" onclick="confirmBom${timestamp}();" id="confirmFile${timestamp}">确认</a>
            <a href="#" class="easyui-linkbutton" onclick="cancleBom${timestamp}();" id="cancleFile${timestamp}">取消</a>
        </div>
    </div>

    <div id="chooseBomWin${timestamp}" class="easyui-window" title="选择BOM编码" style="width:75%;height:500px"
         data-options="iconCls:'icon-save',modal:true,closed:true,minimizable:false,maximizable:false" >

        <table width="100%">
            <tr>
                <td width="100%">
                    <input id="searchBomStr${timestamp}"
                           class="easyui-textbox" type="text" prompt="请输入搜索内容"
                           style="width: 65%;" /> &nbsp; <a href="javascript:void(0)" style="text-align: right;height: 28px;"
                                                            class="easyui-linkbutton" onclick="searchBom${timestamp}();">搜 索 </a>&nbsp;
                    <a href="javascript:void(0)" style="text-align: right;height: 28px;"
                       class="easyui-linkbutton" onclick="batchChooseBom${timestamp}();">批量选择 </a>&nbsp;
                    <table id="bomCode_grid${timestamp}" class="easyui-datagrid"></table>
                </td>
            </tr>
        </table>
    </div>

<script type="text/javascript">

    $(function () {


        $('#bomCode_grid${timestamp}').datagrid({
            onDblClickRow : function(rowIndex,rowData) {
                doubleBomClick${timestamp}(rowData);
            }
        });



    });

    //显示bom窗口
    function layoutBomWin${timestamp}(index) {
        $("#current_bom_index${timestamp}").val(index);

        if($("#bomCode_"+index+"_${timestamp}").val() != ""){
            debugger;
            var bomCodeArr = $("#bomCode_"+index+"_${timestamp}").val().replace(/\s/g,'').split(/[';'|',']/);
            var bomDescArr = $("#bomDesc_"+index+"_${timestamp}").val().split(/[';'|',']/);
            $.each(bomCodeArr,function (i,e) {
                var bomDesc = bomDescArr[i];
                if(bomDesc == undefined || bomDesc == 'undefined' || bomDesc == null){
                    bomDesc = '';
                }
                $("#bomTable${timestamp} tbody").eq(0).append("<tr><td>"+bomCodeArr[i]+"</td><td>"+bomDesc+"</td><td><a href='#' onclick='removeRow${timestamp}(this)'>删除</a></td></tr>");
            });
        }

        $("#bomCodeWin${timestamp}").window('open');
    }

    //bom窗口取消
    function cancleBom${timestamp}(){
        $("#current_bom_index${timestamp}").val("");
        $("#bomTable${timestamp} tbody").html("");
        $("#bomCodeWin${timestamp}").window('close');

    }

    //选择bom编码
    function chooseBom${timestamp}() {
        $("#chooseBomWin${timestamp}").window('open');
        InitBomCodeGrid${timestamp}();
    }

    //初始化bom数据表格
    function InitBomCodeGrid${timestamp}(){
        $("#bomCode_grid${timestamp}").datagrid({
            url: "/flowable/bom/findByPage",
            pagination: true,//允许分页

            singleSelect: false,//只选择一行
            pageSize: 15,//每一页数据数量
            checkOnSelect: true,
            fitColumns:true, //列宽自适应
            height : 420,
            width :'100%',
            pageList: [15,20,30,40,50,60],


            columns: [[
                {field: 'id', checkbox: true,hidden:false},
                {field: "s1partnumber",title: "BOM编码",align: "center",width:'10%'},
                {field: "s1partdescelements",title: "项目描述",align: "center",width:'40%'},
                {field: "s1parttemplate",title: "模板",align: "center",width:'10%'},
                {field: "defaultunitofmeasure", title: "单位", align: "center",width:'8%'},
                {field: "thhxh", title: "图号", align: "center",width:'8%'},
                {field: "prodlineName", title: "所属产品线", align: "center",width:'8%'},
                {field: "s1partstatus", title: "状态", align: "center",width:'10%'},

            ]]
        });
    }

    //双击数据表格
    function doubleBomClick${timestamp}(row) {
        debugger;
        var flag = true;
        $("#bomTable${timestamp} tbody").eq(0).children().each(function () {
            var c = $(this).find("td").eq(0).html();
            if(c == row.s1partnumber){
                flag = false;
            }
        });
        if(flag){
            $("#bomTable${timestamp} tbody").eq(0).append("<tr><td>"+row.s1partnumber+"</td><td>"+row.s1partdescelements+"</td><td><a class='link-color' href='#' onclick='removeRow${timestamp}(this)'>删除</a></td></tr>");
            $("#chooseBomWin${timestamp}").window('close');
        }else{
            $.messager.alert('提示','该编码已经存在，不能重复选择!','info');
        }



    }

    //批量选择bom
    function batchChooseBom${timestamp}() {
        debugger;
        var rows = $('#bomCode_grid${timestamp}').datagrid("getChecked");
        $.each(rows,function (i,row) {
            var flag = true;
            $("#bomTable${timestamp} tbody").eq(0).children().each(function () {
                var c = $(this).find("td").eq(0).html();
                if(c == row.s1partnumber){
                    flag = false;
                }
            });
            if(flag){
                $("#bomTable${timestamp} tbody").eq(0).append("<tr><td>"+row.s1partnumber+"</td><td>"+row.s1partdescelements+"</td><td><a class='link-color' href='#' onclick='removeRow${timestamp}(this)'>删除</a></td></tr>");
                //$("#chooseBomWin${timestamp}").window('close');
            }else{
                //$.messager.alert('提示','该编码已经存在，不能重复选择!','info');
            }
        })
        $("#chooseBomWin${timestamp}").window('close');
    }

    //bom窗口确认
    function confirmBom${timestamp}() {
        var index =  $("#current_bom_index${timestamp}").val();
        var bomCode = "";
        var bomDesc = "";
        var spanBomCode = "";
        var spanBomDesc = "";
        $("#bomTable${timestamp} tbody").eq(0).children().each(function (i,e) {
            debugger;
            if(i==0){
                bomCode = $(this).children().eq(0).text();
                bomDesc = $(this).children().eq(1).text();
                spanBomCode = "<div>"+bomCode+"</div>";
                spanBomDesc = "<div>"+bomDesc+"</div>";
            }else{
                bomCode += (";"+$(this).children().eq(0).text());
                bomDesc += (";"+$(this).children().eq(1).text());
                spanBomCode += "<div>"+$(this).children().eq(0).text()+"</div>";
                spanBomDesc += "<div>"+$(this).children().eq(1).text()+"</div>";
            }
        });

        $("#span_bomCode_"+index+"_${timestamp}").html(spanBomCode);
        $("#span_bomDesc_"+index+"_${timestamp}").html(spanBomDesc);
        $("#bomCode_"+index+"_${timestamp}").val(bomCode);
        $("#bomDesc_"+index+"_${timestamp}").val(bomDesc);
        cancleBom${timestamp}();
    }

    function removeRow${timestamp}(obj) {
        $(obj).parent().parent().remove();
    }

    function searchBom${timestamp}() {
        $("#bomCode_grid${timestamp}").datagrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchBomStr${timestamp}").val()
        });
    }
</script>
</body>
</html>
