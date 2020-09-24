<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>产品基本信息</title>
    <!--easyui-->
    <script src="easyui/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="easyui/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="easyui/locale/easyui-lang-zh_CN.js" type="text/javascript" charset="utf-8"></script>
    <!--字体图标-->
    <link rel="stylesheet" type="text/css" href="easyui/themes/icons/css/font-awesome.min.css" />
    <!--皮肤-->
    <link rel="stylesheet" type="text/css" href="easyui/devclient.css" />
    <link rel="stylesheet" type="text/css" href="easyui/themes/gray/easyui.css" />
    <link rel="stylesheet" type="text/css" href="easyui/css/superBlue.css" />
    <script src="easyui/super.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        /*  .datagrid-row-over,
     .datagrid-header td.datagrid-header-over {
         background: #2980b9;
     } */
        .datagrid-row-selected{
            background-color:#87CEFA;
        }

    </style>
    <script src="easyui/super.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $(function () {

        });

    </script>
</head>
<body id="main" class="easyui-layout">

<div>
    <h2>简单登录页面</h2>
    <p>密码可不填</p>
    <div style="margin:20px 0;"></div>
    <div class="easyui-panel" style="width:400px;padding:50px 60px">
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" prompt="Username" iconWidth="28" style="width:100%;height:34px;padding:10px;">
        </div>
        <div style="margin-bottom:20px">
            <input id="pass" class="easyui-passwordbox" prompt="Password" iconWidth="28" style="width:100%;height:34px;padding:10px">
        </div>
    </div>
</div>

<div style="text-align: center">
    <a href="#" class="easyui-linkbutton" onclick="submit${timestamp}();" id="sub${timestamp}">提交</a>

</div>
<div id="viewer"></div>

<script type="text/javascript">
    $('#pass').passwordbox({
        inputEvents: $.extend({}, $.fn.passwordbox.defaults.inputEvents, {
            keypress: function(e){
                var char = String.fromCharCode(e.which);
                $('#viewer').html(char).fadeIn(200, function(){
                    $(this).fadeOut();
                });
            }
        })
    })
</script>
<style>
    #viewer{
        position: relative;
        padding: 0 60px;
        top: -70px;
        font-size: 54px;
        line-height: 60px;
    }
</style>









<div data-options="region:'south'" class="super-south">
    <!--页脚-->
    <div class="super-footer-info">
        <!-- <span><i class="fa fa-info-circle"></i> 作者：tianyu&nbsp;&nbsp;QQ：779205344</span> -->
        <span><i class="fa fa-copyright"></i> CopyRight 2019 版权所有 <i class="fa fa-caret-right"></i></span>
    </div>
</div>



</body>
</html>