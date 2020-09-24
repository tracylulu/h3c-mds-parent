<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/5/16
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="common/css/bds.css" />
</head>
<body>

<jsp:include page="chooseFile.jsp"/>




<div style="font-size:13px;width: 98%;margin:auto;" >
    <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
        <tr >
            <th>BOM编码</th>
            <th>BOM描述</th>
            <th>产品代码</th>
            <th>对内英文描述</th>
            <th>对外中文描述</th>
            <th>对外英文描述</th>
            <th>商业模式</th>
            <!-- <th>产品线</th> -->
            <th>产品编码</th>
            <th>产品族</th>
            <th>产品中文名称</th>
        </tr>
        <c:forEach var="apply" items="${entity.applys}" varStatus="status">
            <tr>

                <input type="hidden" id="id_${status.index}_${timestamp}" name="applys[${status.index}].id"  value="${apply.id}"/>
                <td width="8%">${apply.projectNo}</td>
                <td width="8%">
                        ${apply.projectName}
                </td>
                <td width="8%">
                        ${apply.productNum}
                </td>
                <td width="8%">
                        ${apply.insideDescEn}
                </td>
                <td width="8%">
                        ${apply.abroadDescCn}
                </td>
                <td width="8%">
                        ${apply.abroadDescEn}
                </td>

                <td width="8%" id="businessModelDesc">
                        ${apply.businessModel}
                </td>
                <%-- <td width="8%">
                    ${apply.prodlineName}
                </td> --%>
                <td width="7%">
                    ${apply.productCode}
                </td>
                <td width="8%">
                    ${apply.productName}
                </td>
                <td width="8%">
                    ${apply.productNameCn}
                </td>
                
            </tr>


        </c:forEach>
    </table>
    <br>
</div>




<script type="text/javascript">
    $(function () {
    	
    	
    });



</script>

</body>
</html>
