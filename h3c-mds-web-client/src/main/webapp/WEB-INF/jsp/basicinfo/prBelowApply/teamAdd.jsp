
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width:100%">
 <a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}('tm');">查看已有项目组清单</a><br>
                <input type="checkbox" class="combobox-checkbox" id="addproducttm${id_suffix}" onclick="checkProduct${id_suffix}('add','tm')"  name="baseObjects[2][0].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">新增项目组</span><span  class="numSpan"> 新增的项目组个数：</span><span id="addtmsum${id_suffix}" style="color:red;"></span><br>
				
				<div id="addTabtm${id_suffix}" style="margin:auto;width:100%;display:none">
				 <span class="msgShow">（注意：多值请用回车来区分    同一项目组的中英文的上下位置请保持一致，以免出错。</span><br/><a href="#" class="easyui-linkbutton" style="margin-left:20px;"  name="copyRelease" onclick="selectProject${id_suffix}('tm');">继承现有版本信息</a>
				
				    <table class="product" cellspacing="0"  style="margin:auto;width:100%">
                      <tr>
                <!-- <td width="20%">新增后的内码:</td> -->
                <td width="40%">要新增的项目组中文名称</td>
                <td width="40%" class="aLink">要新增的项目组英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('add','tm','','eng');">与中文名称设置一致</a></td>
               </tr>
                <tr>
               <!--  <td width="20%"></td> -->
                <td width="40%"><textarea name="baseObjects[2][0].objectname" autoHeight="true" style="width:100%;height:30px;" id="addobjecttm${id_suffix}"   >${entity.baseObjects[2][0].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[2][0].engobject" autoHeight="true" style="width:100%;height:30px;" id="addengobjecttm${id_suffix}"   >${entity.baseObjects[2][0].engobject}</textarea></td>
               </tr>
                </table>
				</div>
				<hr>
				<input type="checkbox" class="combobox-checkbox" id="editproducttm${id_suffix}" onclick="checkProduct${id_suffix}('edit','tm')"  name="baseObjects[2][1].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">修改项目组</span><span  class="numSpan"> 修改的项目组个数：</span><span id="edittmsum${id_suffix}" style="color:red;"></span><br>
				<div id="editTabtm${id_suffix}" style="margin:auto;width:100%;display:none">
				  <span class="msgShow">同一项目组的中英文的上下位置请保持一致，以免出错。</span><br/>
				  <table class="product" cellspacing="0" style="margin:auto;width:100%">
                 <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要修改的项目组:</span>&nbsp <input name="baseObjects[2][1].objectnoSel" style="width:46%;height:30px;" id="objectnoSelEdittm${id_suffix}" value="${editteamNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                <tr>
                <td width="20%">要修改的项目组内码</td>
                <td width="40%">原项目组中文名称</td>
                <td width="40%">修改后的项目组中文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[2][1].objectno" readonly="readonly" autoHeight="true" style="width:100%;height:30px;" id="editobjectnotm${id_suffix}">${entity.baseObjects[2][1].objectno}</textarea>
                <textarea name="baseObjects[2][1].objectnoold" autoHeight="true" hidden=true style="width:100%;height:30px;" id="editobjectnooldtm${id_suffix}"    >${entity.baseObjects[2][1].objectnoold}</textarea>
                </td>
                <td width="40%"><textarea name="baseObjects[2][1].objectnameold" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="editobjectnameoldtm${id_suffix}"    >${entity.baseObjects[2][1].objectnameold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[2][1].objectname" autoHeight="true" style="width:100%;height:30px;" id="editobjecttm${id_suffix}"    >${entity.baseObjects[2][1].objectname}</textarea></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%">原项目组英文名称</td>
                <td width="40%" class="aLink">修改后的项目组英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','tm','','eng');">与修改后的中文名称设置一致</a></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%"><textarea name="baseObjects[2][1].engobjectold" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="editengobjectoldtm${id_suffix}"  >${entity.baseObjects[2][1].engobjectold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[2][1].engobject" autoHeight="true" style="width:100%;height:30px;" id="editengobjecttm${id_suffix}"    >${entity.baseObjects[2][1].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="delproducttm${id_suffix}" onclick="checkProduct${id_suffix}('del','tm')"  name="baseObjects[2][2].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">停用项目组</span><br>
				<div id="delTabtm${id_suffix}" style="margin:auto;width:100%;display:none">
				  <table class="product" border="1" cellspacing="0" style="margin:auto;width:100%">
                  <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要停用的项目组:</span>&nbsp <input name="baseObjects[2][2].objectnoSel" style="width:46%;height:30px;" id="objectnoSelDeltm${id_suffix}" value="${delteamNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                </tr>
                 <tr>
                <td width="20%">要停用的项目组内码</td>
                <td width="40%">要停用的项目组中文名称</td>
                <td width="40%">要停用的项目组英文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[2][2].objectno" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="delobjectnotm${id_suffix}"    >${entity.baseObjects[2][2].objectno}</textarea></td>
                <td width="40%"><textarea name="baseObjects[2][2].objectname" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="delobjectnametm${id_suffix}"    >${entity.baseObjects[2][2].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[2][2].engobject" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="delengobjecttm${id_suffix}"    >${entity.baseObjects[2][2].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
                <script type="text/javascript">
                $(function(){
                	//选择要修改的项目组校验
           		 $("#objectnoSelEdittm${id_suffix}").combobox({
           				/* url : [],data : '[]',
           				method : "post",
           				valueField : 'value',
           				textField : 'text', */
           				editable:false,
           				required:false,
           				missingMessage:"请选择要修改的项目组",
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
           	            	$("#editobjectnotm${id_suffix}").val("");
           					$("#editobjectnooldtm${id_suffix}").val("");
           					$("#editobjectnameoldtm${id_suffix}").val("");
           					$("#editengobjectoldtm${id_suffix}").val("");
           					$("#editobjecttm${id_suffix}").val("");
           					$("#editengobjecttm${id_suffix}").val("");
           					//$('textarea[autoHeight]').autoHeight();
           	            	
           	            	var currentVal="";
           	            	if(newVal==""||newVal==null){
           	            		currentVal=$('#objectnoSelEdittm${id_suffix}').combobox("getValue");
           						return false;
           	            	}else{
           	            		currentVal=newVal.join(",");
           	            	}
           	            	 $.ajax({
           			                type: "POST",
           			                url: '/product/comboboxdata/listWithId?type=TM&code='+$("#releaseno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
           			                data:{},
           			                async: false,
           			                success: function (rec) {
           			                	if(rec!=null){
           			                		for (var i = 0; i < rec.length; i++) {
           			                			if($("#editobjectnotm${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
           				    						$("#editobjectnotm${id_suffix}").val(($("#editobjectnotm${id_suffix}").val()==""?"":($("#editobjectnotm${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           				    						$("#editobjectnooldtm${id_suffix}").val(($("#editobjectnooldtm${id_suffix}").val()==""?"":($("#editobjectnooldtm${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           				    						
           				    						$("#editobjectnameoldtm${id_suffix}").val(($("#editobjectnameoldtm${id_suffix}").val()==""?"":($("#editobjectnameoldtm${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           				    						$("#editengobjectoldtm${id_suffix}").val(($("#editengobjectoldtm${id_suffix}").val()==""?"":($("#editengobjectoldtm${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           				    						$("#editobjecttm${id_suffix}").val(($("#editobjecttm${id_suffix}").val()==""?"":($("#editobjecttm${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           				    						$("#editengobjecttm${id_suffix}").val(($("#editengobjecttm${id_suffix}").val()==""?"":($("#editengobjecttm${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           				    						
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
           	                 if($("#objectnoSelEdittm${id_suffix}").val()=="null"){
           	                	 $("#objectnoSelEdittm${id_suffix}").combobox("setValue","");
           	                 }
           					$("#objectnoSelEdittm${id_suffix}").unbind("onLoadSuccess"); 
           			    }
           		   });
           		//选择要停用的项目组校验
           		 $("#objectnoSelDeltm${id_suffix}").combobox({
           				/* url : [],data : '[]',
           				method : "post",
           				valueField : 'value',
           				textField : 'text', */
           				editable:false,
           				required:false,
           				missingMessage:"请选择要停用的项目组",
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
                       	    $("#delobjectnotm${id_suffix}").val("");
           					$("#delobjectnametm${id_suffix}").val("");
           					$("#delengobjecttm${id_suffix}").val("");
           					
           					
           					var currentVal="";
           	            	if(newVal==""||newVal==null){
           	            		currentVal=$('#objectnoSelDeltm${id_suffix}').combobox("getValue");
           						return false;
           	            	}else{
           	            		currentVal=newVal.join(",");
           	            	}
           	            	 $.ajax({
           			                type: "POST",
           			                url: '/product/comboboxdata/listWithId?type=TM&code='+$("#releaseno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
           			                data:{},
           			                async: false,
           			                success: function (rec) {
           			                	if(rec!=null){
           			                		for (var i = 0; i < rec.length; i++) {
           			                			if($("#delobjectnotm${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
           				    						$("#delobjectnotm${id_suffix}").val(($("#delobjectnotm${id_suffix}").val()==""?"":($("#delobjectnotm${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           				    						
           				    						$("#delobjectnametm${id_suffix}").val(($("#delobjectnametm${id_suffix}").val()==""?"":($("#delobjectnametm${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           				    						
           				    						$("#delengobjecttm${id_suffix}").val(($("#delengobjecttm${id_suffix}").val()==""?"":($("#delengobjecttm${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           				    						
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
           	                 if($("#objectnoSelDeltm${id_suffix}").val()=="null"){
           	                	 $("#objectnoSelDeltm${id_suffix}").combobox("setValue","");
           	                 }
           					$("#objectnoSelDeltm${id_suffix}").unbind("onLoadSuccess"); 
           			    }
           		   });
                });
                </script>
</body>
</html>
