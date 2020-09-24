
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>研发产品R级以下基本信息修改申请表</title>
</head>
<body id="tabStyle${id_suffix}" style="width: 100%">
<input type="hidden" id="hidId${id_suffix}">
<input type="hidden" id="hidDelId${id_suffix}">

	<a href="#" class="easyui-linkbutton" onclick="selProduct${id_suffix}('bl');">查看已有基线版本清单</a>
	<br>
	<input type="checkbox" id="addproductbl${id_suffix}" onclick="checkProduct${id_suffix}('add','bl')" name="baseLines[1].applytype" style="margin-top: 2px;">
	&nbsp;
	<span class="checkbox191030">新增基线版本</span>
	<span class="numSpan">新增的软件个数：</span>
	<span id="addblsum${id_suffix}" style="color: red;"></span>
	<br>
	<div style="margin: auto; width: 100%; display: none; font-size: 12px;" id="addTabbl${id_suffix}">
		<%-- <a href="#" class="easyui-linkbutton" style="margin-left:30px;" name="copyRelease"  name="copyRelease" onclick="selectProject${id_suffix}('bl');">继承现有版本信息</a> --%>
		<span class="msgShow">（注意：多值请用回车来区分，请用详细版本号“产品/特性缩写 VxxxRxxx[LLL]CxxBxxyDxxx[SPxx]”格式） 同一版本的对内、对外、中英文、平台基线版本号的上下位置请保持一致，以免出错。</span>


		<table class="product" border="1" cellspacing="0" style="margin-bottom: 15px; margin: 0px 10px;">
			<tr>
				<!-- <td width="20%">新增后的内码:</td> -->
				<td width="50%" class="aLink">
					要新增的软件版本中文名称
					<a href="javascript:void(0)" style="height: 34px; width: 28%; margin: 0px;" class="easyui-linkbutton" onclick="clear${id_suffix}()">清空全部新增基线版本信息</a>
				</td>
				<td width="50%" class="aLink">
					要新增的软件版本英文名称
					<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('add','bl','','eng');">与中文名称设置一致</a>
				</td>

			</tr>
			<tr>
				<!--  <td width="20%" rowspan="5"></td> -->
				<td width="50%">
					<textarea name="baseLines[1].baseline" autoHeight="true" style="width: 100%;" id="addobjectbl${id_suffix}">${entity.baseLines[1].baseline}</textarea>
				</td>
				<td width="50%">
					<textarea name="baseLines[1].engbaseline" autoHeight="true" style="width: 100%;" id="addengobjectbl${id_suffix}">${entity.baseLines[1].engbaseline}</textarea>
				</td>
			</tr>
			<tr>
				<td width="50%" class="aLink">
					要新增的软件版本对外中文名称
					<a href="#" class="easyui-linkbutton" style="padding: none" onclick="setProduct${id_suffix}('add','bl','out','');">与内部中文名称设置一致</a>
				</td>
				<td width="50%" class="aLink">
					要新增的软件版本对外英文名称
					<a href="#" class="easyui-linkbutton" style="padding: none" onclick="setProduct${id_suffix}('add','bl','out_','eng');">与内部中文名称设置一致</a>
				</td>
			</tr>
			<tr>
				<td width="50%">
					<textarea name="baseLines[1].baselineout" autoHeight="true" style="width: 100%;" id="addobjectoutbl${id_suffix}">${entity.baseLines[1].baselineout}</textarea>
				</td>
				<td width="50%">
					<textarea name="baseLines[1].engbaselineout" autoHeight="true" style="width: 100%;" id="addengobjectoutbl${id_suffix}">${entity.baseLines[1].engbaselineout}</textarea>
				</td>
			</tr>
			<tr>

				<td width="50%" class="aLink">
					<span style="font-size: 14px; font-weight: 700;">新增的软件版本的父版本</span>
					<br>
				</td>
				<td width="50%"></td>
			</tr>
			<tr>
				<td>
					<div style="display: inline-block; width: 100%">
						<a href="javascript:void(0)" style="height: 34px; width: 28%; margin: 0px;" class="easyui-linkbutton" onclick="dialogOpenBaseObject${id_suffix}('BL','Add')">选择对应父版本号(基线版本)</a>
						<a href="javascript:void(0)" style="height: 34px; width: 28%; margin: 0px;" class="easyui-linkbutton" onclick="dialogOpen${id_suffix}('PR','Add')">选择对应父版本号(路标版本)</a>
						<textarea name="baseLines[1].parentitemno" autoHeight="true" style="width: 40%; float: right; margin-bottom: -2%;" id="addparentitemno${id_suffix}">${entity.baseLines[1].parentitemno}</textarea>
					</div>
				</td>

				<td width="50%">


					<textarea name="entity.baseLineParentName" autoHeight="true" style="width: 100%;" id="addparentitem${id_suffix}">${entity.baseLineParentName}</textarea>

				</td>

				<td width="50%" style="display: none">

					<--父版本赋值 ctrl+V操作时使用-->
					<textarea name="baseLines[1].parentitemnoHidden" autoHeight="true" style="width: 100%;" id="addparentitemHidden${id_suffix}">${entity.baseLines[1].parentitemno}_${entity.baseLines[1].parentitemno}</textarea>

				</td>
			</tr>
			<tr>
				<td width="50%">
					<span style="font-size: 14px; font-weight: 700;">新增软件版本对应的平台基线版本号</span>
					<span class="msgShow">（注意：多值请用回车来区分,如无对应的平台基线版本号请在相应行用"*"代替）</span>
					<%-- <input name="baseLines[1].baseline1name" autoHeight="true" style="width:71%;height:30px;" id="baseline1name${id_suffix}" class="easyui-combotreegrid"/> --%>
				</td>
				<td></td>
			</tr>
			<tr>

				<td>
					<div style="display: inline-block; width: 100%;">
						<a href="javascript:void(0)" style="height: 34px; margin: 0px;" class="easyui-linkbutton" onclick="dialogBaseline1Name${id_suffix}('Add')">选择对应的平台基线版本号</a>
						<textarea name="baseLines[1].baseline1" autoHeight="true" style="width: 72%; margin-bottom: -2%; float: right;" id="addbaseline1${id_suffix}">${entity.baseLines[1].baseline1}</textarea>
					</div>

				</td>
				<td width="50%">

					<textarea name="entity.baseLine1Name" autoHeight="true" style="width: 100%;" id="addbaseline1name${id_suffix}">${entity.baseLine1Name}</textarea>

					<%--  <div style="display:none">
                <textarea name="baseLines[1].baseline1" autoHeight="true" style="width:100%;" id="addbaseline1${id_suffix}" >${entity.baseLines[1].baseline1}</textarea></td>
               </div> --%>
			</tr>
		</table>
	</div>

	<hr>
	<input type="checkbox" class="combobox-checkbox" id="editproductbl${id_suffix}" onclick="checkProduct${id_suffix}('edit','bl')" name="baseLines[2].applytype"
		style="margin-top: 2px;">
	&nbsp;
	<span class="checkbox191030">修改基线版本</span>
	<span class="numSpan">修改的软件个数：</span>
	<span id="editblsum${id_suffix}" style="color: red;"></span>
	<br>
	<div id="editTabbl${id_suffix}" style="margin: auto; width: 100%; display: none">

		<span class="msgShow">同一版本的对内、对外、中英文的上下位置请保持一致，以免出错。</span>
		<br>

		<table class="product" border="1" cellspacing="0">
			<tr>
				<td colspan="3" width="100%" style="margin-left: 20px;">
					<span style="font-weight: bold">请选择要修改的软件版本:</span>
					<a href="javascript:void(0)" style="height: 34px; width: 6%" class="easyui-linkbutton" onclick="comboboxOpen${id_suffix}('BL','Edit')">选择软件版本</a>
					<%--  <input name="baseLines[2].baselineoldnoSel" style="width:50%;height:30px;" id="editbaselineoldnoSel${id_suffix}" value="${editbaselineNo}" class="easyui-combobox"/> --%>
					<br>
				</td>
			</tr>
			<tr>
				<td width="20%">版本的内码</td>
				<td width="40%">原软件版本中文名称</td>
				<td width="40%">修改后的软件版本中文名称</td>
			</tr>
			<tr>
				<td width="20%">
					<textarea name="baseLines[2].baselineoldno" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="editbaselineoldno${id_suffix}">${entity.baseLines[2].baselineoldno}</textarea>
					<textarea name="baseLines[2].baselineno" autoHeight="true" hidden=true style="width: 100%; height: 30px;" id="editbaselineno${id_suffix}">${entity.baseLines[2].baselineno}</textarea>
				</td>
				<td width="40%">
					<textarea name="baseLines[2].baselineold" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="editbaselineold${id_suffix}">${entity.baseLines[2].baselineold}</textarea>
				</td>
				<td width="40%">
					<textarea name="baseLines[2].baseline" autoHeight="true" style="width: 100%; height: 30px;" id="editobjectbl${id_suffix}">${entity.baseLines[2].baseline}</textarea>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">原软件版本英文名称</td>
				<td width="40%" class="aLink">
					修改后的软件版本英文名称
					<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','bl','','eng');">与内部中文名称设置一致</a>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">
					<textarea name="baseLines[2].engbaselineold" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="engbaselineoldpr${id_suffix}">${entity.baseLines[2].engbaselineold}</textarea>
				</td>
				<td width="40%">
					<textarea name="baseLines[2].engbaseline" autoHeight="true" style="width: 100%; height: 30px;" id="editengobjectbl${id_suffix}">${entity.baseLines[2].engbaseline}</textarea>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">原软件版本对外的中文名称</td>
				<td width="40%" class="aLink">
					修改后的软件版本对外的中文名称
					<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','bl','out','');">与修改后的内部中文名称设置一致</a>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">
					<textarea name="baseLines[2].baselineoutold" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="editbaselineoutold${id_suffix}">${entity.baseLines[2].baselineoutold}</textarea>
				</td>
				<td width="40%">
					<textarea name="baseLines[2].baselineout" autoHeight="true" style="width: 100%; height: 30px;" id="editobjectoutbl${id_suffix}">${entity.baseLines[2].baselineout}</textarea>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">原软件版本对外的英文名称</td>
				<td width="40%" class="aLink">
					修改后的软件版本对外的英文名称
					<a href="#" class="easyui-linkbutton" onclick="setProduct${id_suffix}('edit','bl','out','eng');">与修改后的外部中文名称设置一致</a>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">
					<textarea name="baseLines[2].engbaselineoutold" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="engbaselineoutold${id_suffix}">${entity.baseLines[2].engbaselineoutold}</textarea>
				</td>
				<td width="40%">
					<textarea name="baseLines[2].engbaselineout" autoHeight="true" style="width: 100%; height: 30px;" id="editengobjectoutbl${id_suffix}">${entity.baseLines[2].engbaselineout}</textarea>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">原软件版本对应的父版本</td>
				<td width="40%">
					修改后对应的父版本
					<br>
					<a href="javascript:void(0)" style="height: 34px; width: 35%" class="easyui-linkbutton" onclick="dialogOpenBaseObject${id_suffix}('BL','Edit')">选择对应父版本号(基线版本)</a>
					<br>
					<a href="javascript:void(0)" style="height: 34px; width: 35%" class="easyui-linkbutton" onclick="dialogOpen${id_suffix}('PR','Edit')">选择对应父版本号(路标版本)</a>
					<br>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">
					<textarea name="baseLines[2].parentitemnoold" autoHeight="true" style="width: 100%; height: 30px;" id="editparentitemnoold${id_suffix}">${entity.baseLines[2].parentitemnoold}</textarea>
					<br>
					<br>
					<textarea name="entity.baseLineEditOldParentName" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="editparentitemnooldname${id_suffix}">${entity.baseLineEditOldParentName}</textarea>


				</td>
				<td width="40%">
					<textarea name="baseLines[2].parentitemno" autoHeight="true" style="width: 100%; height: 30px;" id="editparentitemno${id_suffix}">${entity.baseLines[2].parentitemno}</textarea>
					<br>
					<br>
					<textarea name="entity.baseLineEditParentName" autoHeight="true" style="width: 100%; height: 30px;" id="editparentitemnoname${id_suffix}">${entity.baseLineEditParentName}</textarea>
				</td>
			</tr>

			<tr>
				<td width="20%"></td>
				<td width="40%">原软件版本对应的平台基线版本号</td>
				<td width="40%">
					修改后的对应平台基线版本号
					<%-- <input name="baseLines[2].baseline1name" style="width:71%;height:30px;" id="editbaseline1namebtn${id_suffix}"  class="easyui-combotreegrid"/> --%>
					<a href="javascript:void(0)" style="height: 34px; width: 35%" class="easyui-linkbutton" onclick="dialogBaseline1Name${id_suffix}('Edit')">选择对应的平台基线版本号</a>
				</td>
			</tr>
			<tr>
				<td width="20%"></td>
				<td width="40%">
					<textarea name="baseLines[2].baseline1Old" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="editbaseline1old${id_suffix}">${entity.baseLines[2].baseline1Old}</textarea>
					<br>
					<br>
					<textarea name="entity.baseLine1EditOldName" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="editbaseline1oldname${id_suffix}">${entity.baseLine1EditOldName}</textarea>

				</td>
				<td width="40%">
					<textarea name="baseLines[2].baseline1" autoHeight="true" style="width: 100%; height: 30px;" id="editbaseline1${id_suffix}">${entity.baseLines[2].baseline1}</textarea>
					<br>
					<br>
					<textarea name="entity.baseLine1EditName" autoHeight="true" style="width: 100%; height: 30px;" id="editbaseline1name${id_suffix}">${entity.baseLine1EditName}</textarea>

				</td>
			</tr>
			<%--   <tr style="display:none">
                <td width="40%"><textarea name="baseLines[2].baseline1Old" autoHeight="true" readonly="readonly" style="width:100%;height:30px;" id="editbaseline1old${id_suffix}"  >${entity.baseLines[2].baseline1Old}</textarea></td>
                <td width="40%"><textarea name="baseLines[2].baseline1" autoHeight="true" style="width:100%;height:30px;" id="editbaseline1${id_suffix}"  >${entity.baseLines[2].baseline1}</textarea></td>
               </tr>  --%>
		</table>
	</div>
	<hr>
	<input type="checkbox" class="combobox-checkbox" id="delproductbl${id_suffix}" onclick="checkProduct${id_suffix}('del','bl')" name="baseLines[3].applytype"
		style="margin-top: 2px;">
	&nbsp;
	<span class="checkbox191030">停用基线版本</span>
	<br>
	<div id="delTabbl${id_suffix}" style="margin: auto; width: 100%; display: none">


		<table class="product" border="1" cellspacing="0">
			<tr>
				<td colspan="3" width="100%" style="margin-left: 20px;">
					<span style="font-weight: bold">请选择要停用的软件版本:</span>
					<%-- <input name="baseLines[3].baselinenoSel" style="width:50%;height:30px;" id="delbaselinenoSel${id_suffix}" value="${delbaselineNo}" class="easyui-combobox"/> --%>
					<a href="javascript:void(0)" style="height: 34px; width: 6%" class="easyui-linkbutton" onclick="comboboxOpen${id_suffix}('BL','Del')">选择软件版本</a>
				</td>
			</tr>
			<tr>
				<td width="20%">要停用的软件版本内码</td>
				<td width="40%">要停用的软件版本中文名称</td>
				<td width="40%">要停用的软件版本英文名称</td>
			</tr>
			<tr>
				<td width="20%">
					<textarea name="baseLines[3].baselineno" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="delbaselineno${id_suffix}">${entity.baseLines[3].baselineno}</textarea>
				</td>
				<td width="40%">
					<textarea name="baseLines[3].baseline" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="delbaseline${id_suffix}">${entity.baseLines[3].baseline}</textarea>
				</td>
				<td width="40%">
					<textarea name="baseLines[3].engbaseline" autoHeight="true" readonly="readonly" style="width: 100%; height: 30px;" id="delengbaseline${id_suffix}">${entity.baseLines[3].engbaseline}</textarea>
				</td>

			</tr>
		</table>
	</div>
	<hr>

	<div id="winbaseline1name${id_suffix}" title="对应的平台基线版本号" class="winHeight" style="display: none; width: 80%; min-height: 60% px !important; padding: 0px 10px; margin: 0px auto;">
		<input id="searchStr${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%; height: 28px;" />
		&nbsp;
		<a id="btn${id_suffix}" href="#" class="easyui-linkbutton default" onclick="search${id_suffix}();" style="height: 28px;">搜 索 </a>
		&nbsp;

		<table id="tabbaseline1name${id_suffix}" style="width: 100%; min-height: 450px !important;">
		</table>
		<br>
		<br>
		<br>
		<br>

	</div>


	<div id="winReleaseParent${id_suffix}" title="对应的父版本号(路标版本)" class="winHeight"
		style="display: none; width: 80%; min-height: 60% px !important; padding: 0px 10px; margin: 0px auto;" class="winHeight">
		<input id="searchStrReleaseParent${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%; height: 28px;" />
		&nbsp;
		<a id="btnReleaseParent${id_suffix}" href="#" class="easyui-linkbutton default" onclick="searchReleaseParent${id_suffix}();" style="height: 28px;">搜 索 </a>
		&nbsp;

		<table id="tabReleaseparent${id_suffix}" style="width: 100%; height: 520px !important;">
		</table>
		<br>
		<br>
		<br>
		<br>
	</div>
	<div id="winbaselineParent${id_suffix}" title="对应的父版本号(基线版本)" class="winHeight1"
		style="display: none; width: 80%; min-height: 60% px !important; padding: 0px 10px; margin: 0px auto;" class="winHeight">
		<input id="searchStrParent${id_suffix}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%; height: 28px;" />
		&nbsp;
		<a id="btnParent${id_suffix}" href="#" class="easyui-linkbutton default" onclick="searchParent${id_suffix}();" style="height: 28px;">搜 索 </a>
		&nbsp;

		<table id="tabbaselineparent${id_suffix}" style="width: 100%; height: 500px !important;padding-bottom: 0.35% !important;">
		</table>
		<br>
		<br>
		<br>
		<br>
	</div>
<style>
.winHeight1 .datagrid-body {
			height: 420px!important;
		}
		.winHeight1 ::-webkit-scrollbar {
    width: 18px;
    height: 8px;
    }
    .winHeight1 .l-btn-plain .l-btn-text {
    padding:5px 15px;
    }
    .winHeight1 .easyui-linkbutton.l-btn:hover{
    color:white;background-color:#3498DB;
    }
    .winHeight1 .default.l-btn:hover{
    color:white;background-color:#3498DB;
    }
    
    .winHeight1 .l-btn-left:hover{
    color:white;background-color:#3498DB;
    }
    
    .winHeight1 .easyui-linkbutton .l-btn-text:hover{
    color:white;background-color:#3498DB;
    }
</style>

	<script type="text/javascript">
              $(function(){
            	 /*  $('#searchSelRelease${id_suffix}').textbox({
            		  inputEvents: $.extend({},$.fn.textbox.defaults.inputEvents,{
            			  keyup: function(event){
            			  $('#selTabRelease${id_suffix}').datagrid('load',{
          					searchStr: $("#searchSelRelease${id_suffix}").val()
          				  });
            		  }})
            		  }); */
            		  if($("#editbaselineoldno${id_suffix}").val()!=""&&$("#editbaselineoldno${id_suffix}").val()!=null){
            		  $("#hidId${id_suffix}").val($("#editbaselineoldno${id_suffix}").val());
            		  }
            		  
            		  if($("#delbaselineno${id_suffix}").val()!=""&&$("#delbaselineno${id_suffix}").val()!=null){
                		  $("#hidDelId${id_suffix}").val($("#delbaselineno${id_suffix}").val());
                		  }
            		  
            		  
            		  $('#searchSelRelease${id_suffix}').bind("keyup", function(){
            			  $('#selTabRelease${id_suffix}').datagrid('load',{
            					searchStr: $("#searchSelRelease${id_suffix}").val()
            				  });
            		  });
            	  
            	  
            	//修改基线版本校验
        		 /*  $("#editbaselineoldnoSel${id_suffix}").combobox({
        				url : [],data : '[]',
        				method : "post",
        				valueField : 'value',
        				textField : 'text',
        				editable:false,
        				required:false,
        				missingMessage:"请选择基线版本",
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
        	            	
        	            	$("#editbaselineoldno${id_suffix}").val("");
        					$("#editbaselineold${id_suffix}").val("");
        					$("#engbaselineoldpr${id_suffix}").val("");
        					
        					$("#editbaselineno${id_suffix}").val("");
        					
        					$("#editobjectbl${id_suffix}").val("");
        					$("#editengobjectbl${id_suffix}").val("");
        					$("#engbaselineoutold${id_suffix}").val("");
        					$("#editengobjectoutbl${id_suffix}").val("");
        					
        					
        					//隐藏值赋值
        					$("#editbaselineoutold${id_suffix}").val(""); 
        					
        					$("#editobjectoutbl${id_suffix}").val("");
        					$("#editparentitemnoold${id_suffix}").val("");
        					$("#editparentitemno${id_suffix}").val("");
        					$("#editbaseline1old${id_suffix}").val("");
        					$("#editbaseline1${id_suffix}").val("");
        					
        					//父版本
        					$("#editparentitemnooldname${id_suffix}").val("");
        					$("#editparentitemnoname${id_suffix}").val("");
        					//基线版本号
        					$("#editbaseline1oldname${id_suffix}").val("");
        					$("#editbaseline1name${id_suffix}").val("");
        					//$('textarea[autoHeight]').autoHeight();  
        	            	
        	            	
        	            	var currentVal="";
        	            	if(newVal==""||newVal==null){
        	            		currentVal=$('#editbaselineoldnoSel${id_suffix}').combobox("getValue");
        						return false;
        	            	}else{
        	            		currentVal=newVal.join(",");
        	            	}
        	            	 $.ajax({
        			                type: "POST",
        			                url: '/basicinfo/prBelowApply/getBaseLineInfo/'+currentVal,
        			                data:{},
        			                async: false,
        			                success: function (rec) {
        			                	if(rec!=null){
        			                		for (var i = 0; i < rec.length; i++) {
        				    					
        							                	//根据选中要修改的基线版本赋值
        							            
        												$("#editbaselineoldno${id_suffix}").val(($("#editbaselineoldno${id_suffix}").val()==""?"":($("#editbaselineoldno${id_suffix}").val()+"\r"))+(rec[i].baselineno==null?"":rec[i].baselineno)+'_'+(rec[i].id==null?"":rec[i].id));
        												$("#editbaselineold${id_suffix}").val(($("#editbaselineold${id_suffix}").val()==""?"":($("#editbaselineold${id_suffix}").val()+"\r"))+(rec[i].baseline==null?"":rec[i].baseline));
        												$("#engbaselineoldpr${id_suffix}").val(($("#engbaselineoldpr${id_suffix}").val()==""?"":($("#engbaselineoldpr${id_suffix}").val()+"\r"))+(rec[i].engbaseline==null?"":rec[i].engbaseline));
        												
        												$("#editbaselineno${id_suffix}").val(($("#editbaselineno${id_suffix}").val()==""?"":($("#editbaselineno${id_suffix}").val()+"\r"))+(rec[i].baselineno==null?"":rec[i].baselineno)+'_'+(rec[i].id==null?"":rec[i].id));
        												
        												$("#editobjectbl${id_suffix}").val(($("#editobjectbl${id_suffix}").val()==""?"":($("#editobjectbl${id_suffix}").val()+"\r"))+(rec[i].baseline==null?"":rec[i].baseline));
        												$("#editengobjectbl${id_suffix}").val(($("#editengobjectbl${id_suffix}").val()==""?"":($("#editengobjectbl${id_suffix}").val()+"\r"))+(rec[i].engbaseline==null?"":rec[i].engbaseline));
        												$("#engbaselineoutold${id_suffix}").val(($("#engbaselineoutold${id_suffix}").val()==""?"":($("#engbaselineoutold${id_suffix}").val()+"\r"))+(rec[i].engbaselineout==null?"":rec[i].engbaselineout));
        												$("#editengobjectoutbl${id_suffix}").val(($("#editengobjectoutbl${id_suffix}").val()==""?"":($("#editengobjectoutbl${id_suffix}").val()+"\r"))+(rec[i].engbaselineout==null?"":rec[i].engbaselineout));
        												
        												
        												//隐藏值赋值
        												$("#editbaselineoutold${id_suffix}").val(($("#editbaselineoutold${id_suffix}").val()==""?"":($("#editbaselineoutold${id_suffix}").val()+"\r"))+(rec[i].baselineout==null?"":rec[i].baselineout)); 
        												
        												
        												$("#editobjectoutbl${id_suffix}").val(($("#editobjectoutbl${id_suffix}").val()==""?"":($("#editobjectoutbl${id_suffix}").val()+"\r"))+((rec[i].baselineout==null||rec[i].baselineout=="")?"":rec[i].baselineout));
        												$("#editparentitemnoold${id_suffix}").val(($("#editparentitemnoold${id_suffix}").val()==""?"":($("#editparentitemnoold${id_suffix}").val()+"\r"))+((rec[i].parentitemno==null||rec[i].parentitemno=="")?"*":rec[i].parentitemno));
        												$("#editparentitemno${id_suffix}").val(($("#editparentitemno${id_suffix}").val()==""?"":($("#editparentitemno${id_suffix}").val()+"\r"))+((rec[i].parentitemno==null||rec[i].parentitemno=="")?"*":rec[i].parentitemno));
        												$("#editbaseline1old${id_suffix}").val(($("#editbaseline1old${id_suffix}").val()==""?"":($("#editbaseline1old${id_suffix}").val()+"\r"))+((rec[i].baseline1==null||rec[i].baseline1=="")?"*":rec[i].baseline1));
        												$("#editbaseline1${id_suffix}").val(($("#editbaseline1${id_suffix}").val()==""?"":($("#editbaseline1${id_suffix}").val()+"\r"))+((rec[i].baseline1==null||rec[i].baseline1=="")?"*":rec[i].baseline1));
        												
        												//父版本
        												$("#editparentitemnooldname${id_suffix}").val(($("#editparentitemnooldname${id_suffix}").val()==""?"":($("#editparentitemnooldname${id_suffix}").val()+"\r"))+(rec[i].parentitem==null?"*":rec[i].parentitem));
        												$("#editparentitemnoname${id_suffix}").val(($("#editparentitemnoname${id_suffix}").val()==""?"":($("#editparentitemnoname${id_suffix}").val()+"\r"))+(rec[i].parentitem==null?"*":rec[i].parentitem));
        												//基线版本号
        												$("#editbaseline1oldname${id_suffix}").val(($("#editbaseline1oldname${id_suffix}").val()==""?"":($("#editbaseline1oldname${id_suffix}").val()+"\r"))+(rec[i].baseline1name==null?"*":rec[i].baseline1name));
        												$("#editbaseline1name${id_suffix}").val(($("#editbaseline1name${id_suffix}").val()==""?"":($("#editbaseline1name${id_suffix}").val()+"\r"))+(rec[i].baseline1name==null?"*":rec[i].baseline1name));
        												$('textarea[autoHeight]').autoHeight();   
        							           
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
                            
                            $('textarea[autoHeight]').autoHeight();
                            
                            
                        },onLoadSuccess:function(row){
                        	 var opts = $(this).combobox('options');
                             var target = this;
                             var values = $(target).combobox('getValues');
                             $.map(values, function (value) {
                                 var el = opts.finder.getEl(target, value);
                                 el.find('input.combobox-checkbox')._propAttr('checked', true);
                             })
                             
                             if($("#editbaselineoldnoSel${id_suffix}").val()=="null"){
                            	 $("#editbaselineoldnoSel${id_suffix}").combobox("setValue","");
                             }
        					$("#editbaselineoldnoSel${id_suffix}").unbind("onLoadSuccess"); 
        				}
        		   }); */
        		
        		
        		//停用基线版本校验
        		 /*  $("#delbaselinenoSel${id_suffix}").combobox({
        				url : [],data : '[]',
        				method : "post",
        				valueField : 'value',
        				textField : 'text',
        				editable:false,
        				required:false,
        				missingMessage:"请选择基线版本",
        				multiple: true, 
        				formatter: function (row) {
        	                var opts = $(this).combobox('options');
        	                return '<input type="checkbox" class="combobox-checkbox" id="' + row[opts.valueField] + '">' + row[opts.textField]
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
        	            	 $("#delbaselineno${id_suffix}").val("");
        					$("#delbaseline${id_suffix}").val("");
        					$("#delengbaseline${id_suffix}").val("");
        					var currentVal="";
        	            	if(newVal==""||newVal==null){
        	            		currentVal=$('#delbaselinenoSel${id_suffix}').combobox("getValue");
        						return false;
        	            	}else{
        	            		currentVal=newVal.join(",");
        	            	}
        	            	  $.ajax({
        			                type: "POST",
        			                url: '/basicinfo/prBelowApply/getBaseLineInfo/'+currentVal,
        			                data:{},
        			                async: false,
        			                success: function (rec) {
        			                	debugger
        			                	if(rec!=null){
        			                		for (var i = 0; i < rec.length; i++) {
        							                	//根据选中要停用的基线版本赋值
        												$("#delbaselineno${id_suffix}").val(($("#delbaselineno${id_suffix}").val()==""?"":($("#delbaselineno${id_suffix}").val()+"\r"))+(rec[i].baselineno==null?"":rec[i].baselineno)+'_'+(rec[i].id==null?"":rec[i].id));
        												$("#delbaseline${id_suffix}").val(($("#delbaseline${id_suffix}").val()==""?"":($("#delbaseline${id_suffix}").val()+"\r"))+(rec[i].baseline==null?"":rec[i].baseline));
        												$("#delengbaseline${id_suffix}").val(($("#delengbaseline${id_suffix}").val()==""?"":($("#delengbaseline${id_suffix}").val()+"\r"))+(rec[i].engbaseline==null?"":rec[i].engbaseline));
        												
        												$('textarea[autoHeight]').autoHeight();   
        							           
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
                        },onLoadSuccess:function(row){
        					 var opts = $(this).combobox('options');
                             var target = this;
                             var values = $(target).combobox('getValues');
                             $.map(values, function (value) {
                                 var el = opts.finder.getEl(target, value);
                                 el.find('input.combobox-checkbox')._propAttr('checked', true);
                             })
                             if($("#delbaselinenoSel${id_suffix}").val()=="null"){
                            	 $("#delbaselinenoSel${id_suffix}").combobox("setValue","");
                             }
        					$("#delbaselinenoSel${id_suffix}").unbind("onLoadSuccess"); 
        				}
        		   });  */
              });
              
              //清空
             function clear${id_suffix}(){
            	 $("#addobjectbl${id_suffix}").val("");
            	 $("#addengobjectbl${id_suffix}").val("");
            	 $("#addobjectoutbl${id_suffix}").val("");
            	 $("#addengobjectoutbl${id_suffix}").val("");
            	 $("#addparentitemno${id_suffix}").val("");
            	 $("#addparentitem${id_suffix}").val("");
            	 $("#addbaseline1${id_suffix}").val("");
            	 $("#addbaseline1name${id_suffix}").val("");
            	 $('textarea[autoHeight]').autoHeight();
             }
            //父版本 基线版本BL  路标版本LB  tag区分基线还是路标  mk区分新增还是编辑
              function dialogOpen${id_suffix}(tag,mk){
            	  $("#searchStrParent${id_suffix}").val("");
            	  $("#searchStrParent${id_suffix}").textbox("setValue","");
            	  $("#searchStrParent${id_suffix}").textbox("setText","");
              	  //存储全局变量 用于查询使用
              	  //selTag=tag;
              	  if(tag=="BL"){
              		                		              	 
              		  $('#winbaselineParent${id_suffix}').window({  
                	    iconCls:"icon-save",
                	    modal:true, 
                		onClose:function(){
                			
                			$("#searchStrParent${id_suffix}").val("");
                			$("#searchStrParent${id_suffix}").textbox("setValue","");
                    		$("#searchStrParent${id_suffix}").textbox("setText","");
            		    	$('#winbaselineParent${id_suffix}').css("display","none");
            		    	 $("#tabbaselineparent${id_suffix}").treegrid('load',{
                       		  searchParas: $("#searchStrParent${id_suffix}").val()
                   			});
            	  		  }     
                	  }); 
          	  		  $("#tabbaselineparent${id_suffix}").treegrid({
          	  			  iconCls : 'icon-ok',
          		  		  collapsible : false,
          		  	  	  url : 'product/data/bldata',
          		          method : 'get',
          		  		  idField : 'prodlineno',
          		          treeField : 'prodline',
          		          striped:true,
          		          checkbox:true,
              	          columns:[[
                           {field:'prodline',title:'产品线',width:200,formatter:formatProgress${id_suffix}},
                           {field:'product',title:'产品',width:200,formatter:formatProgress${id_suffix}},
                           {field:'release',title:'产品R级',width:200,formatter:formatProgress${id_suffix}},
                           {field:'baseline',title:'版本名称',width:200,formatter:formatProgress${id_suffix}},
                           {field:'baseline1',title:'对应平台基线版本号',width:200,formatter:formatProgress${id_suffix}},
                           {field:'baselineout',title:'对外版本名称',width:200,formatter:formatProgress${id_suffix}},
                           {field:'parentitem',title:'对外父版本号',width:200,formatter:formatProgress${id_suffix}}
              	   		  ]],
            		      toolbar : [{
            				id : 'add${id_suffix }',
            				text : '确定',
            				handler : function() {
            					$('#winbaselineParent${id_suffix}').window("close");
            					//根据选中项赋值
            					var rowCheck=$("#tabbaselineparent${id_suffix}").treegrid("getCheckedNodes");
            					//清空搜索条件
            					$("#searchStrParent${id_suffix}").val("");
            					//赋值到页面
            					for (var i = 0; i < rowCheck.length; i++) {
            						$("#tabbaselineparent${id_suffix}").treegrid("uncheckNode",rowCheck[i].prodlineno);
									var rowValue=rowCheck[i].prodlineno.split('_')[0];
									if(rowValue.indexOf('BL')!=-1){
										if(mk=="Add"){
										$("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
										$("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowCheck[i].baseline);
										}else{
											$("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
											$("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowCheck[i].baseline);
										}
										$('textarea[autoHeight]').autoHeight();
									}								
								}
           			      	  }
            		   		},'-',{
          	 				  id : 'open${id_suffix }',
          						text : '展开当前节点',
          						iconCls : 'tabs-icon fa fa-minus-square',
          						handler : function() {							
          							var selectNode = $("#tabbaselineparent${id_suffix}").treegrid('getSelected');
          							 exeandAll_ID${id_suffix}=selectNode.prodlineno
          							 $("#tabbaselineparent${id_suffix}").treegrid("expandAll",selectNode.prodlineno);									
          							isExpandALl${id_suffix}=true;
          							
          						}
          	 			  }],            			
            			  fitColumns : true,
            	    	  onBeforeExpand : function(row) {//异步架加载树            	    		              	    		  
            			  	var url = "product/data/bldata";
            				$("#tabbaselineparent${id_suffix}").treegrid("options").url = url;
            				return true;
            		 	  },
            		 	  onDblClickRow : function(rowData) {
            				$('#winbaselineParent${id_suffix}').window("close");
            				//清空选中项
            				$("#tabbaselineparent${id_suffix}").treegrid("unselect",rowData.prodlineno);
            				//清空搜索条件
        					$("#searchStrParent${id_suffix}").val("");
            				if(rowData.prodlineno!=null&&rowData.prodlineno!=""&&rowData.prodlineno.indexOf("_")!=-1){
            					if(rowData.prodlineno.split("_")[0].indexOf("BL")!=-1){
            						if(mk=="Add"){
            							$("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.prodlineno.split("_")[0]);
										$("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowData.baseline);
            						}else{
            							$("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.prodlineno.split("_")[0]);
            							$("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowData.baseline);
            						}
									$('textarea[autoHeight]').autoHeight();
            					}
            				}
            		 	 },
     					 onLoadSuccess : function(row,data) {
     						 var _rowID=row!=null?row.prodlineno:'';
   						
   						 	 if(row!=null&&isExpandALl${id_suffix}){
   							 	 if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
   								 	 if(row.children!=null){
   								 		 $.each(row.children,function(i,item){
   											 $("#tabbaselineparent${id_suffix }").treegrid("expand",item.prodlineno);
   									 	});	
   								 	}							 
   								}else{								
   									var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
   									if(root){
   										 if(row!=null&&row.children!=null){
   											 $.each(row.children,function(i,item){
   												 $("#tabbaselineparent${id_suffix }").treegrid("expand",item.prodlineno);
   											 });	
   									 	}									
   								 	}
   								}
   						 	}
   						},	
   						onExpand:function(row){	
   							var _rowID=row!=null?row.prodlineno:'';
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
              }else{
            	  
            	  $('#winReleaseParent${id_suffix}').window({  
                	    iconCls:"icon-save",
                	    modal:true, 
                		onClose:function(){
                			$('#searchStrReleaseParent${id_suffix}').textbox("setValue","");
                			$('#searchStrReleaseParent${id_suffix}').textbox("setText","");
            		    	$('#winReleaseParent${id_suffix}').css("display","none");
            		    	 $("#tabReleaseparent${id_suffix}").treegrid('load',{
                          		  searchParas: $("#searchStrReleaseParent${id_suffix}").val()
                      			});
            	  		  }     
                	}); 
          	  	   $("#tabReleaseparent${id_suffix}").treegrid({
          	  		   iconCls : 'icon-ok',
          		  		collapsible : false,
          		  		url : 'product/data/prTreedata',
          		  		method : 'get',
          		  		idField : 'plipmtno',
          		  		treeField : 'plipmt',
          		  		striped:true,
          		  		checkbox:true,
              	  		columns:[[
              				{title:'IPMT',field:'plipmtno', hidden:true,width:'5%', formatter:formatProgress${id_suffix}},
              				{title:'请选中路标版本',field:'plipmt',width:'40%', formatter:formatProgress${id_suffix}},
   		           			/* {title:'研发产品线',field:'prodline',width:'15%',formatter:formatProgress${id_suffix}},    
   		           			{title:'PDT',field:'pdt',width:'10%'},*/ 
   		           			{title:'产品R级内码',field:'releaseno',width:'6%',formatter:formatProgress${id_suffix}},
   		           			{title:'产品',field:'product',width:'10%', formatter:formatProgress${id_suffix}},   
   		           			{title:'产品V级',field:'version',width:'15%', formatter:formatProgress${id_suffix}}, 
   		           			{title:'对应的软件平台版本',field:'releaseSoftware',width:'20%', formatter:formatProgress${id_suffix}},
   		           			{title:'项目状态',field:'projectstatus',width:'5%', formatter:formatProgress${id_suffix}}
              	   		]],
            		   toolbar : [{
            			   
            				id : 'add${id_suffix }',
            				text : '确定',
            				handler : function() {
            					$('#winReleaseParent${id_suffix}').window("close");
            					//根据选中项赋值
            					var rowCheck=$("#tabReleaseparent${id_suffix}").treegrid("getCheckedNodes");
            					//清空搜索条件
            					$("#searchStrReleaseParent${id_suffix}").val("");
            					//赋值到页面
            					for (var i = 0; i < rowCheck.length; i++) {
									var rowValue=rowCheck[i].plipmtno.split('_')[0];
									$("#tabReleaseparent${id_suffix}").treegrid("uncheckNode",rowCheck[i].plipmtno);
									if(rowValue.indexOf('PR')!=-1){
										if(mk=="Add"){
										$("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
										$("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowCheck[i].release);
										}else{
											$("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
											$("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowCheck[i].release);
										}
										$('textarea[autoHeight]').autoHeight();
									}								
								}
           				  	}
            		   	},'-',{
            		   		id : 'open${id_suffix }',
        					text : '展开当前节点',
        					iconCls : 'tabs-icon fa fa-minus-square',
        					handler : function() {							
        						var selectNode = $("#tabReleaseparent${id_suffix}").treegrid('getSelected');
        						exeandAll_ID${id_suffix}=selectNode.plipmtno
        						$("#tabReleaseparent${id_suffix}").treegrid("expandAll",selectNode.plipmtno);									
        						isExpandALl${id_suffix}=true;
        							
        					}
        	 			  }],            			
            			fitColumns : false,
            	    	onBeforeExpand : function(row) {//异步架加载树
            				var url = "product/data/prTreedata";
            				$("#tabReleaseparent${id_suffix}").treegrid("options").url = url;
            				return true;
            		 	},
            		 	onDblClickRow : function(rowData) {
            				$('#winReleaseParent${id_suffix}').window("close");
            				if(rowData.plipmtno!=null&&rowData.plipmtno!=""&&rowData.plipmtno.indexOf("_")!=-1){
            					//取消选中
            					$("#tabReleaseparent${id_suffix}").treegrid("unselect",rowData.plipmtno);
            					//清空搜索条件
            					$("#searchStrReleaseParent${id_suffix}").val("");
            					if(rowData.plipmtno.split("_")[0].indexOf("PR")!=-1){
            						if(mk=="Add"){
            							$("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.plipmtno.split("_")[0]);
										$("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowData.release);
            						}else{
            							$("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.plipmtno.split("_")[0]);
            							$("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowData.release);
            						}
								$('textarea[autoHeight]').autoHeight();
            					}
            				}
            		 	},
     					 onLoadSuccess : function(row,data) {
     						 var _rowID=row!=null?row.plipmtno:'';
   						
   						 	 if(row!=null&&isExpandALl${id_suffix}){
   							 	 if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
   								 	 if(row.children!=null){
   								 		 $.each(row.children,function(i,item){
   											 $("#tabReleaseparent${id_suffix }").treegrid("expand",item.plipmtno);
   									 	});	
   								 	}							 
   								}else{								
   									var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
   									if(root){
   										 if(row!=null&&row.children!=null){
   											 $.each(row.children,function(i,item){
   												 $("#tabReleaseparent${id_suffix }").treegrid("expand",item.plipmtno);
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
              	
              }
              
      
               function formatcheckbox${id_suffix}(val,row){
            	  if (val == "underfined" || val == null) {
            			return "";//"<input type='checkbox'  id='check_"+row.prodlineno+"' "+(row.checked?'checked':'')+"/>" ;
            		} else {
            			if(row.prodlineno!=null){
            			return "<input type='checkbox' name='chk'   id='check_"+row.prodlineno+"' "+(row.checked?'checked':'')+" value='"+row.prodline+"' />"+row.prodline;
            			}
            		}
            	  
               } 
              
             //对应的基线平台版本号--改为弹框形式 
              function dialogBaseline1Name${id_suffix}(tag){
            		$('#winbaseline1name${id_suffix}').window({  
                  	    iconCls:"icon-save",
                  	    modal:true, 
                		onClose:function(){
                			$('#searchStr${id_suffix}').textbox("setValue","");
                			$('#searchStr${id_suffix}').textbox("setText","");
            		    	$('#winbaseline1name${id_suffix}').css("display","none");
            		    	 $("#tabbaseline1name${id_suffix}").treegrid('load',{
                         		  searchParas: $("#searchStr${id_suffix}").val()
                     			});
            	  		  }
                  	}); 
            		$("#tabbaseline1name${id_suffix}").empty();
            	  $("#tabbaseline1name${id_suffix}").treegrid({
            		  iconCls : 'icon-ok',
            		  collapsible : false,
            		  url : 'product/data/bltreedata',
            		  method : 'get',
            		  idField : 'prodlineno',
            		  treeField : 'prodline',
            		  
            		  striped:true,
                	  columns:[[
                		    /*  {field:'id',title:'',formatter:formatcheckbox}, */
                			 /* {field:'prodlineno',title:'产品编码',width:200,hidden:true,formatter:formatProgress${id_suffix}}, */
                             {field:'prodline',title:'请选中对应的平台基线版本',width:'50%',formatter:formatProgress${id_suffix}},
                             /* {field:'product',title:'产品',width:200,formatter:formatProgress${id_suffix}},
                             {field:'release',title:'产品R级',width:200,formatter:formatProgress${id_suffix}},
                             {field:'baseline',title:'版本名称',width:200,formatter:formatProgress${id_suffix}}, */
                             {field:'baselineOut',title:'对外版本名称',width:'50%',formatter:formatProgress${id_suffix}}
                	   ]],
              		   toolbar : [{
              			id : 'add${id_suffix }',
              			text : '确定',
              			handler : function() {
              				$('#winbaseline1name${id_suffix}').window("close");
              				
              				//根据选中项赋值
             				var rowData=$("#tabbaseline1name${id_suffix}").treegrid("getSelected");
              				if(tag=="Add"){
                      			$("#baseline1name${id_suffix}").val(rowData.baseline);
                				
            					if($("#addbaseline1${id_suffix}").val()==""){
            						$("#addbaseline1${id_suffix}").val(rowData.baselineno+"\r");
            						$("#addbaseline1name${id_suffix}").val(rowData.baseline+"\r");
            					}else{
            					$("#addbaseline1${id_suffix}").val($("#addbaseline1${id_suffix}").val()+"\r"+rowData.baselineno);
            					$("#addbaseline1name${id_suffix}").val($("#addbaseline1name${id_suffix}").val()+"\r"+rowData.baseline);
            					}
            					var str=$("#addbaseline1name${id_suffix}").val();
            					var objExp=/(^\s*)|(\s*$)/g;
            					str=str.replace(objExp,"");
            					$("#addbaseline1name${id_suffix}").val(str);
            					var str1=$("#addbaseline1${id_suffix}").val();
            					str1=str1.replace(objExp,"");
            					$("#addbaseline1${id_suffix}").val(str1);
            					
            					$('textarea[autoHeight]').autoHeight();
            					$("#baseline1name${id_suffix}").combotreegrid("setValue",rowData.baselineno) ;
            					$("#baseline1name${id_suffix}").combotreegrid("setText",rowData.baseline) ;
                      		}else{
                      				$("#editbaseline1namebtn${id_suffix}").combotreegrid("setText",rowData.baseline);
            						if($("#editbaseline1${id_suffix}").val()==""){
            							$("#editbaseline1${id_suffix}").val(rowData.baselineno+"\r");
            							$("#editbaseline1name${id_suffix}").val(rowData.baseline+"\r");
            							
            						}else{
            						$("#editbaseline1${id_suffix}").val($("#editbaseline1${id_suffix}").val()+"\r"+rowData.baselineno);
            						$("#editbaseline1name${id_suffix}").val($("#editbaseline1name${id_suffix}").val()+"\r"+rowData.baseline);
            						}
            						
            						var str=$("#editbaseline1name${id_suffix}").val();
            						var objExp=/(^\s*)|(\s*$)/g;
            						str=str.replace(objExp,"");
            						$("#editbaseline1name${id_suffix}").val(str);
            						
            						var str1=$("#editbaseline1${id_suffix}").val();
            						str1=str1.replace(objExp,"");
            						$("#editbaseline1${id_suffix}").val(str1);
            						$('textarea[autoHeight]').autoHeight();
            						 $("#baseline1name${id_suffix}").combotreegrid("setValue",rowData.baselineno); 
            						 $("#baseline1name${id_suffix}").combotreegrid("setText",rowData.baseline);
                         	}
              				/* $("#tabbaseline1name${id_suffix}").treegrid("remove","PL000024");
              				$("#tabbaseline1name${id_suffix}").empty(); */
             			}
              		   },'-',{
           		   		id : 'open${id_suffix }',
    					text : '展开当前节点',
    					iconCls : 'tabs-icon fa fa-minus-square',
    					handler : function() {							
    						var selectNode = $("#tabbaseline1name${id_suffix}").treegrid('getSelected');
    						exeandAll_ID${id_suffix}=selectNode.prodlineno
    						$("#tabbaseline1name${id_suffix}").treegrid("expandAll",selectNode.prodlineno);									
    						isExpandALl${id_suffix}=true;
    							
    					}
    	 			  }],
              			
              			fitColumns : false,
              			fit:true,
              	    	onBeforeExpand : function(row) {//异步架加载树
              			var url = "product/data/bltreedata";
              			$("#tabbaseline1name${id_suffix}").treegrid("options").url = url;
              			return true;
              		 },onDblClickRow : function(rowData) {
              			$('#winbaseline1name${id_suffix}').window("close");
              			if(tag=="Add"){
              			$("#baseline1name${id_suffix}").val(rowData.baseline);
        				
    					if($("#addbaseline1${id_suffix}").val()==""){
    						$("#addbaseline1${id_suffix}").val(rowData.baselineno+"\r");
    						$("#addbaseline1name${id_suffix}").val(rowData.baseline+"\r");
    					}else{
    						$("#addbaseline1${id_suffix}").val($("#addbaseline1${id_suffix}").val()+"\r"+rowData.baselineno);
    						$("#addbaseline1name${id_suffix}").val($("#addbaseline1name${id_suffix}").val()+"\r"+rowData.baseline);
    					}
    					var str=$("#addbaseline1name${id_suffix}").val();
    					var objExp=/(^\s*)|(\s*$)/g;
    					str=str.replace(objExp,"");
    					$("#addbaseline1name${id_suffix}").val(str);
    					var str1=$("#addbaseline1${id_suffix}").val();
    					str1=str1.replace(objExp,"");
    					$("#addbaseline1${id_suffix}").val(str1);
    					
    					$('textarea[autoHeight]').autoHeight();
    					$("#baseline1name${id_suffix}").combotreegrid("setValue",rowData.baselineno) ;
    					$("#baseline1name${id_suffix}").combotreegrid("setText",rowData.baseline) ;
              			}else{
              				$("#editbaseline1namebtn${id_suffix}").combotreegrid("setText",rowData.baseline);
    						if($("#editbaseline1${id_suffix}").val()==""){
    							$("#editbaseline1${id_suffix}").val(rowData.baselineno+"\r");
    							$("#editbaseline1name${id_suffix}").val(rowData.baseline+"\r");
    							
    						}else{
    						$("#editbaseline1${id_suffix}").val($("#editbaseline1${id_suffix}").val()+"\r"+rowData.baselineno);
    						$("#editbaseline1name${id_suffix}").val($("#editbaseline1name${id_suffix}").val()+"\r"+rowData.baseline);
    						}
    						
    						var str=$("#editbaseline1name${id_suffix}").val();
    						var objExp=/(^\s*)|(\s*$)/g;
    						str=str.replace(objExp,"");
    						$("#editbaseline1name${id_suffix}").val(str);
    						
    						var str1=$("#editbaseline1${id_suffix}").val();
    						str1=str1.replace(objExp,"");
    						$("#editbaseline1${id_suffix}").val(str1);
    						$('textarea[autoHeight]').autoHeight();
    						 $("#baseline1name${id_suffix}").combotreegrid("setValue",rowData.baselineno); 
    						 $("#baseline1name${id_suffix}").combotreegrid("setText",rowData.baseline);
              			}
              		/* 	$("#tabbaseline1name${id_suffix}").treegrid("remove","PL000024");
              			$("#tabbaseline1name${id_suffix}").empty(); */
              		 },
 					 onLoadSuccess : function(row,data) {
 						 var _rowID=row!=null?row.prodlineno:'';
						
						 if(row!=null&&isExpandALl${id_suffix}){
							 if(row.children!=null){
						 		 $.each(row.children,function(i,item){
									 $("#tabbaseline1name${id_suffix }").treegrid("expand",item.prodlineno);
							 	});	
						 	 }
						 	 /* if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
							 	 							 
							}else{								
								var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
								if(root){
									 if(row!=null&&row.children!=null){
										 $.each(row.children,function(i,item){
											 $("#tabbaseline1name${id_suffix }").treegrid("expand",item.prodlineno);
										 });	
								 	}									
							 	}
							} */
						 }
					 },	
					 onExpand:function(row){						 
					 	 var _rowID=row!=null?row.prodlineno:'';
						 if(_rowID.substr(0,2)=='PL'&&_rowID!=exeandAll_ID${id_suffix}){
							 isExpandALl${id_suffix}=false;
							 exeandAll_ID${id_suffix}='';
						 }else{
							//var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;							
							if(!checkIsSameParent(_rowID)){
								 isExpandALl${id_suffix}=false;
								 exeandAll_ID${id_suffix}='';
							 }
						}						 
					  }
            	  });
              }
              
              function checkIsSameParent(id){
            	  var node=$("#tabbaseline1name${id_suffix }").treegrid("getParent",id);
            	  if($("#tabbaseline1name${id_suffix }").treegrid("getLevel",id)==1||(node!=null&&node.prodlineno==exeandAll_ID${id_suffix})){
            		  return true;
            	  }
            	  return node==null?false:checkIsSameParent(node.prodlineno);
              }
              
              //基线版本号搜索按钮
              function search${id_suffix}(){
            	//查询时初始化部分节点展开参数
            	  isExpandALl${id_suffix}=false;
            	  exeandAll_ID${id_suffix}='';
            	  $("#tabbaseline1name${id_suffix}").treegrid('load',{
            		  searchParas: $("#searchStr${id_suffix}").val()
      			});
              }
              
              //父版本 路标版本搜索
              function searchReleaseParent${id_suffix}(){
            	  //查询时初始化部分节点展开参数
            	  isExpandALl${id_suffix}=false;
            	  exeandAll_ID${id_suffix}='';
            	  $("#tabReleaseparent${id_suffix}").treegrid('load',{
            		  searchParas: $("#searchStrReleaseParent${id_suffix}").val()
        			});
              }
              
              //父版本 基线版本搜索
              function searchParent${id_suffix}(){            	  
            	  //查询时初始化部分节点展开参数
            	  isExpandALl${id_suffix}=false;
            	  exeandAll_ID${id_suffix}='';
            	  $("#tabbaselineparent${id_suffix}").treegrid('load',{
            		  searchParas: $("#searchStrParent${id_suffix}").val()
        			});
              }
              
              
              function comboboxOpen${id_suffix}(code,tag){
            	  //'BL','Edit'
            	  
            	  $('#selectDivRelease${id_suffix}').window({  
                	    iconCls:"icon-save",
                	    modal:true, 
              		onClose:function(){
              		 	$('#searchSelRelease${id_suffix}').val("");
          		    	$('#selectDivRelease${id_suffix}').css("display","none");
          		    	 $("#selTabRelease${id_suffix}").datagrid('load',[]); 
          	  		  }
                	}); 
          		$("#selTabRelease${id_suffix}").empty();
          		$("#selTabRelease${id_suffix}").datagrid({
    				url: '/product/comboboxdata/getDatagridWithId?type=BL&code='+$("#releaseno${id_suffix}").combobox("getValue")+'&sub_code=""',// + $('#editbaselineoldnoSel${id_suffix}').combobox("getValue"),		        
    		        pagination: false,//允许分页
    		        rownumbers: true,//行号
    		        singleSelect: false,//只选择一行
    		        pageSize: 10,//每一页数据数量
    		        checkOnSelect: true,
    		        striped:true,
    		        fitColumns:true, //列宽自适应
    		        width:'100%',
    		        idFiled:'id',
    		        height:'500px',
    		        //height : window.innerHeight - window.innerHeight * 0.28,
    		        columns: [[
    		        	{field: 'id', checkbox: true,width:'10%',hidden:false},
    		        	{field: "value",title: "内码",width:'48%',formatter:formatProgress${id_suffix}}, 
    		        	{field: "text",title: "名称",width:'48%',formatter:formatProgress${id_suffix}}
    		        	    		        ]],
    				onClickRow : function(index,rowData) { //单击事件
    				},onDblClickRow : function(rowIndex,rowData) {
    					$('#selectDivRelease${id_suffix}').window("close");
    					//根据选中的版本、路标版本查询下面的特性、子特性赋值
    					if(rowData!=null&&rowData.id!=""){
    						 initData${id_suffix}(rowData.id,tag);
    						
    					}else{
    						$.messager.alert("提示","该版本不存在！！！","");
    					}
    				},toolbar : [{
    		     			id : 'addSelectRelease${id_suffix }',
    		     			text : '确定',
    		     			handler : function() {
    		     				$('#selectDivRelease${id_suffix}').window("close");
    		     				//根据选中项赋值
    		     				/* var rowData=$("#selTabRelease${id_suffix}").datagrid("getChecked");
    		     				if(rowData!=null){
    		     					var dataRows;
    		     					 $.each(rowData,function (i,row) {
    		     						dataRows+=row.id+",";
    		     					 });
          							initData${id_suffix}(dataRows,tag);
    		     					 
    		     				}else{
    		     					$.messager.alert("提示","请选择要添加的数据！！！","");
    		     				} */
    		     				var rowData="";
    		     				if(tag=="Edit"){
    		     					rowData=$("#hidId${id_suffix}").val();
    		     				}else{
    		     					rowData=$("#hidDelId${id_suffix}").val();
    		     				}
    		     				//if(rowData!=""&&rowData!=null){
    		     					initData${id_suffix}(rowData,tag);
    		     				//}else{
    		     					//$.messager.alert("提示","请选择要添加的数据！！！","");
    		     				//} 
    		     			}
    				   }],onCheck:function(index,row){
    					   if(tag=="Edit"){
    					   if($("#hidId${id_suffix}").val()==""||$("#hidId${id_suffix}").val()==null){
    						   $("#hidId${id_suffix}").val(row.id+",");  
    					   }
    					   else if($("#hidId${id_suffix}").val().indexOf(row.id)==-1){
          		 		 $("#hidId${id_suffix}").val($("#hidId${id_suffix}").val()+row.id+",");
    					   }}else{
    						   if($("#hidDelId${id_suffix}").val()==""||$("#hidDelId${id_suffix}").val()==null){
        						   $("#hidDelId${id_suffix}").val(row.id+",");  
        					   }
        					   else if($("#hidDelId${id_suffix}").val().indexOf(row.id)==-1){
              		 		 $("#hidDelId${id_suffix}").val($("#hidDelId${id_suffix}").val()+row.id+",");
        					   }   
    					   }
          		 	 },onUncheck:function(index,row){
          		 		if(tag=="Edit"){
          		 		var str = $("#hidId${id_suffix}").val();
          		 		var reg = new RegExp(row.id+",","g");
          		 		var a = str.replace(reg,"");
          		 		$("#hidId${id_suffix}").val(a);
          		 		}else{
          		 			var str = $("#hidDelId${id_suffix}").val();
              		 		var reg = new RegExp(row.id+",","g");
              		 		var a = str.replace(reg,"");
              		 		$("#hidDelId${id_suffix}").val(a);
          		 		}
          		 	 },onCheckAll(rows){
          		 		if(tag=="Edit"){
          		 		 if($("#hidId${id_suffix}").val()==null){
          		 			$("#hidId${id_suffix}").val("");
          		 		 }
          		 		$.each(rows, function (index, item) {
          		 			$("#hidId${id_suffix}").val($("#hidId${id_suffix}").val()+item.id+",");
		                });
          		 		}else{
          		 			if($("#hidDelId${id_suffix}").val()==null){
              		 			$("#hidDelId${id_suffix}").val("");
              		 		 }
              		 		$.each(rows, function (index, item) {
              		 			$("#hidDelId${id_suffix}").val($("#hidDelId${id_suffix}").val()+item.id+",");
    		                });
          		 		}
          		 	 },onUncheckAll(rows){
          		 		if(tag=="Edit"){
          		 			$("#hidId${id_suffix}").val("");
          		 		}else{
          		 			$("#hidDelId${id_suffix}").val("");
          		 		}
          		 	 },
    			        onLoadSuccess: function (data) {
    			        	var baselineNoVal=""
    			        	if(tag=="Edit"){
    			        		 baselineNoVal=$("#hidId${id_suffix}").val();    			        			 
    			        	}else{
    			        		 baselineNoVal=$("#hidDelId${id_suffix}").val();
    			        	}
    			        	 
    					 if (data&&baselineNoVal!=""&&baselineNoVal!=null) {
    			                $.each(data.rows, function (index, item) {
    			                    if (baselineNoVal.indexOf(item.id)!=-1) {
    			                        $('#selTabRelease${id_suffix}').datagrid('checkRow', index);
    			                    }
    			                });
    			            }
    				}
    				});
              }
              
              
              function formatTextProgress${id_suffix}(value,rowData,rowIndex){
            	  debugger
            	  if (value == "underfined" || value == null) {
            			return "";
            		} else {
            			return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
            			+ value + '</div>';
            		}
              }
              
              
              function initData${id_suffix}(newVal,tag){
            	  if(tag=="Edit"){
            	  $("#editbaselineoldno${id_suffix}").val("");
					$("#editbaselineold${id_suffix}").val("");
					$("#engbaselineoldpr${id_suffix}").val("");
					
					$("#editbaselineno${id_suffix}").val("");
					
					$("#editobjectbl${id_suffix}").val("");
					$("#editengobjectbl${id_suffix}").val("");
					$("#engbaselineoutold${id_suffix}").val("");
					$("#editengobjectoutbl${id_suffix}").val("");
					
					
					//隐藏值赋值
					$("#editbaselineoutold${id_suffix}").val(""); 
					
					$("#editobjectoutbl${id_suffix}").val("");
					$("#editparentitemnoold${id_suffix}").val("");
					$("#editparentitemno${id_suffix}").val("");
					$("#editbaseline1old${id_suffix}").val("");
					$("#editbaseline1${id_suffix}").val("");
					
					//父版本
					$("#editparentitemnooldname${id_suffix}").val("");
					$("#editparentitemnoname${id_suffix}").val("");
					//基线版本号
					$("#editbaseline1oldname${id_suffix}").val("");
					$("#editbaseline1name${id_suffix}").val("");
					$('textarea[autoHeight]').autoHeight();  
	            	
	            	//var currentVal="";
	            	if(newVal==""||newVal==null){
	            		//currentVal=$('#editbaselineoldnoSel${id_suffix}').combobox("getValue");
						return false;
	            	}else{
	            		//currentVal=newVal.join(",");
	            	}
	            	 $.ajax({
			                type: "POST",
			                url: '/basicinfo/prBelowApply/getBaseLineInfo/'+newVal,
			                data:{},
			                async: false,
			                success: function (rec) {
			                	if(rec!=null){
			                		for (var i = 0; i < rec.length; i++) {
				    					
							                	//根据选中要修改的基线版本赋值
							            
												$("#editbaselineoldno${id_suffix}").val(($("#editbaselineoldno${id_suffix}").val()==""?"":($("#editbaselineoldno${id_suffix}").val()+"\r"))+(rec[i].baselineno==null?"":rec[i].baselineno)+'_'+(rec[i].id==null?"":rec[i].id));
												$("#editbaselineold${id_suffix}").val(($("#editbaselineold${id_suffix}").val()==""?"":($("#editbaselineold${id_suffix}").val()+"\r"))+(rec[i].baseline==null?"":rec[i].baseline));
												$("#engbaselineoldpr${id_suffix}").val(($("#engbaselineoldpr${id_suffix}").val()==""?"":($("#engbaselineoldpr${id_suffix}").val()+"\r"))+(rec[i].engbaseline==null?"":rec[i].engbaseline));
												
												$("#editbaselineno${id_suffix}").val(($("#editbaselineno${id_suffix}").val()==""?"":($("#editbaselineno${id_suffix}").val()+"\r"))+(rec[i].baselineno==null?"":rec[i].baselineno)+'_'+(rec[i].id==null?"":rec[i].id));
												
												$("#editobjectbl${id_suffix}").val(($("#editobjectbl${id_suffix}").val()==""?"":($("#editobjectbl${id_suffix}").val()+"\r"))+(rec[i].baseline==null?"":rec[i].baseline));
												$("#editengobjectbl${id_suffix}").val(($("#editengobjectbl${id_suffix}").val()==""?"":($("#editengobjectbl${id_suffix}").val()+"\r"))+(rec[i].engbaseline==null?"":rec[i].engbaseline));
												$("#engbaselineoutold${id_suffix}").val(($("#engbaselineoutold${id_suffix}").val()==""?"":($("#engbaselineoutold${id_suffix}").val()+"\r"))+(rec[i].engbaselineout==null?"":rec[i].engbaselineout));
												$("#editengobjectoutbl${id_suffix}").val(($("#editengobjectoutbl${id_suffix}").val()==""?"":($("#editengobjectoutbl${id_suffix}").val()+"\r"))+(rec[i].engbaselineout==null?"":rec[i].engbaselineout));
												
												
												//隐藏值赋值
												$("#editbaselineoutold${id_suffix}").val(($("#editbaselineoutold${id_suffix}").val()==""?"":($("#editbaselineoutold${id_suffix}").val()+"\r"))+(rec[i].baselineout==null?"":rec[i].baselineout)); 
												
												
												$("#editobjectoutbl${id_suffix}").val(($("#editobjectoutbl${id_suffix}").val()==""?"":($("#editobjectoutbl${id_suffix}").val()+"\r"))+((rec[i].baselineout==null||rec[i].baselineout=="")?"":rec[i].baselineout));
												$("#editparentitemnoold${id_suffix}").val(($("#editparentitemnoold${id_suffix}").val()==""?"":($("#editparentitemnoold${id_suffix}").val()+"\r"))+((rec[i].parentitemno==null||rec[i].parentitemno=="")?"*":rec[i].parentitemno));
												$("#editparentitemno${id_suffix}").val(($("#editparentitemno${id_suffix}").val()==""?"":($("#editparentitemno${id_suffix}").val()+"\r"))+((rec[i].parentitemno==null||rec[i].parentitemno=="")?"*":rec[i].parentitemno));
												$("#editbaseline1old${id_suffix}").val(($("#editbaseline1old${id_suffix}").val()==""?"":($("#editbaseline1old${id_suffix}").val()+"\r"))+((rec[i].baseline1==null||rec[i].baseline1=="")?"*":rec[i].baseline1));
												$("#editbaseline1${id_suffix}").val(($("#editbaseline1${id_suffix}").val()==""?"":($("#editbaseline1${id_suffix}").val()+"\r"))+((rec[i].baseline1==null||rec[i].baseline1=="")?"*":rec[i].baseline1));
												
												//父版本
												$("#editparentitemnooldname${id_suffix}").val(($("#editparentitemnooldname${id_suffix}").val()==""?"":($("#editparentitemnooldname${id_suffix}").val()+"\r"))+(rec[i].parentitem==null?"*":rec[i].parentitem));
												$("#editparentitemnoname${id_suffix}").val(($("#editparentitemnoname${id_suffix}").val()==""?"":($("#editparentitemnoname${id_suffix}").val()+"\r"))+(rec[i].parentitem==null?"*":rec[i].parentitem));
												//基线版本号
												$("#editbaseline1oldname${id_suffix}").val(($("#editbaseline1oldname${id_suffix}").val()==""?"":($("#editbaseline1oldname${id_suffix}").val()+"\r"))+(rec[i].baseline1name==null?"*":rec[i].baseline1name));
												$("#editbaseline1name${id_suffix}").val(($("#editbaseline1name${id_suffix}").val()==""?"":($("#editbaseline1name${id_suffix}").val()+"\r"))+(rec[i].baseline1name==null?"*":rec[i].baseline1name));
												$('textarea[autoHeight]').autoHeight();   
							           
									}
			                		
			                	}
			                }
			          });
            	  }else{
            		  $("#delbaselineno${id_suffix}").val("");
  					$("#delbaseline${id_suffix}").val("");
  					$("#delengbaseline${id_suffix}").val("");
  					$('textarea[autoHeight]').autoHeight();
  	            	if(newVal==""||newVal==null){
  						return false;
  	            	}
  	            	  $.ajax({
  			                type: "POST",
  			                url: '/basicinfo/prBelowApply/getBaseLineInfo/'+newVal,
  			                data:{},
  			                async: false,
  			                success: function (rec) {
  			                	if(rec!=null){
  			                		for (var i = 0; i < rec.length; i++) {
  							                	//根据选中要停用的基线版本赋值
  												$("#delbaselineno${id_suffix}").val(($("#delbaselineno${id_suffix}").val()==""?"":($("#delbaselineno${id_suffix}").val()+"\r"))+(rec[i].baselineno==null?"":rec[i].baselineno)+'_'+(rec[i].id==null?"":rec[i].id));
  												$("#delbaseline${id_suffix}").val(($("#delbaseline${id_suffix}").val()==""?"":($("#delbaseline${id_suffix}").val()+"\r"))+(rec[i].baseline==null?"":rec[i].baseline));
  												$("#delengbaseline${id_suffix}").val(($("#delengbaseline${id_suffix}").val()==""?"":($("#delengbaseline${id_suffix}").val()+"\r"))+(rec[i].engbaseline==null?"":rec[i].engbaseline));
  												
  												$('textarea[autoHeight]').autoHeight();   
  							           
  									}
  			                		
  			                	}
  			                }
  			          }); 
            	  }
              }


			  function dialogOpenBaseObject${id_suffix}(tag,mk) {
				  $("#searchStrParent${id_suffix}").val("");
				  $("#searchStrParent${id_suffix}").textbox("setValue","");
				  $("#searchStrParent${id_suffix}").textbox("setText","");
				  //存储全局变量 用于查询使用
				  //selTag=tag;
				  if(tag=="BL"){

					  $('#winbaselineParent${id_suffix}').window({
						  iconCls:"icon-save",
						  modal:true,
						  onClose:function(){

							  $("#searchStrParent${id_suffix}").val("");
							  $("#searchStrParent${id_suffix}").textbox("setValue","");
							  $("#searchStrParent${id_suffix}").textbox("setText","");
							  $('#winbaselineParent${id_suffix}').css("display","none");
							  $("#tabbaselineparent${id_suffix}").treegrid('load',{
								  searchParas: $("#searchStrParent${id_suffix}").val()
							  });
						  }
					  });
					  $("#tabbaselineparent${id_suffix}").treegrid({
						  iconCls : 'icon-ok',
						  collapsible : false,
						  url : 'product/data/bltreedata',
						  method : 'get',
						  idField : 'prodlineno',
						  treeField : 'prodline',
						  striped:true,
						  checkbox:true,
						  columns:[[
							  {field:'prodline',title:'请选中基线版本',width:'50%',formatter:formatProgress${id_suffix}},
							  {field:'baseline1name',title:'对应平台基线版本号',width:'50%',formatter:formatProgress${id_suffix}}

						  ]],
						  toolbar : [{
							  id : 'add${id_suffix }',
							  text : '确定',
							  handler : function() {
								  $('#winbaselineParent${id_suffix}').window("close");
								  //根据选中项赋值
								  var rowCheck=$("#tabbaselineparent${id_suffix}").treegrid("getCheckedNodes");
								  //清空搜索条件
								  $("#searchStrParent${id_suffix}").val("");
								  //赋值到页面
								  for (var i = 0; i < rowCheck.length; i++) {
									  $("#tabbaselineparent${id_suffix}").treegrid("uncheckNode",rowCheck[i].prodlineno);
									  var rowValue=rowCheck[i].prodlineno.split('_')[0];
									  if(rowValue.indexOf('BL')!=-1){
										  if(mk=="Add"){
											  $("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
											  $("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowCheck[i].baseline);
										  }else{
											  $("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
											  $("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowCheck[i].baseline);
										  }
										  $('textarea[autoHeight]').autoHeight();
									  }
								  }
							  }
						  },'-',{
							  id : 'open${id_suffix }',
							  text : '展开当前节点',
							  iconCls : 'tabs-icon fa fa-minus-square',
							  handler : function() {
								  var selectNode = $("#tabbaselineparent${id_suffix}").treegrid('getSelected');
								  exeandAll_ID${id_suffix}=selectNode.prodlineno
								  $("#tabbaselineparent${id_suffix}").treegrid("expandAll",selectNode.prodlineno);
								  isExpandALl${id_suffix}=true;

							  }
						  }],
						  fitColumns : false,
						  onBeforeExpand : function(row) {//异步架加载树
							  var url = "product/data/bltreedata";
							  $("#tabbaselineparent${id_suffix}").treegrid("options").url = url;
							  return true;
						  },
						  onDblClickRow : function(rowData) {
							  $('#winbaselineParent${id_suffix}').window("close");
							  //清空选中项
							  $("#tabbaselineparent${id_suffix}").treegrid("unselect",rowData.prodlineno);
							  //清空搜索条件
							  $("#searchStrParent${id_suffix}").val("");
							  if(rowData.prodlineno!=null&&rowData.prodlineno!=""&&rowData.prodlineno.indexOf("_")!=-1){
								  if(rowData.prodlineno.split("_")[0].indexOf("BL")!=-1){
									  if(mk=="Add"){
										  $("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.prodlineno.split("_")[0]);
										  $("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowData.baseline);
									  }else{
										  $("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.prodlineno.split("_")[0]);
										  $("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowData.baseline);
									  }
									  $('textarea[autoHeight]').autoHeight();
								  }
							  }
						  },
						  onLoadSuccess : function(row,data) {
							  var _rowID=row!=null?row.prodlineno:'';

							  if(row!=null&&isExpandALl${id_suffix}){
								  if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
									  if(row.children!=null){
										  $.each(row.children,function(i,item){
											  $("#tabbaselineparent${id_suffix }").treegrid("expand",item.prodlineno);
										  });
									  }
								  }else{
									  var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;
									  if(root){
										  if(row!=null&&row.children!=null){
											  $.each(row.children,function(i,item){
												  $("#tabbaselineparent${id_suffix }").treegrid("expand",item.prodlineno);
											  });
										  }
									  }
								  }
							  }
						  },
						  onExpand:function(row){
							  var _rowID=row!=null?row.prodlineno:'';
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
				  }else{

					  $('#winReleaseParent${id_suffix}').window({
						  iconCls:"icon-save",
						  modal:true,
						  onClose:function(){
							  $('#searchStrReleaseParent${id_suffix}').textbox("setValue","");
							  $('#searchStrReleaseParent${id_suffix}').textbox("setText","");
							  $('#winReleaseParent${id_suffix}').css("display","none");
							  $("#tabReleaseparent${id_suffix}").treegrid('load',{
								  searchParas: $("#searchStrReleaseParent${id_suffix}").val()
							  });
						  }
					  });
					  $("#tabReleaseparent${id_suffix}").treegrid({
						  iconCls : 'icon-ok',
						  collapsible : false,
						  url : 'product/data/prdata',
						  method : 'get',
						  idField : 'plipmtno',
						  treeField : 'plipmt',
						  striped:true,
						  checkbox:true,
						  columns:[[
							  {title:'IPMT',field:'plipmtno', hidden:true,width:'15%', formatter:formatProgress${id_suffix}},
							  {title:'IPMT',field:'plipmt',width:'15%', formatter:formatProgress${id_suffix}},
							  {title:'研发产品线',field:'prodline',width:'15%',formatter:formatProgress${id_suffix}},
							  {title:'PDT',field:'pdt',width:'10%'},
							  {title:'产品',field:'product',width:'10%', formatter:formatProgress${id_suffix}},
							  {title:'产品V级',field:'version',width:'10%', formatter:formatProgress${id_suffix}},
							  {title:'产品R级内码',field:'releaseno',width:'10%',formatter:formatProgress${id_suffix}},
							  {title:'产品R级中文名称',field:'release',width:'10%', formatter:formatProgress${id_suffix}},
							  {title:'对应的软件平台版本',field:'releaseSoftware',width:'10%', formatter:formatProgress${id_suffix}},
							  {title:'项目状态',field:'projectstatus',width:'10%', formatter:formatProgress${id_suffix}}
						  ]],
						  toolbar : [{

							  id : 'add${id_suffix }',
							  text : '确定',
							  handler : function() {
								  $('#winReleaseParent${id_suffix}').window("close");
								  //根据选中项赋值
								  var rowCheck=$("#tabReleaseparent${id_suffix}").treegrid("getCheckedNodes");
								  //清空搜索条件
								  $("#searchStrReleaseParent${id_suffix}").val("");
								  //赋值到页面
								  for (var i = 0; i < rowCheck.length; i++) {
									  var rowValue=rowCheck[i].plipmtno.split('_')[0];
									  $("#tabReleaseparent${id_suffix}").treegrid("uncheckNode",rowCheck[i].plipmtno);
									  if(rowValue.indexOf('PR')!=-1){
										  if(mk=="Add"){
											  $("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
											  $("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowCheck[i].release);
										  }else{
											  $("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowValue);
											  $("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowCheck[i].release);
										  }
										  $('textarea[autoHeight]').autoHeight();
									  }
								  }
							  }
						  },'-',{
							  id : 'open${id_suffix }',
							  text : '展开当前节点',
							  iconCls : 'tabs-icon fa fa-minus-square',
							  handler : function() {
								  var selectNode = $("#tabReleaseparent${id_suffix}").treegrid('getSelected');
								  exeandAll_ID${id_suffix}=selectNode.plipmtno
								  $("#tabReleaseparent${id_suffix}").treegrid("expandAll",selectNode.plipmtno);
								  isExpandALl${id_suffix}=true;

							  }
						  }],
						  fitColumns : true,
						  onBeforeExpand : function(row) {//异步架加载树
							  var url = "product/data/prdata";
							  $("#tabReleaseparent${id_suffix}").treegrid("options").url = url;
							  return true;
						  },
						  onDblClickRow : function(rowData) {
							  $('#winReleaseParent${id_suffix}').window("close");
							  if(rowData.plipmtno!=null&&rowData.plipmtno!=""&&rowData.plipmtno.indexOf("_")!=-1){
								  //取消选中
								  $("#tabReleaseparent${id_suffix}").treegrid("unselect",rowData.plipmtno);
								  //清空搜索条件
								  $("#searchStrReleaseParent${id_suffix}").val("");
								  if(rowData.plipmtno.split("_")[0].indexOf("PR")!=-1){
									  if(mk=="Add"){
										  $("#addparentitemno${id_suffix}").val($("#addparentitemno${id_suffix}").val()+(($("#addparentitemno${id_suffix}").val()!=null&&$("#addparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.plipmtno.split("_")[0]);
										  $("#addparentitem${id_suffix}").val($("#addparentitem${id_suffix}").val()+(($("#addparentitem${id_suffix}").val()!=null&&$("#addparentitem${id_suffix}").val()!="")?"\r":"")+rowData.release);
									  }else{
										  $("#editparentitemno${id_suffix}").val($("#editparentitemno${id_suffix}").val()+(($("#editparentitemno${id_suffix}").val()!=null&&$("#editparentitemno${id_suffix}").val()!="")?"\r":"")+rowData.plipmtno.split("_")[0]);
										  $("#editparentitemnoname${id_suffix}").val($("#editparentitemnoname${id_suffix}").val()+(($("#editparentitemnoname${id_suffix}").val()!=null&&$("#editparentitemnoname${id_suffix}").val()!="")?"\r":"")+rowData.release);
									  }
									  $('textarea[autoHeight]').autoHeight();
								  }
							  }
						  },
						  onLoadSuccess : function(row,data) {
							  var _rowID=row!=null?row.plipmtno:'';

							  if(row!=null&&isExpandALl${id_suffix}){
								  if(exeandAll_ID${id_suffix}!=''&&_rowID.substr(0,2)==exeandAll_ID${id_suffix}.substr(0,2)&&_rowID==exeandAll_ID${id_suffix}){
									  if(row.children!=null){
										  $.each(row.children,function(i,item){
											  $("#tabReleaseparent${id_suffix }").treegrid("expand",item.plipmtno);
										  });
									  }
								  }else{
									  var root=_rowID.indexOf(exeandAll_ID${id_suffix})!=-1?true:false;
									  if(root){
										  if(row!=null&&row.children!=null){
											  $.each(row.children,function(i,item){
												  $("#tabReleaseparent${id_suffix }").treegrid("expand",item.plipmtno);
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

			  }
              </script>
</body>
</html>
