<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/6/10
  Time: 5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增产品编码</title>
</head>
<body>
    <div class="toptoolbar" style="position:fixed;">
        <a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true"
           data-options="iconCls:'fa fa-save'"
        >保存退出</a>
        <a href="#" id="copyOld${id_suffix}" onclick="copyOldData${id_suffix}()" class="easyui-linkbutton" plain="true"
           data-options="iconCls:'fa fa-save'"
        >复制到原数据</a>
        <a href="#" id="clearOld${id_suffix}" onclick="clearOldData${id_suffix}()" class="easyui-linkbutton" plain="true"
           data-options="iconCls:'fa fa-save'"
        >清空原数据</a>
    </div>
    <div class="toptoolbarhr" style="margin-top:2%;"></div>
    <form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}' class="easyui-form" data-options="novalidate:true">
        <p style="text-align: center;">
            <span style="font-size: 20px;">产品编码基本信息 </span>
        </p>
<%--        <h2 class="subfild" id="T00000_${id_suffix}" >--%>
<%--            <span>产品编码基本信息</span>--%>
<%--        </h2>--%>
        <br><br><br>
        <div id="SUBFORM_T00000_${id_suffix}">
            <table class="linkeytable" data-sort="sortDisabled">
                <tbody>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">申请人部门</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <select data-options="required:true" editable="false" class="easyui-combobox" id="applyDept${id_suffix}" name="applyDept" style="width: 400px; height: 30px;">
                            <option value="D0001" >研发</option>
                            <option value="D0002" >专业服务部</option>
                            <option value="D0003" >其他</option>
                        </select>
                    </td>
                </tr>
                <tr class="firstRow">
                    <input id="id${id_suffix}" name="id" value="${id}" type="hidden"/>
                    <td width="5%" align="right" style="word-break: break-all;">所属产品线</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'prodlineDesc',required:true" id="prodlineId${id_suffix}" name="prodlineId" class="easyui-combobox" value="" />
                        <input type="hidden" id="prodlineName${id_suffix}" name="prodlineName" value="">
                    </td>
                    <td width="5%" align="right" style="word-break: break-all;">原所属产品线</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'prodlineDesc'" id="oldProdlineId${id_suffix}" name="oldProdlineId" class="easyui-combobox" value="" />
                        <input type="hidden" id="oldProdlineName${id_suffix}" name="oldProdlineName" value="">
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">所属产品族</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'prodName',required:true" id="productId${id_suffix}" name="productId" class="easyui-combobox" value="" />
                        <input type="hidden" id="productName${id_suffix}" name="productName" value="">
                    </td>
                    <td width="5%" align="right" style="word-break: break-all;">原所属产品族</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'prodName'" id="oldProductId${id_suffix}" name="oldProductId" class="easyui-combobox" value="" />
                        <input type="hidden" id="oldProductName${id_suffix}" name="oldProductName" value="">
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">所属PDT</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'content',required:true" id="pdtId${id_suffix}" name="pdtId" class="easyui-combobox" value="" />
                        <input type="hidden" id="pdtName${id_suffix}" name="pdtName" value="">
                    </td>
                    <td width="5%" align="right" style="word-break: break-all;">原所属PDT</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'content'" id="oldPdtId${id_suffix}" name="oldPdtId" class="easyui-combobox" value="" />
                        <input type="hidden" id="oldPdtName${id_suffix}" name="oldPdtName" value="">
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">产品编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;" data-options="required:true" id="productCode${id_suffix}" name="productCode" class="easyui-textbox" value="" />
                    </td>
                    <td width="5%" align="right" style="word-break: break-all;">原产品编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;"  id="oldProductCode${id_suffix}" name="oldProductCode" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">BOM编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
<%--                        <input style="width: 400px; height: 30px;" data-options="required:true" id="bomCode${id_suffix}" name="bomCode" class="easyui-textbox" value="" />--%>
                        <textarea style="width: 400px;height: 70px;"  id="bomCode${id_suffix}" name="bomCode"></textarea>
                    </td>
                    <td width="5%" align="right" style="word-break: break-all;">原BOM编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
<%--                        <input style="width: 400px; height: 30px;"  id="oldBomCode${id_suffix}" name="oldBomCode" class="easyui-textbox" value="" />--%>
                        <textarea style="width: 400px;height: 70px;"  id="oldBomCode${id_suffix}" name="oldBomCode"></textarea>
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">产品中文描述</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;" data-options="required:true" id="productNameCn${id_suffix}" name="productNameCn" class="easyui-textbox" value="" />
                    </td>
                    <td width="5%" align="right" style="word-break: break-all;">原产品中文描述</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;"  id="oldProductNameCn${id_suffix}" name="oldProductNameCn" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">产品英文描述</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;" data-options="required:true" id="productNameEn${id_suffix}" name="productNameEn" class="easyui-textbox" value="" />
                    </td>
                    <td width="5%" align="right" style="word-break: break-all;">原产品英文描述</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;"  id="oldProductNameEn${id_suffix}" name="oldProductNameEn" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">编码生效日期</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;" id="effectDate${id_suffix}" name="effectDate" data-options="formatter:myformatter${id_suffix},parser:myparser${id_suffix},required:true" class="easyui-datebox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">备注</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <input style="width: 400px; height: 30px;" data-options="required:true" id="note${id_suffix}" name="note" class="easyui-textbox" value="" />
                    </td>
                </tr>

                <tr class="firstRow">
                    <td width="5%" align="right" style="word-break: break-all;">编码状态</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">
                        <select data-options="required:true" editable="false" class="easyui-combobox" id="status${id_suffix}" name="status" style="width: 400px; height: 30px;">
                            <option value="1" >新增</option>
                            <option value="2" >编辑</option>
                            <option value="3" >停用</option>
                        </select>
                    </td>
                </tr>

                </tbody>
            </table>
        </div>

<%--        <h2 class="subfild" id="T00001_${id_suffix}" >--%>
<%--            <span>原产品编码基本信息</span>--%>
<%--        </h2>--%>
<%--        <div id="SUBFORM_T00001_${id_suffix}">--%>
<%--            <table class="linkeytable" data-sort="sortDisabled">--%>
<%--                <tbody>--%>
<%--                <tr class="firstRow">--%>
<%--                    <td width="5%" align="right" style="word-break: break-all;">原所属产品线</td>--%>
<%--                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">--%>
<%--                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'prodlineDesc'" id="oldProdlineId${id_suffix}" name="oldProdlineId" class="easyui-combobox" value="" />--%>
<%--                        <input type="hidden" id="oldProdlineName${id_suffix}" name="oldProdlineName" value="">--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr class="firstRow">--%>
<%--                    <td width="5%" align="right" style="word-break: break-all;">原所属产品族</td>--%>
<%--                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">--%>
<%--                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'prodName'" id="oldProductId${id_suffix}" name="oldProductId" class="easyui-combobox" value="" />--%>
<%--                        <input type="hidden" id="oldProductName${id_suffix}" name="oldProductName" value="">--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr class="firstRow">--%>
<%--                    <td width="5%" align="right" style="word-break: break-all;">原所属PDT</td>--%>
<%--                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">--%>
<%--                        <input editable="false" style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'content'" id="oldPdtId${id_suffix}" name="oldPdtId" class="easyui-combobox" value="" />--%>
<%--                        <input type="hidden" id="oldPdtName${id_suffix}" name="oldPdtName" value="">--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr class="firstRow">--%>
<%--                    <td width="5%" align="right" style="word-break: break-all;">原产品编码</td>--%>
<%--                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">--%>
<%--                        <input style="width: 400px; height: 30px;"  id="oldProductCode${id_suffix}" name="oldProductCode" class="easyui-textbox" value="" />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr class="firstRow">--%>
<%--                    <td width="5%" align="right" style="word-break: break-all;">原BOM编码</td>--%>
<%--                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">--%>
<%--                        <input style="width: 400px; height: 30px;"  id="oldBomCode${id_suffix}" name="oldBomCode" class="easyui-textbox" value="" />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr class="firstRow">--%>
<%--                    <td width="5%" align="right" style="word-break: break-all;">原产品中文描述</td>--%>
<%--                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">--%>
<%--                        <input style="width: 400px; height: 30px;"  id="oldProductNameCn${id_suffix}" name="oldProductNameCn" class="easyui-textbox" value="" />--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <tr class="firstRow">--%>
<%--                    <td width="5%" align="right" style="word-break: break-all;">原产品英文描述</td>--%>
<%--                    <td style="word-break: break-all;padding-left:20px;height:30px" width="30%">--%>
<%--                        <input style="width: 400px; height: 30px;"  id="oldProductNameEn${id_suffix}" name="oldProductNameEn" class="easyui-textbox" value="" />--%>
<%--                    </td>--%>
<%--                </tr>--%>

<%--                </tbody>--%>
<%--            </table>--%>
<%--        </div>--%>
        <br><br><br><br><br><br>
    </form>
    <script type="text/javascript" src="common/js/prBelowApply.js"></script>

    <script type="text/javascript">

        $(function () {
            $('#btnQuit${id_suffix}').linkbutton({
                iconCls: 'fa fa-save',
                onClick: postSave${id_suffix}
            });
            debugger;
            var dep = $("#applyDept${id_suffix}").val();

            $.get("/finance/fprodLine/getByDept/"+dep,function (result) {

                debugger;
                $("#prodlineId${id_suffix}").combobox("loadData",result.data);
                $("#oldProdlineId${id_suffix}").combobox("loadData",result.data);
            });

            $.get("/flowable/processConfigItem/getPdtList/"+dep,function (result) {
                $("#pdtId${id_suffix}").combobox("loadData",result.data);
                $("#oldPdtId${id_suffix}").combobox("loadData",result.data);
            });

            if('${IsEdit}'=='true'){
                var s = new Date().getTime();
                $.get('/finance/fproductCode/getById/${id}?_='+s,function (result) {
                    var d = result.data;
                    if(d.prodlineId == 0) d.prodlineId = '';
                    if(d.productId == 0) d.productId = '';
                    if(d.pdtId == 0) d.pdtId = '';
                    if(d.oldProdlineId == 0) d.oldProdlineId = '';
                    if(d.oldProductId == 0) d.oldProductId = '';
                    if(d.oldPdtId == 0) d.oldPdtId = '';
                    $('#linkeyform${id_suffix}').form('load',d);
                });
            }

            //产品线绑定事件
            $("#prodlineId${id_suffix}").combobox({
                onSelect:function (e) {
                    debugger;
                    $("#prodlineName${id_suffix}").val(e.prodlineDesc);
                    $.get("/finance/fprod/getByLineId/"+e.id,function (result) {
                        $("#productId${id_suffix}").combobox("loadData",result.data);
                    });
                }
            });
            $("#oldProdlineId${id_suffix}").combobox({
                onSelect:function (e) {

                    $("#oldProdlineName${id_suffix}").val(e.prodlineDesc);
                    $.get("/finance/fprod/getByLineId/"+e.id,function (result) {
                        $("#oldProductId${id_suffix}").combobox("loadData",result.data);
                    });
                }
            });

            //产品族绑定事件
            $("#productId${id_suffix}").combobox({
                onSelect:function (e) {
                    debugger;
                    $("#productName${id_suffix}").val(e.prodName);
                }
            });
            $("#oldProductId${id_suffix}").combobox({
                onSelect:function (e) {
                    debugger;
                    $("#oldProductName${id_suffix}").val(e.prodName);
                }
            });

            //PDT绑定事件
            $("#pdtId${id_suffix}").combobox({
                onSelect:function (e) {
                    $("#pdtName${id_suffix}").val(e.content);
                }
            });
            $("#oldPdtId${id_suffix}").combobox({
                onSelect:function (e) {
                    $("#oldPdtName${id_suffix}").val(e.content);
                }
            });
            $("#applyDept${id_suffix}").combobox({
                onSelect:function (e) {
                    var dep = e.value;
                    $.get("/finance/fprodLine/getByDept/"+dep,function (result) {

                        $("#prodlineId${id_suffix}").combobox("loadData",result.data);
                        $("#oldProdlineId${id_suffix}").combobox("loadData",result.data);
                    });

                    $.get("/flowable/processConfigItem/getPdtList/"+dep,function (result) {
                        $("#pdtId${id_suffix}").combobox("loadData",result.data);
                        $("#oldPdtId${id_suffix}").combobox("loadData",result.data);
                    });
                }
            });
        });

        //保存方法   直接用jq的click事件easyui低版本不识别无法禁用
        function postSave${id_suffix}(){

            $('#btnQuit${id_suffix}').linkbutton('disable');

            if('${IsEdit}'=='true'){
                url="finance/fproductCode/update";//编辑
            }else{
                url="finance/fproductCode/create";//新增
            }

            $('#linkeyform${id_suffix}').form('submit', {
                url : url,
                onSubmit : function() {
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

        function copyOldData${id_suffix}() {
            $("#oldProdlineId${id_suffix}").combobox("setValue",$("#prodlineId${id_suffix}").combobox("getValue"));
            $("#oldProductId${id_suffix}").combobox("setValue",$("#productId${id_suffix}").combobox("getValue"));
            $("#oldPdtId${id_suffix}").combobox("setValue",$("#pdtId${id_suffix}").combobox("getValue"));
            $("#oldProductCode${id_suffix}").textbox("setValue",$("#productCode${id_suffix}").textbox("getValue"));
            $("#oldBomCode${id_suffix}").textbox("setValue",$("#bomCode${id_suffix}").textbox("getValue"));
            $("#oldProductNameCn${id_suffix}").textbox("setValue",$("#productNameCn${id_suffix}").textbox("getValue"));
            $("#oldProductNameEn${id_suffix}").textbox("setValue",$("#productNameEn${id_suffix}").textbox("getValue"));
        }

        function clearOldData${id_suffix}() {
            $("#oldProdlineId${id_suffix}").combobox("clear");
            $("#oldProductId${id_suffix}").combobox("clear");
            $("#oldPdtId${id_suffix}").combobox("clear");
            $("#oldProductCode${id_suffix}").textbox("clear");
            $("#oldBomCode${id_suffix}").textbox("clear");
            $("#oldProductNameCn${id_suffix}").textbox("clear");
            $("#oldProductNameEn${id_suffix}").textbox("clear");
        }
    </script>
</body>
</html>
