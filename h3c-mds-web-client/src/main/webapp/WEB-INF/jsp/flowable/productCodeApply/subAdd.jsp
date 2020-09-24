<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/5/16
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="/common/css/bds.css?a=1" />
    <link rel="stylesheet" type="text/css" href="/common/css/flowable.css" />
</head>
<body>

<jsp:include page="chooseFile.jsp"/>
<jsp:include page="chooseBom.jsp"/>
<jsp:include page="importProductCode.jsp"/>
<jsp:include page="importBomCode.jsp"/>

    <div style="font-size:16px;width: 100%">
        <table width="98%" style="margin:auto;">
            <tr>
                <td style="font-size: 14px;">
                    <a  href="#" onclick="layoutProductCodeFileWin${timestamp}();">产品编码导入</a>&nbsp;&nbsp;
                    <a  href="excel/新增产品编导入模板.xlsx" >模板下载</a>
                </td>
            </tr>
        </table>

    </div>
    <c:set var="e" value="${applyCount-1}"/>
    <c:forEach begin="0" end="${e}" varStatus="status">
        <div style="font-size:13px;width: 100%" >
            <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                <tr >
                    <input type="hidden" id="hasPdtMgn${timestamp}" value="false"/>
                    <input type="hidden" id="applys[${status.index}].id${timestamp}" name="applys[${status.index}].id"  value="${entity.applys[status.index].id}"/>
                    <td width="3%" align="center" rowspan="4" style="background-color:#ffffff">
                            ${status.index+1}<input type="hidden" id="applys[${status.index}].orderBy${timestamp}" name="applys[${status.index}].orderBy" value="${status.index+1}"/>
                    </td>
                    <td width="26%">产品线名称:&nbsp;&nbsp;&nbsp;
                        <input index="${status.index}" data-options="valueField:'prodlineDesc',textField:'prodlineDesc',width:'68%',required:true" class="easyui-combobox" id="applys[${status.index}].prodline${timestamp}" name="applys[${status.index}].prodline" value="${entity.applys[status.index].prodlineName}"/>
                        <input type="hidden" id="applys[${status.index}].prodlineName${timestamp}" name="applys[${status.index}].prodlineName" value="${entity.applys[status.index].prodlineName}">
                        <input type="hidden" id="applys[${status.index}].prodlineCode${timestamp}"  value="">
                    </td>
                    <td width="26%">产品族名称:&nbsp;&nbsp;&nbsp;
                        <input index="${status.index}" data-options="valueField:'id',textField:'prodName',width:'68%'" class="easyui-combobox" id="applys[${status.index}].product${timestamp}" name="applys[${status.index}].product" value="${entity.applys[status.index].productId == 0 ? entity.applys[status.index].productName :entity.applys[status.index].productName}"/>
                        <input type="hidden" id="applys[${status.index}].productName${timestamp}" name="applys[${status.index}].productName" value="${entity.applys[status.index].productName}">
                    </td>
                    <td width="22%">所属PDT:&nbsp;&nbsp;&nbsp;
                        <input index="${status.index}" data-options="valueField:'id',textField:'content',required:true,width:'68%'" class="easyui-combobox" id="applys[${status.index}].pdtId${timestamp}" name="applys[${status.index}].pdtId" value="${entity.applys[status.index].pdtId == 0 ? "":entity.applys[status.index].pdtId}"/>
                        <input type="hidden" id="applys[${status.index}].pdtName${timestamp}" name="applys[${status.index}].pdtName" value="${entity.applys[status.index].pdtName}">
                    </td>
                    <td width="16%">PDT经理:&nbsp;&nbsp;&nbsp;
                        <span id="span_applys[${status.index}].pdtMng${timestamp}"></span>
                        <input index="${status.index}" id="applys[${status.index}].pdtMng${timestamp}" name="applys[${status.index}].pdtMng" type="hidden"/>
                    </td>

                </tr>
<%--                <tr>--%>


<%--                    <td width="10%" rowspan="7" align="center">${status.index+1}<input type="hidden" id="applys[${status.index}].orderBy${timestamp}" name="applys[${status.index}].orderBy" value="${status.index+1}"/></td>--%>
<%--                    <td width="20%">--%>

<%--                    </td>--%>
<%--                    <td width="20%">--%>

<%--                    </td>--%>
<%--                    <td width="20%">--%>

<%--                    </td>--%>
<%--                    <td width="20%">--%>

<%--                    </td>--%>

<%--                </tr>--%>
                <tr>
                    <td>产品线编码:&nbsp;&nbsp;&nbsp;
                        <input index="${status.index}" editable="true" data-options="valueField:'prodlineNo',textField:'prodlineNo',width:'68%'" class="easyui-combobox" id="applys[${status.index}].prodlineNo${timestamp}" name="applys[${status.index}].prodlineNo" value="${entity.applys[status.index].prodlineNo}"/>
                    </td>
                    <td>产品族编码:&nbsp;&nbsp;&nbsp;
                        <input index="${status.index}" data-options="width:'68%'" class="easyui-textbox" id="applys[${status.index}].productNo${timestamp}" name="applys[${status.index}].productNo" value="${entity.applys[status.index].productNo}"/>
                    </td>
                    <td >产品编码:&nbsp;&nbsp;&nbsp;
                        <input index="${status.index}" data-options="width:'68%'" class="easyui-textbox" id="applys[${status.index}].productCode${timestamp}" name="applys[${status.index}].productCode" value="${entity.applys[status.index].productCode}"/>
                    </td>
                    <td></td>
                </tr>
<%--                <tr>--%>
<%--                    <td>--%>
<%--&lt;%&ndash;                        <span id="span_applys[${status.index}].prodlineNo${timestamp}"></span>&ndash;%&gt;--%>
<%--                        --%>
<%--                    </td>--%>
<%--                    <td>--%>
<%--&lt;%&ndash;                        <span id="span_applys[${status.index}].productNo${timestamp}"></span>&ndash;%&gt;--%>
<%--                        --%>
<%--                    </td>--%>
<%--                    <td colspan="2">--%>
<%--                        --%>
<%--                    </td>--%>
<%--                </tr>--%>
                <tr>
                    <td>产品中文描述:
                        <input data-options="width:'68%'" class="easyui-textbox" id="applys[${status.index}].productNameCn${timestamp}" name="applys[${status.index}].productNameCn" value="${entity.applys[status.index].productNameCn}"/>
                    </td>
                    <td>产品英文描述:
                        <input data-options="width:'68%'" class="easyui-textbox" id="applys[${status.index}].productNameEn${timestamp}" name="applys[${status.index}].productNameEn" value="${entity.applys[status.index].productNameEn}"/>
                    </td>
                    <td >依据材料:&nbsp;&nbsp;&nbsp;
                        <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                        <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>

                        <a href="#">
                            <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}('${status.index}')">
                        </a>
                    </td>
                    <td></td>
                </tr>
<%--                <tr>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td colspan="2">--%>
<%--                        --%>
<%--                    </td>--%>
<%--                </tr>--%>
                <tr>
                    <td>
                        <div style="float: left;">对应的BOM:&nbsp;&nbsp;&nbsp;&nbsp; <a  href="javascript:void(0)" style="text-align: right;height: 24px;"
                                                                                class="easyui-linkbutton" onclick="layoutBomWin${timestamp}('${status.index}');">请选择</a>
<%--                            <button type="button" onclick="layoutBomWin${timestamp}('${status.index}')">&nbsp;&nbsp;&nbsp;</button>--%>
                            <a  href="javascript:void(0)" style="text-align: right;height: 24px;"
                                class="easyui-linkbutton" onclick="exportBom${timestamp}('${status.index}');">导出</a>
                            <a  href="javascript:void(0)" style="text-align: right;height: 24px;"
                                class="easyui-linkbutton" onclick="layoutBomCodeFileWin${timestamp}('${status.index}');">导入</a>
                        </div>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <textarea readonly="true" style="width: 80%;height: 70px;"  id="bomCode_${status.index}_${timestamp}" name="applys[${status.index}].bomCode" value="${entity.applys[status.index].bomCode}">${entity.applys[status.index].bomCode}</textarea>
<%--                        <div style="float: right">--%>
<%--                        <div id="span_bomCode_${status.index}_${timestamp}">--%>
<%--                                <c:set var="bomCodes" value="${fn:split(entity.applys[status.index].bomCode,';')}"/>--%>
<%--                                <c:forEach var="bomCode" items="${bomCodes}">--%>
<%--                                    <div>${bomCode}</div>--%>
<%--                                </c:forEach>--%>
<%--                        </div>--%>
<%--                        <input id="bomCode_${status.index}_${timestamp}" name="applys[${status.index}].bomCode" value="${entity.applys[status.index].bomCode}" type="hidden"/>--%>

<%--                        </div>--%>
                    </td>
                    <td>
                        <div style="float: left">
                            BOM描述:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        </div>

<%--                        <span id="span_bomDesc_${status.index}_${timestamp}">--%>
<%--                                <c:set var="bomDescs" value="${fn:split(entity.applys[status.index].bomDesc,';')}"/>--%>
<%--                                <c:forEach var="bomDesc" items="${bomDescs}">--%>
<%--                                    <div>${bomDesc}</div>--%>
<%--                                </c:forEach>--%>
<%--                        </span>--%>
<%--                        <input id="bomDesc_${status.index}_${timestamp}" name="applys[${status.index}].bomDesc" value="${entity.applys[status.index].bomDesc}" type="hidden"/>--%>
                        <textarea readonly="true" style="width: 80%;height: 70px;"  id="bomDesc_${status.index}_${timestamp}" name="applys[${status.index}].bomDesc" value="${entity.applys[status.index].bomDesc}">${entity.applys[status.index].bomDesc}</textarea>
                    </td>
                    <td >
                        <div style="float: left">
                            备&nbsp;&nbsp;&nbsp;注:&nbsp;&nbsp;&nbsp;&nbsp;
                        </div>

                        <textarea  style="width: 80%;height: 70px;"  id="applys[${status.index}].note" name="applys[${status.index}].note" value="${entity.applys[status.index].note}">${entity.applys[status.index].note}</textarea>
                    </td>
                    <td></td>
                </tr>
<%--                <tr>--%>
<%--                    <td>--%>
<%--&lt;%&ndash;                        <input class="easyui-textbox" data-options="required:true,multiline:true" id="applys[${status.index}].prodlineNo" name="applys[${status.index}].bomCode"/>&ndash;%&gt;--%>
<%--                        --%>
<%--                    </td>--%>
<%--                    <td>--%>
<%--                        --%>
<%--                    </td>--%>
<%--                    <td colspan="2">--%>
<%--                        --%>
<%--                    </td>--%>
<%--                </tr>--%>
            </table>
            <br>
        </div>

    </c:forEach>
    <div >
        <div style="float: left;width: 48%;text-align: right;margin-top:-0.5%;">
            <a href="#" class="easyui-linkbutton" onclick="submit${timestamp}();" id="sub${timestamp}">提交</a>
        </div>
        <div style="margin-left: 52%">
            <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.subSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.submitDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
        </div>

    </div>

    <script type="text/javascript">

        $(function () {
            $.parser.parse($("#subForm111${timestamp}"));
            debugger;
            if("${isImport}" == "true"){
                $("#applyCount${timestamp}").textbox("setValue","${applyCount}");
                $("#input_applyCount${timestamp}").val("${applyCount}");
            }
            var dep = $("#applyDep${timestamp}").val();

            //如果当前为编辑页面，每条数据的产品线名称和编码，来加载产品族
            if("${pageType}"=="edit"){
                //产品族绑定单击事件
                $("[id^=applys][id$=product${timestamp}]").each(function (i) {
                    var index = $(this).attr("index");
                    var prodline = $("#applys\\["+index+"\\]\\.prodline${timestamp}").combobox("getValue");
                    var prodlineNo = $("#applys\\["+index+"\\]\\.prodlineNo${timestamp}").textbox("getValue");
                    $.post("/finance/fprod/getByProdlineNameAndNo/"+prodline+"/"+prodlineNo,function (result) {
                        $("#applys\\["+index+"\\]\\.product${timestamp}").combobox("loadData",result.data);
                    });
                    debugger;
                });

            }
            
            //页面加载完成加载产品线
            $.get("/finance/fprodLine/getDistinctNameByDept/"+dep,function (result) {
                debugger;
                $("[id^=applys][id$=prodline${timestamp}]").combobox("loadData",result.data);
                $("[id^=applys][id$=prodline${timestamp}]").each(function(){
                    var v = $(this).combobox("getValue");
                    if("D0002" == dep || "D0003" == dep){
                        $(this).combobox({editable:true});
                    }else if("D0001" == dep ){
                        $(this).combobox({editable:false});
                    }
                    $(this).combobox("setValue",v);
                });
            });
            <%--$.get("/finance/fprodLine/getByDept/"+dep,function (result) {--%>

            <%--    // var a = new Array();--%>
            <%--    // $.each(result.data,function(i,e){--%>
            <%--    //     a.push({"id":e.id,"text":e.prodlineDesc});--%>
            <%--    // });--%>
            <%--    $("[id^=applys][id$=prodline${timestamp}]").combobox("loadData",result.data);--%>
            <%--    $("[id^=applys][id$=prodline${timestamp}]").each(function(){--%>
            <%--        var v = $(this).combobox("getValue");--%>
            <%--        if("D0002" == dep || "D0003" == dep){--%>
            <%--            $(this).combobox({editable:true});--%>
            <%--        }else if("D0001" == dep ){--%>
            <%--            $(this).combobox({editable:false});--%>
            <%--        }--%>
            <%--        $(this).combobox("setValue",v);--%>
            <%--    });--%>


            <%--});--%>

            $.get("/flowable/processConfigItem/getPdtList/"+dep,function (result) {
                $("[id^=applys][id$=pdtId${timestamp}]").combobox("loadData",result.data);
                $("[id^=applys][id$=pdtId${timestamp}]").each(function(){
                    var v = $(this).combobox("getValue");
                    if("D0002" == dep || "D0003" == dep){
                        $(this).combobox({editable:false});
                    }else if("D0001" == dep ){
                        $(this).combobox({editable:false});
                    }
                    $(this).combobox("setValue",v)
                });

            });

            //产品线绑定事件
            $("[id^=applys][id$=prodline${timestamp}]").combobox({
                onSelect:function (e) {

                    var a = this;
                    $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineName${timestamp}").val(e.prodlineDesc);
                    $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineCode${timestamp}").val(e.prodlineCode);
                    //$("#span_applys\\["+$(a).attr("index")+"\\]\\.prodlineNo${timestamp}").html(e.id);
                    debugger;
                    <%--if(e.prodlineNo != '' && e.prodlineNo != null){--%>
                    <%--    $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineNo${timestamp}").textbox('setValue',e.prodlineNo);--%>
                    <%--}--%>

                    <%--$.get("/finance/fprod/getByLineId/"+e.id,function (result) {--%>
                    <%--    $("#applys\\["+$(a).attr("index")+"\\]\\.product${timestamp}").combobox("loadData",result.data);--%>
                    <%--});--%>
                    $.post("/finance/fprodLine/getByLineDesc/"+e.prodlineDesc,function (result) {
                        $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineNo${timestamp}").combobox('loadData',result.data);
                    });
                },
                onChange:function (n,o) {
                    debugger;
                    var a = this;
                    $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineNo${timestamp}").combobox('clear');
                    if($("#applyDep${timestamp}").val() == "D0001"){
                        var prodlineCode = $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineCode${timestamp}").val();
                        $.post("/flowable/processConfigItem/getByProdlineCodeFromBase?prodlineCode="+prodlineCode,function (result) {
                            //$("[id^=applys][id$=pdtId${timestamp}]").combobox("loadData",result.data);
                            if(result.data.length == 0){
                                $.get("/flowable/processConfigItem/getPdtList/"+$("#applyDep${timestamp}").val(),function (result) {
                                    $("[id^=applys][id$=pdtId${timestamp}]").combobox("loadData",result.data);
                                });
                            }else{
                                $("#applys\\["+$(a).attr("index")+"\\]\\.pdtId${timestamp}").combobox("loadData",result.data);
                            }

                        });
                    }else{
                        $.get("/flowable/processConfigItem/getPdtList/"+$("#applyDep${timestamp}").val(),function (result) {
                            $("[id^=applys][id$=pdtId${timestamp}]").combobox("loadData",result.data);
                        });
                    }

                }
            });
            //产品绑定事件
            $("[id^=applys][id$=product${timestamp}]").combobox({
                onSelect:function (e) {
                    var a = this;
                    $("#applys\\["+$(a).attr("index")+"\\]\\.productName${timestamp}").val(e.prodName);
                    //$("#span_applys\\["+$(a).attr("index")+"\\]\\.productNo${timestamp}").html(e.prodNo);
                    $("#applys\\["+$(a).attr("index")+"\\]\\.productNo${timestamp}").textbox('setValue',e.prodNo);
                }

            });
            //产品线编码绑定事件
            $("[id^=applys][id$=prodlineNo${timestamp}]").combobox({
                onChange:function (e) {
                    var a = this;
                    $("#applys\\["+$(a).attr("index")+"\\]\\.product${timestamp}").combobox("clear");
                    $("#applys\\["+$(a).attr("index")+"\\]\\.productCode${timestamp}").textbox("initValue","");
                    $("#applys\\["+$(a).attr("index")+"\\]\\.productNo${timestamp}").textbox("initValue","");
                }

            });
            //产品族绑定单击事件
            $("[id^=applys][id$=product${timestamp}]").parent().on("click",function (e) {
                var index = $(this).children(":first").attr("index");
                var prodline = $("#applys\\["+index+"\\]\\.prodline${timestamp}").combobox("getValue");
                if(prodline == "" || prodline == undefined){
                    $("#applys\\["+index+"\\]\\.product${timestamp}").combobox("hidePanel");
                    $.messager.alert('提示','请选择产品线！');
                    return;
                }
                debugger;
                var prodlineNo = $("#applys\\["+index+"\\]\\.prodlineNo${timestamp}").textbox("getValue");
                if(prodlineNo == "" || prodlineNo == undefined){
                    $("#applys\\["+index+"\\]\\.product${timestamp}").combobox("hidePanel");
                    $.messager.alert('提示','请选择产品线编码！');
                    return;
                }
                $.post("/finance/fprod/getByProdlineNameAndNo/"+prodline+"/"+prodlineNo,function (result) {
                    $("#applys\\["+index+"\\]\\.product${timestamp}").combobox("loadData",result.data);
                });
                debugger;
            })
            //PDT绑定事件
            $("[id^=applys][id$=pdtId${timestamp}]").combobox({
                onSelect:function (e) {
                    debugger;
                    var a = this;
                    <%--$("#span_applys\\["+$(a).attr("index")+"\\]\\.pdtMng${timestamp}").html(e.pdtMgn);--%>
                    <%--$("#applys\\["+$(a).attr("index")+"\\]\\.pdtMng${timestamp}").val(e.pdtMgn);--%>
                    <%--$("#applys\\["+$(a).attr("index")+"\\]\\.pdtName${timestamp}").val(e.content);--%>
                    if(e.pdtMgn == "" || e.pdtMgn == undefined){
                        $("#hasPdtMgn${timestamp}").val("false");
                        //alert("该PDT没有配置PDT经理，请联系管理员");
                    }else if(e.fprodPerson == "" || e.fprodPerson == undefined){
                        $("#hasPdtMgn${timestamp}").val("false");
                        $.get("/user/getNameDescByAccount/"+e.pdtMgn,function (result) {
                            $("[id^='span_applys\\['][id$='pdtMng${timestamp}']").html(result.data);
                            $("[id^='applys\\['][id$='pdtMng${timestamp}']").val(e.pdtMgn);
                            $("[id^='applys\\['][id$='pdtName${timestamp}']").val(e.content);
                            $("#pdtMgn${timestamp}").val(e.pdtMgn);
                            $("#fprodPerson${timestamp}").val(e.fprodPerson);
                            $("[id^=applys][id$=pdtId${timestamp}]").each(function () {
                                if($(this).prop("id")!=$(a).prop("id")){
                                    $(this).combobox("setValue",e.id);
                                }
                            });
                        });
                        //alert("该PDT没有配置财务接口人，请联系管理员配置！");
                    }else {
                        $("#hasPdtMgn${timestamp}").val("true");
                        $.get("/user/getNameDescByAccount/"+e.pdtMgn,function (result) {
                            $("[id^='span_applys\\['][id$='pdtMng${timestamp}']").html(result.data);
                            $("[id^='applys\\['][id$='pdtMng${timestamp}']").val(e.pdtMgn);
                            $("[id^='applys\\['][id$='pdtName${timestamp}']").val(e.content);
                            $("#pdtMgn${timestamp}").val(e.pdtMgn);
                            $("#fprodPerson${timestamp}").val(e.fprodPerson);
                            $("[id^=applys][id$=pdtId${timestamp}]").each(function () {
                                if($(this).prop("id")!=$(a).prop("id")){
                                    $(this).combobox("setValue",e.id);
                                }
                            });
                        });

                    }

                    //$.get("/finance/fprod/getByLineNo/"+e.id,function (result) {
                    //    $("#applys\\["+$(a).attr("index")+"\\]\\.productNo${timestamp}").combobox("loadData",result.data);
                    //});
                },
                onChange:function (n,o) {
                    debugger;
                    if($("#hasPdtMgn${timestamp}").val()=="false"){
                        $("#hasPdtMgn${timestamp}").val("");
                        //$(this).combobox("setValue",o);
                    }
                }
            });

            $("#baseInfoFile${timestamp}").window({
                onClose:function () {
                    $("#current_file_index${timestamp}").val("");
                    $('#file${timestamp}').filebox("clear");
                }
            });

            $("#bomCodeWin${timestamp}").window({
                onClose:function () {
                    $("#current_bom_index${timestamp}").val("");
                    $("#bomTable${timestamp} tbody").html("");
                }
            });

            //产品线编码绑定事件
            <%--$("[id^=applys][id$=prodlineNo${timestamp}]").textbox({--%>
            <%--    onChange:function (n,o) {--%>
            <%--        debugger;--%>
            <%--        if(n.length != 2){--%>
            <%--            alert("产品线编码长度必须为2位!");--%>
            <%--            $(this).textbox("initValue",o);--%>
            <%--        }--%>
            <%--    }--%>
            <%--});--%>

            //产品线编码绑定事件
            <%--$("[id^=applys][id$=productNo${timestamp}]").textbox({--%>
            <%--    onChange:function (n,o) {--%>
            <%--        debugger;--%>
            <%--        if(n.length != 5){--%>
            <%--            alert("产品族编码长度必须为5位!");--%>
            <%--            $(this).textbox("initValue",o);--%>
            <%--        }else{--%>
            <%--            var lineNo = $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineNo${timestamp}").val();--%>
            <%--            var v = n.substring(0,2);--%>
            <%--            if(v != lineNo){--%>
            <%--                alert("产品族编码前两位必须和产品线编码一致！");--%>
            <%--                $(this).textbox("initValue",o);--%>
            <%--            }--%>
            <%--        }--%>
            <%--    }--%>
            <%--});--%>

            //产品编码绑定事件
            <%--$("[id^=applys][id$=productCode${timestamp}]").textbox({--%>
            <%--    onChange:function (n,o) {--%>
            <%--        debugger;--%>
            <%--        if(n.length != 7){--%>
            <%--            alert("产品编码长度必须为7位!");--%>
            <%--            $(this).textbox("initValue",o);--%>
            <%--        }else{--%>
            <%--            var lineNo = $("#applys\\["+$(this).attr("index")+"\\]\\.productNo${timestamp}").val();--%>
            <%--            var v = n.substring(0,5);--%>
            <%--            if(v != lineNo){--%>
            <%--                alert("产品编码前五位必须和产品族编码一致！");--%>
            <%--                $(this).textbox("initValue",o);--%>
            <%--            }--%>
            <%--        }--%>
            <%--    }--%>
            <%--});--%>

        });

        //下载模板
        function productCodeFileDownload${timestamp}(){

        }
        
        function validataNo${timestamp}() {
            //产品线编码校验
            var isValid = true;

            $("[id^=applys][id$=prodlineNo${timestamp}]").each(function (i) {
                var n = $(this).textbox("getValue");
                if(n.length != 2){
                    alert("第 "+(i+1)+" 条数据，产品线编码长度必须为2位!");
                    isValid = false;
                    return false;
                }
            });
            if(isValid){
                //校验产品族编码
                $("[id^=applys][id$=productNo${timestamp}]").each(function (i) {
                    var n = $(this).textbox("getValue");
                    if(n != "" && n != undefined){
                        if(n.length != 5){
                            alert("第 "+(i+1)+" 条数据，产品族编码长度必须为5位!");
                            isValid = false;
                            return isValid;
                        }else{
                            var lineNo = $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineNo${timestamp}").val();
                            var v = n.substring(0,2);
                            if(v != lineNo){
                                alert("第 "+(i+1)+" 条数据，产品族编码前两位必须和产品线编码一致！");
                                isValid = false;
                                return isValid;
                            }
                        }
                    }

                });
            }
            if(isValid){

                $("[id^=applys][id$=productCode${timestamp}]").each(function (i) {
                    var n = $(this).textbox("getValue");
                    if(n != "" && n != undefined){
                        if(n.length != 7){
                            alert("第 "+(i+1)+" 条数据，产品编码长度必须为7位!");
                            isValid = false;
                            return isValid;
                        }else{
                            var lineNo = $("#applys\\["+$(this).attr("index")+"\\]\\.productNo${timestamp}").val();
                            var v = n.substring(0,5);
                            if(v != lineNo){
                                alert("第 "+(i+1)+" 条数据，产品编码前五位必须和产品族编码一致！");
                                isValid = false;
                                return isValid;
                            }
                        }
                    }

                });
            }
            return isValid;
        }


    </script>

</body>
</html>
