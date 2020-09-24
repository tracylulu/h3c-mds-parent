


function successPostSave(message){
	
}

function successCheck(result){
	if (result.status == 200) {
    	if(window.location.href.indexOf('eipLogin') > -1){
    		var data = {};
        	data.Code = 11;
        	data.Msg = "审批成功";
        	PM.send(top.window.parent, "fromSource", data); 
        }else{
        	$("#mainUrl").tabs("loaded");
        	//$.messager.alert("提示","审核成功");
        	var tab = $('#mainUrl').tabs('getSelected');
			var index = $('#mainUrl').tabs('getTabIndex', tab);
			$("#mainUrl").tabs("close", index);
        }                        	
    }else{
    	if(window.location.href.indexOf('eipLogin') > -1){
    		var data = {};
       	 	data.Code = 0;
       	 	data.Msg = "审批失败";
          	PM.send(top.window.parent, "fromSource", data); 
        }else{
        	$("#mainUrl").tabs("loaded");
        	$.messager.alert("提示","审核失败");
        }
    }    
}

function successChangePerson(result){
	if(result.status == 200){
		if(window.location.href.indexOf('eipLogin') > -1){
			var data = {};
        	data.Code = 11;
        	data.Msg = "审批成功";        	
        	PM.send(top.window.parent, "fromSource", data); 
		}else{
			$("#mainUrl").tabs("loaded");
	    	//$.messager.alert("提示","修改当前处理人成功");               
	        var tab = $('#mainUrl').tabs('getSelected');
			var index = $('#mainUrl').tabs('getTabIndex', tab);
			$("#mainUrl").tabs("close", index);
		}    	
    }else{
    	if(window.location.href.indexOf('eipLogin') > -1){
    		var data = {};
       	 	data.Code = 0;
       	 	data.Msg = "审批失败";
          	PM.send(top.window.parent, "fromSource", data);
		}else{
			$("#mainUrl").tabs("loaded");
			$.messager.alert("提示",result.message);
		}
    }  
}

function errorCheck(message){
	if(window.location.href.indexOf('eipLogin') > -1){		
		var data = {};
   	 	data.Code = 0;
   	 	data.Msg = "审批失败";
      	PM.send(top.window.parent, "fromSource", data);
	}else{
		$("#mainUrl").tabs("loaded");
        $.messager.alert("提示","审核失败");
	}
}

function setTabFlodOrOpen(id,isOpen){
	if(isOpen){
		$("#"+id).css( "background" ,"url(../easyui/img/ns-expand.gif) no-repeat 0px center");		 
	}else{
		$("#"+id).css( "background" ,"url(../easyui/img/ns-collapse.gif) no-repeat 0px center");
	}
    
}