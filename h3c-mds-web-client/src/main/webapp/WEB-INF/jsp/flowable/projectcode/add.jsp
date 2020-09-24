<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>创建项目编码申请</title>
<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
</head>
<body >
 <jsp:include page="/WEB-INF/jsp/ueditor/easyui-ueditor.jsp">
        <jsp:param name="module" value="productCodeApply"/>
        <jsp:param name="field" value="basisMaterialId"/>
    </jsp:include>
	<div >
					<div id="projectWin${timestamp}" class="easyui-window" title="对话框" style="width:600px;height:400px"
				     data-options="iconCls:'icon-save',modal:true,closed:true" >
				    
				        <div style="margin:20px 0;text-align:center;">
				            <a href="#" class="easyui-linkbutton" onclick="confirm${timestamp}()">确定</a>
				            <a href="#" class="easyui-linkbutton" onclick="cancle${timestamp}()">取消</a>
				        </div>
				    </div>
				
					
				    <div class="toptoolbar" style="position:fixed;">
				    
				    
				    	<c:choose>
				    		<c:when test="${isSubmit == 'show' || curHandler=='applyer'}">
				    			<a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="save${timestamp}()"
				         		  data-options="iconCls:'fa fa-save'"
				       			 >保存</a>
				    		</c:when>
				    		
				    		<c:otherwise>
				    			
				    		</c:otherwise>
				    	</c:choose>
				    
				        
				        <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="changeMenue${timestamp}('fold')"
				           data-options="iconCls:'fa fa-minus'"
				        >折叠</a>
				        <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="changeMenue${timestamp}('expand')"
				           data-options="iconCls:'fa fa-plus'"
				        >展开</a>
				        
				        <a href="#" id="btnCopy${id_suffix}" class="easyui-linkbutton" plain="true" onclick="copyLink('projectWebFlow/edit?applyNo=${entity.applyNo}','项目编码申请','${entity.id}','${entity.applys!=null&&entity.applys.size()>0?entity.applys[0].proName:""}等  项目编码申请 : '+'${entity.optType==1?"新增":entity.optType==2?"改变":"停用"}')"
				data-options="iconCls:'fa fa-files-o'">复制链接</a>
				
					<c:if test="${isShowDel == 'true'}">
            			<a href="#" id="btnDel${timestamp}" class="easyui-linkbutton" plain="true" onclick="deleteProcess${timestamp}()" data-options="iconCls:'fa fa-files-o'">废弃</a>
        			</c:if>
				    </div>
				    <!-- <div class="toptoolbarhr" style="margin-top:2%;"></div> -->
				    <form method='post' name='productCodeApply${timestamp}' id='productCodeApply${timestamp}'>
				        <!-- <p style="text-align: center;">
				            <span style="font-size: 20px;">项目编码申请表 </span>
				        </p> -->
				        <p> 
							<span class="title191030" >项目编码申请表</span>
						</p>
				        <input id="timestamp${timestamp}" name="timestamp" value="${timestamp}" type="hidden"/>
				        
				        <input id="processInsId${timestamp}" value="${entity.processInsId}"  type="hidden" name="processInsId">
						<input id="taskId${timestamp}" value="${taskId}"  type="hidden">
				        
				        
				       <%--  <div style="margin-left:1%;margin-right:1%;">
				            <span style="font-size:15px">&nbsp;&nbsp;&nbsp;申请编号：<input id="applyNo" name="applyNo" value='${entity.applyNo}' readonly="readonly"/><span style="color:#FF83FA"></span> &nbsp;&nbsp;
				                当前状态：<span style="color:#3A5FCD">${entity.curStatus}</span>  &nbsp;&nbsp;
				                当前处理者：<span style="color:#3A5FCD"><ibds:userAccount account="${entity.curDeal}"/></span>  &nbsp;&nbsp; <!-- 系统修改反馈：<span style="color:#3A5FCD"></span></span> -->
				        </div> --%>
				        <div style="font-size: 13px; margin-left: 20px">
							<table  cellspacing="0" width="100%" style="border-color: #ABABAB;  border:none;">
								<tr>
									<td width="20%">申请编号：&nbsp;
										
										&nbsp;&nbsp;
										 <input id="applyNo" name="applyNo" value='${entity.applyNo}' readonly="readonly" style="border:none;"/>
									</td>
									<td width="20%">
										&nbsp;&nbsp;当前状态：&nbsp;&nbsp;&nbsp;&nbsp;
										<span style="color: #3A5FCD">${entity.curStatus}</span>
										&nbsp;&nbsp;
										  
									</td>
									<td width="20%">
										&nbsp;&nbsp;当前处理者：
										
										&nbsp;&nbsp;
										<ibds:userAccount account="${entity.curDeal}"/>
									</td>
									
								</tr>
							</table>
					</div>
				        <br><br><br>
				
				        <h2 class="subfild" id="T00000-1-${timestamp}" style="margin-left:1%;margin-right:1%;">
				            <span>本栏目由申请者填写</span>
				        </h2>
				        <div id="SUBFORM_T00000-1-${timestamp}" style="overflow-x:auto;margin-left:1%;margin-right:1%;">
				            <div style="font-size:13px">
				                <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
				                <c:choose>
				                	 <c:when test="${curHandler=='applyer'}">
				                	 <tr>
				                         <td width="30%">&nbsp;&nbsp;申请人部门：&nbsp;
				                                    <select id="applyDep${timestamp}" name="dept">
				                                         <option value="D0001" ${entity.dept=='D0001'?"selected":""}>研发</option>
				                                        <option value="D0002" ${entity.dept=='D0002'?"selected":""}>专业服务部</option>
				                                        <option value="D0003" ${entity.dept=='D0003'?"selected":""}>其他</option>
				                                    </select>
				                        </td>
				                        
				                    
				                       <td width="30%">&nbsp;&nbsp;变动类型：
				                                    <select id="optType${timestamp}">
				                                        <option value="1" ${entity.optType=='1'?"selected":""}>新增</option>
				                                        <option value="2" ${entity.optType=='2'?"selected":""}>改变</option>
				                                        <option value="3" ${entity.optType=='3'?"selected":""}>停用</option>
				                                    </select>
				                                    <input id="input_optType${timestamp}" name="optType" value="${entity.optType}" type="hidden"/>
				                                    <input id="previous_input_optType${timestamp}" type="hidden" value="${entity.optType}"/>
				                       </td>
				                        <td width="30%">&nbsp;&nbsp;申请编码的数目：
				                                    <input class="easyui-numberbox" id="applyCount${timestamp}" value="${applyCount}">
				                                    <input type="hidden" id="input_applyCount${timestamp}" name="applyCount" value="${applyCount}">
				                                    <input type="hidden" id="maxApplyCount${timestamp}">
				                                    <button type="button" id="btn${timestamp}" onclick="$('#dlg${timestamp}').window('open');">确定</button>
				                          </td>
				                    </tr>
				                	 </c:when>
				                	 <c:otherwise>
				                	 	<tr>
				                         <td width="30%">&nbsp;&nbsp;申请人部门：&nbsp;
				                                    ${entity.dept=='D0001'?"研发":entity.dept=='D0002'?"专业服务部":entity.dept=='D0003'?"其他":""}
				                        </td>
				                        
				                    
				                       <td width="30%">&nbsp;&nbsp;变动类型：
				                                    ${entity.optType=='1'?"新增":entity.optType=='2'?"改变":entity.optType=='3'?"停用":""}
				                                    
				                                    <input id="optType${timestamp}" value="${entity.optType}" type="hidden"/>
				                                    <input id="input_optType${timestamp}" name="optType" value="${entity.optType}" type="hidden"/>
				                                    <input id="previous_input_optType${timestamp}" type="hidden" value="${entity.optType}"/>
				                       </td>
				                        <td width="30%">&nbsp;&nbsp;申请编码的数目：
				                                    <input class="easyui-numberbox" id="applyCount${timestamp}" value="${applyCount}" readonly="readonly">
				                                    <input type="hidden" id="input_applyCount${timestamp}" name="applyCount" value="${applyCount}">
				                                    <%-- <button type="button" id="btn${timestamp}" onclick="$('#dlg${timestamp}').window('open');">确定</button> --%>
				                                </td>
				                    </tr>
				                	 </c:otherwise>
				                </c:choose>
				                    
				                </table>
				            </div>
				            
				             <div id="dlg${timestamp}" class="easyui-window" title="对话框" style="width:400px;height:200px"
				                 data-options="iconCls:'icon-save',modal:true,collapsible:false,minimizable:false,maximizable:false,closable:false,closed:true" >
				                			未保存的数据将会被清除，确认是否修改？
				                <div style="margin:20px 0;">
				                    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="confirmDlg${timestamp}('1')">确认</a>
				                    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="confirmDlg${timestamp}('0')">取消</a>
				                </div>
				            </div>
				            <br>
				            
				            <div id="subForm111${timestamp}"></div>
				            <!-- 这里要根据权限判断是否显示 -->
				          
				            
				            <br>
				        </div>
				    <br>
				        <h2 class="subfild" id="T00000-2-${timestamp}" style="margin-left:1%;margin-right:1%;">
				            <span>本栏目由审核者填写</span>
				        </h2>
				        <div id="SUBFORM_T00000-2-${timestamp}" style="margin-left:1%;margin-right:1%;">
				         <c:choose>
					         <c:when test="${curHandler=='approver'}">
					         		<c:choose>
					         			<c:when test="${curHandler=='approver' && entity.optType=='1'}">
					           		 		<table id="possProjcodeNumber${timestamp}"></table>
					            		</c:when>
					            		<c:otherwise></c:otherwise>
					            	
					         		</c:choose>
					         		<!-- <br> -->
						            <div style="float: left;">
						                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：</span>
						                <input id="approveOpinion${timestamp}" name="approveSuggest" style="width:200px;"  class="easyui-textbox"/>
						            </div>
						            <div style="float: left;text-align: center;margin-left: 26%;">
						                <a href="#" class="easyui-linkbutton" onclick="approverAgree${timestamp}();">同意</a>
						                &nbsp;&nbsp;&nbsp;
						                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="approverNoAgree${timestamp}()" id="btnClick">不同意</a>
						            </div>
						            
					          </c:when>
				            
					            <c:otherwise>
							            <div style="float:left">
							                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：</span>${entity.approverSuggest }
							            </div>
							            	<div style="float: left;text-align: center;margin-left: 26%;">
							                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：</span><ibds:userAccount account="${entity.approver}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.applyTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
							            </div>
					            </c:otherwise>
				          </c:choose>

					       <div style="padding-top:2%">
	                    			
	                			</div>
	                			<!-- <br> -->
				        </div>
				        <br>
				        <h2 class="subfild" id="T00000-3-${timestamp}"  style="margin-left:1%;margin-right:1%;">
				            <span>本栏目由项目经理填写</span>
				        </h2>
				        <div id="SUBFORM_T00000-3-${timestamp}" style="margin-left:1%;margin-right:1%;">
				        <c:choose>
				        	<c:when test="${curHandler=='projMng'}">
				            <div style="float: left;">
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：</span>
				                <input id="projMngOpinion${timestamp}" name="projMngSuggest" style="width:200px;"   class="easyui-textbox"/>
				            </div>
				            
				            <div style="float: left;text-align: center;margin-left: 26%;">
				                <a href="#" class="easyui-linkbutton" onclick="projMngAgree${timestamp}()">同意</a>
				                &nbsp;&nbsp;&nbsp;
				                <a href="#" class="easyui-linkbutton" onclick="projMngDisAgree${timestamp}()">不同意</a>
				            </div>
				            
				            </c:when>
				            <c:otherwise>
				            <div style="float: left;">
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：</span>${entity.projmngSuggest}
				            </div>
				            <div>
				                <span  style="font-size:15px; float: left;text-align: center;margin-left: 26%;">&nbsp;&nbsp;&nbsp;签名：</span><ibds:userAccount account="${entity.projMngShow}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.projMngTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				            </div>
				            </c:otherwise>
				          </c:choose>
				            <div style="margin-top: 1%">
                    			
                			</div>
                			<br>
				        </div>
				        <br>
				        <h2 class="subfild" id="T00000-4-${timestamp}" style="margin-left:1%;margin-right:1%;" >
				            <span>本栏由财务接口人填写</span>
				        </h2>
				        <div id="SUBFORM_T00000-4-${timestamp}" style="margin-left:1%;margin-right:1%;">
				         <c:choose>
				        	<c:when test="${curHandler=='finaInterface'}">
				            <div style="float: left;">
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：</span>
				                <input id="finInterfaceOpinion${timestamp}" style="width:200px;" name="projMngSuggest"    class="easyui-textbox"/>
				            </div>
				            <div style="float: left;text-align: center;margin-left: 26%;">
				                <a href="#" class="easyui-linkbutton" onclick="finInterfaceAgree${timestamp}()">同意</a>
				                &nbsp;&nbsp;&nbsp;
				                <a href="#" class="easyui-linkbutton" onclick="finInterfaceDisAgree${timestamp}()">不同意</a>
				            </div>
				            <!-- <div>
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：</span>
				            </div> -->
				            </c:when>
				            <c:otherwise>
				            	 <div>
				                <span  style="font-size:15px; float: left;">&nbsp;&nbsp;&nbsp;意见：</span>${entity.financeInterfaceSuggest}
				            </div>
				            <div>
				                <span  style="font-size:15px;float: left;text-align: center;margin-left: 26%;">&nbsp;&nbsp;&nbsp;签名：</span><ibds:userAccount account="${entity.financeInterface}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.projFinInterfaceTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				            </div>
				            </c:otherwise>
				            </c:choose>
				            <div style="margin-top: 1%">
                    			
                			</div>
                			<br>
				        </div>
				        <br>
				        <h2 class="subfild" id="T00000-5-${timestamp}" style="margin-left:1%;margin-right:1%;" >
				        <span>本栏由财务审批</span>
				        </h2>
				        <div id="SUBFORM_T00000-5-${timestamp}" style="margin-left:1%;margin-right:1%;">
				         <c:choose>
				        	<c:when test="${curHandler=='financer'}">
				            <div style="float: left;">
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：</span>
				                <input id="finOpinion${timestamp}" name="projMngSuggest" style="width:200px;"   class="easyui-textbox"/>
				            </div>
				            <div style="float: left;text-align: center;margin-left: 26%;">
				                <a href="#" class="easyui-linkbutton" onclick="finAgree${timestamp}()">同意</a>
				                &nbsp;&nbsp;&nbsp;
				                <a href="#" class="easyui-linkbutton" onclick="finDisAgree${timestamp}()">不同意</a>
				            </div>
				            <!-- <div>
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：</span>
				            </div> -->
				            </c:when>
				            <c:otherwise>
				            	 <div>
				                <span  style="font-size:15px;float: left;">&nbsp;&nbsp;&nbsp;意见：</span>${entity.financerSuggest}
				            </div>
				            <div>
				                <span  style="font-size:15px;float: left;text-align: center;margin-left: 26%;">&nbsp;&nbsp;&nbsp;签名：</span><ibds:userAccount account="${entity.financer}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.projFinTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				            </div>
				            </c:otherwise>
				            </c:choose>
				            <div style="margin-top: 1%">
                				<br>
                    			
                			</div>
				        </div>
				        <br>
				        <h2 class="subfild" id="T00000-6-${timestamp}" style="margin-left:1%;margin-right:1%;" >
				        <span>本栏由项目管理处审批</span>
				        </h2>
				        <div id="SUBFORM_T00000-6-${timestamp}" style="margin-left:1%;margin-right:1%;">
				         <c:choose>
				        	<c:when test="${curHandler=='projOffice'}">
				            <div style="float: left;">
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：</span>
				                <input id="projOfficeOpinion${timestamp}" name="projOfficeOpinion" style="width:200px;"   class="easyui-textbox"/>
				            
				            </div>
				            <div style="float: left;text-align: center;margin-left: 26%;">
				                <a href="#" class="easyui-linkbutton" onclick="projOfficeAgree${timestamp}()">同意</a>
				                &nbsp;&nbsp;&nbsp;
				                <a href="#" class="easyui-linkbutton" onclick="projOfficeDisAgree${timestamp}()">不同意</a>
				            </div>
				            <!-- <div>
				                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：</span>
				            </div> -->
				            </c:when>
				            <c:otherwise>
				            	 <div>
				                <span  style="font-size:15px;float: left;">&nbsp;&nbsp;&nbsp;意见：</span>${entity.projectOfficeSuggest}
				            </div>
				            <div>
				                <span  style="font-size:15px;float: left;text-align: center;margin-left: 26%;">&nbsp;&nbsp;&nbsp;签名：</span><ibds:userAccount account="${entity.projectOffice}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.projOfficeTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				            </div>
				            </c:otherwise>
				            </c:choose>
				            <br>
				            <div style="float:left">
                    			
                			<br>
                			</div>
				        </div>
				        <br>
				        <h2 class="subfild" id="T00000-7-${timestamp}" style="margin-left:1%;margin-right:1%;" >
				            <span>管理区段</span>
				        </h2>
				        <div id="SUBFORM_T00000-7-${timestamp}" style="margin-left:1%;margin-right:1%;display:none;">
					        <c:choose>
					        	<c:when test="${isAdmin}">
					        	<div style="float:left;font-size:15px">
					            <span>&nbsp;&nbsp;&nbsp;处理人：<input id="assignDesc${timestamp}"  class="auto_selusers_false"/></span>
					                    <input id="assign${timestamp}" value="" type="hidden"/>
					             </div>
					                    <div style="float: left;text-align: center;margin-left: 2%;">
					                        <a href="#" style="height: 30px;" class="easyui-linkbutton" onclick="changeHandler${timestamp}()">修改当前处理人</a>
					                    </div>
					            </c:when>
					        </c:choose>
				        <div style="padding-top: 0.6%;">
                			<span  style="font-size:15px;margin-left: 4%">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.assignSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.assignDate}" pattern="yyyy-MM-dd HH:mm:ss"/> </span> 
            			</div>
	            			<div style="margin-top: 1%">
                    			
                			</div>
                			<br>
				        </div>
				        <br>
				        <h2 class="subfild" id="T00000-8-${timestamp}" style="margin-left:1%;margin-right:1%;">
				            <span>过程记录</span>
				        </h2>
				        <div id="SUBFORM_T00000-8-${timestamp}" style="margin-left:1%;margin-right:1%;display:none;">
				            <!-- <div style="text-align: center"> -->
				                <c:forEach var="processLog" items="${logs}">
				                 <div style="margin-bottom: 6px">
				                    <span style="font-size: 13px">
				                        系统时间：<fmt:formatDate value="${processLog.checkDate}" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;&nbsp;
				                        <ibds:userAccount account="${processLog.checkAccount}"/>&nbsp;&nbsp;
				                        ${processLog.checkResult}&nbsp;&nbsp;
				                        （意见：${processLog.checkOpion}&nbsp;&nbsp;）—》
				                        ${processLog.checkStatus}&nbsp;&nbsp;
				
				                    </span>
				                </div>
				
				            </c:forEach>
				
							<div style="margin-top: 1%">
                    			
                			</div>
                			<br>
				            
				        </div>
							<br>
				            <br>
				            <br>
				            <br>
						</form>
						
						
						<div id="winparentversion${timestamp}" class="hidden" title="R版本信息" style="hidden:hidden; width:70%;height:70%" >
				            <input onkeydown="inpKeyDown();" id="searchRelease${timestamp}" class="easyui-textbox" prompt="请输入搜索内容"  style="hidden:hidden;width: 65%;"   />
				            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="doSearchRelease${timestamp}();">搜 索 </a>
							<table id="tg${timestamp}" style="width: 100%; heght: 100%;"></table>
						</div>
						<div id="winProduct${timestamp}" title="产品编码信息" class='hidden' style="hidden:hidden; width:60%;height:70%" >
							<input onkeydown="inpKeyDown();" id="searchProductCodeArgs${timestamp}" class="easyui-textbox" prompt="请输入搜索内容"  style="width: 65%;"   />
							<a href="javascript:void(0)" class="easyui-linkbutton" onclick="doSearchProductCode${timestamp}();">搜 索 </a>
							<table id="productCode${timestamp}"></table>
						</div>
						<div id="winOldProjectCode${timestamp}" title="项目编码信息" class='hidden' style="hidden:hidden; width:90%;height:80%" >
							<input onkeydown="inpKeyDown();" id="searchArgs${timestamp}" class="easyui-textbox" prompt="请输入搜索内容"  style="width: 65%;"   />
							<a href="javascript:void(0)" class="easyui-linkbutton" onclick="doSearch${timestamp}();">搜 索 </a>
						     <input id="tmpprojectIndex${timestamp}" type="hidden"/>
							<table id="oldProjectCode${timestamp}"></table>
						</div>
						
						
					</div>
		</div>
    <style type="text/css">
        .product-code tr td{
            height: 20px;
        }
    </style>
    
     <link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css"/>
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	
    <script type="text/javascript">	
  //状态，为处理展开当前节点
    var isExpandALl${timestamp}=false;
    var exeandAll_ID${timestamp}='';
        $(function () {

        	
        	 $("[id^='T00000-'][id$='-${timestamp}']").each(function () {
                 var id = $(this).prop("id");
                 var display = $('#SUBFORM_'+id).css('display');
                 if (display == 'none') {
                     $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
                     // 重新加载easyui样式
                 } else {
                     $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
                 }
             });
        	

        	$('#possProjcodeNumber${timestamp}').datagrid({    
				    url:'projectWebFlow/getRecommendProjectCode?proInsId=' + $("#processInsId${timestamp}").val(),    
				    columns:[[    
				        {field:'proName',title:'项目名称',width:'20%'},    
				        {field:'pdtName',title:'所属PDT',width:'20%'},
				        {field:'proNumber',title:'项目编码',width:'20%', editor:"text"}
				    ]],
				    onLoadSuccess:function(data){
						//要判断或者执行的代码
						var num = data.total;
						for(var i = 0; i < num; i++){
							lastIndex=i;
			                //$("#possProjcodeNumber").datagrid('endEdit',i);
			                $("#possProjcodeNumber${timestamp}").datagrid('beginEdit',i);
			                //var oldordering = rowData.ordering;
			                /*  $("input.datagrid-editable-input").bind("mouseout",function(evt){
			                    $("#possProjcodeNumber").datagrid('endEdit',lastIndex);
			                }).focus(); */ 
			                lastIndex=i;
						} 
					}/* ,
				    onDblClickRow : function(rowIndex, rowData) {
			            if (rowData) {
			              
			                
			                
			            	lastIndex=rowIndex;
			                $("#possProjcodeNumber").datagrid('endEdit',rowIndex);
			                $("#possProjcodeNumber").datagrid('beginEdit',rowIndex);
			                var oldordering = rowData.ordering;
			                $("input.datagrid-editable-input").val(oldordering).bind("mouseout",function(evt){
			                    $("#possProjcodeNumber").datagrid('endEdit',lastIndex);
			                }).focus();
			                lastIndex=rowIndex;
			            
			            }
			        } */
			        
				});
        	$('#possProjcodeNumber${timestamp}').datagrid('load', {    
        	    name: 'easyui',    
        	    address: 'ho'   
        	});

        	 $.fn.serializeObject = function()
             {
                 var o = {};
                 var a = this.serializeArray();
                 $.each(a, function() {
                     if (o[this.name] !== undefined) {
                         if (!o[this.name].push) {
                             o[this.name] = [o[this.name]];
                         }
                         o[this.name].push(this.value || '');
                     } else {
                         o[this.name] = this.value || '';
                     }
                 });
                 return o;
             };

             loadSubForm${timestamp}();
             
             
           //绑定改变事件
             $("#optType${timestamp}").change(function () {
                 $("#dlg${timestamp}").window('open');
             });
             
           $("[id^='T00000-'][id$='${timestamp}']").click(function () {

               var id = $(this).prop("id");
               var display = $('#SUBFORM_'+id).css('display');
               if (display == 'none') {
                   $('#SUBFORM_'+id).show();
            	   $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
               } else {
            	   $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
                   $('#SUBFORM_'+id).hide();
               }
           });
            
           
        });

        function changeMenue${timestamp}(a){
            if(a=='fold'){
                $("[id^='SUBFORM_T00000-'][id$='${timestamp}']").hide();
                $("[id^='T00000-'][id$='-${timestamp}']").each(function () {
                    var id = $(this).prop("id");
                    //var display = $('#SUBFORM_'+id).css('display');
                    
                    $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
                       
                });
            }else if(a=='expand'){
                $("[id^='SUBFORM_T00000-'][id$='${timestamp}']").show();
                $("[id^='T00000-'][id$='-${timestamp}']").each(function () {
                    var id = $(this).prop("id");
                   
                    $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
                });
            }
        }

        
        //选择对应的产品
        function selectProduct${timestamp}(projectIndex, productIndex){
        	$('#winProduct${timestamp}').removeClass("hidden");
        	$("#searchProductCodeArgs${timestamp}").textbox("clear");
        	$("#searchProductCodeArgs${timestamp}").textbox('setValue',"");
        	$('#winProduct${timestamp}').window({  
			    iconCls:"icon-save",
			    modal:true   
			});
        	
        	 //初始化产品开始
        	 $('#productCode${timestamp}').datagrid({
                url: "finance/fproductCode/findByPage",
                pagination: true,//允许分页

                queryParams:{searchStr:""},
                singleSelect: true,//只选择一行
                pageSize: 15,//每一页数据数量
                checkOnSelect: false,
                fitColumns:false, //列宽自适应
                height : '95%',
                pageList: [15,20,30,40,50,60],
                
                toolbar : [ {
                    id : 'add${timestamp}',
                    text : '确定',
                    //iconCls : 'tabs-icon fa fa-plus-square',
                    handler : function() {
                        var row = $("#productCode${timestamp}").datagrid("getSelected");
                        setProductCode(projectIndex, productIndex, row);
                    	$('#winProduct${timestamp}').window("close");
                    }
                },'-',{
                    id : 'edit${timestamp}',
                    text : '取消',
                    //iconCls : 'tabs-icon fa fa-edit',
                    handler : function() {
                    	$('#winProduct${timestamp}').window("close");
                    }
                }],
                
                columns: [[
                    {field: 'id', checkbox: false,hidden:true},
                    {field: 'prodlineNo', checkbox: false,hidden:true},
                    {field: 'productNo', checkbox: false,hidden:true},
                    {field: 'pdtNo', checkbox: false,hidden:true},
                    {field: "productCode",title: "产品编码",align: "center",width:100},
                    {field: "columngroup",title: "产品型号/模块编码",align: "center",width:100},
                    {field: "productNameCn",title: "产品名称",align: "center",width:100},
                    {field: "columngroup", title: "产品型号/模块名称", align: "center",width:100},
                    {field: "columngroup", title: "代号", align: "center",width:100},
                    {field: "prodlineName", title: "所属产品线", align: "center",width:100},
                    {field: "columngroup", title: "编码状态", align: "center",width:100},
                    {field: "columngroup", title: "BOM编码", align: "center",width:100},
                    {field: "columngroup", title: "编码生效日期", align: "center",width:100},
                   /*  {field: "columngroup", title: "承担此项目的费用比例", align: "center",width:100}, */
                    {field: "productName", title: "产品族", align: "center",width:100},
                    {field: "pdtName", title: "PDT", align: "center",width:100},
                    {field: "productNameEn", title: "英文描述", align: "center",width:100}

                ]],
                onLoadSuccess : function(data){
                	
                },
                onLoadError : function(){
                	$.messager.alert("提示信息","error")
                },
                onDblClickRow : function(index, row){
                	//projectIndex, productIndex
                	//这里根据新增，修改的类型不同各自赋值
                	$('#winProduct${timestamp}').window("close");
                	setProductCode(projectIndex, productIndex, row);
                	/* $("#applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.productName").val(row.productNameCn);
                	$("#applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.productCode").val(row.productCode);
                	$("#applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.pdtName").val(row.pdtName); */
                	
                }
            }); 
        	
        }
        	 //初始化产品结束
        
        	 
        	 function setProductCode(projectIndex, productIndex, row){
        		 for(var i = 0; i < productIndex; i++){
        			 var tmp = $("#applys\\[" + projectIndex +"\\]\\.projectProductRelList\\[" + i + "\\]\\.productCode").val();
        			 if(tmp == row.productCode){
        				 return;
        			 }
        		 }
        		 $("#applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.productName").val(row.productNameCn);
        		 $("#span_applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.productName${timestamp}").html(row.productNameCn);
             	$("#applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.productCode").val(row.productCode);
             	$("#span_applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.productCode${timestamp}").html(row.productCode);
             	$("#applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.pdtName").val(row.pdtName);
             	$("#span_applys\\[" + projectIndex + "\\]\\.projectProductRelList\\[" + productIndex + "\\]\\.pdtName${timestamp}").html(row.pdtName);
        	 }
        	 
        	 
        	 
        	 //构建原来的产品编码的列表
            	function buildOldProductTd(index, value){
            		var tdStr = "<td>" + value + "</td>";
            		return $(tdStr);
            	}
            	
        	 
            	function buildOldProductTdAndInputHidden(index, value, inputName){
            		var tdStr = "<td>" + value + " <input name='" + inputName + "' value='" + value + "' type='hidden'/>"   + "</td>";
            		return $(tdStr);
            	}
        	 	
        	 
            	function buildOldProductTdColspan(index, value, colspan){
            		var tdStr = "<td colspan=" + colspan + ">" + value + "</td>";
            		return $(tdStr);
            	}
            	
            	function buildOldProductTdColspanAndInputHidden(index, value, colspan, inputName){
            		var tdStr = "<td colspan=" + colspan + ">" + value + " <input name='" + inputName + "' value='" + value + "' type='hidden'/>"   + "</td>";
            		return $(tdStr);
            	}
            	
            	//创建关联产品的tr
            	function buildTr(i,j){
            		var trStr = "<tr id=product_" + i + "_" + j + "></tr>";
            		return $(trStr);
            	}
            	
            	
            	function buildEmptyTd(){
            		
            		var $tdName = $("<td></td>");
            		return $tdName;
            	}
            	
            	function buildTdColspan(id, colspan){
            		var $tdName = $("<td colspan=" + colspan + ">" + "<span id=span_>" + id + "${timestamp}></span>" + "</td>");
            		return $tdName;
            	}
            	//构建序号td
            	function buildNoTd(index){
            		var $tdName = $("<td align='center'>" + index + "</td>");
            		return $tdName;
            	}
            	
            	
            	
            	
            	function buildTdWithWidth(width){
            		var tdStr = "<td width='" + width + "'>" + "</td>";
            		return $(tdStr);
            	}
            	
            	function buildTdWithInputButton(width, id, name, value, className, index, productIndex, readonly, inputWidth){
            		$td = buildEmptyTd();
            		var $span="<span id='span_" + id + "${timestamp}'>" + value + "</span>";
            		var inputStr = buildInputStr(id, name, value, className, readonly, inputWidth);
            		var buttonStr = buildButtonStr(index, productIndex);
            		$td.html($span + inputStr + buttonStr);
            		return $td;
            	}
            	
            	function buildTdWithInputColSpan(width, id, name, value, className, colspans, readonly, inputWidth){
            		var $td = buildTdColspan(id, colspans);
            		var inputStr = buildInputStr(id, name, value, className, readonly, inputWidth);
            		var $span="<span id='span_" + id + "${timestamp}'>" + value + "</span>";
            		$td.html($span + inputStr);
            		return $td;
            	}
            	
            	function buildTdWithInput(width, id, name, value, className, readonly, inputWidth){
            		var $td = "";
            		if(width){
            			$td = buildTdWithWidth(width);
            		}else{
            			$td = buildEmptyTd();
            		}
            		var inputStr = buildInputStr(id, name, value, className, readonly, inputWidth);
            		$td.html(inputStr);
            		return $td;
            	}
            	function buildTdSpanWithInput(width, id, name, value, className, readonly, inputWidth){
            		var $td = "";
            		if(width){
            			$td = buildTdWithWidth(width);
            		}else{
            			$td = buildEmptyTd();
            		}
            		var $span="<span id='span_" + id + "${timestamp}'>" + value + "</span>";
            		
            		
            		var inputStr = buildInputStr(id, name, value, className, readonly, inputWidth);
            		$td.html($span + inputStr);
            		return $td;
            	}
            	
            	function buildButtonStr(projectIndex, productIndex){
            		return "<button type='button' onclick='selectProduct${timestamp}(" + projectIndex +  "," +  productIndex  + ")';>请选择</button>";
            	}
            	function buildInputStr(id, name, value, className, readonly, inputWidth){
            		var input = "<input ";
            		if(id){
            			input += ' id=';
            			input += "'"+id+"'";
            		}
            		if(name){
            			input +=' name=';
            			input += "'"+name+"'";
            		}
            		if(value){
            			input += ' value=';
            			input += "'"+value+"'";
            		}
            		if(className){
            			input += ' class=';
            			input += "'"+className+"'";
            		}
            		if(readonly){
            			input += " type='hidden' "
            		}
            		if(inputWidth){
            			input += " style='width:" + inputWidth +  "; border:0 10px;'";            			
            		}
            		
            		input += '>';
            		return input;
            	}
        
        //保存
        function save${timestamp}(){
        	$("#mainUrl").tabs("loading","处理中...");
            $('#productCodeApply${timestamp}').form('submit', {

                url: '/projectWebFlow/save',
                onSubmit: function(){
                	return true;
                },
                success: function(res){
                	var resData = eval("(" + res + ")");
                	 //$.messager.alert("提示信息",resData.msg);
                	 var tab = $('#mainUrl').tabs('getSelected');
 					 var index = $('#mainUrl').tabs('getTabIndex', tab);
 					 $("#mainUrl").tabs("close", index);
 					 $("#mainUrl").tabs("loaded");
                }
            });
        }

        
        
        //申请者提交
        function submit${timestamp}(){
        	$("#mainUrl").tabs("loading","处理中...");
            var proInsId = $("#processInsId${timestamp}").val();
            $('#productCodeApply${timestamp}').form('submit', {

                url: '/projectWebFlow/addProjectCode?proInsId=' + proInsId,
                onSubmit: function(){
                    var isValid = $(this).form('validate');

                    if (!isValid){
                    	$("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid
                    }
                    return isValid;	// return false will stop the form submission
                },
                success: function(data){
                	
                    if("提交成功" == data){
                    	closeTab();
                    }else{
                    	$.messager.alert("提示信息", data)
                    }
                    $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully
                }
            });
        }
        
        
        function sendAjaxforApply(url, proInsId, status, taskId, suggest){
        	$("#mainUrl").tabs("loading","处理中...");
        	if(suggest == "" && status=="不同意"){
        		$.messager.alert("提示信息","请填写意见");
        		$("#mainUrl").tabs("loaded");
        		return;
        	}
        	$.ajax({
                url:url,
                type:"post",
                dataType:"text",
                data:{proInsId:proInsId,status:status,taskId:taskId, suggest:suggest},
                success:function(data){
                    // alert(data);
                     /* var applyNo = $("#applyNo").val();
                     var tab = $('#mainUrl').tabs('getSelected');
                     tab.panel('refresh', '/projectWebFlow/edit?applyNo='+ applyNo); */
                     if("审批成功" == data){
                    	 if(window.location.href.indexOf('eipLogin') > -1){
                    	 var data = {};
                    	 data.Code = 11;
                    	 data.Msg = "审批成功";
                    	 PM.send(top.window.parent, "fromSource", data); 
                    	 }else{
                    		closeTab();
                     		$("#mainUrl").tabs("loaded");
                    	 }
                     }
                },
                error :function(data){
                	//console.info(data);
                	if("审批成功" == data){
                		
                		 if(window.location.href.indexOf('eipLogin') > -1){
 		               		var data = {};
                   	 		data.Code = 0;
                   	 		data.Msg = "审批失败";
        	           	 PM.send(top.window.parent, "fromSource", data);
                			 
                		 }else{
                			 $.messager.alert("提示信息","error");
                			//closeTab();                			 
                		 }
                    }
                }
            });
        }
        
       //审核者同意
        function approverAgree${timestamp}(){
    	   
        	$("#mainUrl").tabs("loading","处理中...");
    	   
    	   var proInsId = $("#processInsId${timestamp}").val();
    	   var taskId = $("#taskId${timestamp}").val();
    	   var url = "projectWebFlow/approveApply";
    	   var suggest = $("#approveOpinion${timestamp}").textbox('getValue');
    	   //如果新增才有推荐的项目编码
    	   /* if(!suggest){
    		   alert("请填写意见");
    		   $("#mainUrl").tabs("loaded");
    		   return;
    	   } */
    	   var projectCodeData = "";
    	   if($("#optType${timestamp}").val() == "1"){
    		   //设置生效
    		   var projectHisDataNum = $('#possProjcodeNumber${timestamp}').datagrid('getData').total;
    		   for(var i = 0; i < projectHisDataNum; i++){
    			   $("#possProjcodeNumber${timestamp}").datagrid('endEdit',i);
    		   }
    		   projectCodeData = $('#possProjcodeNumber${timestamp}').datagrid('getData');
    	   }
    	   var status = "同意";
    	   //sendAjaxforApply(url, proInsId , "同意", taskId, suggest);
    	   $.ajax({
               url:url,
               type:"post",
               dataType:"text",
               data:{proInsId:proInsId,status:status,taskId:taskId, suggest:suggest, projectCodeData:JSON.stringify(projectCodeData.rows)},
               success:function(data){
                    //alert(data);
                    debugger;
                    if(data == '审批成功'){
                    	closeTab();
                   }else{
                	   $.messager.alert("提示信息",data);
                	   var projectHisDataNum = $('#possProjcodeNumber${timestamp}').datagrid('getData').total;
            		   for(var i = 0; i < projectHisDataNum; i++){
            			   $("#possProjcodeNumber${timestamp}").datagrid('beginEdit',i);
            		   }
                   }
                    $("#mainUrl").tabs("loaded");
               },
               error :function(data){
            	   $.messager.alert("提示信息","error");
               	$("#mainUrl").tabs("loaded");
               }
           });
        }
        
      //审核者不同意
         function approverNoAgree${timestamp}(){
           var proInsId = $("#processInsId${timestamp}").val();
           var taskId = $("#taskId${timestamp}").val();
      	   var url = "projectWebFlow/approveApply";
      	   var suggest = $("#approveOpinion${timestamp}").textbox('getValue');
      	   sendAjaxforApply(url, proInsId , "不同意", taskId, suggest);
        } 
        
      //项目经理同意
      	function projMngAgree${timestamp}(){
      	   var proInsId = $("#processInsId${timestamp}").val();
      	 var taskId = $("#taskId${timestamp}").val();
      	   var url = "projectWebFlow/projectMngApply";
      	   var suggest = $("#projMngOpinion${timestamp}").textbox('getValue');
      	   sendAjaxforApply(url, proInsId , "同意", taskId, suggest);
      	}
        
      //项目经理不同意
      	function projMngDisAgree${timestamp}(){
      	   var proInsId = $("#processInsId${timestamp}").val();
      	 var taskId = $("#taskId${timestamp}").val();
       	   var url = "projectWebFlow/projectMngApply";
       		var suggest = $("#projMngOpinion${timestamp}").textbox('getValue');
       	   sendAjaxforApply(url, proInsId , "不同意", taskId, suggest);
      	}
      
      
      //财务接口人同意
      function finInterfaceAgree${timestamp}(){
     	   var proInsId = $("#processInsId${timestamp}").val();
     	  var taskId = $("#taskId${timestamp}").val();
       	   var url = "projectWebFlow/financeInterfaceApply";
       	   var suggest = $("#finInterfaceOpinion${timestamp}").textbox('getValue');
       	   sendAjaxforApply(url, proInsId , "同意", taskId, suggest);
      }
      
    //财务接口人不同意
      function finInterfaceDisAgree${timestamp}(){
    	   var proInsId = $("#processInsId${timestamp}").val();
    	   var taskId = $("#taskId${timestamp}").val();
      	   var url = "projectWebFlow/financeInterfaceApply";
      	 var suggest = $("#finInterfaceOpinion${timestamp}").textbox('getValue');
      	   sendAjaxforApply(url, proInsId , "不同意", taskId, suggest);
      }
    
    //财务同意
    function finAgree${timestamp}(){
       var proInsId = $("#processInsId${timestamp}").val();
       var taskId = $("#taskId${timestamp}").val();
	   var url = "projectWebFlow/financerApply";
	   var suggest = $("#finOpinion${timestamp}").textbox('getValue');
	   sendAjaxforApply(url, proInsId , "同意", taskId, suggest);
    }
    
  //财务不同意
    function finDisAgree${timestamp}(){
       var proInsId = $("#processInsId${timestamp}").val();
       var taskId = $("#taskId${timestamp}").val();
 	   var url = "projectWebFlow/financerApply";
 	   var suggest = $("#finOpinion${timestamp}").textbox('getValue');
 	   sendAjaxforApply(url, proInsId , "不同意", taskId, suggest);
    }
  //项目管理处同意
    function projOfficeAgree${timestamp}(){
       var proInsId = $("#processInsId${timestamp}").val();
       var taskId = $("#taskId${timestamp}").val();
 	   var url = "projectWebFlow/projectOfficeApply";
 	   var suggest = $("#projOfficeOpinion${timestamp}").textbox('getValue');
 	   sendAjaxforApply(url, proInsId , "同意", taskId, suggest);
    }
  //项目管理处不同意
    function projOfficeDisAgree${timestamp}(){
       var proInsId = $("#processInsId${timestamp}").val();
       var taskId = $("#taskId${timestamp}").val();
 	   var url = "projectWebFlow/projectOfficeApply";
 	   var suggest = $("#projOfficeOpinion${timestamp}").textbox('getValue');
 	   sendAjaxforApply(url, proInsId , "不同意", taskId, suggest);
    }
  
  
  
  
    function loadSubForm${timestamp}() {
        
            var applyType = $("#previous_input_optType${timestamp}").val();;
            var applyCount = $("#applyCount${timestamp}").val();

            
            if(applyType){
            	$("#subForm111${timestamp}").load("/projectWebFlow/subForm/" + applyType,
                        $('#productCodeApply${timestamp}').serializeObject());
            }else{
            	$("#subForm111${timestamp}").load("/projectWebFlow/subForm/1",
                        $('#productCodeApply${timestamp}').serializeObject());
            }
            
            
    }
  
  
  
  
    function confirmDlg${timestamp}(v) {
        //确认
        if("1"==v){
        	
        	//清除所有的必填项
        	//新增  修改   删除
        	clearRequired${timestamp}($("#input_optType${timestamp}").val(), $("#input_applyCount${timestamp}").val());
        	var maxCount =  $("#maxApplyCount${timestamp}").val();
            $("#previous_input_optType${timestamp}").val($("#input_optType${timestamp}").val());
            $("#input_optType${timestamp}").val($("#optType${timestamp}").val());
            if(parseInt($("#applyCount${timestamp}").val()) > parseInt(maxCount)){

            	$.messager.alert("提示信息","超过了申请最大值，按照最大值, 如果想调整，请联系管理员");
            	$("#input_applyCount${timestamp}").val(maxCount);
            }else{
            	$("#input_applyCount${timestamp}").val($("#applyCount${timestamp}").val());
            }
            
        }else if("0"==v){
            //取消
            $("#optType${timestamp}").val($("#input_optType${timestamp}").val());
            //$("#applyCount${timestamp}").val($("#input_applyCount${timestamp}").val());
            $("#applyCount${timestamp}").numberbox("setValue",$("#input_applyCount${timestamp}").val());
        }
        loadSubForm${timestamp}();
        $("#dlg${timestamp}").window('close');
    }
    //清除必填项
    function clearRequired${timestamp}(optType, num){
    	if('1' == optType){//新增
    		for(var i = 0; i < num; i++){
    			$("#applys\\[" + i + "\\]\\.proNo${timestamp}").textbox({required:false});
    			$("#applys\\[" + i + "\\]\\.proTime${timestamp}").textbox({required:false});
    			$("#applys\\[" + i + "\\]\\.version${timestamp}").textbox({required:false});
    			$("#applys\\[" + i + "\\]\\.probizhong${timestamp}").textbox({required:false});
    			$("#applys\\[" + i + "\\]\\.profbizhong${timestamp}").textbox({required:false});
    		}
    	}else if('2' == optType){//改变
    		$("#applys\\[" + i + "\\]\\.proNumber${timestamp}").textbox({required:false});
    		$("#applys\\[" + i + "\\]\\.probizhong${timestamp}").textbox({required:false});
    		$("#applys\\[" + i + "\\]\\.profbizhong${timestamp}").textbox({required:false});
    	}else{//删除
    		$("#applys\\[" + i + "\\]\\.proNumber${timestamp}").textbox({required:false});
    	}
    }
    
    //修改研发基本信息
    function updateProjectInfo(){
    	var proInsId = $("#processInsId${timestamp}").val();
        var taskId = $("#taskId${timestamp}").val();
  	   	var url = "projectWebFlow/updateProductInfo";
	  	  $.ajax({
	          url:url,
	          type:"post",
	          dataType:"json",
	          data:{proInsId:proInsId,taskId:taskId},
	          success:function(data){
	               alert(data)
	          },
	          error :function(data){
	          	console.info(data);
	          }
	      });	   	
    }
    
    function initDic(){
    	//项目类别
    	$.get("/projectWebFlow/getDicItem?type=6",function (result) {

            var a = new Array();
            $.each(result,function(i,e){
                a.push({"id":e.dicValue,"text":e.dicName});
            });
            $("[id^=applys][id$=proCa${timestamp}]").combobox("loadData",a);
            //$("[id^=applys][id$=proCaName${timestamp}]").val(e.dicValue);
        });
    	//对应的评审点
    	$.get("/projectWebFlow/getDicItem?type=21",function (result) {

            var a = new Array();
            $.each(result,function(i,e){
                a.push({"id":e.dicValue,"text":e.dicName});
            });
            $("[id^=applys][id$=proPoint${timestamp}]").combobox("loadData",a);
            //$("[id^=applys][id$=proPointName${timestamp}]").val(e.dicName);
        });
    	
    	//产品线
    	$.get("/projectWebFlow/getDicItem?type=23",function (result) {

            var a = new Array();
            $.each(result,function(i,e){
                a.push({"id":e.dicValue,"text":e.dicName});
            });
            $("[id^=applys][id$=proProdlineNo${timestamp}]").combobox("loadData",a);
            //$("[id^=applys][id$=proProdlineName${timestamp}]").val(e.dicName);
        });
    	//项目编码最大值初始化
    	
    	$.get("/projectWebFlow/getDicItem?type=40",function (result) {
    		 $.each(result,function(i,e){
                 $("#maxApplyCount${timestamp}").val(e.dicValue)
             });
           
        });
    }
    
	function updateActions(index){
		$('#possProjcodeNumber${timestamp}').datagrid('updateRow',{
			index: index,
			row:{}
		});
	}
	
	
	
	function changeHandler${timestamp}() {
		$("#mainUrl").tabs("loading","处理中...");
		var proInsId = $("#processInsId${timestamp}").val();
		var taskId = $("#taskId${timestamp}").val();
        var userId =  $("#assignDesc${timestamp}").val();
        if(userId == ""){
        	$.messager.alert("提示信息","处理人不能为空！");
            $("#mainUrl").tabs("loaded");
        }else{
            $.post("/projectWebFlow/changeHandler",{id:proInsId,taskId:taskId,userId:userId},function (result) {
                if(result.status == 200){
                	$.messager.alert("提示信息","修改当前处理人成功");
                    if(window.location.href.indexOf('eipLogin') > -1){
                    	var data = {};
                    	 data.Code = 11;
                    	 data.Msg = "审批成功";
                   	 PM.send(top.window.parent, "fromSource", data); 
                   	 }else{
                   		closeTab(); 
                   	 }
                }else{
                	if(window.location.href.indexOf('eipLogin') > -1){
                		var data = {};
                   	 	data.Code = 0;
                   	 	data.Msg = "审批失败";
       	           	 	PM.send(top.window.parent, "fromSource", data);
               		 }
                	$.messager.alert("提示信息","修改当前处理人失败");
                }
                $("#mainUrl").tabs("loaded");
            });
        }

    }
	
	function closeTab(){
	    var tab = $('#mainUrl').tabs('getSelected');
		var index = $('#mainUrl').tabs('getTabIndex', tab);
		$("#mainUrl").tabs("close", index);
	}
	
	function doSearch${timestamp}(){
		$("#oldProjectCode${timestamp}").datagrid("load",{
			searchArgs:$("#searchArgs${timestamp}").val()
		  });
	}
	
	function doSearchProductCode${timestamp}(){
		$("#productCode${timestamp}").datagrid("load",{
			searchStr:$("#searchProductCodeArgs${timestamp}").val()
		  });
	}
	
	
	function doSearchRelease${timestamp}(){
		//查询时初始化部分节点展开参数
		isExpandALl${timestamp}=false;
		exeandAll_ID${timestamp}='';
		$("#tg${timestamp}").treegrid("load",{
			searchParas:$("#searchRelease${timestamp}").textbox("getValue")
		  });
	}
	
	
	function deleteProcess${timestamp}() {
		var applyNo = $("#applyNo").val();
        $.post("/projectWebFlow/deleteByApplyNo?applyNo=" + applyNo,function (result) {
            if(result.status == 200){
                var tab = $('#mainUrl').tabs('getSelected');
                var index = $('#mainUrl').tabs('getTabIndex', tab);
                $("#mainUrl").tabs("close", index)
            }else{
                alert(result.message);
            }
        });
    }
	
	function hasChinese(v){
    	var re = new RegExp("[\\u4E00-\\u9FFF]+","g");       
    	if (re.test(v)){
    		return true;
    	}
    	return false;
    }
    </script>
</body>
</html>
