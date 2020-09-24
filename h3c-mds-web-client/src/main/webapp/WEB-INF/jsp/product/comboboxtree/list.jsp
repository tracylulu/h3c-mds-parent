<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	   <!--easyui-->
    <script src="../../easyui/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../easyui/jquery.easyui.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../easyui/locale/easyui-lang-zh_CN.js" type="text/javascript" charset="utf-8"></script>
    <!--字体图标-->
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/icons/css/font-awesome.min.css" />
    <!--皮肤-->
    <link rel="stylesheet" type="text/css" href="../../easyui/devclient.css" /> 
    <link rel="stylesheet" type="text/css" href="../../easyui/themes/gray/easyui.css" />
    <link rel="stylesheet" type="text/css" href="../../easyui/css/superBlue.css" />
</head>
<body>
 <form id="form1" runat="server">
       <!--  <div>
            <input id="cc" />
            <input id="dd" />
            <input type="button" value="getValue" onclick="getValue()" />
            <input type="button" value="getValues" onclick="getValues()" />
            <input type="button" value="setValue" onclick="setValue()" />
            <input type="button" value="setValues" onclick="setValues()" />
            <input type="button" value="disable" onclick="disable()" />
            <input type="button" value="enable" onclick="enable()" />
        </div> -->
        <div>
         <input id="cc${id_suffix}" name="name" >
         
        <!--  <input class="easyui-combotreegrid" data-options="
					method:'get',
					width:'100%',
					panelWidth:500,
					label:'Select Item:',
					labelPosition:'top',
					url:'/easyui/data/treegrid_data1.json',
					idField:'id',
					treeField:'name',
					columns:[[
						{field:'name',title:'Name',width:200},
						{field:'size',title:'Size',width:100},
						{field:'date',title:'Date',width:100}
					]]"> -->
        </div>
    </form>


<script>
//格式化以及自动换行
function formatProgress(value) {
	if (value == "underfined" || value == null) {
		return "";
	} else {
		return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
				+ value + '</div>';
	}
}

        $(function () {
        	
        	if('${type eq "pr"}'=="true")
			{
        	
        		 $('#cc${id_suffix}').combotreegrid({
         		    method:'get',
 					width:'100%',
 					panelWidth:500,
 					label:'Select Item:',
 					labelPosition:'top',
 					url:'/product/comboboxtree/prdata',        
 					idField:'plipmtno',
 					treeField:'plipmt',
 					onBeforeExpand : function(row) {//异步架加载树
 						var url = "/product/comboboxtree/prdata";/*<!--***url需要更改 ***--> */
 						$("#cc${id_suffix}").combotreegrid("options").url = url;
 						return true;
 					},
                   columns:[[
                 	  {field:'plipmtno',title:'产品编码',width:200,hidden:true,formatter:formatProgress},
                       {field:'plipmt',title:'产品',width:200,formatter:formatProgress},
                       {field:'release',title:'产品R级',width:200,formatter:formatProgress},
                       {field:'releaseno',title:'对象项目财务编码',width:200,formatter:formatProgress}
                   ]]
               }); 	
			}else{
			
        	    $('#cc${id_suffix}').combotreegrid({
        		    method:'get',
					width:'100%',
					panelWidth:500,
					label:'Select Item:',
					labelPosition:'top',
					url:'/product/comboboxtree/bldata',        
					idField:'plipmtno',
					treeField:'plipmt',
					onBeforeExpand : function(row) {//异步架加载树
						
						var url = "/product/comboboxtree/bldata";/*<!--***url需要更改 ***--> */
						$("#cc${id_suffix}").combotreegrid("options").url = url;
						return true;
					},
                  columns:[[
                	  {field:'plipmtno',title:'产品编码',width:200,hidden:true,formatter:formatProgress},
                      {field:'plipmt',title:'产品线',width:200,formatter:formatProgress},
                      {field:'release',title:'产品R级',width:200,formatter:formatProgress},
                      {field:'release',title:'版本名称',width:200,formatter:formatProgress},
                      {field:'releaseno',title:'对外版本名称',width:200,formatter:formatProgress}
                  ]]
              }); 
			}
        	
        	    
        	
        	
       
          /*   $('#dd').combobox({
                method: 'get', //必须指明
                url: 'easyui/data/combox1.json',//必须指明
                valueField: 'id',
                textField: 'text',
                editable: true,   //编辑，支持模糊查询
                //multiple: true,   //为true，出来多选框，勾选多个
                required: true,
                onChange: function (newValue, oldValue) {
                    reload();//实现联动
                }
            }); */
        });
       /*  function reload() {
            $('#dd').combobox({
                method: 'reload', //必须指明
                url: 'easyui/data/combox1.json?param='+'这里是传的新值'+'&a='+Math.random()//必须指明
            });
        } */
      /*   function GetData() {
            var t = $('#cc').combotree('getData');
            alert(t.length);
        }
        function SetDefault() {
            var t = $('#cc').combotree('getData');
            $('#cc').combotree('select',t[0].id);
        }
        function getValues() {
            var t = $('#cc').combotree('getValues');
            alert(t);
        }
        function getValue() {
            var t = $('#cc').combotree('getValue');
            alert(t);
        }
        function setValues() {
            $('#cc').combotree('setValues', ['111', '112']);
        }
        function setValue() {
            $('#cc').combotree('setValue', '11');
        }
        function disable() {
            $('#cc').combotree('disable');
        }
        function enable() {
            $('#cc').combotree('enable');
        } */
    </script>
</body>
</html>