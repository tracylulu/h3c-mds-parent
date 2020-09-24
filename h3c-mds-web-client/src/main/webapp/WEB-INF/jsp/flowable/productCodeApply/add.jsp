<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/5/14
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>创建产品编码申请</title>
</head>
<body>
    <jsp:include page="/WEB-INF/jsp/ueditor/easyui-ueditor.jsp">
        <jsp:param name="module" value="productCodeApply"/>
        <jsp:param name="field" value="basisMaterialId"/>
    </jsp:include>
    <div class="toptoolbar" style="position:fixed;">
        <c:if test="${currentNode=='usertask1' && isHandler || currentNode == 'editable'}">
            <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="save${timestamp}()"
               data-options="iconCls:'fa fa-save'"
            >保存</a>
        </c:if>

        <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="changeMenue${timestamp}('fold')"
           data-options="iconCls:'fa fa-minus'"
        >折叠</a>
        <a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true" onclick="changeMenue${timestamp}('expand')"
           data-options="iconCls:'fa fa-plus'"
        >展开</a>
        <a href="#" id="btnCopy${timestamp}" class="easyui-linkbutton" plain="true" onclick="copyLink('/flowable/productCodeApply/edit/${entity.id}','查看产品编码申请','${entity.id}','${entity.applys!=null&&entity.applys.size()>0?entity.applys[0].productNameCn:""}等产品编码申请 : '+'${entity.applyType==1?"新增":entity.applyType==2?"改变":"停用"}')"
           data-options="iconCls:'fa fa-files-o'">复制链接</a>
        <c:if test="${(entity.status == '0' || entity.status == '-1') && (isHandler || isAdmin)}">
            <a href="#" id="btnDel${timestamp}" class="easyui-linkbutton" plain="true" onclick="deleteProcess${timestamp}()" data-options="iconCls:'fa fa-files-o'">废弃</a>
        </c:if>


    </div>
    <div class="toptoolbarhr" style="margin-top:2%;"></div>
    <form method='post' name='bomCodeForm${timestamp}' id='bomCodeForm${timestamp}' action="/flowable/productCodeApply/exportBomCode">
        <input id="bomCodeValue${timestamp}" name="bomCodeValue" type="hidden"/>
    </form>
    <form method='post' name='productCodeApply${timestamp}' id='productCodeApply${timestamp}' >
        <p >
            <span class="title191030">产品编码申请表 </span>
        </p>
        <input id="id${timestamp}" name="id" value="${entity.id}" type="hidden"/>
        <input id="instanseId${instanseId}" name="instanseId" value="${entity.instanseId}" type="hidden"/>
        <input id="timestamp${timestamp}" name="timestamp" value="${timestamp}" type="hidden"/>
        <input id="pdtMgn${timestamp}" name="pdtMgn" value="${entity.pdtMgn}" type="hidden"/>
        <input id="fprodPerson${timestamp}" name="fprodPerson" value="${entity.pdtMgn}" type="hidden"/>
        <input id="pageType${timestamp}" name="pageType" value="${pageType}" type="hidden"/>
        <input id="clearBasisMaterial${timestamp}" name="clearBasisMaterial" value="true" type="hidden"/>
<%--        <div style="margin-left:1%;margin-right:1%;">--%>
<%--            <span style="font-size:15px">&nbsp;&nbsp;&nbsp;申请编号：<input type="hidden" id="applyCode${timestamp}" name="applyCode" value="${entity.applyCode}"/><span style="color:#3A5FCD">${entity.applyCode}</span> &nbsp;&nbsp;--%>
<%--                当前状态：<span style="color:#3A5FCD">${entity.statusDesc}</span>  &nbsp;&nbsp;--%>
<%--                当前处理者：<span style="color:#3A5FCD"><ibds:userAccount account="${entity.handler}"/></span>  &nbsp;&nbsp;--%>
<%--&lt;%&ndash;                系统修改反馈：<span style="color:#3A5FCD">XXX</span>&ndash;%&gt;--%>
<%--            </span>--%>
<%--        </div>--%>
        <!--修改样式-->
        <div style="font-size: 13px; margin-left: 20px">
            <table  cellspacing="0" width="100%" style="border-color: #ABABAB;  border:none;">
                <tr>
                    <td width="20%">
                        <span style="font-size:15px">申请编号：<input type="hidden" id="applyCode${timestamp}" name="applyCode" value="${entity.applyCode}"/></span>
                            <span style="color:#3A5FCD">${entity.applyCode}</span> &nbsp;&nbsp;
                    </td>
                    <td width="20%">
                        当前状态：<span style="color:#3A5FCD">${entity.statusDesc}</span>  &nbsp;&nbsp;
                    </td>
                    <td width="20%">
                        当前处理者：<span style="color:#3A5FCD"><ibds:userAccount account="${entity.handler}"/></span>  &nbsp;&nbsp;
                    </td>
                </tr>
            </table>
        </div>
        <br>

        <h2 class="subfild" id="T00000-1-${timestamp}" style="margin-left:1%;margin-right:1%;">
            <span>本栏目由申请者填写</span>
        </h2>
        <div id="SUBFORM_T00000-1-${timestamp}" style="margin-left:1%;margin-right:1%;">
            <div style="font-size:13px">
                <div style="font-size: 15px;color:#3A5FCD">
                    &nbsp;&nbsp;&nbsp;新增产品族和新增产品编码可以在同一电子流里面填写。填写规则如下：<br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;▶	先新增产品族（例如：26003）<br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;▶	再新增该产品族的“一般”产品编码（例如：2600300）<br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;▶	然后可以新增该产品族下的其他产品编码（例如：2600301，2600302等）<br>

                </div>
                <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
                    <c:choose>
                        <c:when test="${currentNode=='usertask1' && isHandler || currentNode == 'editable'}">
                            <tr>
                                <td width="33%">&nbsp;&nbsp;申请人部门：&nbsp;
                                    <select data-options="required:true" editable="false" class="easyui-combobox" id="applyDep${timestamp}" name="applyDept" style="width:30%;">
                                        <option value="D0001" ${entity.applyDept=='D0001'?"selected":""}>研发</option>
                                        <option value="D0002" ${entity.applyDept=='D0002'?"selected":""}>专业服务部</option>
                                        <option value="D0003" ${entity.applyDept=='D0003'?"selected":""}>其他</option>
                                    </select>
                                </td>
                                <td width="33%">&nbsp;&nbsp;变动类型：&nbsp;&nbsp;&nbsp;&nbsp;
                                    <select data-options="required:true" editable="false" class="easyui-combobox" id="applyType${timestamp}" style="width:30%;">
                                        <option value="1" ${entity.applyType=='1'?"selected":""}>新增</option>
                                        <option value="2" ${entity.applyType=='2'?"selected":""}>改变</option>
                                        <option value="3" ${entity.applyType=='3'?"selected":""}>停用</option>
                                    </select>
                                    <input id="input_applyType${timestamp}" name="applyType" value="${entity.applyType}" type="hidden"/>
                                </td>
                                <td >&nbsp;&nbsp;申请编码的数目：&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input data-options="required:true" class="easyui-numberbox" id="applyCount${timestamp}" value="${entity.applyCount}"/>
                                    <input type="hidden" id="input_applyCount${timestamp}" name="applyCount" value="${entity.applyCount}"/>
<%--                                    <button type="button" id="btn${timestamp}" onclick="confirmDlg${timestamp}('count');">确定</button>--%>
									<input type="hidden" id="maxApplyCount${timestamp}">
                                    <a id="btn${timestamp}" href="javascript:void(0)" style="text-align: right;height: 28px;"
                                       class="easyui-linkbutton" onclick="confirmDlg${timestamp}('count');">确定 </a>&nbsp;
                                </td>
                            </tr>
                        </c:when>
                        <c:otherwise>
                            <tr>
                                <td width="33%">&nbsp;&nbsp;申请人部门：
                                        ${entity.applyDept=='D0001'?"研发":entity.applyDept=='D0002'?"专业服务部":entity.applyDept=='D0003'?"其他":""}
                                </td>

                                <td width="33%">&nbsp;&nbsp;变动类型：${entity.applyType=='1'?"新增":entity.applyType=='2'?"改变":entity.applyType=='3'?"停用":""}</td>
                                <td >&nbsp;&nbsp;申请编码的数目：<span>${applyCount}</span>
                                    <input id="applyCount_${timestamp}" name="applyCount" value="${applyCount}" type="hidden"/></td>
                            </tr>
                        </c:otherwise>
                    </c:choose>

                </table>
            </div>


            <br>


            <c:choose>
            <c:when test="${currentNode=='usertask1' && isHandler || currentNode == 'editable'}">
                <div id="subForm111${timestamp}"  >
                    <c:choose>
                        <c:when test="${pageType=='edit' && entity.applyType=='1'}">
                            <jsp:include page="subAdd.jsp"/>
                        </c:when>
                        <c:when test="${pageType=='edit' && entity.applyType=='2'}">
                            <jsp:include page="subEditAdd.jsp"/>
                        </c:when>
                        <c:when test="${pageType=='edit' && entity.applyType=='3'}">
                            <jsp:include page="subDelAdd.jsp"/>
                        </c:when>
                    </c:choose>

                </div>
            </c:when>
            <c:otherwise>
                <c:choose>
                    <c:when test="${entity.applyType=='1'}">
                        <jsp:include page="subView.jsp"/>
                    </c:when>
                    <c:when test="${entity.applyType=='2'}">
                        <jsp:include page="subEditView.jsp"/>
                    </c:when>
                    <c:when test="${entity.applyType=='3'}">
                        <jsp:include page="subDelView.jsp"/>
                    </c:when>
                </c:choose>

            </c:otherwise>
        </c:choose>


<%--            <div style="float:right;margin-right: 40%;margin-top: 0.7%">--%>
<%--                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.subSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.submitDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>--%>
<%--            </div>--%>
            <div style="margin-top: 1%">
                <hr>
                <br>
            </div>

        </div>
    </form>
        <h2 class="subfild" id="T00000-2-${timestamp}" style="margin-left:1%;margin-right:1%;">
            <span>本栏目由审核者填写</span>
        </h2>
        <div id="SUBFORM_T00000-2-${timestamp}" style="margin-left:1%;margin-right:1%;">
<%--            <c:choose>--%>
<%--                <c:when test="${currentNode=='usertask2' && isHandler}">--%>
<%--                    <div>--%>
<%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：--%>
<%--                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="checkOpinion${timestamp}" name="checkOpinion" value="${entity.checkOpinion}"/>--%>
<%--                        </span>--%>
<%--                    </div>--%>
<%--                    <div style="text-align: center">--%>
<%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','check')">同意</a>--%>
<%--                        &nbsp;&nbsp;&nbsp;--%>
<%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','check')">不同意</a>--%>
<%--                    </div>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    <div>--%>
<%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.checkOpinion}</span>--%>
<%--                    </div>--%>
<%--                </c:otherwise>--%>
<%--            </c:choose>--%>

<%--            <div>--%>
<%--                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.checkSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.checkDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>--%>
<%--            </div>--%>
<%--            <br><hr>--%>
            <c:choose>
                <c:when test="${currentNode=='usertask2' && isHandler}">
                    <div style="float:left;font-size:15px">
                                &nbsp;&nbsp;&nbsp;意见：
                                    <input class="easyui-textbox" style="width:90%;height:30px;"  id="checkOpinion${timestamp}" name="checkOpinion" value=""/>

                    </div>
                    <div style="float: left;text-align: center;margin-left: 2%;">
                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','check')">同意</a>
                        &nbsp;&nbsp;&nbsp;
                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','check')">不同意</a>
                    </div>
                </c:when>
                <c:otherwise>
                    <div style="float: left;padding-top: 0.5%;font-size:15px">
                       &nbsp;&nbsp;&nbsp;意见：${entity.checkOpinion}
                    </div>
                </c:otherwise>
            </c:choose>

            <div style="padding-top: 0.6%;">
                <span  style="font-size:15px;margin-left: 4%">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.checkSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.checkDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
            </div>
            <div style="margin-top: 1%">
                <hr>
            </div>
            <br>

        </div>
        <div id="pdtcheck${timestamp}">
            <h2 class="subfild" id="T00000-3-${timestamp}"  style="margin-left:1%;margin-right:1%;">
                <span>本栏目由PDT经理填写</span>
            </h2>
            <div id="SUBFORM_T00000-3-${timestamp}" style="margin-left:1%;margin-right:1%;">
                <%--            <c:choose>--%>
                <%--                <c:when test="${currentNode=='usertask3' && isHandler}">--%>
                <%--                    <div>--%>
                <%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：--%>
                <%--                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="pdtOpinion${timestamp}" name="pdtOpinion" value="${entity.pdtOpinion}"/>--%>
                <%--                        </span>--%>
                <%--                    </div>--%>
                <%--                    <div style="text-align: center">--%>
                <%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','pdt')">同意</a>--%>
                <%--                        &nbsp;&nbsp;&nbsp;--%>
                <%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','pdt')">不同意</a>--%>
                <%--                    </div>--%>
                <%--                </c:when>--%>
                <%--                <c:otherwise>--%>
                <%--                    <div>--%>
                <%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.pdtOpinion}</span>--%>
                <%--                    </div>--%>
                <%--                </c:otherwise>--%>
                <%--            </c:choose>--%>

                <%--            <div>--%>
                <%--                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.pdtSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.pdtDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>--%>
                <%--            </div>--%>
                <%--            <br><hr>--%>
                <c:choose>
                    <c:when test="${currentNode=='usertask3' && isHandler}">
                        <div style="float:left;font-size:15px">
                            &nbsp;&nbsp;&nbsp;意见：
                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="pdtOpinion${timestamp}" name="pdtOpinion" value=""/>

                        </div>
                        <div style="float: left;text-align: center;margin-left: 2%;">
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','pdt')">同意</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','pdt')">不同意</a>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div style="float: left;padding-top: 0.5%;font-size:15px">
                            &nbsp;&nbsp;&nbsp;意见：${entity.pdtOpinion}
                        </div>
                    </c:otherwise>
                </c:choose>

                <div style="padding-top: 0.6%;">
                    <span  style="font-size:15px;margin-left: 4%">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.pdtSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.pdtDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
                </div>
                <div style="margin-top: 1%">
                    <hr>
                </div>
                <br>
            </div>
        </div>
        <h2 class="subfild" id="T00000-4-${timestamp}"  style="margin-left:1%;margin-right:1%;">
            <span>本栏由产品财务接口人填写</span>
        </h2>
        <div id="SUBFORM_T00000-4-${timestamp}" style="margin-left:1%;margin-right:1%;">
<%--            <c:choose>--%>
<%--                <c:when test="${currentNode=='usertask4' && isHandler}">--%>
<%--                    <div>--%>
<%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：--%>
<%--                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="fprodOpinion${timestamp}" name="fprodOpinion" value="${entity.fprodOpinion}"/>--%>
<%--                        </span>--%>
<%--                    </div>--%>
<%--                    <div style="text-align: center">--%>
<%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','fprod')">同意</a>--%>
<%--                        &nbsp;&nbsp;&nbsp;--%>
<%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','fprod')">不同意</a>--%>
<%--                    </div>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    <div>--%>
<%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.fprodOpinion}</span>--%>
<%--                    </div>--%>
<%--                </c:otherwise>--%>
<%--            </c:choose>--%>

<%--            <div>--%>
<%--                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.fprodSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.fprodDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>--%>
<%--            </div>--%>
<%--            <br><hr>--%>
            <c:if test="${entity.applyType == '1' || entity.applyType == '3'}">
                <c:choose>
                    <c:when test="${(currentNode=='usertask4' || currentNode=='usertask7') && isHandler}">
                        <div style="float:left;font-size:15px">
                            &nbsp;&nbsp;&nbsp;意见：
                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="fprodOpinion${timestamp}" name="fprodOpinion" value=""/>

                        </div>
                        <div style="float: left;text-align: center;margin-left: 2%;">
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','fprod')">同意</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','fprod')">不同意</a>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div style="float: left;padding-top: 0.5%">
                            <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.fprodOpinion}</span>
                        </div>
                    </c:otherwise>
                </c:choose>

                <div style="padding-top: 0.6%">
                    <span  style="font-size:15px;margin-left: 4%">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.fprodSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.fprodDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
                </div>
                <div style="margin-top: 1%">
                    <hr>
                </div>
                <br>
            </c:if>
            <c:if test="${entity.applyType == '2'}">
                <c:choose>
                    <c:when test="${(currentNode=='usertask4' || currentNode=='usertask7') && isHandler}">
                        <div style="float:left;font-size:15px">
                            &nbsp;&nbsp;&nbsp;意见：
                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="fprodOpinion${timestamp}" name="fprodOpinion" value=""/>

                        </div>
                        <div style="margin-left: 20%;">
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','fprod')">同意</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','fprod')">不同意</a>
                        </div>
                    </c:when>

                </c:choose>
                <br>
                <c:forEach var="processLog" items="${fprdLogs}">

                    <div style="padding-top: 0.6%">
                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${processLog.checkOpion}</span>
                        <span  style="font-size:15px;margin-left: 4%">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${processLog.checkAccount}"/>&nbsp;&nbsp;<fmt:formatDate value="${processLog.checkDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
                    </div>
                </c:forEach>
                <div style="margin-top: 1%">
                    <hr>
                </div>
                <br>
            </c:if>


        </div>
        <h2 class="subfild" id="T00000-5-${timestamp}"  style="margin-left:1%;margin-right:1%;">
        <span>本栏由财务审批</span>
        </h2>
        <div id="SUBFORM_T00000-5-${timestamp}" style="margin-left:1%;margin-right:1%;">
<%--            <c:choose>--%>
<%--                <c:when test="${currentNode=='usertask5' && isHandler}">--%>
<%--                    <div>--%>
<%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：--%>
<%--                            <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="cwOpinion${timestamp}" name="cwOpinion" value="${entity.cwOpinion}"/>--%>
<%--                        </span>--%>
<%--                    </div>--%>
<%--                    <div style="text-align: center">--%>
<%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','cw')">同意</a>--%>
<%--                        &nbsp;&nbsp;&nbsp;--%>
<%--                        <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','cw')">不同意</a>--%>
<%--                    </div>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    <div>--%>
<%--                        <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.cwOpinion}</span>--%>
<%--                    </div>--%>
<%--                </c:otherwise>--%>
<%--                --%>
<%--            </c:choose>--%>

<%--            <div>--%>
<%--                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.cwSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.cwDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>--%>
<%--            </div>--%>
<%--            <br><hr>--%>
                <c:choose>
                    <c:when test="${currentNode=='usertask5' && isHandler}">
                        <div style="float:left;font-size:15px">
                            &nbsp;&nbsp;&nbsp;意见：
                                <input class="easyui-textbox" style="width:200px;height:50px" data-options="required:true,multiline:true" id="cwOpinion${timestamp}" name="cwOpinion" value=""/>

                        </div>
                        <div style="float: left;text-align: center;margin-left: 2%;">
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('1','cw')">同意</a>
                            &nbsp;&nbsp;&nbsp;
                            <a href="#" class="easyui-linkbutton" onclick="check${timestamp}('0','cw')">不同意</a>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div style="float: left;padding-top: 0.5%">
                            <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;意见：${entity.cwOpinion}</span>
                        </div>
                    </c:otherwise>
                </c:choose>

                <div style="padding-top: 0.6%">
                    <span  style="font-size:15px;;margin-left: 4%">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.cwSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.cwDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
                </div>
                <div style="margin-top: 1%">
                    <hr>
                </div>
                <br>
        </div>
<%--        <h2 class="subfild" id="T00000-6-${timestamp}"  >--%>
<%--            <span>本栏进行流程维护管理</span>--%>
<%--        </h2>--%>
<%--        <div id="SUBFORM_T00000-6-${timestamp}">--%>
<%--            <c:choose>--%>
<%--                <c:when test="${currentNode=='usertask6' && isHandler}">--%>
<%--                    <div style="text-align: center">--%>
<%--                        <a href="#" class="easyui-linkbutton" onclick="updateBaseInfo${timestamp}()">修改研发产品基本信息库</a>--%>
<%--                    </div>--%>
<%--                </c:when>--%>
<%--            </c:choose>--%>

<%--            <div>--%>
<%--                <span  style="font-size:15px">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;${entity.processmgnSign}&nbsp;&nbsp;<fmt:formatDate value="${entity.processmgnDate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>--%>
<%--            </div>--%>
<%--            <br><hr>--%>
<%--        </div>--%>
        <h2 class="subfild" id="T00000-7-${timestamp}" style="margin-left:1%;margin-right:1%;">
            <span>管理区段</span>
        </h2>
        <div id="SUBFORM_T00000-7-${timestamp}" style="margin-left:1%;margin-right:1%;display:none;">
            <c:choose>
                <c:when test="${(isHandler || isAdmin) && entity.status != '10' && entity.handler !='系统ERP'}">
                    <div style="float:left;font-size:15px">
                        &nbsp;&nbsp;&nbsp;处理人：<input id="assignDesc${timestamp}"  class="auto_selusers_false_1"/>
                        <input id="assign${timestamp}" value="" type="hidden"/>
                    </div>
                    <div style="float: left;text-align: center;margin-left: 2%;">
                        <a id="changeHandlerButton${timestamp}" href="#" class="easyui-linkbutton" onclick="changeHandler${timestamp}()">修改当前处理人</a>
                    </div>
                </c:when>
            </c:choose>

            <div style="padding-top: 0.6%;">
                <span  style="font-size:15px;margin-left: 4%">&nbsp;&nbsp;&nbsp;签名：&nbsp;&nbsp;<ibds:userAccount account="${entity.assignSign}"/>&nbsp;&nbsp;<fmt:formatDate value="${entity.assignDate}" pattern="yyyy-MM-dd HH:mm:ss"/> </span>
            </div>
            <div style="margin-top: 1%">
                <hr>
            </div>
            <br>
        </div>
        <h2 class="subfild" id="T00000-8-${timestamp}" style="margin-left:1%;margin-right:1%;">
            <span>过程记录</span>
        </h2>
        <div id="SUBFORM_T00000-8-${timestamp}" style="margin-left:1%;margin-right:1%;display:none;">
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

            <br><hr>
        </div>
        <br><br><br><br>

    <link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css"/>
    <script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="common/js/common.js"></script>
    <style type="text/css">
        .product-code tr td{
            height: 20px;
        }
    </style>

    <script type="text/javascript">

        $(function () {


            if("${entity.applyType}" == '2'){
                $("#pdtcheck${timestamp}").hide();
            }

            $("[id^='T00000-'][id$='-${timestamp}']").each(function () {
                debugger;
                var id = $(this).prop("id");
                var display = $('#SUBFORM_'+id).css('display');
                if (display == 'none') {
                    $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
                    // 重新加载easyui样式
                } else {
                    $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
                }
            });


            //产品编码最大值初始化
        	
        	$.get("/flowable/productCodeApply/getDicItem?type=40",function (result) {
        		 $.each(result,function(i,e){
                     $("#maxApplyCount${timestamp}").val(e.dicValue)
                 });
               
            });

            //if("${pageType}"=="edit"){
             //   $.get("/flowable/productCodeApply/getByIdCasecadeSub/${id}",function (result) {
             //       $('#productCodeApply${timestamp}').form('load',result.data);
            //    });
            //}

            //表单转json
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


            if("${pageType=='add'}"=="true"){
                loadSubForm${timestamp}();
            }


            //搜索框绑定回车事件
            <%--$('#applyCount${timestamp}').numberbox({--%>
            <%--    inputEvents : $.extend({}, $.fn.textbox.defaults.inputEvents, {--%>
            <%--        keypress : function test() {--%>
            <%--            if (event.keyCode == 13) {--%>
            <%--                //doSearch(); //回车搜索--%>
            <%--                $("#btn${timestamp}").click()--%>
            <%--            }--%>
            <%--        }--%>
            <%--    })--%>

            <%--});--%>

            //绑定改变事件
            <%--$("#applyType${timestamp}").change(function () {--%>

            <%--    confirmDlg${timestamp}('type');--%>
            <%--});--%>

            $("#applyType${timestamp}").combobox({
                onChange: function(n,o){
                    debugger;
                    if(n!=$("#input_applyType${timestamp}").val()){
                        confirmDlg${timestamp}('type');
                    }

                }
            });


           $("[id^='T00000-'][id$='${timestamp}']").click(function () {

               var id = $(this).prop("id");
               var display = $('#SUBFORM_'+id).css('display');
               if (display == 'none') {
                   $('#SUBFORM_'+id).show();
                   $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
               } else {
                   $('#SUBFORM_'+id).hide();
                   $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
               }
           });

            if("${isHandler}"=="true" || "${isAdmin}"=="true"){
                //单个人员联想
                $(".auto_selusers_false_1").autocomplete("/product/userlink/list?userCode=liucaixuan", {
                    multiple: false,
                    max : 20, //列表里的条目数
                    minChars : 2, //自动完成激活之前填入的最小字符
                    width : '400px', //提示的宽度，溢出隐藏
                    scrollHeight : 300, //提示的高度，溢出显示滚动条
                    matchContains : false, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
                    autoFill : false, //自动填充
                    parse : function(data) {
                        return $.map(eval(data), function(row) {
                            return {
                                data : row,
                                value : row.uda10509+" "+row.code,
                                result :row.uda10509+" "+row.code
                            }
                        }) //对ajax页面传过来的数据进行json转码
                    },
                    formatItem : function(row, i, max) {
                        //document.getElementById('cmoid').value = "";
                        return row.uda10509 + ' | ' + row.code + ' | ' + row.deptname ;
                    },

                }).result(function (event,item) {
                    debugger;
                    $("#assign${timestamp}").val(item.usercode);


                });
            }

            $("#applyDep${timestamp}").combobox({
                onSelect:function (e) {
                    debugger;
                    var dep = e.value;
                    var type = $("#applyType${timestamp}").val();
                    $.post("/finance/fprodLine/getDistinctNameByDept/"+dep,function (result) {
                        debugger;
                        var data = result.data;
                        $("[id^=applys][id$=prodline${timestamp}]").each(function () {
                            var flag = false;
                            var aa = $(this);
                            var d = data;
                            $.each(d,function () {
                                if(this.prodlineDesc == aa.combobox("getValue")){
                                    flag = true;
                                    return;
                                }
                            });
                            if(!flag){
                                aa.combobox("clear");
                            }
                        });


                        //$("[id^=applys][id$=prodline${timestamp}]").combobox("clear");

                        if(type == "1"){
                            //var v = $("[id^=applys][id$=prodline${timestamp}]").combobox("getValue");
                            $("[id^=applys][id$=prodline${timestamp}]").combobox("loadData",result.data);
                            //$("[id^=applys][id$=prodline${timestamp}]").combobox("setValue",v);
                            //if("D0002" == dep){
                            //    $("[id^=applys][id$=prodline${timestamp}]").combobox({editable:true});
                            //}else if("D0001" == dep || "D0003" == dep){
                            //    $("[id^=applys][id$=prodline${timestamp}]").combobox({editable:false});
                           // }
                            $("[id^=applys][id$=prodline${timestamp}]").each(function(){
                                var v = $(this).combobox("getValue");
                                if("D0002" == dep || "D0003" == dep){
                                    $(this).combobox({editable:true});
                                }else if("D0001" == dep ){
                                    $(this).combobox({editable:false});
                                }
                                $(this).combobox("setValue",v);
                            });
                        }else if(type== "2"){
                            $("[id^=prodline_][id$=_${timestamp}]").combobox("loadData",result.data);
                            <%--if("D0002" == dep){--%>
                            <%--    $("[id^=prodline_][id$=_${timestamp}]").combobox({editable:true});--%>
                            <%--}else if("D0001" == dep || "D0003" == dep){--%>
                            <%--    $("[id^=prodline_][id$=_${timestamp}]").combobox({editable:false});--%>
                            <%--}--%>
                            $("[id^=prodline_][id$=_${timestamp}]").each(function(){
                                var v = $(this).combobox("getValue");
                                if("D0002" == dep || "D0003" == dep){
                                    $(this).combobox({editable:true});
                                }else if("D0001" == dep ){
                                    $(this).combobox({editable:false});
                                }
                                $(this).combobox("setValue",v);
                            });
                        }
                    });
                    $.post("/flowable/processConfigItem/getPdtList/"+dep,function (result) {

                        if(type == "1"){
                            $("[id^=applys][id$=pdtId${timestamp}]").combobox("loadData",result.data);
                            <%--if("D0002" == dep){--%>
                            <%--    $("[id^=applys][id$=pdtId${timestamp}]").combobox({editable:true});--%>
                            <%--}else if("D0001" == dep || "D0003" == dep){--%>
                            <%--    $("[id^=applys][id$=pdtId${timestamp}]").combobox({editable:false});--%>
                            <%--}--%>
                            $("[id^=applys][id$=pdtId${timestamp}]").each(function(){
                                var v = $(this).combobox("getValue");
                                if("D0002" == dep){
                                   // $(this).combobox({editable:true});
                                }else if("D0001" == dep || "D0003" == dep){
                                   // $(this).combobox({editable:false});
                                }
                                $(this).combobox("setValue",v);
                            });
                        }else if(type== "2"){
                            $("[id^=pdtId_][id$=_${timestamp}]").combobox("loadData",result.data);
                            <%--if("D0002" == dep){--%>
                            <%--    $("[id^=pdtId_][id$=_${timestamp}]").combobox({editable:true});--%>
                            <%--}else if("D0001" == dep || "D0003" == dep){--%>
                            <%--    $("[id^=pdtId_][id$=_${timestamp}]").combobox({editable:false});--%>
                            <%--}--%>
                            $("[id^=pdtId_][id$=_${timestamp}]").each(function(){
                                var v = $(this).combobox("getValue");
                                if("D0002" == dep){
                                   // $(this).combobox({editable:true});
                                }else if("D0001" == dep || "D0003" == dep){
                                   // $(this).combobox({editable:false});
                                }
                                $(this).combobox("setValue",v);
                            });
                        }
                    });
                }
            });

        });

        function changeMenue${timestamp}(a){
            if(a=='fold'){
                $("[id^='SUBFORM_T00000-'][id$='${timestamp}']").hide();
                $("[id^='T00000-'][id$='${timestamp}']").each(function () {
                   $(this).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
                });

            }else if(a=='expand'){
                $("[id^='SUBFORM_T00000-'][id$='${timestamp}']").show();
                $("[id^='T00000-'][id$='${timestamp}']").each(function () {
                   $(this).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");
                });
            }
        }

        //保存
        function save${timestamp}(){
            $('#productCodeApply${timestamp}').form('disableValidation');
            $("#mainUrl").tabs("loading","处理中...")	// display the progress bar
            $('#productCodeApply${timestamp}').form('submit', {

                url: '/flowable/productCodeApply/save',
                onSubmit: function(){
                    //checkSubForm${timestamp}();
                    if($("#applyType${timestamp}").val() == "1"){
                        $("[id^=applys][id$=product${timestamp}]").each(function () {
                            $(this).combobox("setValue",$(this).combobox("getText"));
                        });
                    }else if($("#applyType${timestamp}").val() == "2"){
                        $("[id^=product_][id$=_${timestamp}]").each(function () {
                            $(this).combobox("setValue",$(this).combobox("getText"));
                        });
                    }
                    var isValid = $(this).form('validate');
                    if(isValid){
                        $("input[id^='basisMaterialId_'][id$='_${timestamp}']").each(function () {
                            if($(this).val() != ""){
                                $.messager.alert("提示","保存草稿不能上传附件!");
                                isValid = false;
                                return false;
                            }
                        });
                    }
                    if (!isValid){
                       $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid
                    }
                    return isValid;	// return false will stop the form submission
                },
                success: function(result){
                    var obj = $.parseJSON(result);
                    if(obj.status==200){
                        // var tab = $('#mainUrl').tabs('getSelected');
                        // debugger;
                        // var id = $.parseJSON(result).data.id;
                        //
                        // tab.panel('refresh', '/flowable/productCodeApply/edit/'+id);
                        var tab = $('#mainUrl').tabs('getSelected');
                        var index = $('#mainUrl').tabs('getTabIndex', tab);
                        $("#mainUrl").tabs("close", index)
                    }else{
                        alert(obj.message);
                    }
                   $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully
                }
            });
        }

        //保存
        <%--function save${timestamp}(){--%>
        <%--    $.messager.progress({--%>

        <%--        title:'提示',--%>
        <%--        msg:'文本',--%>

        <%--    });	// display the progress bar--%>
        <%--    var isValid = $('#productCodeApply${timestamp}').form('validate');--%>
        <%--    if(!isValid){--%>
        <%--       $("#mainUrl").tabs("loaded");--%>
        <%--    }else{--%>
        <%--        var l =  $("[id^='applys'][id$='prodlineId${timestamp}']").length;--%>
        <%--        $("[id^='applys'][id$='prodlineId${timestamp}']").each(function(){--%>
        <%--            var val = $(this).combobox('getValue');--%>
        <%--            var s = $.trim(val);--%>
        <%--            var a = $(this);--%>

        <%--            //如果为空--%>
        <%--            if(s == ""){--%>
        <%--                $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val("");--%>
        <%--            }else if(isNaN(s)){--%>
        <%--                //如果 val 不为数字类型则是手动输入 把值设空--%>
        <%--                $(this).combobox('setValue',"");--%>
        <%--                $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);--%>
        <%--            }else {--%>
        <%--                var prodlineName = $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val();--%>
        <%--                //如果为数字，两种情况：1、为产品线id 2、手动输入为数字--%>
        <%--                $.get("/finance/fprodLine/getById/"+s,function (result) {--%>
        <%--                    //如果名称不一致则为手动输入--%>
        <%--                    if(result.data.prodlineDesc != prodlineName){--%>
        <%--                        // id 置空--%>
        <%--                        $(a).combobox('setValue',"");--%>
        <%--                        // 产品线名称设为手动输入的值--%>
        <%--                        $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);--%>
        <%--                    }--%>
        <%--                });--%>
        <%--            }--%>
        <%--        });--%>
        <%--    }--%>
        <%--    $('#productCodeApply${timestamp}').form('submit', {--%>

        <%--        url: '/flowable/productCodeApply/save',--%>
        <%--        onSubmit: function(){--%>
        <%--            //checkSubForm${timestamp}();--%>
        <%--            var isValid = $(this).form('validate');--%>

        <%--            if (!isValid){--%>
        <%--               $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid--%>
        <%--            }--%>
        <%--            return isValid;	// return false will stop the form submission--%>
        <%--        },--%>
        <%--        success: function(){--%>
        <%--           $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully--%>
        <%--        }--%>
        <%--    });--%>
        <%--}--%>

        //提交
        function submit${timestamp}(){
            $('#productCodeApply${timestamp}').form('enableValidation');
            //$.messager.confirm('', '确认是否提交?', function(r){
                //if (r){
                    $("#mainUrl").tabs("loading","处理中...")
                    $('#productCodeApply${timestamp}').form('submit', {
                        url: '/flowable/productCodeApply/submit',
                        onSubmit: function(){
                            checkSubForm${timestamp}();
                            if($("#applyType${timestamp}").val() == "1"){
                                $("[id^=applys][id$=product${timestamp}]").each(function () {
                                    $(this).combobox("setValue",$(this).combobox("getText"));
                                });
                            }else if($("#applyType${timestamp}").val() == "2"){
                                $("[id^=product_][id$=_${timestamp}]").each(function () {
                                    $(this).combobox("setValue",$(this).combobox("getText"));
                                });
                            }
                            //var isValid = $(this).form('validate');
                            var isValid = true;
                            if($("#applyType${timestamp}").val() == "1"){
                                isValid = validataNo${timestamp}();
                            }
                            $("[id^=applys][id$=prodline${timestamp}]").each(function () {
                                if($(this).combobox("getValue") == ""){
                                    alert("产品线名称必填！");
                                    isValid = false;
                                    return false;
                                }
                            });
                            if(isValid){
                                $("[id^=applys][id$=prodlineNo${timestamp}]").each(function () {
                                    if($(this).textbox("getValue") == ""){
                                        alert("产品线编码必填！");
                                        isValid = false;
                                        return false;
                                    }
                                });
                            }
                            if(isValid){
                                $("[id^=applys][id$=pdtId${timestamp}]").each(function () {
                                    if($(this).combobox("getValue") == ""){
                                        alert("所属PDT必填！");
                                        isValid = false;
                                        return false;
                                    }
                                });
                            }
                            <%--if(isValid){--%>
                            <%--    $("[id^=applys][id$=productNo${timestamp}]").each(function () {--%>
                            <%--        if($(this).textbox("getValue") == ""){--%>
                            <%--            alert("产品族编码不能为空！");--%>
                            <%--            isValid = false;--%>
                            <%--            return false;--%>
                            <%--        }--%>
                            <%--    });--%>
                            <%--}--%>
                            debugger;
                            if(isValid){
                                if($("#applyType${timestamp}").val() == "2"){
                                    $("input[id^='basisMaterialId_'][id$='_${timestamp}']").each(function () {
                                        if($(this).val() == ""){
                                            alert("依据材料必填!");
                                            isValid = false;
                                            return false;
                                        }
                                    });
                                }
                            }
                            if(isValid){
                                if($("#applyType${timestamp}").val() == "2"){
                                    $("input[id^='oldproductCode_'][id$='_${timestamp}']").each(function () {
                                        if($(this).val() == ""){
                                            alert("原产品编码必填!");
                                            isValid = false;
                                            return false;
                                        }
                                    });
                                }

                            }
                            if(isValid){
                                <%--$("input[id^='bomCode_'][id$='_${timestamp}']").each(function () {--%>
                                <%--    if($(this).val() == ""){--%>
                                <%--        alert("BOM编码不能为空!");--%>
                                <%--        isValid = false;--%>
                                <%--        return false;--%>
                                <%--    }--%>
                                <%--});--%>
                            }
                            if(isValid){
                                isValid = $(this).form('validate');
                            }

                            if (!isValid){
                               $("#mainUrl").tabs("loaded");	// hide progress bar while the form is invalid
                            }
                            return isValid;	// return false will stop the form submission
                        },
                        success: function(result){
                            debugger;
                            var obj = $.parseJSON(result);
                            if(obj.status==200){
                                // var tab = $('#mainUrl').tabs('getSelected');
                                // debugger;
                                // var id = $.parseJSON(result).data.id;
                                // tab.panel('refresh', '/flowable/productCodeApply/edit/'+id);
                                var tab = $('#mainUrl').tabs('getSelected');
                                var index = $('#mainUrl').tabs('getTabIndex', tab);
                                $("#mainUrl").tabs("close", index)
                            }else{
                                alert(obj.message);
                            }

                           $("#mainUrl").tabs("loaded");	// hide progress bar while submit successfully
                        }
                    });
                //}
            //});

        }
        
        function check${timestamp}(result,name) {
            //$.messager.confirm('', '确认是否操作?', function(r){
                //if(r){
                    $("#mainUrl").tabs("loading","处理中...")
                    var opinoin = $("#"+name+"Opinion${timestamp}").val();
                    //var id = $("#id${timestamp}").val();
                    debugger;
                    if(result != "1"){
                        if(opinoin == "" && name!="processmgn"){
                            alert("请填写审核意见！")
                            $("#mainUrl").tabs("loaded");
                            return false;
                        }
                    }

                    var param = {
                        "checkDate":name+"Date",
                        "checkPerson":name+"Sign",
                        "checkResult":result,
                        "checkResultForRole":{
                            "resultName":name+"Result",
                            "resultValue":result
                        },
                        "checkOpinionForRole":{
                            "opinionName":name+"Opinion",
                            "opinionValue":opinoin
                        }
                    };
                    debugger;
                    if(name=="processmgn"){
                        delete param.checkOpinionForRole;
                    }
                    $.ajax({
                        type: "POST",
                        url: "/flowable/productCodeApply/check/${entity.id}/${taskId}",
                        contentType: "application/json; charset=utf-8",
                        data: JSON.stringify(param),
                        dataType: "json",
                        success: function (message) {
                            debugger;
                           $("#mainUrl").tabs("loaded");
                            if (message.status == 200) {
                                if(window.location.href.indexOf('eipLogin') > -1){
                                    var data = {};
                                    data.Code = 11;
                                    data.Msg = "审批成功";
                                    PM.send(top.window.parent, "fromSource", data);
                                }else{
                                    //alert("保存成功");
                                    var tab = $('#mainUrl').tabs('getSelected');
                                    //if(result=='1' && name == 'cw'){
                                    var tab = $('#mainUrl').tabs('getSelected');
                                    var index = $('#mainUrl').tabs('getTabIndex', tab);
                                    $("#mainUrl").tabs("close", index)
                                    <%--}else{--%>
                                    <%--    tab.panel('refresh', '/flowable/productCodeApply/edit/${entity.id}');--%>

                                    <%--}--%>
                                }



                            }else{
                                if(window.location.href.indexOf('eipLogin') > -1){
                                    var data = {};
                                    data.Code = 0;
                                    data.Msg = "审批失败";
                                    PM.send(top.window.parent, "fromSource", data);

                                }else{
                                    alert(message.message);
                                }

                            }

                        },
                        error: function (message) {
                           $("#mainUrl").tabs("loaded");
                            alert("保存失败");
                        }
                    });
                //}
           // });

        }

        function changeHandler${timestamp}() {
            // $.messager.progress({
            //
            //     title:'提示',
            //     msg:'文本',
            //
            // });
            var userId =  $("#assign${timestamp}").val();
            if(userId == ""){
                alert("处理人不能为空！");
               $("#mainUrl").tabs("loaded");
            }else{
                $("#changeHandlerButton${timestamp}").linkbutton('disable');
                $.post("/flowable/productCodeApply/changeHandler",{id:"${entity.id}",taskId:"${taskId}",userId:userId},function (result) {
                    if(result.status == 200){
                        if(window.location.href.indexOf('eipLogin') > -1){
                            var data = {};
                            data.Code = 11;
                            data.Msg = "审批成功";
                            PM.send(top.window.parent, "fromSource", data);
                        }else{
                            <%--alert("修改当前处理人成功");--%>
                            <%--var tab = $('#mainUrl').tabs('getSelected');--%>
                            <%--tab.panel('refresh', '/flowable/productCodeApply/edit/${entity.id}');--%>
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
                            alert("修改当前处理人失败");
                            $("#changeHandlerButton${timestamp}").linkbutton('enable');
                        }

                    }
                    //$("#mainUrl").tabs("loaded");;
                });
            }

        }

        function changePage${timestamp}() {
            alert(11);
        }

        function loadSubForm${timestamp}() {
            if("${currentNode=='usertask1' && isHandler || currentNode == 'editable'}"=="true"){
                if($("#applyType${timestamp}").val() == "1"){
                    $("[id^=applys][id$=product${timestamp}]").each(function () {
                        $(this).combobox("setValue",$(this).combobox("getText"));
                    });
                }else if($("#applyType${timestamp}").val() == "2"){
                    $("[id^=product_][id$=_${timestamp}]").each(function () {
                        $(this).combobox("setValue",$(this).combobox("getText"));
                    });
                }
                $("#subForm111${timestamp}").load("/flowable/productCodeApply/subForm/Add",
                    $('#productCodeApply${timestamp}').serializeObject());
            }else{
                $("#subForm111${timestamp}").load("/flowable/productCodeApply/subForm/View",{id:"${entity.id}",timestamp:"${timestamp}"});
            }
        }

        function confirmDlg${timestamp}(v) {
            var count = $("#applyCount${timestamp}").val();
            if(count < 1){
                $.messager.alert('警告','申请数目必须大于0！');
            }else{
                var m = "确认操作？";
                if(v=='type'){
                    m = "确认修改申请类型？"
                }else if(v=='count'){
                    m = "确认修改申请数目？";
                }
                $.messager.confirm('',m,function(r){

                    if (r){
                    	var maxCount =  $("#maxApplyCount${timestamp}").val();
                        if($("#input_applyType${timestamp}").val()!=$("#applyType${timestamp}").val()){
                            $("#subForm111${timestamp}").html("");
                        }
                        $("#input_applyType${timestamp}").val($("#applyType${timestamp}").val());
                        if('2' == $("#applyType${timestamp}").val()){
                            $("#pdtcheck${timestamp}").hide();
                        }else{
                            $("#pdtcheck${timestamp}").show();
                        }
                        if(parseInt($("#applyCount${timestamp}").val()) > parseInt(maxCount)){
                        	$.messager.alert("提示信息","超过了申请最大值，按照最大值, 如果想调整，请联系管理员");
                        	$("#input_applyCount${timestamp}").val(maxCount);
                            $("#applyCount${timestamp}").numberbox("setValue",maxCount);
                        }else{                        	
                        	$("#input_applyCount${timestamp}").val($("#applyCount${timestamp}").val());
                        }
                        $("#clearBasisMaterial${timestamp}").val("false");
                        loadSubForm${timestamp}();
                    }else{
                        //取消
                        $("#applyType${timestamp}").combobox("setValue",$("#input_applyType${timestamp}").val());
                        //$("#applyCount${timestamp}").val($("#input_applyCount${timestamp}").val());
                        $("#applyCount${timestamp}").numberbox("setValue",$("#input_applyCount${timestamp}").val());
                    }
                });
            }

        }

        function updateBaseInfo${timestamp}() {
            $.messager.confirm('', '确认是否更新研发基本信息?', function(r){
                if(r){
                    $.messager.progress();
                    var opinoin = $("#"+name+"Opinion${timestamp}").val();

                    var param = {
                        "checkDate":"processmgnDate",
                        "checkPerson":"processmgnSign",
                        "checkResult":"1",
                        "checkResultForRole":{
                            "resultName":"processmgnResult",
                            "resultValue":"1"
                        }
                    };

                    $.ajax({
                        type: "POST",
                        url: "/flowable/productCodeApply/updateBaseInfo/${entity.id}/${taskId}",
                        contentType: "application/json; charset=utf-8",
                        data: JSON.stringify(param),
                        dataType: "json",
                        success: function (message) {
                            if (message.status == 200) {
                                alert("保存成功");
                                var tab = $('#mainUrl').tabs('getSelected');
                                tab.panel('refresh', '/flowable/productCodeApply/edit/${entity.id}');
                            }else{
                                alert("保存失败");
                            }
                           $("#mainUrl").tabs("loaded");
                        },
                        error: function (message) {
                            alert("保存失败");
                           $("#mainUrl").tabs("loaded");
                        }
                    });
                }
            });
        }

        function checkSubForm${timestamp}() {
            $("[id^='applys'][id$='prodlineId${timestamp}']").each(function(){
                var val = $(this).combobox('getValue');
                var s = $.trim(val);
                var a = $(this);

                //如果为空
                if(s == ""){
                    $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val("");
                }else if(isNaN(s)){
                    //如果 val 不为数字类型则是手动输入 把值设空
                    $(this).combobox('setValue',"");
                    $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);
                }else {
                    var prodlineName = $("#applys\\["+$(this).attr("index")+"\\]\\.prodlineName${timestamp}").val();
                    //如果为数字，两种情况：1、为产品线id 2、手动输入为数字
                    $.post("/finance/fprodLine/getById/"+s,function (result) {
                        //如果名称不一致则为手动输入
                        if(result.data.prodlineDesc != prodlineName){
                            // id 置空
                            $(a).combobox('setValue',"");
                            // 产品线名称设为手动输入的值
                            $("#applys\\["+$(a).attr("index")+"\\]\\.prodlineName${timestamp}").val(val);
                        }
                    });
                }
            });

        }

        function deleteProcess${timestamp}() {
            $.post("/flowable/productCodeApply/deleteById/${entity.id}",function (result) {
                if(result.status == 200){
                    var tab = $('#mainUrl').tabs('getSelected');
                    var index = $('#mainUrl').tabs('getTabIndex', tab);
                    $("#mainUrl").tabs("close", index)
                }else{
                    alert(result.message);
                }
            });
        }

    </script>
</body>
</html>
