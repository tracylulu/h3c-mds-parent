
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width:100%">
 <span style="margin:4px;font-weight:bold">子系统:</span><input name="baseObjects[4][0].subsystemno" style="width:50%;height:30px;" id="subsystemno${id_suffix}" value="${subsystem}" class="easyui-combobox"/><br>
                <a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}('md');">查看已有模块清单</a><br>
                <input type="checkbox" class="combobox-checkbox" id="addproductmd${id_suffix}" onclick="checkProduct${id_suffix}('add','md')"  name="baseObjects[4][0].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">新增模块</span><span class="numSpan">新增的模块个数，含*号：</span><span  id="addmdsum${id_suffix}" style="color:red;"></span><br>
				<div id="addTabmd${id_suffix}" style="margin:auto;width:100%;display:none">
				<span class="msgShow">（注意：多值请用回车来区分，对于不同子系统之间的模块请用一个单独一行的“*”来分隔；如果您所要新增模块子系统也是新增的，则以新增子系统表格中的顺序来填写模块信息，也用单独一行的“*”分隔不同子系统。同时注意：先录入已有子系统的新模块，再入新增子系统的新模块）  同一模块的中英文的上下位置请保持一致，以免出错。</span><br/>
                	<a href="#" class="easyui-linkbutton" style="margin-left:20px;" name="copyRelease" onclick="selectProject${id_suffix}('md');">继承现有版本信息</a>
				
				    <table class="product" cellspacing="0"  style="margin:auto;width:100%">
                      <tr>
                <!-- <td width="20%">新增后的内码:</td> -->
                <td width="40%">要新增的模块中文名称</td>
                <td width="40%" class="aLink">要新增的模块英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('add','md','','eng');">与中文名称设置一致</a></td>
               </tr>
                <tr>
                <!-- <td width="20%"></td> -->
                <td width="40%"><textarea name="baseObjects[4][0].objectname" autoHeight="true" style="width:100%;height:30px;" id="addobjectmd${id_suffix}"    >${entity.baseObjects[4][0].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[4][0].engobject" autoHeight="true" style="width:100%;height:30px;" id="addengobjectmd${id_suffix}"    >${entity.baseObjects[4][0].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="editproductmd${id_suffix}" onclick="checkProduct${id_suffix}('edit','md')"  name="baseObjects[4][1].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">修改模块</span><span class="numSpan">修改的模块个数：</span><span  id="editmdsum${id_suffix}" style="color:red;"></span><br>
				<div id="editTabmd${id_suffix}" style="margin:auto;width:100%;display:none">
				 	 <span class="msgShow">同一模块的中英文的上下位置请保持一致，以免出错。</span><br/>
                	
				  <table class="product" cellspacing="0" style="margin:auto;width:100%">
                 <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要修改的模块:</span>&nbsp <input name="baseObjects[4][1].objectnoSel" style="width:46%;height:30px;" id="objectnoSelEditmd${id_suffix}" value="${editModuleNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                <tr>
                <td width="20%">要修改的模块内码</td>
                <td width="40%">原模块中文名称</td>
                <td width="40%">修改后的模块中文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[4][1].objectno" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="editobjectnomd${id_suffix}"    >${entity.baseObjects[4][1].objectno}</textarea>
                <textarea name="baseObjects[4][1].objectnoold" autoHeight="true" hidden=true style="width:100%;height:30px;" id="editobjectnooldmd${id_suffix}"    >${entity.baseObjects[4][1].objectnoold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[4][1].objectnameold" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="editobjectnameoldmd${id_suffix}"    >${entity.baseObjects[4][1].objectnameold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[4][1].objectname" autoHeight="true" style="width:100%;height:30px;" id="editobjectmd${id_suffix}"    >${entity.baseObjects[4][1].objectname}</textarea></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%">原模块英文名称</td>
                <td width="40%" class="aLink">修改后的模块英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','md','','eng');">与修改后的中文名称设置一致</a></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%"><textarea name="baseObjects[4][1].engobjectold" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="editengobjectoldmd${id_suffix}"    >${entity.baseObjects[4][1].objectnameold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[4][1].engobject" autoHeight="true" style="width:100%;height:30px;" id="editengobjectmd${id_suffix}"    >${entity.baseObjects[4][1].objectname}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="delproductmd${id_suffix}" onclick="checkProduct${id_suffix}('del','md')"  name="baseObjects[4][2].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">停用模块产品</span><br>
				<div id="delTabmd${id_suffix}" style="margin:auto;width:100%;display:none">
				  <table class="product" cellspacing="0" style="margin:auto;width:100%">
                  <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要停用的模块:</span>&nbsp <input name="baseObjects[4][2].objectnoSel" style="width:46%;height:30px;" id="objectnoDelSelmd${id_suffix}" value="${delModuleNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                </tr>
                 <tr>
                <td width="20%">要停用的模块内码</td>
                <td width="40%">要停用的模块中文名称</td>
                <td width="40%">要停用的模块英文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[4][2].objectno" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="delobjectnomd${id_suffix}"    >${entity.baseObjects[4][2].objectno}</textarea></td>
                <td width="40%"><textarea name="baseObjects[4][2].objectname" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="delobjectnamemd${id_suffix}"    >${entity.baseObjects[4][2].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[4][2].engobject" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="delengobjectmd${id_suffix}"    >${entity.baseObjects[4][2].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
                <script type="text/javascript">
                $(function(){
                	//子系统校验
          		  $("#subsystemno${id_suffix}").combobox({
          				/* url : [],data : '[]',
          				method : "post",
          				valueField : 'value',
          				textField : 'text', */
          				editable:false,
          				required:false,
          				missingMessage:"请选择子系统",
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
          	            	
          	             	 if($("#moduleno${id_suffix}").length > 0&& $("#moduleno${id_suffix}").attr("type")!="hidden"){
          				     	$('#moduleno${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MD&code='+newValue+'&sub_code=' + $('#moduleno${id_suffix}').val()); 
          				    } 
          				 //请选择要修改的模块
          					 if($("#objectnoSelEditmd${id_suffix}").length>0){
          					 $('#objectnoSelEditmd${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MD&code='+newValue+'&sub_code=' + $('#objectnoSelEditmd${id_suffix}').combobox("getValue"));
          					 }
          				 //请选择要停用的模块
          				 	if($("#objectnoDelSelmd${id_suffix}").length>0){
          					 $('#objectnoDelSelmd${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MD&code='+newValue+'&sub_code=' + $('#objectnoDelSelmd${id_suffix}').combobox("getValue"));
          					 }  
          	            },
          				onSelect: function(rec){
          					
          				  	if('${showStatus}'=='edit'){
          					   if($("#moduleno${id_suffix}").length > 0&& $("#moduleno${id_suffix}").attr("type")!="hidden"){
          					     	$('#moduleno${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MD&code='+$('#subsystemno${id_suffix}').val()+'&sub_code=' + $('#moduleno${id_suffix}').combobox("getValues")); 
          					  } 
          					 //请选择要修改的模块
          					 if($("#objectnoSelEditmd${id_suffix}").length>0){
          						 $('#objectnoSelEditmd${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MD&code='+$('#subsystemno${id_suffix}').val()+'&sub_code=' + $('#objectnoSelEditmd${id_suffix}').combobox("getValues"));
          					 }
          					 //请选择要停用的模块
          					 if($("#objectnoDelSelmd${id_suffix}").length>0){
          						 $('#objectnoDelSelmd${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=MD&code='+$('#subsystemno${id_suffix}').val()+'&sub_code=' + $('#objectnoDelSelmd${id_suffix}').combobox("getValues"));
          					 }  
          					}  
          				},
                          onUnselect: function (row) {
                              var opts = $(this).combobox('options');
                              var el = opts.finder.getEl(this, row[opts.valueField]);
                              el.find('input.combobox-checkbox')._propAttr('checked', false);
                          },
          				onLoadSuccess: function () {
          					 if($("#subsystemno${id_suffix}").val()=="null"){
          	                	 $("#subsystemno${id_suffix}").combobox("setValue","");
          	                 }
          					$("#subsystemno${id_suffix}").unbind("onLoadSuccess"); 
          			    }
          		   });
                	
          		 //请选择要修改的模块
       		   $("#objectnoSelEditmd${id_suffix}").combobox({
       				/* url : [],data : '[]',
       				method : "post",
       				valueField : 'value',
       				textField : 'text', */
       				editable:false,
       				required:false,
       				missingMessage:"请选择要修改的模块",
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
                   	    $("#editobjectnomd${id_suffix}").val("");
       					$("#editobjectnooldmd${id_suffix}").val("");
       					$("#editobjectnameoldmd${id_suffix}").val("");
       					$("#editobjectmd${id_suffix}").val("");
       					$("#editengobjectoldmd${id_suffix}").val("");
       					$("#editengobjectmd${id_suffix}").val("");
       					
       					var currentVal="";
       	            	if(newVal==""||newVal==null){
       	            		currentVal=$('#objectnoSelEditmd${id_suffix}').combobox("getValue");
       						return false;
       	            	}else{
       	            		currentVal=newVal.join(",");
       	            	}
       	            	 $.ajax({
       			                type: "POST",
       			                url: '/product/comboboxdata/listWithId?type=MD&code='+$("#subsystemno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
       			                data:{},
       			                async: false,
       			                success: function (rec) {
       			                	if(rec!=null){
       			                		for (var i = 0; i < rec.length; i++) {
       			                			if($("#editobjectnomd${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
       				    						$("#editobjectnomd${id_suffix}").val(($("#editobjectnomd${id_suffix}").val()==""?"":($("#editobjectnomd${id_suffix}").val()+"\r"))+Trim(rec[i].value));
       				    						$("#editobjectnooldmd${id_suffix}").val(($("#editobjectnooldmd${id_suffix}").val()==""?"":($("#editobjectnooldmd${id_suffix}").val()+"\r"))+Trim(rec[i].value));
       				    						
       				    						$("#editobjectnameoldmd${id_suffix}").val(($("#editobjectnameoldmd${id_suffix}").val()==""?"":($("#editobjectnameoldmd${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
       				    						$("#editobjectmd${id_suffix}").val(($("#editobjectmd${id_suffix}").val()==""?"":($("#editobjectmd${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
       				    						
       				    						$("#editengobjectoldmd${id_suffix}").val(($("#editengobjectoldmd${id_suffix}").val()==""?"":($("#editengobjectoldmd${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
       				    						$("#editengobjectmd${id_suffix}").val(($("#editengobjectmd${id_suffix}").val()==""?"":($("#editengobjectmd${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
       				    						
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
       	                 if($("#objectnoSelEditmd${id_suffix}").val()=="null"){
       	                	 $("#objectnoSelEditmd${id_suffix}").combobox("setValue","");
       	                 }
       					$("#objectnoSelEditmd${id_suffix}").unbind("onLoadSuccess"); 
       			    }
       		   });
       			 //请选择要停用的模块
       			  $("#objectnoDelSelmd${id_suffix}").combobox({
       				/* url : [],data : '[]',
       				method : "post",
       				valueField : 'value',
       				textField : 'text', */
       				editable:false,
       				required:false,
       				missingMessage:"请选择要停用的模块",
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
                   	    $("#delobjectnomd${id_suffix}").val("");
       					$("#delobjectnamemd${id_suffix}").val("");
       					$("#delengobjectmd${id_suffix}").val("");
       					
       					
       					var currentVal="";
       	            	if(newVal==""||newVal==null){
       	            		currentVal=$('#objectnoDelSelmd${id_suffix}').combobox("getValue");
       						return false;
       	            	}else{
       	            		currentVal=newVal.join(",");
       	            	}
       	            	 $.ajax({
       			                type: "POST",
       			                url: '/product/comboboxdata/listWithId?type=MD&code='+$("#subsystemno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
       			                data:{},
       			                async: false,
       			                success: function (rec) {
       			                	if(rec!=null){
       			                		for (var i = 0; i < rec.length; i++) {
       			                			if($("#delobjectnomd${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
       				    						$("#delobjectnomd${id_suffix}").val(($("#delobjectnomd${id_suffix}").val()==""?"":($("#delobjectnomd${id_suffix}").val()+"\r"))+Trim(rec[i].value));
       				    						
       				    						$("#delobjectnamemd${id_suffix}").val(($("#delobjectnamemd${id_suffix}").val()==""?"":($("#delobjectnamemd${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
       				    						
       				    						$("#delengobjectmd${id_suffix}").val(($("#delengobjectmd${id_suffix}").val()==""?"":($("#delengobjectmd${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
       				    						
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
       	                 if($("#objectnoDelSelmd${id_suffix}").val()=="null"){
       	                	 $("#objectnoDelSelmd${id_suffix}").combobox("setValue","");
       	                 }
       					$("#objectnoDelSelmd${id_suffix}").unbind("onLoadSuccess"); 
       			    }
       		   });
                });
                </script>
</body>
</html>
