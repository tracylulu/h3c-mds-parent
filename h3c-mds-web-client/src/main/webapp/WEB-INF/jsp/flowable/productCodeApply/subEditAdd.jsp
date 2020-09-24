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
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="common/css/bds.css" />
    <link rel="stylesheet" type="text/css" href="/common/css/flowable.css" />
</head>
<body>
<div id="fproductCodeWin${timestamp}" class="easyui-window" title="对话框" style="width:75%;height:560px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_index${timestamp}" type="hidden" value=""/>
    <table width="100%">
        <tr>
            <td width="88%">
                <input id="searchCodeStr${timestamp}"
                       class="easyui-textbox" type="text" prompt="请输入搜索内容"
                       style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                                        class="easyui-linkbutton" onclick="searchFCode${timestamp}();">搜 索 </a>&nbsp;
                <table id="fprodoctCode_grid${timestamp}" class="easyui-datagrid"></table>
            </td>
<%--            <td>--%>
<%--                <div style="text-align: center">--%>
<%--                    <a href="#" class="easyui-linkbutton" onclick="confirm${timestamp}();" id="confirm${timestamp}">确认</a>--%>
<%--                </div>--%>
<%--                <div style="text-align: center">--%>
<%--                    <a href="#" class="easyui-linkbutton" onclick="cancle${timestamp}();" id="cancle${timestamp}">取消</a>--%>
<%--                </div>--%>
<%--            </td>--%>
        </tr>
    </table>

</div>
<input type="hidden" id="hasPdtMgn${timestamp}" value="false"/>
<jsp:include page="chooseBom.jsp"/>
<jsp:include page="chooseFile.jsp"/>
<jsp:include page="importBomCode.jsp"/>
<c:set var="e" value="${applyCount-1}"/>
<div style="margin:auto;overflow:auto;" >
<c:forEach begin="0" end="${e}" varStatus="status">
    <div id="subDiv_${status.index}_${timestamp}" style="font-size:13px;width: 100%" >
        <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
            <tr >
                <th  align="center">序号</th>
                <th width="6%">原产品编码</th>
                <th >原产品中文描述</th>
                <th >原产品英文描述</th>
                <th >原产品线描述</th>
                <th >原产品线英文描述</th>
                <th >原产品族描述</th>
                <th >原产品族英文描述</th>
                <th >原属PDT</th>
                <th >原对应的BOM</th>
                <th >依据材料</th>

            </tr>
            <tr>
                <input type="hidden" id="applys[${status.index}].id${timestamp}" name="applys[${status.index}].id"  value="${entity.applys[status.index].id}"/>
                <input type="hidden" id="oldId_${status.index}_${timestamp}" name="applys[${status.index}].oldId"  value="${entity.applys[status.index].oldId}"/>
                <input type="hidden" id="old_note_${status.index}_${timestamp}" value="${entity.applys[status.index].note}"/>
                <td  rowspan="7" align="center">${status.index+1}<input type="hidden" id="applys[${status.index}].orderBy${timestamp}" name="applys[${status.index}].orderBy" value="${status.index+1}"/></td>
                <td >
                    <span id="old_productCode_${status.index}_${timestamp}">${entity.applys[status.index].oldProductCode}</span>
                    <input  index="${status.index}"  id="oldproductCode_${status.index}_${timestamp}" name="applys[${status.index}].oldProductCode" value="${entity.applys[status.index].oldProductCode}" type="hidden"/>
<%--                    <button type="button" onclick="layoutWin${timestamp}('${status.index}')">&nbsp;&nbsp;&nbsp;</button>--%>
                    <a  href="javascript:void(0)" style="text-align: right;height: 24px;"
                        class="easyui-linkbutton" onclick="layoutWin${timestamp}('${status.index}');">请选择</a>

                </td>
                <td >
                    <span id="old_productNameCn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameCn}</span>
                    <input id="oldproductNameCn_${status.index}_${timestamp}" name="applys[${status.index}].oldProductNameCn" type="hidden" value="${entity.applys[status.index].oldProductNameCn}">
                </td>
                <td >
                    <span id="old_productNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameEn}</span>
                    <input id="oldproductNameEn_${status.index}_${timestamp}" name="applys[${status.index}].oldProductNameEn" value="${entity.applys[status.index].oldProductNameEn}" type="hidden"/>
                </td>
                <td >
                    <span id="old_prodlineName_${status.index}_${timestamp}">${entity.applys[status.index].oldProdlineName}</span>
                    <input id="oldprodlineName_${status.index}_${timestamp}" name="applys[${status.index}].oldProdlineName" value="${entity.applys[status.index].oldProdlineName}" type="hidden"/>
                    <input id="old_prodlineNo_${status.index}_${timestamp}" name="applys[${status.index}].oldProdlineNo" value="${entity.applys[status.index].oldProdlineNo}" type="hidden">
                    <input id="old_prodlineId_${status.index}_${timestamp}" name="applys[${status.index}].oldProdlineId" value="${entity.applys[status.index].oldProdlineId}" type="hidden">
                    <input id="old_prodline_${status.index}_${timestamp}" name="applys[${status.index}].oldProdline" value="${entity.applys[status.index].oldProdlineName}" type="hidden">
                </td>
                <td >
                    <span id="old_prodlineNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProdlineNameEn}</span>
                    <input id="oldprodlineNameEn_${status.index}_${timestamp}" name="applys[${status.index}].oldProdlineNameEn" value="${entity.applys[status.index].oldProdlineNameEn}" type="hidden"/>
                </td>
                <td >
                    <span id="old_productName_${status.index}_${timestamp}">${entity.applys[status.index].oldProductName}</span>
                    <input id="oldproductName_${status.index}_${timestamp}" name="applys[${status.index}].oldProductName" value="${entity.applys[status.index].oldProductName}" type="hidden"/>
                    <input id="old_productNo_${status.index}_${timestamp}" name="applys[${status.index}].oldProductNo" value="${entity.applys[status.index].oldProductNo}" type="hidden">
                    <input id="old_productId_${status.index}_${timestamp}" name="applys[${status.index}].oldProductId" value="${entity.applys[status.index].oldProductId}" type="hidden">
                    <input id="old_product_${status.index}_${timestamp}" name="applys[${status.index}].oldProduct" value="${entity.applys[status.index].oldProductId == 0 ? entity.applys[status.index].oldProductName :entity.applys[status.index].oldProductId}" type="hidden">
                </td>
                <td >
                    <span id="old_prodNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProdNameEn}</span>
                    <input id="oldprodNameEn_${status.index}_${timestamp}" name="applys[${status.index}].oldProdNameEn" value="${entity.applys[status.index].oldProdNameEn}" type="hidden"/>
                </td>
                <td >
                    <span id="old_pdtName_${status.index}_${timestamp}">${entity.applys[status.index].oldPdtName}</span>
                    <input id="oldpdtName_${status.index}_${timestamp}" name="applys[${status.index}].oldPdtName" value="${entity.applys[status.index].oldPdtName}" type="hidden"/>
                    <input id="old_pdtNo_${status.index}_${timestamp}" name="applys[${status.index}].oldPdtNo" value="${entity.applys[status.index].oldPdtNo}" type="hidden">
                    <input id="old_pdtId_${status.index}_${timestamp}" name="applys[${status.index}].oldPdtId" value="${entity.applys[status.index].oldPdtId}" type="hidden">
                    <input id="old_pdtState_${status.index}_${timestamp}" value="" type="hidden"/>
                </td>

                <td >
<%--                    <span id="old_bomCode_${status.index}_${timestamp}">--%>

<%--                        <c:set var="oldBomCodes" value="${fn:split(entity.applys[status.index].oldBomCode,';')}"/>--%>
<%--                        <c:forEach var="oldBomCode" items="${oldBomCodes}">--%>
<%--                            <div>${oldBomCode}</div>--%>
<%--                        </c:forEach>--%>
<%--                    </span>--%>
<%--                    <input id="oldbomCode_${status.index}_${timestamp}" name="applys[${status.index}].oldBomCode" value="${entity.applys[status.index].oldBomCode}" type="hidden"/>--%>
                    <textarea readonly="true" style="width: 100%;height: 70px;"  id="oldBomCode_${status.index}_${timestamp}" name="applys[${status.index}].oldBomCode" value="${entity.applys[status.index].oldBomCode}">${entity.applys[status.index].oldBomCode}</textarea>
                    <input id="old_bomDesc_${status.index}_${timestamp}" name="applys[${status.index}].oldBomDesc" value="${entity.applys[status.index].oldBomDesc}" type="hidden"/>
                </td>
                <td >
                    <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                    <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
                    <a href="#">
                        <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}('${status.index}')">
                    </a>
                </td>
            </tr>


            <tr>
                <th>现产品编码</th>
                <th>现产品中文描述</th>
                <th>现产品英文描述</th>
                <th>现产品线描述</th>
                <th>现产品线英文描述</th>
                <th>现产品族描述</th>
                <th>现产品族英文描述</th>
                <th>现属PDT</th>
                <th width="500px">现对应的BOM</th>
                <th>备注</th>
            </tr>
            <tr>
                <td>
                    <input etype="textbox" copyOld="true" index="${status.index}" readonly="true" data-options="width:'70%',required:true" class="easyui-textbox" id="productCode_${status.index}_${timestamp}" name="applys[${status.index}].productCode" value="${entity.applys[status.index].productCode}"/>
                    <a  href="javascript:void(0)" style="text-align: right;height: 24px;"
                        class="easyui-linkbutton" onclick="copyOld${timestamp}('${status.index}');">拷贝</a>
<%--                    <button type="button" onclick="copyOld${timestamp}('${status.index}')">拷贝</button>--%>
                </td>
                <td>
                    <input etype="textbox" copyOld="true" index="${status.index}" data-options="required:true" class="easyui-textbox" id="productNameCn_${status.index}_${timestamp}" name="applys[${status.index}].productNameCn" value="${entity.applys[status.index].productNameCn}"/>
                </td>
                <td>
                    <input etype="textbox" copyOld="true" index="${status.index}" data-options="required:true" class="easyui-textbox" id="productNameEn_${status.index}_${timestamp}" name="applys[${status.index}].productNameEn" value="${entity.applys[status.index].productNameEn}"/>
                </td>
                <td>
                    <input etype="combox" copyOld="true" index="${status.index}" id="prodline_${status.index}_${timestamp}"  data-options="valueField:'prodlineDesc',textField:'prodlineDesc',width:'100%',required:true" class="easyui-combobox"  name="applys[${status.index}].prodline" value="${entity.applys[status.index].prodlineName}"/>
                    <input copyOld="true" index="${status.index}" type="hidden" id="prodlineName_${status.index}_${timestamp}" name="applys[${status.index}].prodlineName" value="${entity.applys[status.index].prodlineName}">
                    <input copyOld="true" index="${status.index}" type="hidden" id="prodlineNo_${status.index}_${timestamp}" name="applys[${status.index}].prodlineNo" value="${entity.applys[status.index].prodlineNo}">
                    <input  index="${status.index}" type="hidden" id="prodlineCode_${status.index}_${timestamp}"  value="">
                    <input  index="${status.index}" type="hidden" id="operateType_${status.index}_${timestamp}"  value="">
                </td>
                <td>
                    <input etype="textbox" copyOld="true" index="${status.index}" data-options="required:true" class="easyui-textbox" id="prodlineNameEn_${status.index}_${timestamp}" name="applys[${status.index}].prodlineNameEn" value="${entity.applys[status.index].prodlineNameEn}"/>
                </td>
                <td>
                    <input etype="combox" copyOld="true" index="${status.index}" id="product_${status.index}_${timestamp}"  data-options="valueField:'id',textField:'prodName',required:true" class="easyui-combobox"  name="applys[${status.index}].product" value="${entity.applys[status.index].productName}"/>
                    <input copyOld="true" index="${status.index}" type="hidden" id="productName_${status.index}_${timestamp}" name="applys[${status.index}].productName" value="${entity.applys[status.index].productName}">
                    <input copyOld="true" index="${status.index}" type="hidden" id="productNo_${status.index}_${timestamp}" name="applys[${status.index}].productNo" value="${entity.applys[status.index].productNo}">
                </td>
                <td>
                    <input etype="textbox" copyOld="true" index="${status.index}" data-options="required:true" class="easyui-textbox" id="prodNameEn_${status.index}_${timestamp}" name="applys[${status.index}].prodNameEn" value="${entity.applys[status.index].prodNameEn}"/>
                </td>
                <td>
                    <input etype="combox" copyOld="true" index="${status.index}" id="pdtId_${status.index}_${timestamp}" data-options="valueField:'id',textField:'content',required:true" class="easyui-combobox"  name="applys[${status.index}].pdtId" value="${entity.applys[status.index].pdtId}"/>
                    <input copyOld="true" index="${status.index}" id="pdtName_${status.index}_${timestamp}" type="hidden"  name="applys[${status.index}].pdtName" value="${entity.applys[status.index].pdtName}">
                    <input copyOld="true" index="${status.index}" id="pdtNo_${status.index}_${timestamp}" type="hidden"  name="applys[${status.index}].pdtNo" value="${entity.applys[status.index].pdtNo}">
                </td>
                <td>
<%--                    <span copyOld="true" index="${status.index}" etype="span" id="span_bomCode_${status.index}_${timestamp}">--%>
<%--                        <c:set var="bomCodes" value="${fn:split(entity.applys[status.index].bomCode,';')}"/>--%>
<%--                        <c:forEach var="bomCode" items="${bomCodes}">--%>
<%--                            <div>${bomCode}</div>--%>
<%--                        </c:forEach>--%>
<%--                    </span>--%>
<%--                    <input copyOld="true" index="${status.index}" id="bomCode_${status.index}_${timestamp}" name="applys[${status.index}].bomCode" value="${entity.applys[status.index].bomCode}" type="hidden"/>--%>
                    <textarea copyOld="true" index="${status.index}" readonly="true" style="width: 100%;height: 70px;"  id="bomCode_${status.index}_${timestamp}" name="applys[${status.index}].bomCode" value="${entity.applys[status.index].bomCode}">${entity.applys[status.index].bomCode}</textarea>
                    <input copyOld="true" index="${status.index}" id="bomDesc_${status.index}_${timestamp}" name="applys[${status.index}].bomDesc" value="${entity.applys[status.index].bomDesc}" type="hidden"/>
<%--                    <button type="button" onclick="layoutBomWin${timestamp}('${status.index}')">&nbsp;&nbsp;&nbsp;</button>--%>
                    <a mar="no"  href="javascript:void(0)" style="text-align: center;height: 24px;"
                        class="easyui-linkbutton" onclick="layoutBomWin${timestamp}('${status.index}');">请选择</a>
                    <a mar="no" href="javascript:void(0)" style="text-align: right;height: 24px;"
                        class="easyui-linkbutton" onclick="exportBom${timestamp}('${status.index}');">导&nbsp;&nbsp;&nbsp;&nbsp;出</a>
                    <a mar="no" href="javascript:void(0)" style="text-align: right;height: 24px;"
                        class="easyui-linkbutton" onclick="layoutBomCodeFileWin${timestamp}('${status.index}');">导&nbsp;&nbsp;&nbsp;&nbsp;入</a>
                </td>
                <td>
<%--                    <input etype="textbox" copyOld="false" index="${status.index}" class="easyui-textbox" data-options="required:true,width:'100%'" id="note_${status.index}_${timestamp}" name="applys[${status.index}].note" value="${entity.applys[status.index].note}"/>--%>
                    <textarea copyOld="false" style="width: 200px;height: 70px;"  id="note_${status.index}_${timestamp}" name="applys[${status.index}].note" value="${entity.applys[status.index].note}">${entity.applys[status.index].note}</textarea>
                </td>
            </tr>
        </table>
        <br>
    </div>

</c:forEach>
</div>
<br><br>
<div >
    <div style="float: left;width: 48%;text-align: right;margin-top:-0.5%;">
        <a href="#" class="easyui-linkbutton" onclick="submit${timestamp}();" id="sub${timestamp}">提交</a>
    </div>
    <div style="margin-left: 52%">
        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.subSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.submitDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
    </div>

</div>
<style>
    a[mar=no] span{
        margin-top: 0px !important;
    }
</style>
<script type="text/javascript">
    $(function () {
        //InitFProductCodeGrid${timestamp}();
        $.parser.parse($("#subForm111${timestamp}"));
        $('#fprodoctCode_grid${timestamp}').datagrid({
            onDblClickRow : function(rowIndex,rowData) {
                doubleClick${timestamp}(rowData);
            }
        });
        debugger;
        //if("${pageType}"=="edit"){
            //产品族绑定单击事件
            $("[id^=product_][id$=_${timestamp}]").each(function (i) {
                var index = $(this).attr("index");
                var prodline = $("#prodline_"+index+"_${timestamp}").combobox("getValue");
                var prodlineNo = $("#productCode_"+index+"_${timestamp}").textbox("getValue").substring(0,2);
                $.post("/finance/fprod/getByProdlineNameAndNo/"+prodline+"/"+prodlineNo,function (result) {
                    $("#product_"+index+"_${timestamp}").combobox("loadData",result.data);
                });
                debugger;
            });

        //}
        var dep = $("#applyDep${timestamp}").val();
        //页面加载完成加载产品线
        $.get("/finance/fprodLine/getDistinctNameByDept/"+dep,function (result) {
            debugger;
            $("[id^=prodline_][id$=_${timestamp}]").combobox("loadData",result.data);
            $("[id^=prodline_][id$=_${timestamp}]").each(function(){
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
        <%--    $("[id^=prodline_][id$=_${timestamp}]").combobox("loadData",result.data);--%>
        <%--    $("[id^=prodline_][id$=_${timestamp}]").each(function () {--%>
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
            $("[id^=pdtId_][id$=_${timestamp}]").combobox("loadData",result.data);
            $("[id^=pdtId_][id$=_${timestamp}]").each(function(){
                var v = $(this).combobox("getValue");
                if("D0002" == dep || "D0003" == dep){
                    $(this).combobox({editable:false});
                }else if("D0001" == dep ){
                    $(this).combobox({editable:false});
                }
                $(this).combobox("setValue",v);
            });

        });

        //产品线绑定事件
        $("[id^=prodline_][id$=_${timestamp}]").combobox({
            onSelect:function (e) {
                var a = this;
                debugger;
                $("#prodlineName_"+$(a).attr("index")+"_${timestamp}").val(e.prodlineDesc);
                $("#prodlineNo_"+$(a).attr("index")+"_${timestamp}").val(e.prodlineNo);
                $("#prodlineCode_"+$(a).attr("index")+"_${timestamp}").val(e.prodlineCode);

                //$("#span_applys\\["+$(a).attr("index")+"\\]\\.prodlineNo${timestamp}").html(e.id);
                <%--$.get("/finance/fprod/getByLineId/"+e.id,function (result) {--%>
                <%--    //$("#productNo_"+$(a).attr("index")+"_${timestamp}").combobox("clear");--%>
                <%--    debugger;--%>
                <%--    //var v = $("#product_"+$(a).attr("index")+"_${timestamp}").combobox("getValue");--%>
                <%--    var t = $("#product_"+$(a).attr("index")+"_${timestamp}").combobox("getText");--%>

                <%--    $("#product_"+$(a).attr("index")+"_${timestamp}").combobox("loadData",result.data);--%>
                <%--    $("#product_"+$(a).attr("index")+"_${timestamp}").combobox("setText",t);--%>
                <%--});--%>

            },
            onChange:function (n,o) {
                debugger;
                var a = this;
                if($("#applyDep${timestamp}").val() == "D0001"){
                    //根据研发基本信息产品内码加载PDT
                    var prodlineCode = $("#prodlineCode_"+$(a).attr("index")+"_${timestamp}").val();
                    $.post("/flowable/processConfigItem/getByProdlineCodeFromBase?prodlineCode="+prodlineCode,function (result) {
                        //$("[id^=applys][id$=pdtId${timestamp}]").combobox("loadData",result.data);

                        if(result.data.length == 0){
                            $.get("/flowable/processConfigItem/getPdtList/"+$("#applyDep${timestamp}").val(),function (result) {
                                loadPdt${timestamp}(result,$(a).attr("index"));
                            });
                        }else{
                            loadPdt${timestamp}(result,$(a).attr("index"));
                        }
                    });

                }else{
                    $.get("/flowable/processConfigItem/getPdtList/"+$("#applyDep${timestamp}").val(),function (result) {
                        loadPdt${timestamp}(result,$(a).attr("index"));
                    });
                }

            }
        });
        //产品绑定事件
        $("[id^=product_][id$=_${timestamp}]").combobox({
            onSelect:function (e) {
                var a = this;
                $("#productName_"+$(a).attr("index")+"_${timestamp}").val(e.prodName);
                $("#productNo_"+$(a).attr("index")+"_${timestamp}").val(e.prodNo);
                //$("#span_applys\\["+$(a).attr("index")+"\\]\\.productNo${timestamp}").html(e.prodNo);
            }
        });

        //产品族绑定单击事件
        $("[id^=product_][id$=_${timestamp}]").parent().on("click",function (e) {
            var index = $(this).children(":first").attr("index");
            var prodline = $("#prodline_"+index+"_${timestamp}").combobox("getValue");
            if(prodline == "" || prodline == undefined){
                $("#product_"+index+"_${timestamp}").combobox("hidePanel");
                $.messager.alert('提示','请选择产品线！');
                return;
            }
            debugger;
            var productCode = $("#productCode_"+index+"_${timestamp}").textbox("getValue");
            if(productCode == "" || productCode == undefined){
                $("#product_"+index+"_${timestamp}").combobox("hidePanel");
                $.messager.alert('提示','请选择产品编码！');
                return;
            }
            var prodlineNo = productCode.substring(0,2);
            $.post("/finance/fprod/getByProdlineNameAndNo/"+prodline+"/"+prodlineNo,function (result) {
                var t = $("#product_"+index+"_${timestamp}").combobox("getText");
                $("#product_"+index+"_${timestamp}").combobox("loadData",result.data);
                $("#product_"+index+"_${timestamp}").combobox("setText",t);
            });
            debugger;
        })

        //PDT绑定事件
        $("[id^=pdtId_][id$=_${timestamp}]").combobox({
            onSelect:function (e) {
                var a = this;
                debugger;

                if(e.fprodPerson == "" || e.fprodPerson == undefined){
                    $("#hasPdtMgn${timestamp}").val("false");
                    alert("该PDT没有配置财务接口人，请联系管理员配置！");
                }else {
                    $("#hasPdtMgn${timestamp}").val("true");
                    $("#pdtName_"+$(a).attr("index")+"_${timestamp}").val(e.content);
                    $("#pdtNo_"+$(a).attr("index")+"_${timestamp}").val(e.content);
                }
            },
            onChange:function (n,o) {
                debugger;
                if($("#hasPdtMgn${timestamp}").val()=="false"){
                    $("#hasPdtMgn${timestamp}").val("");
                    $(this).combobox("setValue",o);
                }
            }
        });

        $("#bomCodeWin${timestamp}").window({
            onClose:function () {
                $("#current_bom_index${timestamp}").val("");
                $("#bomTable${timestamp} tbody").html("");
            }
        });



    });

    function InitFProductCodeGrid${timestamp}(){
        var dep = $("#applyDep${timestamp}").val();
        $("#fprodoctCode_grid${timestamp}").datagrid({
            url: "/finance/fproductCode/findByPage",
            pagination: true,//允许分页

            singleSelect: true,//只选择一行
            pageSize: 15,//每一页数据数量
            checkOnSelect: false,
            fitColumns:false, //列宽自适应
            height : 465,
            pageList: [15,20,30,40,50,60],
            queryParams:{
                dep:dep
            },


            columns: [[
                {field: 'id', checkbox: false,hidden:true},
                {field: 'prodlineNo', checkbox: false,hidden:true},
                {field: 'productNo', checkbox: false,hidden:true},
                {field: 'pdtNo', checkbox: false,hidden:true},
                {field: "productCode",title: "产品编码",align: "center",width:100},
                {field: "columngroup",title: "产品型号/模块编码",align: "center",width:100},
                {field: "productNameCn",title: "产品名称",align: "center",width:100},
                {field: "columngroup", title: "产品型号/模块名称", align: "center",width:100},
                {field: "columngroup", title: "代号", align: "center",width:100},
                {field: "prodlineName", title: "所属产品线", align: "center",width:100},
                {field: "status", title: "编码状态", align: "center",width:100,formatter:function (value,row,index) {
                    debugger;
                        if(value=="1"){
                            value = "新增";
                        }else if(value == "2"){
                            value = "改变";
                        }else if(value == "3"){
                            value = "停用";
                        }
                        return value;
                    }},
                {field: "bomCode", title: "BOM编码", align: "center",width:100},
                {field: "effectDate", title: "编码生效日期", align: "center",width:100},
                {field: "columngroup", title: "承担此项目的费用比例", align: "center",width:100},
                {field: "productName", title: "产品族", align: "center",width:100},
                {field: "pdtName", title: "PDT", align: "center",width:100},
                {field: "productNameEn", title: "英文描述", align: "center",width:100}

            ]]
        });
    }

    function layoutWin${timestamp}(index){
        InitFProductCodeGrid${timestamp}();
       // $("#fprodoctCode_grid${timestamp}").datagrid("load");
        $("#searchCodeStr${timestamp}").textbox("clear");
        $("#current_index${timestamp}").val(index);
        $("#fproductCodeWin${timestamp}").window('open');
    }

    function cancle${timestamp}(){
        $("#current_index${timestamp}").val("");
        $("#fproductCodeWin${timestamp}").window('close');
    }

    function confirm${timestamp}() {
        var row = $("#fprodoctCode_grid${timestamp}").datagrid("getSelected");
        doubleClick${timestamp}(row);
    }

    function doubleClick${timestamp}(row) {
        var index = $("#current_index${timestamp}").val();

        for(var key in row){
            if(key == "bomCode"){
                $("#oldBomCode_"+index+"_${timestamp}").val(row[key]);
            }else
            if(key == "basisMaterial"){
                $("#basisMaterial_"+index+"_${timestamp}").val(row[key]);
                $("#fileContent_"+index+"_${timestamp}").html(row[key]);
            }else if(key == "basisMaterialId"){
                $("#basisMaterialId_"+index+"_${timestamp}").val(row[key]);
            }else{
                //alert($("span[id='old_"+key+"_"+index+"_${timestamp}']").length);
                if($("span[id='old_"+key+"_"+index+"_${timestamp}']").length>0){
                    $("span[id='old_"+key+"_"+index+"_${timestamp}']").html(row[key]);
                }
                if($("input[id='old_"+key+"_"+index+"_${timestamp}']").length>0){
                    $("input[id='old_"+key+"_"+index+"_${timestamp}']").val(row[key]);
                }
                if($("input[id='old"+key+"_"+index+"_${timestamp}']").length>0){
                    $("input[id='old"+key+"_"+index+"_${timestamp}']").val(row[key]);
                }
                if(key == "prodlineId"){
                    var prodlineId = row["prodlineId"];
                    $("input[id='old_prodline_"+index+"_${timestamp}']").val(row["prodlineName"]);
                    <%--if(prodlineId == 0){--%>
                    <%--    $("input[id='old_prodline_"+index+"_${timestamp}']").val(row["prodlineName"]);--%>
                    <%--}else{--%>
                    <%--    $("input[id='old_prodline_"+index+"_${timestamp}']").val(row["prodlineId"]);--%>
                    <%--}--%>
                }else if(key == "productId"){
                    var productId = row["productId"];
                    if(productId == 0){
                        $("input[id='old_product_"+index+"_${timestamp}']").val(row["productName"]);
                    }else{
                        $("input[id='old_product_"+index+"_${timestamp}']").val(row["productId"]);
                    }
                }else if(key == "pdtId"){
                    $.get("/flowable/processConfigItem/getById/"+row["pdtId"],function (result) {
                        var pdt = result.data;
                        if(pdt.state == 0){
                            $.messager.alert('警告','该编码的所属PDT已被停用，不会被拷贝','warning');
                            $("input[id='old_pdtState_"+index+"_${timestamp}']").val("0");
                        }else {
                            $("input[id='old_pdtState_"+index+"_${timestamp}']").val("1");
                        }

                    });

                }
            }

        }
        $("#note_"+index+"_${timestamp}").val("");
        $("[copyold='true'][index="+index+"]").each(function () {
            if($(this).attr("etype") == "" || $(this).attr("etype") == undefined){
                $(this).val("");
            }else if($(this).attr("etype") == "span"){
                $(this).html("");
            }else if($(this).attr("etype") == "textbox"){
                $(this).textbox("clear");
            }else if($(this).attr("etype") == "combox"){
                $(this).combobox("clear");
            }
        });
        $("#oldProductCode_"+index+"_${timestamp}").val(row.productCode);
        $("#oldId_"+index+"_${timestamp}").val(row.id);
        //产品编码为7位，且以00结尾则实际位产品族
        var pc = row.productCode;
        debugger;
        if(pc.length == 7 && pc.substring(pc.length-2)=='00'){
            //$("#productNameCn_"+index+"_${timestamp}").textbox("readonly",false);
            //$("#productNameEn_"+index+"_${timestamp}").textbox("readonly",false);
            $("#prodline_"+index+"_${timestamp}").combobox("readonly",false);
            $("#prodlineNameEn_"+index+"_${timestamp}").textbox("readonly",false);
            $("#product_"+index+"_${timestamp}").combobox("readonly",false);
            $("#prodNameEn_"+index+"_${timestamp}").textbox("readonly",false);
            $("#pdtId_"+index+"_${timestamp}").combobox("readonly",false);
        }else{
            //$("#productNameCn_"+index+"_${timestamp}").textbox("readonly",true);
            //$("#productNameEn_"+index+"_${timestamp}").textbox("readonly",true);
            $("#prodline_"+index+"_${timestamp}").combobox("readonly",true);
            $("#prodlineNameEn_"+index+"_${timestamp}").textbox("readonly",true);
            $("#product_"+index+"_${timestamp}").combobox("readonly",true);
            $("#prodNameEn_"+index+"_${timestamp}").textbox("readonly",true);
            $("#pdtId_"+index+"_${timestamp}").combobox("readonly",true);
        }
        cancle${timestamp}();
    }

    function copyOld${timestamp}(index) {
        $("[copyOld='true'][index='"+index+"']").each(function () {
            var id = $(this).prop("id");
            var c = $(this);
            debugger;
            if(id.indexOf("pdt") != -1){
                var state = $("input[id='old_pdtState_"+index+"_${timestamp}']").val();
                if(state == "0"){
                    return false;
                }
            }
            if(id == "bomCode_"+index+"_${timestamp}"){
                //setValue${timestamp}($("#span_bomCode_"+index+"_${timestamp}"),$("#old_bomCode_"+index+"_${timestamp}").html());
                setValue${timestamp}($(this),$("#oldBomCode_"+index+"_${timestamp}").val());
                return true;
            }
            if(id == "prodline_"+index+"_${timestamp}"){
                $("#operateType_"+index+"_${timestamp}").val("auto");
            }
            if("SPAN"==$("#old_"+id).prop("tagName")){
                setValue${timestamp}($(this),$("#old_"+id).html());
                //$(this).val($("#old_"+id).html());
            }else if("INPUT"==$("#old_"+id).prop("tagName")){
                //$(this).val($("#old_"+id).val());

                if(id == "product_"+index+"_${timestamp}"){

                    var prodline = $("#prodline_"+index+"_${timestamp}").combobox("getValue");
                    if(prodline == "" || prodline == undefined){
                        return;
                    }
                    debugger;
                    var productCode = $("#productCode_"+index+"_${timestamp}").textbox("getValue");
                    if(productCode == "" || productCode == undefined){
                        return;
                    }
                    var prodlineNo = productCode.substring(0,2);
                    $.get("/finance/fprod/getByProdlineNameAndNo/"+prodline+"/"+prodlineNo,function (result) {

                        $("#product_"+c.attr("index")+"_${timestamp}").combobox("clear");
                        $("#product_"+c.attr("index")+"_${timestamp}").combobox("loadData",result.data);
                        setValue${timestamp}(c,$("#old_"+id).val());
                    });
                }else{
                    setValue${timestamp}($(this),$("#old_"+id).val());
                }
            }
        });
    }

    function setValue${timestamp}(obj,val) {
        debugger;
        if("textbox"==obj.attr("etype")){
            obj.textbox("setValue",val);
        }else if("combox"==obj.attr("etype")){
            obj.combobox("setValue",val);
        }else if("span"==obj.attr("etype")){
            obj.html(val);
        }else{
            obj.val(val);
        }
        if(obj.prop("id").indexOf("pdtId") != -1){
            //changePdt${timestamp}(obj);
        }
    }

    function searchFCode${timestamp}() {

        $("#fprodoctCode_grid${timestamp}").datagrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchCodeStr${timestamp}").textbox("getValue")
        });
    }
    
    function loadPdt${timestamp}(result,index) {
        var datas = result.data;
        var type = $("#operateType_"+index+"_${timestamp}").val();
        if(type!="auto"){
            $("#pdtId_"+index+"_${timestamp}").combobox("clear");
            $("#pdtId_"+index+"_${timestamp}").combobox("loadData",datas);
            $("#operateType_"+index+"_${timestamp}").val("non-auto");
        }else{
            var flag = false;
            var pdtId = $("#pdtId_"+index+"_${timestamp}").combobox("getValue");
            if(pdtId != undefined && pdtId != ""){
                $.each(datas,function () {
                    if(this.id == pdtId){
                        flag = true;
                        return false;
                    }
                });
            }

            if(!flag && pdtId != undefined && pdtId != ""){
                $.get("/flowable/processConfigItem/getById/"+pdtId,function (result) {
                    datas.push(result.data);
                    $("#pdtId_"+index+"_${timestamp}").combobox("loadData",datas);
                    $("#operateType_"+index+"_${timestamp}").val("non-auto");
                });
            }else{
                $("#pdtId_"+index+"_${timestamp}").combobox("loadData",datas);
                $("#operateType_"+index+"_${timestamp}").val("non-auto");
            }
        }
    }

    function changePdt${timestamp}(obj) {
        if($("#applyDep${timestamp}").val() == "D0001"){
            //根据研发基本信息产品内码加载PDT

            var prodlineCode = $("#prodlineCode_"+obj.attr("index")+"_${timestamp}").val();
            $.post("/flowable/processConfigItem/getByProdlineCodeFromBase?prodlineCode="+prodlineCode,function (result) {
                //$("[id^=applys][id$=pdtId${timestamp}]").combobox("loadData",result.data);

                if(result.data.length == 0){
                    $.get("/flowable/processConfigItem/getPdtList/"+$("#applyDep${timestamp}").val(),function (result) {
                        $("#operateType_"+obj.attr("index")+"_${timestamp}").val("auto");
                        loadPdt${timestamp}(result,obj.attr("index"));
                    });
                }else{
                    $("#operateType_"+obj.attr("index")+"_${timestamp}").val("auto");
                    loadPdt${timestamp}(result,obj.attr("index"));
                }
            });

        }else{
            $.get("/flowable/processConfigItem/getPdtList/"+$("#applyDep${timestamp}").val(),function (result) {
                $("#operateType_"+obj.attr("index")+"_${timestamp}").val("auto");
                loadPdt${timestamp}(result,obj.attr("index"));
            });
        }
    }


</script>

</body>
</html>
