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
    <title>产品编码申请</title>
</head>
<body>

<div id="index${id_suffix }" style="margin:0px 20px;">
    <div class="index-4">
        <input id="searchStr${id_suffix}"
               class="easyui-textbox" type="text" prompt="请输入搜索内容"
               style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                                class="easyui-linkbutton" onclick="doSearch${id_suffix}();">搜 索 </a>&nbsp;
        <!--左右布局 easyui-layout-->
        <div id="cc${id_suffix }" class="easyui-layout"
             style="width: 100%; height: 'auto';">
            <!--左布局  center-->
            <!--***title需要更改 ***-->
            <div data-options="region:'center',title:'产品编码申请'"
                 style="width: 100%; height: 100%;">


                <!--左侧树形表格-->
                <div class="index-1">
                    <table id="tg${id_suffix }" style="width: 100%; heght: 100%;">
                        <thead>
                        <tr class="firstRow">
                            <c:if test="${type == '1'}">
                                <th data-options="field:'name',width:130,formatter:formatter${id_suffix }">申请人</th>
                                <th data-options="field:'applyCode',width:130">申请编号</th>
                                <th data-options="field:'productCodes',width:130">产品编码</th>
                                <th data-options="field:'handler',width:130">当前责任人</th>
                                <th data-options="field:'applyDept',width:130,formatter:formatDept${id_suffix } ">申请部门</th>
                                <th data-options="field:'statusDesc',width:130">状态</th>
                                <th data-options="field:'applyType',width:130,formatter:formatType${id_suffix } ">操作类型</th>
                            </c:if>
                            <c:if test="${type == '2' || type == '3'}">
                                <th data-options="field:'name',width:130,formatter:formatter${id_suffix }">状态</th>
                                <th data-options="field:'subSign',width:130">申请人</th>
                                <th data-options="field:'applyCode',width:130">申请编号</th>
                                <th data-options="field:'productCodes',width:130">产品编码</th>
                                <th data-options="field:'handler',width:130">当前责任人</th>
                                <th data-options="field:'applyDept',width:130,formatter:formatDept${id_suffix } ">申请部门</th>
                                <th data-options="field:'applyType',width:130,formatter:formatType${id_suffix } ">操作类型</th>
                            </c:if>
                            <c:if test="${type == '4'}">
                                <th data-options="field:'name',width:130,formatter:formatter${id_suffix }">当前责任人</th>
                                <th data-options="field:'applyCode',width:130">申请编号</th>
                                <th data-options="field:'productCodes',width:130">产品编码</th>
                                <th data-options="field:'applyDept',width:130,formatter:formatDept${id_suffix } ">申请部门</th>
                                <th data-options="field:'subSign',width:130">申请人</th>
                                <th data-options="field:'statusDesc',width:130">状态</th>
                                <th data-options="field:'applyType',width:130,formatter:formatType${id_suffix } ">操作类型</th>
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
<br/><br/>
<script type="text/javascript">

    $(function () {
        //设定布局高度
        $("#cc${id_suffix }").layout({
            height : window.innerHeight - window.innerHeight * 0.231
        });

        //加载树表格
        $("#tg${id_suffix }").treegrid({
            iconCls : 'icon-ok',
            toolbar : [
                {
                    id : 'add${id_suffix }',
                    text : '产品编码申请',
                    iconCls : 'tabs-icon fa fa-plus-square',
                    handler : function () {
                    	//20191121 lkf7579修改 产品编码可以打开多个页签
                       
                    	$('#mainUrl').tabs('add', {
                            title : "产品编码申请",
                            href : 'flowable/productCodeApply/add?applyDep=1&applyType=1&applyCount=1',
                            closable : true
                        });
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
                        $("#tg${id_suffix }").treegrid("reload");
                    }
                }
            ],
            collapsible : false,
            url : 'flowable/productCodeApply/getDataList?type=${type}',
            method : 'get',
            idField : 'code',
            treeField : 'name',
            striped:true,
            height : window.innerHeight
                - window.innerHeight * 0.28,
            fitColumns : true,
            onBeforeExpand : function(row) {//异步架加载树
                /*<!--***url需要更改 ***--> */
                var url ="";
                url = "flowable/productCodeApply/getDataList?type=${type}";
                $("#tg${id_suffix }").treegrid("options").url = url;
                return true;
            },
            onLoadSuccess : function(data) {
            },
            onClickRow : function(rowData) { //单击事件

            },
            onDblClickRow : function(rowData) {
                debugger;
                if(rowData.name == 'CODE_APPLY'){
                    $('#mainUrl').tabs('add',{
                        title : "查看产品编码申请",
                        href : '/flowable/productCodeApply/edit/'+rowData.code,
                        closable : true
                    });

                }

            }
        });
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

    //格式化以及自动换行
    function formatDept${id_suffix }(value,rowData,rowIndex,code) {
        if (value == "underfined" || value == null) {
            return "";
        } else {
            if(value == "D0001"){
                value = "研发";
            }else if(value == "D0002"){
                value = "专业服务部";
            }else if(value == "D0003"){
                value = "其他";
            }
            return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
                + value + '</div>';
        }
    }

    function formatType${id_suffix }(value,rowData,rowIndex,code) {
        if (value == "underfined" || value == null) {
            return "";
        } else {
            if(value == "1"){
                value = "新增";
            }else if(value == "2"){
                value = "改变";
            }else if(value == "3"){
                value = "停用";
            }
            return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;">'
                + value + '</div>';
        }
    }

    function formatter${id_suffix }(value) {
        if(value == undefined || value == "CODE_APPLY"){
            value = "";
        }
        return value;
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
            searchStr: $("#searchStr${id_suffix}").val()
        });
    }


</script>
</body>
</html>
