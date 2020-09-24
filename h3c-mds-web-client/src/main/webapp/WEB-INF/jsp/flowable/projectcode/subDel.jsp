<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
	<style type="text/css">
	/* .product-code th, .product-code td{
			width:4%;
		}  */
</style>
</head>
<body>
	            <c:set var="e" value="${applyCount-1}"/>
            <c:forEach begin="0" end="${e}" varStatus="status">
                <div style="font-size:13px">
                    <table id="product-code_${status.index}" class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                        <tr >
                            <th width="3%" align="center">序号</th>
                            <th width="10%">项目名称</th>
                            <th width="10%">项目代号</th>
                            <th width="19%">项目编码</th>
                            <th width="10%">所属PDT</th>
                            <th width="8%">项目经理</th>
                            <th width="10%">对应的评审点</th>
                            <th width="10%">依据材料</th>
                            <th width="10%">备注</th>

                        </tr>
                        <tr>
                            <td rowspan="5" align="center">${status.index+1}</td>
                            <td>
                            	<input id="applys[${status.index}].oldProjcodeId${timestamp}" name="applys[${status.index}].oldProjcodeId" value="${entity.applys[status.index].oldProjcodeId}" type="hidden"/>
                            	<input id="applys[${status.index}].proName${timestamp}" type="hidden" name="applys[${status.index}].proName" value="${entity.applys[status.index].proName}"  readonly="readonly"/>
                            	<textarea id="applys[${status.index}].proNameTextArea${timestamp}" autoHeight="true" >${entity.applys[status.index].proName}</textarea>
                            </td>
                            
                            <td>
                            	<input id="applys[${status.index}].proNo${timestamp}" data-options="width:'100%'" class="easyui-textbox" name="applys[${status.index}].proNo" value="${entity.applys[status.index].proNo}"  readonly="readonly"/>
                            </td>
                            
                            <td>
                                <input id="applys[${status.index}].bversionNo${timestamp}" name="applys[${status.index}].bversionNo" type="hidden" value="${entity.applys[status.index].bversionNo}"/>
                            	<input id="applys[${status.index}].releaseNo${timestamp}" name="applys[${status.index}].releaseNo" type="hidden" value="${entity.applys[status.index].releaseNo}"/>
                            	<input id="applys[${status.index}].proNumber${timestamp}" data-options="required:true,width:'50%',missingMessage:'请选择项目编码编码'" class="easyui-textbox" name="applys[${status.index}].proNumber" value="${entity.applys[status.index].proNumber}" readonly="readonly"/>
                            	<button type="button" onclick="selectProject${timestamp}('${status.index}');">请选择</button>
                            </td>
                             <td>
                             	<input id="applys[${status.index}].pdtName${timestamp}" data-options="width:'100%'" class="easyui-textbox" name="applys[${status.index}].pdtName" value="${entity.applys[status.index].pdtName}"  readonly="readonly"/>
                             </td>
                             
                            <td>
                            	<input id="applys[${status.index}].proManager${timestamp}" style="height: 30px;" class="auto_selusers_false" name="applys[${status.index}].proManager" value="${entity.applys[status.index].proManager}"/>
                            </td>
                            <td>
                            	<input id="applys[${status.index}].proPointName${timestamp}" name="applys[${status.index}].proPointName" value="${entity.applys[status.index].proPointName}"  data-options="valueField:'text',textField:'text',width:'80%', editable:false" class="easyui-combobox"/>
                        		<input id="applys[${status.index}].proPoint${timestamp}" name="applys[${status.index}].proPoint" type="hidden" value="${entity.applys[status.index].proPoint}"/>
                        	
                            </td>

							<td>
								<%-- <input id="applys[${status.index}].profile${timestamp}" data-options="width:'100%'" class="easyui-textbox" name="applys[${status.index}].profile" value="${entity.applys[status.index].profile}"  readonly="readonly"/> --%>
								
								<%-- <a href="#"  id="fileContent_${status.index}_${timestamp}" onclick="downloadFile${timestamp}('${status.index}')">${entity.applys[status.index].profile}</a>

							<input id="profile_${status.index}_${timestamp}" name="applys[${status.index}].profile" value="${entity.applys[status.index].profile}" type="hidden"/>
							<input id="profileId_${status.index}_${timestamp}" name="applys[${status.index}].profileId" value="${entity.applys[status.index].profileId}" type="hidden"/>
							<button type="button" onclick="layoutFileWin${timestamp}('${status.index}')">&nbsp;&nbsp;&nbsp;</button>
							<a href="#"  id="deleteFile_${status.index}_${timestamp}" onclick="deleteFile${timestamp}('${status.index}')"></a>
								
								 --%>
								 
								 <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
		                        <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>
		
		                        <a href="#">
		                            <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}('${status.index}')">
		                        </a>
								 
								 
								 
							</td>
							<td>
								<input id="applys[${status.index}].remark${timestamp}" data-options="width:'100%'" class="easyui-textbox" name="applys[${status.index}].remark" value="${entity.applys[status.index].remark}"/>
							</td>
                        </tr>
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
            	$('textarea[autoHeight]').autoHeight(); 


            	//对应的评审点
            	$.get("/projectWebFlow/getDicItem?type=21",function (result) {

                    var a = new Array();
                    $.each(result,function(i,e){
                        a.push({"id":e.dicValue,"text":e.dicName});
                    });
                    $("[id^=applys][id$=proPointName${timestamp}]").combobox("loadData",a);
                    //$("[id^=applys][id$=proPointName${timestamp}]").val(e.dicName);
                });
            	
            	//对应评审点
            	$("[id^=applys][id$=proPointName${timestamp}]").combobox({
           		 onSelect:function(e){
           			 $("[id^=applys][id$=proPoint${timestamp}]").val(e.id);
           			//$("[id^=applys][id$=proPointName${timestamp}]").combobox("setValue",e.name);
           		} 
               });
            	$.parser.parse($("#subForm111${timestamp}"));
            	/* //对应的评审点
            	$.get("/projectWebFlow/getDicItem?type=21",function (result) {

                    var a = new Array();
                    $.each(result,function(i,e){
                        a.push({"id":e.dicValue,"text":e.dicName});
                    });
                    $("[id^=applys][id$=proPoint${timestamp}]").combobox("loadData",a);
                }); */
            	
            })
            
            function selectProject${timestamp}(projectIndex){
        		
            	$('#winOldProjectCode${timestamp}').removeClass("hidden");
            	$("#searchArgs${timestamp}").textbox("clear");
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
                       height : '95%',
                       pageList: [15,20,30,40,50,60],
                       queryParams:{searchArgs:""},
                       toolbar : [ {
                           id : 'add',
                           text : '确定',
                           //iconCls : 'tabs-icon fa fa-plus-square',
                           handler : function() {
                        	   var row =  $('#oldProjectCode${timestamp}').datagrid('getSelected');
                        	  // var projectIndex = $("#tmpprojectIndex${timestamp}").val();
                        	   setOldProjectCode(projectIndex, row)
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
                           /* {field: 'id', checkbox: false,hidden:true}, */
                           {field: "fBversionno",title: "B级内码",hidden:true},
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
		                       /* {field: "fBversionno", title: "对应B版本内码", align: "center",width:100},
		                       {field: "fBversionname", title: "对应B版本", align: "center",width:100}, */
		                       {field: "fPdtno", title: "所属PDT", align: "center",width:100,hidden:true},
		                       {field: "fPdtName", title: "所属PDT", align: "center",width:100},
		                       {field: "fAssignPointName", title: "对应评审点", align: "center",width:100},
		                       {field: "fBizhong", title: "项目分摊运营商比重", align: "center",width:100},
		                       {field: "fFbizhong", title: "项目分摊非运营商比重", align: "center",width:100}
                       ]],
                       onLoadSuccess : function(data){
                       },
                       onLoadError : function(){
                    	   
                       },
                       onDblClickRow : function(index, row){
                    	   $('#winOldProjectCode${timestamp}').window("close");
                    	   setOldProjectCode(projectIndex, row);
                    	   $('textarea[autoHeight]').autoHeight(); 
                       }
                   });
            	}
            
           function setOldProjectCode(projectIndex, row){
        	   $("#applys\\[" +projectIndex + "\\]\\.oldProjcodeId${timestamp}").val(row.fId);
        	   $("#applys\\[" +projectIndex + "\\]\\.proNameTextArea${timestamp}").val(row.fProjname);
        	   $("#applys\\[" +projectIndex + "\\]\\.proName${timestamp}").val(row.fProjname);
        	   $("#applys\\[" +projectIndex + "\\]\\.proNo${timestamp}").textbox('setValue',row.fProjcode);
        	   $("#applys\\[" +projectIndex + "\\]\\.releaseNo${timestamp}").val(row.fReleaseno);
               $("#applys\\[" +projectIndex + "\\]\\.bversionNo${timestamp}").val(row.fBversionno);
        	   $("#applys\\[" +projectIndex + "\\]\\.proNumber${timestamp}").textbox('setValue',row.fProjno);
        	   $("#applys\\[" +projectIndex + "\\]\\.pdtName${timestamp}").textbox('setValue',row.fPdtName);
        	   
        	   $("#applys\\[" +projectIndex + "\\]\\.pdtName${timestamp}").textbox('setValue',row.fPdtName);
        	   $("#applys\\[" +projectIndex + "\\]\\.pdtName${timestamp}").textbox('setValue',row.fPdtName);
        	   if(row.fProjmng){
        		   if(!hasChinese(row.fProjmng)){
        	   		$("#applys\\[" +projectIndex + "\\]\\.proManager${timestamp}").val(row.fProjmng.split(',')[0]);                    		           			   
        		   }else{
        			   alert("项目经理应该为姓名+工号")
        		   }
        	   }
        	   debugger;
        	   $("#applys\\[" +projectIndex + "\\]\\.proPoint${timestamp}").val(row.fAssignPoint);
        	   $("#applys\\[" +projectIndex + "\\]\\.proPointName${timestamp}").textbox('setValue',row.fAssignPointName);
        	   $("#applys\\[" +projectIndex + "\\]\\.profile${timestamp}").textbox('setValue',row.fProfile);
        	   $("#applys\\[" +projectIndex + "\\]\\.remark${timestamp}").textbox('setValue',row.remark);
           }
            
            
            //新增产品编码
            function addProduct${timestamp}(obj, index){
            	var num = $("#productNum_" + index + "_${timestamp}").val();
            	var $table = $("#product-code_" + index);
            	$("tr[id^=product_" + index + "_]").remove();
            	for(var i = 0; i < num; i++){
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
            </script>
</body>
</html>