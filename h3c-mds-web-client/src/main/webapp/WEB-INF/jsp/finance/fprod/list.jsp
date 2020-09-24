<%--
  Created by IntelliJ IDEA.
  User: sYS2403
  Date: 2019/6/4
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>财务产品族</title>
</head>
<body>

    <div id="index${id_suffix }" style="margin:0px 20px">
        <div class="index-4">
            <input id="searchStr${id_suffix}"
                   class="easyui-textbox" type="text" prompt="请输入搜索内容"
                   style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                                    class="easyui-linkbutton default" onclick="doSearch${id_suffix}();">搜 索 </a>&nbsp;
            <!--左右布局 easyui-layout-->
            <div id="cc${id_suffix }" class="easyui-layout"
                 style="width: 100%; height: 'auto';">
                <!--左布局  center-->
                <!--***title需要更改 ***-->
                <div data-options="region:'center',title:'财务产品族'"
                     style="width: 100%; height: 100%;">


                    <!--左侧树形表格-->
                    <div class="index-1">
                        <table id="tg${id_suffix }" style="width: 100%; heght: 100%;">
                            <thead>
                            <tr class="firstRow">
                                <th data-options="field:'prodlineNo',width:130,formatter:formatProgress${id_suffix }  ">产品线编号</th>
                                <th data-options="field:'prodlineDesc',width:130,formatter:formatProgress${id_suffix }  ">产品线描述</th>
                                <th data-options="field:'prodNo',width:130,formatter:formatProgress${id_suffix }  ">产品族编号</th>
                                <th data-options="field:'prodName',width:130,formatter:formatProgress${id_suffix }  ">产品族名称</th>
                            </tr>
                            </thead>
                        </table>
                    </div>
                </div>
                <!--右布局  east-->
<%--                <div--%>
<%--                        data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true"--%>
<%--                        style="width: 20%;" id="east">--%>
<%--                    <!--propertygrid动态属性-->--%>
<%--                    <table id="pg${id_suffix }">--%>
<%--                    </table>--%>
<%--                </div>--%>

            </div>
        </div>
    </div>

<script type="text/javascript">

    $(function () {
        //设定布局高度
        $("#cc${id_suffix }").layout({
            height : window.innerHeight - window.innerHeight * 0.231
        });

        var toolbar;
        if("${isAdmin}"=="true"){
            toolbar = [
                {
                    id : 'add${id_suffix }',
                    text : '创建产品族',
                    iconCls : 'tabs-icon fa fa-plus-square',
                    handler : function () {
                        if ($('#mainUrl').tabs('exists', "新增产品族")) {
                            $('#mainUrl').tabs('select', "新增产品族");
                        } else {
                            $('#mainUrl').tabs('add', {
                                title : "新增产品族",
                                href : '/finance/fprod/add',
                                closable : true
                            });
                        }
                    }
                },"-",
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
                        <%--var url = "finance/fprod/getTreeData";--%>
                        <%--$("#tg${id_suffix }").treegrid("options").url = url;--%>
                        $("#tg${id_suffix }").treegrid("reload");
                    }
                }
            ]
        }else {
            toolbar = [

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
                        <%--var url = "finance/fprod/getTreeData";--%>
                        <%--$("#tg${id_suffix }").treegrid("options").url = url;--%>
                        $("#tg${id_suffix }").treegrid("reload");
                    }
                }
            ]
        }

        //加载树表格
        $("#tg${id_suffix }").treegrid({
            iconCls : 'icon-ok',
            toolbar : toolbar,
            collapsible : false,
            url : 'finance/fprod/getTreeData',
            method : 'get',
            idField : 'code',
            treeField : 'prodlineNo',
            striped:true,
            height : window.innerHeight
                - window.innerHeight * 0.28,
            fitColumns : true,
            cache : false,
            onBeforeExpand : function(row) {//异步架加载树
                /*<!--***url需要更改 ***--> */
                var url ="";
                url = "finance/fprod/getTreeData?_="+new Date().getTime()+"&type="+row.type;
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
                if(rowData.type == '3'){
                <%--    //获取布局右侧面板的宽度--%>
                <%--    var p = $("#cc${id_suffix }")--%>
                <%--        .layout("panel", "east")[0].clientWidth--%>
                <%--    //如果宽度为0,展开面板--%>
                <%--    if (p == 0) {--%>
                <%--        $("#cc${id_suffix }").layout("expand", "east")--%>
                <%--    }--%>

                <%--    //加载属性表格--%>
                <%--    $('#pg${id_suffix }').propertygrid({--%>
                <%--        url : 'finance/fprod/getPropertyByCode?code='--%>
                <%--            + rowData.code,--%>
                <%--        showGroup : true,--%>
                <%--        scrollbarSize : 0,--%>
                <%--        height : window.innerHeight--%>
                <%--            - window.innerHeight--%>
                <%--            * 0.28,--%>
                <%--        width : '100%',--%>
                <%--        columns :  [[--%>
                <%--            {field:'name',title:'属性名',width:100,sortable:false,formatter:formatProgress${id_suffix }},--%>
                <%--            {field:'value',title:'属性值',width:100,resizable:false,formatter:formatProgress${id_suffix }}--%>
                <%--        ]]--%>
                <%--    });--%>
                <%--}else {--%>
                <%--    $("#cc${id_suffix }").layout("collapse", "east");--%>
                <%--    $('#pg${id_suffix }').propertygrid('loadData', {--%>
                <%--        rows : []--%>
                <%--    });--%>
                }

            },
            onDblClickRow : function(rowData) {

                $('#mainUrl').tabs('add',{
                    title : "修改产品族",
                    href : 'finance/fprod/edit/'+rowData.code,
                    closable : true
                });
            }
        });
    });



    //格式化以及自动换行
    function formatProgress${id_suffix }(value,rowData,rowIndex) {
        //writeObj(rowData)
        if (value == "underfined" || value == null) {
            return "";
        } else {

            if(rowData)
            {
                if(rowData.ColumnCode == 'status') {
                    if(rowData.value == 1)
                    {
                        rowData.value= "有效";
                    }
                    if(rowData.value == 0){
                        rowData.value="失效";
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

    function doSearch${id_suffix}(){
        $('#tg${id_suffix }').treegrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchStr${id_suffix}").val()
        });
    }


</script>
</body>
</html>
