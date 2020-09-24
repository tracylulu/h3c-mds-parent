<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--搜索框-->
<input id="searchParas${id_suffix }" class="easyui-textbox" type="text"
	prompt="请输入搜索内容" style="width: 400px;" />
&nbsp;
<a id="btn${id_suffix }" href="#" class="easyui-linkbutton default" style="margin-right:2%;color:white;background-color:#3498DB;">搜 索 </a>
&nbsp;
<script type="text/javascript">


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

		$("#tg${id_suffix }").treegrid("load", {
			searchParas : $("#searchParas${id_suffix }").val()
		});
		$("#tg${id_suffix }").treegrid("collapseAll");
		isExpandALl${id_suffix}=false;
		exeandAll_ID${id_suffix}="";
	});

</script>