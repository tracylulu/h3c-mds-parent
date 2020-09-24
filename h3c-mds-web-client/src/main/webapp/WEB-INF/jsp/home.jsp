<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<!-- 设置IE标准模式 -->
<meta name="renderer" content="ie-stand">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>产品基本信息</title>

<link rel="stylesheet" type="text/css" href="bootstrap/bootstrap.min.css" />
<!--字体图标-->
<link rel="stylesheet" type="text/css" href="easyui/themes/icons/css/font-awesome.min.css" />
<!--皮肤-->
<link rel="stylesheet" type="text/css" href="easyui/themes/gray/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/css/superBlue.css" />
<link rel="stylesheet" type="text/css" href="easyui/devclient.css" />
<link rel="stylesheet" type="text/css" href="css/home.css?v=2" />
<link rel="stylesheet" type="text/css" href="css/sysmgr.css?v=2" />
<link rel="icon" type="image/x-icon" href="favicon.ico">


<style type="text/css">
#ID th, #ID td {
	width: 9%;
}

@media screen and (min-width: 768px) {
	.super-navigation-main-width {
		width: 90%;
	}
	.div-marquee{
		margin: 0 auto; 
		text-align：center; 
		width: 40%; 
		clear: both; 
		height: 4%
	}
	.subfild span{
		width:15%;
	}
}

@media screen and (min-width: 992px) {
	.super-navigation-main-width {
		width: 90%;
	}
	.div-marquee{
		margin: 0 auto; 
		text-align：center; 
		width: 40%; 
		clear: both; 
		height: 4%
	}
}

@media screen and (min-width: 1200px) {
	.super-navigation-main-width {
		width: 92%;
	}
	.div-marquee{
		margin: 0 auto; 
		text-align：center; 
		width: 40%; 
		clear: both; 
		height: 4%
	}
}

.datagrid-editable {
	padding: 0 4px !important;
}

.textBoxFrom .textbox {
	margin: 10px 0px !important;
}

.auto_selusers_false {
	margin: 10px 0px !important;
}

.auto_selusers_true {
	margin: 10px 0px !important;
}
</style>
</head>
<body id="main" class="easyui-layout">
	<!-- url('style/images/bodybg.jpg') -->
	<div id='Loading' style="position: absolute; z-index: 1000; top: 0px; left: 0px; width: 100%; height: 100%; background: #DDDDDB; text-align: center; padding-top: 20%;">
		<image src='../easyui/themes/gray/images/loading.gif' />
		<font color="#15428B" style="font-size: 18px;"></font>
	</div>
	<div data-options="region:'north',border:false" class="super-north" style="height: 50px;">
		<!--顶部-->
		<div class="super-navigation">
			<div class="super-navigation-title" style="width: 310px;">
				<img src="/images/home/H3CRed.png" style="height: 40%; margin-right: 5px;">
				产品基本信息
			</div>
			<!-- Base Data -->
			<div class="super-navigation-main super-navigation-main-width">
				<div class="super-setting-right">
					<ul>
						<li class="user">
							<span class="user-icon">
								<img id="img_user" src="../easyui/img/favicon.png" />
							</span>
							<span id="loginout">退出</span>
						</li>
						<li>
							<div class="super-setting-icon" style="display: none">
								<i class="fa fa-gears"></i>
							</div>
							<!-- <div id="mm" class="easyui-menu">
									<div>个人中心</div>
									<div id="themeSetting">主题</div>
									<div class="menu-sep"></div>
									<div id="logout">退出</div>
								</div> -->
						</li>
					</ul>
				</div>
				<div class="super-setting-right">欢迎，${sessionScope.current_user.name}</div>
				
			</div>
		</div>
	</div>
	<div data-options="region:'center'" style="padding-top: 0px; width: 70%;">
		<!-- 菜单 -->
		<div style="background-color: #EEE9E9;">
			<c:forEach items="${menue }" var="resource" varStatus="st">
				<a href="javascript:void(0)" id="mb" style="margin-left: 20px; background-color: #EEE9E9; color: #444444" class="easyui-menubutton"
					data-options="menu:'#mm${st.index }',noline:true,iconCls:''">${resource.hresName }</a>
				<div id="mm${st.index }">
					<c:forEach items="${resource.childs }" var="child">
						<c:if test="${child.childs != null }">
							<div>
								<span>${child.hresName }</span>
								<div>
									<c:forEach items="${child.childs }" var="child1">
										<div onclick="linkClick(this,'${child1.hresContent}');">
											<input type="hidden" value="${child.hresName }--${child1.hresName }" />
											${child1.hresName }
										</div>
									</c:forEach>
								</div>
							</div>
						</c:if>
						<c:if test="${child.childs == null }">
							<div onclick="linkClick(this,'${child.hresContent}');">${child.hresName }</div>
						</c:if>
					</c:forEach>
				</div>
			</c:forEach>

				
			
			<a href="javascript:void(0)" id="menu-test" style="margin-right: 2%; background-color: #EEE9E9; color: #444444" class="easyui-menubutton pull-right"
				data-options="menu:'#mm10000',noline:true,iconCls:''">页签操作</a>
				
			
			<div id="mm10000">
				<div onclick="closeThisTab()">关闭当前</div>
				<div onclick="closeAll()">全部关闭</div>
				<div onclick="closeOther()">除此之外全部关闭</div>
			</div>
			<a href="javascript:void(0)" id="menu1" style="margin-right: 2%; background-color: #EEE9E9; color: #444444" class="easyui-menubutton pull-right" onclick='refreshCurrentTab()'>页面刷新</a>
			
			<!-- <a href='javascript:void(0)' style="color:#444444;margin:0.7% 3%;cursor:pointer;float: right!important" onclick='refreshCurrentTab()'>页面刷新</a> -->
		</div>
		<!--菜单结束-->

		<!--主要内容-->
		<div class="easyui-tabs" id="mainUrl" data-options="border:false,fit:true" style="height: 100%;">
			<div title="首页" data-options="iconCls:'fa fa-home'" style="height: 100%;">
				<div class="div-marquee" id="mq">
					<!-- <marquee loop="INFINITE" onmouseover="this.stop()" onmouseout="this.start()" scrolldelay='100' hspace="20" vspace="10"> -->
						<!-- 为了更好的兼容效果，建议使用Chrome浏览器,新版本Chrome浏览器 -->
						为了更好的兼容效果，建议使用Chrome浏览器
						<a style="cursor: pointer; color: #1a8afa"  href="file://h3c-bjfs/Software/Application/Internet%20terminal/explorer/$IE/ChromeStandalone_V43.0.2357.124_Setup.exe">北京点击下载</a>
						<a style="cursor: pointer; color: #1a8afa"  href="file://h3c-hzfs/Software/Application/Internet%20terminal/explorer/$IE/ChromeStandalone_V43.0.2357.124_Setup.exe">杭州点击下载</a>
					<!-- </marquee> -->
				</div>

				<div style="margin: 0 auto; text-align：center; width: 94%; clear: both; height: 96%">
					<div id="div_Button" class=" pull-left  content content-right" style="width: 30%; height: 90%">
						<div class="contenttitle contenttitle-left">
						<span class="pull-right middle" style="width: 50px; height: 100%" onclick="showHelp();">
							<a href="javascript:void(0)"  charset="UTF-8" title="帮助" class="fa fa-question-circle-o" style="line-height: 50px; cursor: pointer;"></a>
							
							</span>
							<span class="pull-right middle" style="width: 50px; height: 100%" onclick="ShowMenuDialog()">
								<i title="个人配置" class="glyphicon glyphicon-cog " style="line-height: 50px; cursor: pointer;"></i>
							</span>
							
							<span style="width: 90%">快速导航</span>
						</div>
						<div style="width: 100%">
							<div class=" contenttitle-chil">查询类</div>
						</div>
						<div class="contentitem">
							<ul class="m-iconplanlist" id="ul_Menu_Query">
								<li class="iconplanlist-item">
									<a href="/Home/Tableau?fId=79-3E-96-A9-B6-DC-D3-D4" title="代表处仪表盘" target="_blank" class="menhu">
										<div class="li-lt">
											<i title="个人配置" class="glyphicon glyphicon-cog fa-2x "></i>
										</div>
										<div class="li-txt">代表处仪表盘</div>
									</a>
								</li>
							</ul>
						</div>
						<div style="width: 100%">
							<div class=" contenttitle-chil">申请类</div>
						</div>
						<div class="contentitem">
							<ul class="m-iconplanlist" id="ul_Menu_Add">
								<li class="iconplanlist-item">
									<a href="/Home/Tableau?fId=79-3E-96-A9-B6-DC-D3-D4" title="代表处仪表盘" target="_blank" class="menhu">
										<div class="li-lt">
											<i title="个人配置" class="glyphicon glyphicon-cog fa-2x "></i>
										</div>
										<div class="li-txt">代表处仪表盘</div>
									</a>
								</li>
							</ul>
						</div>
					</div>
					<div id="div_Approve" class=" content" style="width: 67%; height: 90%">
						<div class="contenttitle">
							<div id="div_wait_title">
								<span class="pull-right">
									<i href="#" onclick="refreshGrid()" class="homeTitleFont" style="cursor: pointer;">更多</i>
								</span>
								<span id="span_title" class="tabTitle">我的待办</span>
								<span id="span_myApp_Title" class="tabTitle tabTitle-right tabUnCheck" style="">我的申请</span>
								<span id="span_HI_Title" class="tabTitle tabTitle-right tabUnCheck" style="">我的已办</span>
							</div>
						</div>
						<div style="width: 100%; padding-left: 25px; overflow-y: auto; height: 90%" id="div_ApproveList"">
							<table id="tbl_List" width="100%" class="easyui-datagrid">
								<tr>
									<th style="width: 25%">流程类型</th>
									<th style="width: 25%">流程状态</th>
									<th style="width: 25%">申请时间</th>
									<th style="width: 25%">申请人</th>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div data-options="region:'south'" class="super-south">
		<!--页脚-->
		<div class="super-footer-info">
			<!-- <span><i class="fa fa-info-circle"></i> 作者：tianyu&nbsp;&nbsp;QQ：779205344</span> -->
			<span>
				<i class="fa fa-copyright"></i>
				CopyRight 2019 版权所有
				<i class="fa fa-caret-right"></i>
			</span>
		</div>
	</div>

	<!-- 弹窗 -->
	<div id="win" class="easyui-window " title="设置菜单" style="width: 600px; height: 400px" data-options="iconCls:'icon-save',modal:true,closed:true">
		<div>
			<div>
				<a href="#" id="btnSave${id_suffix}" class="easyui-linkbutton" onclick="setUserMenu()" plain="true" data-options="iconCls:'fa fa-save'">保存</a>
			</div>

			<div id="div_Dialog_Content">
				<!--  class="addapp-div" -->
				<div class="addapp-div" style="overflow-y: hidden">
					<div style="width: 100%;" class="contenttitle-chil">申请类</div>
					<div class="addapp-list" id="div_dialog_Add">
						<div class="addapp-item">
							<input type="checkbox" value="code">
							<label>
								<span class="name" title="财务三大法报">财务三大法报</span>
							</label>
						</div>
					</div>
				</div>
				<div class="addapp-div" style="overflow-y: hidden">
					<div style="width: 100%;" class="contenttitle-chil">查询类</div>
					<div class="addapp-list" id="div_dialog_Query">
						<div class="addapp-item">
							<input type="checkbox" value="code">
							<label>
								<span class="name" title="财务三大法报">财务三大法报</span>
							</label>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="easyui-window " id="copyLink" title="复制链接" data-options="iconCls:'icon-save',modal:true,closed:true">
		<div id="div_copyLink" style="margin:0 out;text-align:center"></div>
	</div>
	<style>
	#menu1 .m-btn-downarrow, .s-btn-downarrow{
	background:none!important
	}
	</style>
	<script src="easyui/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="easyui/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="easyui/locale/easyui-lang-zh_CN.js" type="text/javascript" charset="utf-8"></script>
	<script src="easyui/super.js" type="text/javascript" charset="utf-8"></script>
	<script src="common/js/home.js" type="text/javascript" charset="utf-8"></script>
	<script src="common/js/VR&People&DiffCommon.js" type="text/javascript" charset="utf-8"></script>
	<script src="eip/eip.v1.0.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		<%--var  loginType='${loginType}';--%>
		<%--var  moduleDesc='${mailInfo.moduleDesc}';--%>
		<%--var _href='${mailInfo.url}';--%>
		$(function () {
			if(navigator.userAgent.indexOf('Chrome') > -1){
				$("#mq").hide();
			}
			
			if("mianLogin" == "${loginType}"){
				$('#mainUrl').tabs('add', {
					title : '${mailInfo.moduleDesc}',
					href : '${mailInfo.url}',
					closable : true
				});
			}
			
			
			if("copyLink" == "${type}"){
				$('#mainUrl').tabs('add', {
					title : '${linkName}',
					href : '${linkURL}',
					closable : true
				});
			}
			
			//eip跳转登录
			if("eipLogin" == "${loginType}"){
				$('#mainUrl').tabs('add', {
					title : '${eipInfo.subject}',
					href : "${eipInfo.applicationUrl}",
					closable : true
				});
			}
		});


	</script>
</body>
</html>