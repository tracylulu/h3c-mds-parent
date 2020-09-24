
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width:100%">
  <a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}('ss');">查看已有子系统清单</a><br>
                <input type="checkbox" class="combobox-checkbox" id="addproductss${id_suffix}" onclick="checkProduct${id_suffix}('add','ss')"  name="baseObjects[3][0].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">新增子系统</span><span  class="numSpan">新增的子系统个数：</span><span  id="addsssum${id_suffix}" style="color:red;"></span><br>
				<div id="addTabss${id_suffix}" style="margin:auto;width:100%;display:none">
				<span class="msgShow">（注意：多值请用回车来区分      同一子系统的中英文的上下位置请保持一致，以免出错。</span><br/>
                	<a href="#" class="easyui-linkbutton" style="margin-left:20px;"  name="copyRelease" onclick="selectProject${id_suffix}('ss');">继承现有版本信息</a><br>
				<a href="#" class="easyui-linkbutton" style="margin-left:20px;" onclick="impLBSystem${id_suffix}();">从已有路标版本引入子系统/模块</a>(该按钮仅支持引入，会清除原有手工添加的数据)
				    <table class="product" cellspacing="0"  style="margin:auto;width:100%">
                      <tr>
               <!--  <td width="20%">新增后的内码:</td> -->
                <td width="40%">要新增的子系统中文名称</td>
                <td width="40%" class="aLink">要新增的子系统英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('add','ss','','eng');">与中文名称设置一致</a></td>
               </tr>
                <tr>
               <!--  <td width="20%"></td> -->
                <td width="40%"><textarea name="baseObjects[3][0].objectname" autoHeight="true" style="width:100%;height:30px;" id="addobjectss${id_suffix}"     >${entity.baseObjects[3][0].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[3][0].engobject" autoHeight="true" style="width:100%;height:30px;" id="addengobjectss${id_suffix}"     >${entity.baseObjects[3][0].engobject}</textarea></td>
               </tr>
                </table>
                </div>
               <hr>
				<input type="checkbox" class="combobox-checkbox" id="editproductss${id_suffix}" onclick="checkProduct${id_suffix}('edit','ss')"  name="baseObjects[3][1].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">修改子系统</span><span  class="numSpan">修改的子系统个数：</span><span  id="editsssum${id_suffix}" style="color:red;"></span><br>
				 <div id="editTabss${id_suffix}" style="margin:auto;width:100%;display:none">
				   <span class="msgShow"> 同一子系统的中英文的上下位置请保持一致，以免出错。</span><br/>
                	 
				  <table class="product" cellspacing="0" style="margin:auto;width:100%">
                  <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要修改的子系统:</span>&nbsp <input name="baseObjects[3][1].objectnoSel" style="width:46%;height:30px;" id="objectnoSelEditss${id_suffix}" value="${editsubSystemNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                <tr>
                <td width="20%">要修改的子系统内码</td>
                <td width="40%">原子系统中文名称</td>
                <td width="40%">修改后的子系统中文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[3][1].objectno" autoHeight="true" readonly="readonly"   style="width:100%;height:30px;" id="editobjectnoss${id_suffix}"     >${entity.baseObjects[3][1].objectno}</textarea>
                <textarea name="baseObjects[3][1].objectnoold" autoHeight="true" hidden=true   style="width:100%;height:30px;" id="editobjectnooldss${id_suffix}"     >${entity.baseObjects[3][1].objectnoold}</textarea>
                </td>
                <td width="40%"><textarea name="baseObjects[3][1].objectnameold" autoHeight="true" readonly="readonly"   style="width:100%;height:30px;" id="editobjectnameoldss${id_suffix}"     >${entity.baseObjects[3][1].objectnameold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[3][1].objectname" autoHeight="true" style="width:100%;height:30px;" id="editobjectss${id_suffix}"     >${entity.baseObjects[3][1].objectname}</textarea></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%">原子系统英文名称</td>
                <td width="40%" class="aLink">修改后的子系统英文名称<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','ss','','eng');">与修改后的中文名称设置一致</a></td>
               </tr>
                <tr>
                <td width="20%"></td>
                <td width="40%"><textarea name="baseObjects[3][1].engobjectold" readonly="readonly"  autoHeight="true" style="width:100%;height:30px;" id="editengobjectoldss${id_suffix}"     >${entity.baseObjects[3][1].engobjectold}</textarea></td>
                <td width="40%"><textarea name="baseObjects[3][1].engobject" autoHeight="true" style="width:100%;height:30px;" id="editengobjectss${id_suffix}"     >${entity.baseObjects[3][1].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="delproductss${id_suffix}" onclick="checkProduct${id_suffix}('del','ss')"  name="baseObjects[3][2].applytype" style="margin-top: 2px;">&nbsp; 
				<span class="checkbox191030">停用子系统</span><br>
				<div id="delTabss${id_suffix}" style="margin:auto;width:100%;display:none">
				  <table class="product" cellspacing="0" style="margin:auto;width:100%">
                 <tr>
                <td colspan="3" width="100%" style="margin-left:20px;">
                 <span style="font-weight:bold">请选择要停用的子系统:</span>&nbsp <input name="baseObjects[3][2].objectnoedit" style="width:46%;height:30px;" id="objectnoDelSelss${id_suffix}" value="${delsubSystemNo}" 
				 type=""    class="easyui-combobox"/>
                </td>
                </tr>
                 <tr>
                <td width="20%">要停用的子系统内码</td>
                <td width="40%">要停用的子系统中文名称</td>
                <td width="40%">要停用的子系统英文名称</td>
               </tr>
                <tr>
                <td width="20%"><textarea name="baseObjects[3][2].objectno" autoHeight="true" readonly="readonly"  style="width:100%;height:30px;" id="delobjectnoss${id_suffix}"     >${entity.baseObjects[3][2].objectno}</textarea></td>
                <td width="40%"><textarea name="baseObjects[3][2].objectname" autoHeight="true" readonly="readonly"  style="width:100%;height:30px;" id="delobjectnamess${id_suffix}"     >${entity.baseObjects[3][2].objectname}</textarea></td>
                <td width="40%"><textarea name="baseObjects[3][2].engobject" autoHeight="true" readonly="readonly"  style="width:100%;height:30px;" id="delengobjectss${id_suffix}"     >${entity.baseObjects[3][2].engobject}</textarea></td>
               </tr>
                </table>
                </div>
                <hr>
                <script type="text/javascript">
                $(function(){
                	//选择要修改的子系统校验
           		 $("#objectnoSelEditss${id_suffix}").combobox({
           				/* url : [],data : '[]',
           				method : "post",
           				valueField : 'value',
           				textField : 'text', */
           				editable:false,
           				required:false,
           				missingMessage:"请选择要修改的子系统",
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
           	            	
           	            	$("#editobjectnoss${id_suffix}").val("");
           					$("#editobjectnooldss${id_suffix}").val("");
           					$("#editobjectnameoldss${id_suffix}").val("");
           					$("#editengobjectoldss${id_suffix}").val("");
           					$("#editobjectss${id_suffix}").val("");
           					$("#editengobjectss${id_suffix}").val("");
           					//$('textarea[autoHeight]').autoHeight();
           	            	
           	            	var currentVal="";
           	            	if(newVal==""||newVal==null){
           	            		currentVal=$('#objectnoSelEditss${id_suffix}').combobox("getValue");
           						return false;
           	            	}else{
           	            		currentVal=newVal.join(",");
           	            	}
           	            	 $.ajax({
           			                type: "POST",
           			                url: '/product/comboboxdata/listWithId?type=SS&code='+$("#releaseno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
           			                data:{},
           			                async: false,
           			                success: function (rec) {
           			                	if(rec!=null){
           			                		for (var i = 0; i < rec.length; i++) {
           			                			if($("#editobjectnoss${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
           				    						$("#editobjectnoss${id_suffix}").val(($("#editobjectnoss${id_suffix}").val()==""?"":($("#editobjectnoss${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           				    						$("#editobjectnooldss${id_suffix}").val(($("#editobjectnooldss${id_suffix}").val()==""?"":($("#editobjectnooldss${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           				    						
           				    						$("#editobjectnameoldss${id_suffix}").val(($("#editobjectnameoldss${id_suffix}").val()==""?"":($("#editobjectnameoldss${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           				    						$("#editengobjectoldss${id_suffix}").val(($("#editengobjectoldss${id_suffix}").val()==""?"":($("#editengobjectoldss${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           				    						$("#editobjectss${id_suffix}").val(($("#editobjectss${id_suffix}").val()==""?"":($("#editobjectss${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           				    						$("#editengobjectss${id_suffix}").val(($("#editengobjectss${id_suffix}").val()==""?"":($("#editengobjectss${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           				    						
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
           	                 if($("#objectnoSelEditss${id_suffix}").val()=="null"){
           	                	 $("#objectnoSelEditss${id_suffix}").combobox("setValue","");
           	                 }
           					$("#objectnoSelEditss${id_suffix}").unbind("onLoadSuccess"); 
           			    }
           		   });
           		//选择要停用的子系统校验
           		 $("#objectnoDelSelss${id_suffix}").combobox({
           				/* url : [],data : '[]',
           				method : "post",
           				valueField : 'value',
           				textField : 'text', */
           				editable:false,
           				required:false,
           				missingMessage:"请选择要停用的子系统",
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
                       	    $("#delobjectnoss${id_suffix}").val("");
           					$("#delobjectnamess${id_suffix}").val("");
           					$("#delengobjectss${id_suffix}").val("");
           					
           					var currentVal="";
           	            	if(newVal==""||newVal==null){
           	            		currentVal=$('#objectnoDelSelss${id_suffix}').combobox("getValue");
           						return false;
           	            	}else{
           	            		currentVal=newVal.join(",");
           	            	}
           	            	 $.ajax({
           			                type: "POST",
           			                url: '/product/comboboxdata/listWithId?type=SS&code='+$("#releaseno${id_suffix}").combobox("getValue")+'&sub_code=' + currentVal,
           			                data:{},
           			                async: false,
           			                success: function (rec) {
           			                	if(rec!=null){
           			                		for (var i = 0; i < rec.length; i++) {
           			                			if($("#delobjectnoss${id_suffix}").val().indexOf(Trim(rec[i].value))==-1){
           				    						$("#delobjectnoss${id_suffix}").val(($("#delobjectnoss${id_suffix}").val()==""?"":($("#delobjectnoss${id_suffix}").val()+"\r"))+Trim(rec[i].value));
           				    						
           				    						$("#delobjectnamess${id_suffix}").val(($("#delobjectnamess${id_suffix}").val()==""?"":($("#delobjectnamess${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[0]));
           				    					
           				    						$("#delengobjectss${id_suffix}").val(($("#delengobjectss${id_suffix}").val()==""?"":($("#delengobjectss${id_suffix}").val()+"\r"))+Trim(rec[i].text.split(' | ')[1]));
           				    						
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
           	                 if($("#objectnoDelSelss${id_suffix}").val()=="null"){
           	                	 $("#objectnoDelSelss${id_suffix}").combobox("setValue","");
           	                 }
           					$("#objectnoDelSelss${id_suffix}").unbind("onLoadSuccess"); 
           			    }
           		   });
                });
                //从已有路标版本引入子系统、模块
                function impLBSystem${id_suffix}(){
                	$('#selparentrelease${id_suffix}').val("");
                	$('#projectStatu${id_suffix }').combobox('clear');
                	$("#projectStatu${id_suffix }").combobox("select","在研");
                	$('#searchParasRelease${id_suffix}').textbox("setValue","");
                	$('#searchParasRelease${id_suffix}').textbox("setText","");
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
                				
                				initSystem(releasenos);  
                				
                			},
                    		toolbar : [{
                        			id : 'addSubsystemLB${id_suffix }',
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
                        				
                        				initSystem(releasenos);  
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
                
                
                //根据选中的路标版本引入子系统、模块
                function initSystem(releaseno){
                	 $.ajax({
                         type: "POST",
                         url: "/basicinfo/prBelowApply/getSystem",
                         data:{code:releaseno},
                         async: false,
                         success: function (result) {
                        	 //子系统赋值
                        	 $("#addobjectss${id_suffix}").val(result["subsystem"]);
                        	 $("#addengobjectss${id_suffix}").val(result["engsubsystem"]);
                        	 
                        	 //模块赋值
                        	 $("#addproductmd${id_suffix}")._propAttr('checked','true');
                        	 $("#SUBFORM_T00000_06${id_suffix}").css("display","block");//.toggle();
                        	 $("#addTabmd${id_suffix}").css("display","block");//.toggle();
                        	 $("#addobjectmd${id_suffix}").val(result["module"]);
                        	 $("#addengobjectmd${id_suffix}").val(result["engmodule"]);
                        	 
                        	 $('textarea[autoHeight]').autoHeight();  
                         }
                	 });
                }
                </script>
</body>
</html>
