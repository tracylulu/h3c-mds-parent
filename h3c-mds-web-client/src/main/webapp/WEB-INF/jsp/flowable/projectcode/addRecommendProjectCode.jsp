<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>编辑推荐项目编码</title>
</head>
		
<body>
	<div class="toptoolbar" style="position:fixed;">
		<a href="#" id="btnQuit${timestamp}" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'fa fa-save'"
			>保存退出</a>
	</div>
	<div class="toptoolbarhr" style="margin-top:2%;"></div>
	<form method='post' name='linkeyform${timestamp}' id='linkeyform${timestamp}' class="easyui-form" data-options="novalidate:true">
        <p style="text-align: center;">
            <span style="font-size: 20px;">推荐项目编码基本信息 </span>
        </p>
        <h2 class="subfild" id="T00000_${timestamp}" >
            <span>推荐项目编码基本信息</span>
        </h2>
        <div id="SUBFORM_T00000_${timestamp}">
            <table class="linkeytable" data-sort="sortDisabled">
                <tbody>
                
                <tr class="firstRow">
                    <td width="15%" align="right" style="word-break: break-all;">所属PDT</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="85%">
                        <input id="pdtNo${timestamp}" name="pdtNo" value="${entity.pdtNo}" type="hidden"/>
                        <input style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'text',required:true"  id="pdtName${timestamp}" name="pdtName" class="easyui-textbox" value="${entity.pdtName}" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <input id="id${timestamp}" name="id" value="${id}" type="hidden"/>
                    <td width="15%" align="right" style="word-break: break-all;">项目编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="85%">
                        <input style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'text',required:true" id="proNumber${timestamp}" name="proNumber" class="easyui-textbox" value="${entity.proNumber}" />
                    </td>
                </tr>
                <tr class="firstRow">
                   
                    <td width="15%" align="right" style="word-break: break-all;">备注</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" width="85%">
                        <input style="width: 400px; height: 30px;" data-options="valueField:'id',textField:'text'" id="remark${timestamp}" name="remark" class="easyui-textbox" value="${entity.remark}" />
                    </td>
                </tr>
                </tbody>
            </table>
        </div>


    </form>
<script type="text/javascript">

		
		$(function () {
		    $('#btnQuit${timestamp}').linkbutton({
		        iconCls: 'fa fa-save',
		        onClick: postSave${timestamp}
		    });
		});
		
		//保存方法   直接用jq的click事件easyui低版本不识别无法禁用
		function postSave${timestamp}(){
			$('#linkeyform${timestamp}').form('submit', {
		        url : "projectWebFlow/updateRecommendProjectCode",
		        onSubmit : function() {
		            var flag = $(this).form('enableValidation').form('validate');
		            if(!flag){
		                $('#btnQuit${timestamp}').linkbutton('enable');
		            }
		            return flag;
		        },
		        success : function(data) {
		            var obj = $.parseJSON( data );
		            //跳转查询页面
		            //{"success:true,msg:xxx"}
		            //{"success:false,msg:xxx"}
		            //eval("var obj = " + data)
		
		            if(obj.status == 200){
		                var tab = $('#mainUrl').tabs('getSelected');
		                var index = $('#mainUrl').tabs('getTabIndex', tab);
		                //$('#btnQuit${id_suffix}').linkbutton('enable');
		                $("#mainUrl").tabs("close", index)
		            } else {
		                alert(obj.msg);
		                $('#btnQuit${timestamp}').linkbutton('enable');
		            }
		        }
		    });
		}
		
		
</script>
</body>
</html>
