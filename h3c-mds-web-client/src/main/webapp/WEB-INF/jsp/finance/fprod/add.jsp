<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/6/10
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增产品族</title>
</head>
<body>
<div class="toptoolbar" style="position:fixed;">
    <a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true"
       data-options="iconCls:'fa fa-save'"
    >保存退出</a>
</div>
<div class="toptoolbarhr" style="margin-top:2%;"></div>
<form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}' >
    <p style="text-align: center;">
        <span style="font-size: 20px;">产品族基本信息 </span>
    </p>
    <h2 class="subfild" id="T00000_${id_suffix}" >
        <span>产品族基本信息</span>
    </h2>
    <div id="SUBFORM_T00000_${id_suffix}">
        <table class="linkeytable" data-sort="sortDisabled">
            <tbody>
            <tr class="firstRow">
                <input id="id${id_suffix}" name="id" value="${id}" type="hidden"/>
                <td width="15%" align="right" style="word-break: break-all;">所属产品线</td>
                <td style="word-break: break-all;padding-left:20px;height:30px" width="85%">
                    <input style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'text',required:true" id="prodlineId${id_suffix}" name="prodlineId" class="easyui-combobox" value="" />
                </td>
            </tr>

            <tr class="firstRow">
                <td width="15%" align="right" style="word-break: break-all;">产品族编码</td>
                <td style="word-break: break-all;padding-left:20px;height:30px" width="85%">
                    <input style="width: 400px; height: 30px;" data-options="required:true" id="prodNo${id_suffix}" name="prodNo" class="easyui-textbox" value="" />
                </td>
            </tr>
            <tr class="firstRow">
                <td width="15%" align="right" style="word-break: break-all;">产品族名称</td>
                <td style="word-break: break-all;padding-left:20px;height:30px" width="85%">
                    <input style="width: 400px; height: 30px;" data-options="required:true" id="prodName${id_suffix}" name="prodName" class="easyui-textbox" value="" />
                </td>
            </tr>


            </tbody>
        </table>
    </div>

</form>


<script type="text/javascript">

    $(function () {
        $('#btnQuit${id_suffix}').linkbutton({
            iconCls: 'fa fa-save',
            onClick: postSave${id_suffix}
        });

        $.get("/finance/fprodLine/getByName",function (result) {
            debugger;
            var a = new Array();
            $.each(result.data,function(i,e){
                a.push({"id":e.id,"text":e.prodlineDesc});
            });
            $("#prodlineId${id_suffix}").combobox("loadData",a);
        });

        $.get("/flowable/processConfigItem/getByConfigCode/processPDT",function (result) {
            $("#pdtNo${id_suffix}").combobox("loadData",result.data);
        });

        if('${IsEdit}'=='true'){
            $.get('/finance/fprod/getByCode/${code}?_='+new Date().getTime(),function (result) {
                $('#linkeyform${id_suffix}').form('load',result.data);
            });
        }
    });

    //保存方法   直接用jq的click事件easyui低版本不识别无法禁用
    function postSave${id_suffix}(){
        debugger;
        $('#btnQuit${id_suffix}').linkbutton('disable');

        if('${IsEdit}'=='true'){
            url="finance/fprod/update";//编辑
        }else{
            url="finance/fprod/create";//新增
        }

        $('#linkeyform${id_suffix}').form('submit', {
            url : url,
            onSubmit : function() {
                debugger;
                var flag = $(this).form('enableValidation').form('validate');
                if(!flag){
                    $('#btnQuit${id_suffix}').linkbutton('enable');
                }
                return flag;
            },
            success : function(data) {
                var obj = $.parseJSON( data );
                //跳转查询页面
                //{"success:true,msg:xxx"}
                //{"success:false,msg:xxx"}
                //eval("var obj = " + data)

                if(obj.status == 200){
                    var tab = $('#mainUrl').tabs('getSelected');
                    var index = $('#mainUrl').tabs('getTabIndex', tab);
                    //$('#btnQuit${id_suffix}').linkbutton('enable');
                    $("#mainUrl").tabs("close", index)
                } else {
                    alert(obj.msg);
                    $('#btnQuit${id_suffix}').linkbutton('enable');
                }
            }
        });
    }

    function myformatter${id_suffix}(date){
        var y = date.getFullYear();
        var m = date.getMonth()+1;
        var d = date.getDate();
        return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
    }
    function myparser${id_suffix}(s){
        if (!s) return new Date();
        var ss = (s.split('-'));
        var y = parseInt(ss[0],10);
        var m = parseInt(ss[1],10);
        var d = parseInt(ss[2],10);
        if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
            return new Date(y,m-1,d);
        } else {
            return new Date();
        }
    }
</script>
</body>
</html>
