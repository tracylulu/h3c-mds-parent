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
    <title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width:100%">
<div class="prBelowC" id="prBelowC${id_suffix}">


 <div class="toptoolbar" style="position:fixed;z-index:9000;">
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
          <a href="#" id="btnCopy${id_suffix}" class="easyui-linkbutton" plain="true" onclick="copyLink('/basicinfo/prBelowApply/edit/${entity.id}','修改产品R级以下基本信息','${entity.id}','${copyTitle}')"
              data-options="iconCls:'fa fa-files-o'">复制链接</a>
               <c:if test="${((currentNode=='userTask1' && isHandler) || (currentNode == 'editable')=='true')|| showStatus == 'add'}">
                <c:if test="${entity.status==0||entity.status==-1}">
                 <a href="#" id="btnDel${id_suffix}" class="easyui-linkbutton" plain="true" onclick="delProcess${id_suffix}('${entity.id}');"
              data-options="iconCls:'fa fa-files-o'">废弃</a>
           </c:if>
           </c:if>
 </div>
 <br/><br/>
 <p >
			<span  class="title191030" >研发产品R级以下基本信息修改申请表</span>
 </p>
  <div class="toptoolbarhr" style=""></div>
 
 
   <form method='post' name='prBelowApply' id='prBelowApply${id_suffix}' style="width:100%">
    <input id="id${id_suffix}" name="id" value="${entity.id}" type="hidden"/>
    <input id="tempTime${id_suffix}" name="tempTime" value="${id_suffix}" type="hidden"/>
    <!-- 隐藏对象类型 区别是哪个对象 -->
     <input id="type00${id_suffix}" name="baseObjects[0][0].type" value="${entity.baseObjects[0][0].type}" type="hidden"/>
     <input id="type01${id_suffix}" name="baseObjects[0][1].type" value="${entity.baseObjects[0][1].type}" type="hidden"/>
     <input id="type02${id_suffix}" name="baseObjects[0][2].type" value="${entity.baseObjects[0][2].type}" type="hidden"/>
     <input id="type10${id_suffix}" name="baseObjects[1][0].type" value="${entity.baseObjects[1][0].type}" type="hidden"/>
     <input id="type11${id_suffix}" name="baseObjects[1][1].type" value="${entity.baseObjects[1][1].type}" type="hidden"/>
     <input id="type12${id_suffix}" name="baseObjects[1][2].type" value="${entity.baseObjects[1][2].type}" type="hidden"/>
     <input id="type20${id_suffix}" name="baseObjects[2][0].type" value="${entity.baseObjects[2][0].type}" type="hidden"/>
     <input id="type21${id_suffix}" name="baseObjects[2][1].type" value="${entity.baseObjects[2][1].type}" type="hidden"/>
     <input id="type22${id_suffix}" name="baseObjects[2][2].type" value="${entity.baseObjects[2][2].type}" type="hidden"/>
     <input id="type30${id_suffix}" name="baseObjects[3][0].type" value="${entity.baseObjects[3][0].type}" type="hidden"/>
     <input id="type31${id_suffix}" name="baseObjects[3][1].type" value="${entity.baseObjects[3][1].type}" type="hidden"/>
     <input id="type32${id_suffix}" name="baseObjects[3][2].type" value="${entity.baseObjects[3][2].type}" type="hidden"/>
     <input id="type40${id_suffix}" name="baseObjects[4][0].type" value="${entity.baseObjects[4][0].type}" type="hidden"/>
     <input id="type41${id_suffix}" name="baseObjects[4][1].type" value="${entity.baseObjects[4][1].type}" type="hidden"/>
     <input id="type42${id_suffix}" name="baseObjects[4][2].type" value="${entity.baseObjects[4][2].type}" type="hidden"/>
     <input id="type50${id_suffix}" name="baseObjects[5][0].type" value="${entity.baseObjects[5][0].type}" type="hidden"/>
     <input id="type51${id_suffix}" name="baseObjects[5][1].type" value="${entity.baseObjects[5][1].type}" type="hidden"/>
     <input id="type52${id_suffix}" name="baseObjects[5][2].type" value="${entity.baseObjects[5][2].type}" type="hidden"/>
    <input id="instanseId${instanseId}" name="instanseId" value="${entity.instanseId}" type="hidden"/>
    <!-- >隐藏判断下拉赋值 -->
    <input type="hidden" id="btn_test${id_suffix}" style="display:none"/>
               <input type="hidden" id="btn_test1${id_suffix}" style="display:none"/>
               <input type="hidden" id="btn_test2${id_suffix}" style="display:none"/>
             <div style="font-size:13px;width:93%;margin: 0px 20px" >
                <table cellspacing="0" style="width:100%;margin:auto;border-collapse:collapse;border-spacing:0;border-left:0px solid #888;border-right:0px solid #888;border-top:0px solid #888;;border-bottom:0px solid #888">
                 <tr>
                                <td width="25%">所处环节：&nbsp;
                                    <span style="color:#3A5FCD" id="status${id_suffix}" name="status" >${entity.statusname}</span>  &nbsp;&nbsp;
                                <input name="status" id="hidStatus${id_suffix}" value="${entity.status}" type="hidden"/>
                                </td>
                                <td width="25%">&nbsp;&nbsp;当前责任人：&nbsp;&nbsp;&nbsp;&nbsp;
                                   <span style="color:#3A5FCD" id="responsible${id_suffix}" ><ibds:userAccount account="${entity.responsible}"/></span>  &nbsp;&nbsp;
                                <input name="responsible" id="hidResponsible${id_suffix}" value="${entity.responsible}" type="hidden"/>
                                </td>
                              
                                <td width="25%">&nbsp;&nbsp;当前状态描述：
                                  <span style="color:#3A5FCD" id="statusName${id_suffix}" >${entity.statusname}</span>  &nbsp;&nbsp;
                                <input name="statusname" id="hidStatus${id_suffix}" value="${entity.statusname}" type="hidden"/>
                                </td>
                                 <td width="20%">&nbsp;&nbsp;单号：
                                  <span style="color:#3A5FCD" id="applycode${id_suffix}" >${entity.applycode}</span>  &nbsp;&nbsp;
                               <input name="applycode" id="hidCode${id_suffix}" value="${entity.applycode}" type="hidden"/>
                                </td>
                            </tr>
                </table>
        </div>
        <br>
        <div  style="margin: 0px 20px" id="divSub${id_suffix}">
        <h2 class="subfild" id="T00000_1${id_suffix}" >
        <span>1.CMO提出修改申请</span>
        </h2>
           
        <div id="SUBFORM_T00000_1${id_suffix}" class="textBoxFrom">
          <div style="font-size:13px;width:100%">
          <div style="margin:1%;font-size:13px;width:100%">
          <!--  <span style="color:#f25aef;font-size:15px;;margin:auto" width="100%">请先选择IPMT、研发产品线、产品信息：</span> -->
               <table class="product" id="tabPr${id_suffix}" border="1" cellspacing="0" style="width:98%">
                <tr>
                <td width=22%" align="right">IPMT:
                <input name="baseLines[0].plipmtno" style="width:70%;height:30px;margin-left:15px!important;" id="plipmtno${id_suffix}" data-options="valueField: 'value', textField: 'text',  
								url: '/product/comboboxdata/Releaselist?type=PI&UpperCode=&code=',required:true,missingMessage:'请选择IPMT'"
									class="easyui-combobox"  value="${entity.baseLines[0].plipmtno}"/>
              </td>
                <td width="24%" align="right">研发产品线:
                <input name="baseLines[0].prodlineno" style="width:70%;height:30px;" id="prodlineno${id_suffix}" value="${entity.baseLines[0].prodlineno}" /></td>
                <td width="20%" align="right">产品:
                <input name="baseLines[0].productno" style="width:70%;height:30px;" id="productno${id_suffix}" value="${entity.baseLines[0].productno}" />
              </td>
              
                <td width="22%" align="right">产品V级:
                <input name="baseLines[0].versionno" style="width:70%;height:30px;" id="versionno${id_suffix}" value="${entity.baseLines[0].versionno}" />
              </td>
              </tr>
              <tr>
                <td  width="22%" align="right">产品R级:
                <input name="baseLines[0].releaseno" style="width:70%;height:30px;" id="releaseno${id_suffix}" value="${entity.baseLines[0].releaseno}" />
                </td>
                <td>
              <a href="#" class="easyui-linkbutton" name="copyComboboxRelease"  id="copyComboboxRelease${id_suffix}"  onclick="selectComboboxProject${id_suffix}();">选择版本</a><%-- onclick="selectComboboxProject${id_suffix}();" --%>
              
              </td>
              <td colspan="5"></td>
              </tr>
                </table>

              </div> 
                <h2 class="subfild" id="T00000_01${id_suffix}" >
            	<span>基线版本信息修改</span>
               </h2>
           
       		 <div id="SUBFORM_T00000_01${id_suffix}" >
        	 	<jsp:include page="baseLineAdd.jsp"/>
             </div>
                
                <h2 class="subfild" id="T00000_02${id_suffix}" >
            	<span>特性信息的修改</span>
                </h2>
                <div id="SUBFORM_T00000_02${id_suffix}" >
                <jsp:include page="featureAdd.jsp"/>
                </div>
               
               <h2 class="subfild" id="T00000_03${id_suffix}" >
            	<span>子特性信息的修改</span>
                </h2>
                <div id="SUBFORM_T00000_03${id_suffix}" style="display:none;width:100%">
                <jsp:include page="subFeatureAdd.jsp"/>
                </div>
               
               <h2 class="subfild" id="T00000_04${id_suffix}"  >
            	<span>项目组信息的修改</span>
                </h2>
                <div id="SUBFORM_T00000_04${id_suffix}" style="display:none">
                <jsp:include page="teamAdd.jsp"/>
                </div>
               
               
                 <h2 class="subfild" id="T00000_05${id_suffix}" >
            	<span>子系统信息的修改</span>
                </h2>
                <div id="SUBFORM_T00000_05${id_suffix}" style="display:none">
               <jsp:include page="subSystemAdd.jsp"/>
                </div>
               
               
               <h2 class="subfild" id="T00000_06${id_suffix}" >
            	<span>模块信息的修改</span>
                </h2>
                <div id="SUBFORM_T00000_06${id_suffix}" style="display:none;width:100%">
                <jsp:include page="moduleAdd.jsp"/>
                </div>
               
                <h2 class="subfild" id="T00000_07${id_suffix}" >
            	<span>模块版本信息的修改</span>
                </h2>
                <div id="SUBFORM_T00000_07${id_suffix}" style="display:none;width:100%">
                <jsp:include page="moduleVersionAdd.jsp"/>
                </div>
                <br>
               抄送人员&nbsp;&nbsp;:&nbsp;&nbsp;<input name="copyto" style="width:54%;height:30px;margin-left:10px;" id="copyto${id_suffix}" value="${entity.copyto}" class="auto_selusers_true"/><br>
                <br>
                备 &nbsp;&nbsp;&nbsp;注&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;<input name="remark" style="width:54%;height:30px;margin-left:10px;" id="remarks${id_suffix}" value="${entity.remark}" 
				 type=""  data-options="multiline:true" class="easyui-textbox"/><br><br>
				 <div>
				 请指定该产品的配置经理:<input name="sendto1" style="width:45%;height:30px;" id="cmo${id_suffix}" value="${entity.sendto1}" class="auto_selusers_false"/>
				 <input id="hidCmo${id_suffix}" type="hidden" value="${entity.sendto1}"/>
				 <c:if test="${((currentNode=='userTask1' && isHandler) || (currentNode == 'editable'&& isHandler)=='true')|| showStatus == 'add'}">
				 <a href="#" class="easyui-linkbutton" onclick="subsave${id_suffix}()" id="subsave${id_suffix}" style="color:white;background-color:#3498DB;height:30px; margin:0PX 4% 0px 1%; ">提交</a>
				</c:if>
				 <span  style="font-size:14px;">签名：<ibds:userAccount account="${entity.cmoFillname}"/></span><span  style="font-size:14px;margin-left:6%;">时间:<fmt:formatDate value="${entity.cmoFilltime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
				 </div>
				 <br>
				 <hr>
          </div>
      
        </div>
        <h2 class="subfild" id="T00000_2${id_suffix}" >
            	<span>2.产品配置经理审核</span>
            </h2>
              <div id="SUBFORM_T00000_2${id_suffix}">
              <div style="display:inline-block;width:100%">
                                       审批意见:&nbsp;&nbsp; <%-- <div id="ipmtSuggestionDiv${id_suffix}">  --%>
                <input id="pdtSuggestion${id_suffix}" class="easyui-textbox" name="pdtSuggestion" style="width:45%;height:30px;" value="${entity.pdtSuggestion}" /><!-- </div> --> 
                                     
                <c:if test="${currentNode=='userTask3' && isHandler}">
				<a href="#" class="easyui-linkbutton" onclick="check${id_suffix}('1','check')" id="agree${id_suffix}" style="color:white;background-color:#3498DB;height:30px; ">同意</a>
				<a href="#" class="easyui-linkbutton" onclick="check${id_suffix}('0','check')" id="disagree${id_suffix}" style="color:#3498DB;background-color:white;height:30px;">驳回</a>
				</c:if>
				<span  style="font-size:14px; margin-left: 4%">签名：<ibds:userAccount account="${entity.pdtFillname}"/></span><span  style="font-size:14px;margin-left:6%;">时间:<fmt:formatDate value="${entity.pdtFilltime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
             </div> 
              </div>
              <h2 class="subfild" id="T00000_3${id_suffix}" >
            	<span>管理区段</span>
            </h2>
              <div id="SUBFORM_T00000_3${id_suffix}" style="display:none">
           <!--    <div style="float:left;width:30%;">
                <span>&nbsp;&nbsp;&nbsp;处理人：</span></div> -->
                 <div style="height:10%;">处理人：
                <c:if test="${isChangeUser==true}">  
                
               
                <input id="assignDesc${id_suffix}"  class="auto_selusers_false" style="width:300px!important"/>
                    <input id="assign"   type="hidden"/>
               
                  
                        <a href="javascript:void(0)" class="easyui-linkbutton" id="editUser${id_suffix}" style="color:white;background-color:#3498DB;margin-top:0px;">修改当前处理人</a>
                   
                    </c:if>
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

    <br><hr>
              </div>
        </div>
        
   </form>
   <br><br>
   <div id="winparentversion${id_suffix}" title="父版本" style="display:none; width: 1100px;min-height:600px!important;" class="winHeight">
   <input id="searchParas${id_suffix}" class="easyui-textbox" type="text"
				prompt="请输入搜索内容" style="width: 65%;" /> &nbsp; 
				<a id="btn${id_suffix}" href="#" class="easyui-linkbutton default" onclick="btnSearch${id_suffix}();">搜 索 </a>&nbsp;
   	<%-- <form id="selparentversion${id_suffix}" method="post"  style="height:90%;overflow-y:visible; "> --%>
   	
		     <table id="selparentversion${id_suffix}" style="width: 100%;height:450px!important;">   
	</table>
	<br><br><br><br>
	
<!-- 	</form>
	<br><br><br><br> -->
	</div>
	<br><br>
	 <div id="winparentrelease${id_suffix}" title="产品信息" style="display:none; width: 80%;min-height:60%!important;padding:0px 10px;margin:0px auto;"  class="winHeight">
	 <span style="height:28px;">项目状态:</span>&nbsp;<input id="projectStatu${id_suffix }" name="projectStatu"
				class="easyui-combobox ui-text" type="text" value="" 
				style="width: 120px;height:28px;" /> &nbsp; &nbsp; 
   	 <input id="searchParasRelease${id_suffix}" class="easyui-textbox" type="text"
				prompt="请输入搜索内容" style="width: 65%;height:28px;" /> &nbsp; 
				<a id="btnRelease${id_suffix}" href="#" class="easyui-linkbutton default" onclick="btnSearchRelease${id_suffix}();" style="height:28px;">搜 索 </a>&nbsp;
		     <table id="selparentrelease${id_suffix}" style="width: 100%;height:450px!important;">   
	</table>
	</div>
	
	 <div id="selectDivRelease${id_suffix}" title="选择版本" style="display:none; width: 40%;min-height:60%!important;padding:0px 10px;margin:0px auto;"  class="winHeight">
   	 请输入搜索关键字(不区分大小写):<input id="searchSelRelease${id_suffix}" class="easyui-validatebox textbox" type="text"
				prompt="请输入搜索内容" style="width: 65%;height:28px;margin:5px 5px;" /> 
				<br>
		     <table id="selTabRelease${id_suffix}" style="width: 100%;height:450px!important;">   
	</table>
	</div>
	</div>
<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css"/>
<style>
		.winHeight .datagrid-body {
			height: 450px!important;
		}
		.winHeight ::-webkit-scrollbar {
    width: 18px;
    height: 8px;
    }
    .winHeight .l-btn-plain .l-btn-text {
    padding:5px 15px;
    }
    .winHeight .easyui-linkbutton.l-btn:hover{
    color:white;background-color:#3498DB;
    }
    .winHeight .default.l-btn:hover{
    color:white;background-color:#3498DB;
    }
    
    .winHeight .l-btn-left:hover{
    color:white;background-color:#3498DB;
    }
    
    .winHeight .easyui-linkbutton .l-btn-text:hover{
    color:white;background-color:#3498DB;
    }
    
    
    .product .aLink a {color:#3498DB;background-color:white;height:24px!important;text-align:center;}
    
    .numSpan {margin:0px 15px;font-size:12px;}
    .msgShow {font-size:12px;margin-left:20px;color:#999999}

	</style>
<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="common/js/common.js"></script>
<script type="text/javascript" src="common/js/prBelowApply.js"></script>
<script type="text/javascript" src="common/js/prBelowApply_combobox.js"></script>
<script type="text/javascript">
//状态，为处理展开当前节点
var isExpandALl${id_suffix}=false;
var exeandAll_ID${id_suffix}='';
$(function(){
	//多个人员联想
	 if($("#prBelowC${id_suffix} input[class*='auto_selusers_true']").length>0){
   	 $("#prBelowC${id_suffix} input[class*='auto_selusers_true']").each(function(index,element){
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
	
	
	//选择版本 R版本状态
	//项目状态下拉框初始化
	$("#projectStatu${id_suffix }").combobox({
		valueField : 'statuValue',
		textField : 'statuText',
		panelHeight : 'auto',
		multiple:true,
		editable:false,
		formatter: function (row) {
			 var opts = $(this).combobox('options');
			 if(row.statuValue==""||row.statuValue=="undefined"||row.statuValue==null){
				 return "";
			 }
			 return '<input type="checkbox" class="combobox-checkbox"> ' + row[opts.textField]
		},  onSelect: function (row) {
			                    var opts = $(this).combobox('options');
			                    var el = opts.finder.getEl(this, row[opts.valueField]);
			                    el.find('input.combobox-checkbox')._propAttr('checked', true);
			                },
			                onUnselect: function (row) {
			                    var opts = $(this).combobox('options');
			                    var el = opts.finder.getEl(this, row[opts.valueField]);
			                    el.find('input.combobox-checkbox')._propAttr('checked', false);
			                }
	});
	
	var data = [];//创建数组
	//数组添加值
	data.push({
		"statuValue" : "在研",
		"statuText" : "在研"
	});
	data.push({
		"statuValue" : "终止",
		"statuText" : "终止"
	});
	
	data.push({
		"statuValue" : "挂起",
		"statuText" : "挂起"
	});
	data.push({
		"statuValue" : "无",
		"statuText" : "无状态"
	});
	$("#projectStatu${id_suffix }").combobox({
		data: data,
		onLoadSuccess:function(){
			$("#projectStatu${id_suffix }").combobox("select","在研");
		}});//下拉框加载数据
	
	//f9事件绑定  刷新新增 修改个数
	$('body').bind('keydown',function(event){
	if (event.keyCode == 120) {
	 //基线版本
	 if( $("#addproductbl${id_suffix}").prop("checked")){
			 $("#addblsum${id_suffix}").text($("#addobjectbl${id_suffix}").val().split(/\r?\n/).length);
		
	 }
	 if( $("#editproductbl${id_suffix}")._propAttr('checked')){
			 $("#editblsum${id_suffix}").text($("#editobjectnobl${id_suffix}").val().split(/\r?\n/).length);
		
	 }
	//搜索框绑定回车事件
		$('#searchParas${id_suffix }').textbox({
			inputEvents : $.extend({}, $.fn.textbox.defaults.inputEvents, {
				keypress : function test() {
					if (event.keyCode == 13) {
						//doSearch(); //回车搜索
						$("#btn${id_suffix }").click()
					}
				}
			})
		
		});
	//特性
	 if( $("#addproductft${id_suffix}")._propAttr('checked')){
			 $("#addftsum${id_suffix}").text($("#addobjectft${id_suffix}").val().split(/\r?\n/).length);
		
	 }
	 if( $("#editproductft${id_suffix}")._propAttr('checked')){
			 $("#editftsum${id_suffix}").text($("#editobjectnoft${id_suffix}").val().split(/\r?\n/).length);
		 
	 }
	
	//子特性
	 if( $("#addproductsf${id_suffix}")._propAttr('checked')){
		
			 $("#addsfsum${id_suffix}").text($("#addobjectsf${id_suffix}").val().split(/\r?\n/).length);
		 
	 }
	 if( $("#editproductsf${id_suffix}")._propAttr('checked')){
			 $("#editsfsum${id_suffix}").text($("#editobjectnosf${id_suffix}").val().split(/\r?\n/).length);
		 
	 }
	
	//项目组
	 if( $("#addproducttm${id_suffix}")._propAttr('checked')){
		$("#addtmsum${id_suffix}").text($("#addobjecttm${id_suffix}").val().split(/\r?\n/).length);
		
	 }
	 if( $("#editproducttm${id_suffix}")._propAttr('checked')){
			 $("#edittmsum${id_suffix}").text($("#editobjectnotm${id_suffix}").val().split(/\r?\n/).length);
		 
	}
	
	//子系统
	 if( $("#addproductss${id_suffix}")._propAttr('checked')){
			 $("#addsssum${id_suffix}").text($("#addobjectss${id_suffix}").val().split(/\r?\n/).length);
		 
	 }
	 if( $("#editproductss${id_suffix}")._propAttr('checked')){
		
			 $("#editsssum${id_suffix}").text($("#editobjectnoss${id_suffix}").val().split(/\r?\n/).length);
		
	 }
	
	//模块
	 if( $("#addproductmd${id_suffix}")._propAttr('checked')){
		
			 $("#addmdsum${id_suffix}").text($("#addobjectmd${id_suffix}").val().split(/\r?\n/).length);
		
	 }
	 if( $("#editproductmd${id_suffix}")._propAttr('checked')){
		
			 $("#editmdsum${id_suffix}").text($("#editobjectnomd${id_suffix}").val().split(/\r?\n/).length);
		
	}
	
	//模块版本
	 if( $("#addproductmv${id_suffix}")._propAttr('checked')){
		
		 $("#addmvsum${id_suffix}").text($("#addobjectmv${id_suffix}").val().split(/\r?\n/).length);
		
	 }
	 if( $("#editproductmv${id_suffix}")._propAttr('checked')){
		$("#editmvsum${id_suffix}").text($("#editproductmv${id_suffix}").val().split(/\r?\n/).length);
			
	 }
	}
	});
	
	$('textarea[autoHeight]').autoHeight(); 
	
	//显示信息  复选框是否选中
	if('${entity.baseLines[1].applytype}'==1){
		$("#addproductbl${id_suffix}").prop("checked",'true');
		$("#addTabbl${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
		
	}
	if('${entity.baseLines[2].applytype}'==2){
		$("#editproductbl${id_suffix}")._propAttr('checked','true');
		$("#editTabbl${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseLines[3].applytype}'==3){
		$("#delproductbl${id_suffix}")._propAttr('checked','true');
		$("#delTabbl${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	
	if('${entity.baseObjects[0][0].applytype}'==1){
		$("#addproductft${id_suffix}")._propAttr('checked','true');
		$("#addTabft${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[0][1].applytype}'==2){
		$("#editproductft${id_suffix}")._propAttr('checked','true');
		$("#editTabft${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[0][2].applytype}'==3){
		$("#delproductft${id_suffix}")._propAttr('checked','true');
		$("#delTabft${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[1][0].applytype}'==1){
		$("#addproductsf${id_suffix}")._propAttr('checked','true');
		$("#addTabsf${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[1][1].applytype}'==2){
		$("#editproductsf${id_suffix}")._propAttr('checked','true');
		$("#editTabsf${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[1][2].applytype}'==3){
		$("#delproductsf${id_suffix}")._propAttr('checked','true');
		$("#delTabsf${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[2][0].applytype}'==1){
		$("#addproducttm${id_suffix}")._propAttr('checked','true');
		$("#addTabtm${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[2][1].applytype}'==2){
		$("#editproducttm${id_suffix}")._propAttr('checked','true');
		$("#editTabtm${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[2][2].applytype}'==3){
		$("#delproducttm${id_suffix}")._propAttr('checked','true');
		$("#delTabtm${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[3][0].applytype}'==1){
		$("#addproductss${id_suffix}")._propAttr('checked','true');
		$("#addTabss${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[3][1].applytype}'==2){
		$("#editproductss${id_suffix}")._propAttr('checked','true');
		$("#editTabss${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[3][2].applytype}'==3){
		$("#delproductss${id_suffix}")._propAttr('checked','true');
		$("#delTabss${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[4][0].applytype}'==1){
		$("#addproductmd${id_suffix}")._propAttr('checked','true');
		$("#addTabmd${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[4][1].applytype}'==2){
		$("#editproductmd${id_suffix}")._propAttr('checked','true');
		$("#editTabmd${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[4][2].applytype}'==3){
		$("#delproductmd${id_suffix}")._propAttr('checked','true');
		$("#delTabmd${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[5][0].applytype}'==1){
		$("#addproductmv${id_suffix}")._propAttr('checked','true');
		$("#addTabmv${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[5][1].applytype}'==2){
		$("#editproductmv${id_suffix}")._propAttr('checked','true');
		$("#editTabmv${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
	}
	if('${entity.baseObjects[5][2].applytype}'==3){
		$("#delproductmv${id_suffix}")._propAttr('checked','true');
		$("#delTabmv${id_suffix}").toggle();
		$('textarea[autoHeight]').autoHeight(); 
        
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
         // 重新加载easyui样式
          $.parser.parse($('#SUBFORM_'+id)); 
          $('textarea[autoHeight]').autoHeight(); 
        } else {
            $('#SUBFORM_'+id).toggle();
            $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
        }
    });
	
	
	
	
	  //下拉框选项加载
	   //IPMT加载
		  $("#plipmtno${id_suffix}").combobox({
				/* url : '/product/comboboxdata/Releaselist?type=PI&code=',
				method : "post",
				valueField : 'value',
				textField : 'text',
				editable:false,
				required:true,
				missingMessage:"请选择IPMT", */
				editable:false,
				onSelect: function(rec){
					
					 if($("#prodlineno${id_suffix}").length > 0){
						//清空下拉框值，实现强级联
						
						//if(index__ != 0 && $('#btn_test${id_suffix}').val() != 1){
						var prodlinenoSel=$('#prodlineno${id_suffix}').combobox("getValue");
					    $('#prodlineno${id_suffix}').combobox("clear");
					    $('#productno${id_suffix}').combobox("clear");
					    $('#versionno${id_suffix}').combobox("clear");
					    $('#releaseno${id_suffix}').combobox("clear");
						//}
				    	$('#prodlineno${id_suffix}').combobox('reload', '/product/comboboxdata/Releaselist?type=PL&UpperCode=&code='+rec.value+'&sub_code=' + $('#prodlineno${id_suffix}').combobox("getValue")); 
				    	 //$('#prodlineno${id_suffix}').combobox("select",prodlinenoSel);
					 } 
				
				} ,
				onLoadSuccess: function () {
					
					//创建继承
					if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("plipmtno,")  ) { %>
				 	var plipmt;
					if('${apply}'!=""&&'${apply.plipmtno}'!=""){
						plipmt='${apply.plipmtno}';
					}
					$("#plipmtno${id_suffix}").combobox('select',plipmt);  
				
					<% } %> 
					}
					
					$("#plipmtno${id_suffix}").unbind("onLoadSuccess");
				}
			});
		  
		  var index__ = 0;
		//产品线校验
		  $("#prodlineno${id_suffix}").combobox({
				/* url : [],data : '[]',
				method : "post",
				valueField : 'value',
				textField : 'text', */
				editable:false,
				required:true,
				missingMessage:"请选择产品线",
				onSelect: function(rec){
				 	if($("#productno${id_suffix}").length > 0){
				 		//清空下拉框值，实现强级联
				 		var productnoSel=$('#productno${id_suffix}').combobox("getValue");
				 		if(index__ != 0 && $('#btn_test${id_suffix}').val() != 1){
						    $('#productno${id_suffix}').combobox("clear");
						    $('#versionno${id_suffix}').combobox("clear");
						    $('#releaseno${id_suffix}').combobox("clear");
				 		}
				 		debugger
				 		var upperNo=$("#plipmtno${id_suffix}").combobox("getValue")+"_";
				    	$('#productno${id_suffix}').combobox('reload', '/product/comboboxdata/Releaselist?type=PP&UpperCode='+upperNo+rec.value+'&code='+rec.value+'&sub_code=' + $('#productno${id_suffix}').combobox("getValue"));
				    	// 1 级联选择   2.继承复制 3.选择版本4.修改流程
				    	if(index__ == 0 || $('#btn_test${id_suffix}').val() == 1){
				    		$('#productno${id_suffix}').combobox("select",productnoSel);
				    		index__++;
				    		$('#btn_test${id_suffix}').val(0); 
				    		
				    	}
				    
				 	} 
				},
				onLoadSuccess: function () {
					//var comboboxValue = $.trim($("#prodlineno${id_suffix}").combobox('getValue'));
					//if (comboboxValue == null || comboboxValue == ''|| comboboxValue == 'underfined'){
					//创建继承
						if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("prodlineno,")  ) { %> //2.选择版本
					 var prodlineno;
					if('${apply}'!=""&&'${apply.prodlineno}'!=""){
						prodlineno='${apply.prodlineno}';
					}
					var allData=$("#prodlineno${id_suffix}").combobox("getData");
					if(allData!="[]"){
					for (var i = 0; i < allData.length; i++) {
						if (prodlineno == allData[i]["value"]) {
                            $("#prodlineno${id_suffix}").combobox('select',prodlineno); 
                            break;
                  		 }

					}
					}
					//$("#prodlineno${id_suffix}").combobox('select',prodlineno);   
					<%}%>
						}else{
					 var prodlineno;
						if('${entity.baseLines[0].prodlineno}'!=""){
							prodlineno='${entity.baseLines[0].prodlineno}';
						}
						var allData=$("#prodlineno${id_suffix}").combobox("getData");
						if(allData!="[]"){
						for (var i = 0; i < allData.length; i++) {
							if (prodlineno == allData[i]["value"]) {
	                            $("#prodlineno${id_suffix}").combobox('select',prodlineno); 
	                            break;
	                  		 }

						}
						}
						}
					//}
						$("#prodlineno${id_suffix}").unbind("onLoadSuccess"); 
					//}
				}
		   });
		  var index1__=0;
		//产品校验
		  $("#productno${id_suffix}").combobox({
			/* 	url : [],data : '[]',
				method : "post",
				valueField : 'value',
				textField : 'text', */
				editable:false,
				required:true,
				missingMessage:"请选择产品",
				onChange:function(newValue,oldValue){
					/* if($("#versionno${id_suffix}").length > 0){
				    	$('#versionno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PV&code='+newValue+'&sub_code=' + $('#versionno${id_suffix}').combobox("getValue")); 
					} */
				},
				onSelect: function(rec){
					 if($("#versionno${id_suffix}").length > 0){
						 var versionnoSel=$('#versionno${id_suffix}').combobox("getValue");
						//清空下拉框值，实现强级联
						if(index1__ != 0 && $('#btn_test1${id_suffix}').val() != 1){
						$('#versionno${id_suffix}').combobox("clear");
						$('#releaseno${id_suffix}').combobox("clear");
						}
						//解决下拉框加载数据和选择版本不一致的问题
						debugger
						var upperNo=$('#plipmtno${id_suffix}').combobox("getValue")+"_"+$('#prodlineno${id_suffix}').combobox("getValue")+"_";
						$('#versionno${id_suffix}').combobox('reload', '/product/comboboxdata/Releaselist?type=PV&UpperCode='+upperNo+rec.value+'&code='+rec.value+'&sub_code=' + $('#versionno${id_suffix}').combobox("getValue"));
		if(index1__ == 0 || $('#btn_test1${id_suffix}').val() == 1){
				    		$('#versionno${id_suffix}').combobox("select",versionnoSel);
				    		index1__++;
				    		$('#btn_test1${id_suffix}').val(0); 
				    		
				    	}
				    	//$('#versionno${id_suffix}').combobox("select",versionnoSel);
					 } 
				},
				onLoadSuccess: function () {
					
					//var comboboxValue = $.trim($("#productno${id_suffix}").combobox('getValue'));
					//if (comboboxValue == null || comboboxValue == ''|| comboboxValue == 'underfined'){
					//创建继承
					if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("productno,")  ) { %>
					  var productno;
					if('${apply}'!=""&&'${apply.productno}'!=""){
						productno='${apply.productno}';
					}
					var allData=$("#productno${id_suffix}").combobox("getData");
					if(allData!="[]"){
					for (var i = 0; i < allData.length; i++) {
						if (productno == allData[i]["value"]) {
                            $("#productno${id_suffix}").combobox('select',productno); 
                            break;
                  		 }

					}
					}
					//$("#productno${id_suffix}").combobox('select',productno);   
					<%}%>
					}else{
						var productno;
						if('${entity.baseLines[0].productno}'!=""){
							productno='${entity.baseLines[0].productno}';
						}
						var allData=$("#productno${id_suffix}").combobox("getData");
						if(allData!="[]"){
						for (var i = 0; i < allData.length; i++) {
							if (productno == allData[i]["value"]) {
	                            $("#productno${id_suffix}").combobox('select',productno); 
	                            break;
	                  		 }

						}
						}
					}
					$("#productno${id_suffix}").unbind("onLoadSuccess"); 
					//}
			    }
		   });
		  var index2__=0;
		  //V版本校验
		  $("#versionno${id_suffix}").combobox({
				/* url : [],data : '[]',
				method : "post",
				valueField : 'value',
				textField : 'text', */
				editable:false,
				required:true,
				missingMessage:"请选择产品V级",
				onChange:function(newValue,oldValue){
					/* if($("#releaseno${id_suffix}").length > 0){
				    	$('#releaseno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=PR&code='+newValue+'&sub_code=' + $('#releaseno${id_suffix}').combobox("getValue")); 
					} */
				},
				onSelect: function(rec){
					
					 if($("#releaseno${id_suffix}").length > 0){
						 var releasenoSel=$('#releaseno${id_suffix}').combobox("getValue");
						//清空下拉框值，实现强级联
						if(index2__ != 0 && $('#btn_test2${id_suffix}').val() != 1){
						$('#releaseno${id_suffix}').combobox("clear");
						}
						debugger
						var upperNo=$('#plipmtno${id_suffix}').combobox("getValue")+"_"+$('#prodlineno${id_suffix}').combobox("getValue")+"_"+$('#productno${id_suffix}').combobox("getValue")+"_";
				    	$('#releaseno${id_suffix}').combobox('reload', '/product/comboboxdata/Releaselist?type=PR&UpperCode='+upperNo+rec.value+'&code='+rec.value+'&sub_code=' + $('#releaseno${id_suffix}').combobox("getValue")); 
				    	if(index2__ == 0 || $('#btn_test2${id_suffix}').val() == 1){
				    		$('#releaseno${id_suffix}').combobox("select",releasenoSel);
				    		index2__++;
				    		$('#btn_test2${id_suffix}').val(0); 
				    		
				    	}
				    	//$('#releaseno${id_suffix}').combobox("select",releasenoSel);
					 } 
				},
				onLoadSuccess: function () {
					//var comboboxValue = $.trim($("#versionno${id_suffix}").combobox('getValue'));
					//if (comboboxValue == null || comboboxValue == ''|| comboboxValue == 'underfined'){
					//创建继承
					if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("versionno,")  ) { %>
					  var versionno;
					if('${apply}'!=""&&'${apply.versionno}'!=""){
						versionno='${apply.versionno}';
					}
					//$("#versionno${id_suffix}").combobox('select',versionno);  
					var allData=$("#versionno${id_suffix}").combobox("getData");
					if(allData!="[]"){
					for (var i = 0; i < allData.length; i++) {
						if (versionno == allData[i]["value"]) {
                            $("#versionno${id_suffix}").combobox('select',versionno); 
                            break;
                  		 }

					}
					}
					<%}%>
					}else{
						var versionno;
						if('${entity.baseLines[0].versionno}'!=""){
							versionno='${entity.baseLines[0].versionno}';
						}
						var allData=$("#versionno${id_suffix}").combobox("getData");
						if(allData!="[]"){
						for (var i = 0; i < allData.length; i++) {
							if (versionno == allData[i]["value"]) {
	                            $("#versionno${id_suffix}").combobox('select',versionno); 
	                            break;
	                  		 }

						}
						}
					}
					$("#versionno${id_suffix}").unbind("onLoadSuccess"); 
				//	}
			    }
		   });
		  
		  //R版本校验
		  $("#releaseno${id_suffix}").combobox({
				/* url : [],data : '[]',
				method : "post",
				valueField : 'value',
				textField : 'text', */
				editable:false,
				required:true,
				missingMessage:"请选择产品R级",
				onChange:function(newValue,oldValue){
					//特性加载
					 if($("#featureno${id_suffix}").length > 0){
				    	$('#featureno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=FT&code='+newValue+'&sub_code=' + $('#featureno${id_suffix}').combobox("getValue")); 
					 } 
					//选择要修改的基线版本
					/*  if($("#editbaselineoldnoSel${id_suffix}").length > 0){
						 $('#editbaselineoldnoSel${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=BL&code='+newValue+'&sub_code=' + $('#editbaselineoldnoSel${id_suffix}').combobox("getValue"));
					 } */
				},
				onSelect: function(rec){
				 	//特性加载
					 if($("#featureno${id_suffix}").length > 0){
				    	$('#featureno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=FT&code='+rec.value+'&sub_code=' + $('#featureno${id_suffix}').combobox("getValue")); 
					 } 
					 //子系统加载
						 if($("#subsystemno${id_suffix}").length > 0&& $("#subsystemno${id_suffix}").attr("type")!="hidden"){
						     	$('#subsystemno${id_suffix}').combobox('reload', '/product/comboboxdata/list?type=SS&code='+rec.value+'&sub_code=' + $('#subsystemno${id_suffix}').combobox("getValue")); 
						 } 
						 //选择要修改的基线版本
						/*  if($("#editbaselineoldnoSel${id_suffix}").length > 0){
							 $('#editbaselineoldnoSel${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=BL&code='+rec.value+'&sub_code=' + $('#editbaselineoldnoSel${id_suffix}').combobox("getValue"));
						 } */
						 //选择要停用的基线版本
						/*  if($("#delbaselinenoSel${id_suffix}").length > 0){
							 $('#delbaselinenoSel${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=BL&code='+rec.value+'&sub_code=' + $('#delbaselinenoSel${id_suffix}').combobox("getValue"));
						 } */
						 //选择要修改的特性
						 if($("#objectnoSelEditft${id_suffix}").length>0){
							 $('#objectnoSelEditft${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=FT&code='+rec.value+'&sub_code=' + $('#objectnoSelEditft${id_suffix}').combobox("getValue"));
						 }
						 
						//选择要停用的特性
						 if($("#objectnoSelDelft${id_suffix}").length>0){
							 $('#objectnoSelDelft${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=FT&code='+rec.value+'&sub_code=' + $('#objectnoSelDelft${id_suffix}').combobox("getValue"));
						 }
						
						//选择要修改的项目组
						if($("#objectnoSelEdittm${id_suffix}").length>0){
							 $('#objectnoSelEdittm${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=TM&code='+rec.value+'&sub_code=' + $('#objectnoSelEdittm${id_suffix}').combobox("getValue"));
						}
						
						//选择要停用的项目组
						if($("#objectnoSelDeltm${id_suffix}").length>0){
							 $('#objectnoSelDeltm${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=TM&code='+rec.value+'&sub_code=' + $('#objectnoSelDeltm${id_suffix}').combobox("getValue"));
						}
						
						//选择要修改的子系统
						if($("#objectnoSelEditss${id_suffix}").length>0){
							$('#objectnoSelEditss${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=SS&code='+rec.value+'&sub_code=' + $('#objectnoSelEditss${id_suffix}').combobox("getValue"));
						}
						//选择要停用的子系统
						if($("#objectnoDelSelss${id_suffix}").length>0){
							$('#objectnoDelSelss${id_suffix}').combobox('reload', '/product/comboboxdata/listWithId?type=SS&code='+rec.value+'&sub_code=' + $('#objectnoDelSelss${id_suffix}').combobox("getValue"));
						}
						
						//产品配置经理赋值
						 $.ajax({
				                type: "POST",
				                url: "/basicinfo/prBelowApply/getPdtCmo",
				                data:{code:rec.value},
				                async: false,
				                success: function (result) {
				                	$("#cmo${id_suffix}").val(result);
				                }
						 }); 
					},
					onLoadSuccess: function () {
						//var comboboxValue = $.trim($("#releaseno${id_suffix}").combobox('getValue'));
						//if (comboboxValue == null || comboboxValue == ''|| comboboxValue == 'underfined'){
						if($("#hidCmo${id_suffix}").val()!=""&&$("#hidCmo${id_suffix}").val()!=null){
							$("#cmo${id_suffix}").val($("#hidCmo${id_suffix}").val());	
						}
						//创建继承
						if('${obj_fields}' != ""){
					 <%if( obj_fields.contains("releaseno,")  ) { %>
					 	 var releaseno;
						if('${apply}'!=""&&'${apply.releaseno}'!=""){
							releaseno='${apply.releaseno}';
						}
						var allData=$("#releaseno${id_suffix}").combobox("getData");
						if(allData!="[]"){
						for (var i = 0; i < allData.length; i++) {
							if (releaseno == allData[i]["value"]) {
	                            $("#releaseno${id_suffix}").combobox('select',releaseno); 
	                            break;
	                  		 }

						}
						}
						<%}%>
						}else{
							var releaseno;
							if('${entity.baseLines[0].releaseno}'!=""){
								releaseno='${entity.baseLines[0].releaseno}';
							}
							var allData=$("#releaseno${id_suffix}").combobox("getData");
							if(allData!="[]"){
							for (var i = 0; i < allData.length; i++) {
								if (releaseno == allData[i]["value"]) {
		                            $("#releaseno${id_suffix}").combobox('select',releaseno); 
		                            break;
		                  		 }

							}
							}
						}
						$("#releaseno${id_suffix}").unbind("onLoadSuccess");  
						//}
				    }
		   });
		//修改当前处理人
		  $("#editUser${id_suffix}").bind('click',function(){
			  
		      var userId =  $("#assignDesc${id_suffix}").val();
		      if ($(this).linkbutton('options').disabled == false) {
		    	  $('#editUser${id_suffix}').linkbutton('disable');
		      $.post("/basicinfo/prBelowApply/changeResponsible",{id:"${entity.id}",taskId:"${taskId}",userId:userId},function (result) {
		          
		    	  eval("var obj = " + result);		
		    	  
		    	  if(obj.status == 200){
		              //alert("修改当前处理人成功");
		    		  if(window.location.href.indexOf('eipLogin') > -1){
	                    	 var data = {};
	                    	 data.Code = 11;
	                    	 data.Msg = "审批成功";
	                    	 PM.send(top.window.parent, "fromSource", data); 
	                    	 }else{
		              $.messager.alert("提示","修改当前处理人成功","");
		              $('#editUser${id_suffix}').linkbutton('enable');
		              var tab = $('#mainUrl').tabs('getSelected');
		              tab.panel('refresh', '/basicinfo/prBelowApply/edit/${entity.id}');
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
		        	  $('#editUser${id_suffix}').linkbutton('enable');
              		 }
		          }
		      });
		      }
		  });
		
		  //配置是否为只能
		  
			if("${currentNode=='usertask1' && isHandler || currentNode == 'editable'}"=="true"){
				$("#pdtSuggestion${id_suffix}").textbox({readonly:true});
				/* if("${isHandler}"=="true"){
					  
				  }else{
					  $("#cmo${id_suffix}").textbox({readonly:true});
				  } */
			}else{
			$("*[name='copyRelease']").attr("disabled","true");
			  $("#SUBFORM_T00000_1${id_suffix}").children().find("textarea").attr("readonly","readonly");
			  $("#plipmtno${id_suffix}").combobox({readonly:true});
			  //禁用选择版本所有的点击事件
			    $('#tabPr${id_suffix} td').removeAttr('onclick');
			  $("#tabPr${id_suffix} input").each(function(index,element){
				  $(this).combobox({readonly:true});
				 
	  			});
			  $("#SUBFORM_T00000_1${id_suffix} input[class*='easyui-combotreegrid']").each(function(index,element){
				  $(this).combotreegrid({readonly:true});
			  });
			  $("#SUBFORM_T00000_1${id_suffix} input[class*='easyui-combobox']").each(function(index,element){
				  $(this).combobox({readonly:true});
			  });
			  $("#SUBFORM_T00000_1${id_suffix} input[class*='combobox-checkbox']").each(function(index,element){
				  $(this)._propAttr("disabled","disabled");
			  });
			  $("#SUBFORM_T00000_1${id_suffix} a[class*='easyui-linkbutton']").each(function(index,element){
				  $(this).attr("disabled","disabled");
			  }); 
			  if("${currentNode=='userTask3' && isHandler}"=="true"){
				  
			  }else{
				  $("#pdtSuggestion${id_suffix}").textbox({readonly:true});
				  $("#cmo${id_suffix}").textbox({readonly:true});
				  $("#copyto${id_suffix}").textbox({readonly:true});
			  }
			}
});

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

//去除首尾空行
 function Trim(str){ 
	             return str.replace(/(^\s*)|(\s*$)/g, ""); 
 }

//查看已有产品清单
function selProduct${id_suffix}(tag){
	var title="";
	 $.ajax({
                type: "POST",
                url: "/basicinfo/prBelowApply/getTitle",
                data:{tag:tag},
                async: false,
                success: function (result) {
                   title=result;
                },
                error: function (result) {
                    //alert("获取title失败");
                    $.messager.alert("提示","获取title失败","");
                }
            });
	 if ($('#mainUrl').tabs('exists', title)) {
	       $('#mainUrl').tabs('select', title);
	     } else { 
	    	 $('#mainUrl').tabs('add', {
	         title : title,
	         href : 'product/pages/'+tag,
	         closable : true
	       });
	     }
	 
	 
	
	
}
//选中事件 mark 标记增删改(add新增  edit修改 del停用 ) tag标记不同对象
function checkProduct${id_suffix}(mark,tag){
	if($("#"+mark+"product"+tag+"${id_suffix}")._propAttr('checked')){
		$("#"+mark+"Tab"+tag+"${id_suffix}").show();
		$.parser.parse($("#"+mark+"Tab"+tag+"${id_suffix}")); 
	}else{
		$("#"+mark+"Tab"+tag+"${id_suffix}").hide();
	}
}
//格式化
function formatProgress${id_suffix}(value,rowData,rowIndex){
	if (value == "underfined" || value == null) {
		return "";
	} else {
		return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
		+ value + '</div>';
	}
}

//父版本查询
function btnSearch${id_suffix}(){
	$("#selparentversion${id_suffix}").datagrid("load",{
		searchParas : $("#searchParas${id_suffix}").val()
	});
}



//设置名称 'add','bl','','eng'  
function setProduct${id_suffix}(tag,type,out,eng){
	//addengobjectbl${id_suffix}  英文字段
	//addobjectoutbl  对外中文字段
	//addengobjectoutbl 对外英文字段
	if(out.indexOf("_")!=-1){
		$("#"+tag+eng+"object"+out.split("_")[0]+type+"${id_suffix}").val($("#"+tag+"object"+out.split("_")[0]+type+"${id_suffix}").val());
	}else{
	$("#"+tag+eng+"object"+out+type+"${id_suffix}").val($("#"+tag+"object"+type+"${id_suffix}").val());
	}
	 $('textarea[autoHeight]').autoHeight(); 
}


//关联项目
function selectProject${id_suffix}(tag){
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
		           
		           {title:'IPMT',field:'plipmt',width:'15%', formatter:formatProgress${id_suffix}},
		           {title:'研发产品线',field:'prodline',width:'15%',formatter:formatProgress${id_suffix}},    
		           {title:'PDT',field:'pdt',width:'10%', formatter:formatProgress${id_suffix}},
		           {title:'产品',field:'product',width:'10%', formatter:formatProgress${id_suffix}},    
		           {title:'产品V级',field:'version',width:'10%', formatter:formatProgress${id_suffix}},
		           {title:'产品R级内码',field:'releaseno',width:'10%',formatter:formatProgress${id_suffix}}, 
		           {title:'产品R级中文名称',field:'release',width:'10%', formatter:formatProgress${id_suffix}}, 
		           {title:'对应的软件平台版本',field:'releaseSoftware',width:'10%', formatter:formatProgress${id_suffix}},
		           {title:'项目状态',field:'projectstatus',width:'10%', formatter:formatProgress${id_suffix}}
		           
		       ]],
		height : window.innerHeight
				- window.innerHeight * 0.28,
				fitColumns : true,
		onBeforeExpand : function(row) {//异步架加载树
			var url = "product/data/prdata";
			$("#selparentrelease${id_suffix}").treegrid("options").url = url;
			return true;
		},onDblClickRow : function(rowData) {
			$('#winparentrelease${id_suffix}').window("close");
			//根据选中的版本、路标版本查询下面的特性、子特性赋值
			var releasenos=rowData.releaseno;
			if(releasenos!=""){
				initShowData${id_suffix}(releasenos,tag);
			}else{
				$.messager.alert("提示","该版本不存在！！！","");
			}
		},toolbar : [{
     			id : 'addSelectProject${id_suffix }',
     			text : '确定',
     			handler : function() {
     				$('#winparentrelease${id_suffix}').window("close");
     				//根据选中项赋值
     				var rowData=$("#selparentrelease${id_suffix}").treegrid("getSelected");
     				if(rowData!=null){
     					var releasenos=rowData.releaseno;
     					initShowData${id_suffix}(releasenos,tag);
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




//保存草稿
function saveMenue${id_suffix}(){
	$("#mainUrl").tabs("loading","处理中...");
	 $('#prBelowApply${id_suffix}').form('submit', {
         url: '/basicinfo/prBelowApply/save',
         onSubmit: function(){
        	 //确认哪些需要保存
        	 //applytype
        	setTypeValue${id_suffix}();
         },
         success: function(data){
        	 eval("var obj = " + data);		
        	 if(obj!=0){
        		 $("#mainUrl").tabs("loaded");
            	 var tab = $('#mainUrl').tabs('getSelected');
    			 var index = $('#mainUrl').tabs('getTabIndex', tab);
    			 $("#mainUrl").tabs("close", index)
    				
            	 
                 $('#mainUrl').tabs(
    						'add',
    						{
    							title : "修改产品R级以下基本信息",
    							href : '/basicinfo/prBelowApply/edit/'+obj,
    							closable : true
    						}); 
        	 }else{
					alert("保存失败");
					$("#mainUrl").tabs("loaded");
        	 }
        	 $("#mainUrl").tabs("loaded");
		 }
             
         
     });
}
//直接录入
//提交审批
function subsave${id_suffix}(){
	var number="";
	/*  $.messager.confirm('', '确认是否提交?', function(r){
	    if (r){ */
	    	$('#subsave${id_suffix}').linkbutton('disable');
	    	$("#mainUrl").tabs("loading","处理中...");
	        $('#prBelowApply${id_suffix}').form('submit', {
	            url: '/basicinfo/prBelowApply/submit',
	            onSubmit: function(){
	            	
	            	//设置类型值
	            	setTypeValue${id_suffix}();
	            	//校验
	            		var isValid = validateContent${id_suffix}();
	 	                if (!isValid){
	 	                    $("#mainUrl").tabs("loaded");	
	 	                    $('#subsave${id_suffix}').linkbutton('enable');
	 	                   return false;
	 	                }
	 	               
	            	//} 
	            	if($("#cmo${id_suffix}").val()==""||$("#cmo${id_suffix}").val()==null){
	            		$("#mainUrl").tabs("loaded");
	            		 $.messager.alert("提示","请指定该产品的配置经理,下一步审批人不能为空！！！","");
	            		 $('#subsave${id_suffix}').linkbutton('enable');
	            		 return false;
	            	}
	     			
	                var isValid = $(this).form('validate');
	                if (!isValid){
	                    $("#mainUrl").tabs("loaded");	
	                    $('#subsave${id_suffix}').linkbutton('enable');
	                }
	                return isValid;	
	            },
	            success: function(result){
	            	  var obj = $.parseJSON(result);
	                  if(obj.status==200){
	                	 // alert(obj.message);
	                	 // $.messager.alert("提示",obj.message,"");
	                var tab = $('#mainUrl').tabs('getSelected');
					var index = $('#mainUrl').tabs('getTabIndex', tab);
					$("#mainUrl").tabs("close", index)
	                $("#mainUrl").tabs("loaded");	
					$('#subsave${id_suffix}').linkbutton('enable');
	                  }else{
	                	  $("#mainUrl").tabs("loaded");
	                	  //alert(obj.message);
	                	  $.messager.alert("提示",obj.message,"");
	                	  $('#subsave${id_suffix}').linkbutton('enable');
	                  }
	            }
	        });
	  /*   }
	});   */
}
//校验
function validateContent${id_suffix}(){
	//验证是否选中数据
	var tag=0;
	$("#prBelowApply${id_suffix} input[type='checkbox']").each(function(index,element){
		  if($(this)._propAttr('checked')){
			  tag=1;
		  }
	  });
	if($("#addproductbl${id_suffix}").prop("checked")){
		tag=1;
	}
	if(tag==0)
	{
		 $("#mainUrl").tabs("loaded");
		 $.messager.alert("提示","申请信息不能为空！！！","");
		 $('#sub${id_suffix}').linkbutton('enable');
		 return false;
	} 
	 //基线版本$("#addproductbl${id_suffix}").prop("checked")
	 if( $("#addproductbl${id_suffix}").prop("checked")){
		//校验名称重复
		 var msg=validateData${id_suffix}("add","bl");
		 if(msg==null){
		   msg=validateDataNull${id_suffix}("add","bl");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","新增 基线版本"+msg,"");
			 return false;
		 }
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("add","outbl");
			   if(msg!=null){
					 $.messager.alert("提示","新增 基线版本 对外"+msg,"");
					 return false;
				 }
		 }
		 if($("#addobjectbl${id_suffix}").val()==""||$("#addobjectbl${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的软件版本中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if($("#addengobjectbl${id_suffix}").val()==""||$("#addengobjectbl${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的软件版本英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjectoutbl${id_suffix}").val()==""||$("#addobjectoutbl${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的软件版本对外中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addengobjectoutbl${id_suffix}").val()==""||$("#addengobjectoutbl${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的软件版本对外英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjectbl${id_suffix}").length>0&&$("#addengobjectbl${id_suffix}").length>0&&$("#addobjectbl${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjectbl${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的基线版本中文名称与英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if($("#addobjectbl${id_suffix}").length>0&&$("#addobjectoutbl${id_suffix}").length>0&&$("#addobjectbl${id_suffix}").val().split(/\r?\n/).length!=$("#addobjectoutbl${id_suffix}").val().split(/\r?\n/).length)
		 {
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的基线版本中文名称与要新增的软件版本对外中文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjectbl${id_suffix}").length>0&&$("#addengobjectoutbl${id_suffix}").length>0&&$("#addobjectbl${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjectoutbl${id_suffix}").val().split(/\r?\n/).length)
		 {
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的基线版本中文名称与要新增的软件版本对外英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjectbl${id_suffix}").length>0&&$("#addparentitemno${id_suffix}").length>0&&$("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!=""&&$("#addobjectbl${id_suffix}").val().split(/\r?\n/).length!=$("#addparentitemno${id_suffix}").val().split(/\r?\n/).length)
		 {
			 
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的基线版本中文名称与新增的软件版本的父版本个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjectbl${id_suffix}").length>0&&$("#addbaseline1${id_suffix}").length>0&&$("#addbaseline1${id_suffix}").val()!=null&&$("#addbaseline1${id_suffix}").val()!=""&&$("#addobjectbl${id_suffix}").val().split(/\r?\n/).length!=$("#addbaseline1${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的基线版本中文名称与新增软件版本对应的平台基线版本号个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if($("#addparentitemno${id_suffix}").length>0&&$("#addparentitem${id_suffix}").length>0&&$("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!=""&&$("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!=""&&$("#addparentitemno${id_suffix}").val().split(/\r?\n/).length!=$("#addparentitem${id_suffix}").val().split(/\r?\n/).length)
		 {
			 
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的软件版本的父版本内码个数与新增的软件版本的父版本名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addbaseline1${id_suffix}").length>0&&$("#addbaseline1name${id_suffix}").length>0&&$("#addbaseline1name${id_suffix}").val()!=null&&$("#addbaseline1name${id_suffix}").val()!=""&&$("#addbaseline1${id_suffix}").val()!=null&&$("#addbaseline1${id_suffix}").val()!=""&&$("#addbaseline1${id_suffix}").val().split(/\r?\n/).length!=$("#addbaseline1name${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的基线版本对应的平台基线版本号内码个数与新增软件版本对应的平台基线版本号名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
	 }
	 if( $("#editproductbl${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("edit","bl");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","bl");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","修改 基线版本"+msg,"");
			 return false;
		 }
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","outbl");
			   if(msg!=null){
					 $.messager.alert("提示","修改 基线版本 对外"+msg,"");
					 return false;
				 }
		 }
		 
		 //if($("#editbaselineoldnoSel${id_suffix}").combobox("getValues")==""||$("#editbaselineoldnoSel${id_suffix}").combobox("getValues")==null)
		 if($("#editbaselineoldno${id_suffix}").val()==""||$("#editbaselineoldno${id_suffix}").val()==null)
		 {
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","请选择要修改的软件版本信息！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#editobjectbl${id_suffix}").val()==""||$("#editobjectbl${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","请填写修改后的软件版本中文全称！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#editengobjectbl${id_suffix}").val()==""||$("#editengobjectbl${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","请填写修改后的软件版本英文全称！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#editparentitemno${id_suffix}").length>0&&$("#editbaselineoldno${id_suffix}").length>0&&$("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!=""&&$("#editparentitemno${id_suffix}").val().split(/\r?\n/).length!=$("#editbaselineoldno${id_suffix}").val().split(/\r?\n/).length){
			 debugger
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要修改的基线版本父版本数量 和 要修改版本数量 不一致，无法提交流程！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if($("#editbaseline1${id_suffix}").length>0&&$("#editbaselineoldno${id_suffix}").length>0&&$("#editbaseline1${id_suffix}").val()!=null&&$("#editbaseline1${id_suffix}").val()!=""&&$("#editbaseline1${id_suffix}").val().split(/\r?\n/).length!=$("#editbaselineoldno${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要修改后的对应平台基线版本号 和 要修改版本数量 不一致，无法提交流程！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if($("#editparentitemno${id_suffix}").length>0&&$("#editparentitemnoname${id_suffix}").length>0&&$("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!=""&&$("#editparentitemnoname${id_suffix}").val().split(/\r?\n/).length!=$("#editparentitemno${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要修改的基线版本父版本内码数量 和 要修改基线版本父版本名称数量 不一致，无法提交流程！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if($("#editbaseline1${id_suffix}").length>0&&$("#editbaseline1name${id_suffix}").length>0&&$("#editbaseline1name${id_suffix}").val()!=null&&$("#editbaseline1name${id_suffix}").val()!=""&&$("#editbaseline1name${id_suffix}").val().split(/\r?\n/).length!=$("#editbaseline1${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要修改的对应平台基线版本号内码数量 和 要修改的对应平台基线版本号名称数量 不一致，无法提交流程！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
	 }
	if( $("#delproductbl${id_suffix}")._propAttr('checked')){
		//if($("#delbaselinenoSel${id_suffix}").combobox("getValues")==""||$("#delbaselinenoSel${id_suffix}").combobox("getValues")==null){
		 if($("#delbaselineno${id_suffix}").val()==""||$("#delbaselineno${id_suffix}").val()==null){
			$("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","请选择要停用的软件版本信息！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		}
	}
	//特性
	 if( $("#addproductft${id_suffix}")._propAttr('checked')){
		 var msg=validateData${id_suffix}("add","ft");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("add","ft");
			 }
		 if(msg!=null){
			 $.messager.alert("提示","新增 特性"+msg,"");
			 return false;
		 }
		 if($("#addobjectft${id_suffix}").val()==""||$("#addobjectft${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的特性中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addengobjectft${id_suffix}").val()==""||$("#addengobjectft${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的特性英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjectft${id_suffix}").length>0&&$("#addengobjectft${id_suffix}").length>0&&$("#addobjectft${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjectft${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的特性中文名称与英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
	 }
	 if( $("#editproductft${id_suffix}")._propAttr('checked')){
		 var msg=validateData${id_suffix}("edit","ft");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","ft");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","修改 特性"+msg,"");
			 return false;
		 }
		 if($("#objectnoSelEditft${id_suffix}").combobox("getValues")==""||$("#objectnoSelEditft${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","请选择要修改的特性信息！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#editobjectft${id_suffix}").val()==""||$("#editobjectft${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要修改的特性中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#editengobjectft${id_suffix}").val()==""||$("#editengobjectft${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要修改的特性英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#editobjectft${id_suffix}").length>0&&$("#editengobjectft${id_suffix}").length>0&&$("#editobjectft${id_suffix}").val().split(/\r?\n/).length!=$("#editengobjectft${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要修改的特性中文名称与英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
	 }
	if( $("#delproductft${id_suffix}")._propAttr('checked')){
		if($("#objectnoSelDelft${id_suffix}").combobox("getValues")==""||$("#objectnoSelDelft${id_suffix}").combobox("getValues")==null){
		 $("#mainUrl").tabs("loaded");
   		 $.messager.alert("提示","请选择要停用的特性信息！！！","");
   		 $('#subsave${id_suffix}').linkbutton('enable');
   		 return false;
		}
		 var msg=validateEditDelData${id_suffix}("ft");
		 if(msg!=null){
			 $.messager.alert("提示","修改 特性和停用 特性不能是同一个，请检查:"+msg,"");
			 return false;
		 }
	}
	//子特性
	 if( $("#addproductsf${id_suffix}")._propAttr('checked')){
		 var msg=validateData${id_suffix}("add","sf");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("add","sf");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","新增 子特性"+msg,"");
			 return false;
		 }
		 if($("#addobjectsf${id_suffix}").val()==""||$("#addobjectsf${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的子特性中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addengobjectsf${id_suffix}").val()==""||$("#addengobjectsf${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的子特性英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if(!$("#addproductft${id_suffix}")._propAttr('checked')){
		 if($("#featureno${id_suffix}").combobox("getValues")==""||$("#featureno${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","请选择特性！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 var addobject=$("#addobjectsf${id_suffix}").val();
		 var featureno=$("#featureno${id_suffix}").val(); 
		 if(addobject!=""){
			 if((addobject.split("*").length)!=(featureno.split(",").length)){
				 $("#mainUrl").tabs("loaded");
				 $.messager.alert("提示","特性和新增子特性含*对应的条数不一致！！！","");
				 $('#subsave${id_suffix}').linkbutton('enable');
				 return false;
			 }
		 }  
		 }
		 //特性为空  新增特性时处理
		 if($("#featureno${id_suffix}").val()==""&&$("#addproductft${id_suffix}")._propAttr('checked')){
			 if($("#addobjectft${id_suffix}").length>0&&$("#addobjectsf${id_suffix}").length>0&&$("#addobjectsf${id_suffix}").val().split("*").length!=$("#addengobjectft${id_suffix}").val().split(/\r?\n/).length){
				 $("#mainUrl").tabs("loaded");
				 $.messager.alert("提示","新增特性和新增子特性含*对应的条数不一致！！！","");
				 $('#subsave${id_suffix}').linkbutton('enable');
				 return false;
			 }
		 }
		
		 if($("#addobjectsf${id_suffix}").length>0&&$("#addengobjectsf${id_suffix}").length>0&&$("#addobjectsf${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjectsf${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的子特性中文名称与英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 //不允许新增子特性的同时删除所对应的特性
		 if($("#editproductft${id_suffix}")._propAttr('checked')){
			if($("#objectnoSelDelft${id_suffix}").combobox("getValue")==$("#featureno${id_suffix}").combobox("getValue")){
				$("#mainUrl").tabs("loaded");
	    		 $.messager.alert("提示","不允许新增子特性的同时停用所对应的特性！！！","");
	    		 $('#subsave${id_suffix}').linkbutton('enable');
	    		 return false;
			} 
		 }
	 }
	 if( $("#editproductsf${id_suffix}")._propAttr('checked')){
		 //校验名称是否重复
		 var msg=validateData${id_suffix}("edit","sf");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","sf");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","修改 子特性"+msg,"");
			 return false;
		 }
	 if($("#objectnoSelEditsf${id_suffix}").combobox("getValues")==""||$("#objectnoSelEditsf${id_suffix}").combobox("getValues")==null){
		 $("#mainUrl").tabs("loaded");
		 $.messager.alert("提示","请选择要修改的子特性信息！！！","");
		 $('#subsave${id_suffix}').linkbutton('enable');
		 return false;
	 }
	 if($("#editobjectsf${id_suffix}").val()==""||$("#editobjectsf${id_suffix}").val()==null){
		 $("#mainUrl").tabs("loaded");
		 $.messager.alert("提示","要修改的子特性中文名称不能为空！！！","");
		 $('#subsave${id_suffix}').linkbutton('enable');
		 return false;
	 }
	 if($("#editengobjectsf${id_suffix}").val()==""||$("#editengobjectsf${id_suffix}").val()==null){
		 $("#mainUrl").tabs("loaded");
		 $.messager.alert("提示","要修改的子特性英文名称不能为空！！！","");
		 $('#subsave${id_suffix}').linkbutton('enable');
		 return false;
	 }
	 if($("#editobjectsf${id_suffix}").length>0&&$("#editengobjectsf${id_suffix}").length>0&&$("#editobjectsf${id_suffix}").val().split(/\r?\n/).length!=$("#editengobjectsf${id_suffix}").val().split(/\r?\n/).length){
		 $("#mainUrl").tabs("loaded");
		 $.messager.alert("提示","新增的子特性中文名称与英文名称个数不匹配，请修改后再操作！！！","");
		 $('#subsave${id_suffix}').linkbutton('enable');
		 return false;
	 }
		 }
	if( $("#delproductsf${id_suffix}")._propAttr('checked')){
	if($("#subfeatureDelSelsf${id_suffix}").combobox("getValues")==""||$("#subfeatureDelSelsf${id_suffix}").combobox("getValues")==null){
		 $("#mainUrl").tabs("loaded");
  		 $.messager.alert("提示","请选择要停用的子特性信息！！！","");
  		 $('#subsave${id_suffix}').linkbutton('enable');
  		 return false;
		}
	 var msg=validateEditDelData${id_suffix}("sf");
	 if(msg!=null){
		 $.messager.alert("提示","修改 子特性和停用 子特性不能是同一个，请检查:"+msg,"");
		 return false;
	 }
	}
	
	//项目组
	 if( $("#addproducttm${id_suffix}")._propAttr('checked')){
		 //校验名称重复
		 var msg=validateData${id_suffix}("add","tm");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("add","tm");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","新增 项目组"+msg,"");
			 return false;
		 }
		 if($("#addobjecttm${id_suffix}").val()==""||$("#addobjecttm${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的项目组中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addengobjecttm${id_suffix}").val()==""||$("#addengobjecttm${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的项目组英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjecttm${id_suffix}").length>0&&$("#addengobjecttm${id_suffix}").length>0&&$("#addobjecttm${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjecttm${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的项目组中文名称与英文名称个数不匹配，请修改后再操作！！！","提示");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
	 	}
	 if( $("#editproducttm${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("edit","tm");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","tm");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","修改 项目组"+msg,"");
			 return false;
		 }
		 if($("#objectnoSelEdittm${id_suffix}").combobox("getValues")==""||$("#objectnoSelEdittm${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","请选择要修改的项目组信息！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjecttm${id_suffix}").val()==""||$("#editobjecttm${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的项目组中文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editengobjecttm${id_suffix}").val()==""||$("#editengobjecttm${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的项目组英文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjecttm${id_suffix}").length>0&&$("#editengobjecttm${id_suffix}").length>0&&$("#editobjecttm${id_suffix}").val().split(/\r?\n/).length!=$("#editengobjecttm${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","新增的项目组中文名称与英文名称个数不匹配，请修改后再操作！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }	
	 }
	if( $("#delproducttm${id_suffix}")._propAttr('checked')){
		if($("#objectnoSelDeltm${id_suffix}").combobox("getValues")==""||$("#objectnoSelDeltm${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
	  		 $.messager.alert("提示","请选择要停用的项目组信息！！！","");
	  		 $('#subsave${id_suffix}').linkbutton('enable');
	  		 return false;
		}
	}
	
	//子系统
	 if( $("#addproductss${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("add","ss");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("add","ss");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","新增 子系统"+msg,"");
			 return false;
		 }
		 if($("#addobjectss${id_suffix}").val()==""||$("#addobjectss${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的子系统中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addengobjectss${id_suffix}").val()==""||$("#addengobjectss${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的子系统英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addobjectss${id_suffix}").length>0&&$("#addengobjectss${id_suffix}").length>0&&$("#addobjectss${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjectss${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的子系统中文名称与英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
	 }
	 if( $("#editproductss${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("edit","ss");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","ss");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","修改 子系统"+msg,"");
			 return false;
		 }
		 if($("#objectnoSelEditss${id_suffix}").combobox("getValues")==""||$("#objectnoSelEditss${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","请选择要修改的子系统信息！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjectss${id_suffix}").val()==""||$("#editobjectss${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的子系统中文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editengobjectss${id_suffix}").val()==""||$("#editengobjectss${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的子系统英文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjectss${id_suffix}").length>0&&$("#editengobjectss${id_suffix}").length>0&&$("#editobjectss${id_suffix}").val().split(/\r?\n/).length!=$("#editengobjectss${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","新增的子系统中文名称与英文名称个数不匹配，请修改后再操作！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }		
	 }
	if( $("#delproductss${id_suffix}")._propAttr('checked')){
		if($("#objectnoDelSelss${id_suffix}").combobox("getValues")==""||$("#objectnoDelSelss${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
	  		 $.messager.alert("提示","请选择要停用的子系统信息！！！","");
	  		 $('#subsave${id_suffix}').linkbutton('enable');
	  		 return false;
		}
	}
	
	//模块
	 if( $("#addproductmd${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("add","md");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("add","md");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","新增 模块"+msg,"");
			 return false;
		 }
		 if($("#addobjectmd${id_suffix}").val()==""||$("#addobjectmd${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的模块中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 if($("#addengobjectmd${id_suffix}").val()==""||$("#addengobjectmd${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的模块英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 //没有新增子系统时 必选子系统
		 if(!$("#addproductss${id_suffix}")._propAttr('checked')){
		 if($("#subsystemno${id_suffix}").combobox("getValues")==""||$("#subsystemno${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","请选择子系统！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 var addobjectmd=$("#addobjectmd${id_suffix}").val();
		 var subsystemno=$("#subsystemno${id_suffix}").val(); 
		 if(addobjectmd!=""){
			 if(addobjectmd.split("*").length!=subsystemno.split(",").length){
				 $("#mainUrl").tabs("loaded");
				 $.messager.alert("提示","子系统和新增模块含*对应的条数不一致！！！","");
				 $('#subsave${id_suffix}').linkbutton('enable');
				 return false;
			 }
		 }
		 }
		 //新增子系统时 校验新增个数
		 if($("#addproductss${id_suffix}")._propAttr('checked')){
			 if($("#addobjectss${id_suffix}").length>0&&$("#addobjectmd${id_suffix}").length>0&&$("#addobjectmd${id_suffix}").val().split("*").length!=$("#addobjectss${id_suffix}").val().split(/\r?\n/).length){
				 $("#mainUrl").tabs("loaded");
				 $.messager.alert("提示","新增子系统个数和新增模块个数不匹配！！！","");
				 $('#subsave${id_suffix}').linkbutton('enable');
				 return false; 
			 }
		 }
		 if($("#addobjectmd${id_suffix}").length>0&&$("#addengobjectmd${id_suffix}").length>0&&$("#addobjectmd${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjectmd${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的模块中文名称与英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		//不允许新增模块的同时删除所对应的子系统
		if( $("#delproductss${id_suffix}")._propAttr('checked')){
		 if($("#subsystemno${id_suffix}").combobox("getValue")==$("#objectnoDelSelss${id_suffix}").combobox("getValue")){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","不允许新增模块的同时停用所对应的子系统！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		}
	 }
	 if( $("#editproductmd${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("edit","md");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","md");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","修改 模块"+msg,"");
			 return false;
		 }
		 if($("#objectnoSelEditmd${id_suffix}").combobox("getValues")==""||$("#objectnoSelEditmd${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","请选择要修改的模块信息！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjectmd${id_suffix}").val()==""||$("#editobjectmd${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的模块中文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editengobjectmd${id_suffix}").val()==""||$("#editengobjectmd${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的模块英文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjectmd${id_suffix}").length>0&&$("#editengobjectmd${id_suffix}").length>0&&$("#editobjectmd${id_suffix}").val().split(/\r?\n/).length!=$("#editengobjectmd${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","新增的模块中文名称与英文名称个数不匹配，请修改后再操作！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }	
	 }
	if( $("#delproductmd${id_suffix}")._propAttr('checked')){
		if($("#objectnoDelSelmd${id_suffix}").combobox("getValues")==""||$("#objectnoDelSelmd${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
	  		 $.messager.alert("提示","请选择要停用的模块信息！！！","");
	  		 $('#subsave${id_suffix}').linkbutton('enable');
	  		 return false;
		}
	}
	
	//模块版本
	 if( $("#addproductmv${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("add","mv");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("add","mv");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","新增 模块版本"+msg,"");
			 return false;
		 }
		 if($("#addproductmd${id_suffix}")._propAttr('checked')==false){
		 	if($("#moduleno${id_suffix}").combobox("getValues")==""||$("#moduleno${id_suffix}").combobox("getValues")==null){
				 $("#mainUrl").tabs("loaded");
			 	 $.messager.alert("提示","请选择模块！！！","");
				 $('#subsave${id_suffix}').linkbutton('enable');
				 return false;
		 	}
		 }
		 
		 //新增模块时 校验新增个数
		 if($("#addproductmd${id_suffix}")._propAttr('checked')){
			 debugger
				if($("#moduleno${id_suffix}").combobox("getValues")==""||$("#moduleno${id_suffix}").combobox("getValues")==null){
			//获取新增模块个数
			var mdLength=0;
			if($("#addobjectmd${id_suffix}").val().indexOf("*")!=-1){
				mdLength=$("#addobjectmd${id_suffix}").val().split(/\r?\n/).length-($("#addobjectmd${id_suffix}").val().split("*").length-1);
			}else{
				mdLength=$("#addobjectmd${id_suffix}").val().split(/\r?\n/).length;
			}
			
			if($("#addobjectmd${id_suffix}").length>0&&$("#addobjectmv${id_suffix}").length>0&&$("#addobjectmv${id_suffix}").val().split("*").length!=mdLength){
				 $("#mainUrl").tabs("loaded");
				 $.messager.alert("提示","新增模块个数和新增模块版本个数不匹配！！！","");
				 $('#subsave${id_suffix}').linkbutton('enable');
				 return false; 
			 }
			}
		 }else{
			 var addobject=$("#addobjectmv${id_suffix}").val();
			 var moduleno=$("#moduleno${id_suffix}").val(); 
			 if(addobject!=""){
				 if($("#addobjectmd${id_suffix}").val()==""||$("#addobjectmd${id_suffix}").val()==null){
				 if(addobject.split("*").length!=moduleno.split(",").length){
					 $("#mainUrl").tabs("loaded");
					 $.messager.alert("提示","模块和新增模块版本含*对应的条数不一致！！！","");
					 $('#subsave${id_suffix}').linkbutton('enable');
					 return false;
				 }
				 }else{
					 if($("#moduleno${id_suffix}").combobox("getValues")==""||$("#moduleno${id_suffix}").combobox("getValues")==null){
					 if($("#addobjectmd${id_suffix}").length>0 && addobject.split("*").length!=$("#addobjectmd${id_suffix}").val().split(/\r?\n/).length){
						 $("#mainUrl").tabs("loaded");
						 $.messager.alert("提示","新增模块和新增模块版本含*对应的条数不一致！！！","");
						 $('#subsave${id_suffix}').linkbutton('enable');
						 return false;
					 } 
					 }
				 }
			 } 
			 
		 }
		 if($("#addobjectmv${id_suffix}").val()==""||$("#addobjectmv${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的模块版本中文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		 
		 if($("#addengobjectmv${id_suffix}").val()==""||$("#addengobjectmv${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","要新增的模块版本英文名称不能为空！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }
		
		 if($("#addobjectmv${id_suffix}").length>0&&$("#addengobjectmv${id_suffix}").length>0&&$("#addobjectmv${id_suffix}").val().split(/\r?\n/).length!=$("#addengobjectmv${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
    		 $.messager.alert("提示","新增的模块版本中文名称与英文名称个数不匹配，请修改后再操作！！！","");
    		 $('#subsave${id_suffix}').linkbutton('enable');
    		 return false;
		 }	
		 //不允许新增模块版本的同时删除所对应的模块
		 if( $("#delproductmd${id_suffix}")._propAttr('checked')){
			 if($("#moduleno${id_suffix}").combobox("getValues")==$("#objectnoDelSelmd${id_suffix}").combobox("getValues")){
				 $("#mainUrl").tabs("loaded");
	    		 $.messager.alert("提示","不允许新增模块版本的同时删除所对应的模块！！！","");
	    		 $('#subsave${id_suffix}').linkbutton('enable');
	    		 return false;
			 }
		 }
	 }
	 if( $("#editproductmv${id_suffix}")._propAttr('checked')){
		//校验名称重复
		 var msg=validateData${id_suffix}("edit","mv");
		 if(msg==null){
			   msg=validateDataNull${id_suffix}("edit","mv");
		 }
		 if(msg!=null){
			 $.messager.alert("提示","修改 模块版本"+msg,"");
			 return false;
		 }
		 if($("#objectnoSelEditmv${id_suffix}").combobox("getValues")==""||$("#objectnoSelEditmv${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","请选择要修改的模块版本信息！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjectmv${id_suffix}").val()==""||$("#editobjectmv${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的模块版本中文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editengobjectmv${id_suffix}").val()==""||$("#editengobjectmv${id_suffix}").val()==null){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","要修改的模块版本英文名称不能为空！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }
		 if($("#editobjectmv${id_suffix}").length>0&&$("#editengobjectmv${id_suffix}").length>0&&$("#editobjectmv${id_suffix}").val().split(/\r?\n/).length!=$("#editengobjectmv${id_suffix}").val().split(/\r?\n/).length){
			 $("#mainUrl").tabs("loaded");
			 $.messager.alert("提示","新增的模块版本中文名称与英文名称个数不匹配，请修改后再操作！！！","");
			 $('#subsave${id_suffix}').linkbutton('enable');
			 return false;
		 }	
	}
	if( $("#delproductmv${id_suffix}")._propAttr('checked')){
		if($("#objectnoDelSelmv${id_suffix}").combobox("getValues")==""||$("#objectnoDelSelmv${id_suffix}").combobox("getValues")==null){
			 $("#mainUrl").tabs("loaded");
	  		 $.messager.alert("提示","请选择要停用的模块版本信息！！！","");
	  		 $('#subsave${id_suffix}').linkbutton('enable');
	  		 return false;
		}
	}
	
	return true;
}

//复选框赋值
function setTypeValue${id_suffix}(){
	 //基线版本
	 if( $("#addproductbl${id_suffix}").prop("checked")){
		 $("#addproductbl${id_suffix}").val("1");
		 //设置父版本和基线版本号
		 if(($("#addparentitemno${id_suffix}")!=null||$("#addparentitemno${id_suffix}")!="") && $("#addparentitemno${id_suffix}").val().indexOf("\n")!=-1){
		    	var parentTmp="";
		    		 for (var i = 0; i < $("#addparentitemno${id_suffix}").val().split(/\r?\n/).length; i++) {
		    			 if(i == $("#addparentitemno${id_suffix}").val().split(/\r?\n/).length-1){
		    			if($("#addparentitemno${id_suffix}").val().split(/\r?\n/)[i]!=""){
		    			 parentTmp+=$("#addparentitemno${id_suffix}").val().split(/\r?\n/)[i];
		    			}else{
		    				 parentTmp+="*";
		    			}
		    			 }else{
		    				 if($("#addparentitemno${id_suffix}").val().split(/\r?\n/)[i]!=""){
				    			 parentTmp+=$("#addparentitemno${id_suffix}").val().split(/\r?\n/)[i]+"\r\n";
				    			}else{
				    				 parentTmp+="*\r\n";
				    			}
		    			 }
					}
		    		 $("#addparentitemno${id_suffix}").val(parentTmp);
		    	 }
		    	 if(($("#addbaseline1${id_suffix}")!=null||$("#addbaseline1${id_suffix}")!="") && $("#addbaseline1${id_suffix}").val().indexOf("\n")!=-1){
		         	var baseline1Tmp="";
		         		 for (var i = 0; i < $("#addbaseline1${id_suffix}").val().split(/\r?\n/).length; i++) {
		         			 if(i == $("#addbaseline1${id_suffix}").val().split(/\r?\n/).length-1){
		         			 if($("#addbaseline1${id_suffix}").val().split(/\r?\n/)[i]!=""){
		         				baseline1Tmp+=$("#addbaseline1${id_suffix}").val().split(/\r?\n/)[i];
		         			}else{
		         				baseline1Tmp+="*";
		         			}
		         			 }else{
		         				if($("#addbaseline1${id_suffix}").val().split(/\r?\n/)[i]!=""){
			         				baseline1Tmp+=$("#addbaseline1${id_suffix}").val().split(/\r?\n/)[i]+"\r\n";
			         			}else{
			         				baseline1Tmp+="*\r\n";
			         			}
		         			 }
		 				}
		         		 $("#addbaseline1${id_suffix}").val(baseline1Tmp);
		        }
	 }
	 if( $("#editproductbl${id_suffix}")._propAttr('checked')){
		 $("#editproductbl${id_suffix}").val("2");
		 debugger
		//设置父版本和基线版本号
		 if(($("#editparentitemno${id_suffix}")!=null||$("#editparentitemno${id_suffix}")!="") && $("#editparentitemno${id_suffix}").val().indexOf("\n")!=-1){
		    	var editparentTmp="";
		    		 for (var i = 0; i < $("#editparentitemno${id_suffix}").val().split(/\r?\n/).length; i++) {
		    			if(i == $("#editparentitemno${id_suffix}").val().split(/\r?\n/).length-1){
		    				 if($("#editparentitemno${id_suffix}").val().split(/\r?\n/)[i]!=""){
				    				editparentTmp+=$("#editparentitemno${id_suffix}").val().split(/\r?\n/)[i];
				    			}else{
				    				editparentTmp+="*";
				    			}
		    			}else{
		    			 if($("#editparentitemno${id_suffix}").val().split(/\r?\n/)[i]!=""){
		    				editparentTmp+=$("#editparentitemno${id_suffix}").val().split(/\r?\n/)[i]+"\r\n";
		    			}else{
		    				editparentTmp+="*\r\n";
		    			}
		    			}
					}
		    		 $("#editparentitemno${id_suffix}").val(editparentTmp);
		    	 }
		    	 if(($("#editbaseline1${id_suffix}")!=null||$("#editbaseline1${id_suffix}")!="") && $("#editbaseline1${id_suffix}").val().indexOf("\n")!=-1){
		         	var editbaseline1Tmp="";
		         		 for (var i = 0; i < $("#editbaseline1${id_suffix}").val().split(/\r?\n/).length; i++) {
		         			if(i ==$("#editbaseline1${id_suffix}").val().split(/\r?\n/).length-1){
		         			if($("#editbaseline1${id_suffix}").val().split(/\r?\n/)[i]!=""){
		         				editbaseline1Tmp+=$("#editbaseline1${id_suffix}").val().split(/\r?\n/)[i];
		         			}else{
		         				editbaseline1Tmp+="*";
		         			}
		         			}else{
		         				if($("#editbaseline1${id_suffix}").val().split(/\r?\n/)[i]!=""){
			         				editbaseline1Tmp+=$("#editbaseline1${id_suffix}").val().split(/\r?\n/)[i]+"\r\n";
			         			}else{
			         				editbaseline1Tmp+="*\r\n";
			         			}
		         			}
		 				}
		         		 $("#editbaseline1${id_suffix}").val(editbaseline1Tmp);
		        }
	 }
	if( $("#delproductbl${id_suffix}")._propAttr('checked')){
		$("#delproductbl${id_suffix}").val("3");
	}
	//特性
	 if( $("#addproductft${id_suffix}")._propAttr('checked')){
		 $("#addproductft${id_suffix}").val("1");
		 $("#type00${id_suffix}").val("1");
	 }
	 if( $("#editproductft${id_suffix}")._propAttr('checked')){
		 $("#editproductft${id_suffix}").val("2");
		 $("#type01${id_suffix}").val("1");
	 }
	if( $("#delproductft${id_suffix}")._propAttr('checked')){
		$("#delproductft${id_suffix}").val("3");
		$("#type02${id_suffix}").val("1");
	}
	//子特性
	 if( $("#addproductsf${id_suffix}")._propAttr('checked')){
		 $("#addproductsf${id_suffix}").val("1");
		$("#type10${id_suffix}").val("2");
		
	 }
	 if( $("#editproductsf${id_suffix}")._propAttr('checked')){
		 $("#editproductsf${id_suffix}").val("2");
		 $("#type11${id_suffix}").val("2");
		 }
	if( $("#delproductsf${id_suffix}")._propAttr('checked')){
		$("#delproductsf${id_suffix}").val("3");
		$("#type12${id_suffix}").val("2");
	}
	//项目组
	 if( $("#addproducttm${id_suffix}")._propAttr('checked')){
		 $("#addproducttm${id_suffix}").val("1");
		$("#type20${id_suffix}").val("3");
	 	}
	 if( $("#editproducttm${id_suffix}")._propAttr('checked')){
		 $("#editproducttm${id_suffix}").val("2");
		 $("#type21${id_suffix}").val("3");
		 }
	if( $("#delproducttm${id_suffix}")._propAttr('checked')){
		$("#delproducttm${id_suffix}").val("3");
		$("#type22${id_suffix}").val("3");
	}
	//子系统
	 if( $("#addproductss${id_suffix}")._propAttr('checked')){
		 $("#addproductss${id_suffix}").val("1");
		$("#type30${id_suffix}").val("4");
	 	}
	 if( $("#editproductss${id_suffix}")._propAttr('checked')){
		 $("#editproductss${id_suffix}").val("2");
		 $("#type31${id_suffix}").val("4");
		 }
	if( $("#delproductss${id_suffix}")._propAttr('checked')){
		$("#delproductss${id_suffix}").val("3");
		$("#type32${id_suffix}").val("4");
	}
	//模块
	 if( $("#addproductmd${id_suffix}")._propAttr('checked')){
		 $("#addproductmd${id_suffix}").val("1");
		$("#type40${id_suffix}").val("5");
	 	}
	 if( $("#editproductmd${id_suffix}")._propAttr('checked')){
		 $("#editproductmd${id_suffix}").val("2");
		 $("#type41${id_suffix}").val("5");
		 }
	if( $("#delproductmd${id_suffix}")._propAttr('checked')){
		$("#delproductmd${id_suffix}").val("3");
		$("#type42${id_suffix}").val("5");
	}
	//模块版本
	 if( $("#addproductmv${id_suffix}")._propAttr('checked')){
		 $("#addproductmv${id_suffix}").val("1");
		$("#type50${id_suffix}").val("6");
	 	}
	 if( $("#editproductmv${id_suffix}")._propAttr('checked')){
		 $("#editproductmv${id_suffix}").val("2");
		 $("#type51${id_suffix}").val("6");
		 }
	if( $("#delproductmv${id_suffix}")._propAttr('checked')){
		$("#delproductmv${id_suffix}").val("3");
		$("#type52${id_suffix}").val("6");
	}
}
//同意  录入对象表   不同意 返回
function check${id_suffix}(result,name){
/* 	$.messager.confirm('', '确认是否操作?', function(r){
        if(r){ */
        	$("#mainUrl").tabs("loading","处理中...");
            var paramsuggestion = $("#pdtSuggestion${id_suffix}").val();
            if(result=="0"&&(paramsuggestion==""||paramsuggestion==null)){
            	 $("#mainUrl").tabs("loaded");
            	 $.messager.alert('提示',"审批意见不能为空！！！");
            	 return false;
            }
            var param = {
                "checkDate":"pdtFilltime",
                "checkPerson":"pdtFillname",
                "checkResult":result,
                "checkResultForRole":{
                    "resultName":"checkresult",
                    "resultValue":result
                },
                "checkOpinionForRole":{
                    "opinionName":"pdtSuggestion",
                    "opinionValue":paramsuggestion
                }
            };
            $.ajax({
                type: "POST",
                url: "/basicinfo/prBelowApply/check/${entity.id}/${taskId}",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(param),
                dataType: "json",
                success: function (message) {
                	$("#mainUrl").tabs("loaded");
                    if (message.status == 200) {
                    	 if(window.location.href.indexOf('eipLogin') > -1){
                         	 var data = {};
                         	 data.Code = 11;
                         	 data.Msg = "审批成功";
                         	 PM.send(top.window.parent, "fromSource", data); 
                         	 }else{
                       // $.messager.alert("提示","审批成功","");
                        var tab = $('#mainUrl').tabs('getSelected');
							var index = $('#mainUrl').tabs('getTabIndex', tab);
							$("#mainUrl").tabs("close", index)
                         	 }
                       
                    }else{
                    	 if(window.location.href.indexOf('eipLogin') > -1){
  		               		var data = {};
                    	 		data.Code = 0;
                    	 		data.Msg = "审批失败";
         	           	 PM.send(top.window.parent, "fromSource", data);
                 			 
                 		 }else{
                        $.messager.alert("提示","审批失败","");
                 		 }
                    }
                    
                },
                error: function (message) {
                    //alert("审批失败");
                    $.messager.alert("提示","审批失败","");
                    $("#mainUrl").tabs("loaded");
                }
            });
      /*   }
	  }); */
}


//选择版本 赋值下拉框  简化操作
function selectComboboxProject${id_suffix}(){
	$('#btn_test${id_suffix}').val(1);
	$('#btn_test1${id_suffix}').val(1);
	$('#btn_test2${id_suffix}').val(1);
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
			           
			           {title:'IPMT',field:'plipmt',width:'15%', formatter:formatProgress${id_suffix}},
			           {title:'研发产品线',field:'prodline',width:'15%', formatter:formatProgress${id_suffix}},    
			           {title:'PDT',field:'pdt',width:'15%'}, 
			           {title:'产品',field:'product',width:'15%', formatter:formatProgress${id_suffix}},    
			           {title:'产品V级',field:'version',width:'12%', formatter:formatProgress${id_suffix}},
			           {title:'产品R级内码',field:'releaseno',width:'9%',formatter:formatProgress${id_suffix}}, 
			           {title:'产品R级中文名称',field:'release',width:'15%', formatter:formatProgress${id_suffix}}
			           
			       ]],
			height : window.innerHeight
					- window.innerHeight * 0.28,
					fitColumns : false,
			onBeforeExpand : function(row) {//异步架加载树
				var url = "product/data/prdata";
				$("#selparentrelease${id_suffix}").treegrid("options").url = url;
				return true;
			},onDblClickRow : function(rowData) {
				
				//根据选中的版本、路标版本查询下面的特性、子特性赋值
				if(rowData!=null&&rowData.plipmtno.indexOf('_')!=-1&&rowData.plipmtno.indexOf('PR')!=-1){
					$('#winparentrelease${id_suffix}').window("close");
 					for (var i = rowData.plipmtno.split('_').length-1; i>=0 ; i--) {
 						
						if(rowData.plipmtno.split('_')[i].indexOf('PI')!=-1){
							$("#plipmtno${id_suffix}").combobox('setValue',rowData.plipmtno.split('_')[i]); 
						}
						if(rowData.plipmtno.split('_')[i].indexOf('PL')!=-1){
							$("#prodlineno${id_suffix}").combobox('setValue',rowData.plipmtno.split('_')[i]); 
						}
						if(rowData.plipmtno.split('_')[i].indexOf('PP')!=-1){
							$("#productno${id_suffix}").combobox('setValue',rowData.plipmtno.split('_')[i]); 
						}
						if(rowData.plipmtno.split('_')[i].indexOf('PV')!=-1){
							$("#versionno${id_suffix}").combobox('setValue',rowData.plipmtno.split('_')[i]); 
						}
						if(rowData.plipmtno.split('_')[i].indexOf('PR')!=-1){
							//如果选择框的值和原下拉值一致，清空
							if($("#releaseno${id_suffix}").combobox('getValue')==rowData.plipmtno.split('_')[i])
								{
					    	$('#btn_test${id_suffix}').val(0);
					    	$('#btn_test1${id_suffix}').val(0);
					    	$('#btn_test2${id_suffix}').val(0);
								}
							$("#releaseno${id_suffix}").combobox('setValue',rowData.plipmtno.split('_')[i]); 
							
						}
					}
				}else{
					$.messager.alert("提示","请选择要添加的R级数据！！！","");
				}
			},toolbar : [{
	     			id : 'addSelectProjectRelease${id_suffix }',
	     			text : '确定',
	     			handler : function() {
	     				
	     				//根据选中项赋值
	     				var rowData=$("#selparentrelease${id_suffix}").treegrid("getSelected");
	     				if(rowData!=null&&rowData.plipmtno.indexOf('_')!=-1&&rowData.plipmtno.indexOf('PR')!=-1){
	     					$('#winparentrelease${id_suffix}').window("close");
	     					for (var i = rowData.plipmtno.split('_').length-1; i>=0 ; i--) {
 		  						
 		 						if(rowData.plipmtno.split('_')[i].indexOf('PI')!=-1){
 		 							$("#plipmtno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
 		 						}
 		 						if(rowData.plipmtno.split('_')[i].indexOf('PL')!=-1){
 		 							$("#prodlineno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
 		 						}
 		 						if(rowData.plipmtno.split('_')[i].indexOf('PP')!=-1){
 		 							$("#productno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
 		 						}
 		 						if(rowData.plipmtno.split('_')[i].indexOf('PV')!=-1){
 		 							$("#versionno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
 		 						}
 		 						if(rowData.plipmtno.split('_')[i].indexOf('PR')!=-1){
 		 							
 		 						//如果选择框的值和原下拉值一致，清空
 									if($("#releaseno${id_suffix}").combobox('getValue')==rowData.plipmtno.split('_')[i])
 							    	{
 										$('#btn_test${id_suffix}').val(0);
 							    	$('#btn_test1${id_suffix}').val(0);
 							    	$('#btn_test2${id_suffix}').val(0);
 							    	}
 		 							$("#releaseno${id_suffix}").combobox('select',rowData.plipmtno.split('_')[i]); 
 		 						
 		 						}
 		 					}
	     					
	     				}else{
	     					$.messager.alert("提示","请选择要添加的R级数据！！！","");
	     				}
	     			}
			   },'-',
	 			  {
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


//版本搜索
function btnSearchRelease${id_suffix}(){
	//查询时初始化部分节点展开参数
	isExpandALl${id_suffix}=false;
	exeandAll_ID${id_suffix}='';
	var status=$('#projectStatu${id_suffix }').combobox('getValues');
	status=status.join(',');
	$("#selparentrelease${id_suffix}").treegrid("load",{
		searchParas : $("#searchParasRelease${id_suffix}").val(),
		projectStatus : status
	});
}

//校验是否有空值
function validateDataNull${id_suffix}(tag,type){
	var Arrstr1=new Array();
	var engArrstr1=new Array();
	 arrstr1 = $("#"+tag+"object"+type+"${id_suffix}").val().split("\n"); //split text into lines
	 engArrstr1= $("#"+tag+"engobject"+type+"${id_suffix}").val().split("\n"); //split text into lines
	 var arrstr3=new Array();
	 var engarrstr3=new Array();
	 for(var x=0;x<arrstr1.length;x++){
			if(arrstr1[x]==""){
				arrstr3[arrstr3.length]=arrstr1[x];
					//return arrstr1[x]+":中文名称不能为空值！"
			}
	 }
	 for(var x=0;x<engArrstr1.length;x++){
			if(engArrstr1[x]==""){
				engarrstr3[engarrstr3.length]=arrstr1[x];	
				//return arrstr1[x]+":英文名称不能为空值！"
			}
	 }
	 if(arrstr3.length>0){
		 return arrstr3+":中文名称不能为空值！";
	 }
	 if(engarrstr3.length>0){
		 return engarrstr3+":对应的英文名称不能为空值！";
	 }
}

//校验新增 修改是否存在相同数据
function validateData${id_suffix}(tag,type){
	var arrstr1=new Array();
	if($("#"+tag+"object"+type+"${id_suffix}").val().indexOf("*")!=-1){
		 var arrstr = $("#"+tag+"object"+type+"${id_suffix}").val().split("*"); 
		 var idex=0;
		 for (var i = 0; i < arrstr.length; i++) {
			 if(arrstr.indexOf("\n")!=-1){
			   for (var j = 0; j < arrstr[i].split("\n").length; j++) {
				   arrstr1[idex]=arrstr[i].split("\n")[j];
			   }
			 }
		}
	}else{
	 arrstr1 = $("#"+tag+"object"+type+"${id_suffix}").val().split("\n"); //split text into lines
	}
	var arrstr2=new Array();
	var arrstr3=new Array();
	var flag=true;
	for(var x=0;x<arrstr1.length;x++){
	for(var y=0;y<arrstr2.length;y++){
	if(arrstr1[x]==arrstr2[y]&&arrstr2[y]!='*'){
	flag=false;
	break;
	}
	}
	if(flag){
	arrstr2[arrstr2.length]=arrstr1[x];
	}else{
	flag=true;
	arrstr3[arrstr3.length]=arrstr1[x];
	}
	}
	if(arrstr3.length>0){
		return "中有重复的条目，请检查:"+arrstr3;
	}
}

//校验修改 停用是否存在相同的数据
function validateEditDelData${id_suffix}(type){
	//editobjectnooldft${id_suffix}
	//delobjectnoft${id_suffix}
	var editValue = $("#editobjectno"+type+"${id_suffix}").val().split("\n");
	var delValue = $("#delobjectno"+type+"${id_suffix}").val().split("\n");
	var flag=true;
	var arrstr2=new Array();
	var arrstr3=new Array();
	for (i = 0; i < editValue.length; i ++) {
		for(var y=0;y<delValue.length;y++){
	  	if(editValue[i] == delValue[y]) {
		  flag=false;
			break;
	 	 } 
		}
		 if(flag){
			delValue[delValue.length]=editValue[i];
		 }else{
			flag=true;
			arrstr3[arrstr3.length]=editValue[i];
		}
	}
			if(arrstr3.length>0){
				return "中有重复的条目，请检查:"+arrstr3;
			}
	
}


//删除当前流程
function delProcess${id_suffix}(id){
	$.ajax({
        type: "POST",
        url: "/basicinfo/prBelowApply/delProcess",
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
