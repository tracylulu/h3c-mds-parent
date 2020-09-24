<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
	<style type="text/css">
		.product-code td span{
			font-weight: normal;
		} 
	</style>
</head>
<body>
<%-- <jsp:include page="chooseFile.jsp"/> --%>
<c:set var="e" value="${applyCount-1}"/>
            <c:forEach begin="0" end="${e}" varStatus="status">
                <div style="font-size:13px">
                    <table id="product-code_${status.index}" class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                        <!--<tr >
                             <th align="center">序号</th>
                            <th>项目名称</th>
                            <th>B版本</th>
                            <th>项目编码</th>
                            <th>项目类别</th> 

                        </tr>-->
                        <tr>
                            <td width="10%" rowspan="4" align="center">${status.index+1}</td>
                            <td width="20%">项目名称:&nbsp;&nbsp;<span>${entity.applys[status.index].proName}</span>
                            </td>
                            <td width="20%">B版本:&nbsp;&nbsp;<span>${entity.applys[status.index].bversion}</span></td>
                            <td width="20%">项目编码:&nbsp;&nbsp;<span>${entity.applys[status.index].proNumber}</span></td>
                            <td width="20%">项目类别:&nbsp;&nbsp;<span>${entity.applys[status.index].proCaName}</span></td>

                        </tr>
                        <!-- <tr>
                            <th>所属产品线</th>
                            <th>项目代号</th>
                            <th>项目经理</th>
                            <th>立项时间</th>
                        </tr> -->
                        <tr>
                            <td width="20%">所属产品线:&nbsp;<span>${entity.applys[status.index].proProdlineName}</span></td>
                            <td width="20%">项目代号:&nbsp;<span>${entity.applys[status.index].proNo}</span></td>
                            <td width="20%">项目经理:&nbsp;<span>${entity.applys[status.index].proManager}</span></td>
                            <td>立项时间:&nbsp;<span>${entity.applys[status.index].proTimeStr}</span></td>
                        </tr>
                        <!-- <tr>
                            <th>对应的评审点</th>
                            <th>对应的版本</th>
                            <th>依据材料</th>
                            <th>备注</th>
                        </tr> -->
                        <tr>
                        	<td width="20%">对应的评审点:&nbsp;<span>${entity.applys[status.index].proPointName}</span></td>
                        	<td width="20%">对应的版本:&nbsp;<span>${entity.applys[status.index].version}</span></td>
                            <td>依据材料:&nbsp;
                            	<%-- <a href="#"  id="fileContent_${status.index}_${timestamp}" onclick="downloadFile${timestamp}('${status.index}')">${entity.applys[status.index].profile}</a>
                    		<input id="profile_${status.index}_${timestamp}" name="applys[${status.index}].profile" value="${entity.applys[status.index].profile}" type="hidden"/>
                    		<input id="profileId_${status.index}_${timestamp}" name="applys[${status.index}].profileId" value="${entity.applys[status.index].profileId}" type="hidden"/>
                            --%> 
                            
                            <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                    		<input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
                    		<a href="#">
                      		  <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="showUeditorContent${timestamp}('${status.index}')">
                   			 </a>
                            
                            </td>
                            <td>备注:&nbsp;<span>${entity.applys[status.index].remark}</span></td>
                        </tr>
                        
                        <!-- <tr>
                        	<th>费用分摊运营商比重(%)</th>
                        	<th>费用分摊非运营商比重(%)</th>
                        	<th>所属PDT</th>
                        </tr> -->
                        <tr>
                        	<td>费用分摊运营商比重(%):&nbsp;<span>${entity.applys[status.index].probizhong}</span></td>
                        	<td>费用分摊非运营商比重(%):&nbsp;<span>${entity.applys[status.index].profbizhong}</span></td>
                        	<td>所属PDT:&nbsp;<span>${entity.applys[status.index].pdtName}</span></td>
                        </tr>
                        <!-- <tr>
                        	<th colspan="5" style="text-align: center">项目产品对应表</th>
                        </tr> -->
                        <tr>
                        	<td colspan="5" style="border: none">
                        	<div style="font-size:16px;display:inline-block; padding:10px 0px;">项目产品对应表&nbsp;</div>
                        	<div style="display:inline-block;margin-left: 40px">
                        	服务的产品个数
                        	<input id="productNum_${status.index}_${timestamp}" value="${entity.applys[status.index].projectProductRelList.size()}"/>
                        	
                        	</div>
                        	
                        	</td>
                        </tr>
                        <!-- 产品个数 -->
                       
						 <tr>
						 	<th>序号</th>
                            <th>产品名称</th>
                            <th>产品编码</th>
                            <th>所属PDT</th>
                            <th>比例(%)</th>
                        </tr>
                        <c:forEach  var="product" items="${entity.applys[status.index].projectProductRelList}" varStatus="productStatus">
                        
                        
                        
                        <c:choose>
                        	<c:when test="${curHandler=='applyer'}">
                        	<tr id="product_${status.index}_${productStatus.index}">
                        	<td align="center">${productStatus.index + 1}</td>
                            <td>
                            	<input value="${product.productName}"  id="applys[${status.index}].projectProductRelList[${productStatus.index}].productName"  name="applys[${status.index}].projectProductRelList[${productStatus.index}].productName">
                            </td>
                            <td>
                            	<input value="${product.productCode}" id="applys[${status.index}].projectProductRelList[${productStatus.index}].productCode"   name="applys[${status.index}].projectProductRelList[${productStatus.index}].productCode">
                            	<button type="button" onclick="selectProduct${timestamp}(${status.index},${productStatus.index})" ;="">&nbsp;&nbsp;&nbsp;</button>
                            </td>
                            <td>
                            	<input value="${product.pdtName}"  id="applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName" name="applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName">
                            </td>
                            <td>
                            	<input value="${product.rate}" id="applys[${status.index}].projectProductRelList[${productStatus.index}].rate" name="applys[${status.index}].projectProductRelList[${productStatus.index}].rate">
                            </td>
                        </tr>
                        	</c:when>
                        	<c:otherwise>
		                        <tr id="product_${status.index}">
		                        	<td align="center">${productStatus.index + 1}</td>
		                        	<td width="20%">${product.productName}</td>
		                        	<td width="20%">${product.productCode} 
		                        		
		                        	</td>
		                            <td>${product.pdtName}</td>
		                            <td>${product.rate}</td>
		                        </tr>
                        		
                        	</c:otherwise>
                        </c:choose>
                        
                        
                        
                        </c:forEach>
                    </table>
                    <br>
                </div>

            </c:forEach>
            <c:choose>
            	<c:when test="${isSubmit == 'show' || curHandler=='applyer'}">
		            <div style="text-align: center">
		    			<a href="#" class="easyui-linkbutton" onclick="submit${timestamp}();" id="sub${timestamp}">提交</a>
		
					</div>
            	</c:when>
            	<c:otherwise></c:otherwise>
            </c:choose>
            
            <div style="margin-left:52%">

   				 <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.applyer}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
			</div>
            <script type="text/javascript">
            	$(function(){
            		
            	})
            
            	//新增产品编码
            function addProduct${timestamp}(obj, index){
            	debugger;
            	var num = $("#productNum_" + index + "_${timestamp}").val();
            	var $table = $("#product-code_" + index);
            	var oldNum = $("tr[id^=product_" + index + "]").size();
            	var start;
            	var actNum;
            	if(oldNum > num){
            		start = oldNum;
            		actNum = oldNum;
            	}else{
            		start = oldNum;
            		actNum = num;
            	}
            	for(var i = start; i < actNum; i++){
            		var $tr = buildTr(index, i);
            		var $firstTd = buildNoTd(i + 1);
            		var $productNameTd = buildTdWithInput("20%", "applys["+ index +"].projectProductRelList[" + i + "].productName", 
            				"applys["+ index +"].projectProductRelList[" + i + "].productName", "", "");
            		var $productCodeTd = buildTdWithInputButton("20%", "applys["+ index +"].projectProductRelList[" + i + "].productCode", 
            				"applys["+ index +"].projectProductRelList[" + i + "].productCode", "", "", index, i);
            		var $pdtNameTd = buildTdWithInput("20%", "applys["+ index +"].projectProductRelList[" + i + "].pdtName", 
            				"applys["+ index +"].projectProductRelList[" + i + "].pdtName", "", "");
            		var $rateTd = buildTdWithInput("20%", "applys["+ index +"].projectProductRelList[" + i + "].rate", 
            				"applys["+ index +"].projectProductRelList[" + i + "].rate", "", "");
    	        	$tr.append($firstTd);
    	        	$tr.append($productNameTd);
    	        	$tr.append($productCodeTd);
    	        	$tr.append($pdtNameTd);
    	        	$tr.append($rateTd);
    	        	$table.append($tr);
            	}
            }
            
            function downloadFile${timestamp}(index) {
                var fileName = $("#profile_"+index+"_${timestamp}").val()
                var fileId = $("#profileId_"+index+"_${timestamp}").val()
                window.open("/flowable/file/downloadFile?fileId="+fileId+"&fileName="+encodeURIComponent(fileName));
            }
            </script>
</body>
</html>