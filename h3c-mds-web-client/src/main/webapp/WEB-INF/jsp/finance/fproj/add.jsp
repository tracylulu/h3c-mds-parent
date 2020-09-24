<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增项目编码</title>
    <link rel="stylesheet" type="text/css" href="common/css/bds.css" />
</head>
		
<body>
	<div class="toptoolbar" style="position:fixed;z-index:5555">
		<a href="#" id="btnQuit${id_suffix}" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'fa fa-save'"
			>保存退出</a>
			
		<a href="#" id="copyProjectCode${id_suffix}" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'fa fa-save'"
			>复制到原数据</a>
		
		<a href="#" id="clearOldProjectCode${id_suffix}" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'fa fa-save'"
			>清空原数据</a>
		
		<%-- <a href="#" id="getNameAndPdtByProductCode${id_suffix}" class="easyui-linkbutton" plain="true"
			data-options="iconCls:'fa fa-save'"
			>根据产品编码联系产品名称和PDT，产品线</a> --%>
	</div>
	<div class="toptoolbarhr" style="margin-top:2%;"></div>
	<form method='post' name='linkeyform${id_suffix}' id='linkeyform${id_suffix}' class="easyui-form" data-options="novalidate:true">
        <p style="text-align: center;">
            <span style="font-size: 20px;">项目编码基本信息 </span>
        </p>
        <%-- <h2 class="subfild" id="T00000_${id_suffix}" >
            <span>项目编码基本信息</span>
        </h2> --%>
        <br><br><br>
        <div style="width:96%;">
            <table class="linkeytable" data-sort="sortDisabled">
                <tbody>
                <tr class="firstRow">
                    <input id="id${id_suffix}" name="id" value="${id}" type="hidden"/>
                    <td align="right" style="word-break: break-all;">种类</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height:30px;" data-options="valueField:'id',textField:'text',required:true" id="fObjca${id_suffix}" name="fObjca" class="easyui-combobox" value="" />
                    </td>
                    
                    <td  align="right" style="word-break: break-all;">原种类</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height:30px;" data-options="valueField:'id',textField:'text'" id="fOldObjca${id_suffix}" name="fOldObjca" class="easyui-combobox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">所属PDT</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input id="fPdtNo${id_suffix}" name="fPdtNo" value="" type="hidden"/>
                        <input style="height:30px;" data-options="valueField:'id',textField:'text'" readonly="readonly" id="fPdtName${id_suffix}" name="fPdtName" class="easyui-textbox" value="" />
                    </td>
                    
                    <td  align="right" style="word-break: break-all;">原所属PDT</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;"  id="fOldPdtName${id_suffix}" name="fOldPdtName" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">项目编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height:30px;" data-options="required:true" id="fProjno${id_suffix}" name="fProjno" readonly="readonly" class="easyui-textbox" value="" />
                    </td>
                    
                    <td  align="right" style="word-break: break-all;">原项目编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldProjno${id_suffix}" name="fOldProjno" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">项目名称</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" data-options="required:true" id="fProjname${id_suffix}" name="fProjname" readonly="readonly" class="easyui-textbox" value="" />
                    </td>
                    
                    <td align="right" style="word-break: break-all;">原项目名称</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldProjname${id_suffix}" name="fOldProjname" readonly="readonly" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">项目代号</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fProjcode${id_suffix}" name="fProjcode" class="easyui-textbox" value="" />
                    </td>
                    
                     <td  align="right" style="word-break: break-all;">原项目代号</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldProjcode${id_suffix}" name="fOldProjcode" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">所属产品线</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fProductlineName${id_suffix}" readonly="readonly" name="fProductlineName" class="easyui-textbox" value="" />
                    </td>
                    
                    <td  align="right" style="word-break: break-all;">原所属产品线</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldProductlineName${id_suffix}" name="fOldProductlineName" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">对应版本</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fVersion${id_suffix}" name="fVersion" class="easyui-textbox" value="" />
                    </td>
                    
                     <td  align="right" style="word-break: break-all;">原对应版本</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldVersion${id_suffix}" name="fOldVersion" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">服务的产品编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fProductCode${id_suffix}" name="fProductCode" readonly="readonly" class="easyui-textbox" value="" />
                    </td>
                    
                    <td  align="right" style="word-break: break-all;">原服务的产品编码</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldProductno${id_suffix}" name="fOldProductno" readonly="readonly" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">服务的产品名称</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="productNameCn${id_suffix}" name="productNameCn" readonly="readonly" class="easyui-textbox" value="" />
                    </td>
                    
                     <td  align="right" style="word-break: break-all;">原服务的产品名称</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldProductname${id_suffix}" name="fOldProductname" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">此产品应该分摊的项目比例(%)</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="rate${id_suffix}" name="rate" class="easyui-textbox" value="" />
                    </td>
                    
                    <td  align="right" style="word-break: break-all;">原此产品应该分摊的项目比例(%)</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldRate${id_suffix}" name="fOldRate" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">费用分摊运营商比重(%)</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fBizhong${id_suffix}" name="fBizhong" class="easyui-textbox" value="" />
                    </td>
                    
                     <td  align="right" style="word-break: break-all;">原费用分摊运营商比重(%)</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldBizhong${id_suffix}" name="fOldBizhong" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">费用分摊非运营商比重(%)</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fFbizhong${id_suffix}" name="fFbizhong" class="easyui-textbox" value="" />
                    </td>
                    
                    <td  align="right" style="word-break: break-all;">原费用分摊非运营商比重(%)</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="fOldFbizhong${id_suffix}" name="fOldFbizhong" class="easyui-textbox" value="" />
                    </td>
                </tr>
                
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">编码生效日期</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style="height: 30px;" id="begintime${id_suffix}" name="begintime" data-options="formatter:myformatter${id_suffix},parser:myparser${id_suffix},required:true" class="easyui-datebox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">项目经理</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px"">
                        <input style="width:58%;height:30px;" id="fProjmng${id_suffix}" name="fProjmng" class="auto_selusers_false" value="" />
                    </td>
                </tr>
                
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">申请人部门</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <select data-options="required:true" editable="false" class="easyui-combobox" id="fDept${timestamp}" name="fDept" style="width:66%;height:30px;">
                            <option value="D0001" >研发</option>
                            <option value="D0002" >专业服务部</option>
                            <option value="D0003" >其他</option>
                        </select>
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">立项时间</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" >
                        <input style=" height: 30px;" id="fStartProjectTime${id_suffix}" name="fStartProjectTime" data-options="formatter:myformatter${id_suffix},parser:myparser${id_suffix}" class="easyui-datebox" value="" />
                    </td>
                </tr>
                
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">对应评审点</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px">
                        <input style=" height: 30px;"  data-options="valueField:'id',textField:'text',required:true"  id="fAssignPoint${id_suffix}" name="fAssignPoint" class="easyui-combobox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">备注</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" >
                        <input style=" height: 30px;"  id="remark${id_suffix}" name="remark" class="easyui-textbox" value="" />
                    </td>
                </tr>
                <tr class="firstRow">
                    <td  align="right" style="word-break: break-all;">编码状态</td>
                    <td style="word-break: break-all;padding-left:20px;height:30px" >
                        <select data-options="required:true" class="easyui-combobox" id="mark${id_suffix}" name="mark" style="width:65%;height:30px;">
                            <option value="新增" >新增</option>
                            <option value="改变" >改变</option>
                            <option value="停用" >停用</option>
                        </select>
                    </td>
                </tr>
                </tbody>
            </table>
            <br><br><br>
        </div>

        

    </form>
    <link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css"/>
	<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="common/js/common.js"></script>
	<style>
	
	
	 .firstRow  td:nth-of-type(odd) {
	width:17%;
	padding:0px 20px!important; 
}

.firstRow  td:nth-of-type(even) {
	width:35%;
	/* padding:0px 20px!important; */
}
.firstRow  td input{
width:20%;
}
.firstRow  td select{
width:35%;
}
	</style>
<script type="text/javascript">

		
		$(function () {
			
			
			//项目类别
			$.post("/projectWebFlow/getDicItem?type=6",function (result) {
			
			    var a = new Array();
			    $.each(result,function(i,e){
			        a.push({"id":e.dicValue,"text":e.dicName});
			    });
			    $("#fObjca${id_suffix}").combobox("loadData",a);
			    $("#fOldObjca${id_suffix}").combobox("loadData",a);
			    //$("[id^=applys][id$=proCaName${timestamp}]").val(e.dicValue);
			});
			
			
			//对应的评审点
	    	$.post("/projectWebFlow/getDicItem?type=21",function (result) {

	            var a = new Array();
	            $.each(result,function(i,e){
	                a.push({"id":e.dicValue,"text":e.dicName});
	            });
	            $("#fAssignPoint${id_suffix}").combobox("loadData",a);
	        });
			
	    	if('${isEdit}'=='false'){
		        $.post('/finance/fprojectCode/getFProjectCodeByCode?fProjno=${projCode}&productCode=${productCode}',function (result) {
		            $('#linkeyform${id_suffix}').form('load',result);
		            
		          //修改产品线提示
					 $("fProductlineName${id_suffix}").textbox({  
					    onChange: function(value) {
					        alert("请联系管理员");
					    }
					}); 
					
					//修改产品名称提示
					
					 $("#productNameCn${id_suffix}").textbox({  
					    onChange: function(value) {
					    	alert("请联系管理员");
					    }
					}); 
					
					//所属pdt
					 $("#fPdtName${id_suffix}").textbox({  
					    onChange: function(value) {
					    	alert("请联系管理员");
					    }
					}); 
		        });
		    }
	
			
			
			
			
			
		    $('#btnQuit${id_suffix}').linkbutton({
		        iconCls: 'fa fa-save',
		        onClick: postSave${id_suffix}
		    });
		
		    $('#copyProjectCode${id_suffix}').linkbutton({
		        iconCls: 'fa fa-save',
		        onClick: function(){
		        	$("#fOldObjca${id_suffix}").combobox("setValue", $('#fObjca${id_suffix}').combobox('getText'));
		        	$("#fOldPdtName${id_suffix}").textbox("setValue", $("#fPdtName${id_suffix}").val());
		        	$("#fOldProjno${id_suffix}").textbox("setValue", $("#fProjno${id_suffix}").val());
		        	$("#fOldProjname${id_suffix}").textbox("setValue", $("#fProjname${id_suffix}").val());
		        	$("#fOldProjcode${id_suffix}").textbox("setValue", $("#fProjcode${id_suffix}").val());
		        	$("#fOldProductlineName${id_suffix}").textbox("setValue", $("#fProductlineName${id_suffix}").val());
		        	$("#fOldVersion${id_suffix}").textbox("setValue", $("#fVersion${id_suffix}").val());
		        	$("#fOldProductno${id_suffix}").textbox("setValue", $("#fProductCode${id_suffix}").val());
		        	$("#fOldProductname${id_suffix}").textbox("setValue", $("#productNameCn${id_suffix}").val());
		        	$("#fOldRate${id_suffix}").textbox("setValue", $("#rate${id_suffix}").val());
		        	$("#fOldBizhong${id_suffix}").textbox("setValue", $("#fBizhong${id_suffix}").val());
		        	$("#fOldFbizhong${id_suffix}").textbox("setValue", $("#fFbizhong${id_suffix}").val());
		        }
		    });
		    
		    $('#clearOldProjectCode${id_suffix}').linkbutton({
		        iconCls: 'fa fa-save',
		        onClick: function(){
		        	$("#fOldObjca${id_suffix}").combobox("setValue", "");
		        	$("#fOldPdtName${id_suffix}").textbox("setValue", "");
		        	$("#fOldProjno${id_suffix}").textbox("setValue", "");
		        	$("#fOldProjname${id_suffix}").textbox("setValue", "");
		        	$("#fOldProjcode${id_suffix}").textbox("setValue", "");
		        	$("#fOldProductlineName${id_suffix}").textbox("setValue", "");
		        	$("#fOldVersion${id_suffix}").textbox("setValue", "");
		        	$("#fOldProductno${id_suffix}").textbox("setValue", "");
		        	$("#fOldProductname${id_suffix}").textbox("setValue", "");
		        	$("#fOldRate${id_suffix}").textbox("setValue", "");
		        	$("#fOldBizhong${id_suffix}").textbox("setValue", "");
		        	$("#fOldFbizhong${id_suffix}").textbox("setValue", "");
		        }
		    });
		    
		    
		    $('#getNameAndPdtByProductCode${id_suffix}').linkbutton({
		        iconCls: 'fa fa-save',
		        onClick: function(){
		        	var productCode = $("#fProductCode${id_suffix}").val();
		        	if(productCode != ""){
		        		//根据产品编码查出pdt和产品名称
		        		$.get("/finance/fprojectCode/getFProductByCode?productCode=" + productCode,function (result) {debugger;
		        			$("#fPdtNo${id_suffix}").val(result.data.pdtNo);
		        			$("#fPdtName${id_suffix}").textbox("setValue",result.data.pdtName);
		        			$("#productNameCn${id_suffix}").textbox("setValue",result.data.productNameCn);
		        			$("#fProductlineName${id_suffix}").textbox("setValue",result.data.prodlineName);
		        			$("#productNameCn${id_suffix}").textbox("setValue",result.data.productNameCn);
		    			});
		        	}else{
		        		alert("请输入产品编码")
		        	}
		        }
		    });
		    
		    
		});
		
		//保存方法   直接用jq的click事件easyui低版本不识别无法禁用
		function postSave${id_suffix}(){
		
		    $('#btnQuit${id_suffix}').linkbutton('disable');
		    if('${isEdit}'=='true'){
		        url="/finance/fprojectCode/addProjectCode";//编辑
		    }else{
		        url="/finance/fprojectCode/editProjectCode";//新增
		    }
		
		    $('#linkeyform${id_suffix}').form('submit', {
		        url : url,
		        method : 'post',
		        onSubmit : function() {
		            var flag = $(this).form('enableValidation').form('validate');
		            if(!flag){
		                $('#btnQuit${id_suffix}').linkbutton('enable');
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
		                $('#btnQuit${id_suffix}').linkbutton('enable');
		            }
		        }
		    });
		}
		
		function myformatter${id_suffix}(date){
		    var y = date.getFullYear();
		    var m = date.getMonth()+1;
		    var d = date.getDate();
		    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
		}
		function myparser${id_suffix}(s){
		    if (!s) return new Date();
		    var ss = (s.split('-'));
		    var y = parseInt(ss[0],10);
		    var m = parseInt(ss[1],10);
		    var d = parseInt(ss[2],10);
		    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
		        return new Date(y,m-1,d);
		    } else {
		        return new Date();
		    }
		}
	
		
		
		
		
		
		
</script>
</body>
</html>
