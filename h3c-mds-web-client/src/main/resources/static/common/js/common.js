/*
 * 在调用 jquery 插件时，出现$.browser 报错，原来是jQuery 从 1.9 版开始，移除了 $.browser 和 $.browser.version 等属性，

	取而代之的是 $.support 。添加以下代码
 * */
/*(function(jQuery){   
		  
		if(jQuery.browser) return;   
		  
		jQuery.browser = {};   
		jQuery.browser.mozilla = false;   
		jQuery.browser.webkit = false;   
		jQuery.browser.opera = false;   
		jQuery.browser.msie = false;   
		  
		var nAgt = navigator.userAgent;   
		jQuery.browser.name = navigator.appName;   
		jQuery.browser.fullVersion = ''+parseFloat(navigator.appVersion);   
		jQuery.browser.majorVersion = parseInt(navigator.appVersion,10);   
		var nameOffset,verOffset,ix;   
		  
		// In Opera, the true version is after "Opera" or after "Version"   
		if ((verOffset=nAgt.indexOf("Opera"))!=-1) {   
		jQuery.browser.opera = true;   
		jQuery.browser.name = "Opera";   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+6);   
		if ((verOffset=nAgt.indexOf("Version"))!=-1)   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+8);   
		}   
		// In MSIE, the true version is after "MSIE" in userAgent   
		else if ((verOffset=nAgt.indexOf("MSIE"))!=-1) {   
		jQuery.browser.msie = true;   
		jQuery.browser.name = "Microsoft Internet Explorer";   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+5);   
		}   
		// In Chrome, the true version is after "Chrome"   
		else if ((verOffset=nAgt.indexOf("Chrome"))!=-1) {   
		jQuery.browser.webkit = true;   
		jQuery.browser.name = "Chrome";   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+7);   
		}   
		// In Safari, the true version is after "Safari" or after "Version"   
		else if ((verOffset=nAgt.indexOf("Safari"))!=-1) {   
		jQuery.browser.webkit = true;   
		jQuery.browser.name = "Safari";   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+7);   
		if ((verOffset=nAgt.indexOf("Version"))!=-1)   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+8);   
		}   
		// In Firefox, the true version is after "Firefox"   
		else if ((verOffset=nAgt.indexOf("Firefox"))!=-1) {   
		jQuery.browser.mozilla = true;   
		jQuery.browser.name = "Firefox";   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+8);   
		}   
		// In most other browsers, "name/version" is at the end of userAgent   
		else if ( (nameOffset=nAgt.lastIndexOf(' ')+1) <   
		(verOffset=nAgt.lastIndexOf('/')) )   
		{   
		jQuery.browser.name = nAgt.substring(nameOffset,verOffset);   
		jQuery.browser.fullVersion = nAgt.substring(verOffset+1);   
		if (jQuery.browser.name.toLowerCase()==jQuery.browser.name.toUpperCase()) {   
		jQuery.browser.name = navigator.appName;   
		}   
		}   
		// trim the fullVersion string at semicolon/space if present   
		if ((ix=jQuery.browser.fullVersion.indexOf(";"))!=-1)   
		jQuery.browser.fullVersion=jQuery.browser.fullVersion.substring(0,ix);   
		if ((ix=jQuery.browser.fullVersion.indexOf(" "))!=-1)   
		jQuery.browser.fullVersion=jQuery.browser.fullVersion.substring(0,ix);   
		  
		jQuery.browser.majorVersion = parseInt(''+jQuery.browser.fullVersion,10);   
		if (isNaN(jQuery.browser.majorVersion)) {   
		jQuery.browser.fullVersion = ''+parseFloat(navigator.appVersion);   
		jQuery.browser.majorVersion = parseInt(navigator.appVersion,10);   
		}   
		jQuery.browser.version = jQuery.browser.majorVersion;   
})(jQuery);
*/


jQuery.browser={};
	(function(){
		jQuery.browser.msie=false; 
		jQuery.browser.version=0;
		if(navigator.userAgent.match(/MSIE ([0-9]+)./)){ 
			jQuery.browser.msie=true;
			jQuery.browser.version=RegExp.$1;
		}
	})();	

$(function () {
//	alert(2);
	
	
	/*$('.auto_selusers_true').autocomplete('/product/userlink/list?userCode=liucaixuan', {
		max : 12, //列表里的条目数
		minChars : 3, //自动完成激活之前填入的最小字符
		width : '270', //提示的宽度，溢出隐藏
		scrollHeight : 300, //提示的高度，溢出显示滚动条
		matchContains : false, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
		autoFill : false, //自动填充
		parse : function(data) {
			return $.map(eval(data), function(row) {
				return {
					data : row,
					value : row.uda_10_509+' '+row.code,
					result :row.uda_10_509+' '+row.code
				}
			}); //对ajax页面传过来的数据进行json转码
		},
		formatItem : function(row, i, max) {
			document.getElementById('cmoid').value = "";
			return row.code + ':"' + row.name + '"[' + row.code + ']';
		}

	});*/
	
	
    /*$("input .auto_selusers_true").each(function () {
    	alert(1);
        var fdName = $(this).attr("name");
        var className = "auto_selusers";
        var multiple = $(this).hasClass(className + "_true");
        var hasData = $(this).hasClass(className + "_" + multiple);
        if (!hasData) {
            className = "auto_seluser";
            multiple = $(this).hasClass(className + "_true");
            initH3cSeluser(fdName, multiple);
        } else {
            initH3cSelusergroup(fdName, multiple);
        }
    });*/
   // 多个人员联想  为解决多个页面同时打开，联想数据重复  对象页面
	/* $(".linkeytable .auto_selusers_true").autocomplete("/product/userlink/list?userCode=liucaixuan", {
		    multiple: true,
		  	max : 20, //列表里的条目数
			minChars : 2, //自动完成激活之前填入的最小字符
			width : "400px", //提示的宽度，溢出隐藏
			scrollHeight : 400, //提示的高度，溢出显示滚动条
			matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			autoFill : false, //自动填充
			mustMatch: true,
			multipleSeparator:",",
			parse : function(data) {
				return $.map(eval(data), function(row) {
					return {
						data : row,
						value : row.groupname,
						result :row.groupname
					}
				}); //对ajax页面传过来的数据进行json转码
			},
			formatItem : function(row, i, max) {
				//document.getElementById('cmoid').value = "";
				return row.groupname + ' | ' + row.deptname;
			}
	    }).result(function(event, row, formatted) {
	    	$(this).unautocomplete();
	    	 $(".linkeytable .auto_selusers_true").autocomplete();
	    });*/
	 
	
	 //单个人员联想
	 $(".auto_selusers_false").autocomplete("/product/userlink/list?userCode=liucaixuan", {
		    multiple: false,
		  	max : 20, //列表里的条目数
			minChars : 2, //自动完成激活之前填入的最小字符
			width : '400px', //提示的宽度，溢出隐藏
			scrollHeight : 300, //提示的高度，溢出显示滚动条
			matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			autoFill : false, //自动填充
			mustMatch: true,
			parse : function(data) {
				return $.map(eval(data), function(row) {
					return {
						data : row,
						value : row.groupname,
						result :row.groupname
					}
				}); //对ajax页面传过来的数据进行json转码
			},
			formatItem : function(row, i, max) {
				//document.getElementById('cmoid').value = "";
				return row.groupname + ' | ' + row.deptname ;
			}
	    });
	 
	 
	// 多个群组联想
	 $(".auto_selgroups_true").autocomplete("/product/grouplink/list?groupCode=#ISR-PDL-H3C-ISR-SP", {
		    multiple: true,
		  	max : 20, //列表里的条目数
			minChars : 2, //自动完成激活之前填入的最小字符
			width : '400px', //提示的宽度，溢出隐藏
			scrollHeight : 300, //提示的高度，溢出显示滚动条
			matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			mustMatch: true,
			autoFill : false, //自动填充
			multipleSeparator:",",
			parse : function(data) {
				return $.map(eval(data), function(row) {
					return {
						data : row,
						value : row.groupname,
						result :row.groupname
					}
				}); //对ajax页面传过来的数据进行json转码
			},
			formatItem : function(row, i, max) {
				//document.getElementById('cmoid').value = "";
				return row.groupname ;
			}
	    });
	 
	 //单个群组联想 
	 $(".auto_selgroups_false").autocomplete("/product/grouplink/list?groupCode=#ISR-PDL-H3C-ISR-SP", {
		    multiple: false,
		  	max : 20, //列表里的条目数
			minChars : 2, //自动完成激活之前填入的最小字符
			width : '400px', //提示的宽度，溢出隐藏
			scrollHeight : 300, //提示的高度，溢出显示滚动条
			matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			mustMatch: true,
			autoFill : false, //自动填充
			parse : function(data) {
				return $.map(eval(data), function(row) {
					return {
						data : row,
						value : row.groupname,
						result :row.groupname
					}
				}); //对ajax页面传过来的数据进行json转码
			},
			formatItem : function(row, i, max) {
				//document.getElementById('cmoid').value = "";
				return row.groupname ;
			}
	    });
	 
	 //查询多个群组 人员
	 $(".auto_selGroupUsers_true").autocomplete("/product/usergrouplink/list?userCode=liucaixuan", {
		    multiple: true,
		  	max : 20, //列表里的条目数
			minChars : 2, //自动完成激活之前填入的最小字符
			width : "400px", //提示的宽度，溢出隐藏
			scrollHeight : 400, //提示的高度，溢出显示滚动条
			matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			autoFill : false, //自动填充
			mustMatch: true,
			multipleSeparator:",",
			parse : function(data) {
				return $.map(eval(data), function(row) {
					return {
						data : row,
						value : row.groupname,
						result :row.groupname
					}
				}); //对ajax页面传过来的数据进行json转码
			},
			formatItem : function(row, i, max) {
				//document.getElementById('cmoid').value = "";
				return row.groupname + ' | ' + row.deptname;
			}
	    });
	 
	 //单个群组人员联想
	 $(".auto_selGroupUsers_false").autocomplete("/product/usergrouplink/list?userCode=liucaixuan", {
		    multiple: false,
		  	max : 20, //列表里的条目数
			minChars : 2, //自动完成激活之前填入的最小字符
			width : '400px', //提示的宽度，溢出隐藏
			scrollHeight : 300, //提示的高度，溢出显示滚动条
			matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			autoFill : false, //自动填充
			mustMatch: true,
			parse : function(data) {
				return $.map(eval(data), function(row) {
					return {
						data : row,
						value : row.groupname,
						result :row.groupname
					}
				}); //对ajax页面传过来的数据进行json转码
			},
			formatItem : function(row, i, max) {
				return row.groupname + ' | ' + row.deptname ;
			}
	    });
	 
	 
	/* function initH3cSeluser(fdName, multiple) {
		    $("#" + fdName).autocomplete("/product/userlink/list?userCode=liucaixuan", {
		        multiple: multiple,
		        multipleSeparator: ',',
		        max: 20,
		        mustMatch: true,
		        matchContains: true,
		        width: 350,
		        formatItem: function (row) {
		            if (row.FLAG == '1') {
		                return row.uda10509 + " | " + row.code;
		            } else {
		                return row.uda10509
		            }
		        },
		        formatResult: function (row) {
		            return row.uda10509;
		        }
		    }).result(function (event, data, formatted) {
		        //看是否有回调函数，如果有就调用
		        var callback = $("#" + fdName).attr("callback");
		        if (callback != undefined && callback != "") {
		            eval(callback);
		        }
		    });
		}

		function initH3cSelusergroup(fdName, multiple) {
		    $("#" + fdName).autocomplete("/product/userlink/list?userCode=liucaixuan", {
		        multiple: multiple,
		        multipleSeparator: ',',
		        max: 20,
		        mustMatch: true,
		        matchContains: true,
		        width: 350,
		        formatItem: function (row) {
		            if (row.FLAG == '1') {
		                return row.uda10509 + " | " + row.code;
		            } else {
		                return row.uda10509
		            }
		        },
		        formatResult: function (row) {
		            return row.uda10509;
		        }
		    }).result(function (event, data, formatted) {
		        //看是否有回调函数，如果有就调用
		        alert(data)
		        var callback = $("#" + fdName).attr("callback");
		        if (callback != undefined && callback != "") {
		            eval(callback);
		        }
		    });
		} */
	
	
	
	
	
	
	
	
	
	
});


function autoUserMulti(obj){
	$(obj).parent("td").find("input").autocomplete("/product/userlink/list?userCode=liucaixuan", {
		    multiple: true,
		  	max : 20, //列表里的条目数
			minChars : 2, //自动完成激活之前填入的最小字符
			width : "400px", //提示的宽度，溢出隐藏
			scrollHeight : 400, //提示的高度，溢出显示滚动条
			matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
			mustMatch: true,
			autoFill : false, //自动填充
			multipleSeparator:",",
			parse : function(data) {
				return $.map(eval(data), function(row) {
					return {
						data : row,
						value : row.groupname,
						result :row.groupname
					}
				}); //对ajax页面传过来的数据进行json转码
			},
			formatItem : function(row, i, max) {
				//document.getElementById('cmoid').value = "";
				return row.groupname + ' | ' + row.deptname;
			}
	    });
}

function autoUserSingle(obj){
	$(obj).parent("td").find("input").autocomplete("/product/userlink/list?userCode=liucaixuan", {
	    multiple: false,
	  	max : 20, //列表里的条目数
		minChars : 2, //自动完成激活之前填入的最小字符
		width : "400px", //提示的宽度，溢出隐藏
		scrollHeight : 400, //提示的高度，溢出显示滚动条
		matchContains : true, //包含匹配，就是data参数里的数据，是否只要包含文本框里的数据就显示
		mustMatch: true,
		autoFill : false, //自动填充
		multipleSeparator:",",
		parse : function(data) {
			return $.map(eval(data), function(row) {
				return {
					data : row,
					value : row.groupname,
					result :row.groupname
				}
			}); //对ajax页面传过来的数据进行json转码
		},
		formatItem : function(row, i, max) {
			//document.getElementById('cmoid').value = "";
			return row.groupname + ' | ' + row.deptname;
		}
    });
}


String.prototype.startsWith = function(str) {
    if (!str || str.length > this.length)
        return false;
    if (this.substr(0, str.length) == str)
        return true;
    else
        return false;
    return true;
}