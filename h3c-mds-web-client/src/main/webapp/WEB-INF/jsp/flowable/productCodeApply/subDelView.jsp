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
                <td width="3%" rowspan="7" align="center">
                        ${status.index+1}
                </td>
                <td width="8%">
                    <span id="old_productCode_${status.index}_${timestamp}">${entity.applys[status.index].oldProductCode}</span>
                </td>
                <td width="8%">
                    <span id="old_productNameCn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameCn}</span>
                </td>
                <td width="8%">
                    <span id="old_productNameEn_${status.index}_${timestamp}">${entity.applys[status.index].oldProductNameEn}</span>
                </td>
<%--                <td width="8%">--%>
<%--                    <span id="old_prodlineName_${status.index}_${timestamp}">${entity.applys[status.index].oldProdlineName}</span>--%>
<%--                </td>--%>
<%--                <td width="8%"></td>--%>
<%--                <td width="8%">--%>
<%--                    <span id="old_productName_${status.index}_${timestamp}">${entity.applys[status.index].oldProductName}</span>--%>
<%--                </td>--%>
<%--                <td width="8%"></td>--%>
                <td width="8%">
                    <span id="old_pdtName_${status.index}_${timestamp}">${entity.applys[status.index].oldPdtName}</span>
                </td>

                <td width="8%">
                    <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                    <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
                    <a href="#">
                        <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="showUeditorContent${timestamp}('${status.index}')">
                    </a>
                </td>
                <td width="8%">
                    <span id="old_pdtName_${status.index}_${timestamp}">${entity.applys[status.index].note}</span>
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
