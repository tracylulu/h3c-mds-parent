<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/6/4
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ibds" uri="/WEB-INF/tld/tags.tld" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>产品编码</title>
</head>
<body>

<div id="index${id_suffix }" style="margin:0px 20px">
    <div class="index-4">
    	产品线 <input class="easyui-combobox" id="prodlineno${id_suffix}" data-options="valueField: 'prodlineDesc', textField: 'prodlineDesc',
								url: '/finance/fprodLine/getDistinctDescFromCode'"/>
    	PDT <input class="easyui-combobox" id="PDTno${id_suffix}" data-options="valueField: 'id', textField: 'note',  
								url: '/flowable/processConfigItem/getComboxList/processPDT'" />
<%--		使用状态 <input id="state${id_suffix}" class="easyui-combobox" name="state" data-options="multiple:true"/>--%>
 		生效时间<input  id="start${id_suffix}"  type= "text" class= "easyui-datebox" />~<input  id="end${id_suffix}"  type= "text" class= "easyui-datebox" />
        &nbsp&nbsp停用
        <input id="state${id_suffix}" type="checkbox" name="state" value="1,2,3">
        <input id="searchStr${id_suffix}"
               class="easyui-textbox" type="text" prompt="请输入搜索内容"
               style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                                class="easyui-linkbutton" onclick="doSearch${id_suffix}();">搜 索 </a>&nbsp;
        <!--左右布局 easyui-layout-->
        <div id="cc${id_suffix }" class="easyui-layout"
             style="width: 100%; height: 'auto';">
            <!--左布局  center-->
            <!--***title需要更改 ***-->
            <div data-options="region:'center',title:'${title}'"
                 style="width: 100%; height: 100%;">


                <!--左侧树形表格-->
                <div class="index-1">
                    <table id="tg${id_suffix }" style="width: 100%; heght: 100%;">
                        <thead>
                        <tr class="firstRow">
                            <c:if test="${type == '1' || type=='3'}">
                                <th data-options="field:'prodlineName',width:130,formatter:formatProgress${id_suffix }  ">产品线</th>
                                <th data-options="field:'pdtName',width:130,formatter:formatProgress${id_suffix }  ">PDT</th>
                            </c:if>
                            <c:if test="${type == '2' || type=='4'}">
                                <th data-options="field:'prodlineName',width:130,formatter:formatProgress${id_suffix }  ">所属产品线/PDT</th>
                            </c:if>
                            <th data-options="field:'productCode',width:130,formatter:formatProgress${id_suffix }  ">产品编码</th>
                            <th data-options="field:'productNameCn',width:130,formatter:formatProgress${id_suffix }  ">产品中文名称</th>
                            <th data-options="field:'productNameEn',width:130,formatter:formatProgress${id_suffix }  ">产品英文名称</th>
<%--                            <th data-options="field:'bomCode',width:100,formatter:formatProgress2${id_suffix }  ">BOM编码</th>--%>
                            <th data-options="field:'bomCode',width:100">BOM编码</th>
                            <th data-options="field:'status',width:130,formatter:formatProgress${id_suffix }  ">编码状态</th>
                            <th data-options="field:'effectDate',width:130,formatter:formatProgress1${id_suffix }  ">生效时间</th>
                            <c:if test="${type == '3' || type=='4'}">
                                <th data-options="field:'mark',width:130">Mark标记</th>
                            </c:if>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
            <!--右布局  east-->
<%--            <div--%>
<%--                    data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true"--%>
<%--                    style="width: 20%;" id="east">--%>
<%--                <!--propertygrid动态属性-->--%>
<%--                <table id="pg${id_suffix }">--%>
<%--                </table>--%>
<%--            </div>--%>

        </div>
    </div>
</div>

<script type="text/javascript">

    $(function () {

        $("#prodlineno${id_suffix}").combobox({
           onChange: function (n,o) {
               debugger;
                var p = encodeURIComponent(n)
               debugger;
               $.post("/flowable/processConfigItem/getByProdlineName?prodline="+p,function (result) {
                   $("#PDTno${id_suffix}").combobox("clear");
                   $("#PDTno${id_suffix}").combobox("loadData",result.data);
               });
           }
        });
    	<%--$("#state${id_suffix }").combobox({--%>
    	<%--	valueField : 'id',--%>
    	<%--	textField : 'text',--%>
    	<%--	panelHeight : 'auto',--%>
    	<%--	multiple:true,--%>
    	<%--	editable:false,--%>
    	<%--	data:[{id:'1',text:'新增'},{id:'2',text:'改变'},{id:'3',text:'停用'}],--%>
    	<%--	formatter: function (row) {--%>
    	<%--		 var opts = $(this).combobox('options');--%>
    	<%--		--%>
    	<%--		 return '<input type="checkbox" class="combobox-checkbox"> ' + row[opts.textField]--%>
    	<%--	},  --%>
    	<%--	onSelect: function (row) {--%>
    	<%--		  var opts = $(this).combobox('options');--%>
    	<%--		  var el = opts.finder.getEl(this, row[opts.valueField]);--%>
    	<%--		  el.find('input.combobox-checkbox')._propAttr('checked', true);--%>
    	<%--	},--%>
    	<%--	onUnselect: function (row) {--%>
    	<%--		   var opts = $(this).combobox('options');--%>
    	<%--		   var el = opts.finder.getEl(this, row[opts.valueField]);--%>
    	<%--		   el.find('input.combobox-checkbox')._propAttr('checked', false);--%>
    	<%--	},--%>
    	<%--	onLoadSuccess:function(){--%>
    	<%--		$("#state${id_suffix }").combobox("setValues",["1","2"]);--%>
    	<%--	}--%>
    	<%--});--%>
    	
    	/* $("#start${id_suffix}").datebox('calendar').calendar({
    		validator: function(date){
    			var endDate=$("#end${id_suffix}").datebox('getValue');
    			if(endDate!=null&&endDate!=undefined&&endDate!=''){
    				return date>endDate;
    			}
    			return true;
    		}
    	});
    	
    	$("#end${id_suffix }").datebox('calendar').calendar({
    		validator: function(date){
    			var startDate=$("#start${id_suffix}").datebox('getValue');
    			if(startDate!=null&&startDate!=undefined&&startDate!=''){
    				return date<startDate;
    			}
    			return true;
    		}
    	}); */

    	
        //设定布局高度
        $("#cc${id_suffix }").layout({
            height : window.innerHeight - window.innerHeight * 0.231
        });
        var toolbars;
        if("${isAdmin}"=="true"){
            toolbars = [

                <%--{--%>
                <%--    id : 'add${id_suffix }',--%>
                <%--    text : '创建产品编码',--%>
                <%--    iconCls : 'tabs-icon fa fa-plus-square',--%>
                <%--    handler : function () {--%>
                <%--        if ($('#mainUrl').tabs('exists', "新增产品编码")) {--%>
                <%--            $('#mainUrl').tabs('select', "新增产品编码");--%>
                <%--        } else {--%>
                <%--            $('#mainUrl').tabs('add', {--%>
                <%--                title : "新增产品编码",--%>
                <%--                href : '/finance/fproductCode/add',--%>
                <%--                closable : true--%>
                <%--            });--%>
                <%--        }--%>
                <%--    }--%>
                <%--},"-",--%>
                {
                    id : 'collapse${id_suffix }',
                    text : '全部折叠',
                    iconCls : 'tabs-icon fa fa-minus-square',
                    handler : function() {
                        //全部折叠
                        $("#tg${id_suffix }").treegrid("collapseAll");
                    }
                },"-",
                {
                    id : 'reload${id_suffix }',
                    text : '刷新',
                    iconCls : 'tabs-icon fa fa-refresh',
                    handler : function() {

                        <%--var p = $("#cc${id_suffix }").layout("panel", "east")[0].clientWidth--%>
                        <%--if (p != 0) {--%>
                        <%--    $('#pg${id_suffix }').propertygrid('loadData', {--%>
                        <%--        rows : []--%>
                        <%--    });--%>
                        <%--    $("#cc${id_suffix }").layout("collapse", "east")--%>
                        <%--}--%>
                        //重新加载
                        $("#tg${id_suffix }").treegrid("reload");
                        //$("#prodlineno${id_suffix}").combobox("setValue","");
                        //$("#PDTno${id_suffix}").combobox("setValue","");
                    }
                }
                ,"-",
                {
                    id : 'export${id_suffix }',
                    text : '导出',
                    iconCls : 'tabs-icon fa fa-download',
                    handler : function() {
                        doSearch${id_suffix}();
                        var search= $("#searchStr${id_suffix}").val();
                        var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
                        var pdt=$("#PDTno${id_suffix}").combobox("getValue");
                        var state=$("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"";
                        var start=$("#start${id_suffix}").datebox('getValue');
                        var end=$("#end${id_suffix}").datebox('getValue');
                        $.post("/finance/fproductCode/getExportDataCount",
                        		{searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end,type:'${type}'},
                    			function(result){
                    		if(result.status==200){
                    			if(result.message!=""){
                    				 $.messager.alert("提示",result.message);
                    			}else{
                    			window.location.href="/finance/fproductCode/export?searchStr="+encodeURIComponent(search)+"&prodLine="+encodeURIComponent(prodLine)+"&pdt="+encodeURIComponent(pdt)+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end+"&type=${type}";
                    			}
                    		}
                    	});
                    }
                },"-",
                {
                    id : 'export1${id_suffix }',
                    text : '导出(不拆分BOM)',
                    iconCls : 'tabs-icon fa fa-download',
                    handler : function() {
                        doSearch${id_suffix}();
                        var search= $("#searchStr${id_suffix}").val();
                        var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
                        var pdt=$("#PDTno${id_suffix}").combobox("getValue");
                        var state=$("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"";
                        var start=$("#start${id_suffix}").datebox('getValue');
                        var end=$("#end${id_suffix}").datebox('getValue');
                        $.post("/finance/fproductCode/getExportDataCount2",
                            {searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end,type:'${type}'},
                            function(result){
                                if(result.status==200){
                                    if(result.message!=""){
                                        $.messager.alert("提示",result.message);
                                    }else{
                                        window.location.href="/finance/fproductCode/export1?searchStr="+encodeURIComponent(search)+"&prodLine="+encodeURIComponent(prodLine)+"&pdt="+encodeURIComponent(pdt)+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end+"&type=${type}";
                                    }
                                }
                            });
                    }
                }
            ];

        }else{
            toolbars = [

                {
                    id : 'collapse${id_suffix }',
                    text : '全部折叠',
                    iconCls : 'tabs-icon fa fa-minus-square',
                    handler : function() {
                        //全部折叠
                        $("#tg${id_suffix }").treegrid("collapseAll");
                    }
                },"-",
                {
                    id : 'reload${id_suffix }',
                    text : '刷新',
                    iconCls : 'tabs-icon fa fa-refresh',
                    handler : function() {

                        <%--var p = $("#cc${id_suffix }").layout("panel", "east")[0].clientWidth--%>
                        <%--if (p != 0) {--%>
                        <%--    $('#pg${id_suffix }').propertygrid('loadData', {--%>
                        <%--        rows : []--%>
                        <%--    });--%>
                        <%--    $("#cc${id_suffix }").layout("collapse", "east")--%>
                        <%--}--%>
                        //重新加载
                        $("#tg${id_suffix }").treegrid("reload");
                        //$("#prodlineno${id_suffix}").combobox("setValue","");
                        //$("#PDTno${id_suffix}").combobox("setValue","");
                    }
                }
                ,"-",
                {
                    id : 'export${id_suffix }',
                    text : '导出',
                    iconCls : 'tabs-icon fa fa-download',
                    handler : function() {
                        doSearch${id_suffix}();
                        var search= $("#searchStr${id_suffix}").val();
                        var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
                        var pdt=$("#PDTno${id_suffix}").combobox("getValue");
                        var state= $("input[id='state${id_suffix}']:checked").val()?$("#state${id_suffix}:checked").val():"";;
                        var start=$("#start${id_suffix}").datebox('getValue');
                        var end=$("#end${id_suffix}").datebox('getValue');
                        $.post("/finance/fproductCode/getExportDataCount",
                        		{searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end,type:'${type}'},
                    			function(result){
                    		if(result.status==200){
                    			if(result.message!=""){
                    				 $.messager.alert("提示",result.message);
                    			}else{
                    			window.location.href="/finance/fproductCode/export?searchStr="+encodeURIComponent(search)+"&prodLine="+encodeURIComponent(prodLine)+"&pdt="+encodeURIComponent(pdt)+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end+"&type=${type}";
                    			}
                    		}
                    	});
                    }
                },"-",
                {
                    id : 'export1${id_suffix }',
                    text : '导出(不拆分BOM)',
                    iconCls : 'tabs-icon fa fa-download',
                    handler : function() {
                        doSearch${id_suffix}();
                        var search= $("#searchStr${id_suffix}").val();
                        var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
                        var pdt=$("#PDTno${id_suffix}").combobox("getValue");
                        var state=$("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"";
                        var start=$("#start${id_suffix}").datebox('getValue');
                        var end=$("#end${id_suffix}").datebox('getValue');
                        $.post("/finance/fproductCode/getExportDataCount",
                            {searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end,type:'${type}'},
                            function(result){
                                if(result.status==200){
                                    if(result.message!=""){
                                        $.messager.alert("提示",result.message);
                                    }else{
                                        window.location.href="/finance/fproductCode/export1?searchStr="+encodeURIComponent(search)+"&prodLine="+encodeURIComponent(prodLine)+"&pdt="+encodeURIComponent(pdt)+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end+"&type=${type}";
                                    }
                                }
                            });
                    }
                }
            ];
        }
        //加载树表格
        $("#tg${id_suffix }").treegrid({
            iconCls : 'icon-ok',
            toolbar : toolbars,
            collapsible : false,
            url : 'finance/fproductCode/getTreeData?type=${type}',
            method : 'post',
            idField : 'code',
            treeField : 'prodlineName',
            striped:true,
            nowrap:true,
            height : window.innerHeight
                - window.innerHeight * 0.28,
            fitColumns : true,
            onBeforeExpand : function(row) {//异步架加载树
                /*<!--***url需要更改 ***--> */
                debugger;
                var state;
                var checked = $("#state${id_suffix}").is(":checked");
                if(checked){
                    state = "";
                }else{
                    state = "&state=1,2";
                }
                var url ="";
                url = "finance/fproductCode/getTreeData?type=${type}"+state;
                $("#tg${id_suffix }").treegrid("options").url = url;
                return true;
            },
            onLoadSuccess : function(data) {
            },
            onClickRow : function(rowData) { //单击事件

                //取消选中其他行
                $("#tg${id_suffix }").treegrid("unselectAll");
                //选中点击行
                $("#tg${id_suffix }").treegrid("select",
                    rowData.code);

                if(rowData.name == "FCODE"){
                    <%--//获取布局右侧面板的宽度--%>
                    <%--var p = $("#cc${id_suffix }")--%>
                    <%--    .layout("panel", "east")[0].clientWidth--%>
                    <%--//如果宽度为0,展开面板--%>
                    <%--if (p == 0) {--%>
                    <%--    $("#cc${id_suffix }").layout("expand", "east")--%>
                    <%--}--%>

                    //加载属性表格
                    <%--$('#pg${id_suffix }').propertygrid({--%>
                    <%--    url : 'finance/fproductCode/getPropertyByCode?id='--%>
                    <%--        + rowData.code,--%>
                    <%--    showGroup : true,--%>
                    <%--    scrollbarSize : 0,--%>
                    <%--    height : window.innerHeight--%>
                    <%--        - window.innerHeight--%>
                    <%--        * 0.28,--%>
                    <%--    width : '100%',--%>
                    <%--    columns :  [[--%>
                    <%--        {field:'name',title:'属性名',width:100,sortable:false,formatter:formatProgress${id_suffix }},--%>
                    <%--        {field:'value',title:'属性值',width:100,resizable:false,formatter:formatProgress${id_suffix }}--%>
                    <%--    ]]--%>
                    <%--});--%>
                }else {
                    <%--$("#cc${id_suffix }").layout("collapse", "east");--%>
                    <%--$('#pg${id_suffix }').propertygrid('loadData', {--%>
                    <%--    rows : []--%>
                    <%--});--%>
                }

            },
            onDblClickRow : function(rowData) {
                debugger;
                var productCode = rowData.productCode;
                if(rowData.name == 'FCODE'){
                    $.post("finance/fproductCode/checkAdmin",function (result) {
                        debugger;
                        if(result.data){
                            $('#mainUrl').tabs('add',{
                                title : "产品编码"+productCode,
                                href : 'finance/fproductCode/edit/'+rowData.code,
                                closable : true
                            });
                        }
                    });

                }

            }
        });
        
       /*  $("#prodlineno${id_suffix}").combobox({
			onSelect: function (rec) {debugger           	
                var url = '/product/comboboxdata/list?type=PT&code=' + rec.prodlineno;//+'&sub_code=' + $('#PDT${id_suffix}').combobox("getValue");
                $('#PDTno${id_suffix}').combobox('reload', url);
            }
		}); */
    });


    function formatProgress1${id_suffix }(value,rowData,rowIndex,code) {
        if(value == undefined){
            return "";
        }
        if(rowData.effectDate != undefined){
            var d = new Date(Date.parse(rowData.effectDate.replace(/-/g, "/")));
            d.setHours(d.getHours()-14);
            //alert(d.getHours());
            rowData.effectDate = jsonDataFomat${id_suffix }(d);
        }
        return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
            + jsonDataFomat${id_suffix }(d) + '</div>';
    }

    function formatProgress2${id_suffix }(value,rowData,rowIndex,code) {

        if(value == undefined){
            return "";
        }
        var reg = /[;；]/g;
        value=value.replace(reg,"$&\r\n");

        return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
            + value + '</div>';
    }

    //格式化以及自动换行
    function formatProgress${id_suffix }(value,rowData,rowIndex,code) {
        //writeObj(rowData)
        //alert(rowData.ColumnCode);

        if (value == "underfined" || value == null) {
            return "";
        } else {

            if(rowData)
            {
                if(rowData.ColumnCode == 'status') {
                    if(rowData.value == '1')
                    {
                        rowData.value= "新增";
                    }
                    if(rowData.value == '2'){
                        rowData.value="编辑";
                    }
                    if(rowData.value == '3'){
                        rowData.value="停用";
                    }

                }

                if(rowData.ColumnCode=='ifofficialnaming'){

                    if(rowData.value == 1)
                    {
                        rowData.value="是";
                    }
                    if(rowData.value == 0){
                        rowData.value="否";
                    }
                }

                if(rowData.ColumnCode=='projectstatus'){

                    if(rowData.value == 1)
                    {
                        rowData.value="在研";
                    }
                    else if(rowData.value == 2){
                        rowData.value="终止";
                    }
                    else if(rowData.value == 3){
                        rowData.value="挂起";
                    }
                }

                if(rowData.projectstatus == 1)
                {
                    rowData.projectstatus="在研";
                }
                else if(rowData.projectstatus == 2){
                    rowData.projectstatus="终止";
                }
                else if(rowData.projectstatus == 3){
                    rowData.projectstatus="挂起";
                }

                if(rowData.ifofficialnaming == 1)
                {
                    rowData.ifofficialnaming="是";
                }
                if(rowData.ifofficialnaming == 0)
                {
                    rowData.ifofficialnaming="否";
                }
                if(rowData.status == '1'){
                    rowData.status = "新增";
                }
                if(rowData.status == '2'){
                    rowData.status = "改变";
                }
                if(rowData.status == '3'){
                    rowData.status = "停用";
                }



                /* if(rowData.producttype!='undefined'&&rowData.producttype!="undefined"&&rowData.producttype!=undefined){

                     $.ajax({
                            type : "POST",
                            url : "product/data/dicvalue?type=4&value="+rowData.producttype,
                            //dataType : 'json',
                            async: true,
                            success : function(result) {
                                rowData.producttype=result;
                                alert(rowData.producttype);
                            },
                            error : function(result) {
                                rowData.producttype=result;
                            }
                        });
                } */



            }
            return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
                + value + '</div>';
        }
    }

    function jsonDataFomat${id_suffix }(date){
        debugger;
        var y = date.getFullYear();
        var m = date.getMonth() + 1;
        m = m < 10 ? ('0' + m) : m;
        var d = date.getDate();
        d = d < 10 ? ('0' + d) : d;
        var h = date.getHours();
        var minute = date.getMinutes();
        minute = minute < 10 ? ('0' + minute) : minute;
        var second= date.getSeconds();
        second = second < 10 ? ('0' + second) : second;
        return y + '-' + m + '-' + d+' '+h+':'+minute+':'+ second;
    };

    function doSearch${id_suffix}(){
        $('#tg${id_suffix}').treegrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchStr${id_suffix}").val(),
            prodLine:$("#prodlineno${id_suffix}").combobox("getValue"),
            pdt:$("#PDTno${id_suffix}").combobox("getValue"),
            state: $("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"",
            start:$("#start${id_suffix}").datebox('getValue'),
            end:$("#end${id_suffix}").datebox('getValue')
        });
    }

</script>
</body>
</html>
