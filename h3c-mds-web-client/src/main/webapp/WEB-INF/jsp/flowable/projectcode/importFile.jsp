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

<div id="projectCodeInfoFile${timestamp}" class="easyui-window" title="上传文件" style="width:400px;height:200px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
     
    <input id="applyNo${timestamp}" type="hidden" value=""/>
    <input id="dept${timestamp}" type="hidden" value=""/>
    <input id="optType${timestamp}" type="hidden" value=""/>
    <form id="projectCodeFileForm${timestamp}" method="post" enctype="multipart/form-data">
        <br><br>
        <table width="100%">
            <tr>
                <td width="88%" align="center">
                    <input id="projectCodeFile${timestamp}" name="file" class="easyui-filebox"  data-options="buttonText:'选择文件',required:true" style="width:300px">
                </td>
            </tr>
            <tr>
                <td align="center">
                    <br>
                    <div >
                        <a href="#" class="easyui-linkbutton" onclick="confirmProjectCodeFile${timestamp}();" id="confirmProjectCodeFile${timestamp}">确认</a>
                        <a href="#" class="easyui-linkbutton" onclick="cancleProjectCodeFile${timestamp}();" id="cancleProjectCodeFile${timestamp}">取消</a>
                    </div>
                </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">
    function layoutProjectCodeFileWin${timestamp}(applyNo, applyDep){
    	$("#applyNo${timestamp}").val(applyNo);
    	$("#dept${timestamp}").val(applyDep);
        $("#projectCodeInfoFile${timestamp}").window('open');
    }

    //文件提示框取消
    function cancleProjectCodeFile${timestamp}(){
        $("#current_file_index${timestamp}").val("");
        $('#projectCodeFile${timestamp}').filebox("clear");
        $("#projectCodeInfoFile${timestamp}").window('close');

    }

    //文件提示框确认
    function confirmProjectCodeFile${timestamp}() {
    	
    	var applyNo = $("#applyNo${timestamp}").val();
    	var applyDept = $("#dept${timestamp}").val();
    	$("#mainUrl").tabs("loading","处理中...");
        $('#projectCodeFileForm${timestamp}').form('submit', {
            url: "/projectWebFlow/importProjectCode?appplyNo=" + applyNo + "&applyDept=" +  applyDept,
            dataType:"json",
            onSubmit: function(){
                var isValid = $(this).form('validate');
                if (!isValid){
                    $("#mainUrl").tabs("loaded");;	// hide progress bar while the form is invalid
                }
                return isValid;	// return false will stop the form submission
            },
            success: function(res){
            	var result = eval("(" + res + ")");
                /* var index = $("#current_file_index${timestamp}").val();
                var data = JSON.parse(str).data;
                $("#fileContent_"+index+"_${timestamp}").html(data.fileName);
                $("#deleteFile_"+index+"_${timestamp}").html("删除");
                $("#profile_"+index+"_${timestamp}").val(data.fileName);
                $("#profileId_"+index+"_${timestamp}").val(data.fileId) */;
                if(result.status == 200){
                $("#subForm111${timestamp}").load("/projectWebFlow/subForm/1", 
                		{"processExtJson":JSON.stringify(result.data),
                			"timestamp": "${timestamp}"},
                        $('#productCodeApply${timestamp}').serializeObject());                	
                }else{
                	alert(result.data);
                }
                $("#mainUrl").tabs("loaded");;
                cancleProjectCodeFile${timestamp}();// hide progress bar while submit successfully
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
