<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/5/31
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="bomCodeFile${timestamp}" class="easyui-window" title="上传文件" style="width:400px;height:200px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_bom_file_index${timestamp}" type="hidden" value=""/>
    <form></form>
    <form id="bomCodeFileForm${timestamp}" method="post" enctype="multipart/form-data">
        <br><br>

        <table width="100%">

            <tr>
                <td width="88%" align="center">
                    <span style="color: #c9302c">只能上传后缀名为 xls，xlsx 的文件</span>
                    <input  id="bomFile${timestamp}" name="file" class="easyui-filebox"  data-options="buttonText:'选择文件',required:true" style="width:300px">
                </td>
            </tr>
            <tr>
                <td align="center">
                    <br>
                    <div >
                        <a href="#" class="easyui-linkbutton" onclick="confirmBomCodeFile${timestamp}();" id="confirmBomCodeFile${timestamp}">确认</a>
                        <a href="#" class="easyui-linkbutton" onclick="cancleBomCodeFile${timestamp}();" id="cancleBomCodeFile${timestamp}">取消</a>
                    </div>
                </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">

    //弹窗文件上传窗口
    function layoutBomCodeFileWin${timestamp}(index){
        debugger;
        $("#current_bom_file_index${timestamp}").val(index);
        $("#bomCodeFile${timestamp}").window('open');
    }

    //文件提示框取消
    function cancleBomCodeFile${timestamp}(){
        $("#current_file_index${timestamp}").val("");
        $('#bomFile${timestamp}').filebox("clear");
        $("#bomCodeFile${timestamp}").window('close');

    }

    //文件提示框确认
    function confirmBomCodeFile${timestamp}() {
        debugger;
        //$.messager.progress();	// display the progress bar
        $('#bomCodeFileForm${timestamp}').form('submit', {
            url: "/flowable/productCodeApply/importBomCode",
            onSubmit: function(){
                var isValid = $(this).form('validate');
                if(isValid){
                    debugger;
                    var v = $("#bomFile${timestamp}").textbox("getText");
                    var last = v.lastIndexOf(".");
                    var prefix = v.substring(last+1,v.length);
                    if(prefix == "xls" || prefix == "xlsx"){
                        isValid = true;
                    }else{
                        isValid = false;
                        alert("文件格式有误，请上传正确的文件！");
                    }
                }
                return isValid;	// return false will stop the form submission
            },
            success: function(str){
                debugger;
                var index =  $("#current_bom_file_index${timestamp}").val();
                var bomCode = "";
                var bomDesc = "";
                var spanBomCode = "";
                var spanBomDesc = "";
                if($.parseJSON(str).status == 200){
                    var boms = $.parseJSON(str).data;
                    $.each(boms,function (i,e) {
                        var bom = this;
                        debugger;
                        if(i==0){
                            bomCode = bom.bomCode;
                            bomDesc = bom.bomDesc;
                            spanBomCode = "<div>"+bomCode+"</div>";
                            spanBomDesc = "<div>"+bomDesc+"</div>";
                        }else{
                            bomCode += (";"+bom.bomCode);
                            bomDesc += (";"+bom.bomDesc);
                            spanBomCode += "<div>"+bom.bomCode+"</div>";
                            spanBomDesc += "<div>"+bom.bomDesc+"</div>";
                        }
                    });
                    $("#span_bomCode_"+index+"_${timestamp}").html(spanBomCode);
                    $("#span_bomDesc_"+index+"_${timestamp}").html(spanBomDesc);
                    $("#bomCode_"+index+"_${timestamp}").val(bomCode);
                    $("#bomDesc_"+index+"_${timestamp}").val(bomDesc);
                    cancleBomCodeFile${timestamp}();
                }else{
                    $.messager.alert({title:"错误",msg:$.parseJSON(str).message,icon:"error",width:550});
                    //alert($.parseJSON(str).message);
                }

            }
        });

    }

    //导出bom编码
    function exportBom${timestamp}(index) {
        var bomCodeValue = $("#bomCode_"+index+"_${timestamp}").val();
        $("#bomCodeValue${timestamp}").val(bomCodeValue);
        $("#bomCodeForm${timestamp}").submit();
    }


</script>
</body>
</html>
