



jQuery.browser={};
	(function(){
		jQuery.browser.msie=false; 
		jQuery.browser.version=0;
		if(navigator.userAgent.match(/MSIE ([0-9]+)./)){ 
			jQuery.browser.msie=true;
			jQuery.browser.version=RegExp.$1;
		}
	})();	
	
	
//R级以下下拉框数据加载
	/*$(function(){
		//获取随机数，防止重复ID
		var tempTime=$("input[name='tempTime']").val();
		
	});*/




