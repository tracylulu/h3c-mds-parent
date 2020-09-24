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
    <style type="text/css">
		.product-code td{
			font-weight: normal;
		} 
	</style>
</head>
<body>
<div id="fproductCodeWin${timestamp}" class="easyui-window" title="对话框" style="width:700px;height:400px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_index${timestamp}" type="hidden" value=""/>
    <table width="100%">
        <tr>
            <td width="88%">
                <table id="fprodoctCode_grid${timestamp}" class="easyui-datagrid"></table>
            </td>
            <td>
                <div style="text-align: center">
                    <a href="#" class="easyui-linkbutton" onclick="confirm${timestamp}();" id="confirm${timestamp}">确认</a>
                </div>
                <div style="text-align: center">
                    <a href="#" class="easyui-linkbutton" onclick="cancle${timestamp}();" id="cancle${timestamp}">取消</a>
                </div>
            </td>
        </tr>
    </table>

</div>

<c:set var="e" value="${applyCount-1}"/>
<c:forEach begin="0" end="${e}" varStatus="status">
    <div id="subDiv_${status.index}_${timestamp}" style="font-size:13px;width: 100%" >
        <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
            <tr >
                <th align="center">序号</th>
                <th>原产品编码</th>
                <th>原产品中文描述</th>
                <th>原产品英文描述</th>
                <th>原产品线描述</th>
                <th>原产品线英文描述</th>
                <th>原产品族描述</th>
                <th>原产品族英文描述</th>
                <th>原属PDT</th>
                <th>原对应的BOM</th>
                <th>依据材料</th>

            </tr>
            <tr>
                <input type="hidden" id="applys[${status.index}].id${timestamp}" name="applys[${status.index}].id"  value="${entity.applys[status.index].id}"/>
                <td width="3%" rowspan="7" align="center">${status.index+1}<input type="hidden" id="applys[${status.index}].orderBy${timestamp}" name="applys[${status.index}].orderBy" value="${status.index+1}"/></td>
                <td width="8%">
                    <span id="old_productCode_${status.index}_${timestamp}">${entity.applys[status.index].oldProductCode}</span>

                </td>
                <td width="8%">
                    <span id="old_productNameCn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameCn}</span>

                </td>
                <td width="8%">
                    <span id="old_productNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameEn}</span>

                </td>
                <td width="8%">
                    <span id="old_prodlineName_${status.index}_${timestamp}">${entity.applys[status.index].oldProdlineName}</span>

                </td>
                <td width="8%">
                    <span id="old_prodlineNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProdlineNameEn}</span>
                </td>
                <td width="8%">
                    <span id="old_productName_${status.index}_${timestamp}">${entity.applys[status.index].oldProductName}</span>

                </td>
                <td width="8%">
                    <span id="old_prodNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProdNameEn}</span>
                </td>
                <td width="8%">
                    <span id="old_pdtName_${status.index}_${timestamp}">${entity.applys[status.index].oldPdtName}</span>

                </td>

                <td width="8%">
<%--                    <c:set var="oldBomCodes" value="${fn:split(entity.applys[status.index].oldBomCode,';')}"/>--%>
<%--                    <c:forEach var="oldBomCode" items="${oldBomCodes}">--%>
<%--                        <div>${oldBomCode}</div>--%>
<%--                    </c:forEach>--%>
                    <textarea readonly="true" style="width: 100%;height: 70px;"  >${entity.applys[status.index].oldBomCode}</textarea>
                </td>
                <td width="8%">
                    <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                    <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
                    <a href="#">
                        <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="showUeditorContent${timestamp}('${status.index}')">
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
                <th>现对应的BOM</th>
                <th>备注</th>
            </tr>
            <tr>
                <td>
                    ${entity.applys[status.index].productCode}
                </td>
                <td>
                    ${entity.applys[status.index].productNameCn}
                </td>
                <td>
                    ${entity.applys[status.index].productNameEn}
                </td>
                <td>
                    ${entity.applys[status.index].prodlineName}
                </td>
                <td>
                        ${entity.applys[status.index].prodlineNameEn}
                </td>
                <td>
                    ${entity.applys[status.index].productName}
                </td>
                <td>
                    ${entity.applys[status.index].prodNameEn}
                </td>
                <td>
                    ${entity.applys[status.index].pdtName}
                </td>
                <td>
<%--                    <c:set var="bomCodes" value="${fn:split(entity.applys[status.index].bomCode,';')}"/>--%>
<%--                    <c:forEach var="bomCode" items="${bomCodes}">--%>
<%--                        <div>${bomCode}</div>--%>
<%--                    </c:forEach>--%>
                    <textarea readonly="true" style="width: 100%;height: 70px;"  >${entity.applys[status.index].bomCode}</textarea>
                </td>
                <td>

                    <textarea readonly="true" style="width: 100%;height: 70px;"  >${entity.applys[status.index].note}</textarea>
                </td>
            </tr>
        </table>
        <br>
    </div>

</c:forEach>

<div style="margin-left:52%">

    <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.subSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.submitDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
</div>
<script type="text/javascript">
    function downloadFile${timestamp}(index) {
        var fileName = $("#basisMaterial_"+index+"_${timestamp}").val()
        var fileId = $("#basisMaterialId_"+index+"_${timestamp}").val()
        window.open("/flowable/file/downloadFile?fileId="+fileId+"&fileName="+encodeURIComponent(fileName));
    }
</script>

</body>
</html>
