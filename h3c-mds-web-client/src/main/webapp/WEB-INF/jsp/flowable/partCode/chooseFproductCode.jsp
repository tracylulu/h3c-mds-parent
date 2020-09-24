<%--
  Created by IntelliJ IDEA.
  User: sys2403
  Date: 2019/11/8
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="fproductCodeWin${timestamp}" class="easyui-window" title="对话框" style="width:75%;height:560px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_index${timestamp}" type="hidden" value=""/>
    <table width="100%">
        <tr>
            <td width="88%">
                <input id="searchCodeStr${timestamp}"
                       class="easyui-textbox" type="text" prompt="请输入搜索内容"
                       style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                                        class="easyui-linkbutton" onclick="searchFCode${timestamp}();">搜 索 </a>&nbsp;
                <table id="fprodoctCode_grid${timestamp}" >
                    <thead>
                    <tr class="firstRow">
                        <th data-options="field:'prodName',width:130 ">产品族</th>
                        <th data-options="field:'productCode',width:130 ">产品编码</th>
                        <th data-options="field:'productNameCn',width:130 ">产品中文名称</th>
                        <th data-options="field:'productNameEn',width:130  ">产品英文名称</th>

                    </tr>
                    </thead>
                </table>
            </td>
            
        </tr>
    </table>

</div>

<script type="text/javascript">

    //弹出窗口
    function layoutWin${timestamp}(index){
        var pdtId = $("#pdtId${timestamp}").combobox("getValue");
        if(pdtId == ""){
            $.messager.alert("提示","请先选择PDT！")
        }else{
            InitFProductCodeGrid${timestamp}(pdtId);
            // $("#fprodoctCode_grid${timestamp}").datagrid("load");
            $("#searchCodeStr${timestamp}").textbox("clear");
            $("#current_index${timestamp}").val(index);
            $("#fproductCodeWin${timestamp}").window('open');
        }

    }
    
    function InitFProductCodeGrid${timestamp}(pdtId) {

        $("#fprodoctCode_grid${timestamp}").treegrid({
            iconCls : 'icon-ok',
            collapsible : false,
            url : '/finance/fproductCode/getProdTreeData/'+pdtId,
            method : 'post',
            idField : 'code',
            treeField : 'prodName',
            striped:true,
            height : window.innerHeight
                - window.innerHeight * 0.28,
            fitColumns : true,
            onBeforeExpand : function(row) {//异步架加载树
                var url = '/finance/fproductCode/getProdTreeData/'+pdtId;
                $("#fprodoctCode_grid${timestamp}").treegrid("options").url = url;
                return true;
            },onDblClickRow : function(rowData) {
                debugger;
                $('#fproductCodeWin${timestamp}').window("close");
                //
                var index = $("#current_index${timestamp}").val();
                $("#prodId_"+index+"_${timestamp}").combobox("setValue",rowData._parentId);
                $("#fprodCodeId_"+index+"_${timestamp}").combobox("setValue",rowData.code);

            },toolbar : [{
                id : 'addSelectProject${timestamp}',
                text : '确定',
                handler : function() {
                    debugger;
                    $('#fproductCodeWin${timestamp}').window("close");
                    //根据选中项赋值
                    var rowData=$("#fprodoctCode_grid${timestamp}").treegrid("getSelected");
                    var index = $("#current_index${timestamp}").val();
                    $("#prodId_"+index+"_${timestamp}").combobox("setValue",rowData._parentId);
                    $("#fprodCodeId_"+index+"_${timestamp}").combobox("setValue",rowData.code);
                }
            }]

        });
    }

    function searchFCode${timestamp}(){
        $('#fprodoctCode_grid${timestamp}').treegrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchCodeStr${timestamp}").val()

        });
    }
    
</script>
</body>
</html>
