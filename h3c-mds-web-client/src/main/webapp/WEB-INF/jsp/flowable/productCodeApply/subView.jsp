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
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="common/css/bds.css" />
</head>
<body>
<c:set var="e" value="${applyCount-1}"/>
<c:forEach begin="0" end="${e}" varStatus="status">
    <div style="font-size:13px">
        <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
            <tr >
                <td width="10%" align="center" rowspan="4" style="background-color:#ffffff">${status.index+1}</td>
                <td width="24%">产品线名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entity.applys[status.index].prodlineName}</td>
                <td width="24%">产品族名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entity.applys[status.index].productName}</td>
                <td width="18%">所属PDT:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entity.applys[status.index].pdtName}</td>
                <td width="14%">PDT经理:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<ibds:userAccount account="${entity.applys[status.index].pdtMng}"/></td>

            </tr>
            <tr>
                <td>产品线编码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entity.applys[status.index].prodlineNo}</td>
                <td>产品族编码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entity.applys[status.index].productNo}</td>
                <td colspan="2">产品编码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${entity.applys[status.index].productCode}</td>
            </tr>

            <tr>
                <td>产品中文描述:&nbsp;&nbsp;&nbsp;${entity.applys[status.index].productNameCn}</td>
                <td>产品英文描述:&nbsp;&nbsp;&nbsp;${entity.applys[status.index].productNameEn}</td>
                <td colspan="2">依据材料:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                    <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                    <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
                    <a href="#">
                        <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="showUeditorContent${timestamp}('${status.index}')">
                    </a>
                </td>
            </tr>

            <tr>
                <td>
                    <div style="float: left;">对应的BOM:&nbsp;&nbsp;&nbsp;</div>
<%--                    <div style="float: right">--%>
<%--                        <div id="span_bomCode_${status.index}_${timestamp}">--%>
<%--                            <c:set var="bomCodes" value="${fn:split(entity.applys[status.index].bomCode,';')}"/>--%>
<%--                            <c:forEach var="bomCode" items="${bomCodes}">--%>
<%--                                <div>${bomCode}</div>--%>
<%--                            </c:forEach>--%>
<%--                        </div>--%>

<%--                    </div>--%>
                    <textarea readonly="true" style="width: 80%;height: 70px;"  >${entity.applys[status.index].bomCode}</textarea>
                </td>
                <td>
                    <div style="float: left;">BOM描述:&nbsp;&nbsp;&nbsp;</div>
<%--                    <c:set var="bomDescs" value="${fn:split(entity.applys[status.index].bomDesc,';')}"/>--%>
<%--                    <c:forEach var="bomDesc" items="${bomDescs}">--%>
<%--                        <div>${bomDesc}</div>--%>
<%--                    </c:forEach>--%>
                    <textarea readonly="true" style="width: 80%;height: 70px;"   >${entity.applys[status.index].bomDesc}</textarea>
                </td>
                <td colspan="2">
                    <div style="float: left;">备注:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>

                    <textarea readonly="true" style="width: 80%;height: 70px;"   >${entity.applys[status.index].note}</textarea>
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
