<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="easyui/demo.css">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script src="easyui/js/super.js" type="text/javascript" charset="utf-8"></script>
</head>
<body class="easyui-layout" style="height:100%;">

	<div style="margin:20px 0;"></div>
	<div class="easyui-layout" style="height:100%;width:100%;">
		<div data-options="region:'north'" class="super-north" style="height:10%;color: #fff;">
          <h1 style="height:30%;">研发基本信息系统</h1>
       
            <div class="easyui-panel" style="width:100%;height:30%;margin-bottom:-8px;padding-bottom:0px;">
            <a href="#" class="easyui-linkbutton" data-options="plain:true" style:"width:90px; display:block; float:left; border-color:red">基本信息申请</a>
            <a href="#" class="easyui-splitbutton" data-options="menu:''">产品基本信息查询</a>
            <a href="#" class="easyui-splitbutton" data-options="menu:''">产品R级以下信息查询</a>
            <a href="#" class="easyui-menubutton" data-options="menu:''">产品编码</a>
            <a href="#" class="easyui-menubutton" data-options="menu:''">项目编码</a>
            <a href="#" class="easyui-menubutton" data-options="menu:''">停用信息查询</a>
            <a href="#" class="easyui-menubutton" data-options="menu:''">系统配置</a>
            <a href="#" class="easyui-menubutton" data-options="menu:''">引用记录</a>
        </div>
        </div>
		<div data-options="region:'south',split:true" style="height:10%;">
        	<div class="super-footer-info">
				<span><i class="fa fa-info-circle"></i> h3c</span>
				<span><i class="fa fa-copyright"></i> CopyRight 2019 success <i class="fa fa-caret-right"></i></span>
			</div>
        </div>
		<div data-options="region:'east',split:true,title:'East',collapsible:true" style="width:20%;">
			<table id="tt" class="easyui-propertygrid" data-options="
						url: 'easyui/propertygrid_data1.json',
						method: 'get',
						showGroup: true,
						fit: true,
						border: false
					">
			</table>
		</div>
		<div data-options="region:'center',title:'产品R级',iconCls:'icon-ok',href:''" style="padding:10px;height:80%;">
		</div>
	</div>

</body>
</html>