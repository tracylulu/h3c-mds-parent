
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width:100%">
  <a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}('ft');">查看已有特性清单</a><br>
                <input type="checkbox" class="combobox-checkbox" id="addproductft${id_suffix}" onclick="checkProduct${id_suffix}('add','ft')" name="baseObjects[0][0].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">增加特性</span><span class="numSpan">新增的特性个数：</span><span  id="addftsum${id_suffix}" style="color:red;"></span><br>
				<div id="addTabft${id_suffix}" style="margin:auto;width:100%;display:none">
				<span class="msgShow">同一特性的中英文的上下位置请保持一致，以免出错。</span><br>
				 <a href="#" class="easyui-linkbutton"  name="copyRelease" onclick="selectProject${id_suffix}('ft');" style="margin-left:20px;">继承现有特性信息</a>
				  <%-- <input id="file${timestamp}" name="file" class="easyui-filebox"  data-options="buttonText:'选择文件',required:true" style="width:300px"> --%>
<input id="file${id_suffix}" name="file${id_suffix}" type="file" style="width:300px;margin-left:5%;display:none" onchange="fileUpload${id_suffix}();"/>
				<%-- <a href="#" class="easyui-linkbutton"  for="file${id_suffix}" οnclick="selectFile${id_suffix}()" style="margin-left:5%;">批量导入特性、子特性</a> fileUpload${id_suffix}();--%>
				<label for="file${id_suffix}" style="background-color:#3498DB;margin: 4px 5px;padding: 5px 10px;color:white;height:30px;"  >批量导入特性、子特性</label> &nbsp;&nbsp;
	
				
				<a style="cursor: pointer;" href="excel/导入特性子特性模板.xls">导入特性子特性模板下载</a>
				<br>
				 <%-- <input id="file${id_suffix}" name="file" class="easyui-filebox"  data-options="buttonText:'批量导入特性、子特性'" style="width:100px;">  --%>
				

				<a href="#" class="easyui-linkbutton" style="width:15%;margin-left:20px;" onclick="impLBFeature${id_suffix}();">从已有路标版本引入特性/子特性</a>(该按钮仅支持引入，会清除原有手工添加的数据)
				    <table class="product"  border="1" cellspacing="0"  >
				     <tr>
                <td width="40%">要新增的特性中文名称</td>
                <td width="40%" class="aLink">要新增的特性英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('add','ft','','eng');"  style="">与中文名称设置一致</a></td>
               </tr> 
                <tr>
               <!--  <td width="20%"></td> -->
                <td width="40%"><textarea  name="baseObjects[0][0].objectname" autoHeight="true" style="width:100%;" id="addobjectft${id_suffix}"  >${entity.baseObjects[0][0].objectname}</textarea></td>
              <td width="40%"><textarea style="width:100%;"  name="baseObjects[0][0].engobject" autoHeight="true" id="addengobjectft${id_suffix}" >${entity.baseObjects[0][0].engobject}</textarea></td>
               </tr>
                   </table>
				</div>
				<hr>
				<input type="checkbox" class="combobox-checkbox" id="editproductft${id_suffix}" onclick="checkProduct${id_suffix}('edit','ft')" name="baseObjects[0][1].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">修改特性</span><span class="numSpan">修改的特性个数：</span><span  id="editftsum${id_suffix}" style="color:red;"></span><br>
				<div id="editTabft${id_suffix}" style="margin:auto;width:100%;display:none">
				<span class="msgShow">同一特性的中英文的上下位置请保持一致，以免出错。</span><br>
				
				  <table class="product" cellspacing="0" >
                <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要修改的特性:</span>&nbsp <input name="baseObjects[0][1].objectnoSel" style="width:46%;height:30px;" id="objectnoSelEditft${id_suffix}" value="${editfeatureNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                <tr>
                <td width="20%">要修改的特性内码</td>
                <td width="40%">原特性中文名称</td>
                <td width="40%">修改后的特性中文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[0][1].objectnoold" readonly="readonly" autoHeight="true" style="width:100%;" id="editobjectnooldft${id_suffix}"  >${entity.baseObjects[0][1].objectnoold}</textarea>
                <textarea name="baseObjects[0][1].objectno" hidden=true autoHeight="true" style="width:100%;" id="editobjectnoft${id_suffix}"  >${entity.baseObjects[0][1].objectno}</textarea>
                </td>
                <td width="40%"><textarea name="baseObjects[0][1].objectnameold" readonly="readonly" autoHeight="true" style="width:100%;" id="editobjectnameoldft${id_suffix}"  >${entity.baseObjects[0][1].objectnameold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[0][1].objectname" style="width:100%;" autoHeight="true" id="editobjectft${id_suffix}"   >${entity.baseObjects[0][1].objectname}</textarea></td>
               </tr>
                <tr>
                 <td width="20%"></td>
                <td width="40%">原特性英文名称</td>
                <td width="40%" class="aLink">修改后的特性英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','ft','','eng');">与修改后的中文名称设置一致</a></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%"><textarea name="baseObjects[0][1].engobjectold" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="editengobjectoldft${id_suffix}"  >${entity.baseObjects[0][1].engobjectold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[0][1].engobject" autoHeight="true" style="width:100%;height:30px;" id="editengobjectft${id_suffix}"   >${entity.baseObjects[0][1].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="delproductft${id_suffix}" onclick="checkProduct${id_suffix}('del','ft')" name="baseObjects[0][2].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">停用特性</span><br>
				<div id="delTabft${id_suffix}" style="margin:auto;width:100%;display:none">
				  <table class="product"  cellspacing="0" >
                 <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要停用的特性:</span>&nbsp <input name="baseObjects[0][2].objectnoSel" style="width:46%;height:30px;" id="objectnoSelDelft${id_suffix}" value="${delfeatureNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                </tr>
                 <tr>
                <td width="20%">要停用的特性内码</td>
                <td width="40%">要停用的特性中文名称</td>
                <td width="40%">要停用的特性英文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[0][2].objectno" readonly="readonly" autoHeight="true" style="width:100%;" id="delobjectnoft${id_suffix}"   >${entity.baseObjects[0][2].objectno}</textarea></td>
                <td width="40%"><textarea name="baseObjects[0][2].objectname" readonly="readonly" autoHeight="true" style="width:100%;" id="delobjectnameft${id_suffix}"   >${entity.baseObjects[0][2].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[0][2].engobject" readonly="readonly" autoHeight="true" style="width:100%;" id="delengobjectft${id_suffix}"   >${entity.baseObjects[0][2].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
               
                <script type="text/javascript">
              //打开文件选择框
               /*  function selectFile${id_suffix}(){
                     $("#file${id_suffix}").trigger("click");
                } */
                $(function(){
                	//修改特性校验
           		 $("#objectnoSelEditft${id_suffix}").combobox({
           				/* url : [],data : '[]',
           				method : "post",
           				valueField : 'value',
           				textField : 'text', */
           				editable:false,
           				required:false,
           				missingMessage:"请选择要修改的特性",
           				multiple: true, 
           				formatter: function (row) {
           	                var opts = $(this).combobox('options');
           	             if(row[opts.valueField]!=undefined){
           	                return '<input type="checkbox" class="combobox-checkbox" id="' + row[opts.valueField] + '">' + row[opts.textField]
           	             }
           	            },
           	            onShowPanel: function () {
           	                var opts = $(this).combobox('options');
           	                var target = this;
           	                var values = $(target).combobox('getValues');
           	                $.map(values, function (value) {
           	                    var el = opts.finder.getEl(target, value);
           	                    el.find('input.combobox-checkbox')._propAttr('checked', true);
           	                })
           	            },onChange:function(newVal,oldVal){
           	            	 $("#editobjectnooldft${id_suffix}").val("");
           						$("#editobjectnoft${id_suffix}").val("");
           						$("#editobjectnameoldft${id_suffix}").val("");
           						$("#editengobjectoldft${id_suffix}").val("");
           						$("#editobjectft${id_suffix}").val("");
           						$("#editengobjectft${id_suffix}").val("");
           						
           					
           						var currentVal="";
           		            	if(newVal==""||newVal==null){
           		            		currentVal=$('#objectnoSelEditft${id_suffix}').combobox("getValue");
           							return false;
           		            	}else{
           		            		currentVal=newVal.join(",");
           		            	}
           		            	 $.ajax({
           				                type: "POST",
           				                url: '/product/comboboxdata/listWithId?type=FT&code='+$("#releaseno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
           				                data:{},
           				                async: false,
           				                success: function (rec) {
           				                	if(rec!=null){
           				                		for (var i = 0; i < rec.length; i++) {
           				                			if($("#editobjectnoft${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
           					    						$("#editobjectnoft${id_suffix}").val(($("#editobjectnoft${id_suffix}").val()==""?"":($("#editobjectnoft${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           					    						$("#editobjectnooldft${id_suffix}").val(($("#editobjectnooldft${id_suffix}").val()==""?"":($("#editobjectnooldft${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           					    						
           					    						$("#editobjectnameoldft${id_suffix}").val(($("#editobjectnameoldft${id_suffix}").val()==""?"":($("#editobjectnameoldft${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           					    						$("#editengobjectoldft${id_suffix}").val(($("#editengobjectoldft${id_suffix}").val()==""?"":($("#editengobjectoldft${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           					    						$("#editobjectft${id_suffix}").val(($("#editobjectft${id_suffix}").val()==""?"":($("#editobjectft${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           					    						$("#editengobjectft${id_suffix}").val(($("#editengobjectft${id_suffix}").val()==""?"":($("#editengobjectft${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           					    						
           					    						$('textarea[autoHeight]').autoHeight();
           					    					}
           										}
           				                		
           				                	}
           				                }
           				          });
           		            },
           				onSelect: function(rec){
           					 var opts = $(this).combobox('options');
           	                 var el = opts.finder.getEl(this, rec[opts.valueField]);
           	                 el.find('input.combobox-checkbox')._propAttr('checked', true);
           				},
                           onUnselect: function (row) {
                               var opts = $(this).combobox('options');
                               var el = opts.finder.getEl(this, row[opts.valueField]);
                               el.find('input.combobox-checkbox')._propAttr('checked', false);
                           },onLoadSuccess:function(row){
           					 var opts = $(this).combobox('options');
                                var target = this;
                                var values = $(target).combobox('getValues');
                                $.map(values, function (value) {
                                    var el = opts.finder.getEl(target, value);
                                    el.find('input.combobox-checkbox')._propAttr('checked', true);
                                })
                                if($("#objectnoSelEditft${id_suffix}").val()=="null"){
                               	 $("#objectnoSelEditft${id_suffix}").combobox("setValue","");
                                }
           					$("#objectnoSelEditft${id_suffix}").unbind("onLoadSuccess"); 
           				}
           		   });
           		 
           		//停用特性校验
           		 $("#objectnoSelDelft${id_suffix}").combobox({
           				/* url : [],
           				data : '[]',
           				method : "post",
           				valueField : 'value',
           				textField : 'text', */
           				editable:false,
           				required:false,
           				missingMessage:"请选择要停用的特性",
           				multiple: true, 
           				formatter: function (row) {
           	                var opts = $(this).combobox('options');
           	             if(row[opts.valueField]!=undefined){
           	                return '<input type="checkbox" class="combobox-checkbox" id="' + row[opts.valueField] + '">' + row[opts.textField]
           	             }
           	            },
           	            onShowPanel: function () {
           	                var opts = $(this).combobox('options');
           	                var target = this;
           	                var values = $(target).combobox('getValues');
           	                $.map(values, function (value) {
           	                    var el = opts.finder.getEl(target, value);
           	                    el.find('input.combobox-checkbox')._propAttr('checked', true);
           	                })
           	            },onChange:function(newVal,oldVal){
           	            	 $("#delobjectnoft${id_suffix}").val("");
           						$("#delobjectnameft${id_suffix}").val("");
           						$("#delengobjectft${id_suffix}").val("");
           						
           					
           						var currentVal="";
           		            	if(newVal==""||newVal==null){
           		            		currentVal=$('#objectnoSelDelft${id_suffix}').combobox("getValue");
           							return false;
           		            	}else{
           		            		currentVal=newVal.join(",");
           		            	}
           		            	 $.ajax({
           				                type: "POST",
           				                url: '/product/comboboxdata/listWithId?type=FT&code='+$("#releaseno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
           				                data:{},
           				                async: false,
           				                success: function (rec) {
           				                	if(rec!=null){
           				                		for (var i = 0; i < rec.length; i++) {
           				                			if($("#delobjectnoft${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
           					    						$("#delobjectnoft${id_suffix}").val(($("#delobjectnoft${id_suffix}").val()==""?"":($("#delobjectnoft${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           					    						$("#delobjectnameft${id_suffix}").val(($("#delobjectnameft${id_suffix}").val()==""?"":($("#delobjectnameft${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           					    						
           					    						$("#delengobjectft${id_suffix}").val(($("#delengobjectft${id_suffix}").val()==""?"":($("#delengobjectft${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           					    						
           					    						$('textarea[autoHeight]').autoHeight();
           					    					}
           										}
           				                		
           				                	}
           				                }
           				          });
           		            },
           				onSelect: function(rec){
           					//alert(111);
           					 var opts = $(this).combobox('options');
           	                 var el = opts.finder.getEl(this, rec[opts.valueField]);
           	                 el.find('input.combobox-checkbox')._propAttr('checked', true);
           					
           				},
                           onUnselect: function (row) {
                               var opts = $(this).combobox('options');
                               var el = opts.finder.getEl(this, row[opts.valueField]);
                               el.find('input.combobox-checkbox')._propAttr('checked', false);
                           },onLoadSuccess:function(rec){
           					 var opts = $(this).combobox('options');
           	                 var el = opts.finder.getEl(this, rec[opts.valueField]);
           	                 el.find('input.combobox-checkbox')._propAttr('checked', true);
           	                 if($("#objectnoSelDelft${id_suffix}").val()=="null"){
                               	 $("#objectnoSelDelft${id_suffix}").combobox("setValue","");
                                }
           					$("#objectnoSelDelft${id_suffix}").unbind("onLoadSuccess"); 
           				}
           		   });
                });

                //导入特性
                function fileUpload${id_suffix}(){
                	var fileObj = $("#file${id_suffix}")[0].files[0];
                	var formFile = new FormData();
                	formFile.append("file", fileObj); //加入文件对象
                	var data = formFile;
                	 $.ajax({
			                type: "POST",
			                url: "/basicinfo/prBelowApply/resExcelImport",
			                contentType: false,// "multipart/form-data; charset=utf-8",
		                    data: data,
		                    //dataType: "json",
		                    processData : false,
		                    contentType : false,
			                async: false,
			                success: function (result) {
			                	document.getElementById('file${id_suffix}').value = null;
			                	if(result!=null&&result.success==true){
			                	var str=result.feature;
			                	str=(str.substring(str.length-1)=='*')?str.substring(0,str.length-1):str;
			                	str=(str.substring(str.length-2)=='\r')?str.substring(0,str.length-2):str;
			                	$("#addobjectft${id_suffix}").val(str);
			                	$("#addengobjectft${id_suffix}").val(str);
			                	$("#addobjectsf${id_suffix}").val(result.subfeature);
			                	$("#addengobjectsf${id_suffix}").val(result.subfeature);
			                	$("#SUBFORM_T00000_03${id_suffix}").toggle();
			                	$("#addproductsf${id_suffix}")._propAttr('checked','true');
			                	$("#addTabsf${id_suffix}").toggle();
			                	$('textarea[autoHeight]').autoHeight();
			                	}else{
			                		if(result==null){
			                			 $.messager.alert("提示","导入失败,请联系管理员 ","");
			                		}else{
			                		$.messager.alert("提示",result.mag);
			                		}
			                	}
			                }
					 });
                	
                }
                
              //从已有路标版本引入特性、子特性
                function impLBFeature${id_suffix}(){
                	$('#selparentrelease${id_suffix}').val("");
                	 $('#winparentrelease${id_suffix}').window({  
                		    iconCls:"icon-save",
                		    modal:true, 
                    		onClose:function(){
                    			$('#projectStatu${id_suffix }').combobox('clear');
                            	$("#projectStatu${id_suffix }").combobox("select","在研");
                    			$('#searchParasRelease${id_suffix}').textbox("setValue","");
                            	$('#searchParasRelease${id_suffix}').textbox("setText","");
                		    	$('#winparentrelease${id_suffix}').css("display","none");
                	  		  }   
                		}); 
                		$("#selparentrelease${id_suffix}").treegrid({
                			iconCls : 'icon-ok',
                			collapsible : false,
                			url : 'product/data/prdata',
                			method : 'get',
                			idField : 'plipmtno',
                			treeField : 'plipmt',
                			 striped:true,
                			 queryParams : {
             					projectStatus : '在研'
             				},
                			 columns:[[
                				 {title:'IPMT',field:'plipmt',width:180, formatter:formatProgress${id_suffix}},
                		           {title:'研发产品线',field:'prodline',width:60,align:'right', formatter:formatProgress${id_suffix}},    
                		           {title:'PDT',field:'pdt',width:80, formatter:formatProgress${id_suffix}},  
                		           {title:'产品',field:'product',width:60,align:'right', formatter:formatProgress${id_suffix}},    
                		           {title:'产品V级',field:'version',width:80, formatter:formatProgress${id_suffix}},  
                		          {title:'R级内码',field:'releaseno',width:80, formatter:formatProgress${id_suffix}},  
                		           {title:'R级版本',field:'release',width:80, formatter:formatProgress${id_suffix}}, 
                		         {title:'对应的软件平台',field:'releasenoSoftware',width:80, hidden:true,formatter:formatProgress${id_suffix}},
                		         {title:'项目状态',field:'projectstatus',width:80, formatter:formatProgress${id_suffix}}
                		         /*  {title:'对象项目名称',field:'project',width:80, formatter:formatProgress${id_suffix}}, */  
                		         /*  {title:'项目财务编码',field:'version',width:80, formatter:formatProgress${id_suffix}},   */
                		          /*  {title:'项目内码',field:'projectno',width:80, formatter:formatProgress${id_suffix}},  
                		           {title:'产品难度系数',field:'prodifficult',width:80, formatter:formatProgress${id_suffix}},  
                		           {title:'硬件难度系数',field:'harddiffcult',width:80, formatter:formatProgress${id_suffix}},   
                		           {title:'项目状态',field:'projectstatus',width:80, formatter:formatProgress${id_suffix}},
                		           {title:'开发代表',field:'rndpdtId',width:80, formatter:formatProgress${id_suffix}},
                		           {title:'PDT经理',field:'productMnger',width:80, formatter:formatProgress${id_suffix}}*/
                			       ]],
                					fitColumns : true,
                			onBeforeExpand : function(row) {//异步架加载树
                				var url = "product/data/prdata";
                				$("#selparentrelease${id_suffix}").treegrid("options").url = url;
                				return true;
                			},onDblClickRow : function(rowData) {
                				$('#winparentrelease${id_suffix}').window("close");
                			
                				  var releasenos=rowData.releaseno;
                				if(rowData.releasenoSoftware!=null&&rowData.releasenoSoftware.indexOf('PR')!=-1){
                					releasenos+=","+rowData.releasenoSoftware;
                				}
                				
                				initFeature(releasenos);  
                				
                			},
                   		   toolbar : [{
                     			id : 'addFeatureLB${id_suffix }',
                     			text : '确定',
                     			handler : function() {
                     				$('#winparentrelease${id_suffix}').window("close");
                     				//根据选中项赋值
                     				var rowData=$("#selparentrelease${id_suffix}").treegrid("getSelected");
                     				if(rowData!=null){
                     				var releasenos=rowData.releaseno;
                      				if(rowData.releasenoSoftware!=null&&rowData.releasenoSoftware.indexOf('PR')!=-1){
                      					releasenos+=","+rowData.releasenoSoftware;
                      				}
                      				
                      				initFeature(releasenos);  
                     				}else{
                     					$.messager.alert("提示","请选择要添加的数据！！！","");
                     				}
                     			}
                   		   },'-',{
                			   
                			   id : 'open${id_suffix }',
                			   text : '展开当前节点',
                			   iconCls : 'tabs-icon fa fa-minus-square',
                			   handler : function() {							
                					var selectNode = $("#selparentrelease${id_suffix}").treegrid('getSelected');
                					 exeandAll_ID${id_suffix}=selectNode.plipmtno
                					 $("#selparentrelease${id_suffix}").treegrid("expandAll",selectNode.plipmtno);									
                					isExpandALl${id_suffix}=true;
                						
                				}
                			}],
                			onLoadSuccess : function(row,data) {						
                				 var _rowID=row!=null?row.plipmtno:'';
                				
                				 if(row!=null&&isExpandALl${id_suffix}){
                					 if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
                						 if(row.children!=null){
                							 $.each(row.children,function(i,item){
                								 $("#selparentrelease${id_suffix }").treegrid("expand",item.plipmtno);
                							 });	
                						 }							 
                					}else{								
                						var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
                						if(root){
                							 if(row!=null&&row.children!=null){
                								 $.each(row.children,function(i,item){
                									 $("#selparentrelease${id_suffix }").treegrid("expand",item.plipmtno);
                								 });	
                							 }									
                						 }
                					}
                				 }
                			},	
                			onExpand:function(row){	
                				var _rowID=row!=null?row.plipmtno:'';
                				if(_rowID.substr(0,2)=='PI'&&_rowID!=exeandAll_ID${id_suffix}){
                					 isExpandALl${id_suffix}=false;
                					 exeandAll_ID${id_suffix}='';
                				}else{
                					var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
                					if(!root){
                						 isExpandALl${id_suffix}=false;
                						 exeandAll_ID${id_suffix}='';
                					 }
                				}						 
                			}
                			
                		});
                }
                
              //根据选中的路标版本引入特性、子特性
                function initFeature(releaseno){
                	 $.ajax({
                         type: "POST",
                         url: "/basicinfo/prBelowApply/getFeature",
                         data:{code:releaseno},
                         async: false,
                         success: function (result) {
                        	 //特性赋值
                        	 $("#addobjectft${id_suffix}").val(result["feature"]);
                        	 $("#addengobjectft${id_suffix}").val(result["engfeature"]);
                        	 
                        	 //子特性赋值
                        	 $("#addproductsf${id_suffix}")._propAttr('checked','true');
                        	 $("#SUBFORM_T00000_03${id_suffix}").css("display","block");//.toggle();
                        	 $("#addTabsf${id_suffix}").css("display","block");//.toggle();
                        	 $("#addobjectsf${id_suffix}").val(result["subfeature"]);
                        	 $("#addengobjectsf${id_suffix}").val(result["subengfeature"]);
                        	 
                        	 $('textarea[autoHeight]').autoHeight();  
                         }
                	 });
                }
              
              //根据选中的路标版本引入特性、子特性
                function initShowData${id_suffix}(releasenos,tag){
                	
                	 $.ajax({
                         type: "POST",
                         url: "/basicinfo/prBelowApply/getShowData",
                         data:{code:releasenos,tag:tag},
                         async: false,
                         success: function (result) {
                        	  
                        	 if(tag=="bl"){
                        	 //基线版本赋值
                            	 $("#addobjectbl${id_suffix}").val(result["baseline"]);
                            	 $("#addengobjectbl${id_suffix}").val(result["engbaseline"]);
                            	 $("#addobjectoutbl${id_suffix}").val(result["baselineout"]);
                            	 $("#addengobjectoutbl${id_suffix}").val(result["engbaselineout"]);
                            	 $("#addparentitem${id_suffix}").val(result["parentitemName"]);
                            	 $("#addparentitemno${id_suffix}").val(result["parentitemNo"]);
                            	 $("#addbaseline1name${id_suffix}").val(result["baseline1Name"]);
                            	 $("#addbaseline1${id_suffix}").val(result["baseline1No"]);
                              }
                        	 else if(tag=="ft"){
                        	//特性赋值
                        	 $("#addobjectft${id_suffix}").val(result["feature"]);
                        	 $("#addengobjectft${id_suffix}").val(result["engfeature"]);
                        	 }else if(tag=="sf"){
                        	 //子特性赋值
                        	 $("#addobjectsf${id_suffix}").val(result["subfeature"]);
                        	 $("#addengobjectsf${id_suffix}").val(result["subengfeature"]);
                        	 }else if(tag=="ss"){
                            	 //子系统赋值
                            	 $("#addobjectss${id_suffix}").val(result["subsystem"]);
                            	 $("#addengobjectss${id_suffix}").val(result["subengsystem"]);
                            }else if(tag=="tm"){
                              	 //项目组赋值
                              	 $("#addobjecttm${id_suffix}").val(result["team"]);
                              	 $("#addengobjecttm${id_suffix}").val(result["engteam"]);
                            }else if(tag=="md"){
                           	 //模块赋值
                           	 $("#addobjectmd${id_suffix}").val(result["module"]);
                           	 $("#addengobjectmd${id_suffix}").val(result["engmodule"]);
                           	}else if(tag=="mv"){
                               	 //模块版本赋值
                               	 $("#addobjectmv${id_suffix}").val(result["moduleVersion"]);
                               	 $("#addengobjectmv${id_suffix}").val(result["engmoduleVersion"]);
                             }
                        	 
                        	 $('textarea[autoHeight]').autoHeight();  
                         }
                	 });
                	 
                }
                </script>
</body>
</html>
