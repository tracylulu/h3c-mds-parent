<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>人员信息修改</title>

</head>
<body>
<style>
	#tbl_pro${id_suffix} tr td,#tbl_People${id_suffix} tr td{
		height:28px;
		padding-left:10px;
	}
</style>
<div class="peopleC">
	<div>
		<div class="toptoolbar" style="position: fixed;">
			<c:if test="${currentNode=='userTask1' && isHandler || isEdit == 'editable'}">
				<a href="#" id="btnSave${id_suffix}" class="easyui-linkbutton" plain="true" data-options="iconCls:'fa fa-save'">保存</a>
			</c:if>
			<a href="#" id="btnFold${id_suffix}" class="easyui-linkbutton" plain="true" onclick="tabFlodOrOpen${id_suffix}(false)" data-options="iconCls:'fa fa-minus'">折叠</a>
			<a href="#" id="btnOpen${id_suffix}" class="easyui-linkbutton" plain="true" onclick="tabFlodOrOpen${id_suffix}(true)" data-options="iconCls:'fa fa-plus'">展开</a>
			<a href="#" id="btnCopy${id_suffix}" class="easyui-linkbutton" plain="true" onclick="copyLink('/basicinfo/peopleApply/edit/${id}','修改人员信息修改申请','${id}','${copyTitle}')" data-options="iconCls:'fa fa-files-o'">复制链接</a>
			<a href="#" id="btnDel${id_suffix}" class="easyui-linkbutton" plain="true" onclick="delProcess${id_suffix}()"
				data-options="iconCls:'fa fa-trash '">废弃</a>
		</div>
	</div>
	<!-- <div class="toptoolbarhr" style="margin-top: 2%;"></div> -->
	<br/>
	<br/>
	<p>
		<span class="title191030">${title}</span>
	</p>
	<div class="flow-content">
		<form id="peopleApply${id_suffix}" method='post'>
			<input id="applyID${id_suffix}" type="hidden" />
			<input id="processID${id_suffix}" type="hidden" />
			<input id="instanseId${id_suffix}" name="instanseId" type="hidden" />
			<input id="ipmtsecretary${id_suffix}" name="ipmtsecretary" type="hidden" />
			<input id="applycode${id_suffix}" name="applyCode" type="hidden" value="${code}" />
			<input id="process${id_suffix}" name="processCode" type="hidden" value="${code}" />
			<input id="isipmtcheck${id_suffix}" name="isipmtcheck" type="hidden" value="0" />
			<div style="font-size: 13px;">
				<table  cellspacing="0" width="100%" style="border-color: #ABABAB;  border:none;">
					<tr>
						<td width="20%">所处环节：&nbsp;
							<span style="color: #3A5FCD">${currentNodeDesc}</span>
							&nbsp;&nbsp;
						</td>
						<td width="20%">
							&nbsp;&nbsp;当前责任人：&nbsp;&nbsp;&nbsp;&nbsp;
							<span style="color: #3A5FCD"><ibds:userAccount account="${Handler}"/></span>
							&nbsp;&nbsp;
						</td>
						<td width="20%">
							&nbsp;&nbsp;当前状态描述：
							<span style="color: #3A5FCD">${currentNodeDesc}</span>
							&nbsp;&nbsp;
						</td>
						<td width="20%">
							&nbsp;&nbsp;单号：
							<span style="color: #3A5FCD">${code}<input type="hidden" value="${code}" name="code" />
							</span>
							&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</div>
			<br/>
			<h2 class="subfild" id="T00000-1-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-1-${id_suffix}')">
				<span>1.提出人员修改申请</span>
			</h2>
			<div id="SUBFORM-T00000-1-${id_suffix}">
				<div style="font-size: 13px; margin: 0px 20px">
					<!-- <span style="color: #f25aef; font-size: 17px;; margin: auto" width="98%">请先选择IPMT、研发产品线等产品信息：</span> -->
					<div style="margin-bottom: 10px;">
						<span>请选择要修改的人员所在的产品信息:</span>
						<span id="span_ra_${id_suffix}">
							<input type="radio" id="rd_IPMT${id_suffix}" name="pinfotype" value="PLIPMT" />
							IPMT&nbsp;
							<input type="radio" id="rd_ProdLine${id_suffix}" name="pinfotype" value="ProdLine" />
							产品线 &nbsp;
							<input type="radio" id="rd_PDT${id_suffix}" name="pinfotype" value="PDT" />
							PDT &nbsp;
							<input type="radio" id="rd_Version${id_suffix}" name="pinfotype" value="Version" />
							产品V级 &nbsp;
							<input type="radio" id="rd_Release${id_suffix}" name="pinfotype" value="Release" />
							产品R级（项目） &nbsp;
							<input type="radio" id="rd_BVersion${id_suffix}" name="pinfotype" value="BVersion" />
							产品B级
						</span>
					</div>
					<table class="" id="tbl_pro${id_suffix}" border="1" cellspacing="0" width="100%" style="margin: auto">
						<tr id="tr_IPMT${id_suffix}">
							<td width='25%'>
								IPMT:
								<input type="hidden" name="plipmtno" id="plipmtno${id_suffix}" />
								<input type="hidden" name="plipmt" id="plipmt${id_suffix}" />
								<input type="hidden" name="engplipmt" id="engplipmt${id_suffix}" />
								<button type="button" style="float: right" onclick="openTreePanel${id_suffix}('PI')">请选择</button>
							</td>
							<td width='25%'></td>
							<td width='25%'></td>
							<td width='25%'></td>
						</tr>
						<tr id="tr_ProdLine${id_suffix}">
							<td>
								产品线:
								<input type="hidden" name="prodlineno" id="prodlineno${id_suffix}" />
								<input type="hidden" name="prodline" id="prodline${id_suffix}" />
								<input type="hidden" name="engprodline" id="engprodline${id_suffix}" />
								<button type="button" style="float: right" onclick="openTreePanel${id_suffix}('PL')">请选择</button>
							</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr id="tr_PDT${id_suffix}">
							<td>
								PDT:
								<input type="hidden" name="pdtno" id="pdtno${id_suffix}" />
								<input type="hidden" name="pdt" id="pdt${id_suffix}" />
								<input type="hidden" name="engpdt" id="engpdt${id_suffix}" />
								<button type="button" style="float: right" onclick="openTreePanel${id_suffix}('PT')">请选择</button>
							</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr id="tr_Version${id_suffix}">
							<td>
								产品V级:
								<input type="hidden" name="versionno" id="versionno${id_suffix}" />
								<input type="hidden" name="version" id="version${id_suffix}" />
								<input type="hidden" name="engversion" id="engversion${id_suffix}" />
								<button type="button" class="button" style="float: right" onclick="openTreePanel${id_suffix}('PV')">请选择</button>
							</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr id="tr_Release${id_suffix}">
							<td>
								产品R级:
								<input type="hidden" name="releaseno" id="releaseno${id_suffix}" />
								<input type="hidden" name="release" id="release${id_suffix}" />
								<input type="hidden" name="engrelease" id="engrelease${id_suffix}" />
								<button type="button" style="float: right" onclick="openTreePanel${id_suffix}('PR')">请选择</button>
							</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
						<tr id="tr_BVersion${id_suffix}">
							<td>
								产品B级:
								<input type="hidden" name="bversionno" id="bversionno${id_suffix}" />
								<input type="hidden" name="bversion" id="bversion${id_suffix}" />
								<input type="hidden" name="engbversion" id="engbversion${id_suffix}" />
								<button type="button" style="float: right" onclick="openTreePanel${id_suffix}('PB')">请选择</button>
							</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</div>
				<br>
				<div style="margin: 1%">
					<div>
						<button type="button" id="btn_AddRow_${id_suffix}" onclick="addRow${id_suffix}()" class="easyui-linkbutton" data-options="" style="height: 28px;">增行</button>
					</div>
					<table id="tbl_People${id_suffix}" class="" border="1" cellspacing="0" width="100%" style="margin: auto">
						<tr>
							<td width="3%" style="background-color: #f5f5f5;">序号</td>
							<td width="23%" style="background-color: #f5f5f5;"></td>
							<td width="15%" style="background-color: #f5f5f5;">产品</td>
							<td width="15%" style="background-color: #f5f5f5;">人员角色名称</td>
							<td width="10%" class="hidden" style="background-color: #f5f5f5;">对应域名</td>
							<td width="18%" style="background-color: #f5f5f5;">原有人员名单</td>
							<td width="25%" style="background-color: #f5f5f5;">修改后的人员名单</td>
						</tr>
						<tr>
							<td>1</td>
							<td>
								<input type="hidden" name="proCode" />
								<input type="hidden" name="proName" />
								<input type="hidden" name="rolename" />
								<input type="hidden" name="columnname" />
								<input type="hidden" name="oldpeoples" />
								<button type="button" onclick="clearRoleRow${id_suffix}(this)" class="easyui-linkbutton" data-options="" style="height: 28px;">clear</button>
								<input type="checkbox" name="issync" value="1" />
								同步修改下级信息相同角色
							</td>
							<td></td>
							<td>
								<button type="button" onclick="openRolePanel${id_suffix}(1)">请选择</button>
							</td>
							<td class="hidden"></td>
							<td></td>
							<td style="heigth: 100%">
								<input type="text" name="newpeoples" class="auto_selusers_true" style="width: 60%; height: 28px;" />
								<button type="button" id="btn_Copy_${id_id_suffix}" onclick="copyLastRow${id_suffix}(this);" class="easyui-linkbutton" data-options="" style="height: 28px;">复制上一行人员</button>
							</td>
						</tr>

					</table>
				</div>
				<div style="margin: 1%">
					<div>
						备注:
						<input name="remark" style="width: 45%; height: 30px;" id="remark${id_suffix}" value="" size="30" type="" data-options="" class="easyui-textbox " />
						<a href="#" class="easyui-linkbutton" style="color: white; background-color: #3498DB; height: 30px; margin: 0PX 4% 0px 1%;" id="btnsubmit${id_suffix}" data-options="">提交</a>
						<span style="font-size: 14px;margin-left:1%">
							签名：
							<ibds:userAccount account="${subSign}" />
						</span>
						<span style="font-size: 14px; margin-left: 6%;">
							时间:
							<fmt:formatDate value="${submitDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						</span>
					</div>
					<%-- <table class="product" border="1" cellspacing="0" width="100%" style="margin: auto;">
						<tr>
							
							<td width="20%">
							<a href="#" class="easyui-linkbutton" style="margin-left: 5%;" id="btnsubmit${id_suffix}" data-options="">提交</a>
							<td>
							<td width="50%">
							<span style="font-size: 15px; margin: 1%">
						&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${subSign}"/>&nbsp;&nbsp;
						<span style="font-size: 15px; margin-left: 20%;">
							时间:
							<fmt:formatDate value="${submitDate}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
						</span>
					</span>
							</td>
						</tr>
					</table> --%>
				</div>
				<br>
			</div>			
			<h2 class="subfild" id="T00000-2-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-2-${id_suffix}')">
				<span>2.IPMT执行秘书审核并处理</span>
			</h2>
			<div id="SUBFORM-T00000-2-${id_suffix}">
				<div style="font-size: 13px; margin: 1%;">
					<div>

						审批意见:

						<input name="ipmtOpinion" style="width: 45%; height: 30px;" id="ipmtOpinion${id_suffix}" value="" size="30" data-options="readonly:true" class="easyui-textbox" />

						<a href="#" id="btn_IPMTAgree${id_suffix}" class=" easyui-linkbutton" onclick="check${id_suffix}('1','IPMT')" style="color: white; background-color: #3498DB; height: 30px; margin: 0PX 1% 0px 1%">同意</a>
						<a href="#" id="btn_IPMTBack${id_suffix}" class=" easyui-linkbutton" onclick="check${id_suffix}('0','IPMT')"  style="color: #3498DB; background-color: white; height: 30px;">驳回</a>
						<span style="font-size: 14px; margin-left: 4%">
							签名：
							<ibds:userAccount account="${IPMTSign}" />
						</span>
						<span style="font-size: 14px; margin-left: 6%;">
							时间:
							<fmt:formatDate value="${IPMTDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						</span>
					</div>					
				</div>
			</div>

		</form>
		<h2 class="subfild" id="T00000-3-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-3-${id_suffix}')">
			<span>管理区段</span>
		</h2>
		<div id="SUBFORM-T00000-3-${id_suffix}" style="display:none;height:40px;">
			<div style="float: left; width: 30%">
				<span>
					&nbsp;&nbsp;&nbsp;处理人：
					<input id="assign${id_suffix}" class="auto_selusers_false" value="" style="width: 300px !important" />
				</span>
				<input id="assign" value="" type="hidden" />
			</div>
			<div style="float: left; width: 70%; text-align: left;">
				<a href="#" class="easyui-linkbutton" id="btn_changeHandler${id_suffix}" style="color: white; background-color: #3498DB; margin-top: 10px;"
					onclick="changeHandler${id_suffix}()">修改当前处理人</a>
			</div>
		</div>
		<h2 class="subfild" id="T00000-4-${id_suffix}" onclick="tabShowOrHide('SUBFORM-T00000-4-${id_suffix}')" style="margin-top:10px;">
			<span>处理记录</span>
		</h2>
		<div id="SUBFORM-T00000-4-${id_suffix}" style="display:none;">
			<c:forEach var="processLog" items="${logs}">
				<div>
					<span>
						系统时间：
						<fmt:formatDate value="${processLog.checkDate}" pattern="yyyy-MM-dd HH:mm:ss" />
						&nbsp;&nbsp; <ibds:userAccount account="${processLog.checkAccount}"/>&nbsp;&nbsp; ${processLog.checkResult}&nbsp;&nbsp; 
						（意见：${processLog.checkOpion}&nbsp;&nbsp;）—》 ${processLog.checkStatus}&nbsp;&nbsp;
					</span>
				</div>
			</c:forEach>
			<br>
			<hr>
		</div>
		
	</div>
	<br />
	<br />
	<br />
	<div id="winparentPro${id_suffix}" title="产品信息" style="display: none; min-width: 200px; min-height: 350px; width: 30%;">
		<div style="overflow-y: scroll; min-height: 280px; max-height: 400px;">
			<input type="hidden" id="hid_type${id_suffix}" />
			<table id="tbl_ProSelect${id_suffix}" class="easyui-datagrid" data-options=""></table>
		</div>
		<%-- <div>
			<button type="button" onclick="gridConfirm${id_suffix}()">确定</button>
			<button type="button" onclick="$('#winparentPro${id_suffix}').window('close');">取消</button>
		</div> --%>
	</div>
	<div id="winparentB${id_suffix}" title="产品信息" style="display: none; min-width: 200px; min-height: 350px; width: 40%;">
		<div style="overflow-y: scroll; min-height: 280px; max-height: 400px;">
			<table id="tbl_B${id_suffix}" class="easyui-treegrid" data-options=""></table>
		</div>
		<%-- <div>
			<button type="button" onclick="treeConfirm${id_suffix}()">确定</button>
			<button type="button" onclick="$('#winparentB${id_suffix}').window('close');">取消</button>
		</div> --%>
	</div>
	<div id="winparentRole${id_suffix}" title="角色信息" style="display: none; min-width: 200px; min-height: 350px; width: 30%;">
		<div style="overflow-y: scroll; min-height: 280px; max-height: 400px;">
			<input type="hidden" id="hid_Index${id_suffix}" />
			<table id="tbl_Role${id_suffix}" class="easyui-datagrid"></table>
		</div>
		<%-- <div>
			<button type="button" onclick="roleConfirm${id_suffix}()">确定</button>
			<button type="button" onclick="$('#winparentRole${id_suffix}').window('close');">取消</button>
		</div> --%>
	</div>
	</div>
	<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
	<link rel="stylesheet" type="text/css" href="common/css/bds.css" />
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<!-- <script type="text/javascript" src="common/js/peopleAutocomplete.js"></script> -->
	<style type="text/css">
/* .product {
	border-collapse: collapse;
	border-spacing: 0;
	border-left: 1px solid #888;
	border-top: 1px solid #888;;
	border-bottom: 1px solid #888
}

.product td {
	border-right: 1px solid #888;
	border-bottom: 1px solid #888;
	padding: 5px 15px;
} */
</style>
	<script>
		$(function(){	
			String.prototype.myReplace=function(f,e){
			    var reg=new RegExp(f,"g");
			    return this.replace(reg,e); 
			}
			pageControl${id_suffix}();
			setTabFlodOrOpen('T00000-1-${id_suffix}',true);
			setTabFlodOrOpen('T00000-2-${id_suffix}',true);
			setTabFlodOrOpen('T00000-3-${id_suffix}',false);
			setTabFlodOrOpen('T00000-4-${id_suffix}',false);
			//绑定radiobutton事件
			initRadioClick${id_suffix}();			
			
			var id = "${id}";
			if (id!=null&&id!=undefined&&id!='') {
				$("#mainUrl").tabs("loading","loading...");
				
				$.post('/basicinfo/peopleApply/getByID/'+id, function(result) {
					$('#peopleApply${id_suffix}').form('load', result.data);
					$("#applyID${id_suffix}").val(result.data.id);
					$("#processID${id_suffix}").val(result.data.processid);
					//$('#tbl_Sn${id_suffix}').datagrid('reload',{diffid:id});	
					if(result.data.pinfotype=="PLIPMT"){
						$("#tbl_pro${id_suffix}").children().children("tr").hide();
						$("#tr_IPMT${id_suffix}").show();
					}else if(result.data.pinfotype=="ProdLine"){
						$("#tbl_pro${id_suffix}").children().children("tr").hide();
						$("#tr_IPMT${id_suffix}").show();
						$("#tr_ProdLine${id_suffix}").show();
					}else if(result.data.pinfotype=="PDT"){
						$("#tbl_pro${id_suffix}").children().children("tr").hide();
						$("#tr_IPMT${id_suffix}").show();
						$("#tr_PDT${id_suffix}").show();
					}else if(result.data.pinfotype=="Version"){
						$("#tbl_pro${id_suffix}").children().children("tr").hide();
						$("#tr_IPMT${id_suffix}").show();
						$("#tr_Version${id_suffix}").show();						
					}else if(result.data.pinfotype=="Release"){
						$("#tbl_pro${id_suffix}").children().children("tr").hide();
						$("#tr_IPMT${id_suffix}").show();
						$("#tr_PDT${id_suffix}").show();
						$("#tr_Release${id_suffix}").show();
					}else if(result.data.pinfotype=="BVersion"){
						$("#tbl_pro${id_suffix}").children().children("tr").hide();
						$("#tr_IPMT${id_suffix}").show();
						$("#tr_PDT${id_suffix}").show();
						$("#tr_Release${id_suffix}").show();
						$("#tr_BVersion${id_suffix}").show();
					}
					
					if(result.data.plipmtno!=null&&result.data.plipmtno!=""){
						var arr_td=$("#tr_IPMT${id_suffix}").children();	
						$(arr_td[1]).html(result.data.plipmtno.myReplace(',','<br/>'));		
						$(arr_td[2]).html(result.data.plipmt.myReplace(',','<br/>'));	
						$(arr_td[3]).html(result.data.engplipmt.myReplace(',','<br/>'));
					}
					if(result.data.prodlineno!=null&&result.data.prodlineno!=""){
						var arr_td=$("#tr_ProdLine${id_suffix}").children();	
						$(arr_td[1]).html(result.data.prodlineno.myReplace(',','<br/>'));		
						$(arr_td[2]).html(result.data.prodline.myReplace(',','<br/>'));	
						$(arr_td[3]).html(result.data.engprodline.myReplace(',','<br/>'));
					}
					if(result.data.pdtno!=null&&result.data.pdtno!=""){
						var arr_td=$("#tr_PDT${id_suffix}").children();	
						$(arr_td[1]).html(result.data.pdtno.myReplace(',','<br/>'));		
						$(arr_td[2]).html(result.data.pdt.myReplace(',','<br/>'));	
						$(arr_td[3]).html(result.data.engpdt.myReplace(',','<br/>'));
					}
					if(result.data.versionno!=null&&result.data.versionno!=""){
						var arr_td=$("#tr_Version${id_suffix}").children();	
						$(arr_td[1]).html(result.data.versionno.myReplace(',','<br/>'));		
						$(arr_td[2]).html(result.data.version.myReplace(',','<br/>'));	
						$(arr_td[3]).html(result.data.engversion.myReplace(',','<br/>'));
					}
					if(result.data.releaseno!=null&&result.data.releaseno!=""){
						var arr_td=$("#tr_Release${id_suffix}").children();	
						$(arr_td[1]).html(result.data.releaseno.myReplace(',','<br/>'));		
						$(arr_td[2]).html(result.data.release.myReplace(',','<br/>'));	
						$(arr_td[3]).html(result.data.engrelease.myReplace(',','<br/>'));
					}
					if(result.data.bversionno!=null&&result.data.bversionno!=""){
						var arr_td=$("#tr_BVersion${id_suffix}").children();	
						$(arr_td[1]).html(result.data.bversionno.myReplace(',','<br/>'));		
						$(arr_td[2]).html(result.data.bversion.myReplace(',','<br/>'));	
						$(arr_td[3]).html(result.data.engbversion.myReplace(',','<br/>'));
					}
					if(result.data.remark!=null){
						$('#remark${id_suffix}').parents('td').find('input').attr('title',result.data.remark);
					}
					if(result.data.ipmtOpinion!=null){
						$('#ipmtOpinion${id_suffix}').parents('td').find('input').attr('title',result.data.ipmtOpinion);
					}
					
					$("#mainUrl").tabs("loaded");
				}); 
				
				$.post('/basicinfo/peopleApply/getByPid',{pid:id}, function(result) {
					if(result.data.length>0){
						initRoleTableForLoad${id_suffix}(1,0,result.data,result.data[0].procode,result.data[0].proname)
					}		
				});
			}else{
				if($("#span_ra_${id_suffix}").find("[name='pinfotype']:checked").length==0){
					$("#rd_IPMT${id_suffix}").click();
					$("#tbl_pro${id_suffix}").children().children("tr").hide();
					$("#tr_IPMT${id_suffix}").show();
				}
				autoComplete${id_suffix}($("#tbl_People${id_suffix} tr:last td:last").find("input"));
			}
			
			$('#btnSave${id_suffix}').linkbutton({    
			    iconCls: 'fa fa-save',
			    onClick: postSaveDraft${id_suffix}
			});
			$('#btnsubmit${id_suffix}').linkbutton({    
			    iconCls: 'fa fa-save',
			    onClick: postSave${id_suffix}
			});
		});
		
		function pageControl${id_suffix}(){
			//无编辑权限，页面无法编辑
			if("${currentNode=='usertask1' && isHandler || isEdit == 'editable'}"=="true"){
				$("#btn_IPMTAgree${id_suffix}").hide();
				$("#btn_IPMTBack${id_suffix}").hide();
				if(('${state}'!=0&&'${state}'!=-1)||'${state}'==''){
					$("#btnDel${id_suffix}").hide();	
				}
			}else if("${currentNode=='usertask2' && isHandler || isEdit == 'editable'}"=="true"){
				$("#btnDel${id_suffix}").hide();
				$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");
				
				$("#span_ra_${id_suffix}").find("input").off("click");
				$("#span_ra_${id_suffix}").find("input").attr("disabled","disabled");
				$("#tbl_pro${id_suffix}").find("button").hide();
				$("#tbl_People${id_suffix}").find("button").hide();		
				$("#btn_AddRow_${id_suffix}").hide();
				$("#ipmtOpinion${id_suffix}").textbox({readonly:false});
				$("#btnsubmit${id_suffix}").hide();
			}else{
				$("#btnDel${id_suffix}").hide();
				$("#SUBFORM-T00000-1-${id_suffix}").children().find("input").attr("readonly","readonly");
				$("#SUBFORM-T00000-1-${id_suffix}").children().find("radio").off("click");
				$("#span_ra_${id_suffix}").find("input").off("click");
				$("#span_ra_${id_suffix}").find("input").attr("disabled","disabled");
				$("#btn_AddRow_${id_suffix}").hide();
				$("#tbl_pro${id_suffix}").find("button").hide();		
				$("#tbl_People${id_suffix}").find("button").hide();		
				$("#btn_IPMTAgree${id_suffix}").hide();
				$("#btn_IPMTBack${id_suffix}").hide();				
				$("#btnsubmit${id_suffix}").hide();
			}
			
			if('${isChangeUser}'!='true'){
				$("#btn_changeHandler${id_suffix}").parent("div").hide();
			}
		}
		
		//展开折叠所有  isOpen：true：默认展开，false：默认折叠
		function tabFlodOrOpen${id_suffix}(isOpen){
			$("#SUBFORM-T00000-1-${id_suffix}").toggle(isOpen);	
			$("#SUBFORM-T00000-2-${id_suffix}").toggle(isOpen);	
			$("#SUBFORM-T00000-3-${id_suffix}").toggle(isOpen);	
			$("#SUBFORM-T00000-4-${id_suffix}").toggle(isOpen);	
			setTabFlodOrOpen('T00000-1-${id_suffix}',isOpen);
			setTabFlodOrOpen('T00000-2-${id_suffix}',isOpen);
			setTabFlodOrOpen('T00000-3-${id_suffix}',isOpen);
			setTabFlodOrOpen('T00000-4-${id_suffix}',isOpen);
		}
		
		function tabShowOrHide(id){
			$("#"+id).toggle();	
			if($('#'+id).css('display')=='none'){
				setTabFlodOrOpen(id.replace('SUBFORM-',''),false);
			}else{
				setTabFlodOrOpen(id.replace('SUBFORM-',''),true);
			}
		}
		
		function clearProd${id_suffix}(){
			$("#tbl_pro${id_suffix} tr").each(function(i){
				$(this).find("input").val("");
				$(this).find("td:gt(0)").text("");				
			});
		}
		
		function clearRoleAll${id_suffix}(){
			$("#tbl_People${id_suffix} tr:gt(1)").remove();
			$("#tbl_People${id_suffix} tr:eq(1)").find("input").val("");
			var _RowTd=$("#tbl_People${id_suffix} tr:eq(1)").find("td");
			//$(obj).parents("tr").find("input").val("");
			$(_RowTd[2]).text("");
			var _td2Html=$(_RowTd[3]).html();
			var _html2=_td2Html.substring(_td2Html.indexOf("<"),_td2Html.length);
			
			$(_RowTd[3]).html('').append(""+_html2);					
			$(_RowTd[4]).text("");
			$(_RowTd[5]).text("");			
		}
		
		function initRadioClick${id_suffix}(){
			$("#rd_IPMT${id_suffix}").click(function(){
				if($(this).is(":checked")){;
					$("#tbl_pro${id_suffix}").children().children("tr").hide();
					$("#tr_IPMT${id_suffix}").show();
					clearProd${id_suffix}();
					clearRoleAll${id_suffix}();
				}
			});
			
			$("#rd_ProdLine${id_suffix}").click(function(){
				if($(this).is(":checked")){;
					$("#tbl_pro${id_suffix}").children().children("tr").hide();
					$("#tr_IPMT${id_suffix}").show();
					$("#tr_ProdLine${id_suffix}").show();
					clearProd${id_suffix}();
					clearRoleAll${id_suffix}();
				}
			});
			
			$("#rd_PDT${id_suffix}").click(function(){
				if($(this).is(":checked")){
					$("#tbl_pro${id_suffix}").children().children("tr").hide();
					$("#tr_IPMT${id_suffix}").show();
					$("#tr_PDT${id_suffix}").show();
					clearProd${id_suffix}();
					clearRoleAll${id_suffix}();
				}
			});
			
			$("#rd_Version${id_suffix}").click(function(){
				if($(this).is(":checked")){
					$("#tbl_pro${id_suffix}").children().children("tr").hide();
					$("#tr_IPMT${id_suffix}").show();
					$("#tr_Version${id_suffix}").show();
					clearProd${id_suffix}();
					clearRoleAll${id_suffix}();
				}
			});
			
			$("#rd_Release${id_suffix}").click(function(){
				if($(this).is(":checked")){
					$("#tbl_pro${id_suffix}").children().children("tr").hide();
					$("#tr_IPMT${id_suffix}").show();
					$("#tr_PDT${id_suffix}").show();
					$("#tr_Release${id_suffix}").show();
					clearProd${id_suffix}();
					clearRoleAll${id_suffix}();
				}
			});
			
			$("#rd_BVersion${id_suffix}").click(function(){
				if($(this).is(":checked")){
					$("#tbl_pro${id_suffix}").children().children("tr").hide();
					$("#tr_IPMT${id_suffix}").show();
					$("#tr_PDT${id_suffix}").show();
					$("#tr_Release${id_suffix}").show();
					$("#tr_BVersion${id_suffix}").show();
					clearProd${id_suffix}();
					clearRoleAll${id_suffix}()
				}
			});
		}
		
		function openTreePanel${id_suffix}(type){	
			if(type!="PB"&&type!="PR"){
				$('#winparentPro${id_suffix}').window({  
				    iconCls:"icon-save",
				    modal:true   
				}); 
				if(type!="PR"){
					initGrid${id_suffix}(type);
				}				
			}else{
				$('#winparentB${id_suffix}').window({  
				    iconCls:"icon-save",
				    modal:true   
				}); 
				if(type=="PB"){
				 	initTreeB${id_suffix}(type);
				}
				else if(type="PR"){
					initTree${id_suffix}(type)
				}				
			}
		}
	
		function initGrid${id_suffix}(type){
			var _titlename="", _titleengName="", _titlecode="", _titleurl="",isMuliti=false;
			var code="";
			$("#hid_type${id_suffix}").val(type);		
					
			if(type=="PI"){
				type="PI";		
				_titlename="IPMT中文名称";
				_titleengName="IPMT英文名称";
				_titlecode="编码";
				if($("#rd_IPMT${id_suffix}").is(":checked")){
					isMuliti=true;
				}
			}else if(type=="PL"){
				type="PL"
				code=$("#plipmtno${id_suffix}").val();
				_titlename="产品线中文名称";
				_titleengName="产品线英文名称";
				_titlecode="编码";
				if($("#rd_ProdLine${id_suffix}").is(":checked")){
					isMuliti=true;
				}
			}else if(type=="PT"){
				type="PT"
				code=$("#plipmtno${id_suffix}").val();
				_titlename="PDT中文名称";
				_titleengName="PDT英文名称";
				_titlecode="编码";
				if($("#rd_PDT${id_suffix}").is(":checked")){
					isMuliti=true;
				}
			}else if(type=="PV"){
				type="PV"
				code=$("#plipmtno${id_suffix}").val();
				_titlename="产品V级中文名称";
				_titleengName="产品V级英文名称";
				_titlecode="编码";
				if($("#rd_Version${id_suffix}").is(":checked")){
					isMuliti=true;
				}
			}		
				
			var  param={
				type: type,
				code: code
			}
				
			$("#tbl_ProSelect${id_suffix}").datagrid({
				fit: true,
				url:'/product/comboboxdata/getdataList', 
				toolbar : [ 
					{
						id : 'confirmPro${id_suffix }',
						text : '确定',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							gridConfirm${id_suffix}();				
						}
					},"-",
					{
						id : 'closePro${id_suffix }',
						text : '取消',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							$('#winparentPro${id_suffix}').window('close');
						}
					}
				],
				rownumbers : true,
				singleSelect : isMuliti?false:true,
				fitColumns:true,
				pagination : false,
				queryParams: param,			
			    columns:[[   
			    	{field:'id', checkbox:true,hidden:(isMuliti?false:true)},			    	
			        {field:'text',title:_titlename,width:100},
			        {field:'engtext',title:_titleengName,width:100},
			        {field:'value',title:_titlecode,width:100}
			    ]],
			    loadFilter:function(data){		    	
					if(data!=null&&data.length>0){	
						$.each(data,function(i,item){
							var arr=item.text.split('|');
							data[i].id=item.value;
							data[i].text=arr[0];
							data[i].engtext=arr[1];
						});
						return data;
					}
			    	return data;
				},
				onDblClickRow:function(index,row){
					$("#tbl_ProSelect${id_suffix}").datagrid("selectRow",index);
					gridConfirm${id_suffix}();		
				}
				/*  ,
				onCheck : function(row){
			        t = $(this);
			        opts = t.treegrid("options");
			        if (opts.checkOnSelect && opts.singleSelect) { return; }
			        var idField = opts.idField, id = row[idField], children, checked, parent = row;
			        //如果当前节点被勾选,那么勾选该节点的子节点
			        $.each(t.treegrid("getChildren", id), function (i, n) {
			             if (!t.treegrid("isChecked", n[idField])) { t.treegrid("check", n[idField]); }
			        });
				},
				onUncheck:function(row){
					
				} */
			});
		}
		
		function gridConfirm${id_suffix}(){
			var type=$("#hid_type${id_suffix}").val();
			var rows=new Array();
			rows=$("#tbl_ProSelect${id_suffix}").datagrid("getSelections");
			$("#tbl_ProSelect${id_suffix}").datagrid('clearSelections');

			if(rows==null||rows.length==0){				
				$.messager.alert("提示消息","请选择产品");
				return;
			}
			var arr_td=new Array();
			if(type=="PI"){
				arr_td=$("#tr_IPMT${id_suffix}").children();		
			}else if(type=="PL"){
				arr_td=$("#tr_ProdLine${id_suffix}").children();		
			}else if(type=="PT"){
				arr_td=$("#tr_PDT${id_suffix}").children();		
			}else if(type=="PV"){
				arr_td=$("#tr_Version${id_suffix}").children();		
			}
			/* else if(type=="PR"){
				arr_td=$("#tr_Release${id_suffix}").children();		
			}else if(type=="PB"){
				arr_td=$("#tr_BVersion${id_suffix}").children();		
			} */
			
			var _htmlCode="", _htmlName="", _htmlEngName="";
			
			$.each(rows,function(i,item){
				if(item.value==null||item.value==undefined) return true;
				if(_htmlCode==""){
					_htmlCode+=fomartStr${id_suffix}(item.value);
					_htmlName+=fomartStr${id_suffix}(item.text);
					_htmlEngName+=fomartStr${id_suffix}(item.engtext);
				
				}else{					
					_htmlCode+=","+fomartStr${id_suffix}(item.value);
					_htmlName+=","+fomartStr${id_suffix}(item.text);
					_htmlEngName+=","+fomartStr${id_suffix}(item.engtext);
				}
			});			
			
			$(arr_td[0]).find("[type='hidden']").val(_htmlCode);
			$(arr_td[0]).find("[type='hidden']").eq(1).val(_htmlName);
			$(arr_td[0]).find("[type='hidden']").eq(2).val(_htmlEngName);
			$(arr_td[1]).html(_htmlCode.myReplace(',','<br/>'));		
			$(arr_td[2]).html(_htmlName.myReplace(',','<br/>'));	
			$(arr_td[3]).html(_htmlEngName.myReplace(',','<br/>'));
			
			//清除下属层级
			clearData${id_suffix}(type);
						
			$('#winparentPro${id_suffix}').window('close');
		}
		
		function treeConfirm${id_suffix}(rows){
			
			var type=$("#hid_type${id_suffix}").val();
			var arr_td=new Array();
			if(rows==null){debugger
				rows=$("#tbl_B${id_suffix}").treegrid("getSelections"); 
			}
			
			if(type=="PB"){
				var arr_td=$("#tr_BVersion${id_suffix}").children();
			}else{
				var arr_td=$("#tr_Release${id_suffix}").children();
			}
						
			if(rows==null||rows.length==0){				
				$.messager.alert("提示消息","请选择产品");
				return;
			}			
						
			var _htmlCode="", _htmlName="", _htmlEngName="";
			if(type=="PB"){
				$.each(rows,function(i,item){
					if(item.bversionno==null||item.bversionno==undefined||item.bversionno=='')return true;
					if(_htmlCode==""){
						_htmlCode+=fomartStr${id_suffix}(item.bversionno);
						_htmlName+=fomartStr${id_suffix}(item.bversioncname);
						_htmlEngName+=fomartStr${id_suffix}(item.bversionename);
				
					}else{					
						_htmlCode+=","+fomartStr${id_suffix}(item.bversionno);
						_htmlName+=","+fomartStr${id_suffix}(item.bversioncname);
						_htmlEngName+=","+fomartStr${id_suffix}(item.bversionename);
					}				
				});
			}else{
				$.each(rows,function(i,item){		
					if(item.releaseno==null||item.releaseno==undefined||item.releaseno=='') return true;
					if(_htmlCode==""){
						_htmlCode+=fomartStr${id_suffix}(item.releaseno);
						_htmlName+=fomartStr${id_suffix}(item.release);
						_htmlEngName+= fomartStr${id_suffix}(item.engrelease);
				
					}else{					
						_htmlCode+=","+fomartStr${id_suffix}(item.releaseno);
						_htmlName+=","+fomartStr${id_suffix}(item.release);
						_htmlEngName+=","+fomartStr${id_suffix}(item.engrelease);
					}				
				});
			}
			
			String.prototype.myReplace=function(f,e){//吧f替换成e
			    var reg=new RegExp(f,"g"); //创建正则RegExp对象   
			    return this.replace(reg,e); 
			}
			$(arr_td[0]).find("[type='hidden']").eq(0).val(_htmlCode);
			$(arr_td[0]).find("[type='hidden']").eq(1).val(_htmlName);
			$(arr_td[0]).find("[type='hidden']").eq(2).val(_htmlEngName);
			$(arr_td[1]).html(_htmlCode.myReplace(',','<br/>'));		
			$(arr_td[2]).html(_htmlName.myReplace(',','<br/>'));	
			$(arr_td[3]).html(_htmlEngName.myReplace(',','<br/>'));
			
			$("#tbl_B${id_suffix}").treegrid('clearSelections');
			//清除下属层级
			clearData${id_suffix}(type);
			$('#winparentB${id_suffix}').window('close');
		}
		
		//清除下属层级
		function clearData${id_suffix}(type){
			
			if(type=="PI"){				
				clearTbl${id_suffix}($("#tr_ProdLine${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_PDT${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_Version${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_Release${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_BVersion${id_suffix}").children());
			}else if(type=="PL"){
				clearTbl${id_suffix}($("#tr_PDT${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_Version${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_Release${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_BVersion${id_suffix}").children());
			}else if(type=="PT"){
				clearTbl${id_suffix}($("#tr_Version${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_Release${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_BVersion${id_suffix}").children());
			}else if(type=="PV"){
				clearTbl${id_suffix}($("#tr_Release${id_suffix}").children());
				clearTbl${id_suffix}($("#tr_BVersion${id_suffix}").children());	
			}else if(type=="PR"){
				clearTbl${id_suffix}($("#tr_BVersion${id_suffix}").children());	
			}
			
			//清空角色table
			clearRoleAll${id_suffix}();
		}
		
		//清空当前tr行值
		function clearTbl${id_suffix}(arr_td){
			$(arr_td[0]).find("[type='hidden']").eq(0).val('');
			$(arr_td[0]).find("[type='hidden']").eq(1).val('');
			$(arr_td[0]).find("[type='hidden']").eq(2).val('');
			$(arr_td[1]).html('');		
			$(arr_td[2]).html('');	
			$(arr_td[3]).html('');
		}
		
		function fomartStr${id_suffix}(val){
			if(val==null||val==undefined)return '';
			
			return val;				
		}
		
		var isCheck${id_suffix}=false;
		
		function initTree${id_suffix}(type){
			$("#hid_type${id_suffix}").val(type);
			var isMuliti=false;
			if($("#rd_Release${id_suffix}").is(":checked")&&type=="PR"){
				isMuliti=true;
			}

			var url="/product/release/selectByMap";
						
			var param={
				code:$("#pdtno${id_suffix}").val()
			};
			$("#tbl_B${id_suffix}").treegrid({
				fit: true,
				toolbar : [ 
					{
						id : 'confirmPR${id_suffix }',
						text : '确定',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							treeConfirm${id_suffix}();				
						}
					},"-",
					{
						id : 'closePR${id_suffix }',
						text : '取消',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							$('#winparentB${id_suffix}').window('close');
						}
					}
				],
				idField : 'id',
				treeField : 'projectstatus',
			    url : url,
				method : 'post',
				queryParams: param,	
				collapsible : false,
				striped:true, 			
				fitColumns : true,
				expandAll:true,
				//checkbox:isMuliti,
				singleSelect : isMuliti? false:true,
				
			    columns:[[  
			    	{title:'编码',field:'id',hidden:isMuliti? false:true,checkbox:isMuliti,cascadeCheck : isMuliti}, 
			        {field:'projectstatus',title:'状态',width:60,formatter:function(value,row,index){
		        		if(value==undefined){return '';}
		        			return value;
		        		}
			    	},    
			    	{title:'产品R级内码',field:'releaseno'},    
			        {field:'release',title:'产品R级名称',width:80},    
			        {field:'engrelease',title:'产品R级英文名称',width:80},    
			       
			    ]],
			    loadFilter:function(data){    	
					if(data!=null&&data.length>0){	
						$.each(data,function(i,item){
							if(item.releaseno==null||item.releaseno==undefined){
								data[i].id=item.projectstatus;								
							}else{
								data[i].id=item.releaseno;								
							}
							
						});
						return data;
					}
			    	return data;
				},
				onDblClickRow:function(row){
					/* $("#tbl_B${id_suffix}").treegrid("select",row.id); */
					var sl_rows=[];
					sl_rows.push(row)
					treeConfirm${id_suffix}(sl_rows);		
				},
				onLoadSuccess : function(row, data) {
					if(row==null){
						$.each(data,function(i,item){
							$("#tbl_B${id_suffix}").treegrid("expand",item.id);
						});
					}
					
					//titleAppendCheckbox${id_suffix}();
				},
				onSelect:function(row){
					if(row!=null&&row.children!=undefined&&row.children!=null&&$("#tbl_B${id_suffix}").treegrid("getLevel")==0){
						$.each(row.children,function(i,item){
							$("#tbl_B${id_suffix}").treegrid("select",item.id);							
						})
					}
					return true;
				},
				onUnselect:function(row){
					if(row!=null&&row.children!=undefined&&row.children!=null&&$("#tbl_B${id_suffix}").treegrid("getLevel")==0){
						$.each(row.children,function(i,item){
							$("#tbl_B${id_suffix}").treegrid("unselect",item.id);							
						})
					}
					return true;
				}				
			});
		}		
		
		function initTreeB${id_suffix}(type){
			$("#hid_type${id_suffix}").val(type);
			
			var param={
				code:$("#releaseno${id_suffix}").val()
			};
			$("#tbl_B${id_suffix}").treegrid({
				fit: true,
				toolbar : [ 
					{
						id : 'confirmPB${id_suffix }',
						text : '确定',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							treeConfirm${id_suffix}();				
						}
					},"-",
					{
						id : 'closePB${id_suffix }',
						text : '取消',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							$('#winparentB${id_suffix}').window('close');
						}
					}
				],
				idField : 'id',
				treeField : 'projectstatus',
			    url : '/product/bversion/selectByMap',
				method : 'post',
				queryParams: param,	
				collapsible : false,
				striped:true, 			
				fitColumns : true,
				expandAll:true,
				//checkbox:true,
				singleSelect : false,
			    columns:[[  
			    	{field:'id',title:'编码',checkbox:true,cascadeCheck : true},	
			        {field:'projectstatus',title:'状态',width:60,formatter: function(value,row,index){
			        		if(value==undefined){return '';}
			        		return value;
			        	}   
			        },
			        {field:'bversionno',title:'产品B级内码'},   
			        {field:'bversioncname',title:'产品B级名称',width:80},    
			        {field:'bversionename',title:'产品B级英文名称',width:80},    
			         
			    ]],
			    loadFilter:function(data){		    	
					if(data!=null&&data.length>0){	
						$.each(data,function(i,item){
							if(item.bversionno==null||item.bversionno==undefined){
								data[i].id=item.projectstatus;								
							}else{
								data[i].id=item.bversionno;
							}							
						});
						return data;
					}
			    	return data;
				},
				onDblClickRow:function(row){
					/* $("#tbl_B${id_suffix}").treegrid("select",row.id); */
					var sl_rows=[];
					sl_rows.push(row)
					treeConfirm${id_suffix}(sl_rows);
					/* treeConfirm${id_suffix}(row);	 */
				},
				onLoadSuccess : function(row, data) {
					if(row==null){
						$.each(data,function(i,item){
							$("#tbl_B${id_suffix}").treegrid("expand",item.id);
						});
					}				
				},
				onSelect:function(row){
					if(row!=null&&row.children!=undefined&&row.children!=null&&$("#tbl_B${id_suffix}").treegrid("getLevel")==0){
						$.each(row.children,function(i,item){
							$("#tbl_B${id_suffix}").treegrid("select",item.id);							
						})
					}
					return true;
				},
				onUnselect:function(row){
					if(row!=null&&row.children!=undefined&&row.children!=null&&$("#tbl_B${id_suffix}").treegrid("getLevel")==0){
						$.each(row.children,function(i,item){
							$("#tbl_B${id_suffix}").treegrid("unselect",item.id);							
						})
					}
					return true;
				}
			});
		}		
		
		//打开选择角色弹出框
		function openRolePanel${id_suffix}(index){	
			
			var category=$("#span_ra_${id_suffix}").find("[name='pinfotype']:checked").val();
			var type="",code;
			if(category!=null&&category!=undefined){
				code=$("#"+category.toLowerCase()+"no${id_suffix}").val();
				if(code==null||code==""){
					$.messager.alert("提示消息","请先选择对应的产品！")
					return;
				}
			}else{
				$.messager.alert("提示消息","请先选择对应的产品！")
				return;
			}
			$('#winparentRole${id_suffix}').window({  
			    iconCls:"icon-save",
			    modal:true   
			});
			
			type=getType${id_suffix}(category);
			
			$("#hid_Index${id_suffix}").val(index);
			var param={
					type:type	
				}
			$("#tbl_Role${id_suffix}").datagrid({
				fit: true,
				toolbar : [ 
					{
						id : 'confirmRole${id_suffix }',
						text : '确定',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							roleConfirm${id_suffix}();				
						}
					},"-",
					{
						id : 'closeRole${id_suffix }',
						text : '取消',
						iconCls : 'tabs-icon fa fa-minus-square',
						handler : function() {
							$("#tbl_Role${id_suffix}").datagrid('clearSelections');
							$('#winparentRole${id_suffix}').window('close');
						}
					}
				],
				url:'/product/columnConfig/selectForReference',  
				rownumbers : true,
				singleSelect : true,
				fitColumns:true,
				pagination : false,
				queryParams: param,			
				columns:[[   
			    	{field:'id', hidden:true},			    	
			        {field:'columnname',title:'字段 名称',width:100},
			        {field:'columncode',title:'字段域名',hidden:true},
			        {field:'ipmtcheck',title:'是否需要IPMT秘书审批',width:100}
			    ]],
			    onDblClickRow:function(index,row){
			    	$("#tbl_Role${id_suffix}").datagrid("selectRow",index);
			    	roleConfirm${id_suffix}();	
				}
			});			
		}
		
		function getType${id_suffix}(category){
			var type="";
			switch(category){
				case "PLIPMT": type="PI";break;
				case "ProdLine": type="PL";break;
				case "PDT": type="PT";break;
				case "Version": type="PV";break;
				case "Release": type="PR";break;
				case "BVersion": type="PB";break;
			}
			return type;
		}
		
		function clearRoleRow${id_suffix}(obj){			
			var _RowTd=$(obj).parents("tr").find("td");
			$(obj).parents("tr").find("input").val("");
			$(_RowTd[2]).text("");
			var _td2Html=$(_RowTd[3]).html();
			var _html2=_td2Html.substring(_td2Html.indexOf("<"),_td2Html.length);
			
			$(_RowTd[3]).html('').append(""+_html2);					
			$(_RowTd[4]).text("");
			$(_RowTd[5]).text("");
		}
		
		//确认角色，返回字段信息并填充表格
		function roleConfirm${id_suffix}(){
			$("#mainUrl").tabs("loading","处理中...");
			var index=$("#hid_Index${id_suffix}").val();
			var category=$("#span_ra_${id_suffix}").find("[name='pinfotype']:checked").val();
			var code=$("#"+category.toLowerCase()+"no${id_suffix}").val();
			var name=$("#"+category.toLowerCase()+"${id_suffix}").val();
			var type=getType${id_suffix}(category);
			var rows=$("#tbl_Role${id_suffix}").datagrid("getSelections");
			$("#tbl_Role${id_suffix}").datagrid('clearSelections');
			if(rows==null||rows.length==0){
				$.messager.alert("提示信息","请选择角色信息");
				return;
			}
			$.post("/product/columnConfig/selectProByColumn",{type:type,code:code,column:rows[0].columncode},function(result){				
				var value=result.data;
				$('#winparentRole${id_suffix}').window('close');
				if(rows[0].ipmtcheck!=null&&rows[0].ipmtcheck==1){
					$("#isipmtcheck${id_suffix}").val("1");
				}
				initRoleTable${id_suffix}(index,code,name,value,rows[0].columncode,rows[0].columnname);
				$("#mainUrl").tabs("loaded");				
			})
		}
		
		/*  选择列表用
		* index:标记table第几行赋值,，code:本次修改人员的产品编码，name:本次修改人员的产品名称
		*  value:本次要修改人员的初始值（多个产品拼接）,columncode:本次修改的字段，columnname：修改的字段名称
		*/
		function initRoleTable${id_suffix}(index,code,name,value,columncode,columnname){
			var firstTR = $("#tbl_People${id_suffix} tr:eq(1) ").clone();   
			//当前相同的移除掉  空行也移除， 以后都在后面追加
			$("#tbl_People${id_suffix} tr:gt(0)").each(function(i){
				if($(this).find("[name='columnname']").val()==columncode||$(this).find("[name='columnname']").val()==""){
					$(this).remove();						
				}
			});			
			
			var _tr=$("#tbl_People${id_suffix} tr").eq(index);
			var _arrtd=$(_tr).find("td");
			
			if($("#tbl_People${id_suffix} tr").length==1){
				$("#tbl_People${id_suffix}").append(firstTR);
			}else{
				firstTR=$("#tbl_People${id_suffix} tr:last").clone();
				$("#tbl_People${id_suffix}").append(firstTR);
			}
			
			var _lastRowTd=$("#tbl_People${id_suffix} tr:last").find("td");
			var proCode="",proName="",roleName="",_columnname="",oldPerples="",newPeoples="";
			var isSync=false;
			//选择参照框加载
			proCode=code;
			proName=name;
			roleName=columnname;
			_column=columncode;
			oldPerples=formatStr(value);
			newPeoples=formatStr(value);
			
			$("#tbl_People${id_suffix} tr:last").find("[name='proCode']").val(proCode);
			$("#tbl_People${id_suffix} tr:last").find("[name='proName']").val(proName);
			$("#tbl_People${id_suffix} tr:last").find("[name='rolename']").val(roleName);
			
			$("#tbl_People${id_suffix} tr:last").find("[name='columnname']").val(_column);					
			$("#tbl_People${id_suffix} tr:last").find("[name='oldpeoples']").val(oldPerples);
			$("#tbl_People${id_suffix} tr:last").find("[name='newpeoples']").val(newPeoples);
			$("#tbl_People${id_suffix} tr:last").find("[name='issync']").prop("checked",isSync);
			
			$(_lastRowTd[2]).text(proName);
			var _td2Html=$(_lastRowTd[3]).html();
			var _html2=_td2Html.substring(_td2Html.indexOf("<"),_td2Html.length);
			
			$(_lastRowTd[3]).html('').append(roleName+_html2);					
			$(_lastRowTd[4]).text(_column);
			$(_lastRowTd[5]).text(formatStr(oldPerples));
			
			autoComplete${id_suffix}($("#tbl_People${id_suffix} tr:last td:last").find("input"));
			//重新拍行号 并绑定联想事件
			$("#tbl_People${id_suffix} tr:gt(0) ").each(function(i){
				$(this).find("td").eq(0).html(i+1);					
			});
		}
		
		/* 加载页面用
		* index:标记table第几行赋值,，code:本次修改人员的产品编码，name:本次修改人员的产品名称
		*  value:本次要修改人员的初始值（多个产品拼接）,columncode:本次修改的字段，columnname：修改的字段名称
		*/
		function initRoleTableForLoad${id_suffix}(type,index,data,columncode,columnname){
			var firstTR = $("#tbl_People${id_suffix} tr:eq(1) ").clone();   
			//当前相同的移除掉  空行也移除， 以后都在后面追加
			$("#tbl_People${id_suffix} tr:gt(0)").each(function(i){
				if($(this).find("[name='columnname']").val()==columncode||$(this).find("[name='columnname']").val()==""){
					$(this).remove();						
				}
			});			
			
			var _tr=$("#tbl_People${id_suffix} tr").eq(index);
			var _arrtd=$(_tr).find("td");
			
			$.each(data,function(i,item){	
				if(i==0){
					$("#tbl_People${id_suffix}").append(firstTR);
				}else{
					firstTR=$("#tbl_People${id_suffix} tr:last").clone();
					$("#tbl_People${id_suffix}").append(firstTR);
				}
				
				var _lastRowTd=$("#tbl_People${id_suffix} tr:last").find("td");
				var proCode="",proName="",roleName="",_columnname="",oldPerples="",newPeoples="";
				var isSync=false;
				proCode=item.procode;
				proName=item.proname;
				roleName=item.rolename;
				_column=item.columnname;
				oldPerples=formatStr(item.oldpeoples);
				newPeoples=formatStr(item.newpeoples);
				isSync=item.issync==1?true:false;
				
				$("#tbl_People${id_suffix} tr:last").find("[name='proCode']").val(proCode);
				$("#tbl_People${id_suffix} tr:last").find("[name='proName']").val(proName);
				$("#tbl_People${id_suffix} tr:last").find("[name='rolename']").val(roleName);
				
				$("#tbl_People${id_suffix} tr:last").find("[name='columnname']").val(_column);					
				$("#tbl_People${id_suffix} tr:last").find("[name='oldpeoples']").val(oldPerples);
				$("#tbl_People${id_suffix} tr:last").find("[name='newpeoples']").val(newPeoples);
				$("#tbl_People${id_suffix} tr:last").find("[name='issync']").prop("checked",isSync);
				
				$(_lastRowTd[2]).text(proName);
				var _td2Html=$(_lastRowTd[3]).html();
				var _html2=_td2Html.substring(_td2Html.indexOf("<"),_td2Html.length);
				
				$(_lastRowTd[3]).html('').append(roleName+_html2);					
				$(_lastRowTd[4]).text(_column);
				$(_lastRowTd[5]).text(formatStr(oldPerples));
				
				autoComplete${id_suffix}($("#tbl_People${id_suffix} tr:last td:last").find("input"));

			});
			//重新拍行号 并绑定联想事件
			$("#tbl_People${id_suffix} tr:gt(0) ").each(function(i){
				$(this).find("td").eq(0).html(i+1);					
			});
		}
		
		function formatStr(val){
			if(val==null||val==undefined){
				return "";
			}
			return val;
		}
		
		function getPeopleJson${id_suffix}(){
			var lstMerge=new Array();
			var lst=new Array();
			$("#tbl_People${id_suffix} tr:gt(0) ").each(function(i){
				var proCode=$(this).find("[name='proCode']").val();
				
				if(proCode!=null&&proCode!=undefined&&proCode!=""){
					var obj=new Object();
					obj.proCode=$(this).find("[name='proCode']").val();
					obj.proName=$(this).find("[name='proName']").val();
					obj.roleName=$(this).find("[name='rolename']").val();				
					obj.columnName=$(this).find("[name='columnname']").val();					
					obj.oldPeoples=$(this).find("[name='oldpeoples']").val();
					obj.newPeoples=$(this).find("[name='newpeoples']").val();
					obj.isSync=$(this).find("[name='issync']:checked").length?1:0;
					
					lstMerge.push(obj);
				}				
			});
			$.each(lstMerge,function(i,item){
				if(item.proCode.indexOf(",")){
					var _arrName=item.proName.split(",");
					$.each(item.proCode.split(","),function(k,val){
						var _obj=getPeopleObject(val,_arrName[k],item.roleName,item.columnName,item.oldPeoples,item.newPeoples,item.isSync);
						lst.push(_obj);
					});
				}else{
					lst.push(item);
				}
			});			
		
			return JSON.stringify(lst);
		}
		
		function getPeopleObject(proCode,proName,roleName,columnName,oldPeoples,newPeoples,isSync){
			var obj=new Object();
			obj.proCode=proCode;
			obj.proName=proName;
			obj.roleName=roleName;				
			obj.columnName=columnName;					
			obj.oldPeoples=oldPeoples;
			obj.newPeoples=newPeoples;
			obj.isSync=isSync;
			return obj;
		}
		
		//保存草稿
		function postSaveDraft${id_suffix}(){
			$("#mainUrl").tabs("loading","处理中...");  
			
			$('#btnSave${id_suffix}').linkbutton('disable');

	    	$('#peopleApply${id_suffix}').form('submit', {
				url : '/basicinfo/peopleApply/save',
				onSubmit : function(param) {					
					param.edit=getPeopleJson${id_suffix}();
					
					param.applyID=$("#applyID${id_suffix}").val();
					param.processID=$("#processID${id_suffix}").val();
					 //验证不通过按钮设置为可点击
					if	(!$(this).form('enableValidation').form('validate')){
						 $('#btnSave${id_suffix}').linkbutton('enable');
					}				 
				},
				success : function(data) {				
					//跳转查询页面										
					eval("var obj = " + data);
					
					if(obj.success){
						$("#mainUrl").tabs("loaded");
						$('#btnSave${id_suffix}').linkbutton('disable');	
						var tab = $('#mainUrl').tabs('getSelected');		
					    tab.panel('refresh', "/basicinfo/peopleApply/edit/"+obj.size);
					} else {
						$("#mainUrl").tabs("loaded");
						$.messager.alert("提示",obj.msg);
						$('#btnSave${id_suffix}').linkbutton('enable');	
					}
					
				},
				error:function(a,b,c){
					$("#mainUrl").tabs("loaded");
					$.messager.alert("提示",a);
				}
			});
		}
		
		function postSave${id_suffix}(){
			//submit${id_suffix}
			
			$('#btnsubmit${id_suffix}').linkbutton('disable');
			 if($("#tbl_People${id_suffix} tr:gt(0) ").length==0){
				$.messager.alert("提示信息","请选择角色信息");
				return;
			} 
		
			 $("#mainUrl").tabs("loading","处理中...");  
			 
	    	$('#peopleApply${id_suffix}').form('submit', {
				url : '/basicinfo/peopleApply/submit',
				onSubmit : function(param) {
					param.edit=getPeopleJson${id_suffix}();
					param.applyID=$("#applyID${id_suffix}").val();
					param.processID=$("#processID${id_suffix}").val();
					 //验证不通过按钮设置为可点击
					if	(!$(this).form('enableValidation').form('validate')){
						 $("#mainUrl").tabs("loaded");
						 $('#btnsubmit${id_suffix}').linkbutton('enable');
					}	
					 
					return $(this).form('enableValidation').form('validate');
				},
				success : function(data) {				
					//跳转查询页面										
					eval("var obj = " + data);				
					if(obj.success){
						$("#mainUrl").tabs("loaded");
						$('#btnsubmit${id_suffix}').linkbutton('enable');	
						//$.messager.alert("提示","提交成功");
						var tab = $('#mainUrl').tabs('getSelected');
						var index = $('#mainUrl').tabs('getTabIndex', tab);
						$("#mainUrl").tabs("close", index);
					} else {
						$("#mainUrl").tabs("loaded");
						$.messager.alert("提示",obj.msg);
						$('#btnsubmit${id_suffix}').linkbutton('enable');	
					}
					
				},
				error:function(a,b,c){
					$("#mainUrl").tabs("loaded");
					$.messager.alert("提示",a);
				}
			});
		}
		
		function getParam${id_suffix}(result,type){			
			var opinion = "", strInsert="", strEdit="", strDel="", 
			checkDate="", checkPerson="", resultName="", opinionName="";
			if(type=="IPMT"){
				opinion = $("#ipmtOpinion${id_suffix}").val();
		      	resultName="ipmtResult";
		       	checkDate="ipmtDate";
		       	checkPerson="ipmtSign";
		       	opinionName="ipmtOpinion"
		    }
			var param = {
		        "checkDate":checkDate,
		        "checkPerson":checkPerson,
		        "checkResult":result,
		        "type":type,		       
		        "checkResultForRole":{
		          "resultName":resultName,
		          "resultValue":result
		        },
		        "checkOpinionForRole":{
		           "opinionName":opinionName,
		           "opinionValue":opinion
		         },
		         applyID:$("#applyID${id_suffix}").val()
		     };
			return param;
		}
		
		function check${id_suffix}(result,type) {
			$("#mainUrl").tabs("loading","处理中...");
            
            if(result!='1'&&$("#ipmtOpinion${id_suffix}").val()==''){
            	$("#mainUrl").tabs("loaded");
            	$.messager.alert('提示','审核意见不能为空！');	                	
            	return;
            }
            
            var id=$("#processID${id_suffix}").val();
			var param=getParam${id_suffix}(result,type)
            $.ajax({
                type: "POST",
                url: "/basicinfo/peopleApply/check/"+id+"/${taskId}",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(param),
                dataType: "json",
                success: function (message) {
                	successCheck(message)
                    /* if (message.status == 200) {
                    	$("#mainUrl").tabs("loaded");
                    	$.messager.alert("操作提示","审核成功！");
                        var tab = $('#mainUrl').tabs('getSelected');
    					var index = $('#mainUrl').tabs('getTabIndex', tab);
    					$("#mainUrl").tabs("close", index);                           
                    }else{
                    	$("#mainUrl").tabs("loaded");
                    	$.messager.alert("操作提示","审核失败");
                    }	 */                       
                },
                error: function (message) {	
                	errorCheck(message);
                	/* $("#mainUrl").tabs("loaded");
                    $.messager.alert("操作提示","审核失败"); */
                }
            });
	    }
		
		function changeHandler${id_suffix}() {
			$("#mainUrl").tabs("loading","处理中..."); 
			
	        var id=$("#processID${id_suffix}").val();
	        var userId = $("#assign${id_suffix}").val();
	        if(userId==undefined||userId==null||userId==""){
	        	$("#mainUrl").tabs("loaded");
	        	$.messager.alert("提示","请填写处理人!");
	        	return;
	        }
	        $.post("/basicinfo/peopleApply/changeHandler",{id:id,taskId:"${taskId}",userId:userId},function (result) {
	        	eval("var obj = " + result);
	        	successChangePerson(obj);
	            /* if(obj.status == 200){
	            	 $("#mainUrl").tabs("loaded");
	            	 $.messager.alert("提示","修改当前处理人成功");	            
	            	 var tab = $('#mainUrl').tabs('getSelected');
 					 var index = $('#mainUrl').tabs('getTabIndex', tab);
 					 $("#mainUrl").tabs("close", index);   
	            }else{
	            	$("#mainUrl").tabs("loaded");
	            	 $.messager.alert("提示",obj.message);
	            }
	            */
	        });
	    }
		
		function autoComplete${id_suffix}(obj){
			$(obj).off('autocomplete').autocomplete("/product/userlink/list?userCode=liucaixuan", {
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
		    });
		}
		
		function copyLastRow${id_suffix}(obj){
			 var _text=$(obj).parents("tr").prev().find("[name='newpeoples']").val();
			
			 if(_text!=undefined&&_text!=null){
				 $(obj).parents("tr").find("[name='newpeoples']").val(_text);
			 }
		}
		
		function addRow${id_suffix}(){
			firstTR=$("#tbl_People${id_suffix} tr:last").clone();
			$("#tbl_People${id_suffix}").append(firstTR);
			var _lastRowTd=$("#tbl_People${id_suffix} tr:last").find("td");
			
			$("#tbl_People${id_suffix} tr:last").find("[name='proCode']").val('');
			$("#tbl_People${id_suffix} tr:last").find("[name='proName']").val('');
			$("#tbl_People${id_suffix} tr:last").find("[name='rolename']").val('');
			
			$("#tbl_People${id_suffix} tr:last").find("[name='columnname']").val('');					
			$("#tbl_People${id_suffix} tr:last").find("[name='oldpeoples']").val('');
			$("#tbl_People${id_suffix} tr:last").find("[name='newpeoples']").val('');
			
			$(_lastRowTd[2]).text('');
			var _td2Html=$(_lastRowTd[3]).html();
			var _html2=_td2Html.substring(_td2Html.indexOf("<"),_td2Html.length);
			
			$(_lastRowTd[3]).html('').append(''+_html2);					
			$(_lastRowTd[4]).text('');
			$(_lastRowTd[5]).text('');

			//重新拍行号
			$("#tbl_People${id_suffix} tr:gt(0) ").each(function(i){
				$(this).find("td").eq(0).html(i+1);
			});
			//绑定联想事件
			$("#tbl_People${id_suffix} tr:last td:last").find("input")
			autoComplete${id_suffix}($("#tbl_People${id_suffix} tr:last td:last").find("input"));
		}
		
		//作废单据
		function delProcess${id_suffix}(){
			$.post("/basicinfo/peopleApply/delProcess",{processID:'${processID}'},function(result){
				var obj = $.parseJSON(result);
		   	   if(obj.success){	   		   
		     	   var tab = $('#mainUrl').tabs('getSelected');
				   var index = $('#mainUrl').tabs('getTabIndex', tab);
				   $("#mainUrl").tabs("close", index)
		   	   }else{
		   		   $.messager.alert("提示",obj.message,"");
		   		   $('#btnDel${id_suffix}').linkbutton('enable');
		       }
		 	});		
		}
		
	</script>

</body>
</html>