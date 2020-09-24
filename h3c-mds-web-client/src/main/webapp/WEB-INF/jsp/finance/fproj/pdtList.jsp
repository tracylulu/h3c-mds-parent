<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>项目编码列表 按产品线，PDT查询</title>
    <%
		Boolean isShow=(Boolean)request.getAttribute("isShow");
	%>
</head>
		
<body>
		<div id="index${id_suffix }">
        <div class="index-4" style="margin: 0 20px;">
        	产品线
			<input class="easyui-combobox" id="prodlineno${id_suffix}" data-options="valueField: 'prodlineno', textField: 'prodline',  
								url: '/finance/fprojectCode/prodLine/getAllWithCom?state=1'" />
			PDT
			<input class="easyui-combobox" id="PDTno${id_suffix}" data-options="valueField: 'pdtno', textField: 'pdt',  
								url: '/finance/fprojectCode/getAllPdt?state=1'" />
			<%-- 使用状态
			<input id="state${id_suffix}" class="easyui-combobox" name="state" data-options="multiple:true" /> --%>
			生效时间
			<input id="start${id_suffix}" type="text" class="easyui-datebox" />
			~
			<input id="end${id_suffix}" type="text" class="easyui-datebox" />
			
			&nbsp&nbsp
			停用
			<input id="state${id_suffix}" type="checkbox" name="state" value="0"  onclick="stateClick${id_suffix}()">
            <input id="searchStr${id_suffix}"
                   class="easyui-textbox" type="text" prompt="请输入搜索内容"
                   style="width: 65%;" /> &nbsp; <a href="javascript:void(0)"
                                                    class="easyui-linkbutton" onclick="doSearch${id_suffix}();">搜 索 </a>&nbsp;
            <!--左右布局 easyui-layout-->
            <div id="cc${id_suffix }" class="easyui-layout"
                 style="width: 100%; height: 'auto';">
                <!--左布局  center-->
                <!--***title需要更改 ***-->
                <div data-options="region:'center'"
                     style="width:100%; height: 100%;">


                    <!--左侧树形表格-->
                    <div class="index-1">
                        <table id="ttPdt${id_suffix }" style="">
                           
                        </table>
                    </div>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                </div>
                <!--右布局  east-->
                <%-- <div
                        data-options="region:'east',split:true,title:'属性',collapsible:true,collapsed:true"
                        style="width: 20%;" id="east">
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
		
		
		initGrid();
		
	})

	function initGrid(){
	
		//设定布局高度
        $("#cc${id_suffix }").layout({
            height : window.innerHeight - window.innerHeight * 0.231
        });
		
		$("#ttPdt${id_suffix }").treegrid({
            title:"按产品线、PDT查询",
            url: "/finance/fprojectCode/listOfProjectCodeByPdt",
            method : 'get',
            idField : 'id',
			treeField : 'fProductlineName',
			striped:true, 
			nowrap:false,
			//width: '1900px',
			height : window.innerHeight - window.innerHeight * 0.35,
			//fitColumns:true,
            toolbar : [ <%-- <% if(isShow==true) { %>
                        {
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
            },'-',
            <%} %> --%>
            {
                id : 'add',
                text : '全部折叠',
                iconCls : 'tabs-icon fa fa-minus-square',
                handler : function() {
                    $("#ttPdt${id_suffix }").treegrid("collapseAll");
                }
            },"-",
            {
                id : 'reload${id_suffix }',
                text : '刷新',
                iconCls : 'tabs-icon fa fa-refresh',
                handler : function() {

                   
                    $("#ttPdt${id_suffix }").treegrid("reload");
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
                    id : 'export${id_suffix }',
                    text : '导出(不含服务产品)',
                    iconCls : 'tabs-icon fa fa-download',
                    handler : function() {
                        doSearch${id_suffix}();
                        export2${id_suffix}();
                    }
                }],
            columns: [[
				{field:'id',title:'',hidden:true},
				{field:'tmpId',title:'',hidden:true},
    	        {field:'fProductlineName',title:'所属产品线/PDT',width:"250px", formatter:formatProgress${id_suffix}},  
    	        /* {field:'fPdtName',title:'所属PDT',width:"6%"},  */ 
                {field:'fProjno',title:'项目编码',width:"6%"},    
    	        {field:'fProjname',title:'项目名称',width:"10%"},    
    	       /*  {field:'fProjcode',title:'项目代号',width:"6%"}, */
    	        {field:'fObjcaName',title:'项目类别',width:"4%"}, 
    	        {field:'fProductCode',title:'服务的产品编码',width:"6%"},  
    	        {field:'productNameCn',title:'服务的产品名称',width:"6%"},  
    	        {field:'rate',title:'此产品分摊比例',width:"90px",formatter:formatPercent${id_suffix}},
    	        {field:'fProductlineNameProductCode',title:'此产品对应的产品线',width:"8%"},
    	        {field:'fPdtNameProductCode',title:'此产品对应的PDT',width:"8%"},
    	        {field:'begintime',title:'编码生效日期',width:"6%"},  
    	        /* {field:'fVersion',title:'对应版本',width:"6%"},  */ 
    	        {field:'fProjMng',title:'项目经理',width:"6%"},  
    	        /* {field:'fAssignPointName',title:'对应评审点',width:"7%"}, */  
    	       {field:'fBizhong',title:'运营商比重',width:"80px",formatter:formatPercent${id_suffix}},
    	       {field:'fFbizhong',title:'非运营商比重',width:"80px", formatter:formatPercent${id_suffix}},
            ]],
            onBeforeExpand : function(row) {//异步架加载树
				//row.plipmtno = row.plipmtno.substr(row.plipmtno.lastIndexOf('_') + 1);
				var url = "/finance/fprojectCode/listOfProjectCodeByPdt";
				$("#ttPdt${id_suffix }").treegrid("options").url = url;
				return true;
			},
			onClickRow : function(rowData) { //单击事件
                //取消选中其他行
                $("#tg${id_suffix }").treegrid("unselectAll");
                //选中点击行
                $("#tg${id_suffix }").treegrid("select",
                    rowData.id);

                if(true){
                    //获取布局右侧面板的宽度
                    var p = $("#cc${id_suffix }")
                        .layout("panel", "east")[0].clientWidth
                    //如果宽度为0,展开面板
                    if (p == 0) {
                        $("#cc${id_suffix }").layout("expand", "east")
                    }

                   
                    //加载属性表格
                    $('#pg${id_suffix }').propertygrid({
                        url : '/finance/fprojectCode/getPropertyByCode?projProdCode=' +rowData.tmpId,
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
                }else {
                    $("#cc${id_suffix }").layout("collapse", "east");
                    $('#pg${id_suffix }').propertygrid('loadData', {
                        rows : []
                    });
                }

            },
            onDblClickRow : function(row){
            	var title = "项目编码" + row.fProjno;
            	$.ajax({
                    url:"/finance/fprojectCode/checkAuto",
                    type:"get",
                    dataType:"json",
                    success:function(data){
                         if(data.data){
                        	 $('#mainUrl').tabs(
                 	                'add',
                 	                {
                 	                    title : title,
                 	                    href : '/finance/fprojectCode/toAddProjectCode?isEdit=false&fProjno=' + row.fProjno + "&productCode=" + row.fProductCode,
                 	                    closable : true
                 	                });
                         }
                    },
                    error :function(data){
                    	
                    }
                });
            	
            }
        });
	}
	
	
	
	function doSearch${id_suffix}(){
		$("#ttPdt${id_suffix }").treegrid("load",{
			searchParams:$("#searchStr${id_suffix}").textbox("getValue"),
			prodLine:$("#prodlineno${id_suffix}").combobox("getValue"),
            pdt:$("#PDTno${id_suffix}").combobox("getValue"),
            state:$("input[id='state${id_suffix}']:checked").val(),
            start:$("#start${id_suffix}").datebox('getValue'),
            end:$("#end${id_suffix}").datebox('getValue')
		  });
	}

	//格式化以及自动换行
	function formatProgress${id_suffix}(value,rowData,rowIndex) {
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
			return '<div style="width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;margin:2px;">'
					+ value + '</div>';
		}
	}
	
	/*
	*	导出
	*/	
	function export${id_suffix}(){		
    	var search= $("#searchStr${id_suffix}").val();
    	var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
    	var pdt=$("#PDTno${id_suffix}").combobox("getValue");
    	var state=$("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"";
        var start=$("#start${id_suffix}").datebox('getValue');
        var end=$("#end${id_suffix}").datebox('getValue');
        $.post("/finance/fprojectCode/getExportDataCount",
        		{searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end},
    			function(result){
    		if(result.status==200){
    			if(result.message!=""){
    				 $.messager.alert("提示",result.message);
    			}else{
    			window.location.href="/finance/fprojectCode/export?searchStr="+encodeURIComponent(search)+"&prodLine="+prodLine+"&pdt="+pdt+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end;
    			}
    		}
    	}); 
    	
	}

    function export2${id_suffix}(){
        var search= $("#searchStr${id_suffix}").val();
        var prodLine=$("#prodlineno${id_suffix}").combobox("getValue");
        var pdt=$("#PDTno${id_suffix}").combobox("getValue");
        var state=$("#state${id_suffix}:checked").val()?$("#state${id_suffix}:checked").val():"";
        var start=$("#start${id_suffix}").datebox('getValue');
        var end=$("#end${id_suffix}").datebox('getValue');
        $.post("/finance/fprojectCode/getExportDataCount",
            {searchStr:search,prodLine:prodLine,pdt:pdt,state:state,start:start,end:end},
            function(result){
                if(result.status==200){
                    if(result.message!=""){
                        $.messager.alert("提示",result.message);
                    }else{
                        window.location.href="/finance/fprojectCode/export2?searchStr="+encodeURIComponent(search)+"&prodLine="+prodLine+"&pdt="+pdt+"&state="+encodeURIComponent(state)+"&start="+start+"&end="+end;
                    }
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
    			$("#state${id_suffix }").combobox("setValues",["新增","修改"]);
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
