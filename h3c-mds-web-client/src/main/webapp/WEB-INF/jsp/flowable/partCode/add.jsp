<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/5/14
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>创建产品编码申请</title>
</head>
<body>

<div class="toptoolbar" style="position:fixed;">
    <c:if test="${currentNode=='userTask1' && isHandler || currentNode == 'editable'}">
        <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="save${timestamp}()"
           data-options="iconCls:'fa fa-save'"
        >保存</a>
    </c:if>

    <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="changeMenue${timestamp}('fold')"
       data-options="iconCls:'fa fa-minus'"
    >折叠</a>
    <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="changeMenue${timestamp}('expand')"
       data-options="iconCls:'fa fa-plus'"
    >展开</a>
    <c:if test="${entity.status == null}">
        <a href="#" id="btnCopy${timestamp}" class="easyui-linkbutton" plain="true" onclick="copyLink('/flowable/partCodeProcess/edit/${entity.id}','Part编码申请','','新增part')"
           data-options="iconCls:'fa fa-files-o'">复制链接</a>
    </c:if>
    <c:if test="${entity.status != null}">
        <a href="#" id="btnCopy${timestamp}" class="easyui-linkbutton" plain="true" onclick="copyLink('/flowable/partCodeProcess/edit/${entity.id}','Part编码申请','${entity.id}','新增part')"
           data-options="iconCls:'fa fa-files-o'">复制链接</a>
    </c:if>

<%--    <c:if test="${entity.status == '0' || entity.status == '-1'}">--%>
<%--        <a href="#" id="btnDel${timestamp}" class="easyui-linkbutton" plain="true" onclick="deleteProcess${timestamp}()" data-options="iconCls:'fa fa-files-o'">删除</a>--%>
<%--    </c:if>--%>
</div>
<div class="toptoolbarhr" style="margin-top:2%;"></div>
<form method='post' name='productCodeApply${timestamp}' id='productCodeApply${timestamp}' >
    <p style="text-align: center;">
        <span style="font-size: 20px;">Part编码申请表 </span>
    </p>
    <input id="id${timestamp}" name="id" value="${entity.id}" type="hidden"/>
    <input id="instanseId${instanseId}" name="instanseId" value="${entity.instanseId}" type="hidden"/>
    <input id="timestamp${timestamp}" name="timestamp" value="${timestamp}" type="hidden"/>
    <input type="hidden" id="hasPdtMgn${timestamp}" value="false"/>
    <input type="hidden" id="changePdt${timestamp}" value="false">
    <div >
            <span style="font-size:15px">&nbsp;&nbsp;&nbsp;申请编号：<input type="hidden" id="applyCode${timestamp}" name="applyCode" value="${entity.applyCode}"/><span style="color:#FF83FA">${entity.applyCode}</span> &nbsp;&nbsp;
                当前状态：<span style="color:#3A5FCD">${entity.statusDesc}</span>  &nbsp;&nbsp;
                当前处理者：<span style="color:#3A5FCD"><ibds:userAccount account="${entity.handler}"/></span>  &nbsp;&nbsp;
<%--                系统修改反馈：<span style="color:#3A5FCD">XXX</span>--%>
            </span>
    </div>
    <br>

    <h2 class="subfild" id="T00000-1-${timestamp}" >
        <span>本栏目由申请者填写</span>
    </h2>
    <div id="SUBFORM_T00000-1-${timestamp}">
        <div style="font-size:13px;width: 98%;margin:auto">
            <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                <c:choose>
                    <c:when test="${currentNode=='usertask1' && isHandler || currentNode == 'editable'}">
                        <tr>
                            <td width="20%">&nbsp;&nbsp;PDM申请单号：&nbsp;</td>
                            <td width="30%">
                                <input data-options="required:true,readonly:true" class="easyui-textbox" id="pdmApplyCode${timestamp}" name="pdmApplyCode" value="${entity.pdmApplyCode}"/>
                            </td>
                            <td width="20%">&nbsp;&nbsp;部门分类：&nbsp;</td>
                            <td width="30%">
                                <select data-options="required:true" editable="false" class="easyui-combobox" id="deptType${timestamp}" name="deptType" style="width:30%;">
                                    <option value="D0001" ${entity.applyDept=='D0001'?"selected":""}>研发</option>
                                    <option value="D0002" ${entity.applyDept=='D0002'?"selected":""}>专业服务部</option>
                                    <option value="D0003" ${entity.applyDept=='D0003'?"selected":""}>其他</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td >&nbsp;&nbsp;申请人：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td >
                                <input data-options="required:true,readonly:true" class="easyui-textbox" id="applyPerson${timestamp}" name="applyPerson" value="${entity.applyPerson}"/>
                            </td>
                            <td >&nbsp;&nbsp;部门：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td >
                                <input data-options="required:true" class="easyui-textbox" id="applyDept${timestamp}" name="applyDept" value="${entity.applyDept}"/>
                            </td>
                        </tr>
                        <tr>
                            <td >&nbsp;&nbsp;联系电话：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td >
                                <input data-options="required:true" class="easyui-textbox" id="tel${timestamp}" name="tel" value="${entity.tel}"/>
                            </td>
                            <td ></td>
                            <td ></td>
                        </tr>
                        <tr>
                            <td >&nbsp;&nbsp;PDT：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td >
                                <input editable="false" data-options="valueField:'id',textField:'content',required:true" class="easyui-combobox" id="pdtId${timestamp}" name="pdtId" value="${entity.pdtId}"/>
                            </td>
                            <td >&nbsp;&nbsp;PDT经理：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td >
                                <span id="span_pdtMgn${timestamp}"></span>
                                <input id="pdtMgn${timestamp}" name="pdtMgn" value="${entity.pdtMgn}" type="hidden">
                            </td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <tr>
                            <td width="20%">&nbsp;&nbsp;PDM申请单号：
                            </td>
                            <td width="30%">
                                &nbsp;&nbsp;${entity.pdmApplyCode}
                            </td>
                            <td width="20%">&nbsp;&nbsp;部门分类：&nbsp;
                            </td>
                            <td width="30%">
                                &nbsp;&nbsp;${entity.deptType=='D0001'?"研发":entity.deptType=='D0002'?"专业服务部":entity.deptType=='D0003'?"其他":""}
                            </td>
                        </tr>
                        <tr>
                            <td >&nbsp;&nbsp;申请人：&nbsp;&nbsp;&nbsp;&nbsp;
                            </td>
                            <td >
                                &nbsp;&nbsp;${entity.applyPerson}
                            </td>
                            <td >&nbsp;&nbsp;部门：&nbsp;&nbsp;&nbsp;&nbsp;
                            </td>
                            <td >
                                &nbsp;&nbsp;${entity.applyDept}
                            </td>
                        </tr>
                        <tr>
                            <td >&nbsp;&nbsp;联系电话：&nbsp;&nbsp;&nbsp;&nbsp;
                            </td>
                            <td >
                                &nbsp;&nbsp;${entity.tel}
                            </td>
                            <td ></td>
                            <td ></td>
                        </tr>
                        <tr>
                            <td >&nbsp;&nbsp;PDT：&nbsp;&nbsp;&nbsp;&nbsp;
                            </td>
                            <td >&nbsp;&nbsp;
                                ${entity.pdtName}
                            </td>
                            <td >&nbsp;&nbsp;PDT经理：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td >
                                &nbsp;&nbsp;<ibds:userAccount account="${entity.pdtMgn}"/>
                            </td>
                        </tr>
                    </c:otherwise>
                </c:choose>

            </table>
        </div>


        <br>


        <c:choose>
            <c:when test="${currentNode=='usertask1' && isHandler || currentNode == 'editable'}">
                <div id="subForm111${timestamp}"  >
                    <jsp:include page="subAdd.jsp"/>
                </div>
            </c:when>
            <c:otherwise>
                <jsp:include page="subView.jsp"/>
            </c:otherwise>
        </c:choose>


        <div>
            <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.subSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.submitDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
        </div>
        <hr>
        <br>
    </div>
</form>


<h2 class="subfild" id="T00000-3-${timestamp}"  >
    <span>PDT经理填写</span>
</h2>
<div id="SUBFORM_T00000-3-${timestamp}">
    <c:choose>
        <c:when test="${currentNode=='usertask2' && isHandler}">
            <div>
                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：
                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="pdtOpinion${timestamp}" name="pdtOpinion" value="${entity.pdtOpinion}"/>
                        </span>
            </div>
            <div style="text-align: center">
                <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','pdt')">同意</a>
                &nbsp;&nbsp;&nbsp;
                <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','pdt')">不同意</a>
            </div>
        </c:when>
        <c:otherwise>
            <div>
                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.pdtOpinion}</span>
            </div>
        </c:otherwise>
    </c:choose>

    <div>
        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.pdtSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.pdtDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
    </div>
    <br><hr>
</div>
<h2 class="subfild" id="T00000-4-${timestamp}"  >
    <span>本栏由产品财务接口人填写</span>
</h2>
<div id="SUBFORM_T00000-4-${timestamp}">
    <c:choose>
        <c:when test="${currentNode=='usertask3' && isHandler}">
            <div>
                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：
                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="fprodOpinion${timestamp}" name="fprodOpinion" value="${entity.fprodOpinion}"/>
                        </span>
            </div>
            <div style="text-align: center">
                <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','fprod')">同意</a>
                &nbsp;&nbsp;&nbsp;
                <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','fprod')">不同意</a>
            </div>
        </c:when>
        <c:otherwise>
            <div>
                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.fprodOpinion}</span>
            </div>
        </c:otherwise>
    </c:choose>

    <div>
        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.fprodSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.fprodDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
    </div>
    <br><hr>
</div>
<h2 class="subfild" id="T00000-5-${timestamp}"  >
    <span>本栏由财务审批</span>
</h2>
<div id="SUBFORM_T00000-5-${timestamp}">
    <c:choose>
        <c:when test="${currentNode=='usertask4' && isHandler}">
            <div>
                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：
                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="cwOpinion${timestamp}" name="cwOpinion" value="${entity.cwOpinion}"/>
                        </span>
            </div>
            <div style="text-align: center">
                <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','cw')">同意</a>
                &nbsp;&nbsp;&nbsp;
                <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','cw')">不同意</a>
            </div>
        </c:when>
        <c:otherwise>
            <div>
                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.cwOpinion}</span>
            </div>
        </c:otherwise>

    </c:choose>

    <div>
        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.cwSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.cwDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
    </div>
    <br><hr>
</div>

<h2 class="subfild" id="T00000-7-${timestamp}" >
    <span>管理区段</span>
</h2>
<div id="SUBFORM_T00000-7-${timestamp}" style="display:none;">
    <c:choose>
        <c:when test="${(isHandler || isAdmin) && entity.handler !='系统ERP' && entity.status !='10'}">

            <div style="text-align: center">
                <a href="#" class="easyui-linkbutton" onclick="endProcess${timestamp}()">终止当前单据</a>
            </div>
            <div>
                <span>&nbsp;&nbsp;&nbsp;处理人：<input id="assignDesc${timestamp}"  class="auto_selusers_false_1"/></span>
                <input id="assign${timestamp}" value="" type="hidden"/>
                <div style="text-align: center">
                    <a href="#" class="easyui-linkbutton" onclick="changeHandler${timestamp}()">修改当前处理人</a>
                </div>
            </div>

        </c:when>
    </c:choose>

    <div>
        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.assignSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.assignDate}" pattern="yyyy-MM-dd HH:mm:ss"/> </span>
    </div>
    <br><hr>
</div>
<h2 class="subfild" id="T00000-8-${timestamp}" >
    <span>过程记录</span>
</h2>
<div id="SUBFORM_T00000-8-${timestamp}" style="display:none;">
    <c:forEach var="processLog" items="${logs}">
        <div>
            <span>
                系统时间：<fmt:formatDate value="${processLog.checkDate}" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;&nbsp;
                        <ibds:userAccount account="${processLog.checkAccount}"/>&nbsp;&nbsp;
                        ${processLog.checkResult}&nbsp;&nbsp;
                        （意见：${processLog.checkOpion}&nbsp;&nbsp;）—》
                        ${processLog.checkStatus}&nbsp;&nbsp;
            </span>
        </div>

    </c:forEach>

    <br><hr>
</div>
<br><br><br><br>

<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css"/>
<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="common/js/common.js"></script>
<style type="text/css">
    .product-code tr td{
        height: 20px;
    }
</style>

<script type="text/javascript">



    $(function () {

        $("[id^='T00000-'][id$='-${timestamp}']").each(function () {
            debugger;
            var id = $(this).prop("id");
            var display = $('#SUBFORM_'+id).css('display');
            if (display == 'none') {
                $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
                // 重新加载easyui样式
            } else {
                $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
            }
        });

        //初始化PDT
        $.post("/flowable/processConfigItem/getByConfigCode/processPDT",function (result) {
            $("#pdtId${timestamp}").combobox("loadData",result.data);
        });
        //初始化产品族
        $.post("/finance/fprod/getByPdtId/"+"${entity.pdtId}",function (result) {
            $("[id^='prodId_'][id$='_${timestamp}']").combobox("loadData",result.data);
        });

        //PDT绑定事件
        $("#pdtId${timestamp}").combobox({
            onSelect:function (e) {
                if(e.pdtMgn == "" || e.pdtMgn == undefined){
                    $("#hasPdtMgn${timestamp}").val("false");
                    alert("该PDT没有配置PDT经理，请联系管理员");
                }else{
                    if(e.pdtMgn == "" || e.pdtMgn == undefined){
                        $("#hasPdtMgn${timestamp}").val("false");
                        alert("该PDT没有配置PDT经理，请联系管理员");
                    }else if(e.fprodPerson == "" || e.fprodPerson == undefined){
                        $("#hasPdtMgn${timestamp}").val("false");
                        alert("该PDT没有配置财务接口人，请联系管理员配置！");
                    }else {
                        $("#hasPdtMgn${timestamp}").val("true");
                        $.get("/user/getNameDescByAccount/"+e.pdtMgn,function (result) {

                            $("#hasPdtMgn${timestamp}").val("true");
                            $("#span_pdtMgn${timestamp}").html(result.data);
                            $("#pdtMgn${timestamp}").val(e.pdtMgn);
                        });

                    }
                }
                if($("#changePdt${timestamp}").val() == "true"){
                    $("#changePdt${timestamp}").val("")
                }else if($("#changePdt${timestamp}").val() == ""){
                    $("#changePdt${timestamp}").val("false");
                }
            },
            onChange:function (n,o) {
                if($("#hasPdtMgn${timestamp}").val()=="false"){
                    $("#hasPdtMgn${timestamp}").val("")
                    $("#changePdt${timestamp}").val("true");
                    $(this).combobox("setValue",o);
                }else{
                    debugger;
                    if(o != "" && $("#changePdt${timestamp}").val() == "false"){
                        $.messager.confirm("","产品族、产品编码将会被清除，确认是否切换PDT？",function (r) {
                            if(r){
                                $("[id^='prodId_'][id$='_${timestamp}']").each(function () {
                                    $(this).combobox("clear");
                                });
                                $.post("/finance/fprod/getByPdtId/"+n,function (result) {
                                    $("[id^='prodId_'][id$='_${timestamp}']").combobox("loadData",result.data);
                                });
                            }else{
                                debugger;
                                $("#changePdt${timestamp}").val("true");
                                $("#pdtId${timestamp}").combobox("setValue",o);
                            }
                        });
                    }else if(o == ""){
                        $.post("/finance/fprod/getByPdtId/"+n,function (result) {
                            $("[id^='prodId_'][id$='_${timestamp}']").combobox("loadData",result.data);
                        });
                    }

                }
            }
        });

        //表单转json
        $.fn.serializeObject = function()
        {
            var o = {};
            var a = this.serializeArray();
            $.each(a, function() {
                if (o[this.name] !== undefined) {
                    if (!o[this.name].push) {
                        o[this.name] = [o[this.name]];
                    }
                    o[this.name].push(this.value || '');
                } else {
                    o[this.name] = this.value || '';
                }
            });
            return o;
        };


        if("${pageType=='add'}"=="true"){
            loadSubForm${timestamp}();
        }
        
       


        $("[id^='T00000-'][id$='${timestamp}']").click(function () {

            var id = $(this).prop("id");
            var display = $('#SUBFORM_'+id).css('display');
            if (display == 'none') {
                $('#SUBFORM_'+id).show();
                $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
            } else {
                $('#SUBFORM_'+id).hide();
                $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
            }
        });

        if("${isHandler}"=="true" || "${isAdmin}"=="true"){
            //单个人员联想
            $(".auto_selusers_false_1").autocomplete("/product/userlink/list?userCode=liucaixuan", {
                multiple: false,
                max : 20, //列表里的条目数
                minChars : 2, //自动完成激活之前填入的最小字符
                width : '400px', //提示的宽度，溢出隐藏
                scrollHeight : 300, //提示的高度，溢出显示滚动条
                matchContains : false, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
                autoFill : false, //自动填充
                parse : function(data) {
                    return $.map(eval(data), function(row) {
                        return {
                            data : row,
                            value : row.uda10509+" "+row.code,
                            result :row.uda10509+" "+row.code
                        }
                    }) //对ajax页面传过来的数据进行json转码
                },
                formatItem : function(row, i, max) {
                    //document.getElementById('cmoid').value = "";
                    return row.uda10509 + ' | ' + row.code + ' | ' + row.deptname ;
                },

            }).result(function (event,item) {
                debugger;
                $("#assign${timestamp}").val(item.usercode);


            });
        }
        

    });

    function changeMenue${timestamp}(a){
        if(a=='fold'){
            $("[id^='SUBFORM_T00000-'][id$='${timestamp}']").hide();
            $("[id^='T00000-'][id$='${timestamp}']").each(function () {
                $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
            });

        }else if(a=='expand'){
            $("[id^='SUBFORM_T00000-'][id$='${timestamp}']").show();
            $("[id^='T00000-'][id$='${timestamp}']").each(function () {
                $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
            });
        }
    }

    //保存
    function save${timestamp}(){
        $("#mainUrl").tabs("loading","处理中...")	// display the progress bar
        $('#productCodeApply${timestamp}').form('submit', {

            url: '/flowable/partCodeProcess/save',
            onSubmit: function(){
                //checkSubForm${timestamp}();
                //var isValid = $(this).form('validate');
                var isValid = true;
                <%--//校验表单--%>
                <%--var pdmApplyCode =  $("#pdmApplyCode${timestamp}").textbox("getValue");--%>
                <%--if(pdmApplyCode == ""){--%>
                <%--    $.messager.alert("提示","PDM申请单号必填！")--%>
                <%--    isValid = false;--%>
                <%--}--%>
                <%--if(isValid && $("#deptType${timestamp}").combobox("getValue") == ""){--%>
                <%--    $.messager.alert("提示","部门分类必填！")--%>
                <%--    isValid = false;--%>
                <%--}--%>
                <%--if(isValid && $("#applyPerson${timestamp}").textbox("getValue") == ""){--%>
                <%--    $.messager.alert("提示","申请人必填！")--%>
                <%--    isValid = false;--%>
                <%--}--%>
                <%--if(isValid && $("#applyDept${timestamp}").textbox("getValue") == ""){--%>
                <%--    $.messager.alert("提示","部门必填！")--%>
                <%--    isValid = false;--%>
                <%--}--%>
                <%--if(isValid && $("#tel${timestamp}").textbox("getValue") == ""){--%>
                <%--    $.messager.alert("提示","联系电话必填！")--%>
                <%--    isValid = false;--%>
                <%--}--%>
                <%--if(isValid && $("#pdtId${timestamp}").combobox("getValue") == ""){--%>
                <%--    $.messager.alert("提示","PDT必填！")--%>
                <%--    isValid = false;--%>
                <%--}--%>
                <%--if(isValid && $("#pdtMgn${timestamp}").val() == ""){--%>
                <%--    $.messager.alert("提示","PDT经理必填！")--%>
                <%--    isValid = false;--%>
                <%--}--%>
                <%--if(isValid){--%>
                <%--    $("[id^='businessModelId_'][id$='_${timestamp}']").each(function () {--%>
                <%--        if($(this).combobox("getValue") == ""){--%>
                <%--            isValid = false;--%>
                <%--            $.messager.alert("提示","商业模式必填！")--%>
                <%--            return false;--%>
                <%--        }--%>
                <%--    });--%>
                <%--}--%>
                <%--if(isValid){--%>
                <%--    $("[id^='prodId_'][id$='_${timestamp}']").each(function () {--%>
                <%--        if($(this).combobox("getValue") == ""){--%>
                <%--            isValid = false;--%>
                <%--            $.messager.alert("提示","产品族必填！")--%>
                <%--            return false;--%>
                <%--        }--%>
                <%--    });--%>
                <%--}--%>
                <%--if(isValid){--%>
                <%--    $("[id^='fprodCodeId_'][id$='_${timestamp}']").each(function () {--%>
                <%--        if($(this).combobox("getValue") == ""){--%>
                <%--            isValid = false;--%>
                <%--            $.messager.alert("提示","产品编码必填！")--%>
                <%--            return false;--%>
                <%--        }--%>
                <%--    });--%>
                <%--}--%>

                if (!isValid){
                   $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid
                }
                return isValid;	// return false will stop the form submission
            },
            success: function(result){
                debugger;
                var obj = $.parseJSON(result);
                if(obj.status==200){
                    // var tab = $('#mainUrl').tabs('getSelected');
                    // debugger;
                    // var id = $.parseJSON(result).data.id;
                    // tab.panel('refresh', '/flowable/partCodeProcess/edit/'+id);
                    var tab = $('#mainUrl').tabs('getSelected');
                    var index = $('#mainUrl').tabs('getTabIndex', tab);
                    $("#mainUrl").tabs("close", index)
                }else{
                    alert(obj.message);
                }
               $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully
            }
        });
    }

    //保存
    <%--function save${timestamp}(){--%>
    <%--    $.messager.progress({--%>

    <%--        title:'提示',--%>
    <%--        msg:'文本',--%>

    <%--    });	// display the progress bar--%>
    <%--    var isValid = $('#productCodeApply${timestamp}').form('validate');--%>
    <%--    if(!isValid){--%>
    <%--       $("#mainUrl").tabs("loaded");--%>
    <%--    }else{--%>
    <%--        var l =  $("[id^='applys'][id$='prodlineId${timestamp}']").length;--%>
    <%--        $("[id^='applys'][id$='prodlineId${timestamp}']").each(function(){--%>
    <%--            var val = $(this).combobox('getValue');--%>
    <%--            var s = $.trim(val);--%>
    <%--            var a = $(this);--%>

    <%--            //如果为空--%>
    <%--            if(s == ""){--%>
    <%--                $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val("");--%>
    <%--            }else if(isNaN(s)){--%>
    <%--                //如果 val 不为数字类型则是手动输入 把值设空--%>
    <%--                $(this).combobox('setValue',"");--%>
    <%--                $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);--%>
    <%--            }else {--%>
    <%--                var prodlineName = $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val();--%>
    <%--                //如果为数字，两种情况：1、为产品线id 2、手动输入为数字--%>
    <%--                $.get("/finance/fprodLine/getById/"+s,function (result) {--%>
    <%--                    //如果名称不一致则为手动输入--%>
    <%--                    if(result.data.prodlineDesc != prodlineName){--%>
    <%--                        // id 置空--%>
    <%--                        $(a).combobox('setValue',"");--%>
    <%--                        // 产品线名称设为手动输入的值--%>
    <%--                        $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);--%>
    <%--                    }--%>
    <%--                });--%>
    <%--            }--%>
    <%--        });--%>
    <%--    }--%>
    <%--    $('#productCodeApply${timestamp}').form('submit', {--%>

    <%--        url: '/flowable/productCodeApply/save',--%>
    <%--        onSubmit: function(){--%>
    <%--            //checkSubForm${timestamp}();--%>
    <%--            var isValid = $(this).form('validate');--%>

    <%--            if (!isValid){--%>
    <%--               $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid--%>
    <%--            }--%>
    <%--            return isValid;	// return false will stop the form submission--%>
    <%--        },--%>
    <%--        success: function(){--%>
    <%--           $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully--%>
    <%--        }--%>
    <%--    });--%>
    <%--}--%>

    //提交
    function submit${timestamp}(){
        //$.messager.confirm('', '确认是否提交?', function(r){
           // if (r){
                $("#mainUrl").tabs("loading","处理中...")
                $('#productCodeApply${timestamp}').form('submit', {
                    url: '/flowable/partCodeProcess/submit',
                    onSubmit: function(){
                        checkSubForm${timestamp}();
                        var isValid = true;
                        //校验表单
                        var pdmApplyCode =  $("#pdmApplyCode${timestamp}").textbox("getValue");
                        if(pdmApplyCode == ""){
                            $.messager.alert("提示","PDM申请单号必填！")
                            isValid = false;
                        }
                        if(isValid && $("#deptType${timestamp}").combobox("getValue") == ""){
                            $.messager.alert("提示","部门分类必填！")
                            isValid = false;
                        }
                        if(isValid && $("#applyPerson${timestamp}").textbox("getValue") == ""){
                            $.messager.alert("提示","申请人必填！")
                            isValid = false;
                        }
                        if(isValid && $("#applyDept${timestamp}").textbox("getValue") == ""){
                            $.messager.alert("提示","部门必填！")
                            isValid = false;
                        }
                        if(isValid && $("#tel${timestamp}").textbox("getValue") == ""){
                            $.messager.alert("提示","联系电话必填！")
                            isValid = false;
                        }
                        if(isValid && $("#pdtId${timestamp}").combobox("getValue") == ""){
                            $.messager.alert("提示","PDT必填！")
                            isValid = false;
                        }
                        if(isValid && $("#pdtMgn${timestamp}").val() == ""){
                            $.messager.alert("提示","PDT经理必填！")
                            isValid = false;
                        }
                        if(isValid){
                            $("[id^='businessModelId_'][id$='_${timestamp}']").each(function () {
                                if($(this).combobox("getValue") == ""){
                                    isValid = false;
                                    $.messager.alert("提示","商业模式必填！")
                                    return false;
                                }
                            });
                        }
                        if(isValid){
                            $("[id^='prodId_'][id$='_${timestamp}']").each(function () {
                                if($(this).combobox("getValue") == ""){
                                    isValid = false;
                                    $.messager.alert("提示","产品族必填！")
                                    return false;
                                }
                            });
                        }
                        if(isValid){
                            $("[id^='fprodCodeId_'][id$='_${timestamp}']").each(function () {
                                if($(this).combobox("getValue") == ""){
                                    isValid = false;
                                    $.messager.alert("提示","产品编码必填！")
                                    return false;
                                }
                            });
                        }

                        if (!isValid){
                           $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid
                        }
                        return isValid;	// return false will stop the form submission
                    },
                    success: function(result){
                        debugger;
                        var obj = $.parseJSON(result);
                        if(obj.status==200){
                            // var tab = $('#mainUrl').tabs('getSelected');
                            // debugger;
                            // var id = $.parseJSON(result).data.id;
                            // tab.panel('refresh', '/flowable/partCodeProcess/edit/'+id);
                            var tab = $('#mainUrl').tabs('getSelected');
                            var index = $('#mainUrl').tabs('getTabIndex', tab);
                            $("#mainUrl").tabs("close", index)
                        }else{
                            alert(obj.message);
                        }

                       $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully
                    }
                });
           // }
       // });

    }

    function check${timestamp}(result,name) {
        //$.messager.confirm('', '确认是否操作?', function(r){
            //if(r){
                $("#mainUrl").tabs("loading","处理中...")
                var opinoin = $("#"+name+"Opinion${timestamp}").val();
                //var id = $("#id${timestamp}").val();
                if(result != "1"){
                    if(opinoin == "" && name!="processmgn"){
                        alert("请填写审核意见！")
                        $("#mainUrl").tabs("loaded");
                        return false;
                    }
                }
                var param = {
                    "checkDate":name+"Date",
                    "checkPerson":name+"Sign",
                    "checkResult":result,
                    "checkResultForRole":{
                        "resultName":name+"Result",
                        "resultValue":result
                    },
                    "checkOpinionForRole":{
                        "opinionName":name+"Opinion",
                        "opinionValue":opinoin
                    }
                };
                debugger;
                if(name=="processmgn"){
                    delete param.checkOpinionForRole;
                }
                $.ajax({
                    type: "POST",
                    url: "/flowable/partCodeProcess/check/${entity.id}/${taskId}",
                    contentType: "application/json; charset=utf-8",
                    data: JSON.stringify(param),
                    dataType: "json",
                    success: function (message) {
                        debugger;
                       $("#mainUrl").tabs("loaded");
                        if (message.status == 200) {
                            if(window.location.href.indexOf('eipLogin') > -1){
                                var data = {};
                                data.Code = 11;
                                data.Msg = "审批成功";
                                PM.send(top.window.parent, "fromSource", data);
                            }else{
                                //alert("保存成功");
                                <%--var tab = $('#mainUrl').tabs('getSelected');--%>
                                <%--tab.panel('refresh', '/flowable/partCodeProcess/edit/${entity.id}');--%>
                                var tab = $('#mainUrl').tabs('getSelected');
                                var index = $('#mainUrl').tabs('getTabIndex', tab);
                                $("#mainUrl").tabs("close", index)
                            }


                        }else{
                            if(window.location.href.indexOf('eipLogin') > -1){
                                var data = {};
                                data.Code = 0;
                                data.Msg = "审批失败";
                                PM.send(top.window.parent, "fromSource", data);

                            }else{
                                alert(message.message);
                            }
                        }

                    },
                    error: function (message) {
                       $("#mainUrl").tabs("loaded");
                        alert("保存失败");
                    }
                });
            //}
        //});

    }

    function changeHandler${timestamp}() {
        $("#mainUrl").tabs("loading","处理中...")
        var userId =  $("#assign${timestamp}").val();
        if(userId == ""){
            alert("处理人不能为空！");
           $("#mainUrl").tabs("loaded");
        }else{
            $("#changeHandlerButton${timestamp}").linkbutton('disable');
            $.post("/flowable/partCodeProcess/changeHandler",{id:"${entity.id}",taskId:"${taskId}",userId:userId},function (result) {
                if(result.status == 200){
                    if(window.location.href.indexOf('eipLogin') > -1){
                        var data = {};
                        data.Code = 11;
                        data.Msg = "审批成功";
                        PM.send(top.window.parent, "fromSource", data);
                    }else{
                        <%--alert("修改当前处理人成功");--%>
                        <%--var tab = $('#mainUrl').tabs('getSelected');--%>
                        <%--tab.panel('refresh', '/flowable/partCodeProcess/edit/${entity.id}');--%>
                        var tab = $('#mainUrl').tabs('getSelected');
                        var index = $('#mainUrl').tabs('getTabIndex', tab);
                        $("#mainUrl").tabs("close", index)
                    }

                }else{
                    if(window.location.href.indexOf('eipLogin') > -1){
                        var data = {};
                        data.Code = 0;
                        data.Msg = "修改当前处理人失败";
                        PM.send(top.window.parent, "fromSource", data);

                    }else{
                        alert(result.message);
                        $("#changeHandlerButton${timestamp}").linkbutton('enable');
                    }
                }
               $("#mainUrl").tabs("loaded");
            });
        }

    }

    function endProcess${timestamp}() {
        $.messager.confirm('', '确认是否终止当前流程?', function(r){
            if (r){
                $("#mainUrl").tabs("loading","处理中...")
                $.post("/flowable/partCodeProcess/endProcess",{id:"${entity.id}",taskId:"${taskId}"},function (result) {
                    if(result.status == 200){
                        if(window.location.href.indexOf('eipLogin') > -1){
                            var data = {};
                            data.Code = 11;
                            data.Msg = "审批成功";
                            PM.send(top.window.parent, "fromSource", data);
                        }else{
                            var tab = $('#mainUrl').tabs('getSelected');
                            var index = $('#mainUrl').tabs('getTabIndex', tab);
                            $("#mainUrl").tabs("close", index)
                        }

                    }else{
                        if(window.location.href.indexOf('eipLogin') > -1){
                            var data = {};
                            data.Code = 0;
                            data.Msg = "审批失败";
                            PM.send(top.window.parent, "fromSource", data);

                        }else{
                            alert("结束当前流程失败");

                        }
                    }
                   $("#mainUrl").tabs("loaded");
                });
            }
        });

    }

    function changePage${timestamp}() {
        alert(11);
    }

    function loadSubForm${timestamp}() {
        if("${currentNode=='usertask1' && isHandler || currentNode == 'editable'}"=="true"){

            $("#subForm111${timestamp}").load("/flowable/productCodeApply/subForm/Add",
                $('#productCodeApply${timestamp}').serializeObject());
        }else{
            $("#subForm111${timestamp}").load("/flowable/productCodeApply/subForm/View",{id:"${entity.id}",timestamp:"${timestamp}"});
        }
    }

    function confirmDlg${timestamp}(v) {
        var m = "确认操作？";
        if(v=='type'){
            m = "确认修改申请类型？"
        }else if(v=='count'){
            m = "确认修改申请数目？";
        }
        $.messager.confirm('',m,function(r){
            if (r){
                if($("#input_applyType${timestamp}").val()!=$("#applyType${timestamp}").val()){
                    $("#subForm111${timestamp}").html("");
                }
                $("#input_applyType${timestamp}").val($("#applyType${timestamp}").val());
                $("#input_applyCount${timestamp}").val($("#applyCount${timestamp}").val());
                loadSubForm${timestamp}();
            }else{
                //取消
                $("#applyType${timestamp}").combobox("setValue",$("#input_applyType${timestamp}").val());
                //$("#applyCount${timestamp}").val($("#input_applyCount${timestamp}").val());
                $("#applyCount${timestamp}").numberbox("setValue",$("#input_applyCount${timestamp}").val());
            }
        });
    }

    function updateBaseInfo${timestamp}() {
        $.messager.confirm('', '确认是否更新研发基本信息?', function(r){
            if(r){
                $.messager.progress();
                var opinoin = $("#"+name+"Opinion${timestamp}").val();

                var param = {
                    "checkDate":"processmgnDate",
                    "checkPerson":"processmgnSign",
                    "checkResult":"1",
                    "checkResultForRole":{
                        "resultName":"processmgnResult",
                        "resultValue":"1"
                    }
                };

                $.ajax({
                    type: "POST",
                    url: "/flowable/productCodeApply/updateBaseInfo/${entity.id}/${taskId}",
                    contentType: "application/json; charset=utf-8",
                    data: JSON.stringify(param),
                    dataType: "json",
                    success: function (message) {
                        if (message.status == 200) {
                            alert("保存成功");
                            var tab = $('#mainUrl').tabs('getSelected');
                            tab.panel('refresh', '/flowable/productCodeApply/edit/${entity.id}');
                        }else{
                            alert("保存失败");
                        }
                       $("#mainUrl").tabs("loaded");
                    },
                    error: function (message) {
                        alert("保存失败");
                       $("#mainUrl").tabs("loaded");
                    }
                });
            }
        });
    }

    function checkSubForm${timestamp}() {
        $("[id^='applys'][id$='prodlineId${timestamp}']").each(function(){
            var val = $(this).combobox('getValue');
            var s = $.trim(val);
            var a = $(this);

            //如果为空
            if(s == ""){
                $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val("");
            }else if(isNaN(s)){
                //如果 val 不为数字类型则是手动输入 把值设空
                $(this).combobox('setValue',"");
                $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);
            }else {
                var prodlineName = $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val();
                //如果为数字，两种情况：1、为产品线id 2、手动输入为数字
                $.get("/finance/fprodLine/getById/"+s,function (result) {
                    //如果名称不一致则为手动输入
                    if(result.data.prodlineDesc != prodlineName){
                        // id 置空
                        $(a).combobox('setValue',"");
                        // 产品线名称设为手动输入的值
                        $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);
                    }
                });
            }
        });

    }

    function deleteProcess${timestamp}() {
        $.post("/flowable/partCodeProcess/deleteById/${entity.id}",function (result) {
            if(result.status == 200){
                var tab = $('#mainUrl').tabs('getSelected');
                var index = $('#mainUrl').tabs('getTabIndex', tab);
                $("#mainUrl").tabs("close", index)
            }else{
                alert(result.message);
            }
        });
    }

</script>
</body>
</html>
