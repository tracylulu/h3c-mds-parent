//tab页签遮罩方法加载
(function () {    
	    $.extend($.fn.tabs.methods, {    
	        // 显示遮罩
	        loading: function (jq, msg) {    
	            return jq.each(function () {    
	                var panel = $(this).tabs("getSelected");    
	                if (msg == undefined) {    
	                    msg = "正在加载数据，请稍候...";    
	                }    
	                $("<div class=\"datagrid-mask\"></div>").css({ display: "block", width: panel.width(), height: panel.height() }).appendTo(panel);    
	                $("<div class=\"datagrid-mask-msg\" style=\"line-height:50%\"></div>").html(msg).appendTo(panel).css({ display: "block", left: (panel.width() - $("div.datagrid-mask-msg", panel).outerWidth()) / 2, top: (panel.height() - $("div.datagrid-mask-msg", panel).outerHeight()) / 2 });    
	            });    
	        }    
	,    
	        // 隐藏遮罩
	        loaded: function (jq) {    
	            return jq.each(function () {    
	                var panel = $(this).tabs("getSelected");    
	                panel.find("div.datagrid-mask-msg").remove();    
	                panel.find("div.datagrid-mask").remove();    
	            });    
	        }    
	    });    
	})(jQuery);

// home主页js
$(function () {
	   $('#mainUrl').tabs({
		   onSelect:function(title,index){
			   if(title=="首页"){
				   $('#span_title').click();
				   // initApproveGrid(0);
				   setTitleCount();
	    		   setMyApplicationCount();
	    		   setHistoryCount();
			   }
		   }
	   })
     /*if("mianLogin" == "${loginType}"){
			$('#mainUrl').tabs('add', {
				title : '${mailInfo.moduleDesc}',
				href : '${mailInfo.url}',
				closable : true
			});
		}*/
     
	   	initApproveGrid(0);
		initCheckMenu();
		setTitleCount();
		setHistoryCount();
		setMyApplicationCount();
		getUserImage()
		// 退出
     $("#loginout").click(function(){
 	   $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {
            if (r) {
         	 // 清楚后台session
		    	window.location.href="/user/logout";
            }
        });
    });
		
	$('#span_title').click(function(){		
		$('#span_title').removeClass("tabUnCheck");
		$('#span_myApp_Title').addClass("tabUnCheck");
		$('#span_HI_Title').addClass("tabUnCheck");
		initApproveGrid(0);
			
	});
	$('#span_myApp_Title').click(function(){		
		$('#span_myApp_Title').removeClass("tabUnCheck");
		$('#span_title').addClass("tabUnCheck");
		$('#span_HI_Title').addClass("tabUnCheck");
		initApproveGrid(1);
	});
	
	$('#span_HI_Title').click(function(){
		$('#span_HI_Title').removeClass("tabUnCheck");
		$('#span_title').addClass("tabUnCheck");
		$('#span_myApp_Title').addClass("tabUnCheck");		
		initApproveGrid(2);
	});

 });
 function linkClick(obj,url) {
 	var title = obj.innerText;
 	if(obj.getElementsByTagName("input")[0]){
 		title= obj.getElementsByTagName("input")[0].value;
	}
 	if ($('#mainUrl').tabs('exists', title)&&title!='产品编码申请'&&title!='项目编码申请') {
	       $('#mainUrl').tabs('select', title);
	     } else {
	       $('#mainUrl').tabs('add', {
	         title : title,
	         href : url,
	         closable : true
	       });
	}
 	
 }
 
 function closes(){
 	$("#Loading").fadeOut("normal",function(){
 		$(this).remove();
 	});
 }
 var pc;
 $.parser.onComplete = function(){
 	if(pc) clearTimeout(pc);
 	pc = setTimeout(closes, 500);
 }
// 关闭当前
function closeThisTab(){		
	var tab = $('#mainUrl').tabs('getSelected');
	var tab1 = tab.panel('options').tab;   
	if($(tab1).text()=="首页"){
		return;
	}
	var index = $('#mainUrl').tabs('getTabIndex', tab);
	$("#mainUrl").tabs("close", index);     
}

// 关闭其他
function closeOther(){
	var tabs=$('#mainUrl').tabs('tabs');
	var tabSelected = $('#mainUrl').tabs('getSelected');
	var _sl_index = $('#mainUrl').tabs('getTabIndex', tabSelected);
	var closeTabIndex=new Array();
	
	$.each(tabs,function(i,item){	
		if(i==0) return true;
		var index = $('#mainUrl').tabs('getTabIndex', item);
		if(index==_sl_index) return true;
		closeTabIndex.push(index);
	});		
	
	for(var k=closeTabIndex.length-1;k>=0;k--){
		$("#mainUrl").tabs("close", closeTabIndex[k]); 
	} 
	
	$('#mainUrl').tabs('select',1)
}

function closeAll(){
	var tabs=$('#mainUrl').tabs('tabs');
	var _length=tabs.length?tabs.length:0;
	
	for(var k=_length-1;k>0;k--){
		$("#mainUrl").tabs("close", k); 
	} 
}

function ShowMenuDialog(){
	$('#win').window({    
	    width:780,    
	    height:400,    
	    modal:true,
	    closed:false
	});  
	initDialogMenuList();
}

function setTitleCount(){
	$.post("/basic/ApproveList/getApproveCount",function(data){
		if(data!=null&&data.toString().indexOf("html")==-1){
			$("#span_title").text("我的待办("+data+")");
		}else{
			location.reload();
		}	
	}).error(function(){
		alert("通信错误");
	});
}

function setMyApplicationCount(){
	$.post("/basic/ApproveList/getMyApplicationCount",function(data){
		if(data!=null&&data.toString().indexOf("html")==-1){
			$("#span_myApp_Title").text("我的申请("+data+")");
		}else{
			location.reload();
		}
	});
}

function setHistoryCount(){
	$.post("/basic/ApproveList/getHistoryCount",function(data){
		if(data!=null&&data.toString().indexOf("html")==-1){
			$("#span_HI_Title").text("我的已办("+data+")");
		}else{
			location.reload();
		}	
	}).error(function(){
		alert("通信错误");
	});
}

function refreshGrid(){
	$("#tbl_List").datagrid('load',{
		type: '1'
	});
	// setTitleCount();
	// setMyApplicationCount();
}

function initApproveGrid(type){
	var url='';
	if(type==0){
		url='/basic/ApproveList/getList';
	}else if(type==1){
		url='/basic/ApproveList/getMyApplicationList';
	}else{
		url='/basic/ApproveList/getHistoryList';
	}
	
	$('#tbl_List').datagrid({    
	    url:url,   
	    fitColumns:true,
	    width:$(window).height*0.4,
	    pagination:false,
	    striped:true,
	    singleSelect:true,
	    fit:true,
	    method:'post',
	    width:'50%',
	    // collapsible:true,
	    // queryParams:{type:'0'},
	    columns:[[    
	    	{field:'rownum',title:'序号类型',hidden:true}, 
	    	{field:'applyid',title:'流程类型',hidden:true}, 
	    	{field:'id',title:'流程类型',hidden:true}, 	    	    
	        {field:'applytype',title:'流程类型',width:100}, 
	        {field:'code',title:'申请单号',width:100},    	    
	        {field:'responsible',title:'当前责任人',width:100,hidden:(type==0?true:false)}, 
	        {field:'statusname',title:'流程状态',width:100},    
	        {field:'createDate',title:'申请时间',width:100,formatter:function(value,row,index) {  
			    if (value == null || value == '') {  
			        return '';  
			    }  
			    var date = new Date(value);
			    Y = date.getFullYear() + '-';
			    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
			    D = (date.getDate()<10?'0'+date.getDate():date.getDate())  + ' ';
			    h = (date.getHours()<10?'0'+date.getHours():date.getHours()) + ':';
			    m = (date.getMinutes()<10?'0'+date.getMinutes():date.getMinutes()) + ':';
			    s = (date.getSeconds()<10?'0'+date.getSeconds():date.getSeconds()); 
			   
			    return Y+M+D;
	        }},    
	        {field:'createUser',title:'申请人',width:100,hidden:(type==1?true:false)},
	        {field:'optType',title:'类型',width:100,formatter:function(value,row,index){

	        	if(value==null||value==''||value.indexOf(',')==-1){
	        		return value;
	        	}else{	        		
	        		var str=value.replace(',,',',')
	        		if(str.substr(0,1)==','){
	        			str= str.substr(1,str.length)
	        		}
	        		
	        		if(str.substr(str.length-1,1)==','){
	        			str= str.substr(0,str.length-1);
	        		}
	        		return str.replace(',','&');
	        	}
	        }}    
	    ]],
		onDblClickRow : function(index,rowData) {
			if(rowData!=null&& rowData.id!=null&&rowData.id!=undefined){
				 if(rowData.applytype.indexOf('产品R级以下')!=-1){
					 $('#mainUrl').tabs('add',{
							title : '修改产品R级以下基本信息',
							href : '/basicinfo/prBelowApply/edit/'+rowData.id,
							closable : true
					}); 
				 	
				 }else if(rowData.applytype.indexOf('产品V-R信息')!=-1){
					 $('#mainUrl').tabs('add',{
							title : "修改V级/R级基本信息",
							href : '/basicinfo/VRApply/edit/'+rowData.id,
							closable : true
					 }); 
				 }else if(rowData.applytype.indexOf('产品信息')!=-1){
					 $('#mainUrl').tabs('add',{
							title : "修改产品信息",
							href : '/basicinfo/productApply/edit/'+rowData.id,
							closable : true
					  }); 
				 }else if(rowData.applytype.indexOf('难度系数')!=-1){
					 $('#mainUrl').tabs('add',{
							title : "修改难度系数",
							href : '/basicinfo/DifficultyCoefficient/edit/'+rowData.id,
							closable : true
					 }); 
				 }else if(rowData.applytype.indexOf('人员信息修改')!=-1){
					 $('#mainUrl').tabs('add',{
						 title : "修改人员信息修改申请",
						 href : '/basicinfo/peopleApply/edit/'+rowData.id,
						 closable : true
					 }); 
				 }
				 else if(rowData.applytype.indexOf('项目编码')!=-1){
					 $('#mainUrl').tabs('add',{
						 title : "项目编码申请",
						 href : '/projectWebFlow/edit?applyNo='+rowData.code,
						 closable : true
					 }); 
				 }else if(rowData.applytype.indexOf('产品编码')!=-1){
					 $('#mainUrl').tabs('add',{
		                 title : "产品编码申请",
		                 href : '/flowable/productCodeApply/edit/'+rowData.id,
		                 closable : true
		              });
				 }
				 else if(rowData.applytype.indexOf('Part编码')!=-1){
					 $('#mainUrl').tabs('add',{
		                 title : "Part编码申请",
		                 href : '/flowable/partCodeProcess/edit/'+rowData.id,
		                 closable : true
		             });
				 }
				 else{
					 $.messager.alert("","流程有问题,请联系管理员！！！","info");
				 }
			}
		
		},	
		rowStyler:function(index,row){
			if(index % 2 != 0){
               // return 'background-color:#fafafa;';
            }
		},
		onLoadSuccess:function(data){
			/* $("#span_title").text("我的待办("+data.total+")"); */
		}
	});  
}		
	
function initCheckMenu(){
	var icon=["glyphicon-book","glyphicon-inbox","glyphicon-th-large","glyphicon-tasks","glyphicon-briefcase",
		"glyphicon-credit-card"," glyphicon-tower","glyphicon-sound-dolby","glyphicon-cloud-upload","glyphicon-share",
		"glyphicon-road","glyphicon-list-alt","glyphicon-tags","glyphicon-modal-window","glyphicon-oil","glyphicon-ice-lolly"]
	$("#ul_Menu_Query").children().remove();
	$("#ul_Menu_Add").children().remove();
	
	$.post("/resource/getCheckedResource",function(data){
		if(data!=null){
			$.each(data,function(i,item){
				var _icon=i>=icon.length?icon[9]:icon[i];
				var _html="<li class='iconplanlist-item'><a href='#' title='"+item.hresName+"' onclick=\"openTab('"+item.hresName+"','"+item.hresContent+"')\"  class='menhu'>"
        				+"<div class='li-lt'><i title='"+item.hresName+"' class='glyphicon "+_icon+"  '></i></div>"
        				+"<div class='li-txt'>"+item.hresName+"</div></a>"
        				+"</li>";
        			
        		if(item.hresType=="Query"){
        			$("#ul_Menu_Query").append(_html);
        		}else{
        			$("#ul_Menu_Add").append(_html);
        		}             		
			});
		}
	});
}

function openTab(name,url){
	if ($('#mainUrl'). tabs('exists', name)) {
	       $('#mainUrl').tabs('select', name);
	     } else {
	    	 $('#mainUrl').tabs('add',{
				 title : name,
				 href : url,
				 closable : true
			 }); 
	     }		
}

function initDialogMenuList(){			
	$("#div_dialog_Query").children().remove();
	$("#div_dialog_Add").children().remove();
	
	$.post("/resource/getResourceList",function(data){
		if(data!=null){
			$.each(data,function(i,item){						
				var _html="<div class='addapp-item'><input type='checkbox' id='input_"+i+"' value='"+item.hresCode+"' "+(item.remark=="check"?"checked":"")+">"
					+"<label for='input_"+i+"'><span class='name' title='"+item.hresName+"'>"+item.hresName+"</span></label></input></div>";
				if(item.hresType=="Query"){
					$("#div_dialog_Query").append(_html);
						
				}else{
					$("#div_dialog_Add").append(_html);
				}                		
			});
			bindSetCheckboxMaxNum();
		}
	});
}

function bindSetCheckboxMaxNum(){
	$("#div_dialog_Query").children().find("[type='checkbox']").click(function(){			
		if(!$(this).is("checked")&&$("#div_dialog_Query").children().find("[type='checkbox']:checked").length>10){
			$.messager.alert("提示","您已经勾选了查询类最大应用数目，请先勾除已选应用在勾选新应用");
			$(this).prop("checked",false);
		}
	})
}

function setUserMenu(){
	var _radio=$("#div_Dialog_Content").children().find("[type='checkbox']:checked");
	var _code="";
	$.each(_radio,function(i,item){
		if(_code==""){
			_code+=$(item).val();
		}else{
			_code+=","+$(item).val();
		}				
	});
	
	$.post("/resource/setUserResource",{code:_code},function(data){
		if(data.status==200){
			initCheckMenu();
			$.messager.alert("提示","设置成功");
			$('#win').window("close");
		}
	}); 			
}

function getUserImage(){
	var time=new Date().getTime();
	$.get("/user/getUserImageBase64?time="+time,function(result){
		if(result!=null&&result!=''&&result.indexOf('管理员')==-1){
			$("#img_user").attr("src","data:image/png;base64,"+result);
		}		
	});
}

/*function copyLink(win_url,win_name,id,title){
	title=title==undefined||title==''?'单据链接':title;
	
	if(id==undefined||id==null||id==""){
		$.messager.alert("提示","提交或保存草稿后才能复制链接！");
		return
	}
	
	$("#div_copyLink").children().remove();
	$('#copyLink').window({    
	    width:300,    
	    height:200,
	    modal:true,
	    closed:false,
	    
	});
	
	
	var url= window.location.href;
	// 匹配 http://localhost:8080 域名+端口号
	var arr=url.match(/http:\/\/[-A-Za-z0-9+&@#/%=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]\//);
	debugger
	if(win_url.indexOf("?")>0){
		win_url=win_url.replace("?","**");
	}
	// encodeURI
	var copy_URL=arr[0]+'copyLink?param='+encodeURI(win_url+'|'+win_name);	
	
	var _html="<input type='button' onclick='copyUrl();' value='复制' style='background-color:#3498DB;margin: 4px 5px;padding: 5px 10px;color:white;height:30px;float:left'><br/><br/><a id='home_CopyUrl' href='"+copy_URL+"'  target='_blank' >"+title+"</a><br/><br/><span style='color:red;height:30px;' id='msgId'></span>"
	// $("#div_copyLink").text(copy_URL);
	$("#div_copyLink").append(_html);
	$("#div_copyLink a").select();
	 document.getElementByld("home_CopyUrl").select(); 
	
	 * var msg=document.execCommand('Copy'); alert(msg); if(msg){
	 * $.messager.alert("123","123"); }
	 
}

function copyUrl(){
	  var inputw = $("#div_copyLink a").attr("href");
	  const input = document.createElement('input')
      document.body.appendChild(input)
      input.setAttribute('value',inputw)
      input.select()
      if (document.execCommand('copy')) {
        document.execCommand('copy');
        $("#msgId").text('复制成功');
      } else {
    	  $("#msgId").text('复制失败');
      }
	  document.body.removeChild(input)
}*/
//复制链接  改为手动复制
function copyLink(win_url,win_name,id,title){
	title=title==undefined||title==''?'单据链接':title;
	
	if(id==undefined||id==null||id==""){
		$.messager.alert("提示","提交或保存草稿后才能复制链接！");
		return
	}	
	var url= window.location.href;
	// 匹配 http://localhost:8080 域名+端口号
	var arr=url.match(/http:\/\/[-A-Za-z0-9+&@#/%=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]\//);
	if(win_url.indexOf("?")>0){
		win_url=win_url.replace("?","**");
	}
	// encodeURI
	var copy_URL=arr[0]+'copyLink?param='+encodeURI(win_url+'|'+win_name);	
	var _html="<a id='home_CopyUrl' href='"+copy_URL+"'  target='_blank' >"+title+"</a>"
	
	 var CopyDiv = "";
    var WinTitleStr = "";
   
        CopyDiv = "<div id='dCopyLink' ><a href='" + copy_URL + "'   target='_blank'  onclick='return false;' >" + title+ "</a></div>";
        WinTitleStr = "复制链接操作提示：ctrl+A全选，再ctrl+C即可复制(或鼠标拖拽全选复制)";
  
    $("#dCopyLink").remove();
    $("body").append(CopyDiv);	
	 var boarddiv = '<div id="msgwindow" style="overflow:hidden;" title="'+title+'"><a id="home_CopyUrl" href="'+copy_URL+'"  target="_blank" >'+title+'sddddddddddd</a></div>"';

	    var iframe = document.createElement("iframe");
	    iframe.src = "/common/js/copyUrl.html";
	    iframe.width="500px";
	    iframe.height="300px";
	    iframe.scrolling="no";
	   
	    $(document.body).append(boarddiv);
	    var win = $('#msgwindow').dialog({
	        content: iframe,
	        width: 500,
	        height: 300,
	        scrolling:'no',
	        modal: true,
	        title:WinTitleStr,
	        onClose: function () {
	            $(this).dialog('destroy');//后面可以关闭后的事件 
	        }
	    });
	   
	    win.dialog('open');
	    
	    iframe.onload = iframe.onreadystatechange = function() {
	         if (this.readyState && this.readyState != 'complete') return;
	         else {
	    $(this).contents().find("body").find('[id="dCopyDiv"]').html(CopyDiv);
	         }
	    } 
	  
}


function refreshCurrentTab(){
	$('#span_title').click();
	setTitleCount();
	setMyApplicationCount();
	
	var tab = $('#mainUrl').tabs('getSelected');
    var url = $(tab.panel('options')).attr('href');
    tab.panel('refresh', url);
}



function showHelp(){

	var url="基础数据平台帮助手册.docx";
	window.open("/product/download?fileUrl="+url);	
}











