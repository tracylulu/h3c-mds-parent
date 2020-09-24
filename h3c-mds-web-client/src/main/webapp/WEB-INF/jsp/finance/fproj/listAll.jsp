<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>项目编码全视图</title>
</head>
		
<body>

	<div id="index${id_suffix }">
		<div class="index-4"  style="margin: 0 20px;">
			产品线
			<input class="easyui-combobox" id="prodlineno${id_suffix}" data-options="valueField: 'prodlineno', textField: 'prodline',  
								url: '/finance/fprojectCode/prodLine/getAllWithCom?state=1'" />
			PDT
			<input class="easyui-combobox" id="PDTno${id_suffix}" data-options="valueField: 'pdtno', textField: 'pdt',  
								url: '/finance/fprojectCode/getAllPdt?state=1'" /><%-- 使用状态
			<input id="state${id_suffix}" class="easyui-combobox" name="state" data-options="multiple:true" />
			 --%>生效时间
			<input id="start${id_suffix}" type="text" class="easyui-datebox" />
			~
			<input id="end${id_suffix}" type="text" class="easyui-datebox" />
			&nbsp&nbsp停用
			<input id="state${id_suffix}" type="checkbox" name="state" value="0" onclick='stateClick${id_suffix}()'>
			<input onkeydown="inpKeyDown();" id="searchParas${id_suffix}" class="easyui-textbox" prompt="请输入搜索内容" style="width: 65%;" />
			<a href="javascript:void(0)" class="easyui-linkbutton" onclick="doSearch${id_suffix}();">搜 索 </a>

			<!--左右布局 easyui-layout-->
			<div id="cc${id_suffix }" class="easyui-layout" style="width: 100%; height: 'auto';">
				<!--左布局  center-->
				<!--***title需要更改 ***-->
				<div data-options="region:'center'" style="width: 100%; height: 100%;">


					<!--左侧树形表格-->
					<div class="index-1">
						<table id="dg${id_suffix}" class="easyui-datagrid" style="width: 100%; heght: 100%;">

						</table>
					</div>
					<br/>
					<br/>
					<br/>
					<br/>
				</div>
				<!--右布局  east-->
				<%-- <div data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true" style="width: 20%;" id="east">
					<!--propertygrid动态属性-->
					<table id="pg${id_suffix }">
					</table>
				</div> --%>

			</div>
		</div>
	</div>
	<script type="text/javascript">

	$(function(){
		//initCombox${id_suffix}();
		//产品线
		$("#prodlineno${id_suffix}").combobox({
			onChange : function(n, o){
				var flag = $("#state${id_suffix}").get(0).checked;
				if(flag){
					state = '';
				}else{
					state = '1';
				}
				if(n != ''){
					$.post("/finance/fprojectCode/getPdtByProlineno?prodlineno="+n + "&state=" + state,function (result) {
			            $("#PDTno${id_suffix}").combobox("loadData",result);
			            $("#PDTno${id_suffix}").combobox("setValue","");
			        });
				}
			
			}
		});
		
		
		
		 //设定布局高度
        $("#cc${id_suffix }").layout({
            height : window.innerHeight - window.innerHeight * 0.231
        });
		$("#dg${id_suffix}").datagrid({
			 title:"项目编码全视图",
    	    url:"finance/fprojectCode/listOfProjectCodeAll",
            striped:true, 
    	    toolbar : [/* {
                 id : 'add',
                text : '创建项目编码',
                iconCls : 'tabs-icon fa fa-plus-square',
                handler : function() {
                    if ($('#mainUrl').tabs('exists', "新增项目编码")) {
                        $('#mainUrl').tabs('select', "新增项目编码");
                    } else {
                        
                    	 $('#mainUrl').tabs('add', {
            	             title : "新增项目编码",
            	             href : '/finance/fprojectCode/toAddProjectCode?isEdit=true',
            	             closable : true
            	         });

                    }
                }
            },"-", */
            {
                id : 'reload${id_suffix }',
                text : '刷新',
                iconCls : 'tabs-icon fa fa-refresh',
                handler : function() {

                   
                    $("#dg${id_suffix}").datagrid("reload");
                }
            },"-",
            {
                id : 'export${id_suffix }',
                text : '导出',
                iconCls : 'tabs-icon fa fa-download',
                handler : function() {
                	doSearch${id_suffix}();
                	export${id_suffix}();                    
                }
            },"-",
				{
					id : 'export1${id_suffix }',
					text : '导出(不含服务产品)',
					iconCls : 'tabs-icon fa fa-download',
					handler : function() {
						doSearch${id_suffix}();
						export2${id_suffix}();
					}
				}],
    	    columns:[[    
				{field: 'id', hidden:true},
    	        {field:'fProjno',title:'项目编码',width:"80px"},    
    	        {field:'fProjname',title:'项目名称',width:"250px"},    
    	        /* {field:'fProjcode',title:'项目代号',width:"5%"}, */
    	        
    	        {field:'fObjcaName',title:'项目类别',width:"100px"}, 
    	        {field:'fProjmng',title:'项目经理',width:"100px"},  
    	        {field:'fProductlineName',title:'所属产品线',width:"100px"}, 
    	        {field:'fPdtName',title:'所属PDT',width:"100px"},  
    	        {field:'fProductCode',title:'服务的产品编码',width:"100px"},  
    	        {field:'productNameCn',title:'服务的产品名称',width:"100px"},  
    	        {field:'rate',title:'此产品分摊比例',width:"90px",formatter:formatPercent${id_suffix}},  
    	        {field:'fProductlineNameProductCode',title:'此产品对应的产品线',width:"150px"},
    	        {field:'fPdtNameProductCode',title:'此产品对应的PDT',width:"100px"},
    	        {field:'begintime',title:'编码生效日期',width:"100px"},  
    	        /* {field:'fVersion',title:'对应版本',width:"5%"},  */ 
    	        {field:'fAssignPointName',title:'对应评审点',width:"100px"},  
    	        {field:'fBizhong',title:'运营商比重',width:"80px",formatter:formatPercent${id_suffix}},
    	        {field:'fFbizhong',title:'非运营商比重',width:"80px", formatter:formatPercent${id_suffix}},
    	        {field:'mark',title:'编码状态',width:"100px"},
    	        {field:'updateStatus',title:'mark',width:"50px"}
    	    ]],
    	    height : window.innerHeight - window.innerHeight * 0.3,
			//fitColumns:true,
			singleSelect:true, 
			pagination:true, 
			pageNumber:1, 
			pageSize:20,
			nowrap:false,
            pageList:[20,30,50],
            rownumbers:true,
            onClickRow : function(index, row){
            	
            	$("#dg${id_suffix}").datagrid("unselectAll");
            	$("#dg${id_suffix}").datagrid("selectRow",index);
            	var p = $("#cc${id_suffix }")
                .layout("panel", "east")[0].clientWidth
            //如果宽度为0,展开面板
            if (p == 0) {
                $("#cc${id_suffix }").layout("expand", "east")
            }

            var projProdCode = row.id + "_" +  row.fProductCode;
            //加载属性表格
            $('#pg${id_suffix }').propertygrid({
                url : '/finance/fprojectCode/getPropertyByCode?projProdCode=' +projProdCode,
                showGroup : true,
                scrollbarSize : 0,
                height : window.innerHeight
                    - window.innerHeight
                    * 0.28,
                width : '100%',
                columns :  [[
                    {field:'name',title:'属性名',width:100,sortable:false},
                    {field:'value',title:'属性值',width:100,resizable:false}
                ]]
            });
            	
            	
            	
            },
            onDblClickRow : function(index, row){
            	var title = "项目编码" + row.fProjno;
            	if(row.updateStatus == '1'){
            	$('#mainUrl').tabs(
	                'add',
	                {
	                    title : title,
	                    href : '/finance/fprojectCode/toAddProjectCode?isEdit=false&fProjno=' + row.fProjno + "&productCode=" + row.fProductCode,
	                    closable : true
	                });            		
            	}else{
            		alert("mark为0的不让修改");
            	}
            }
    	});
		
	})

	function doSearch${id_suffix}(){debugger;
		$("#dg${id_suffix}").datagrid("load",{
			searchParams:$("#searchParas${id_suffix}").val(),
			prodLine:$("#prodlineno${id_suffix}").combobox("getValue"),
            pdt:$("#PDTno${id_suffix}").combobox("getValue"),
            state:$("input[id='state${id_suffix}']:checked").val(),
            start:$("#start${id_suffix}").datebox('getValue'),
            end:$("#end${id_suffix}").datebox('getValue')
		  });
	}
	
	/*
	*	导出
	*/	
	function export${id_suffix}(){
    	var search= $("#searchParas${id_suffix}").val();
    	var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
    	var pdt=$("#PDTno${id_suffix}").combobox("getValue");
    	var state= $("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"";
        var start=$("#start${id_suffix}").datebox('getValue');
        var end=$("#end${id_suffix}").datebox('getValue');
		$.post("/finance/fprojectCode/getExportDataCount",
				{searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end},
				function(result){
					if(result.status==200){
						if(result.message!=""){
							$.messager.alert("提示",result.message);
						}else{
							window.location.href="/finance/fprojectCode/exportAll?searchStr="+encodeURIComponent(search)+"&prodLine="+prodLine+"&pdt="+pdt+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end;
						}
					}else{
						$.messager.alert("提示",result.message);
					}
				});
	}

	function export2${id_suffix}(){
		var search= $("#searchParas${id_suffix}").val();
		var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
		var pdt=$("#PDTno${id_suffix}").combobox("getValue");
		var state= $("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"";
		var start=$("#start${id_suffix}").datebox('getValue');
		var end=$("#end${id_suffix}").datebox('getValue');
		$.post("/finance/fprojectCode/getExportDataCount",
				{searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end},
				function(result){
					if(result.status==200){
						if(result.message!=""){
							$.messager.alert("提示",result.message);
						}else{
							window.location.href="/finance/fprojectCode/exportAll2?searchStr="+encodeURIComponent(search)+"&prodLine="+prodLine+"&pdt="+pdt+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end;
						}
					}else{
						$.messager.alert("提示",result.message);
					}
				});
	}
	
	function initCombox${id_suffix}(){
		$("#state${id_suffix }").combobox({
    		valueField : 'id',
    		textField : 'text',
    		panelHeight : 'auto',
    		multiple:true,
    		editable:false,
    		data:[{id:'新增',text:'新增'},{id:'修改',text:'修改'},{id:'停用',text:'停用'}],
    		formatter: function (row) {
    			 var opts = $(this).combobox('options');
    			
    			 return '<input type="checkbox" class="combobox-checkbox"> ' + row[opts.textField]
    		},  
    		onSelect: function (row) {
    			  var opts = $(this).combobox('options');
    			  var el = opts.finder.getEl(this, row[opts.valueField]);
    			  el.find('input.combobox-checkbox')._propAttr('checked', true);
    		},
    		onUnselect: function (row) {
    			   var opts = $(this).combobox('options');
    			   var el = opts.finder.getEl(this, row[opts.valueField]);
    			   el.find('input.combobox-checkbox')._propAttr('checked', false);
    		},
    		onLoadSuccess:function(){
    			$("#state${id_suffix }").combobox("setValues",["0"]);
    		}
    	});
	}

	function stateClick${id_suffix}(){
		//重置产品线，pdt相关
		
		if($("#state${id_suffix}").get(0).checked){
			$.post("/finance/fprojectCode/prodLine/getAllWithCom",function (result) {
	            $("#prodlineno${id_suffix}").combobox("loadData",result);
	            $("#prodlineno${id_suffix}").combobox("setValue","");
	        });
			
			$.post("/finance/fprojectCode/getAllPdt",function (result) {
	            $("#PDTno${id_suffix}").combobox("loadData",result);
	            $("#PDTno${id_suffix}").combobox("setValue","");
	        });
		}else{
			$.post("/finance/fprojectCode/prodLine/getAllWithCom?state=1",function (result) {
	            $("#prodlineno${id_suffix}").combobox("loadData",result);
	            $("#prodlineno${id_suffix}").combobox("setValue","");
	        });
			$.post("/finance/fprojectCode/getAllPdt?state=1" ,function (result) {
		            $("#PDTno${id_suffix}").combobox("loadData",result);
		            $("#PDTno${id_suffix}").combobox("setValue","");
		        });
		}
	}
	function formatPercent${id_suffix}(value,row,index){  
		if (value == "underfined" || value == null || value=='') {
			return "";
		}else{
			return value + "%";			
		}
	} 
</script>
</body>
</html>
