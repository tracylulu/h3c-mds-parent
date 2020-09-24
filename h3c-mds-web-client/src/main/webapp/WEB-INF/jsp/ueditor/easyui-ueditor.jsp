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
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>

</head>
<body>
<div id="ueditorShowWin${timestamp}" class="easyui-window" title="依据材料" style="width:70%;height:630px"
     data-options="iconCls:'icon-save',modal:true,closed:true,minimizable:false,maximizable:false" >
    <div id="ueditorShowDiv${timestamp}" style="font-size: 16px;margin:1%">

    </div>
</div>
<form id="basisMaterialForm${timestamp}" method="post">
<div id="ueditorWin${timestamp}" class="easyui-window" title="依据材料（如上传失败，建议使用Chrome浏览器）" style="width:70%;height:630px"
     data-options="iconCls:'icon-save',modal:true,closed:true,minimizable:false,maximizable:false" >
    <input id="current_ueditor_index${timestamp}" type="hidden" value=""/>

    <br>
    <div style="width: 100%">
        <div id="editor${timestamp}" type="text/plain" style="width:99%;height:450px;margin:auto"></div>
    </div>

    <br><br><br>
    <div id="ueditorBtn${timestamp}" style="position:absolute;background:#ffffff;width:100%;text-align:center;bottom:0;">
        <a href="#" class="easyui-linkbutton" onclick="confirmUeditor${timestamp}();" id="confirmUeditor${timestamp}">确认</a>
        <a href="#" class="easyui-linkbutton" onclick="cancleUeidtor${timestamp}();" id="cancleUeidtor${timestamp}">取消</a>
    </div>
</div>

    <input id="module${timestamp}" name="module" value="${param.module}" type="hidden"/>
    <input id="content${timestamp}" name="content" value="" type="hidden"/>
    <input id="ueditorId${timestamp}" name="id" value="" type="hidden"/>

</form>
<script name="scriptpath" type="text/javascript" charset="utf-8" src="ueditor/ueditor.config.js?v=${timestamp}"></script>
<script type="text/javascript" charset="utf-8" src="ueditor/ueditor.all.js?v=${timestamp}"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="ueditor/lang/zh-cn/zh-cn.js?v=${timestamp}"></script>
<script type="text/javascript">

    var ue;
    $(function () {

        // ue.ready(function() {
        //     //不可编辑
        //     ue.setDisabled();
        // });edui1
        debugger;

        <%--if($("[id='edui1']").length > 0){--%>

        <%--    if("editor${timestamp}" != $("#edui1").parent().prop("id")){--%>
        <%--        $("#edui1").parent().html("");--%>
        <%--         ue = UE.getEditor('editor${timestamp}');--%>
        <%--    }--%>
        <%--    &lt;%&ndash;var parent = $("#edui1").parent().parent();&ndash;%&gt;--%>
        <%--    &lt;%&ndash;parent.html("<div id='editor${timestamp}' type='text/plain' style='width:99%;height:550px;margin:auto'></div>");&ndash;%&gt;--%>
        <%--    &lt;%&ndash;ue = UE.getEditor('editor${timestamp}');&ndash;%&gt;--%>
        <%--}else{--%>
        <%--     ue = UE.getEditor('editor${timestamp}');--%>
        <%--}--%>
        //UE.delEditor("editor");
        <%--if($("[id='edui1']").length > 0){--%>
        <%--    $("#edui1").parent().html("");--%>
        <%--}--%>
        <%--ue = UE.getEditor('editor${timestamp}');--%>

    });

    //根据不同action上传图片和附件
    UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;
    UE.Editor.prototype.getActionUrl = function(action) {
        if (action == 'uploadimage') {
            return '${pageContext.request.contextPath}/flowable/basisMaterial/uploadimage';
        } else if (action == 'uploadfile') {
            return '${pageContext.request.contextPath}/flowable/basisMaterial/uploadfile';
        } else {
            return this._bkGetActionUrl.call(this, action);
        }
    }




    //显示bom窗口
    function layoutUeditorWin${timestamp}(index) {
        debugger;
        if($("[id='edui1']").length > 0){
            //UE.delEditor("editor${timestamp}");
            var parent = $("#edui1").parent();
            <%--if(parent.prop("id") != "editor${timestamp}"){--%>
            <%--    UE.delEditor(parent.prop("id"));--%>
            <%--    ue = UE.getEditor('editor${timestamp}');--%>
            <%--}--%>
            var html = parent.html();

            //$("#editor${timestamp}").html(html);
            //ue = UE.getEditor('editor${timestamp}');
            if(parent.prop("id") != "editor${timestamp}"){
                //UE.delEditor(parent.prop("id"));
                parent.html("");
                ue = UE.getEditor('editor${timestamp}');
            }
        }else{
            UE.delEditor('editor${timestamp}');
            ue = UE.getEditor('editor${timestamp}');
        }

        var basisMaterialId = $("#${param.field}_"+index+"_${timestamp}").val();
        if(basisMaterialId == "" || basisMaterialId == undefined){
            if($("#current_ueditor_index${timestamp}").val() != index){
                debugger;
                ue.ready(function () {
                    ue.setContent("");
                });

            }
            $("#current_ueditor_index${timestamp}").val(index);
            $("#ueditorWin${timestamp}:last").window('open');
        }else{
            $("#current_ueditor_index${timestamp}").val(index);
            $.post("/flowable/basisMaterial/getById/"+basisMaterialId,function (result) {
                debugger;
                if(result.data != null && result.data != undefined && result.data.content != undefined && result.data.content != ""){
                    var c = result.data.content;
                    ue.ready(function () {
                        ue.setContent(c);
                    });
                }else{
                    ue.ready(function () {
                        ue.setContent("");
                    });
                }

                //ue.setContent(result.data.content);
                $("#ueditorWin${timestamp}:last").window('open');
            });
        }



    }

    //bom窗口取消
    function cancleUeidtor${timestamp}(){
        $("#current_ueditor_index${timestamp}").val("");

        $("#ueditorWin${timestamp}").window('close');

    }


    //bom窗口确认
    function confirmUeditor${timestamp}() {
        debugger;
        var content = UE.getEditor('editor${timestamp}').getContent();
        $("#content${timestamp}").val(content);
        var index = $("#current_ueditor_index${timestamp}").val();
        var basisMaterialId = $("#${param.field}_"+index+"_${timestamp}").val();
        $("#ueditorId${timestamp}").val(basisMaterialId);
        basisMaterialForm${timestamp}()
    }


    //提交依据材料富文本
    function basisMaterialForm${timestamp}(){

        $("#mainUrl").tabs("loading","处理中...");
        $('#basisMaterialForm${timestamp}').form('submit', {

            url: '/flowable/basisMaterial/save',
            onSubmit: function(){
                //checkSubForm${timestamp}();
                <%--var isValid = $(this).form('validate');--%>
                <%--if(isValid){--%>
                <%--    $("input[id^='basisMaterial_'][id$='_${timestamp}']").each(function () {--%>
                <%--        if($(this).val() != ""){--%>
                <%--            $.messager.alert("提示","保存草稿不能上传附件!");--%>
                <%--            isValid = false;--%>
                <%--            return false;--%>
                <%--        }--%>
                <%--    });--%>
                <%--}--%>
                <%--if (!isValid){--%>
                <%--    $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid--%>
                <%--}--%>
                return true;	// return false will stop the form submission
            },
            success: function(result){
                debugger;
                var obj = $.parseJSON(result);
                if(obj.status==200){
                   var index = $("#current_ueditor_index${timestamp}").val();
                   //$("#basisMaterial_"+index+"_${timestamp}").val(obj.data);
                   $("#${param.field}_"+index+"_${timestamp}").val(obj.data);
                }else{
                    alert(obj.message);
                }
                cancleUeidtor${timestamp}();
                $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully
            }
        });
    }
    
    function showUeditorContent${timestamp}(index) {
        debugger;
        var basisMaterialId = $("#${param.field}_"+index+"_${timestamp}").val();
        if(basisMaterialId == "" || basisMaterialId == undefined){
            $("#ueditorShowWin${timestamp}").window('open');
        }else{
            $.post("/flowable/basisMaterial/getById/"+basisMaterialId,function (result) {
                if(result.data != null && result.data != undefined && result.data.content != undefined && result.data.content != ""){
                    $("#ueditorShowDiv${timestamp}").html(result.data.content);
                }else{
                    $("#ueditorShowDiv${timestamp}").html("");
                }

                $("#ueditorShowWin${timestamp}").window('open');
            });
        }

    }
</script>
</body>
</html>
