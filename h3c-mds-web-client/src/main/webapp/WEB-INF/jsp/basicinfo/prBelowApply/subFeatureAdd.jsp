
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width:100%">
 <span style="margin:4px;font-weight:bold">特性:</span><input name="baseObjects[1][0].featureno" style="width:50%;height:30px;" id="featureno${id_suffix}" value="${feature}" class="easyui-combobox"/><br>
                <a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}('sf');">查看已有子特性清单</a><br>
                <input type="checkbox" class="combobox-checkbox" id="addproductsf${id_suffix}" onclick="checkProduct${id_suffix}('add','sf')"  name="baseObjects[1][0].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">新增子特性</span><span  class="numSpan"> 新增的子特性个数，含*号：</span><span id="addsfsum${id_suffix}" style="color:red;"></span><br>
				<div id="addTabsf${id_suffix}" style="margin:auto;width:100%;display:none">
				 <span class="msgShow">（注意：多值请用回车来区分，对于不同特性之间的子特性请用一个单独一行的“*”来分隔；如果您所要新增子特性特性也是新增的，则以新增特性表格中的顺序来填写子特性信息，也用单独一行的“*”分隔不同特性。同时注意：先录入已有特性的新子特性，再入新增特性的新子特性）
                   	   同一子特性的中英文的上下位置请保持一致，以免出错。</span><br/>
                	   <a href="#" class="easyui-linkbutton"  style="margin-left:20px;" name="copyRelease" onclick="selectProject${id_suffix}('sf');">继承现有版本信息</a>
				
				    <table class="product"  cellspacing="0"  style="margin:auto;width:100%">
                     <tr>
                <!-- <td width="20%">新增后的内码:</td> -->
                <td width="40%">要新增的子特性中文名称</td>
                <td width="40%" class="aLink">要新增的子特性英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('add','sf','','eng');">与中文名称设置一致</a></td>
               </tr>
                <tr>
               <!--  <td width="20%"></td> -->
                <td width="40%"><textarea name="baseObjects[1][0].objectname" style="width:100%;" autoHeight="true" id="addobjectsf${id_suffix}"   >${entity.baseObjects[1][0].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[1][0].engobject" style="width:100%;" autoHeight="true" id="addengobjectsf${id_suffix}"   >${entity.baseObjects[1][0].engobject}</textarea></td>
               </tr>
                </table>
				</div>
				<hr>
				<input type="checkbox" class="combobox-checkbox" id="editproductsf${id_suffix}" onclick="checkProduct${id_suffix}('edit','sf')"  name="baseObjects[1][1].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">修改子特性</span><span  class="numSpan">修改的子特性个数：</span><span  id="editsfsum${id_suffix}" style="color:red;"></span><br>
				<div id="editTabsf${id_suffix}" style="margin:auto;width:100%;display:none">
				  <span class="msgShow">同一子特性的中英文的上下位置请保持一致，以免出错。</span><br>
				  <table class="product" border="1" cellspacing="0" style="margin:auto;width:100%">
                  <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要修改的子特性:</span>&nbsp <input name="baseObjects[1][1].objectnoSel" style="width:46%;height:30px;" id="objectnoSelEditsf${id_suffix}" value="${editsubfeatureNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                <tr>
                <td width="20%">要修改的子特性内码</td>
                <td width="40%">原子特性中文名称</td>
                <td width="40%">修改后的子特性中文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[1][1].objectno" readonly="readonly" autoHeight="true"  style="width:100%;height:30px;" id="editobjectnosf${id_suffix}"  >${entity.baseObjects[1][1].objectno}</textarea>
                <textarea name="baseObjects[1][1].objectnoold" autoHeight="true" hidden=true  style="width:100%;height:30px;" id="editobjectnooldsf${id_suffix}"  >${entity.baseObjects[1][1].objectnoold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[1][1].objectnameold" autoHeight="true"  readonly="readonly" style="width:100%;height:30px;" id="editobjectnameoldsf${id_suffix}"   >${entity.baseObjects[1][1].objectnameold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[1][1].objectname" autoHeight="true"  style="width:100%;height:30px;" id="editobjectsf${id_suffix}"   >${entity.baseObjects[1][1].objectname}</textarea></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%">原子特性英文名称</td>
                <td width="40%" class="aLink">修改后的子特性英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','sf','','eng');">与修改后的中文名称设置一致</a></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%"><textarea name="baseObjects[1][1].engobjectold" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="editengobjectoldsf${id_suffix}"   >${entity.baseObjects[1][1].engobjectold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[1][1].engobject" autoHeight="true" style="width:100%;height:30px;" id="editengobjectsf${id_suffix}"   >${entity.baseObjects[1][1].engobject}</textarea></td>
               </tr>
                </table>
				</div>
				<hr>
				<input type="checkbox" class="combobox-checkbox" id="delproductsf${id_suffix}" onclick="checkProduct${id_suffix}('del','sf')"  name="baseObjects[1][2].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">停用子特性</span><br>
				 <div id="delTabsf${id_suffix}" style="margin:auto;width:100%;display:none">
				  <table class="product" border="1" cellspacing="0" style="margin:auto;width:100%">
                  <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要停用的子特性:</span>&nbsp <input name="baseObjects[1][2].objectnoSel" style="width:46%;height:30px;" id="subfeatureDelSelsf${id_suffix}" value="${delsubfeatureNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                </tr>
                 <tr>
                <td width="20%">要停用的子特性内码</td>
                <td width="40%">要停用的子特性中文名称</td>
                <td width="40%">要停用的子特性英文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[1][2].objectno" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="delobjectnosf${id_suffix}"   >${entity.baseObjects[1][2].objectno}</textarea></td>
                <td width="40%"><textarea name="baseObjects[1][2].objectname" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="delobjectnamesf${id_suffix}"   >${entity.baseObjects[1][2].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[1][2].engobject" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="delengobjectsf${id_suffix}"   >${entity.baseObjects[1][2].engobject}</textarea></td>
               </tr>
                </table>
                </div>
               	<hr>
               	<script type="text/javascript">
               	$(function(){
               	 //特性校验
          		  $("#featureno${id_suffix}").combobox({
          				/* url : [],data : '[]',
          				method : "post",
          				valueField : 'value',
          				textField : 'text', */
          				editable:false,
          				required:false,
          				missingMessage:"请选择特性",
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
          	            onChange:function(newValue,oldValue){
          	            	//选择要修改的子特性
          					if($("#objectnoSelEditsf${id_suffix}").length>0){
          						$('#objectnoSelEditsf${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=SF&code='+newValue+'&sub_code=' + $('#objectnoSelEditsf${id_suffix}').combobox("getValues"));
          					}
          					
          					//选择要停用的子特性
          					if($("#subfeatureDelSelsf${id_suffix}").length>0){
          						$('#subfeatureDelSelsf${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=SF&code='+newValue+'&sub_code=' + $('#subfeatureDelSelsf${id_suffix}').combobox("getValues"));
          					}
          	            },
          				onSelect: function(rec){
          					//选择要修改的子特性
          					if($("#objectnoSelEditsf${id_suffix}").length>0){
          						$('#objectnoSelEditsf${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=SF&code='+rec.value+'&sub_code=' + $('#objectnoSelEditsf${id_suffix}').combobox("getValues"));
          					}
          					
          					//选择要停用的子特性
          					if($("#subfeatureDelSelsf${id_suffix}").length>0){
          						$('#subfeatureDelSelsf${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=SF&code='+rec.value+'&sub_code=' + $('#subfeatureDelSelsf${id_suffix}').combobox("getValues"));
          					}
          				},
          				onUnselect: function (row) {
                              var opts = $(this).combobox('options');
                              var el = opts.finder.getEl(this, row[opts.valueField]);
                              el.find('input.combobox-checkbox')._propAttr('checked', false);
                          },
          				onLoadSuccess: function () {
          					
          					 if($("#featureno${id_suffix}").val()=="null"){
          	                	 $("#featureno${id_suffix}").combobox("setValue","");
          	                 }
          					$("#featureno${id_suffix}").unbind("onLoadSuccess"); 
          			    }
          		   });
          		//选择要修改的子特性校验
          		 $("#objectnoSelEditsf${id_suffix}").combobox({
          				/* url : [],data : '[]',
          				method : "post",
          				valueField : 'value',
          				textField : 'text', */
          				editable:false,
          				required:false,
          				missingMessage:"请选择要修改的子特性",
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
          	            },onChange:function(newVal,oldVal){
          	            	
          	            	    $("#editobjectnosf${id_suffix}").val("");
          						$("#editobjectnooldsf${id_suffix}").val("");
          						$("#editobjectnameoldsf${id_suffix}").val("");
          						$("#editobjectsf${id_suffix}").val("");
          						$("#editengobjectoldsf${id_suffix}").val("");
          						$("#editengobjectsf${id_suffix}").val("");
          					
          						var currentVal="";
          		            	if(newVal==""||newVal==null){
          		            		currentVal=$('#objectnoSelEditsf${id_suffix}').val();
          							return false;
          		            	}else{
          		            		currentVal=newVal.join(",");
          		            	}
          		            	 $.ajax({
          				                type: "POST",
          				                url: '/product/comboboxdata/listWithId?type=SF&code='+$("#featureno${id_suffix}").val()+'&sub_code=' + currentVal,
          				                data:{},
          				                async: false,
          				                success: function (rec) {
          				                	if(rec!=null){
          				                		for (var i = 0; i < rec.length; i++) {
          				                			if($("#editobjectnosf${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
          					    						$("#editobjectnosf${id_suffix}").val(($("#editobjectnosf${id_suffix}").val()==""?"":($("#editobjectnosf${id_suffix}").val()+"\r"))+Trim(rec[i].value));
          					    						$("#editobjectnooldsf${id_suffix}").val(($("#editobjectnooldsf${id_suffix}").val()==""?"":($("#editobjectnooldsf${id_suffix}").val()+"\r"))+Trim(rec[i].value));
          					    						
          					    						$("#editobjectnameoldsf${id_suffix}").val(($("#editobjectnameoldsf${id_suffix}").val()==""?"":($("#editobjectnameoldsf${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
          					    						$("#editobjectsf${id_suffix}").val(($("#editobjectsf${id_suffix}").val()==""?"":($("#editobjectsf${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
          					    						
          					    						$("#editengobjectoldsf${id_suffix}").val(($("#editengobjectoldsf${id_suffix}").val()==""?"":($("#editengobjectoldsf${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
          					    						$("#editengobjectsf${id_suffix}").val(($("#editengobjectsf${id_suffix}").val()==""?"":($("#editengobjectsf${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
          					    						
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
          	                 
          	                 if($("#objectnoSelEditsf${id_suffix}").val()=="null"){
          	                	 $("#objectnoSelEditsf${id_suffix}").combobox("setValue","");
          	                 }
          					$("#objectnoSelEditsf${id_suffix}").unbind("onLoadSuccess"); 
          			    }
          		   });
          			//选择要停用的子特性校验
          			 $("#subfeatureDelSelsf${id_suffix}").combobox({
          					/* url : [],data : '[]',
          					method : "post",
          					valueField : 'value',
          					textField : 'text', */
          					editable:false,
          					required:false,
          					missingMessage:"请选择要停用的子特性",
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
          		            },onChange:function(newVal,oldVal){
          	            	    $("#delobjectnosf${id_suffix}").val("");
          						$("#delobjectnamesf${id_suffix}").val("");
          						$("#delengobjectsf${id_suffix}").val("");
          						
          						var currentVal="";
          		            	if(newVal==""||newVal==null){
          		            		currentVal=$('#subfeatureDelSelsf${id_suffix}').combobox("getValue");
          							return false;
          		            	}else{
          		            		currentVal=newVal.join(",");
          		            	}
          		            	
          		            	 $.ajax({
          				                type: "POST",
          				                url: '/product/comboboxdata/listWithId?type=SF&code='+$("#featureno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
          				                data:{},
          				                async: false,
          				                success: function (rec) {
          				                	
          				                	if(rec!=null){
          				                		for (var i = 0; i < rec.length; i++) {
          				                			if($("#delobjectnosf${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
          					    						$("#delobjectnosf${id_suffix}").val(($("#delobjectnosf${id_suffix}").val()==""?"":($("#delobjectnosf${id_suffix}").val()+"\r"))+Trim(rec[i].value));
          					    						
          					    						$("#delobjectnamesf${id_suffix}").val(($("#delobjectnamesf${id_suffix}").val()==""?"":($("#delobjectnamesf${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
          					    					
          					    						$("#delengobjectsf${id_suffix}").val(($("#delengobjectsf${id_suffix}").val()==""?"":($("#delengobjectsf${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
          					    						
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
          		                 if($("#subfeatureDelSelsf${id_suffix}").val()=="null"){
          		                	 $("#subfeatureDelSelsf${id_suffix}").combobox("setValue","");
          		                 }
          		                 
          						$("#subfeatureDelSelsf${id_suffix}").unbind("onLoadSuccess"); 
          				    }
          			   });
               	});
               	</script>
</body>
</html>
