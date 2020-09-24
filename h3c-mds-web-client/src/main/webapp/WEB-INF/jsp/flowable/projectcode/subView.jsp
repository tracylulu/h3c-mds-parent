<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
</head>
<body>
<c:set var="e" value="${applyCount-1}"/>
            <c:forEach begin="0" end="${e}" varStatus="status">
                <div style="font-size:13px">
                    <table id="product-code_${status.index}" class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                        <tr >
                            <th align="center">序号</th>
                            <th>项目名称</th>
                            <th>B版本</th>
                            <th>项目编码</th>
                            <th>项目类别</th>

                        </tr>
                        <tr>
                            <td width="10%" rowspan="5" align="center">${status.index+1}</td>
                            <td width="20%">${entity.applys[status.index].proName}</td>
                            <td width="20%">${entity.applys[status.index].bversion}</td>
                            <td width="20%">${entity.applys[status.index].proNumber}</td>
                            <td width="20%">${entity.applys[status.index].proCa}</td>

                        </tr>
                        <tr>
                            <th>所属产品线</th>
                            <th>项目代号</th>
                            <th>项目经理</th>
                            <th>立项时间</th>
                        </tr>
                        <tr>
                            <td width="20%">${entity.applys[status.index].proProdlineNo}</td>
                            <td width="20%">${entity.applys[status.index].proNo}</td>
                            <td width="20%">${entity.applys[status.index].proManager}</td>
                            <td>${entity.applys[status.index].proTime}</td>
                        </tr>
                        <tr>
                            <th>对应的评审点</th>
                            <th>对应的版本</th>
                            <th>依据材料</th>
                            <th>备注</th>
                        </tr>
                        <tr>
                        	<td width="20%">${entity.applys[status.index].proPoint}</td>
                        	<td width="20%">${entity.applys[status.index].versionNo}</td>
                            <td>${entity.applys[status.index].profile}</td>
                            <td>${entity.applys[status.index].remark}</td>
                        </tr>
                        <tr>
                        	<th colspan="5" align="center">项目产品对应表</th>
                        </tr>
                        <tr>
                        	
                        	
                        	<th colspan="5" align="center">服务的产品个数<input value="${entity.applys[status.index].projectProductRelList.size()}"/></th>                        	
                        </tr>
                        <%-- <tr>
                        	<td><input/>  <input onclick="addProduct${timestamp}(this,'${status.index}');" value="确定" type="button"/></td>
                        </tr> --%>
                        <!-- 产品个数 -->
                       
						 <tr>
						 	<th>序号</th>
                            <th>产品名称</th>
                            <th>产品编码</th>
                            <th>所属PDT</th>
                            <th>比例</th>
                        </tr>
                        <c:forEach  var="product" items="${entity.applys[status.index].projectProductRelList}" varStatus="productStatus">
                        <tr id="product_${status.index}">
                        	<td>${productStatus.index + 1}</td>
                        	<td width="20%">${product.productName}</td>
                        	<td width="20%">${product.productCode}</td>
                            <td>${product.pdtName}</td>
                            <td>${product.rate}%</td>
                        </tr>
                        </c:forEach>
                    </table>
                    <br>
                </div>

            </c:forEach>
</body>
</html>