
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width:100%">
<span style="font-size:12px;margin:4px;color:#999999">请先在“模块信息修改”区段中选择对应的子系统范围，再选择模块范围</span><br>
 <span style="margin:4px;font-weight:bold">模块:</span><input name="baseObjects[5][0].moduleno" style="width:50%;height:30px;" id="moduleno${id_suffix}" value="${module}" class="easyui-combobox"/><br>
                <a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}('mv');">查看已有模块版本清单</a><br>
                <input type="checkbox" class="combobox-checkbox" id="addproductmv${id_suffix}" onclick="checkProduct${id_suffix}('add','mv')"  name="baseObjects[5][0].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">新增模块版本</span><span class="numSpan">新增的模块版本个数，含*号：</span><span  id="addmvsum${id_suffix}" style="color:red;"></span><br>
				<div id="addTabmv${id_suffix}" style="margin:auto;width:100%;display:none">
				<span class="msgShow">（注意：多值请用回车来区分，对于不同模块之间的模块版本请用一个单独一行的“*”来分隔；如果模块版本的模块也是新增的，则类似模块的新增录入方法）<br/>
                   	同一模块版本的中英文的上下位置请保持一致，以免出错。</span><br/>
                	<a href="#" class="easyui-linkbutton" style="margin-left:20px;"  name="copyRelease" onclick="selectProject${id_suffix}('mv');">继承现有版本信息</a>
				
				    <table class="product" cellspacing="0"  style="margin:auto;width:100%">
                      <tr>
               <!--  <td width="20%">新增后的内码:</td> -->
                <td width="40%">要新增的模块版本中文名称</td>
                <td width="40%" class="aLink">要新增的模块版本英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('add','mv','','eng');">与中文名称设置一致</a></td>
               </tr>
                <tr>
                <!-- <td width="20%"></td> -->
                <td width="40%"><textarea name="baseObjects[5][0].objectname" autoHeight="true" style="width:100%;height:30px;" id="addobjectmv${id_suffix}"    >${entity.baseObjects[5][0].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[5][0].engobject" autoHeight="true" style="width:100%;height:30px;" id="addengobjectmv${id_suffix}"    >${entity.baseObjects[5][0].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="editproductmv${id_suffix}" onclick="checkProduct${id_suffix}('edit','mv')"  name="baseObjects[5][1].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">修改模块版本</span><span  class="numSpan">修改的模块版本个数：</span><span id="editmvsum${id_suffix}" style="color:red;"></span><br>
				<div id="editTabmv${id_suffix}" style="margin:auto;width:100%;display:none">
				  <span class="msgShow">同一模块版本的中英文的上下位置请保持一致，以免出错。</span><br/>
                	
				  <table class="product" cellspacing="0" style="margin:auto;width:100%">
                 <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要修改的模块版本:</span>&nbsp <input name="baseObjects[5][1].objectnoSel" style="width:46%;height:30px;" id="objectnoSelEditmv${id_suffix}" value="${editModuleVersionNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                <tr>
                <td width="20%">要修改的模块版本内码</td>
                <td width="40%">原模块版本中文名称</td>
                <td width="40%">修改后的模块版本中文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[5][1].objectno" readonly="readonly" style="width:100%;height:30px;" id="editobjectnomv${id_suffix}"    >${entity.baseObjects[5][1].objectno}</textarea>
                <textarea name="baseObjects[5][1].objectnoold" style="width:100%;height:30px;" hidden=true id="editobjectnooldmv${id_suffix}"    >${entity.baseObjects[5][1].objectnoold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[5][1].objectnameold" readonly="readonly" autoHeight="true" style="width:100%;height:30px;" id="editobjectnameoldmv${id_suffix}"    >${entity.baseObjects[5][1].objectnameold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[5][1].objectname" autoHeight="true" style="width:100%;height:30px;" id="editobjectmv${id_suffix}"    >${entity.baseObjects[5][1].objectname}</textarea></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%">原模块版本英文名称</td>
                <td width="40%" class="aLink">修改后的模块版本英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','mv','','eng');">与修改后的中文名称设置一致</a></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%"><textarea name="baseObjects[5][1].engobjectold" readonly="readonly" autoHeight="true" style="width:100%;height:30px;" id="editengobjectoldmv${id_suffix}">${entity.baseObjects[5][1].engobjectold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[5][1].engobject" autoHeight="true" style="width:100%;height:30px;" id="editengobjectmv${id_suffix}" >${entity.baseObjects[5][1].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="delproductmv${id_suffix}" onclick="checkProduct${id_suffix}('del','mv')"  name="baseObjects[5][2].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">停用模块版本</span><br>
				<div id="delTabmv${id_suffix}" style="margin:auto;width:100%;display:none">
				  <table class="product" cellspacing="0" style="margin:auto;width:100%">
                 <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要停用的模块版本:</span>&nbsp <input name="baseObjects[5][2].objectnoSel" style="width:46%;height:30px;" id="objectnoDelSelmv${id_suffix}" value="${delModuleVersionNo}" 
				 type="" class="easyui-combobox"/>
                </td>
                </tr>
                 <tr>
                <td width="20%">要停用的模块版本内码</td>
                <td width="40%">要停用的模块版本中文名称</td>
                <td width="40%">要停用的模块版本英文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[5][2].objectno" readonly="readonly" autoHeight="true" style="width:100%;height:30px;" id="delobjectnomv${id_suffix}"    >${entity.baseObjects[5][2].objectno}</textarea></td>
                <td width="40%"><textarea name="baseObjects[5][2].objectname" readonly="readonly" autoHeight="true" style="width:100%;height:30px;" id="delobjectnamemv${id_suffix}"    >${entity.baseObjects[5][2].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[5][2].engobject" readonly="readonly" autoHeight="true" style="width:100%;height:30px;" id="delengobjectmv${id_suffix}"    >${entity.baseObjects[5][2].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
                <script type="text/javascript">
                $(function(){
                	//模块校验
          		  $("#moduleno${id_suffix}").combobox({
          				/* url : [],data : '[]',
          				method : "post",
          				valueField : 'value',
          				textField : 'text', */
          				editable:false,
          				required:false,
          				missingMessage:"请选择模块",
          				multiple: true, 
          				formatter: function (row) {
          	                var opts = $(this).combobox('options');
          	                if(row[opts.valueField]!=undefined){
          		                return '<input type="checkbox" class="combobox-checkbox" id="' + row[opts.valueField] + '">' + row[opts.textField]
          		                }else{
          		                	return '';
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
          	            },
          	            onChange:function(newValue,oldValue){
          	            	 //请选择要修改的模块版本
          					 if($("#objectnoSelEditmv${id_suffix}").length>0){
          						 $('#objectnoSelEditmv${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MV&code='+newValue+'&sub_code=' + $('#objectnoSelEditmv${id_suffix}').combobox("getValues"));
          					 }
          					//请选择要停用的模块版本
          					 if($("#objectnoDelSelmv${id_suffix}").length>0){
          						 $('#objectnoDelSelmv${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MV&code='+newValue+'&sub_code=' + $('#objectnoDelSelmv${id_suffix}').combobox("getValues"));
          					 } 
          	            },
          				onSelect: function(rec){
          					 if('${showStatus}'=='edit'){
          					//请选择要修改的模块版本
          					  if($("#objectnoSelEditmv${id_suffix}").length>0){
          						   
          						 var subcodes=$("#editobjectnomv${id_suffix}").val();
          						if(subcodes!=""&&subcodes.split(/\r?\n/).length>0){
          							subcodes=subcodes.replace(/\r?\n/,',');
          						} 
          						
          						 $('#objectnoSelEditmv${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MV&code='+$("#moduleno${id_suffix}").val()+'&sub_code=' + subcodes);
          						  if(subcodes!=""){
          							  //$('#objectnoSelEditmv${id_suffix}').val(subcodes);
          							 //$('#objectnoSelEditmv${id_suffix}').combobox("setValues",subcodes.split(','));	
          						 }  
          					  }
          					//请选择要停用的模块版本
          					 if($("#objectnoDelSelmv${id_suffix}").length>0){
          						 $('#objectnoDelSelmv${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MV&code='+$("#moduleno${id_suffix}").val()+'&sub_code=' + subcodes);
          					
          					 } 
          					} 
          				},
          				onUnselect: function (row) {
                              var opts = $(this).combobox('options');
                              var el = opts.finder.getEl(this, row[opts.valueField]);
                              el.find('input.combobox-checkbox')._propAttr('checked', false);
                          },
          					onLoadSuccess: function () {
          						 if($("#moduleno${id_suffix}").val()=="null"){
          		                	 $("#moduleno${id_suffix}").combobox("setValue","");
          		                 }
          						$("#moduleno${id_suffix}").unbind("onLoadSuccess"); 
          				    }
          		   });
          		 
          			
          	
          		//修改的模块版本校验
          		  $("#objectnoSelEditmv${id_suffix}").combobox({
          			/* 	url : [],data : '[]',
          				method : "post",
          				valueField : 'value',
          				textField : 'text', */
          				editable:false,
          				required:false,
          				missingMessage:"请选择要修改的模块版本",
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
          	            },
          	            onChange:function(newVal,oldVal){
          	            	
          	            	$("#editobjectnomv${id_suffix}").val("");
          					$("#editobjectnooldmv${id_suffix}").val("");
          					$("#editobjectmv${id_suffix}").val("");
          					$("#editobjectnameoldmv${id_suffix}").val("");
          					$("#editengobjectmv${id_suffix}").val("");
          					$("#editengobjectoldmv${id_suffix}").val("");
          					//$('textarea[autoHeight]').autoHeight();
          	            	
          	            	var currentVal="";
          	            	if(newVal==""||newVal==null){
          	            		currentVal=$('#objectnoSelEditmv${id_suffix}').combobox("getValue");
          						return false;
          	            	}else{
          	            		currentVal=newVal.join(",");
          	            	}
          	            	 $.ajax({
          			                type: "POST",
          			                url: '/product/comboboxdata/listWithId?type=MV&code='+$("#moduleno${id_suffix}").val()+'&sub_code=' + currentVal,
          			                data:{},
          			                async: false,
          			                success: function (rec) {
          			                	if(rec!=null){
          			                		for (var i = 0; i < rec.length; i++) {
          			                			if($("#editobjectnomv${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
          				    						$("#editobjectnomv${id_suffix}").val(($("#editobjectnomv${id_suffix}").val()==""?"":($("#editobjectnomv${id_suffix}").val()+"\r"))+Trim(rec[i].value));
          				    						$("#editobjectnooldmv${id_suffix}").val(($("#editobjectnooldmv${id_suffix}").val()==""?"":($("#editobjectnooldmv${id_suffix}").val()+"\r"))+Trim(rec[i].value));
          				    						
          				    						$("#editobjectmv${id_suffix}").val(($("#editobjectmv${id_suffix}").val()==""?"":($("#editobjectmv${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
          				    						$("#editobjectnameoldmv${id_suffix}").val(($("#editobjectnameoldmv${id_suffix}").val()==""?"":($("#editobjectnameoldmv${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
          				    						$("#editengobjectmv${id_suffix}").val(($("#editengobjectmv${id_suffix}").val()==""?"":($("#editengobjectmv${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
          				    						$("#editengobjectoldmv${id_suffix}").val(($("#editengobjectoldmv${id_suffix}").val()==""?"":($("#editengobjectoldmv${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
          				    						
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
                             
                          },
          				onLoadSuccess: function (rec) {
          					 var opts = $(this).combobox('options');
          	                 var el = opts.finder.getEl(this, rec[opts.valueField]);
          	                 el.find('input.combobox-checkbox')._propAttr('checked', true);
          	                 if($("#objectnoSelEditmv${id_suffix}").val()=="null"){
          	                	 $("#objectnoSelEditmv${id_suffix}").combobox("setValue","");
          	                 }
          	                $("#objectnoSelEditmv${id_suffix}").unbind("onLoadSuccess"); 
          			    }
          		   });
          		
          		//停用的模块版本校验
          		  $("#objectnoDelSelmv${id_suffix}").combobox({
          				/* url : [],data : '[]',
          				method : "post",
          				valueField : 'value',
          				textField : 'text', */
          				editable:false,
          				required:false,
          				missingMessage:"请选择要停用的模块版本",
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
          	            },
          	            onChange:function(newVal,oldVal){
                      	    $("#delobjectnomv${id_suffix}").val("");
          					$("#delobjectnamemv${id_suffix}").val("");
          					$("#delengobjectmv${id_suffix}").val("");
          					
          					var currentVal="";
          	            	if(newVal==""||newVal==null){
          	            		currentVal=$('#objectnoDelSelmv${id_suffix}').combobox("getValue");
          						return false;
          	            	}else{
          	            		currentVal=newVal.join(",");
          	            	}
          	            	 $.ajax({
          			                type: "POST",
          			                url: '/product/comboboxdata/listWithId?type=MV&code='+$("#moduleno${id_suffix}").val()+'&sub_code=' + currentVal,
          			                data:{},
          			                async: false,
          			                success: function (rec) {
          			                	if(rec!=null){
          			                		for (var i = 0; i < rec.length; i++) {
          			                			if($("#delobjectnomv${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
          				    						$("#delobjectnomv${id_suffix}").val(($("#delobjectnomv${id_suffix}").val()==""?"":($("#delobjectnomv${id_suffix}").val()+"\r"))+Trim(rec[i].value));
          				    						
          				    						$("#delobjectnamemv${id_suffix}").val(($("#delobjectnamemv${id_suffix}").val()==""?"":($("#delobjectnamemv${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
          				    					
          				    						$("#delengobjectmv${id_suffix}").val(($("#delengobjectmv${id_suffix}").val()==""?"":($("#delengobjectmv${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
          				    						
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
                             
                          },
          				onLoadSuccess: function (rec) {
          					 var opts = $(this).combobox('options');
          	                 var el = opts.finder.getEl(this, rec[opts.valueField]);
          	                 el.find('input.combobox-checkbox')._propAttr('checked', true);
          	                 if($("#objectnoDelSelmv${id_suffix}").val()=="null"){
          	                	 $("#objectnoDelSelmv${id_suffix}").combobox("setValue","");
          	                 }
          					$("#objectnoDelSelmv${id_suffix}").unbind("onLoadSuccess"); 
          			    }
          		   });
          		
                });
                </script>
</body>
</html>
