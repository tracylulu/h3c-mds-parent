<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/5/16
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="common/css/bds.css" />
</head>
<body>

<jsp:include page="chooseFile.jsp"/>
<jsp:include page="chooseFproductCode.jsp"/>



    <div style="font-size:13px;width: 98%;margin:auto;overflow:auto;" >
        <table class="product-code" border="1" cellspacing="0" width="98%" style="border-color:#ABABAB;margin:auto">
            <tr >
                <th>BOM编码</th>
                <th>BOM描述</th>
                <th>产品代码</th>
                <th>对内英文描述</th>
                <th>对外中文描述</th>
                <th>对外英文描述</th>
                <th>商业模式</th>
<%--                <th>产品线</th>--%>
                <th>产品编码</th>
                <th>产品族</th>
                <th>产品中文名称</th>
            </tr>
            <c:forEach var="apply" items="${entity.applys}" varStatus="status">
            <tr>

                <input type="hidden" id="id_${status.index}_${timestamp}" name="applys[${status.index}].id"  value="${apply.id}"/>
                <td width="8%">${apply.projectNo}</td>
                <td width="8%">
                    ${apply.projectName}
                </td>
                <td width="8%">
                    ${apply.productNum}
                </td>
                <td width="8%">
                    ${apply.insideDescEn}
                </td>
                <td width="8%">
                    ${apply.abroadDescCn}
                </td>
                <td width="8%">
                    ${apply.abroadDescEn}
                </td>

                <td width="8%">

                    <input index="${status.index}" data-options="valueField:'id',required:true,width:'100%'" editable="false" class="easyui-combobox" id="businessModelId_${status.index}_${timestamp}" name="applys[${status.index}].businessModelId" value="${apply.businessModelId}" style="width:100%;">
                    <input index="${status.index}" type="hidden" id="businessModel_${status.index}_${timestamp}" name="applys[${status.index}].businessModel" value="${apply.businessModel}" style="width:100%;">  
                </td>
<%--                <td width="8%">--%>
<%--                    <input index="${status.index}" editable="false" data-options="valueField:'prodlineDesc',textField:'prodlineDesc',required:true,width:'100%'" class="easyui-combobox" id="prodlineName_${status.index}_${timestamp}" name="applys[${status.index}].prodlineName" value="${apply.prodlineName}"/>--%>
<%--                </td> --%>
				<td width="7%">
                    <span id="span_productCode_${status.index}_${timestamp}">
                        ${apply.productCode}
                    </span>
                    <a  href="javascript:void(0)" style="text-align: right;height: 24px;"
                        class="easyui-linkbutton" onclick="layoutWin${timestamp}('${status.index}');">请选择</a>
                    <input id="productCode_${status.index}_${timestamp}" name="applys[${status.index}].productCode" value="${apply.productCode}" type="hidden">
                </td>
                <td width="8%">
                    <input index="${status.index}" editable="false" data-options="valueField:'id',textField:'prodName',required:true,width:'100%'" class="easyui-combobox" id="prodId_${status.index}_${timestamp}" name="applys[${status.index}].prodId" value="${apply.prodId}"/>
                </td>
                <td width="8%">
                    <input index="${status.index}" editable="false" data-options="valueField:'id',textField:'productNameCn',required:true,width:'100%'" class="easyui-combobox" id="fprodCodeId_${status.index}_${timestamp}" name="applys[${status.index}].fprodCodeId" value="${apply.fprodCodeId}"/>
                </td>
                
            </tr>


            </c:forEach>
        </table>
        <br>
    </div>


<div style="text-align: center">
    <a href="#" class="easyui-linkbutton" onclick="submit${timestamp}();" id="sub${timestamp}">提交</a>

</div>

<script type="text/javascript">
    $(function () {
        $.parser.parse($("#subForm111${timestamp}"));
        debugger;
        var dep = $("#applyDep${timestamp}").val();
        <%--$.get("/finance/fprodLine/getByDept/"+dep,function (result) {--%>

        <%--    // var a = new Array();--%>
        <%--    // $.each(result.data,function(i,e){--%>
        <%--    //     a.push({"id":e.id,"text":e.prodlineDesc});--%>
        <%--    // });--%>
        <%--    $("[id^=applys][id$=prodline${timestamp}]").combobox("loadData",result.data);--%>
        <%--    $("[id^=applys][id$=prodline${timestamp}]").each(function(){--%>
        <%--        var v = $(this).combobox("getValue");--%>
        <%--        if("D0002" == dep){--%>
        <%--            $(this).combobox({editable:true});--%>
        <%--        }else if("D0001" == dep || "D0003" == dep){--%>
        <%--            $(this).combobox({editable:false});--%>
        <%--        }--%>
        <%--        $(this).combobox("setValue",v);--%>
        <%--    });--%>


        <%--});--%>

        //初始化商业模式
        $.get("/projectWebFlow/getDicItem?type=34",function (result) {

            var a = new Array();
            $.each(result,function(i,e){
                a.push({"id":e.dicValue,"text":e.dicName});
            });
            //businessModel_${status.index}_${timestamp}
            $("[id^=businessModelId_][id$=_${timestamp}]").combobox("loadData",a);
            //$("[id^=applys][id$=proCaName${timestamp}]").val(e.dicValue);
        });

        //初始化产品线
        <%--$.get("/finance/fprodLine/getDistinctNameAll",function (result) {--%>
        <%--    debugger;--%>
        <%--    $("[id^='prodlineName_'][id$='_${timestamp}']").combobox("loadData",result);--%>
        <%--});--%>



        //产品线绑定事件
        <%--$("[id^='prodlineName_'][id$='_${timestamp}']").combobox({--%>
        <%--    onSelect:function (e) {--%>

        <%--        var a = this;--%>
        <%--        debugger;--%>
        <%--        $.get("/finance/fprod/getByProdlineName?prodlineName="+e.prodlineDesc,function (result) {--%>
        <%--            $("#prodId_"+$(a).attr("index")+"_${timestamp}").combobox("loadData",result.data);--%>
        <%--        });--%>
        <%--    },--%>
        <%--    onChange:function () {--%>
        <%--        debugger;--%>
        <%--        var a = this;--%>
        <%--        $("#prodId_"+$(a).attr("index")+"_${timestamp}").combobox("clear");--%>
        <%--    }--%>
        <%--});--%>
        //产品族绑定事件
        $("[id^='prodId_'][id$='_${timestamp}']").combobox({
            onSelect:function (e) {
                var a = this;
                //$("#applys\\["+$(a).attr("index")+"\\]\\.productName${timestamp}").val(e.prodName);
                //$("#span_applys\\["+$(a).attr("index")+"\\]\\.productNo${timestamp}").html(e.prodNo);
                //$("#applys\\["+$(a).attr("index")+"\\]\\.productNo${timestamp}").textbox('setValue',e.prodNo);
                //初始化产品编码
                $.get("/finance/fproductCode/getByProdIdNo00/"+e.id,function (result) {
                    $("#fprodCodeId_"+$(a).attr("index")+"_${timestamp}").combobox("loadData",result.data);
                });
            },
            onChange:function () {
                var a = this;
                $("#fprodCodeId_"+$(a).attr("index")+"_${timestamp}").combobox("clear");
                $("#span_productCode_"+$(a).attr("index")+"_${timestamp}").html("");
                $("#productCode_"+$(a).attr("index")+"_${timestamp}").val("");
            }
        });

        //产品编码绑定事件
        $("[id^='fprodCodeId_'][id$='_${timestamp}']").combobox({
            onSelect:function (e) {
                var a = this;
                $("#span_productCode_"+$(a).attr("index")+"_${timestamp}").html(e.productCode);
                $("#productCode_"+$(a).attr("index")+"_${timestamp}").val(e.productCode);
            }
        });


        //商业模式绑定事件
        $("[id^='businessModelId_'][id$='_${timestamp}']").combobox({
   		 onSelect:function(e){debugger;
   			 var a = this;
   			//$("#businessModelId_"+$(a).attr("index")+"_${timestamp}").val(e.id);
   			 //$("#businessModelId "+ $(a).attr("index) + "_${timestamp}").val(e.id);
   			 $("#businessModel_"+$(a).attr("index")+"_${timestamp}").val(e.text);
   			 //$("[id^='businessModel_'][id$='_${timestamp}']").val(e.text);
   		} 
       });

    });



</script>

</body>
</html>
