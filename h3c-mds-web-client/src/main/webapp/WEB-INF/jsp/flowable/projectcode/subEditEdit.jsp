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
	.product-code th{
			width:4%;
		}
	.product-code td{
			width:4%;
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
                        <tr >
                            <th align="center">序号</th>
                            <th>原项目名称</th>
                            <th>原项目代号</th>
                            <th>原项目编码</th>
                            <th>原所属产品线</th>
                            <th>原项目类别</th>
                            <th>原对应的版本</th>
                            <th>原对应的B版本</th>
                            <th>原项目经理</th>
                            <th>原费用分摊运营商比例(%)</th>
                            <th>原费用分摊非运营商比例(%)</th>
                            <th>依据材料</th>
                        </tr>
                        <tr>
                            <td width="10%" rowspan="3" align="center">${status.index+1}</td>
                            <td width="20%"  id="oldApplys[${status.index}].proName">${entity.applys[status.index].oldProName}
                            	<%-- <input  name="applys[${status.index}].proName" value="${entity.applys[status.index].proName}"/> --%>
                            <td width="20%" id="oldApplys[${status.index}].proNo">${entity.applys[status.index].oldProNo}
                           <%--  <input id="oldApplys[${status.index}].proNo" name="applys[${status.index}].proNo" value="${entity.applys[status.index].proNo}"/> --%>
                            </td>
                            <td width="20%" >
                            	<span id="oldApplys[${status.index}].proNumber" >${entity.applys[status.index].oldProNumber}</span>
                            	<%-- <input id="oldApplys[${status.index}].proNumber" name="applys[${status.index}].proNumber" value="${entity.applys[status.index].proNumber}"/> --%>
                            	<%-- <button type="button" onclick="selectOldProject${timestamp}('${status.index}')">&nbsp;&nbsp;&nbsp;</button> --%>
                            </td>
                            <td width="20%" id="oldApplys[${status.index}].proProdlineName">${entity.applys[status.index].oldProProdlineName}
                           <%--  <input id="oldApplys[${status.index}].proProdlineNo" name="applys[${status.index}].proProdlineNo" value="${entity.applys[status.index].proProdlineNo}"/> --%>
                            </td>
                            <td width="20%" id="oldApplys[${status.index}].proCaName">${entity.applys[status.index].oldProCaName}
                            	<%-- <input id="oldApplys[${status.index}].proCa" name="applys[${status.index}].proCa" value="${entity.applys[status.index].proCa}"/> --%>
                            </td>
                        	<td width="20%" id="oldApplys[${status.index}].versionNo">${entity.applys[status.index].oldVersion}
                        	<td width="20%" id="oldApplys[${status.index}].bversion">${entity.applys[status.index].oldBversion}
                        		<%-- <input id="oldApplys[${status.index}].versionNo" name="applys[${status.index}].versionNo" value="${entity.applys[status.index].versionNo}"/> --%>
                        	</td>
                            <td width="20%" id="oldApplys[${status.index}].proManager">${entity.applys[status.index].oldProManager}
                            	<%-- <input id="oldApplys[${status.index}].proManager" name="applys[${status.index}].proManager" value="${entity.applys[status.index].proManager}"/> --%>
                            </td>
                            <td width="20%" id="oldApplys[${status.index}].probizhong">${entity.applys[status.index].oldProbizhong}
                            	<%-- <input id="oldApplys[${status.index}].probizhong" name="applys[${status.index}].probizhong" value="${entity.applys[status.index].probizhong}"/> --%>
                            </td>
                            <td width="20%" id="oldApplys[${status.index}].profbizhong">${entity.applys[status.index].oldProfbizhong}
                            	<%-- <input id="oldApplys[${status.index}].profbizhong" name="applys[${status.index}].profbizhong" value="${entity.applys[status.index].profbizhong}"/> --%>
                            	</td>
                            <%-- <td id="oldApplys[${status.index}].profile">${entity.applys[status.index].oldProfile}
                            	<input id="oldApplys[${status.index}].profile" name="applys[${status.index}].profile" value="${entity.applys[status.index].profile}"/>
                            </td> --%>
                            <td><%-- ${entity.applys[status.index].profile} --%>
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
                            

                        
                        </tr>
                        <tr >
                            <th>项目名称</th>
                            <th>项目代号</th>
                            <th>项目编码</th>
                            <th>所属产品线</th>
                            <th>项目类别</th>
                            <th>对应的版本</th>
                            <th>对应的B版本</th>
                            <th>项目经理</th>
                            <th>费用分摊运营商比例(%)</th>
                            <th>费用分摊非运营商比例(%)</th>
                            <th>备注</th>
                        </tr>
                        <tr>
                            
                            <td width="20%">${entity.applys[status.index].proName}
                            	<%-- <input id="applys[${status.index}].proName" name="applys[${status.index}].proName" value="${entity.applys[status.index].proName}" readonly="readonly"/> --%>
                            	<%-- <button type="button" onclick="copyProject${timestamp}('${status.index}');">复制</button> --%>
                            </td>
                            <td width="20%">${entity.applys[status.index].proNo}
                            	<%-- <input id="applys[${status.index}].proNo" name="applys[${status.index}].proNo" value="${entity.applys[status.index].proNo}" readonly="readonly"/> --%>
                            </td>
                            <td width="20%">${entity.applys[status.index].proNumber}
                            	<%-- <input id="applys[${status.index}].proNumber" name="applys[${status.index}].proNumber" value="${entity.applys[status.index].proNumber}"  readonly="readonly"/> --%>
                            	<%-- <button type="button" onclick="selectProject${timestamp}('${status.index}');">&nbsp;&nbsp;&nbsp;</button> --%>
                            </td>
                            <td width="20%">${entity.applys[status.index].proProdlineName}
                            	<%-- <input id="applys[${status.index}].proProdlineName" name="applys[${status.index}].proProdlineName" value="${entity.applys[status.index].proProdlineName}"  readonly="readonly"/> --%>
                            </td>
                            <td width="20%">${entity.applys[status.index].proCaName}
                            	<%-- <input id="applys[${status.index}].proCaName" name="applys[${status.index}].proCaName" value="${entity.applys[status.index].proCaName}"  readonly="readonly"/> --%>
                            </td>
                        	<td width="20%">${entity.applys[status.index].version}
                        		<%-- <input id="applys[${status.index}].version" name="applys[${status.index}].version" value="${entity.applys[status.index].version}"  readonly="readonly"/> --%>
                        	</td>
                            <td width="20%">${entity.applys[status.index].bversion}
                            	<%-- <input id="applys[${status.index}].bversion" name="applys[${status.index}].bversion" value="${entity.applys[status.index].bversion}"  readonly="readonly"/> --%>
                            </td>
                            <td width="20%">${entity.applys[status.index].proManager}
                            	<%-- <input id="applys[${status.index}].proManager" name="applys[${status.index}].proManager" value="${entity.applys[status.index].proManager}"  readonly="readonly"/> --%>
                            </td>
                            <td width="20%">${entity.applys[status.index].probizhong}
                            	<%-- <input id="applys[${status.index}].probizhong" name="applys[${status.index}].probizhong" value="${entity.applys[status.index].probizhong}"  readonly="readonly"/> --%>
                            </td>
                            <td width="20%">${entity.applys[status.index].profbizhong}
                            	<%-- <input id="applys[${status.index}].profbizhong" name="applys[${status.index}].profbizhong" value="${entity.applys[status.index].profbizhong}"  readonly="readonly"/> --%>
                            </td>
                            <td>${entity.applys[status.index].remark}
                            	<%-- <input id="applys[${status.index}].remark" name="applys[${status.index}].remark" value="${entity.applys[status.index].remark}"  readonly="readonly"/> --%>
                            </td>
                            
                        </tr>
<!--                         <tr>
                        	<th colspan="10" style="text-align: center">项目产品对应表</th>
                        </tr>
 -->                        <tr>
                        	<th colspan="11">
                        	<div style="font-size:16px;display:inline-block; padding:10px 0px;">项目产品对应表&nbsp;</div>
                        	<div style="display:inline-block;margin-left: 40px">
			                        	<%-- <input onclick="showOldProduct${timestamp}('${status.index}')" value="显示原服务产品" type="button"/> --%>
			                        	服务的产品个数
			                        	<input id="productNum_${status.index}_${timestamp}" value="${entity.applys[status.index].projectProductRelList.size()}"/>
			                        	<%-- <input onclick="addProduct${timestamp}(this,'${status.index}');" value="确定" type="button"/> --%>
			                        	
			                        	<input type="hidden" id="isCopy_${status.index}_${timestamp}" />
		                        		<input type="hidden" id="isNew_${status.index}_${timestamp}" />
		                     </div>
                        	</th>
                        	
                        </tr>
                        <!-- 产品个数 -->
                       
						 <tr>
						 	<th>序号</th>
                            <th colspan="2">原服务的产品中文名称</th>
                            <th colspan="2">现服务的产品中文描述</th>
                            <th>原所属PDT</th>
                            <th>现所属PDT</th>
                            <th>原服务的产品编码</th>
                            <th>现服务的产品编码</th>
                            <th>原此产品分摊的项目费用比例(%)</th>
                            <th>现此产品分摊的项目费用比例(%)</th>
                        </tr>
                       <c:forEach  var="product" items="${entity.applys[status.index].projectProductRelList}" varStatus="productStatus">
                        
                        
                        
                        
		                        <tr id="product_${status.index}">
		                        	<td align="center">${productStatus.index + 1}</td>
		                        	<td width="20%"  colspan="2">${product.oldProductName}</td>
		                        	<td width="20%"  colspan="2">${product.productName}</td>
		                            <td width="20%">${product.oldPdtName}</td>
		                            <td width="20%">${product.pdtName}</td>
		                        	<td >${product.oldProductCode} </td>
		                        	<td width="20%">${product.productCode} </td>
		                            <td>${product.oldRate}</td>
		                            <td>${product.rate}</td>
		                        </tr>
                        		
                        	
                        
                        
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
            
            <!-- <script type="text/javascript">
            	
            	
            function selectOldProject${timestamp}(projectIndex){
            	//alert("projectIndex === " + projectIndex)
            	$("#tmpprojectIndex${timestamp}").val(projectIndex)
            	$('#winOldProjectCode${timestamp}').window({  
    			    iconCls:"icon-save",
    			    modal:true   
    			});
            	 $('#oldProjectCode${timestamp}').datagrid({
                   url: "finance/fprojectCode/findByPage",
                   pagination: true,//允许分页

                   singleSelect: true,//只选择一行
                   pageSize: 15,//每一页数据数量
                   checkOnSelect: false,
                   fitColumns:false, //列宽自适应
                   height : 355,
                   pageList: [15,20,30,40,50,60],
                   columns: [[
                       
                       /* {field: 'pdtNo', checkbox: false,hidden:true}, */
                       {field: "fProjno",title: "项目编码",align: "center",width:100},
                       {field: "fProjname",title: "项目名称",align: "center",width:100},
                       {field: "fObjca",title: "项目类别",align: "center",width:100},
                       {field: "fProjmng", title: "项目经理", align: "center",width:100},
                       {field: "fProductlineno", title: "所属产品线", align: "center",width:100},
                       {field: "fProductno", title: "服务的产品编码", align: "center",width:100},
                       {field: "fProductname", title: "服务的产品名称", align: "center",width:100},
                       {field: "rate", title: "此产品应分摊的项目比例", align: "center",width:100},
                       {field: "begintime", title: "编码生效日期", align: "center",width:100},
                       {field: "fReleaseno", title: "对应版本", align: "center",width:100},
                       {field: "fPdtno", title: "所属PDT", align: "center",width:100},
                       {field: "fAssignPoint", title: "对应评审点", align: "center",width:100},
                       {field: "fBizhong", title: "项目分摊运营商比重", align: "center",width:100},
                       {field: "fFbizhong", title: "项目分摊非运营商比重", align: "center",width:100}
                   ]],
                  
                   onLoadError : function(){
                	   alert("error");
                   },
                   onDblClickRow : function(index, row){
                	 $('#winOldProjectCode${timestamp}').window("close");
                	   //alert($("#tmpprojectIndex${timestamp}").val())
                	   var projectIndex = $("#tmpprojectIndex${timestamp}").val();
                	    $("#oldApplys\\[" +projectIndex + "\\]\\.proName").html(row.fProjname);
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.proNo").html(row.fProjcode);
                	   
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.proNumber").html(row.fProjno);
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineNo").html(row.fProductname);
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.proCa").html(row.fObjca);
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.versionNo").html(row.fReleaseno);
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.proManager").html(row.fProjmng);
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.probizhong").html(row.fBizhong);
                	   	$("#oldApplys\\[" +projectIndex + "\\]\\.profbizhong").html(row.fFbizhong);
                	   $("#oldApplys\\[" +projectIndex + "\\]\\.profile").html(row.fProfile); 
                	   
                   }
               });
        	}
            
            
            	//拷贝
            	function copyProject${timestamp}(projectIndex){
            		
            	   $("#applys\\[" +projectIndex + "\\]\\.proName").val($("#oldApplys\\[" +projectIndex + "\\]\\.proName").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.proNo").val($("#oldApplys\\[" +projectIndex + "\\]\\.proNo").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.proNumber").val($("#oldApplys\\[" +projectIndex + "\\]\\.proNumber").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.proProdlineNo").val($("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineNo").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.proCa").val($("#oldApplys\\[" +projectIndex + "\\]\\.proCa").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.versionNo").val($("#oldApplys\\[" +projectIndex + "\\]\\.versionNo").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.proManager").val($("#oldApplys\\[" +projectIndex + "\\]\\.proManager").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.probizhong").val($("#oldApplys\\[" +projectIndex + "\\]\\.probizhong").html());
               	   $("#applys\\[" +projectIndex + "\\]\\.profbizhong").val($("#oldApplys\\[" +projectIndex + "\\]\\.profbizhong").html());
            	}
            	
            
            	
            	//显示原来的产品编码
            	 function showOldProduct${timestamp}(projectIndex){
            		//项目编码
            		var projNumber = $("#oldApplys\\[" +projectIndex + "\\]\\.proNumber").val();
            		var $table = $("#product-code_" + projectIndex);
            		
            		//根据项目编码查询出相关的产品
            		$.ajax({
                        type: "GET",
                        url: "finance/fprojectCode/findProductByProjNo?projNo=" + 1,                        
                        dataType: "json",
                        success: function(data){
                        	var isNew = $("#isNew_" + projectIndex + "_${timestamp}").val();
                        	var isCopy = $("#isCopy_" + projectIndex + "_${timestamp}").val();
                        	//如果先点击显示原来的产品编码
                        	var oldProductNum = data.total;
                        	//第一次点击
                        	if(!isCopy && !isNew){
                        		$("#isCopy_" + projectIndex + "_${timestamp}").val(oldProductNum);
                                for(var i = 0; i < oldProductNum; i++){
                                	var $tr = buildTr(projectIndex, i);
                                	var $firstTd = buildNoTd(i + 1);
                                	var $oldProductNameTd = buildOldProductTdColspan(i, data.rows[i].PRODUCT_NAME_CN, 2);
                            		var $productNameTd = buildTdWithInputColSpan("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", "", "", 2);
                            		var $oldProductCodeTd = buildOldProductTd(i, data.rows[i].f_product_code);
                            		var $productCodeTd = buildTdWithInputButton("30%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", "", "", projectIndex, i);
                            		var $oldPdtNameTd = buildOldProductTd(i, "ptd_NNNNO");
                            		var $pdtNameTd = buildTdWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", "", "");
                            		var $oldRateTd = buildOldProductTd(i, data.rows[i].rate);
                            		var $rateTd = buildTdWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", "", "");
                    	        	$tr.append($firstTd);
                    	        	$tr.append($oldProductNameTd);
                    	        	$tr.append($productNameTd);
                    	        	$tr.append($oldPdtNameTd);
                    	        	$tr.append($pdtNameTd);
                    	        	$tr.append($oldProductCodeTd);
                    	        	$tr.append($productCodeTd);
                    	        	$tr.append($oldRateTd);
                    	        	$tr.append($rateTd);
                    	        	$table.append($tr);
                                }
                        	}else if(isNew){//显示新增的产品编码
                        		if(oldProductNum > isNew){
                        			
                        			
                        		}else{
                        			//在原有基础上面赋值
                        		}
                        	}
                                    
                             },
                        error:function(e){
                        	
                             console.log(e);
                        }
                    });
            		
            		
            		
            	
            		
            	}
            	
            	 //新增产品编码
                 function addProduct${timestamp}(obj, projectIndex){
                	
                	var isNew = $("#isNew_" + projectIndex + "_${timestamp}").val();
                	var isCopy = $("#isCopy_" + projectIndex + "_${timestamp}").val();
                	
               		var num = $("#productNum_" + projectIndex + "_${timestamp}").val();
               		//第一次点击
                	if(!isCopy && !isNew){
                		$("#isNew_" + projectIndex + "_${timestamp}").val(num);
                    	var $table = $("#product-code_" + projectIndex);
                    	$("tr[id^=product_" + projectIndex + "_]").remove();
                    	for(var i = 0; i < num; i++){
                    		var $tr = buildTr(projectIndex, i);
                        	var $firstTd = buildNoTd(i + 1);
                        	var $oldProductNameTd = buildOldProductTdColspan(i, "", 2);
                    		var $productNameTd = buildTdWithInputColSpan("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", "", "", 2);
                    		var $oldProductCodeTd = buildOldProductTd(i, "");
                    		var $productCodeTd = buildTdWithInputButton("30%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", "", "", projectIndex, i);
                    		var $oldPdtNameTd = buildOldProductTd(i, "");
                    		var $pdtNameTd = buildTdWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", "", "");
                    		var $oldRateTd = buildOldProductTd(i, "");
                    		var $rateTd = buildTdWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", "", "");
            	        	$tr.append($firstTd);
            	        	$tr.append($oldProductNameTd);
            	        	$tr.append($productNameTd);
            	        	$tr.append($oldPdtNameTd);
            	        	$tr.append($pdtNameTd);
            	        	$tr.append($oldProductCodeTd);
            	        	$tr.append($productCodeTd);
            	        	$tr.append($oldRateTd);
            	        	$tr.append($rateTd);
            	        	$table.append($tr);
                    	}
                	}else if(isCopy){
                		if(isNew > isCopy){
                			//动态添加行
                			alert("动态添加行")
                		}else{
                			
                		}
                	}
                	
               	
                	
                }
            	
            	
            	
            </script> -->
            <script type="text/javascript">
            function downloadFile${timestamp}(index) {
                var fileName = $("#profile_"+index+"_${timestamp}").val()
                var fileId = $("#profileId_"+index+"_${timestamp}").val()
                window.open("/flowable/file/downloadFile?fileId="+fileId+"&fileName="+encodeURIComponent(fileName));
            }
            </script>
           
            
</body>
</html>