<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--搜索框-->

			<span>项目状态:</span>&nbsp;<input id="projectStatu${id_suffix }" name="projectStatu"
				class="easyui-combobox ui-text" type="text" value=""
				style="width: 120px" /> &nbsp; &nbsp; 
				<!-- <span>在研 </span><input
				type="checkbox" class="combobox-checkbox" checked="true"
				name="fruit" value="Apple" style="margin-top: 2px;">&nbsp; 
				<span>终止
			</span><input type="checkbox" class="combobox-checkbox" name="fruit"
				value="Apple" style="margin-top: 2px;">&nbsp; <span>挂起
			</span><input type="checkbox" class="combobox-checkbox" name="fruit"
				value="Apple" style="margin-top: 2px;">&nbsp; &nbsp; &nbsp; -->
			<input id="searchParas${id_suffix }" class="easyui-textbox" type="text"
				prompt="请输入搜索内容" style="width: 400px;" /> &nbsp; 
				<a id="btn${id_suffix }" href="#" class="easyui-linkbutton default" style="margin-right:2%;color:white;background-color:#3498DB;">搜 索 </a>&nbsp;
<script type="text/javascript">


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
	
	//$("#projectStatu${id_suffix }").combobox("setValues",["在研","终止"]);
	
	/* alert($('#projectStatu${id_suffix }').combobox('getValue'));
	alert($('#projectStatu${id_suffix }').combobox('getValues')); */
	//$("#projectStatu${id_suffix }").combobox("setText","在研");
	
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
	
	$("#btn${id_suffix }").click(function(){
		//右侧属性面板是否显示
		var p = $("#cc${id_suffix }").layout("panel", "east")[0].clientWidth
		if (p != 0) {
			$('#pg${id_suffix }').propertygrid('loadData', {
				rows : []
			});
			$("#cc${id_suffix }").layout("collapse", "east")
		}
		var status=$('#projectStatu${id_suffix }').combobox('getValues');
		status=status.join(',');
		
		$("#tg${id_suffix }").treegrid("load",{
			searchParas : $("#searchParas${id_suffix }").val(),
			projectStatus : status
		});
		
		$("#tg${id_suffix }").treegrid("collapseAll");
		isExpandALl${id_suffix}=false;
		exeandAll_ID${id_suffix}="";
	});
</script>