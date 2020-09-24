<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--jsp页面必须引入jstl标签-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品R版本</title>
</head>
<body>
	<div id="index">
		<!--布局-->
		<div class="index-4">
			<!--搜索框-->
			<span>项目状态:</span>&nbsp;<input id="projectStatu" name="projectStatu"
				class="easyui-combobox ui-text" type="text" value="请选择"
				style="width: 120px" /> &nbsp; &nbsp; <span>在研 </span><input
				type="checkbox" class="combobox-checkbox" checked="true"
				name="fruit" value="Apple" style="margin-top: 2px;">&nbsp; <span>终止
			</span><input type="checkbox" class="combobox-checkbox" name="fruit"
				value="Apple" style="margin-top: 2px;">&nbsp; <span>挂起
			</span><input type="checkbox" class="combobox-checkbox" name="fruit"
				value="Apple" style="margin-top: 2px;">&nbsp; &nbsp; &nbsp;
			<input id="searchParas" class="easyui-textbox" type="text"
				prompt="请输入搜索内容" style="width: 65%;" /> &nbsp; <a
				href="javascript:void(0)" class="easyui-linkbutton default"
				onclick="doSearch();">搜 索 </a>&nbsp;


			<!--左右布局 easyui-layout-->
			<div id="cc" class="easyui-layout"
				style="width: 100%; height: 'auto';">
				<!--左布局  center-->
				<!--***title需要更改 ***-->
				<div data-options="region:'center',title:'R版本数据'"
					style="width: 100%; height: 100%;">


					<!--左侧树形表格-->
					<div class="index-1">
						<table id="tg" style="width: 100%; heght: 100%;">
							<thead>
								<tr class="firstRow">
									<!--循环从配置表中动态获取树形表查询时需要显示的列-->
									<!--***colunmConfigList命名不一致时var、items需要更改***-->
									<c:forEach var="colunmConfigList" items="${colunmConfigList}">
										<!--***colunmConfigList命名不一致时 data-options需要更改***-->
										<th
											data-options="field:'${colunmConfigList.columncode.toLowerCase()}',width:130,formatter:formatProgress  ${colunmConfigList.columncode.toLowerCase() eq 'releaseno' ? ',hidden: true' : ''}">${colunmConfigList.columnname}</th>

									</c:forEach>

								</tr>
							</thead>
						</table>
					</div>
				</div>
				<!--右布局  east-->
				<div
					data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true"
					style="width: 20%;" id="east">
					<!--propertygrid动态属性-->
					<table id="pg">
					</table>
				</div>

			</div>
		</div>
	</div>
	<script type="text/javascript">
		//格式化以及自动换行
		function formatProgress(value) {
			if (value == "underfined" || value == null) {
				return "";
			} else {
				return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
						+ value + '</div>';
			}
		}

		//查询事件
		function doSearch() {

			//右侧属性面板是否显示
			var p = $("#cc").layout("panel", "east")[0].clientWidth
			if (p != 0) {
				$('#pg').propertygrid('loadData', {
					rows : []
				});
				$("#cc").layout("collapse", "east")
			}

			$("#tg")
					.treegrid(
							"load",
							{
								searchParas : $("#searchParas").val(),
								projectStatus : $('#projectStatu').combobox(
										'getValue') == "请选择" ? "" : $(
										'#projectStatu').combobox('getValue')
							});

		}

		$(function() {

			//项目状态下拉框初始化
			$("#projectStatu").combobox({
				valueField : 'statuValue',
				textField : 'statuText',
				panelHeight : 'auto'
			});
			var data = [];//创建数组
			//数组添加值
			data.push({
				"statuValue" : "",
				"statuText" : ""
			});
			data.push({
				"statuValue" : "终止",
				"statuText" : "终止"
			});
			data.push({
				"statuValue" : "在研",
				"statuText" : "在研"
			});
			$("#projectStatu").combobox("loadData", data);//下拉框加载数据

			//设定布局高度
			$("#cc").layout({
				height : window.innerHeight - window.innerHeight * 0.231
			});

			//R版本树表格加载
			$("#tg")
					.treegrid(
							{
								iconCls : 'icon-ok',
								toolbar : [ {
									id : 'collapse',
									text : '全部折叠',
									iconCls : 'tabs-icon fa fa-minus-square',
									handler : function() {
										//全部折叠
										$("#tg").treegrid("collapseAll");
									}
								},"-", {
									id : 'add',
									text : '创建产品R级信息',
									iconCls : 'tabs-icon fa fa-plus-square',
									handler : function() {
										if ($('#mainUrl').tabs('exists', "新增R版本")) {
						            	       $('#mainUrl').tabs('select', "新增R版本");
						            	     } else {
						            	       $('#mainUrl').tabs('add', {
						            	         title : "新增R版本",
						            	         href : 'product/release/add',
						            	         closable : true
						            	       });
						            	     }
										
									}
								} ],
								collapsible : false,
								url : 'product/releasedata/list', /* <!--***url需要更改 ***--> */
								method : 'get',
								idField : 'id',/* <!--***idField需要更改 ***--> */
								treeField : 'plipmt',/* <!--***treeField需要更改 ***--> */
								height : window.innerHeight
										- window.innerHeight * 0.28,
								onBeforeExpand : function(row) {//异步架加载树
									var url = "product/releasedata/list";/*<!--***url需要更改 ***--> */
									$("#tg").treegrid("options").url = url;
									return true;
								},
								onClickRow : function(rowData) { //单击事件
									//取消选中其他行
									$("#tg").treegrid("unselectAll")
									//选中点击行
									$("#tg").treegrid("select",
											rowData.id)
									//判断id是否为PR开头 根据内码获取右侧属性列表值并显示右侧属性列表
									if (rowData.id.indexOf("PR") != -1) {/*<!--***PR需要更改 ***--> */
										//获取布局右侧面板的宽度
										var p = $("#cc")
												.layout("panel", "east")[0].clientWidth
										//如果宽度为0,展开面板	
										if (p == 0) {
											$("#cc").layout("expand", "east")
										}

										//加载属性表格
										$('#pg')
												.propertygrid(
														{
															url : 'product/releasepropertygrid/list?code='
																	+ rowData.id,/*<!--***url需要更改 ***--> */
															showGroup : true,
															scrollbarSize : 0,
															height : window.innerHeight
																	- window.innerHeight
																	* 0.28,
															width : '100%'
														});
									}
								}

							});

			//搜索框绑定回车事件
			$('#searchParas').textbox({
				inputEvents : $.extend({}, $.fn.textbox.defaults.inputEvents, {
					keypress : function test() {
						if (event.keyCode == 13) {
							doSearch(); //回车搜索 
						}
					}
				})

			});

		});
	</script>
</body>
</html>
