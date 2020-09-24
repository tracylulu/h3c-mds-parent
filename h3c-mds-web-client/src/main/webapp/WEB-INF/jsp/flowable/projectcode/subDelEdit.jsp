<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
		.product-code td{
			font-weight: normal;
		} 
	</style>
</head>
<body>
	            <c:set var="e" value="${applyCount-1}"/>
            <c:forEach begin="0" end="${e}" varStatus="status">
                <div style="font-size:13px">
                    <table id="product-code_${status.index}" class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                        <tr >
                            <th align="center">序号</th>
                            <th>项目名称</th>
                            <th>项目代号</th>
                            <th>项目编码</th>
                            <th>所属PDT</th>
                            <th>项目经理</th>
                            <th>对应的评审点</th>
                            <th>依据材料</th>
                            <th>备注</th>

                        </tr>
                        <tr>
                            <td width="11%" rowspan="5" align="center">${status.index+1}</td>
                            <td width="11%">${entity.applys[status.index].proName}
                            <%-- <input id="applys[${status.index}].proName" name="applys[${status.index}].proName" value="${entity.applys[status.index].proName}"/> --%>
                            </td>
                            
                            <td width="11%">${entity.applys[status.index].proNo}
                            <%-- <input id="applys[${status.index}].proNo" name="applys[${status.index}].proNo" value="${entity.applys[status.index].proNo}"/> --%>
                            </td>
                            
                            <td width="11%">${entity.applys[status.index].proNumber}
                            	<%-- <input id="applys[${status.index}].proNumber" name="applys[${status.index}].proNumber" value="${entity.applys[status.index].proNumber}"/>
                            	<button type="button" onclick="selectProject${timestamp}('${status.index}');">&nbsp;&nbsp;&nbsp;</button> --%>
                            </td>
                             <td width="11%">${entity.applys[status.index].pdtName}</td>
                             
                            <td width="11%">${entity.applys[status.index].proManager}
                            <%-- <input id="applys[${status.index}].proManager" name="applys[${status.index}].proManager" value="${entity.applys[status.index].proManager}"/> --%>
                            </td>
                            <td width="11%">${entity.applys[status.index].proPointName}
                            	<%-- <input id="applys[${status.index}].proPoint" name="applys[${status.index}].proPoint" value="${entity.applys[status.index].proPoint}"/> --%>
                            </td>

							<td width="11%">
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
							<td width="11%">${entity.applys[status.index].remark}
								<%-- <input id="applys[${status.index}].remark" name="applys[${status.index}].remark" value="${entity.applys[status.index].remark}"/> --%>
							</td>
                        </tr>
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
            function downloadFile${timestamp}(index) {
                var fileName = $("#profile_"+index+"_${timestamp}").val()
                var fileId = $("#profileId_"+index+"_${timestamp}").val()
                window.open("/flowable/file/downloadFile?fileId="+fileId+"&fileName="+encodeURIComponent(fileName));
            }
            </script>
</body>
</html>