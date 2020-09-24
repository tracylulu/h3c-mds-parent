<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>prductCodeApply</title>
</head>
<body>
<div style="margin:0 20px">
	<!--搜索框-->
	产品线
	<input class="easyui-combobox" id="prodlineno${timestamp}" data-options="valueField: 'id', textField: 'prodlineDesc',  
								url: '/finance/fprodLine/getAllWithCom'" />
	PDT
	<input class="easyui-combobox" id="PDTno${timestamp}" data-options="valueField: 'id', textField: 'note',  
								url: '/flowable/processConfigItem/getComboxList/processPDT'" />
	生效时间
	<input id="start${timestamp}" type="text" class="easyui-datebox" />
	~
	<input id="end${timestamp}" type="text" class="easyui-datebox" />
	<input id="searchStr${timestamp}" class="easyui-textbox" type="text" prompt="请输入搜索内容" style="width: 65%;" />
	&nbsp;
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="doSearch${timestamp}();">搜 索 </a>
	&nbsp;

	<div>
		<table id="tbl_grid${timestamp}" class="easyui-datagrid"></table>
	</div>
	<br><br><br>
</div>
	<input id="singletan${timestamp}" value="" type="hidden" />


	<script type="text/javascript">
    $(function(){
        InitGrid${timestamp}();
    });

    function InitGrid${timestamp}(){
        $("#tbl_grid${timestamp}").datagrid({
            title:"Part编码申请",
            url: "flowable/partCodeProcess/findByPage",
            pagination: true,//允许分页
            rownumbers: true,//行号
            singleSelect: true,//只选择一行
            pageSize: 15,//每一页数据数量
            checkOnSelect: false,
            fitColumns:true, //列宽自适应
            height : window.innerHeight - window.innerHeight * 0.23,
            pageList: [15,20,30,40,50,60],

            toolbar : [
                       {
                           id : 'reload${timestamp }',
                           text : '刷新',
                           iconCls : 'tabs-icon fa fa-refresh',
                           handler : function() {


                               $("#tbl_grid${timestamp}").datagrid("reload");
                           }
                       },"-",
                       {
                           id : 'export${timestamp }',
                           text : '导出',
                           iconCls : 'tabs-icon fa fa-download',
                           handler : function() {
                           	doSearch${timestamp}();
                           	var search= $("#searchStr${timestamp}").val();
                           	var prodLine=$("#prodlineno${timestamp}").combobox("getValue");
                           	var pdt=$("#PDTno${timestamp}").combobox("getValue");                    
                               var start=$("#start${timestamp}").datebox('getValue');
                               var end=$("#end${timestamp}").datebox('getValue');
        
                           	window.location.href="/flowable/partCodeProcess/export?searchStr="+encodeURIComponent(search)+"&prodLine="+prodLine+"&pdt="+pdt+"&start="+start+"&end="+end;

                           }
                       }
                       ],
            columns: [[
                {field: 'id', checkbox: false,hidden:true},
                {field: "pdmApplyCode",title: "PDM申请单号",align: "center",width:100},
                {field: "applyCode",title: "申请编号",align: "center",width:100},
                {field: "applyPerson",title: "申请人",align: "center",width:100},
                {field: "applyDept",title: "申请部门",align: "center",width:100},
                {field: "tel",title: "联系电话",align: "center",width:100},
                {field: "statusDesc", title: "状态", align: "center",width:100},
            ]]
        });
    }

    function jsonDataFomat(val, row){
        if(val!=null){
            var str1 = val.indexOf("(")
            var str2 = val.lastIndexOf(")");
            var dateValue = val.substring(str1 + 1, str2);
            var date = new Date(parseInt(dateValue));
            return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate() + " " + date.getHours() + ":" + date.getMinutes();
        }
        return "";
    }

    $('#tbl_grid${timestamp}').datagrid({
        onSelect: function(rowIndex,rowData){
            $("#singletan${timestamp}").val(rowData.id);
        },
        onDblClickRow : function(rowIndex,rowData) {
            $('#mainUrl')
                .tabs(
                    'add',
                    {
                        title : "Part编码申请",
                        href : '/flowable/partCodeProcess/edit/'+rowData.id,
                        closable : true
                    });

        }
    });

    function doSearch${timestamp}(){
        $('#tbl_grid${timestamp}').datagrid('load',{
            //type: $("#type").val(),
            searchStr: $("#searchStr${timestamp}").val(),
            prodLine:$("#prodlineno${timestamp}").combobox("getValue"),
            pdt:$("#PDTno${timestamp}").combobox("getValue"),
            start:$("#start${timestamp}").datebox('getValue'),
            end:$("#end${timestamp}").datebox('getValue')
        });
    }

    function layoutWin${timestamp}(){
        //$("#resourceWin${timestamp}").window('open');
        $('#mainUrl').tabs('add', {
            title : "产品编码申请",
            href : 'flowable/productCodeApply/add?applyDep=1&applyType=1&applyCount=1',
            closable : true
        });
    }

    function cancle${timestamp}(){
        $("#resourceWin${timestamp}").window('close');
    }

    function confirm${timestamp}() {
        $("#resourceWin${timestamp}").window('close');
        var applyDep = $("#applyDep${timestamp}").val();
        var applyType = $("#applyType${timestamp}").val();
        var applyCount = $("#applyCount${timestamp}").val();
        $('#mainUrl').tabs('add', {
            title : "产品编码申请",
            href : 'flowable/productCodeApply/add?applyDep='+applyDep+'&applyType='+applyType+'&applyCount='+applyCount,
            closable : true
        });
    }
</script>
</body>
</html>