<%@page import="java.lang.reflect.Field"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<%
   String obj_fields = "";
   Object obj = request.getAttribute("apply");
   if(obj != null) {
	  Class clazz = obj.getClass();
	  Field [] fields =  clazz.getDeclaredFields();
	  for(Field field: fields)
	  {
	  	obj_fields += field.getName() +",";
	  }
	  pageContext.setAttribute("obj_fields", obj_fields);
   }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>研发产品基本信息修改申请表</title>
    <style>
    	.textBoxFrom .textbox {
    		margin: 20px 0px!important;
    	}
    </style>
</head>
<body id="tabStyle${id_suffix}" style="width:100%;">
<jsp:include page="/WEB-INF/jsp/ueditor/easyui-ueditor.jsp">
    <jsp:param name="module" value="productApply"/>
    <jsp:param name="field" value="applyType"/>
</jsp:include>
<div class="productC" id="productC${id_suffix}">
 <div class="toptoolbar" style="position:fixed;margin:0px 20px;z-index:9000;">
 <c:if test="${((currentNode=='userTask1' && isHandler) || (currentNode == 'editable'&& isHandler)=='true')|| showStatus == 'add'}">
  <a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" onclick="saveMenue${id_suffix}()"
           data-options="iconCls:'fa fa-save'"
        >保存</a>
  </c:if>
   <a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" onclick="changeMenue${id_suffix}('fold')"
           data-options="iconCls:'fa fa-minus'"
        >折叠</a>
        <a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true" onclick="changeMenue${id_suffix}('expand')"
           data-options="iconCls:'fa fa-plus'"
        >展开</a>
        <a href="#" id="btnCopy${id_suffix}" class="easyui-linkbutton" plain="true" onclick="copyLink('/basicinfo/productApply/edit/${entity.id}','修改产品信息','${entity.id}','${copyTitle}')"
              data-options="iconCls:'fa fa-files-o'">复制链接</a>
              <c:if test="${((currentNode=='userTask1' && isHandler) || (currentNode == 'editable')=='true')|| showStatus == 'add'}">
              <c:if test="${entity.status==0||entity.status==-1}">
                 <a href="#" id="btnDel${id_suffix}" class="easyui-linkbutton" plain="true" onclick="delProcess${id_suffix}('${entity.id}');"
              data-options="iconCls:'fa fa-files-o'">废弃</a>
           </c:if>
           </c:if>
        
 </div>
 <br/><br/>
 
  <div class="toptoolbarhr" style="width:100%"></div>
	<p> 
			<span class="title191030" >研发产品基本信息修改申请表</span>
</p>

   <form method='post' name='productApply' id='productApply${id_suffix}' style="width:100%;">
    <input id="id${id_suffix}" name="id" value="${entity.id}" type="hidden"/>
    <input id="id0${id_suffix}" name="applys[0].id" value="${entity.applys[0].id}" type="hidden"/>
    <input id="id1${id_suffix}" name="applys[1].id" value="${entity.applys[1].id}" type="hidden"/>
    <input id="id2${id_suffix}" name="applys[2].id" value="${entity.applys[2].id}" type="hidden"/>
    <input id="instanseId${instanseId}" name="instanseId" value="${entity.instanseId}" type="hidden"/>
    
    <div style="font-size: 13px; margin-left: 20px">
				<table  cellspacing="0" width="100%" style="border-color: #ABABAB;  border:none;">
					<tr>
						<td width="20%">所处环节：&nbsp;
							<span style="color: #3A5FCD">${entity.statusname}</span>
							&nbsp;&nbsp;
							 <input name="status" value="${entity.status}" type="hidden"/>
						</td>
						<td width="20%">
							&nbsp;&nbsp;当前责任人：&nbsp;&nbsp;&nbsp;&nbsp;
							<span style="color: #3A5FCD"><ibds:userAccount account="${entity.responsible}"/></span>
							&nbsp;&nbsp;
							  <input name="responsible" value="${entity.responsible}" type="hidden"/>
						</td>
						<td width="20%">
							&nbsp;&nbsp;当前状态描述：
							<span style="color: #3A5FCD">${entity.statusname}</span>
							&nbsp;&nbsp;
							<input name="statusname" value="${entity.statusname}" type="hidden"/>
						</td>
						<td width="20%">
							&nbsp;&nbsp;单号：
							<span style="color: #3A5FCD">${entity.applycode}
							</span>
							<input type="hidden" value="${entity.applycode}" name="applycode" />
							&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</div>
    
            <%--  <div style="font-size:13px;width:100%;margin:0px 20px;" >
                <table cellspacing="0" style="width:100%;margin:auto;border-collapse:collapse;border-spacing:0;border-left:0px solid #888;border-top:0px solid #888;;border-bottom:0px solid #888">
                 <tr>
                                <td width="15%">&nbsp;&nbsp;所处环节：&nbsp;
                                    <span id="status${id_suffix}" >${entity.statusname}</span>  &nbsp;&nbsp;
                                 <input name="status" value="${entity.status}" type="hidden"/>
                                </td>
                                <td width="15%">&nbsp;&nbsp;当前责任人：&nbsp;&nbsp;&nbsp;&nbsp;
                                   <span id="responsible${id_suffix}"><ibds:userAccount account="${entity.responsible}"/></span>  &nbsp;&nbsp;
                                <input name="responsible" value="${entity.responsible}" type="hidden"/>
                                </td>
                               
                                <td width="15%">&nbsp;&nbsp;当前状态描述：
                                  <span id="statusName${id_suffix}"  >${entity.statusname}</span>  &nbsp;&nbsp;
                                <input name="statusname" value="${entity.statusname}" type="hidden"/>
                                </td>
                                 <td width="40%">&nbsp;&nbsp;单号：
                                  <span id="applycode${id_suffix}">${entity.applycode}</span>  &nbsp;&nbsp;
                                	<input name="applycode" id="hidCode${id_suffix}" value="${entity.applycode}" type="hidden"/>
                                </td>
                            </tr>
                </table>
        </div> --%>
        <br>
        <div style="margin:0px 20px;" id="divSub${id_suffix}">
        <h2 class="subfild" id="T00000_1${id_suffix}" style="width:100%" >
            	<span>1.产品POP提出修改申请</span>
            </h2>
           
        <div id="SUBFORM_T00000_1${id_suffix}" class="textBoxFrom">
          <div style="font-size:13px;margin:10px 0px;width:100%;">
           <!-- <span style="color:#f25aef;font-size:15px;;margin:auto" width="100%">请先选择IPMT、研发产品线：</span> -->
                <table class="product" border="0" cellspacing="0" style="width:100%;">
                <tr>
                <td width="25%"><span style="color:red">*</span>&nbspIPMT:
                <input name="applys[0].plipmtno" style="width:50%;height:30px;" id="plipmtno${id_suffix}" value="" 
				 data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/list?type=PI&code=',required:true,missingMessage:'请选择IPMT'"
									class="easyui-combobox" />
				   <input name="applys[1].plipmtno" type="hidden" style="width:100%;height:30px;" id="plipmtno1${id_suffix}" value="" 
				 type=""  data-options="" />
				   <input name="applys[2].plipmtno" type="hidden" style="width:100%;height:30px;" id="plipmtno2${id_suffix}" value="" 
				 type=""  data-options="" />
				 </td>
                <td width="25%"><span style="color:red">*</span>&nbsp研发产品线: 
                <input name="applys[0].prodlineno" style="width:50%;height:30px;" id="prodlineno${id_suffix}" value="" 
				 type=""  data-options="" class="easyui-combobox"/>
				  <input name="applys[1].prodlineno" type="hidden" style="width:100%;height:30px;" id="prodlineno1${id_suffix}" value="" />
				  <input name="applys[2].prodlineno" type="hidden" style="width:100%;height:30px;" id="prodlineno2${id_suffix}" value=""/>
                 </td>
                 <td width="45%">
                 <a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}();" style="color:white;background-color:#3498DB;height:30px;float:left;">查看已有产品清单</a>
                 </td></tr></table>
                 <br>
                 <hr>
                <input type="checkbox" class="combobox-checkbox" id="addproduct${id_suffix}" name="applys[0].appytype" style="margin-top: 2px;">&nbsp; 
				
				
				<span class="span28" style="font-size：14px;font-weight:600;line-height:40px;">新增产品</span><br>
				    <table class="product" id="addTab${id_suffix}" border="0" cellspacing="0"  style="width:100%;margin-bottom:20px!important;">
                    <tr>
              <%--   <td width="25%">要新增产品的内码:
                <input name="applys[0].productno"  style="width:50%;height:30px;" id="productno${id_suffix}" readonly="readonly" class="easyui-textbox"/></td> --%>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>要新增产品的中文名称: 
                <input name="applys[0].product" style="width:50%;height:30px;" id="product${id_suffix}" value="${entity.applys[0].product}" 
				type=""  data-options="" class="easyui-textbox"/></td>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>要新增产品的英文名称: 
                <input name="applys[0].engproduct" style="width:50%;height:30px;" id="engproduct${id_suffix}" value="${entity.applys[0].engproduct}" 
				 type=""  data-options="" class="easyui-textbox"/></td>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>请选择对应的财务编码与名称:
                <input name="applys[0].fproductno" style="width:50%;height:30px;" id="fproductno${id_suffix}" class="easyui-combobox" value="${entity.applys[0].fproductno}"/>
                </td>
                <td align="right" style="padding:1px 0px 1px 8px;">
				 <a href="#" class="easyui-linkbutton" onclick="applyProductCode${id_suffix}()" style="margin-left:1%;margin-top:none;color:white;background-color:#3498DB;">申请新的财务产品 </a>
				 </td>
				 </tr>
				 
				 
				  <tr>
				  
                <td width="30%" style="text-align:right"><span style="color:red">* </span>产品类型:
					<input name="applys[0].producttypeno" style="width:50%;height:30px;" id="producttypeno${id_suffix}" value="${entity.applys[0].producttypeno}" 
				  data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxDicdata/list?type=4'"
									class="easyui-combobox" /></td>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>产品经理:
                <input class="auto_selusers_true" name="applys[0].pmId" style="width:50%;height:30px;" id="pmId${id_suffix}" value="${entity.applys[0].pmId}" 
				type=""  data-options="" /></td>
				
                <td width="30%" style="text-align:right"><span style="color:red">* </span>产品POP:
                <input name="applys[0].popId" style="width:50%;height:30px;" id="popId${id_suffix}" value="${entity.applys[0].popId}" 
				 type=""  data-options="" class="auto_selusers_true"/></td>
				 </tr>
				 
				<tr>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>产品配置经理:
                <input name="applys[0].cmoId" style="width:50%;height:30px;" id="cmoId${id_suffix}" value="${entity.applys[0].cmoId}" 
				 type=""  data-options="" class="auto_selusers_true"/></td>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>产品数据经理:
                <input name="applys[0].pdeId" style="width:50%;height:30px;" id="pdeId${id_suffix}" value="${entity.applys[0].pdeId}" 
				 type=""  data-options="" class="auto_selusers_true"/></td>
				 <td colspan="3"></td>
				 </tr> 
                </table>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="editproduct${id_suffix}" name="applys[1].appytype" style="margin-top: 2px;">&nbsp; 
				<span class="span28" style="font-size：14px;font-weight:600;line-height:40px;">修改产品</span><br>
				  <table class="product" id="editTab${id_suffix}" border="0" cellspacing="0" style="width:100%;margin:10px 0px;">
                <tr>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>请选择要修改的产品:
                <input name="productSelEdit" style="width:50%;height:30px;" id="productSelEdit${id_suffix}" value="${entity.applys[1].productno}" 
				class="easyui-combobox"/>
				<td colspan="5"></td>
                </td>
                </tr>
                 <tr>
                <td width="30%" style="text-align:right">要修改产品的内码:
                <input class="easyui-textbox" name="applys[1].productno" id="editproductno${id_suffix}" style="width:50%;height:30px;"
                value="${entity.applys[1].productno}" readonly="readonly"/>
                <div style="display:none"><input class="easyui-textbox" name="applys[1].productoldno" id="editproductoldno${id_suffix}" style="width:100%;height:30px;"
                value="${entity.applys[1].productoldno}" /></div>
                
                </td>
                <td width="30%" style="text-align:right">要修改产品的原中文名称:
                 <input name="applys[1].productold" style="width:50%;height:30px;" id="editproductold${id_suffix}" readonly="readonly"
				 value="${entity.applys[1].productold}"  data-options="" class="easyui-textbox"/></td>
                <td width="30%" style="text-align:right">要修改产品的原英文名称:
                <input name="applys[1].engproductold" style="width:50%;height:30px;" id="editengproductold${id_suffix}" readonly="readonly"
				 value="${entity.applys[1].engproductold}"  data-options="" class="easyui-textbox"/></td>
				<!--  <td width="25%" ></td> -->
				<td></td>
				 </tr>
				 <tr>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>要修改产品的新中文名称:
                <input name="applys[1].product" style="width:50%;height:30px;" id="productnow${id_suffix}"
				 value="${entity.applys[1].product}"  data-options="" class="easyui-textbox"/></td>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>要修改产品的新英文名称:
                <input name="applys[1].engproduct" style="width:50%;height:30px;" id="engproductnow${id_suffix}" 
                value="${entity.applys[1].engproduct}" data-options="" class="easyui-textbox"/></td>
                <td colspan="3"></td>
                </tr> 
                </table>
                <hr>
				<input type="checkbox" class="combobox-checkbox" id="delproduct${id_suffix}" name="applys[2].appytype" style="margin-top: 2px;">&nbsp; 
				<span  class="span28" style="font-size：14px;font-weight:600;line-height:40px;">停用产品</span><br>
				  <table class="product" id="delTab${id_suffix}" border="0" cellspacing="0" style="width:100%">
                <tr>
                <td width="30%" style="text-align:right"><span style="color:red">* </span>请选择要停用的产品:
                <input name="productnoDel" style="width:50%;height:30px;" id="productnoDel${id_suffix}" value="" 
				 class="easyui-combobox"/>
                </td>
                <td width="75%" colspan="6"></td>
                </tr>
                <tr>
                 <td width="30%" style="text-align:right">要停用产品的内码:
                <input name="applys[2].productno" style="width:50%;height:30px;" id="delproductno${id_suffix}" value="${entity.applys[2].productno}" 
				 readonly="readonly" class="easyui-textbox"/></td>
                 <td width="30%" style="text-align:right">要停用产品的原中文名称:
                 <input name="applys[2].product" style="width:50%;height:30px;" id="delproductname${id_suffix}" value="${entity.applys[2].product}" 
				 readonly="readonly" class="easyui-textbox"/></td>
                 <td width="30%" style="text-align:right">要停用产品的原英文名称:
                  <input name="applys[2].engproduct" style="width:50%;height:30px;" id="delengproduct${id_suffix}" value="${entity.applys[2].engproduct}" 
				 readonly="readonly" class="easyui-textbox"/></td>
				 <td colspan="3"></td>
				 </tr>
				 <tr>
                <td colspan="7" style="color:red">注:停用该产品会停用该产品以下级别的信息：包括产品V级、R级、版本、项目组、特性、子系统、模块、模块版本</td>
               
				 </tr> 
                </table><hr>
                <br>
                
                <%-- <table class="product" id="editTab${id_suffix}" border="0" cellspacing="0" style="width:100%;margin:10px 0px;">
                <tr>
                <td width="30%" style="text-align:left;" >备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注:
                <textarea name="remark" class="remark28" style="width:300px;border-color:#d3d3d3;height:30px;" autoHeight="true"   id="remarks${id_suffix}" >${entity.remark}</textarea>
                </td >
                <td width="20%">
                 <a href="#" class="easyui-linkbutton" onclick="sub${id_suffix}()" id="sub${id_suffix}" style="color:white;background-color:#3498DB;height:30px; margin-right: 28px;">提交</a> 
                </td>
                   <td width="50%" colspan="4">
				
				 <span  style="font-size:14px;">签名：<ibds:userAccount account="${entity.popFillname}"/></span>
				 <span  style="font-size:14px;margin-left:17%;">时间:<fmt:formatDate value="${entity.popFilltime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
				 </td>
				</tr>
				</table> --%>
				
				 <div>
                     依据材料:&nbsp;&nbsp;&nbsp;
                     <input id="applyType_1_${timestamp}" name="applyType" value="${entity.applyType}" type="hidden"/>

                     <a href="#">
                         <img id="fileIcon_${timestamp}" src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" _src="/ueditor/dialogs/attachment/fileTypeImages/icon_txt.gif" onclick="layoutUeditorWin${timestamp}(1)">
                     </a>


                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注:
				 	<input name="remark" id="remarks${id_suffix}" class="easyui-textbox" data-options="multiline:true" style="width: 45%;height: 30px;"  value="${entity.remark}" />
				 	 <%-- <textarea name="remark" id="remarks${id_suffix}" >${entity.remark}</textarea> --%>
				 	 <a href="#" class="easyui-linkbutton" onclick="sub${id_suffix}()" id="sub${id_suffix}" style="color:white;background-color:#3498DB;height:30px; margin:0PX 4% 0px 1%; ">提交</a>
				 	  <span  style="font-size:14px;">签名：<ibds:userAccount account="${entity.popFillname}"/></span>
				 <span  style="font-size:14px;margin-left:6%;">时间:<fmt:formatDate value="${entity.popFilltime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
				 </div>
				 
				 <br>
				 <hr>
          </div>
      
        </div>
        <h2 class="subfild" id="T00000_2${id_suffix}" >
            	<span>2.IPMT执行秘书审核并录入</span>
            </h2>
              <div id="SUBFORM_T00000_2${id_suffix}" style="height:30px;">
            <%--   <div style="font-size:13px;float:left;width:30%;line-height: 30px;" ><div style="float:left;"> 审批意见:</div>
                 <div style="float:left;" id="ipmtSuggestionDiv${id_suffix}">
                 <input id="ipmtSuggestion${id_suffix}" class="easyui-textbox" name="ipmtSuggestion" style="width:300px;height:30px;" value="${entity.ipmtSuggestion}" /></div>
               
               </div>
              
				 <div style="float:left;width:70%">
				  <div id="ipmtCheckDiv${id_suffix}">
				<a href="#" class="easyui-linkbutton" onclick="check${id_suffix}('1','check')" id="agree${id_suffix}" style="color:white;background-color:#3498DB;height:30px; ">同意</a>
				<a href="#" class="easyui-linkbutton" onclick="check${id_suffix}('0','check')" id="disagree${id_suffix}" style="margin-left:4%;color:#3498DB;background-color:white;height:30px; ">驳回</a>
				<span  style="font-size:14px;margin-left:5%;">签名：<ibds:userAccount account="${entity.ipmtFillname}"/></span><span  style="font-size:14px;margin-left:17%;">时间:<fmt:formatDate value="${entity.ipmtFilltime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
				 </div>
             </div> 
              </div>--%>
            	
                 <div>
              
            	    审批意见:
            	  <input id="ipmtSuggestion${id_suffix}" class="easyui-textbox" name="ipmtSuggestion" style="width:45%;height:30px;" value="${entity.ipmtSuggestion}" />
               
                <a href="#" class="easyui-linkbutton" onclick="check${id_suffix}('1','check')" id="agree${id_suffix}" style="color:white;background-color:#3498DB;height:30px; margin: 0PX 1% 0px 1%">同意</a>
				<a href="#" class="easyui-linkbutton" onclick="check${id_suffix}('0','check')" id="disagree${id_suffix}" style="color:#3498DB;background-color:white;height:30px;">驳回</a>
				
				<span  style="font-size:14px; margin-left: 4%">签名：<ibds:userAccount account="${entity.ipmtFillname}"/></span>
				 <span  style="font-size:14px;margin-left:6%;">时间:<fmt:formatDate value="${entity.ipmtFilltime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
				
              
              </div>
              </div>
              
              <h2 class="subfild" id="T00000_3${id_suffix}" >
            	<span>管理区段</span>
            </h2>
            
              <div id="SUBFORM_T00000_3${id_suffix}" style="height:30px;display:none">
	              <div style="float:left;width:30%">
	                <span>&nbsp;&nbsp;&nbsp;处理人：<input id="assignDesc${id_suffix}"  class="auto_selusers_false" value="" style="width:300px!important"/></span>
                    <input id="assign" value="" type="hidden"/>
                   </div>
                   
                   <div style="float:left;width:70%;text-align:left">
                       <a href="javascript:void(0)" class="easyui-linkbutton" id="editUser${id_suffix}" style="color:white;background-color:#3498DB;margin-top:10px;">修改当前处理人</a>
                   </div>
              </div>
               <h2 class="subfild" id="T00000_4${id_suffix}" >
            	<span>处理记录</span>
            </h2>
              <div id="SUBFORM_T00000_4${id_suffix}" style="display:none">
               <c:forEach var="processLog" items="${logs}">
        <div>
            <span>
                系统时间：<fmt:formatDate value="${processLog.checkDate}" pattern="yyyy-MM-dd HH:mm:ss"/>&nbsp;&nbsp;
                <ibds:userAccount account="${processLog.checkAccount}"/>&nbsp;&nbsp;
                ${processLog.checkResult}&nbsp;&nbsp;
                （意见：${processLog.checkOpion}&nbsp;&nbsp;）—》
                ${processLog.checkStatus}&nbsp;&nbsp;

            </span>
        </div>

    </c:forEach>
    <br><br>
              </div>
        </div>
        
   </form>
   <br><br>
   </div>
<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css"/>
<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="common/js/common.js"></script>
<script type="text/javascript" src="common/js/prBelowApply.js"></script>
<script type="text/javascript">
$(function(){
	//多个人员联想
	 if($("#productC${id_suffix} input[class*='auto_selusers_true']").length>0){
  	 $("#productC${id_suffix} input[class*='auto_selusers_true']").each(function(index,element){
  		 $(this).autocomplete("/product/userlink/list?userCode=liucaixuan", {
  			    multiple: true,
  			  	max : 20, //列表里的条目数
  				minChars : 2, //自动完成激活之前填入的最小字符
  				width : "400px", //提示的宽度，溢出隐藏
  				scrollHeight : 400, //提示的高度，溢出显示滚动条
  				matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
  				autoFill : false, //自动填充
  				mustMatch: true,
  				multipleSeparator:",",
  				parse : function(data) {
  					return $.map(eval(data), function(row) {
  						return {
  							data : row,
  							value : row.groupname,
  							result :row.groupname
  						}
  					}); //对ajax页面传过来的数据进行json转码
  				},
  				formatItem : function(row, i, max) {
  					//document.getElementById('cmoid').value = "";
  					return row.groupname + ' | ' + row.deptname;
  				}
  		    })
  	 });
  	 }
	
	//默认隐藏
 	if('${entity.applys[0].appytype}'==1||'${entity.applys[1].appytype}'==1||'${entity.applys[2].appytype}'==1){
		$("#addproduct${id_suffix}")._propAttr('checked','true');
	}else{ 
	$("#addTab${id_suffix}").hide();
	}
	if('${entity.applys[0].appytype}'==2||'${entity.applys[1].appytype}'==2||'${entity.applys[2].appytype}'==2){
		$("#editproduct${id_suffix}")._propAttr('checked','true');
	}else{
	$("#editTab${id_suffix}").hide();
	}
	if('${entity.applys[0].appytype}'==3||'${entity.applys[1].appytype}'==3||'${entity.applys[2].appytype}'==3){
		$("#delproduct${id_suffix}")._propAttr('checked','true');
	}else{
	   $("#delTab${id_suffix}").hide(); 
	}
	
	$("[id^='T00000_'][id$='${id_suffix}']").each(function () {
        var id = $(this).prop("id");
        var display = $('#SUBFORM_'+id).css('display');
        if (display == 'none') {
          $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
         // 重新加载easyui样式
        } else {
        	 $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
        }
    });
	
	//折叠面板
	$("[id^='T00000_'][id$='${id_suffix}']").click(function () {

        var id = $(this).prop("id");
        var display = $('#SUBFORM_'+id).css('display');
        if (display == 'none') {
           $('#SUBFORM_'+id).toggle();
           $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
        } else {
        	$('#SUBFORM_'+id).toggle();
        	 $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
        }
    });
	
	
	
	  $("#editproduct${id_suffix}").click(function(){
			if(this.checked==true){
				
				$("#editTab${id_suffix}").show();
				// 重新加载easyui样式
	        	$.parser.parse($("#editTab${id_suffix}"));  
	        	//校验必填项
	        	$("#productSelEdit${id_suffix}").combobox({required:true,missingMessage:'请选择要修改的产品'});
				$("#productnow${id_suffix}").textbox({required:true,missingMessage:'要修改产品的新中文名称不能为空'});
				$("#engproductnow${id_suffix}").textbox({required:true,missingMessage:'要修改产品的新英文名称不能为空'});
			}else{
				$("#editTab${id_suffix}").hide();
				//取消校验
	        	$("#productSelEdit${id_suffix}").combobox({required:false,missingMessage:'请选择要修改的产品'});
				$("#productnow${id_suffix}").textbox({required:false,missingMessage:'要修改产品的新中文名称不能为空'});
				$("#engproductnow${id_suffix}").textbox({required:false,missingMessage:'要修改产品的新英文名称不能为空'});
			}
		}); 
	  
	  $("#delproduct${id_suffix}").click(function(){
			if(this.checked==true){
				
				$("#delTab${id_suffix}").show();
				// 重新加载easyui样式
	        	$.parser.parse($("#delTab${id_suffix}"));  
	        	//校验必填项
	        	$("#productnoDel${id_suffix}").combobox({required:true,missingMessage:'请选择要停用的产品'});
			}else{
				$("#delTab${id_suffix}").hide();
				//取消校验
	        	$("#productnoDel${id_suffix}").combobox({required:false,missingMessage:'请选择要停用的产品'});
			}
		}); 
	  
	  //下拉框选项加载
	  //IPMT加载
	  $("#plipmtno${id_suffix}").combobox({
			/* url : '/product/comboboxdata/list?type=PI&code=',
			method : "post",
			valueField : 'value',
			textField : 'text', 
			editable:false,
			required:true,
			missingMessage:"请选择IPMT",*/
			onSelect: function(rec){
				
				if($("#prodlineno${id_suffix}").length > 0){
					//清空下拉框值，实现强级联
					$('#prodlineno${id_suffix}').combobox("clear");
			    	$('#prodlineno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PL&code='+rec.value+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue")); 
			    	$('#prodlineno${id_suffix}').combobox("select",'${entity.applys[0].prodlineno}');
				}
				//隐藏域赋值
				$("#plipmtno1${id_suffix}").val(rec.value);
				$("#plipmtno2${id_suffix}").val(rec.value);
			},
			onLoadSuccess: function () {
				
				var plipmt="";
				if('${entity.applys[0].plipmtno}'!=""){
					plipmt='${entity.applys[0].plipmtno}';
				}else if('${entity.applys[1].plipmtno}'!=""){
					plipmt='${entity.applys[1].plipmtno}';
				}else if('${entity.applys[2].plipmtno}'!=""){
					plipmt='${entity.applys[2].plipmtno}';
				}
				//创建继承
				if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("plipmtno,")  ) { %>
				if('${apply.plipmtno}'!=""){
					plipmt='${apply.plipmtno}';
				}
				
				<% } %> 
				}
				
				$("#plipmtno${id_suffix}").combobox('select',plipmt); 
				
			}
		});
	  //产品线校验
	  $("#prodlineno${id_suffix}").combobox({
			/* url : [],
			method : "post",
			valueField : 'value',
			textField : 'text', */
			editable:false,
			required:true,
			missingMessage:"请选择产品线",
			onSelect: function(rec){
				
				
				//隐藏域赋值
				$("#prodlineno1${id_suffix}").val(rec.value);
				$("#prodlineno2${id_suffix}").val(rec.value);
				
				//修改下拉框赋值
				if($("#productSelEdit${id_suffix}").length > 0){
					//清空下拉框值，实现强级联
					$('#productSelEdit${id_suffix}').combobox("clear");
			    	$('#productSelEdit${id_suffix}').combobox('reload', '/product/comboboxdata/listWithEng?type=PP&code='+rec.value+'&sub_code=' + $('#productSelEdit${id_suffix}').combobox("getValue")); 
			    	//赋值
			    	$('#productSelEdit${id_suffix}').combobox("select",'${entity.applys[1].productno}');
				}
				//停用下拉框赋值
				if($("#productnoDel${id_suffix}").length > 0){
					//清空下拉框值，实现强级联
					$('#productnoDel${id_suffix}').combobox("clear");
			    	$('#productnoDel${id_suffix}').combobox('reload', '/product/comboboxdata/listWithEng?type=PP&code='+rec.value+'&sub_code=' + $('#productnoDel${id_suffix}').combobox("getValue")); 
			    	$('#productnoDel${id_suffix}').combobox("select",'${entity.applys[2].productno}');
				}
				//财务产品下拉框赋值
				if($("#fproductno${id_suffix}").length > 0){
						//清空下拉框值，实现强级联
						$('#fproductno${id_suffix}').combobox("clear");
				    	$('#fproductno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=FP&code='+rec.value+'&sub_code=' + $('#productnoDel${id_suffix}').combobox("getValue")); 
				    	$('#fproductno${id_suffix}').combobox("select",'${entity.applys[0].fproductno}');
				}
				//产品类型下拉赋值
				/* if($("#fproductno${id_suffix}").length > 0){
			    	$('#fproductno${id_suffix}').combobox('reload', '/product/comboboxDicdata/list?type=4'); 
				} */
				
			},
			onLoadSuccess: function () {
				var prodline="";
				if('${entity.applys[0].prodlineno}'!=""){
					prodline='${entity.applys[0].prodlineno}';
				}else if('${entity.applys[1].prodlineno}'!=""){
					prodline='${entity.applys[1].prodlineno}';
				}else if('${entity.applys[2].prodlineno}'!=""){
					prodline='${entity.applys[2].prodlineno}';
				}
				
				//创建继承
					if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("prodlineno,")  ) { %>
				if('${apply.prodlineno}'!=""){
					prodline='${apply.prodlineno}';
				}
				
				<% } %> 
					}
				
					var allData=$("#prodlineno${id_suffix}").combobox("getData");
					for (var i = 0; i < allData.length; i++) {
						if (prodline == allData[i]["value"]) {
		                    $("#prodlineno${id_suffix}").combobox('select',prodline); 
		                    break;
		          		 }

					}
					//$("#prodlineno${id_suffix}").combobox('select',prodline); 
			}
		});
	  if($("#producttypeno${id_suffix}").length > 0){
	  $("#producttypeno${id_suffix}").combobox({
			/* url : '/product/comboboxDicdata/list?type=4',
			method : "post",
			valueField : 'value',
			textField : 'text',
			editable:false,
			selected : 'selected', */
			onLoadSuccess: function () {
				$("#producttypeno${id_suffix}").combobox('select','${entity.applys[0].producttypeno}'); 
			}
		});	
	  }
	  
	  //财务编码
	   $("#fproductno${id_suffix}").combobox({
			/* url : [],
			method : "post",
			valueField : 'value',
			textField : 'text', */
			 editable:false, 
			onSelect: function(rec){
						
			},
			onLoadSuccess: function () {
				
			}
		});

	  //修改 列赋值
	  $("#productSelEdit${id_suffix}").combobox({
			/* url : [],
			method : "post",
			valueField : 'value',
			textField : 'text', */
			editable:false, 
			onSelect: function(rec){
				//要修改的产品赋值
				if('${showStatus}'=="add"||"${currentNode=='userTask1' && isHandler || currentNode == 'editable'}"=="true"){
				 $("#editproductno${id_suffix}").textbox("setValue",rec.value);
				 $("#editproductoldno${id_suffix}").textbox("setValue",rec.value);
				$("#editproductold${id_suffix}").textbox('setValue',rec.text.indexOf(' | ')!=-1?rec.text.split(' | ')[0]:"");
				$("#editengproductold${id_suffix}").textbox('setValue',rec.text.indexOf(' | ')!=-1?rec.text.split(' | ')[1]:"");
				$("#productnow${id_suffix}").textbox('setValue',rec.text.indexOf(' | ')!=-1?rec.text.split(' | ')[0]:"");
				$("#engproductnow${id_suffix}").textbox('setValue',rec.text.indexOf(' | ')!=-1?rec.text.split(' | ')[1]:""); 
				}
				
			},
			onLoadSuccess: function () {
				$("#productSelEdit${id_suffix}").combobox('select','${entity.applys[1].productno}');
				$("#productnow${id_suffix}").textbox('setValue','${entity.applys[1].product}');
				$("#engproductnow${id_suffix}").textbox('setValue','${entity.applys[1].engproduct}'); 
				$("#productSelEdit${id_suffix}").unbind("onLoadSuccess"); 
			}
		});
	  
	  //停用 列赋值
	  $("#productnoDel${id_suffix}").combobox({
			/* url : [],
			method : "post",
			valueField : 'value',
			textField : 'text', */
			 editable:false, 
			onSelect: function(rec){
				//要修改的产品赋值
				$("#delproductno${id_suffix}").textbox("setValue",rec.value);
				 $("#delproductname${id_suffix}").textbox('setValue',rec.text.indexOf(' | ')!=-1?rec.text.split(' | ')[0]:"");
				 $("#delengproduct${id_suffix}").textbox('setValue',rec.text.indexOf(' | ')!=-1?rec.text.split(' | ')[1]:"");
						
			},
			onLoadSuccess: function () {
				$("#productnoDel${id_suffix}").combobox('select','${entity.applys[2].productno}'); 
			}
		});
	  
	  //根据不同状态展示不同信息  
	  //创建流程时 隐藏与流程无关的信息
	  
	  if("${(currentNode=='userTask1' && isHandler) || (currentNode == 'editable'&& isHandler)}"=="true"){
		  $("#ipmtSuggestion${id_suffix}").textbox({"readonly":true});
		  $("#ipmtCheckDiv${id_suffix}").hide();
		    $("#ipmtSuggestionDiv${id_suffix}").hide();
			 $("#agree${id_suffix}").hide();
			 $("#disagree${id_suffix}").hide();
			 if("${isChange}"=='true'){
				 
			 }else{
			 $("#assignDesc${id_suffix}").hide();
			 $("#editUser${id_suffix}").hide();
			 }
			 
	  }else{
		  
		  if('${showStatus}'=="add"){
			 
		  }else{
		  $("#addproduct${id_suffix}")._propAttr("disabled","disabled");
	      $("#editproduct${id_suffix}")._propAttr("disabled","disabled");
		  $("#delproduct${id_suffix}")._propAttr("disabled","disabled");
		  $('#prodlineno${id_suffix}').combobox({readonly:true});
		  $('#plipmtno${id_suffix}').combobox({readonly:true});
		  $("#remarks${id_suffix}").attr("readonly","readonly");
		  $("#sub${id_suffix}").hide();
		  $('#productSelEdit${id_suffix}').combobox({readonly:true});
		  $('#productnoDel${id_suffix}').combobox({readonly:true});
		  $("#productnow${id_suffix}").textbox({readonly:true});
		  $("#engproductnow${id_suffix}").textbox({readonly:true});
		  //新增字段设置为只读
		  $("#product${id_suffix}").textbox({readonly:true});
		  $("#engproduct${id_suffix}").textbox({readonly:true});
		  $("#fproductno${id_suffix}").combobox({readonly:true});
		  $("#producttypeno${id_suffix}").combobox({readonly:true});
		  $("#pmId${id_suffix}").textbox({readonly:true});
		  $("#popId${id_suffix}").textbox({readonly:true});
		  $("#cmoId${id_suffix}").textbox({readonly:true});
		  $("#pdeId${id_suffix}").textbox({readonly:true});
		  $("#fileIcon_${timestamp}").attr("onclick","showUeditorContent${timestamp}(1)");
		  }
		//IPMT执行秘书审核
		  if("${currentNode=='usertask3' && isHandler}"=="true"){
			  
		  }else{
			  
			  if("${currentNode=='usertask3'}"=="true"||"${isHandler}"=="false"||"${isHandler}"==""){
				  $("#ipmtSuggestion${id_suffix}").textbox({"readonly":true});
				  $("#agree${id_suffix}").hide();
					 $("#disagree${id_suffix}").hide();
					 if("${isChange}"=='true'){
						 
					 }else{
					 $("#assignDesc${id_suffix}").hide();
					 $("#editUser${id_suffix}").hide();
					 }
					 $("#ipmtCheckDiv${id_suffix}").hide();
			  }else{
				  $("#ipmtSuggestion${id_suffix}").textbox({"readonly":true});
				  $("#ipmtCheckDiv${id_suffix}").hide();
			     $("#ipmtSuggestionDiv${id_suffix}").hide();
				 $("#agree${id_suffix}").hide();
				 $("#disagree${id_suffix}").hide();
				 if("${isChange}"=='true'){
					 
				 }else{
				 $("#assignDesc${id_suffix}").hide();
				 $("#editUser${id_suffix}").hide();
				 }
				 
			  }
		  }
	  }
	  
	  //修改当前处理人
	  $("#editUser${id_suffix}").bind('click', function(){
          var userId =  $("#assignDesc${id_suffix}").val();
          if ($(this).linkbutton('options').disabled == false) {
        	  $("#editUser${id_suffix}").linkbutton('disable');
          $.post("/basicinfo/productApply/changeResponsible",{id:"${entity.id}",taskId:"${taskId}",userId:userId},function (result) {
        	  eval("var obj = " + result);	
        	  if(obj.status == 200){
        		  if(window.location.href.indexOf('eipLogin') > -1){
                 	 var data = {};
                 	 data.Code = 11;
                 	 data.Msg = "审批成功";
                 	 PM.send(top.window.parent, "fromSource", data); 
                 	 }else{
                  $.messager.alert("提示","修改当前处理人成功","");
                  $("#editUser${id_suffix}").linkbutton('enable');
                  var tab = $('#mainUrl').tabs('getSelected');
                  tab.panel('refresh', '/basicinfo/productApply/edit/${entity.id}');
                 	 }
              }else{
                  //alert(obj.msg);
            	  if(window.location.href.indexOf('eipLogin') > -1){
	               		var data = {};
             	 		data.Code = 0;
             	 		data.Msg = "审批失败";
  	           	 PM.send(top.window.parent, "fromSource", data);
          			 
          		 }else{
                  $.messager.alert("提示",obj.msg,"");
                  $("#editUser${id_suffix}").linkbutton('enable');
          		 }
              }
          });
          }
          
	  });
	
	  
});

//新增产品显示 隐藏
$("#addproduct${id_suffix}").click(function(){
	if(this.checked==true){
		// 重新加载easyui样式
		$("#addTab${id_suffix}").toggle();
		$.parser.parse($("#addTab${id_suffix}")); 
		//校验必填项
		 $("#product${id_suffix}").textbox({required:true,missingMessage:'产品的中文名称不能为空'});
		$("#engproduct${id_suffix}").textbox({required:true,missingMessage:'产品的英文名称不能为空'});
		$("#fproductno${id_suffix}").combobox({required:true,missingMessage:'请选择对应的财务编码与名称'});
		$("#producttypeno${id_suffix}").combobox({required:true,missingMessage:'请选择产品类型'});			
 	
	}else{
		//隐藏新增区域
		$("#addTab${id_suffix}").toggle();
		//去掉校验
		 $("#product${id_suffix}").textbox({required:false,missingMessage:'产品的中文名称不能为空'});
		$("#engproduct${id_suffix}").textbox({required:false,missingMessage:'产品的英文名称不能为空'});
		$("#fproductno${id_suffix}").combobox({required:false,missingMessage:'请选择对应的财务编码与名称'});
		$("#producttypeno${id_suffix}").combobox({required:false,missingMessage:'请选择产品类型'});
		
	}
}); 

//同意  录入对象表   不同意 返回
function check${id_suffix}(result,name){
	/* $.messager.confirm('', '确认是否操作?', function(r){
        if(r){ */
        	$("#mainUrl").tabs("loading","处理中...");
            var paramsuggestion = $("#ipmtSuggestion${id_suffix}").val();
            if(result=="0"&&(paramsuggestion==""||paramsuggestion==null)){
            	$("#mainUrl").tabs("loaded");
           	 $.messager.alert('提示',"审批意见不能为空！！！");
           	 return false;
           }
            var param = {
                "checkDate":"ipmtFilltime",
                "checkPerson":"ipmtFillname",
                "checkResult":result,
                "checkResultForRole":{
                    "resultName":"checkresult",
                    "resultValue":result
                },
                "checkOpinionForRole":{
                    "opinionName":"ipmtSuggestion",
                    "opinionValue":paramsuggestion
                }
            };
            $.ajax({
                type: "POST",
                url: "/basicinfo/productApply/check/${entity.id}/${taskId}",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(param),
                dataType: "json",
                success: function (message) {
                    if (message.status == 200) {
                    	if(window.location.href.indexOf('eipLogin') > -1){
                          	 var data = {};
                          	 data.Code = 11;
                          	 data.Msg = "审批成功";
                          	 PM.send(top.window.parent, "fromSource", data); 
                          	 }else{
                    	$("#mainUrl").tabs("loaded");
                      //  $.messager.alert("提示","审批成功","");
                        var tab = $('#mainUrl').tabs('getSelected');
                       // if(result=="0"){
							var index = $('#mainUrl').tabs('getTabIndex', tab);
							$("#mainUrl").tabs("close", index)
                       /*  }else{
                        	//tab.panel('refresh', '/basicinfo/productApply/edit/${entity.id}');
                        	var tab = $('#mainUrl').tabs('getSelected');
                  			 var index = $('#mainUrl').tabs('getTabIndex', tab);
                  			 $("#mainUrl").tabs("close", index)
                               $('#mainUrl').tabs(
                  						'add',
                  						{
                  							title : "修改产品信息",
                  							href : '/basicinfo/productApply/edit/${entity.id}',
                  							closable : true
                  						}); 
                        } */
                          }
                    }else{
                        //alert("审批失败");
                    	 if(window.location.href.indexOf('eipLogin') > -1){
  		               		var data = {};
                    	 		data.Code = 0;
                    	 		data.Msg = "审批失败";
         	           	 PM.send(top.window.parent, "fromSource", data);
                 			 
                 		 }else{
                        $.messager.alert("提示","审批失败","");
                        $("#mainUrl").tabs("loaded");
                 		 }
                    }
                    $("#mainUrl").tabs("loaded");
                },
                error: function (message) {
                    //alert("审批失败");
                    $.messager.alert("提示","审批失败","");
                    $("#mainUrl").tabs("loaded");
                }
            });
     /*    }
        
	  }); */
}

//全部折叠 显示
function changeMenue${id_suffix}(a){
    if(a=='fold'){
        $("[id^='SUBFORM_T00000'][id$='${id_suffix}']").hide();
        $("#divSub${id_suffix} .subfild").css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
    }else if(a=='expand'){
        $("[id^='SUBFORM_T00000'][id$='${id_suffix}']").show();
        $("#divSub${id_suffix} .subfild").css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
     // 重新加载easyui样式
    	$.parser.parse($("[id^='SUBFORM_T00000'][id$='${id_suffix}']")); 
    }
}
//查看已有产品清单
function selProduct${id_suffix}(){
	if ($('#mainUrl').tabs('exists', "研发产品版本信息")) {
	       $('#mainUrl').tabs('select', "研发产品版本信息");
	     } else { 
	    	 $('#mainUrl').tabs('add', {
	         title : "研发产品版本信息",
	         href : 'product/pages/pp',
	         closable : true
	       });
	     }
}
//跳转产品编码申请页面
function applyProductCode${id_suffix}(){
	//20191121 lkf7579注释 产品编码可以打开多个页签
	/* if ($('#mainUrl').tabs('exists', "产品编码申请")) {
	       $('#mainUrl').tabs('select', "产品编码申请");
	     } else { 
	    	 $('#mainUrl').tabs('add', {
	         title : "产品编码申请",
	         href : 'flowable/productCodeApply/add?applyDep=1&applyType=1&applyCount=1',
	         closable : true
	       });
	     } */
	 $('#mainUrl').tabs('add', {
         title : "产品编码申请",
         href : 'flowable/productCodeApply/add?applyDep=1&applyType=1&applyCount=1',
         closable : true
       });
}

//保存草稿
function saveMenue${id_suffix}(){
	$('#btnQuit${id_suffix}').linkbutton('disable');
	 $('#productApply${id_suffix}').form('submit', {
         url: '/basicinfo/productApply/save',
         onSubmit: function(){
        	 //确认哪些需要保存
        	 //appytype
        	 if( $("#addproduct${id_suffix}")._propAttr('checked')){
        		 $("#addproduct${id_suffix}").val("1");
        	 }
			 if( $("#editproduct${id_suffix}")._propAttr('checked')){
				 $("#editproduct${id_suffix}").val("2");
        	 }
 			if( $("#delproduct${id_suffix}")._propAttr('checked')){
 				$("#delproduct${id_suffix}").val("3");
 			}
            /*  var isValid = $(this).form('validate');

             if (!isValid){
            	 $.messager.alert("提示","验证不通过,请检查录入信息！！！","");
            	 $('#btnQuit${id_suffix}').linkbutton('enable');	
             }
             return isValid; */
         },
         success: function(data){
        	 eval("var obj = " + data);		
        	 
				if(obj!=0){
        	 $('#btnQuit${id_suffix}').linkbutton('enable');
        	 var tab = $('#mainUrl').tabs('getSelected');
			 var index = $('#mainUrl').tabs('getTabIndex', tab);
			 $("#mainUrl").tabs("close", index)
				
        	 
             $('#mainUrl').tabs(
						'add',
						{
							title : "修改产品信息",
							href : '/basicinfo/productApply/edit/'+obj,
							closable : true
						}); 
             
				}else{
					//alert("保存失败");
					$.messager.alert("提示","保存失败","");
					$('#btnQuit${id_suffix}').linkbutton('enable');	
				}
         }
     });
}

//提交
function sub${id_suffix}(){
 /* $.messager.confirm('', '确认是否提交?', function(r){
    if (r){ */
    	$('#sub${id_suffix}').linkbutton('disable');
    	$("#mainUrl").tabs("loading","处理中...");
        $('#productApply${id_suffix}').form('submit', {
            url: '/basicinfo/productApply/submit',
            onSubmit: function(){
                debugger;
                if($("#applyType_1_${timestamp}").val() == "" || $("#applyType_1_${timestamp}").val() == null){
                    $("#mainUrl").tabs("loaded");
                    $.messager.alert("提示","依据材料不能为空！！！","");
                    $('#sub${id_suffix}').linkbutton('enable');
                    return false;
                }
            	if(!$("#addproduct${id_suffix}")._propAttr('checked')&&!$("#editproduct${id_suffix}")._propAttr('checked')&&!$("#delproduct${id_suffix}")._propAttr('checked'))
            	{
            		 $("#mainUrl").tabs("loaded");
            		 $.messager.alert("提示","申请信息不能为空！！！","");
            		 $('#sub${id_suffix}').linkbutton('enable');
            		 return false;
            	} 
            	if( $("#addproduct${id_suffix}")._propAttr('checked')){
            		 $("#addproduct${id_suffix}").val("1");
            			//校验必填项
            			if($("#product${id_suffix}").textbox("getValue")==""){
            		 $("#product${id_suffix}").textbox({required:true,missingMessage:'产品的中文名称不能为空'});
            			}
            			if($("#engproduct${id_suffix}").textbox("getValue")==""){
            		$("#engproduct${id_suffix}").textbox({required:true,missingMessage:'产品的英文名称不能为空'});
            			}
            			if($("#fproductno${id_suffix}").combobox("getValue")==""){
            		$("#fproductno${id_suffix}").combobox({required:true,missingMessage:'请选择对应的财务编码与名称'});
            			}
            			if($("#producttypeno${id_suffix}").combobox("getValue")==""){
            		$("#producttypeno${id_suffix}").combobox({required:true,missingMessage:'请选择产品类型'});	
            			}
            		 if($("#pmId${id_suffix}").val()==""||$("#pmId${id_suffix}").val()==null){
    					 $("#mainUrl").tabs("loaded");	
    					 $.messager.alert("提示","产品经理不能为空！！！","");
    					 $('#sub${id_suffix}').linkbutton('enable');
                		 return false;
    				 }
    				 if($("#popId${id_suffix}").val()==""||$("#popId${id_suffix}").val()==null){
    					 $("#mainUrl").tabs("loaded");	
    					 $.messager.alert("提示","产品POP不能为空！！！","");
    					 $('#sub${id_suffix}').linkbutton('enable');
                		 return false;
    				 }
    				 if($("#cmoId${id_suffix}").val()==""||$("#cmoId${id_suffix}").val()==null){
    					 $("#mainUrl").tabs("loaded");	
    					 $.messager.alert("提示","产品配置经理不能为空！！！","");
    					 $('#sub${id_suffix}').linkbutton('enable');
                		 return false;
    				 }
    				 if($("#pdeId${id_suffix}").val()==""||$("#pdeId${id_suffix}").val()==null){
    					 $("#mainUrl").tabs("loaded");	
    					 $.messager.alert("提示","产品数据经理不能为空！！！","");
    					 $('#sub${id_suffix}').linkbutton('enable');
                		 return false;
    				 }
            	 }
    			 if( $("#editproduct${id_suffix}")._propAttr('checked')){
    				 $("#editproduct${id_suffix}").val("2");
					//校验修改的内容是否没有变更
    				 if($("#editproductold${id_suffix}").val()==$("#productnow${id_suffix}").val()){
    					 $("#mainUrl").tabs("loaded");	
    					 $.messager.alert("提示","要修改的原中文名称和新中文名称不能一致！！！","");
    					 $('#sub${id_suffix}').linkbutton('enable');
                		 return false;
    				 }
    				 
            	 }
     			if( $("#delproduct${id_suffix}")._propAttr('checked')){
     				$("#delproduct${id_suffix}").val("3");
     				if($("#editproduct${id_suffix}")._propAttr('checked')){
     				if($("#editproductno${id_suffix}").val()==$("#delproductno${id_suffix}").val()){
   					 $("#mainUrl").tabs("loaded");	
   					 $.messager.alert("提示","要修改的产品和停用的产品不能一致！！！","");
   					$('#sub${id_suffix}').linkbutton('enable');
               		 return false;
   				    }
     				}
     			}
     			
     			
                var isValid = $(this).form('validate');
                if (!isValid){
                    $("#mainUrl").tabs("loaded");	
                    $('#sub${id_suffix}').linkbutton('enable');
                }
                return isValid;	
            },
            success: function(result){
            	  var obj = $.parseJSON(result);
                  if(obj.status==200){
                	 // $.messager.alert("提示",obj.message,"");
                var tab = $('#mainUrl').tabs('getSelected');
				var index = $('#mainUrl').tabs('getTabIndex', tab);
				$("#mainUrl").tabs("close", index)
                $("#mainUrl").tabs("loaded");	
				$('#sub${id_suffix}').linkbutton('enable');
                  }else{
                	  $("#mainUrl").tabs("loaded");
                	  //alert(obj.message);
                	  $.messager.alert("提示",obj.message,"");
                	  $('#sub${id_suffix}').linkbutton('enable');
                  }
            }
        });
  /*   }
});  */
}


//删除当前流程
function delProcess${id_suffix}(id){
	 $.ajax({
           type: "POST",
           url: "/basicinfo/productApply/delProcess",
           data:{id:id},
           async: false,
           success: function (result) {
        	   var obj = $.parseJSON(result);
        	   if(obj.success){
        	   
          	        var tab = $('#mainUrl').tabs('getSelected');
  			        var index = $('#mainUrl').tabs('getTabIndex', tab);
  			        $("#mainUrl").tabs("close", index)
        	   }else{
        		   $.messager.alert("提示",obj.message,"");
        		   $('#btnDel${id_suffix}').linkbutton('enable');
        	   }
           }
	 }); 
}

</script>
</body>
</html>
