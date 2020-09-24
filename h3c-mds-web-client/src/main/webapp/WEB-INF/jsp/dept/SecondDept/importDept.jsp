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

<div id="deptFile${id_suffix}" class="easyui-window" title="上传文件" style="width:400px;height:200px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_dept_file_index${id_suffix}" type="hidden" value=""/>
    <form></form>
    <form id="deptFileForm${id_suffix}" method="post" enctype="multipart/form-data">
        <br><br>

        <table width="100%">

            <tr>
                <td width="88%" align="center">
                    <span style="color: #c9302c">请使用本页面导出信息作为模板上传 ,只能上传后缀名为 xls，xlsx 的文件</span>
                    <input  id="file${id_suffix}" name="file" class="easyui-filebox"  data-options="buttonText:'选择文件',required:true" style="width:300px">
                </td>
            </tr>
            <tr>
                <td align="center">
                    <br>
                    <div >
                        <a href="#" class="easyui-linkbutton" onclick="confirmDeptFile${id_suffix}();" id="confirmBomCodeFile${id_suffix}">确认</a>
                        <a href="#" class="easyui-linkbutton" onclick="cancleDeptFile${id_suffix}();" id="cancleBomCodeFile${id_suffix}">取消</a>
                    </div>
                </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">

    //弹窗文件上传窗口
    function layoutFileWin${id_suffix}(){      
      
        $("#deptFile${id_suffix}").window('open');
    }

    //文件提示框取消
    function cancleDeptFile${id_suffix}(){      
        $('#file${id_suffix}').filebox("clear");
        $("#deptFile${id_suffix}").window('close');

    }

    //文件提示框确认
    function confirmDeptFile${id_suffix}() {
        debugger;
        //$.messager.progress();	// display the progress bar
        $('#deptFileForm${id_suffix}').form('submit', {
            url: "/dept/${level}/importDept",
            onSubmit: function(){
                var isValid = $(this).form('validate');
                if(isValid){
                    debugger;
                    var v = $("#file${id_suffix}").textbox("getText");
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
                if($.parseJSON(str).status == 200){                   
                	cancleDeptFile${id_suffix}();
                	 $.messager.alert({title:"提示",msg:$.parseJSON(str).message,icon:"",width:300});
                	 //alert(${level});
                	 if('${level}'=='1'){
                		$("#dg${id_suffix}").datagrid("reload");
                	}else{
                		$("#btn_query${id_suffix}").click()
                	}
                	
                }else{
                    $.messager.alert({title:"提示",msg:$.parseJSON(str).message,icon:"error",width:550});
                    //alert($.parseJSON(str).message);
                }

            }
        });

    }

</script>
</body>
</html>
