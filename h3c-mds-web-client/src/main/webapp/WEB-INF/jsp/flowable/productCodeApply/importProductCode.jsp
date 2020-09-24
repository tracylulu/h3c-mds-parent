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

<div id="productCodeFile${timestamp}" class="easyui-window" title="上传文件" style="width:400px;height:200px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_file_index_aaa${timestamp}" type="hidden" value=""/>
    <form></form>
    <form id="productCodeFileForm${timestamp}" method="post" enctype="multipart/form-data">
        <br><br>
        <input id="fileApplyCode${timestamp}" name="fileApplyCode" value="" type="hidden">
        <input id="fileApplyDept${timestamp}" name="fileApplyDept" value="" type="hidden">
        <input id="fileTimeStamp${timestamp}" name="timestamp" value="${timestamp}" type="hidden">
        <table width="100%">
            <tr>
                <td width="88%" align="center">
                    <span style="color: #c9302c">只能上传后缀名为 xls，xlsx 的文件</span>
                    <input  id="productFile${timestamp}" name="file" class="easyui-filebox"  data-options="buttonText:'选择文件',required:true" style="width:300px">
                </td>
            </tr>
            <tr>
                <td align="center">
                    <br>
                    <div >
                        <a href="#" class="easyui-linkbutton" onclick="confirmProductCodeFile${timestamp}();" id="confirmProductCodeFile${timestamp}">确认</a>
                        <a href="#" class="easyui-linkbutton" onclick="cancleProductCodeFile${timestamp}();" id="cancleProductCodeFile${timestamp}">取消</a>
                    </div>
                </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">


    function layoutProductCodeFileWin${timestamp}(){

        $("#fileApplyCode${timestamp}").val($("#applyCode${timestamp}").val());
        $("#fileApplyDept${timestamp}").val($("#applyDep${timestamp}").val());
        $("#productCodeFile${timestamp}").window('open');
    }

    //文件提示框取消
    function cancleProductCodeFile${timestamp}(){
        $("#current_file_index${timestamp}").val("");
        $('#productFile${timestamp}').filebox("clear");
        $("#productCodeFile${timestamp}").window('close');

    }

    //文件提示框确认
    function confirmProductCodeFile${timestamp}() {
        debugger;
        //$.messager.progress();	// display the progress bar
        $('#productCodeFileForm${timestamp}').form('submit', {
            url: "/flowable/productCodeApply/uploadFile",
            onSubmit: function(){
                var isValid = $(this).form('validate');
                if(isValid){
                    debugger;
                    var v = $("#productFile${timestamp}").textbox("getText");
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
                $("#subForm111${timestamp}").html(str);
                $("#subForm111${timestamp}").append("<link rel=\"stylesheet\" type=\"text/css\" href=\"/common/css/bds.css\" />");
                //$.parser.parse($("#subForm111${timestamp}"));
                <%--if(JSON.parse(str).status == 200){--%>
                <%--    var index = $("#current_file_index${timestamp}").val();--%>
                <%--    var data = JSON.parse(str).data;--%>
                <%--    &lt;%&ndash;$("#subForm111${timestamp}").load("/flowable/productCodeApply/subFormJson/Add",&ndash;%&gt;--%>
                <%--    &lt;%&ndash;    JSON.parse(str).data);&ndash;%&gt;--%>
                <%--   --%>
                <%--}else{--%>
                <%--    alert(JSON.parse(str).msg);--%>
                <%--}--%>

                //$.messager.progress('close');
                cancleProductCodeFile${timestamp}();// hide progress bar while submit successfully
            }
        });

    }




</script>
</body>
</html>
