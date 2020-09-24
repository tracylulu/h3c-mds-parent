<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
<!-- <style type="text/css">
	.product-code th, .product-code td{
			width:4%;
		} 
</style> -->
</head>
<body><jsp:include page="chooseFile.jsp"/>
	   <c:set var="e" value="${applyCount-1}"/>
            <c:forEach begin="0" end="${e}" varStatus="status">
                <div style="font-size:13px">
                    <table id="product-code_${timestamp}_${status.index}" class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                        <tr>
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
                            <td width="11%" rowspan="3" align="center">${status.index+1}</td>
                            <td>
                            	<textarea id="oldApplys[${status.index}].proNameTextArea${timestamp}" autoHeight="true" readonly="readonly">${entity.applys[status.index].oldProName}</textarea>
                            	 <input id="oldApplys[${status.index}].proName${timestamp}"  name="applys[${status.index}].oldProName"  type="hidden" value="${entity.applys[status.index].oldProName}" readonly="readonly"/>
                            </td>
                            <td width="9%">
                           		<input id="oldApplys[${status.index}].proNo${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldProNo" value="${entity.applys[status.index].oldProNo}"/>
                            </td>
                            <td  width="9%">
                            	<input id="oldApplys[${status.index}].projcodeId${timestamp}" name="applys[${status.index}].oldProjcodeId" value="${entity.applys[status.index].oldProjcodeId}" type="hidden"/>
                            	<%-- <span id="oldApplys[${status.index}].proNumberspan">${entity.applys[status.index].oldProNumber}</span> --%>
                            	<input id="oldApplys[${status.index}].proNumber${timestamp}" data-options="width:'50%'" class="easyui-textbox"  name="applys[${status.index}].oldProNumber" value="${entity.applys[status.index].oldProNumber}" readonly="readonly"/>
                            	<button type="button" onclick="selectOldProject${timestamp}('${status.index}')">请选择</button>
                            </td>
                            <td width="9%">
                            	<input id="oldApplys[${status.index}].proProdlineNo${timestamp}" name="applys[${status.index}].oldProProdlineNo" value="${entity.applys[status.index].oldProProdlineNo}" type="hidden"/>
                            	<input id="oldApplys[${status.index}].proProdlineName${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldProProdlineName" value="${entity.applys[status.index].oldProProdlineName}" readonly="readonly"/>
                            </td>
                            <td width="9%">
                            	<input id="oldApplys[${status.index}].proCa${timestamp}" name="applys[${status.index}].oldProCa" value="${entity.applys[status.index].oldProCa}" type="hidden"/>
                            	<input id="oldApplys[${status.index}].proCaName${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldProCaName" value="${entity.applys[status.index].oldProCaName}"  readonly="readonly"/>
                            </td>
                        	<td >
                        		 <input id="oldApplys[${status.index}].version${timestamp}" data-options="width:'90%'" class="easyui-textbox"  name="applys[${status.index}].oldVersion" value="${entity.applys[status.index].oldVersion}" readonly="readonly"/>
                        	</td>
                        	<td width="9%"><%-- ${entity.applys[status.index].oldBversion} --%>
                        		 <input id="oldApplys[${status.index}].releaseNo${timestamp}" name="applys[${status.index}].oldReleaseNo" value="${entity.applys[status.index].oldReleaseNo}" type="hidden"/>
                        		 <input id="oldApplys[${status.index}].bversionNo${timestamp}" name="applys[${status.index}].oldBversionNo" value="${entity.applys[status.index].oldBversionNo}" type="hidden"/>
                        		 <input id="oldApplys[${status.index}].bversion${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldBversion" value="${entity.applys[status.index].oldBversion}" readonly="readonly"/>
                        	</td>
                            <td width="9%">
                            	 <input id="oldApplys[${status.index}].proManager${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldProManager" value="${entity.applys[status.index].oldProManager}" readonly="readonly"/>
                            </td>
                            <td width="9%">
                            	<input id="oldApplys[${status.index}].probizhong${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldProbizhong" value="${entity.applys[status.index].oldProbizhong}" readonly="readonly"/>
                            </td>
                            <td width="9%">
                            	<input id="oldApplys[${status.index}].profbizhong${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldProfbizhong" value="${entity.applys[status.index].oldProfbizhong}" readonly="readonly"/>
                            	</td>
                            <%-- <td >
                            	<input id="oldApplys[${status.index}].profile" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].oldProfile" value="${entity.applys[status.index].oldProfile}" type="hidden"/>
                            </td> --%>
                            <td width="9%">
                            	<%-- <a href="#"  id="fileContent_${status.index}_${timestamp}" onclick="downloadFile${timestamp}('${status.index}')">${entity.applys[status.index].profile}</a>

							<input id="profile_${status.index}_${timestamp}" name="applys[${status.index}].profile" value="${entity.applys[status.index].profile}" type="hidden"/>
							<input id="profileId_${status.index}_${timestamp}" name="applys[${status.index}].profileId" value="${entity.applys[status.index].profileId}" type="hidden"/>
							<button type="button" onclick="layoutFileWin${timestamp}('${status.index}')">&nbsp;&nbsp;&nbsp;</button>
							<a href="#"  id="deleteFile_${status.index}_${timestamp}" onclick="deleteFile${timestamp}('${status.index}')"></a> --%>
                            
                            	<input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
		                        <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
		
		                        <a href="#">
		                            <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}('${status.index}')">
		                        </a>
                            </td>
                            

                        
                        </tr>
                        <tr >
                            <th>项目名称</th>
                            <th>项目代号</th>
                            <th>项目编码</th>
                            <th>所属产品线</th>
                            <th>项目类别</th>
                            <th>现对应的版本</th>
                            <th>现对应的B版本</th>
                            <th>项目经理</th>
                            <th>费用分摊运营商比例(%)</th>
                            <th>费用分摊非运营商比例(%)</th>
                            <th>备注</th>
                        </tr>
                        <tr>
                            
                            <td>
                            	<textarea id="applys[${status.index}].proNameTextArea${timestamp}" autoHeight="true" readonly="readonly">${entity.applys[status.index].proName}</textarea>
                            	<input id="applys[${status.index}].proName${timestamp}" type="hidden" name="applys[${status.index}].proName" value="${entity.applys[status.index].proName}" readonly="readonly"/>
                            	<button type="button" onclick="copyProject${timestamp}('${status.index}');">复制</button>
                            	<button type="button" onclick="selectRelease${timestamp}('${status.index}');">请选择</button>
                            </td>
                            <td>
                            	<input id="applys[${status.index}].proNo${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].proNo" value="${entity.applys[status.index].proNo}"/>
                            </td>
                            <td>
                            	<input id="applys[${status.index}].proNumber${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].proNumber" value="${entity.applys[status.index].proNumber}" readonly="readonly"/>
                            	<%-- <button type="button" onclick="selectProject${timestamp}('${status.index}');">&nbsp;&nbsp;&nbsp;</button> --%>
                            </td>
                            <td>
                            	<input id="applys[${status.index}].proProdlineNo${timestamp}" name="applys[${status.index}].proProdlineNo" type="hidden" value="${entity.applys[status.index].proProdlineNo}"/>
                            	<input id="applys[${status.index}].proProdlineName${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].proProdlineName" value="${entity.applys[status.index].proProdlineName}"/>
                            </td>
                            <td>
                            	<input index="${status.index}" id="applys[${status.index}].proCa${timestamp}" name="applys[${status.index}].proCa" value="${entity.applys[status.index].proCa}" data-options="valueField:'id',textField:'text',width:'90%', editable:false" class="easyui-combobox"/>
                            	<input id="applys[${status.index}].proCaName${timestamp}" name="applys[${status.index}].proCaName" type="hidden" value="${entity.applys[status.index].proCaName}"/>
                            </td>
                        	<td>
                        		<input id="applys[${status.index}].version${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].version" value="${entity.applys[status.index].version}"/>
                        	</td>
                        	<td>
                        		
                        		<input id="applys[${status.index}].releaseNo${timestamp}" name="applys[${status.index}].releaseNo" value="${entity.applys[status.index].releaseNo}" type="hidden"/>
                        		
                        		
                        		<input id="applys[${status.index}].bversionNo${timestamp}" name="applys[${status.index}].bversionNo" value="${entity.applys[status.index].bversionNo}" type="hidden"/>
                        		<input id="applys[${status.index}].bversion${timestamp}" data-options="valueField:'id',textField:'text',width:'90%'" class="easyui-textbox" name="applys[${status.index}].bversion" value="${entity.applys[status.index].bversion}" readonly="readonly"/>
                        	</td>
                            <td>
                            	<input id="applys[${status.index}].proManager${timestamp}" style="height: 30px;"  name="applys[${status.index}].proManager" value="${entity.applys[status.index].proManager}"  class="auto_selusers_false"/>
                            </td>
                            <td>
                            	<input id="applys[${status.index}].probizhong${timestamp}" data-options="required:true,width:'90%',missingMessage:'请填写费用分摊运营商比例'" class="easyui-textbox" name="applys[${status.index}].probizhong" value="${entity.applys[status.index].probizhong}"/>
                            </td>
                            <td>
                            	<input id="applys[${status.index}].profbizhong${timestamp}" data-options="required:true,width:'90%',missingMessage:'请填写费用分摊非运营商比例'" class="easyui-textbox" name="applys[${status.index}].profbizhong" value="${entity.applys[status.index].profbizhong}"/>
                            </td>
                            <td>
                            
                            	<input id="applys[${status.index}].remark${timestamp}" data-options="width:'90%'" class="easyui-textbox" name="applys[${status.index}].remark" value="${entity.applys[status.index].remark}"/>
                            </td>
                            
                        </tr>
                        <!-- <tr>
                        	<th colspan="12" style="text-align: center">项目产品对应表</th>
                        </tr> -->
                        <tr>
                        	<th colspan="12">
                        		<div style="font-size:16px;display:inline-block; padding:10px 0px;">项目产品对应表&nbsp;</div>
                        		<div style="display:inline-block;margin-left: 40px">
	                        		<input onclick="showOldProduct${timestamp}('${status.index}')" value="显示原服务产品" type="button"/>
	                        		服务的产品个数
	                        		<input id="productNum_${status.index}_${timestamp}" value="${entity.applys[status.index].projectProductRelList.size()}"/>
	                        		<input onclick="addProduct${timestamp}(this,'${status.index}');" value="确定" type="button"/>
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
                       
                       
                        <tr id="product_${status.index}_${timestamp}">
                        	
                        	
                        </tr>
                        
                         <c:forEach  var="product" items="${entity.applys[status.index].projectProductRelList}" varStatus="productStatus">
                        
                        
		                        <tr id="product_${status.index}">
		                        	<td align="center">${productStatus.index + 1}</td>
		                        	<td   colspan="2">
		                        		<span>${product.oldProductName}</span>
		                        		<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].oldProductName" 
		                        		name="applys[${status.index}].projectProductRelList[${productStatus.index}].oldProductName" value="${product.oldProductName}" type="hidden">
		                        	</td>
		                        	<td   colspan="2">
		                        		<span id="span_applys[${status.index}].projectProductRelList[${productStatus.index}].productName${timestamp}">${product.productName}</span>
		                        		<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].productName" 
		                        		name="applys[${status.index}].projectProductRelList[${productStatus.index}].productName" value="${product.productName}" type="hidden"/>
		                        	</td>
		                            <td >
		                            	<span>${product.oldPdtName}</span>
		                            	<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].oldPdtName" 
		                            	name="applys[${status.index}].projectProductRelList[${productStatus.index}].oldPdtName" value="${product.oldPdtName}" type="hidden">
		                            </td>
		                            <td >
		                            	<span id="span_applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName${timestamp}">${product.pdtName}</span>
		                            	<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName"  type="hidden"
		                            	 name="applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName" value="${product.pdtName}" />
		                            </td>
		                        	<td >
		                        		<span >${product.oldProductCode}</span>
		                        		<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].oldProductCode" name="applys[${status.index}].projectProductRelList[${productStatus.index}].oldProductCode" 
		                        		value="${product.oldProductCode}"
		                        		type="hidden">
		                        	 </td>
		                        	<td >
		                        		<span id="span_applys[${status.index}].projectProductRelList[${productStatus.index}].productCode${timestamp}">${product.productCode}</span>
		                        		<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].productCode" type="hidden"
		                        		name="applys[${status.index}].projectProductRelList[${productStatus.index}].productCode" value="${product.productCode}"/>
		                        		<button type="button"  onclick="selectProduct${timestamp}(${status.index}, ${productStatus.index});">请选择</button>
		                            </td>
		                            <td>
		                           		 <span >${product.oldRate}</span>
		                           		 <input id="applys[${status.index}].projectProductRelList[${productStatus.index}].oldRate" name="applys[${status.index}].projectProductRelList[${productStatus.index}].oldRate" 
		                        		value="${product.oldRate}"
		                        		type="hidden">
		                           	</td>
		                            <td>
		                            	<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].rate" 
		                            	name="applys[${status.index}].projectProductRelList[${productStatus.index}].rate" value="${product.rate}" class="easyui-textbox"/>
		                            </td>
		                        </tr>
                        		
                        
                        </c:forEach>
                    </table>
                    <br>
                </div>

            </c:forEach>
            
        <div style="text-align: center">
    			<a href="#" class="easyui-linkbutton" onclick="submit${timestamp}();" id="sub${timestamp}">提交</a>
		</div>    
            
            
            <link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css"/>
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<script type="text/javascript" src="common/js/prBelowApply.js"></script> 
            <script type="text/javascript">
            	
            
            $(function(){
            	$.parser.parse($("#subForm111${timestamp}"));
            	initDic();
            	$("[id^=applys][id$=proCa${timestamp}]").combobox({
           		 onSelect:function(e){
					 var index = $(this).attr("index");
					 $("#applys\\["+index+"\\]\\.proCaName${timestamp}").val(e.text);
           		} 
               });
           	//对应评审点
           	$("[id^=applys][id$=proPoint${timestamp}]").combobox({
          		 onSelect:function(e){
          			 $("[id^=applys][id$=proPointName${timestamp}]").val(e.text);
          		} 
              });
           	//产品线
           	/* $("[id^=applys][id$=proProdlineNo${timestamp}]").combobox({
          		 onSelect:function(e){
          			 $("[id^=applys][id$=proProdlineName${timestamp}]").val(e.text);
          		} 
              });
           	 */
           	
           	 
         //B版本,通过关联R版本的B版本
        	/* $("[id^=applys][id$=bversion${timestamp}]").combobox({
          		 onSelect:function(e){
          			 $("[id^=applys][id$=bversion${timestamp}]").textbox('setValue',e.text);
          			 //设置B版本内码
          			 var releaseNo = $("[id^=applys][id$=releaseNo${timestamp}]").val();
          			 setBversionNo(releaseNo,e.text);
          			 
          		} 
              }); */
           	 
            });
            
            
            function setBversionNo(releaseNo, bversionName){
            	$.get("/flowable/product/getBversionByReleaseCodeAndBversionName?releaseNo=" + releaseNo + "&bVersionName=" + bversionName,function (result) {
            		debugger;
            		$("[id^=applys][id$=bversionNo${timestamp}]").val(result.data.bversionno);
                 });
            }
            	
            function selectOldProject${timestamp}(projectIndex){
            	$('#winOldProjectCode${timestamp}').removeClass("hidden");
            	//alert("projectIndex === " + projectIndex)
            	$('#winOldProjectCode${timestamp}').removeClass("hidden");
            	$("#searchArgs${timestamp}").textbox("clear");
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
                   /* height : 500, */
                   height:'95%',
                   pageList: [15,20,30,40,50,60],
                   queryParams:{searchArgs:""},
                   toolbar : [ {
                       id : 'add',
                       text : '确定',
                       //iconCls : 'tabs-icon fa fa-plus-square',
                       handler : function() {
                    	   var rowData =  $('#oldProjectCode${timestamp}').datagrid('getSelected');
                    	   var projectIndex = $("#tmpprojectIndex${timestamp}").val();
                    	   setOldProjectCode${timestamp}(projectIndex, rowData);
                    	   $('#winOldProjectCode${timestamp}').window("close");
                       }
                   },'-',{
                       id : 'edit',
                       text : '取消',
                       //iconCls : 'tabs-icon fa fa-edit',
                       handler : function() {

                    	   $('#winOldProjectCode${timestamp}').window("close");

                       }
                   }],
                   
                   columns: [[
                       
                       /* {field: 'pdtNo', checkbox: false,hidden:true}, */
                       
                       {field: "fReleaseno",title: "R级内码",hidden:true},
                       {field: "fProjno",title: "项目编码",align: "center",width:100},
                       {field: "fProjname",title: "项目名称",align: "center",width:100},
                       {field: "fObjca",title: "项目类别",align: "center",width:100, hidden:true},
                       {field: "fObjcaName",title: "项目类别",align: "center",width:100},
                       {field: "fProjmng", title: "项目经理", align: "center",width:100},
                       {field: "fProductlineno", title: "所属产品线", align: "center",width:100,hidden:true},
                       {field: "fProductlineName", title: "所属产品线", align: "center",width:100},
                       {field: "fProductCode", title: "服务的产品编码", align: "center",width:100},
                       {field: "productNameCn", title: "服务的产品名称", align: "center",width:100},
                       {field: "rate", title: "此产品应分摊的项目比例", align: "center",width:100},
                       {field: "begintime", title: "编码生效日期", align: "center",width:100},
                       {field: "fVersion", title: "对应版本", align: "center",width:100},
                       {field: "fBversionno", title: "对应B版本内码", align: "center",width:100},
                       {field: "fBversionname", title: "对应B版本", align: "center",width:100},
                       {field: "fPdtno", title: "所属PDT", align: "center",width:100,hidden:true},
                       {field: "fPdtName", title: "所属PDT", align: "center",width:100},
                       {field: "fAssignPointName", title: "对应评审点", align: "center",width:100},
                       {field: "fBizhong", title: "项目分摊运营商比重", align: "center",width:100},
                       {field: "fFbizhong", title: "项目分摊非运营商比重", align: "center",width:100}/* ,
                       {field: "fProfile", title: "依据材料", align: "center",width:100} */
                   ]],
                  
                   onLoadError : function(){
                	   alert("error");
                   },
                   onDblClickRow : function(index, row){debugger;
                	 $('#winOldProjectCode${timestamp}').window("close");
                	   //alert($("#tmpprojectIndex${timestamp}").val())
                	   var projectIndex = $("#tmpprojectIndex${timestamp}").val();
                	   setOldProjectCode${timestamp}(projectIndex, row);
                	   $('textarea[autoHeight]').autoHeight(); 
                	   
                	   
                   }
               });
        	}
            
            function setOldProjectCode${timestamp}(projectIndex, row){
            	$("#oldApplys\\[" +projectIndex + "\\]\\.projcodeId${timestamp}").val(row.fId);
            	$("#oldApplys\\[" +projectIndex + "\\]\\.proNameTextArea${timestamp}").val(row.fProjname);
        	    $("#oldApplys\\[" +projectIndex + "\\]\\.proName${timestamp}").val(row.fProjname);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.proNo${timestamp}").textbox('setValue',row.fProjcode);
        	   
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.proNumber${timestamp}").textbox('setValue',row.fProjno);
        	   /* $("#oldApplys\\[" +projectIndex + "\\]\\.proNumberspan").html(row.fProjno); */
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineNo${timestamp}").val(row.fProductlineno);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineName${timestamp}").textbox('setValue',row.fProductlineName);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.proCa${timestamp}").val(row.fObjca);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.proCaName${timestamp}").textbox('setValue', row.fObjcaName);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.version${timestamp}").textbox('setValue',row.fVersion);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.releaseNo${timestamp}").val(row.fReleaseno);
        	   
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.bversionNo${timestamp}").val(row.fBversionno);debugger;
        	   //$("#oldApplys\\[" +projectIndex + "\\]\\.bversionNo").html(row.fBversionno);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.bversion${timestamp}").textbox('setValue',row.fBversionname);
        	   if(!hasChinese(row.fProjmng)){
        	   		$("#oldApplys\\[" +projectIndex + "\\]\\.proManager${timestamp}").textbox('setValue',row.fProjmng);        		   
        	   }else{
        		   alert("项目经理应该为姓名+工号")
        	   }
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.probizhong${timestamp}").textbox('setValue',row.fBizhong);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.profbizhong${timestamp}").textbox('setValue',row.fFbizhong);
        	   $("#oldApplys\\[" +projectIndex + "\\]\\.profile").textbox('setValue',row.fProfile);
            }
            
            /* function initBversion(releaseNo){
            	$.get("/flowable/product/getBversionByReleaseNo?releaseNo=" + releaseNo,function (result) {

                    var a = new Array();
                    $.each(result.data,function(i,e){
                        a.push({"id":e.bversioncname,"text":e.bversioncname});
                    });
                    $("[id^=applys][id$=bversion${timestamp}]").combobox("loadData",a);
                });
            } */
            
            	//拷贝
            	function copyProject${timestamp}(projectIndex){
            		
            		$("#applys\\[" +projectIndex + "\\]\\.proNameTextArea${timestamp}").val($("#oldApplys\\[" +projectIndex + "\\]\\.proName${timestamp}").val());
            	   $("#applys\\[" +projectIndex + "\\]\\.proName${timestamp}").val($("#oldApplys\\[" +projectIndex + "\\]\\.proName${timestamp}").val());
               	   $("#applys\\[" +projectIndex + "\\]\\.proNo${timestamp}").textbox('setValue', $("#oldApplys\\[" +projectIndex + "\\]\\.proNo${timestamp}").textbox('getValue'));
               	   $("#applys\\[" +projectIndex + "\\]\\.proNumber${timestamp}").textbox('setValue', $("#oldApplys\\[" +projectIndex + "\\]\\.proNumber${timestamp}").textbox('getValue'));
               	   //$("#applys\\[" +projectIndex + "\\]\\.proProdlineNo").val($("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineNo").html());
               	   //$("#applys\\[" +projectIndex + "\\]\\.proProdlineNo${timestamp}").combobox("setValue",$("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineNo").val());
               	   $("#applys\\[" +projectIndex + "\\]\\.proProdlineNo${timestamp}").val($("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineNo${timestamp}").val());
               	   $("#applys\\[" +projectIndex + "\\]\\.proProdlineName${timestamp}").textbox('setValue', $("#oldApplys\\[" +projectIndex + "\\]\\.proProdlineName${timestamp}").textbox('getValue'));
                   //$("[id^=applys][id$=releaseNo${timestamp}]").val
                   $("#applys\\[" +projectIndex + "\\]\\.releaseNo${timestamp}").val($("#oldApplys\\[" +projectIndex + "\\]\\.releaseNo${timestamp}").val());
               	   $("#applys\\[" +projectIndex + "\\]\\.bversionNo${timestamp}").val($("#oldApplys\\[" +projectIndex + "\\]\\.bversionNo${timestamp}").val());
               	   $("#applys\\[" +projectIndex + "\\]\\.bversion${timestamp}").textbox('setValue', $("#oldApplys\\[" +projectIndex + "\\]\\.bversion${timestamp}").textbox('getValue'));
               	   //$("#applys\\[" +projectIndex + "\\]\\.proCa").val($("#oldApplys\\[" +projectIndex + "\\]\\.proCa").html());
                 	$("#applys\\[" +projectIndex + "\\]\\.proCa${timestamp}").combobox("setValue", $("#oldApplys\\[" +projectIndex + "\\]\\.proCa${timestamp}").val());
               	   $("#applys\\[" +projectIndex + "\\]\\.version${timestamp}").textbox("setValue", $("#oldApplys\\[" +projectIndex + "\\]\\.version${timestamp}").textbox('getValue'));
               	   $("#applys\\[" +projectIndex + "\\]\\.proManager${timestamp}").val($("#oldApplys\\[" +projectIndex + "\\]\\.proManager${timestamp}").textbox('getValue').split(',')[0]);
               	   $("#applys\\[" +projectIndex + "\\]\\.probizhong${timestamp}").textbox("setValue",$("#oldApplys\\[" +projectIndex + "\\]\\.probizhong${timestamp}").textbox('getValue'));
               	   $("#applys\\[" +projectIndex + "\\]\\.profbizhong${timestamp}").textbox("setValue",$("#oldApplys\\[" +projectIndex + "\\]\\.profbizhong${timestamp}").textbox('getValue'));
               		$('textarea[autoHeight]').autoHeight(); 
            	}
            	
            	
            	
            	function selectRelease${timestamp}(index){
                	//$("#projectWin${timestamp}").window('open');
                	/* $('#mainUrl').tabs('add', {
                        title : "项目",
                        href : '/product/projectView',
                        closable : true
                    }); */
                    $('#winparentversion${timestamp}').removeClass("hidden");
                    $("#searchRelease${timestamp}").textbox("clear");
                    $("#searchRelease${timestamp}").textbox("setValue","");
                    $('#winparentversion${timestamp}').window({  
        			    iconCls:"icon-save",
        			    modal:true   
        			}); 
                	$("#tg${timestamp}").treegrid({
        				iconCls : 'icon-ok',
        				collapsible : false,
        				url : 'projectWebFlow/data/prdata',
        				method : 'post',
        				idField : 'plipmtno',
        				treeField : 'plipmt',
        				striped:true,
        				width:'100%',
        				queryParams:{searchParas:""},
        				 
        				toolbar : [ {
        		                id : 'add',
        		                text : '确定',
        		                //iconCls : 'tabs-icon fa fa-plus-square',
        		                handler : function() {
        		                	var rowData =  $('#tg${timestamp}').treegrid('getChecked');
        		                	setProjectCode(index, rowData[0]);
        		                	$('#winparentversion${timestamp}').window("close");
        		                }
        		            },'-',{
        		                id : 'edit',
        		                text : '取消',
        		                //iconCls : 'tabs-icon fa fa-edit',
        		                handler : function() {
        		                	$('#winparentversion${timestamp}').window("close");

        		                }
        		            },'-',{
        		 				id : 'open${timestamp }',
        						text : '展开当前节点',
        						iconCls : 'tabs-icon fa fa-minus-square',
        						handler : function() {							
        							var selectNode = $("#tg${timestamp}").treegrid('getSelected');
        							 exeandAll_ID${timestamp}=selectNode.plipmtno
        							 $("#tg${timestamp}").treegrid("expandAll",selectNode.plipmtno);									
        							isExpandALl${timestamp}=true;        							
        						}
        		 			}],
        				 
        				 columns:[[
        				           {title:'所属IPMT',field:'plipmt',width:'15%', formatter:formatProgress},
        				           {title:'所属研发产品线',field:'prodline',width:'12%', formatter:formatProgress},    
        				           {title:'所属PDT',field:'pdt',width:'8%'},    
        				           {title:'对应的软件平台版本',field:'releaseSoftware',width:'5%', formatter:formatProgress},
        				           {title:'产品R级中文名称',field:'release',width:'12%', formatter:formatProgress},    
        				           {title:'所属产品',field:'product',width:'12%', formatter:formatProgress},    
        				           {title:'所属产品V级',field:'version',width:'12%', formatter:formatProgress},    
        				           {title:'项目状态',field:'projectstatus',width:'5%', formatter:formatProgress},
        				           {title:'PDT经理',field:'productMnger',width:'7%', formatter:formatProgress},    
        				           {title:'开发代表',field:'rndpdtId',width:'6%', formatter:formatProgress}
        				       ]],
        				height : window.innerHeight
        						- window.innerHeight * 0.28,
        						fitColumns : true,
        				onBeforeExpand : function(row) {//异步架加载树
        					//row.plipmtno = row.plipmtno.substr(row.plipmtno.lastIndexOf('_') + 1);
        					var url = "projectWebFlow/data/prdata";
        					$("#tg${timestamp}").treegrid("options").url = url;
        					return true;
        				},onDblClickRow : function(rowData) {
        					$('#winparentversion${timestamp}').window("close");
        					var oldReleaseNo = $("#oldApplys\\[" + index + "\\]\\.releaseNo${timestamp}").val();
        					if(rowData.releaseno != oldReleaseNo){
        						$.messager.alert("提示信息","所选R级版本内码和原来不一样");
        					}else{
        						$("#applys\\[" +index + "\\]\\.proName${timestamp}").val(rowData.release);
        						$("#applys\\[" +index + "\\]\\.proNameTextArea${timestamp}").val(rowData.release);
        					}
        				},
    					onLoadSuccess : function(row,data) {
   						 	var _rowID=row!=null?row.plipmtno:'';
   						
   						 	if(row!=null&&isExpandALl${timestamp}){
   								 if(exeandAll_ID${timestamp}!=''&&_rowID.substr(0,2)==exeandAll_ID${timestamp}.substr(0,2)&&_rowID==exeandAll_ID${timestamp}){
   									 if(row.children!=null){
   										 $.each(row.children,function(i,item){
   											 $("#tg${timestamp }").treegrid("expand",item.plipmtno);
   										 });	
   									 }							 
   								}else{								
   									var root=_rowID.indexOf(exeandAll_ID${timestamp})!=-1?true:false;							
   									if(root){
   										 if(row!=null&&row.children!=null){
   											 $.each(row.children,function(i,item){
   												 $("#tg${timestamp }").treegrid("expand",item.plipmtno);
   											 });	
   										 }									
   									 }
   								}
   						 	}
   						},	
   						onExpand:function(row){	
   							var _rowID=row!=null?row.plipmtno:'';
   							if(_rowID.substr(0,2)=='PI'&&_rowID!=exeandAll_ID${timestamp}){
   								 isExpandALl${timestamp}=false;
   								 exeandAll_ID${timestamp}='';
   							}else{
   								var root=_rowID.indexOf(exeandAll_ID${timestamp})!=-1?true:false;							
   								if(!root){
   									 isExpandALl${timestamp}=false;
   									 exeandAll_ID${timestamp}='';
   								 }
   							}						 
   						}
        			});
                }
            	
            	//显示原来的产品编码
            	 function showOldProduct${timestamp}(projectIndex){
            		//项目编码
            		var projNumber = $("#oldApplys\\[" +projectIndex + "\\]\\.proNumber${timestamp}").val();
            		var $table = $("#product-code_${timestamp}_" + projectIndex);
            		var num = $("#productNum_" + projectIndex + "_${timestamp}").val();
            		var tab_length = $table.find("tr").length - 7;
            		//根据项目编码查询出相关的产品
            		$.ajax({
                        type: "GET",
                        url: "finance/fprojectCode/findProductByProjNo?projNo=" + projNumber,                        
                        dataType: "json",
                        success: function(data){
      
                        	var oldProductNum = data.total;
                        		for(var i = 0; i < tab_length; i++){
                       				$("#product-code_${timestamp}_" + projectIndex +" tr:last").remove();
                            	}
                        		for(var i = 0; i < oldProductNum; i++){
                                	var $tr = buildTr(projectIndex, i);
                                	var $firstTd = buildNoTd(i + 1);
                                	//var $oldProductNameTd = buildOldProductTdColspan(i, data.rows[i].PRODUCT_NAME_CN, 2);
                                	var oldProductName = "";
                                	if(data.rows[i].PRODUCT_NAME_CN){
                                		oldProductName = data.rows[i].PRODUCT_NAME_CN
                                	}
                                	var $oldProductNameTd = buildOldProductTdColspanAndInputHidden(i, oldProductName, 2, "applys["+ projectIndex +"].projectProductRelList[" + i + "].oldProductName");
                            		
                                	var $productNameTd = buildTdWithInputColSpan("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", oldProductName, "", 2, true, "90%");
                            		//var $oldProductCodeTd = buildOldProductTd(i, data.rows[i].f_product_code);
                            		var oldProductCode = "";
                            		if(data.rows[i].f_product_code){
                            			oldProductCode = data.rows[i].f_product_code;
                            		}
                            		var $oldProductCodeTd = buildOldProductTdAndInputHidden(i, oldProductCode, "applys["+ projectIndex +"].projectProductRelList[" + i + "].oldProductCode");
                            		var $productCodeTd = buildTdWithInputButton("30%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", oldProductCode, "", projectIndex, i, true, "50%");
                            		var oldPdtName = "";
                            		if(data.rows[i].PDT_NAME){
                            			oldPdtName = data.rows[i].PDT_NAME;
                            		}
                            		
                            		var $oldPdtNameTd = buildOldProductTdAndInputHidden(i, oldPdtName, "applys["+ projectIndex +"].projectProductRelList[" + i + "].oldPdtName");
                            		var $pdtNameTd = buildTdSpanWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", oldPdtName, "", true, "90%");
                            		var oldRate = "";
                            		if(data.rows[i].rate){
                            			oldRate = data.rows[i].rate;
                            		}
                            		
                            		var $oldRateTd = buildOldProductTdAndInputHidden(i, oldRate, "applys["+ projectIndex +"].projectProductRelList[" + i + "].oldRate");
                            		var $rateTd = buildTdWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", 
                            				"applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", oldRate, "easyui-textbox", false, "90%");
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
                    	        	$.parser.parse($tr);
                                }  
                        	/* }else{
                        		alert("先写，后填")
                        	}
                        	 */
                        	
                                  
                             },
                        error:function(e){
                        	
                             console.log(e);
                        }
                    });
            		
            		
            		
            	
            		
            	}
            	
            	 //新增产品编码
                 function addProduct${timestamp}(obj, projectIndex){
                	
               		 var num = $("#productNum_" + projectIndex + "_${timestamp}").val();
               		var $table = $("#product-code_${timestamp}_" + projectIndex);
               		var tab_length = $table.find("tr").length - 7;
               		if(num > tab_length){//加行
               			for(var i = tab_length; i < num; i++){
                    		var $tr = buildTr(projectIndex, i);
                        	var $firstTd = buildNoTd(i + 1);
                        	var $oldProductNameTd = buildOldProductTdColspan(i, "", 2);
                    		var $productNameTd = buildTdWithInputColSpan("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productName", "", "", 2, true, "90%");
                    		var $oldProductCodeTd = buildOldProductTd(i, "");
                    		var $productCodeTd = buildTdWithInputButton("30%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].productCode", "", "", projectIndex, i, true, "50%");
                    		var $oldPdtNameTd = buildOldProductTd(i, "");
                    		var $pdtNameTd = buildTdSpanWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].pdtName", "", "", true, "90%");
                    		var $oldRateTd = buildOldProductTd(i, "");
                    		var $rateTd = buildTdWithInput("20%", "applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", 
                    				"applys["+ projectIndex +"].projectProductRelList[" + i + "].rate", "", "easyui-textbox", false, "90%");
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
            	        	$.parser.parse($tr);
                    	} 
               		}else{//减行
               			$.messager.confirm('提醒','减少行号会影响到已填写的数据，确认要减少行号吗?',function(r){
               			    if (r){debugger;
               			    	for(var i = 0; i < tab_length - num; i++){
                       				$("#product-code_${timestamp}_" + projectIndex +" tr:last").remove();
                            	}
               			    }
               			});
               		}
                    	
                	
                }

            </script>
            
           
            
</body>
</html>