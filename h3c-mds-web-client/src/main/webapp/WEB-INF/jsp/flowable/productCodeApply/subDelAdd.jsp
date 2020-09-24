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

    <link rel="stylesheet" type="text/css" href="common/css/bds.css" />
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
<jsp:include page="chooseFile.jsp"/>
<c:set var="e" value="${applyCount-1}"/>
<c:forEach begin="0" end="${e}" varStatus="status">
    <div id="subDiv_${status.index}_${timestamp}" style="font-size:13px;width: 100%" >
        <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
            <tr >
                <th align="center">序号</th>
                <th>产品编码</th>
                <th>产品中文描述</th>
                <th>产品英文描述</th>
<%--                <th>产品线描述</th>--%>
<%--                <th>产品线英文描述</th>--%>
<%--                <th>产品族描述</th>--%>
<%--                <th>产品族中文描述</th>--%>
                <th>属PDT</th>
                <th>依据材料</th>
                <th>备注</th>

            </tr>
            <tr>
                <input type="hidden" id="applys[${status.index}].id${timestamp}" name="applys[${status.index}].id"  value="${entity.applys[status.index].id}"/>
                <input type="hidden" id="oldId_${status.index}_${timestamp}" name="applys[${status.index}].oldId"  value="${entity.applys[status.index].oldId}"/>
                <td width="3%" rowspan="7" align="center">${status.index+1}<input type="hidden" id="applys[${status.index}].orderBy${timestamp}" name="applys[${status.index}].orderBy" value="${status.index+1}"/></td>
                <td width="8%">
                    <span id="old_productCode_${status.index}_${timestamp}">${entity.applys[status.index].oldProductCode}</span>
                    <input  index="${status.index}"  id="oldproductCode_${status.index}_${timestamp}" name="applys[${status.index}].oldProductCode" value="${entity.applys[status.index].oldProductCode}" type="hidden"/>
<%--                    <button type="button" onclick="layoutWin${timestamp}('${status.index}')">&nbsp;&nbsp;&nbsp;</button>--%>
                    <a  href="javascript:void(0)" style="text-align: right;height: 24px;"
                        class="easyui-linkbutton" onclick="layoutWin${timestamp}('${status.index}');">选择</a>

                </td>
                <td width="8%">
                    <span id="old_productNameCn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameCn}</span>
                    <input id="oldproductNameCn_${status.index}_${timestamp}" name="applys[${status.index}].oldProductNameCn" type="hidden" value="${entity.applys[status.index].oldProductNameCn}">
                </td>
                <td width="8%">
                    <span id="old_productNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameEn}</span>
                    <input id="oldproductNameEn_${status.index}_${timestamp}" name="applys[${status.index}].oldProductNameEn" value="${entity.applys[status.index].oldProductNameEn}" type="hidden"/>
                </td>
<%--                <td width="8%">--%>
<%--                    <span id="old_prodlineName_${status.index}_${timestamp}">${entity.applys[status.index].oldProdlineName}</span>--%>
<%--                    <input id="oldprodlineName_${status.index}_${timestamp}" name="applys[${status.index}].oldProdlineName" value="${entity.applys[status.index].oldProdlineName}" type="hidden"/>--%>
<%--                    <input id="old_prodlineNo_${status.index}_${timestamp}" name="applys[${status.index}].oldProdlineNo" value="${entity.applys[status.index].oldProdlineNo}" type="hidden">--%>
<%--                </td>--%>
<%--                <td width="8%"></td>--%>
<%--                <td width="8%">--%>
<%--                    <span id="old_productName_${status.index}_${timestamp}">${entity.applys[status.index].oldProductName}</span>--%>
<%--                    <input id="oldproductName_${status.index}_${timestamp}" name="applys[${status.index}].oldProductName" value="${entity.applys[status.index].oldProductName}" type="hidden"/>--%>
<%--                    <input id="old_productNo_${status.index}_${timestamp}" name="applys[${status.index}].oldProductNo" value="${entity.applys[status.index].oldProductNo}" type="hidden">--%>
<%--                </td>--%>
<%--                <td width="8%"></td>--%>
                <td width="8%">
                    <span id="old_pdtName_${status.index}_${timestamp}">${entity.applys[status.index].oldPdtName}</span>
                    <input id="oldpdtName_${status.index}_${timestamp}" name="applys[${status.index}].oldPdtName" value="${entity.applys[status.index].oldPdtName}" type="hidden"/>
                    <input id="old_pdtNo_${status.index}_${timestamp}" name="applys[${status.index}].oldPdtNo" value="${entity.applys[status.index].oldPdtNo}" type="hidden">
                    <input id="old_pdtId_${status.index}_${timestamp}" name="applys[${status.index}].oldPdtId" value="${entity.applys[status.index].oldPdtId}" type="hidden">
                </td>

                <td width="8%">
                    <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                    <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
                    <a href="#">
                        <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}('${status.index}')">
                    </a>
                </td>
                <td width="8%">

                    <input etype="textbox" copyOld="false" index="${status.index}" class="easyui-textbox" data-options="required:true,width:'100%'" id="note_${status.index}_${timestamp}" name="applys[${status.index}].note" value="${entity.applys[status.index].note}"/>
                </td>
            </tr>

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
        //InitFProductCodeGrid${timestamp}();
        $.parser.parse($("#subForm111${timestamp}"));
        $('#fprodoctCode_grid${timestamp}').datagrid({
            onDblClickRow : function(rowIndex,rowData) {
                doubleClick${timestamp}(rowData);
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
            //alert($("span[id='old_"+key+"_"+index+"_${timestamp}']").length);
            if(key == "basisMaterial"){
                $("#basisMaterial_"+index+"_${timestamp}").val(row[key]);
                $("#fileContent_"+index+"_${timestamp}").html(row[key]);
            }else if(key == "basisMaterialId"){
                $("#basisMaterialId_"+index+"_${timestamp}").val(row[key]);
            }if($("span[id='old_"+key+"_"+index+"_${timestamp}']").length>0){
                $("span[id='old_"+key+"_"+index+"_${timestamp}']").html(row[key]);
            }
            if($("input[id='old_"+key+"_"+index+"_${timestamp}']").length>0){
                $("input[id='old_"+key+"_"+index+"_${timestamp}']").val(row[key]);
            }
            if($("input[id='old"+key+"_"+index+"_${timestamp}']").length>0){
                $("input[id='old"+key+"_"+index+"_${timestamp}']").val(row[key]);
            }
        }
        $("#oldProductCode_"+index+"_${timestamp}").val(row.productCode);
        $("#oldId_"+index+"_${timestamp}").val(row.id);
        cancle${timestamp}();
    }

    function downloadFile${timestamp}(index) {
        var fileName = $("#basisMaterial_"+index+"_${timestamp}").val()
        var fileId = $("#basisMaterialId_"+index+"_${timestamp}").val()
        window.open("/flowable/file/downloadFile?fileId="+fileId+"&fileName="+encodeURIComponent(fileName));
    }

    function searchFCode${timestamp}() {

        $("#fprodoctCode_grid${timestamp}").datagrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchCodeStr${timestamp}").textbox("getValue")
        });
    }

</script>

</body>
</html>
