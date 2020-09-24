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

<div id="baseInfoFile${timestamp}" class="easyui-window" title="上传文件" style="width:400px;height:200px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_file_index${timestamp}" type="hidden" value=""/>
    <form id="baseInfoFileForm${timestamp}" method="post" enctype="multipart/form-data">
        <br><br>
        <table width="100%">
            <tr>
                <td width="88%" align="center">
                    <input id="file${timestamp}" name="file" class="easyui-filebox"  data-options="buttonText:'选择文件',required:true" style="width:300px">
                </td>
            </tr>
            <tr>
                <td align="center">
                    <br>
                    <div >
                        <a href="#" class="easyui-linkbutton" onclick="confirmFile${timestamp}();" id="confirmFile${timestamp}">确认</a>
                        <a href="#" class="easyui-linkbutton" onclick="cancleFile${timestamp}();" id="cancleFile${timestamp}">取消</a>
                    </div>
                </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">
    function layoutFileWin${timestamp}(index){
        $("#current_file_index${timestamp}").val(index);
        $("#baseInfoFile${timestamp}").window('open');
    }

    //文件提示框取消
    function cancleFile${timestamp}(){
        $("#current_file_index${timestamp}").val("");
        $('#file${timestamp}').filebox("clear");
        $("#baseInfoFile${timestamp}").window('close');

    }

    //文件提示框确认
    function confirmFile${timestamp}() {
    	$("#mainUrl").tabs("loading","处理中...")
        $('#baseInfoFileForm${timestamp}').form('submit', {
            url: "/flowable/file/uploadFile",
            onSubmit: function(){
                var isValid = $(this).form('validate');
                if (!isValid){
                   $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid
                }
                return isValid;	// return false will stop the form submission
            },
            success: function(str){
                var index = $("#current_file_index${timestamp}").val();
                var data = JSON.parse(str).data;
                $("#fileContent_"+index+"_${timestamp}").html(data.fileName);
                $("#deleteFile_"+index+"_${timestamp}").html("删除");
                $("#profile_"+index+"_${timestamp}").val(data.fileName);
                $("#profileId_"+index+"_${timestamp}").val(data.fileId);
                $("#mainUrl").tabs("loaded");
                cancleFile${timestamp}();// hide progress bar while submit successfully
            }
        });

    }

    //删除文件
    function deleteFile${timestamp}(index){
        var fileId = $("#profileId_"+index+"_${timestamp}").val();
        $.post("/flowable/file/deleteFile",{"fileId":fileId},function (result) {
            if(result.status==200){
                $("#fileContent_"+index+"_${timestamp}").html("");
                $("#deleteFile_"+index+"_${timestamp}").html("");
                $("#profile_"+index+"_${timestamp}").val("");
                $("#profileId_"+index+"_${timestamp}").val("");
            }else{
                alert(result.message);
            }
        });
    }

    function downloadFile${timestamp}(index) {
        var fileName = $("#profile_"+index+"_${timestamp}").val()
        var fileId = $("#profileId_"+index+"_${timestamp}").val()
        window.open("/flowable/file/downloadFile?fileId="+fileId+"&fileName="+encodeURIComponent(fileName));
    }
</script>
</body>
</html>
