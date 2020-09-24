<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
	<style type="text/css">
		.product-code  td {
		text-align:left;
}
	</style>
</head>
<body>
		<jsp:include page="chooseFile.jsp"/>
		<jsp:include page="importFile.jsp"/>
			<%-- <a onclick="importProjectCode${timestamp}()">&nbsp&nbsp&nbsp&nbsp项目编码导入</a> --%>
			<div style="font-size:16px;width: 100%">
	        <table width="98%" style="margin:auto;">
	            <tr>
	                <td>
	                    <a href="#" onclick="importProjectCode${timestamp}();">项目编码导入</a>
	                    <a href="excel/新增项目编码导入模板.xlsx" >模板下载</a>
	                </td>
	            </tr>
	        </table>

   		 </div>
	        <c:set var="e" value="${applyCount-1}"/>
            <c:forEach begin="0" end="${e}" varStatus="status">
                <div style="font-size:13px">
                    <table id="product-code_${timestamp}_${status.index}" class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                   
                        <tr style="text-align:right;">
                            <td width="3%"  align="center">序号</td>
                            <td width="25%">项目名称&nbsp;<button type="button" onclick="selectProject${timestamp}('${status.index}');">请选择&nbsp;</button>
                            <input id="applys[${status.index}].proName${timestamp}" data-options="required:true,width:'60%',missingMessage:'请填写项目名称'" readonly="readonly" class="easyui-textbox" name="applys[${status.index}].proName" value="${entity.applys[status.index].proName}"/>
                            <input id="applys[${status.index}].releaseNo${timestamp}" index="${status.index}" name="applys[${status.index}].releaseNo" type="hidden" value="${entity.applys[status.index].releaseNo}"/>
                            
                            </td>
                            <td width="32%">B版本&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            	<input id="applys[${status.index}].bversion${timestamp}" index="${status.index}" name="applys[${status.index}].bversion" value="${entity.applys[status.index].bversion}" data-options="valueField:'id',textField:'text',width:'70%', editable:false" class="easyui-combobox"/>
                            	<input id="applys[${status.index}].bversionNo${timestamp}" name="applys[${status.index}].bversionNo" value="${entity.applys[status.index].bversionNo}" type="hidden" value="${entity.applys[status.index].bversionNo}"/>
                            </td>
                            <td width="20%">项目编码
                            	<input id="applys[${status.index}].proNumber${timestamp}" data-options="valueField:'id',textField:'text',width:'70%'" readonly="readonly" class="easyui-textbox" name="applys[${status.index}].proNumber" value="${entity.applys[status.index].proNumber}"/>
                            </td>
                            <td width="20%">项目类别
                            	<input index="${status.index}" id="applys[${status.index}].proCa${timestamp}" name="applys[${status.index}].proCa" value="${entity.applys[status.index].proCa}"  data-options="valueField:'id',textField:'text',width:'70%', editable:false" class="easyui-combobox"/>
                            	<input id="applys[${status.index}].proCaName${timestamp}" name="applys[${status.index}].proCaName" type="hidden" value="${entity.applys[status.index].proCaName}"/>
                            </td>

                        </tr>
                        <!-- <tr>
                            <th>所属产品线</th>
                            <th>项目代号</th>
                            <th>项目经理</th>
                            <th>立项时间</th>
                        </tr> -->
                        <tr style="text-align:right;"> <td  rowspan="3"  align="center">${status.index + 1}</td>
                            <td>所属产品线&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <%-- <input id="applys[${status.index}].proProdlineNo${timestamp}" name="applys[${status.index}].proProdlineNo" value="${entity.applys[status.index].proProdlineNo}" data-options="valueField:'id',textField:'text',width:'100%'" class="easyui-combobox"/> --%>
                            <input id="applys[${status.index}].proProdlineNo${timestamp}" name="applys[${status.index}].proProdlineNo" type="hidden" value="${entity.applys[status.index].proProdlineNo}"/>
                            <input id="applys[${status.index}].proProdlineName${timestamp}" data-options="width:'65%'" class="easyui-textbox" name="applys[${status.index}].proProdlineName" value="${entity.applys[status.index].proProdlineName}"/>
                            </td>
                            <td>项目代号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            	<input id="applys[${status.index}].proNo${timestamp}" data-options="required:true,width:'70%',missingMessage:'请填写项目代号'" class="easyui-textbox" name="applys[${status.index}].proNo" value="${entity.applys[status.index].proNo}"/>
                            </td>
                            <td width="20%">项目经理
                            	<input id="applys[${status.index}].proManager${timestamp}"  name="applys[${status.index}].proManager" style="height: 30px; width:75%;" value="${entity.applys[status.index].proManager}" class="auto_selusers_false" />
                            </td>
                            <td>立项时间
                            	<input id="applys[${status.index}].proTime${timestamp}" data-options="required:true,width:'70%',missingMessage:'请填写立项时间'" name="applys[${status.index}].proTime" class= "easyui-datebox" value="${entity.applys[status.index].proTimeStr}"/>
                            </td>
                        </tr>
                       
                        <tr style="text-align:right;">
                        	<td>对应的评审点&nbsp;&nbsp;
                        		<input id="applys[${status.index}].proPoint${timestamp}" name="applys[${status.index}].proPoint" value="${entity.applys[status.index].proPoint}"  data-options="valueField:'id',textField:'text',width:'65%', editable:false" class="easyui-combobox"/>
                        		<input id="applys[${status.index}].proPointName${timestamp}" name="applys[${status.index}].proPointName" type="hidden" value="${entity.applys[status.index].proPointName}"/>
                        	</td>
                        	<td>对应的版本&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        		<input id="applys[${status.index}].version${timestamp}" data-options="required:true,width:'70%',missingMessage:'请填写对应版本'" class="easyui-textbox" name="applys[${status.index}].version" value="${entity.applys[status.index].version}"/>
                        	</td>
                            <td width="20%">依据材料
                            	
                            	<%-- <a href="#"  id="fileContent_${status.index}_${timestamp}" onclick="downloadFile${timestamp}('${status.index}')">${entity.applys[status.index].profile}</a>

							<input id="profile_${status.index}_${timestamp}" name="applys[${status.index}].profile" value="${entity.applys[status.index].profile}" type="hidden"/>
							<input id="profileId_${status.index}_${timestamp}" name="applys[${status.index}].profileId" value="${entity.applys[status.index].profileId}" type="hidden"/>
							<button type="button" onclick="layoutFileWin${timestamp}('${status.index}')">请选择</button>
							<a href="#"  id="deleteFile_${status.index}_${timestamp}" onclick="deleteFile${timestamp}('${status.index}')"></a>
                     --%>
                      <input id="basisMaterial_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterial" value="${entity.applys[status.index].basisMaterial}" type="hidden"/>
                        <input id="basisMaterialId_${status.index}_${timestamp}" name="applys[${status.index}].basisMaterialId" value="${entity.applys[status.index].basisMaterialId}" type="hidden"/>

                        <a href="#">
                            <img src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}('${status.index}')">
                        </a>
                        
                            </td>
                            
                            <td>备注&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            	<input id="applys[${status.index}].remark${timestamp}" data-options="width:'70%'" class="easyui-textbox" name="applys[${status.index}].remark" value="${entity.applys[status.index].remark}"/>
                            </td>
                        </tr>
                        
                        <tr style="text-align:right;">
                        	<td>运营商比重(%)
                        		<input id="applys[${status.index}].probizhong${timestamp}" data-options="required:true,width:'65%',missingMessage:'请填写费用分摊运营商比重'" class="easyui-textbox" name="applys[${status.index}].probizhong" value="${entity.applys[status.index].probizhong}"/>
                        	</td>
                        	<td>非运营商比重(%)
                        		<input id="applys[${status.index}].profbizhong${timestamp}" data-options="required:true,width:'70%',missingMessage:'请填写费用分摊非运营商比重'" class="easyui-textbox" name="applys[${status.index}].profbizhong" value="${entity.applys[status.index].profbizhong}"/>
                        	</td>
                        	<td width="20%">所属PDT
                        		<input id="applys[${status.index}].pdtName${timestamp}" data-options="width:'70%'" class="easyui-textbox" name="applys[${status.index}].pdtName" value="${entity.applys[status.index].pdtName}"/>
                        		<input id="applys[${status.index}].pdtNo${timestamp}" name="applys[${status.index}].pdtNo" value="${entity.applys[status.index].pdtNo}" type="hidden"/>
                        	</td>
                        </tr>
                        <!-- <tr>
                        	<th colspan="5" style="text-align: center">项目产品对应表</th>
                        </tr> -->
                        <%-- <tr>
                        	<td colspan="5" >
                        	<div style="font-size:16px; float:left; white-space: nowrap;">项目产品对应表&nbsp;</div>
                        	<div style="float:right;text-align:left;margin-left:5px;">
                        	服务的产品个数
                        	<input id="productNum_${status.index}_${timestamp}" value="${entity.applys[status.index].projectProductRelList.size()}"/>
                        	<input onclick="addProduct${timestamp}(this,'${status.index}');" value="确定" type="button"/>
                        	</div>
                        	</td>
                        	
                        </tr> --%>
                        <tr>
                        	<td colspan="5" style="border: none; background: #fff;">
                        	<div style="font-size:16px;display:inline-block; padding:10px 0px;">项目产品对应表&nbsp;</div>
                        	<div style="display:inline-block;margin-left: 40px">
                        	服务的产品个数
                        	<input id="productNum_${status.index}_${timestamp}" value="${entity.applys[status.index].projectProductRelList.size()}"/>
                        	<input onclick="addProduct${timestamp}(this,'${status.index}');" value="确定" type="button"/>
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
                        <tr id="product_${status.index}_${productStatus.index}">
                        	<td align="center">${productStatus.index + 1}</td>
                            <td>
                            	<span id="span_applys[${status.index}].projectProductRelList[${productStatus.index}].productName${timestamp}">${product.productName}</span>
                            	<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].productName" type="hidden" style="width:90%" value="${product.productName}" name="applys[${status.index}].projectProductRelList[${productStatus.index}].productName">
                            </td>
                            <td>
                            <span id='span_applys[${status.index}].projectProductRelList[${productStatus.index}].productCode${timestamp}'>${product.productCode}</span>
                            	<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].productCode" type="hidden" style="width:33%"  value="${product.productCode}" name="applys[${status.index}].projectProductRelList[${productStatus.index}].productCode">
                            	<button type="button"  onclick="selectProduct${timestamp}(${status.index}, ${productStatus.index})">请选择</button>
                            </td>
                            <td>
                            <span id='span_applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName${timestamp}'>${product.pdtName}</span>
                            	<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName" type="hidden" style="width:90%"  value="${product.pdtName}" name="applys[${status.index}].projectProductRelList[${productStatus.index}].pdtName">
                            </td>
                            <td>
                            	<input id="applys[${status.index}].projectProductRelList[${productStatus.index}].rate" class="easyui-textbox" style="width:90%" value="${product.rate}" name="applys[${status.index}].projectProductRelList[${productStatus.index}].rate">
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
       		    
            <script type="text/javascript">
            
            
            $(function(){
            	$("#input_optType${timestamp}").val("1");
            	$.parser.parse($("#subForm111${timestamp}"));
            	initDic();
            	$("[id^=applys][id$=proCa${timestamp}]").combobox({
            		 onSelect:function(e){
            		     debugger;
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
               }); */
            	//
            	var releaseNoDraft = $("[id^=applys][id$=releaseNo${timestamp}]");
            	//var releaseDraft = $("[id^=applys][id$=proName${timestamp}]").val();
            	 if(releaseNoDraft){
            		//setBversionNo(releaseNoDraft,releaseDraft);
            		$.each(releaseNoDraft , function(i, releaseNoTmp){
            			if(releaseNoTmp.value){
            				var releaseNoTmp = $(releaseNoTmp);
	            			initBversion(releaseNoTmp.attr('index'), releaseNoTmp.val());        				
            			}
            		})
            	} 
               
            	 /* var releaseNoDraft = $("[id^=applys][id$=releaseNo${timestamp}]");
            	 if(releaseNoDraft){
            		 debugger
            	 } */
            	//B版本,通过关联R版本的B版本
            	$("[id^=applys][id$=bversion${timestamp}]").combobox({
              		 onSelect:function(e){
              			var index = $(this).attr("index");
              			 $("[id^=applys\\[" + index + "\\]][id$=bversion${timestamp}]").textbox('setValue',e.text);
              			 //设置B版本内码
              			 var releaseNo = $("[id^=applys\\[" + index + "\\]][id$=releaseNo${timestamp}]").val();
              			 setBversionNo(index, releaseNo,e.text);
              			 
              		} 
                  });
            	
            	//处理导入
            	
            	
            	
            	
            });
            
            function setBversionNo(index, releaseNo, bversionName){
            	$.post("/flowable/product/getBversionByReleaseCodeAndBversionName?releaseNo=" + releaseNo + "&bVersionName=" + bversionName,'',function (result) {
            		//$("[id^=applys][id$=bversionNo${timestamp}]").val(result.data.bversionno);
                    if(result.data == null || result.data == undefined){
                        $("[id^=applys\\[" + index + "\\]][id$=bversionNo${timestamp}]").val("");
                    }else{
                        $("[id^=applys\\[" + index + "\\]][id$=bversionNo${timestamp}]").val(result.data.bversionno);
                    }

                 });
            }
            
            function formatProgress(value,rowData,rowIndex) {
    			if (value == "underfined" || value == null) {
    				return "";
    			} else {
    				
    				if(rowData)
    				{
    					if(rowData.ColumnCode == 'status') {
    						if(rowData.value == 1)
    						{
    							rowData.value= "有效";
    						} 
    						if(rowData.value == 0){
    							rowData.value="失效";
    						}
    						
    					}
    					
    					if(rowData.ColumnCode=='ifofficialnaming'){
    						
    						if(rowData.value == 1)
    						{
    							rowData.value="是";
    						}
    						if(rowData.value == 0){
    							rowData.value="否";
    						}
    					}
    					
    					if(rowData.ColumnCode=='projectstatus'){
    						
    						if(rowData.value == 1)
    						{
    							rowData.value="在研";
    						}
    						else if(rowData.value == 2){
    							rowData.value="终止";
    						}
    						else if(rowData.value == 3){
    							rowData.value="挂起";
    						}
    					} 
    					
    					if(rowData.projectstatus == 1)
    					{
    						rowData.projectstatus="在研";
    					}
    					else if(rowData.projectstatus == 2){
    						rowData.projectstatus="终止";
    					}
    					else if(rowData.projectstatus == 3){
    						rowData.projectstatus="挂起";
    					}
    					
    					if(rowData.ifofficialnaming == 1)
    					{
    						rowData.ifofficialnaming="是";
    					}
    					if(rowData.ifofficialnaming == 0)
    					{
    						rowData.ifofficialnaming="否";
    					}
    				}
    				return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
    						+ value + '</div>';
    			}
    		}
            
            //关联项目
            function selectProject${timestamp}(index){
            	//$("#projectWin${timestamp}").window('open');
            	/* $('#mainUrl').tabs('add', {
                    title : "项目",
                    href : '/product/projectView',
                    closable : true
                }); */
                $('#winparentversion${timestamp}').removeClass("hidden");
                $("#searchRelease${timestamp}").textbox("clear");
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
    					setProjectCode(index, rowData);
    						
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
            
            
            function setProjectCode(index, rowData){
            	$("#applys\\[" + index + "\\]\\.releaseNo${timestamp}").val(rowData.plipmtno.substring(0, rowData.plipmtno.indexOf('_')));
				
				$("#applys\\[" + index + "\\]\\.proName${timestamp}").textbox('setValue',rowData.release);
				if(rowData.productMnger){
					if(!hasChinese()){
						$("#applys\\[" + index + "\\]\\.proManager${timestamp}").val(rowData.productMnger.split(',')[0]);						
					}else{
						alert("项目经理应该为姓名+工号")
					}
				}
				$("#applys\\[" + index + "\\]\\.pdtName${timestamp}").textbox('setValue',rowData.pdt);
				$("#applys\\[" + index + "\\]\\.pdtNo${timestamp}").val(rowData.pdtno);
				initBversion(index, rowData.plipmtno.substring(0, rowData.plipmtno.indexOf('_')));
				getProductLine(index, rowData.plipmtno.substring(0, rowData.plipmtno.indexOf('_')));
            }
            
            function getProductLine(index, releaseNo){
            	$.post("/flowable/product/getAllProductLineByReleaseNo?releaseNo=" + releaseNo,'', function (result) {
                   $("#applys\\[" + index + "\\]\\.proProdlineName${timestamp}").textbox('setValue',result.data.prodline);
                   $("#applys\\[" + index + "\\]\\.proProdlineNo${timestamp}").val(result.data.prodlineno);
                });
            }
           
            function initBversion(index, releaseNo){
            	$.post("/flowable/product/getBversionByReleaseNo?releaseNo=" + releaseNo,'',function (result) {

                    var a = new Array();
                    a.push({"id":"","text":""});
                    $.each(result.data,function(i,e){
                        a.push({"id":e.bversioncname,"text":e.bversioncname});
                    });
                    //$("[id^=applys][id$=bversion${timestamp}]").combobox("loadData",a);
                    $("[id^=applys\\[" + index +  "\\]][id$=bversion${timestamp}]").combobox("loadData",a);
                });
            }
            
            //新增产品编码
            function addProduct${timestamp}(obj, index){
            	var num = $("#productNum_" + index + "_${timestamp}").val();
            	var $table = $("#product-code_${timestamp}_" + index);
            	
            	var  tab_length = $table.find("tr").length - 6;  //产品编码当前的行号，如调整行 9需要修改
            	
            	if(num > tab_length)  //加行
           		{
            		for(var i = tab_length; i < num ; i++){
            			
                		var $tr = buildTr(index, i);
                		var $firstTd = buildNoTd(i + 1);
                		var $productNameTd = buildTdSpanWithInput("20%", "applys["+ index +"].projectProductRelList[" + i + "].productName", 
                				"applys["+ index +"].projectProductRelList[" + i + "].productName", "", "", true, "90%");
                		var $productCodeTd = buildTdWithInputButton("20%", "applys["+ index +"].projectProductRelList[" + i + "].productCode", 
                				"applys["+ index +"].projectProductRelList[" + i + "].productCode", "", "", index, i, true);
                		var $pdtNameTd = buildTdSpanWithInput("20%", "applys["+ index +"].projectProductRelList[" + i + "].pdtName", 
                				"applys["+ index +"].projectProductRelList[" + i + "].pdtName", "", "", true, "90%");
                		var $rateTd = buildTdWithInput("20%", "applys["+ index +"].projectProductRelList[" + i + "].rate", 
                				"applys["+ index +"].projectProductRelList[" + i + "].rate", "", "easyui-textbox", false, "90%");
        	        	$tr.append($firstTd);
        	        	$tr.append($productNameTd);
        	        	$tr.append($productCodeTd);
        	        	$tr.append($pdtNameTd);
        	        	$tr.append($rateTd);
        	        	$table.append($tr);
        	        	$.parser.parse($tr);
                	}
           		} else { //删行
           			$.messager.confirm('提醒','减少行号会影响到已填写的数据，确认要减少行号吗?',function(r){
           			    if (r){
           			    	for(var i = 0; i < tab_length - num; i++){
                   				$("#product-code_${timestamp}_" + index +" tr:last").remove();
                        	}
           			    }
           			});

           			
           		}
            	
            	
            }
            
            
            
            function importProjectCode${timestamp}(){
            	clearRequired${timestamp}($("#input_optType${timestamp}").val(), $("#input_applyCount${timestamp}").val());
            	//1获取导入的数据
            	
            	//reload界面
            	/* var tab = $('#mainUrl').tabs('getSelected');
            	tab.panel('refresh', '/projectWebFlow/edit?applyNo=OBC1909074');  */
            	var applyNo = $("#applyNo").val();
            	var applyDep = $("#applyDep${timestamp} option:selected").val();

            	layoutProjectCodeFileWin${timestamp}(applyNo, applyDep);
            	
            	$("#subForm111${timestamp}").load("/projectWebFlow/subForm/1", {"processExtJson:" : JSON.stringify(result.data)},
                        $('#productCodeApply${timestamp}').serializeObject());
            	
            }
            
            
            </script>
</body>
</html>