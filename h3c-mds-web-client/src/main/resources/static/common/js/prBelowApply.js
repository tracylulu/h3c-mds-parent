



jQuery.browser={};
	(function(){
		jQuery.browser.msie=false; 
		jQuery.browser.version=0;
		if(navigator.userAgent.match(/MSIE ([0-9]+)./)){ 
			jQuery.browser.msie=true;
			jQuery.browser.version=RegExp.$1;
		}
	})();	
	
	
	//textarea自适应高度
	$(function(){
	    $.fn.autoHeight = function(){    
	    function autoHeight(elem){
	    	var heights=0;
	        elem.style.height = 'auto';
	        elem.scrollTop = 0; //防抖动
	        if(elem.scrollHeight==0){
	        	heights=28;
	        }else{
	        	heights=elem.scrollHeight;
	        }
	        elem.style.height = heights + 'px';
	    }
	    this.each(function(){
	        autoHeight(this);
	        $(this).on('keyup', function(){
	            autoHeight(this);
	        });
	    });     
	}                
	 $('textarea[autoHeight]').autoHeight();    

	});

	//去掉空行
	 function getNewTags(id,sp)
	 {
	    var newtags="";
	    var tags=document.getElementById(id).value;
	    var f=[];    f=tags.split(sp); 
	    var rows=getRows(id);
	      row="-";     
	    for(var i = 0; i< rows.length; i++){
	    row=row+rows[i]+"-";
	     }
	     var b=null;
	     for(var j = 0; j < f.length; j++){
	     b=newtags;
	     if((row.indexOf("-"+j+"-"))==-1){
	         newtags=newtags+f[j];
	         if(j!=f.length-1){
	         newtags=newtags+"\n";          //根据你的换行来
	         }
	      } 
	       } 
	    //看是否选择了最后一行
	     var le1=rows[(rows.length-1)];
	     var le2=f.length-1; 
	    if(le1==le2){
	    newtags=newtags.substring(0,newtags.length-1)    //  换行是\r\n此处应该就为2
	    }
	   return newtags;
	 }

	 function getRows(id){
		  var startFocus = document.getElementById(id).selectionStart;
		  var endFocus = document.getElementById(id).selectionEnd;
		  var tags=document.getElementById(id).value;
		  var sp="\n";    //此处不行试试换成  \r\n
		var rows = [];
		var startRow=getStartRow(startFocus,tags,sp);
		var endRow=getEndRow(endFocus,tags,sp);
		//开始和结束在一行
		if(startEnd(startFocus,endFocus,tags,sp)){
		// rows.push(startRow);
		}else{
		//开始点是否在结尾处
		if(startIsEnd(startFocus,tags,sp)){
		startRow=startRow+1;
		//结尾是否在下一行的开始处
		}if(endIsStart(endFocus,tags,sp)){
		endRow=endRow-1;
		}
		}
		for ( var i = startRow; i <= endRow; i++) {
		  rows.push(i);
		}
		return rows;
	}

	//开始和结束是否在一行
	 function startEnd(startFocus,endFocus,tags,sp)
	 { 
	    b=false;
	    if(startFocus==endFocus){
	    b= true;
	    }else if(getStartRow(startFocus,tags,sp)==getEndRow(endFocus,tags,sp)){
	    b= true;
	    }
	   return b;
	 } 
	 
	  //开始焦点是否在结束位置
	 function startIsEnd(startFocus,tags,sp)
	 { 
	    var f=[];  f=tags.split(sp);
	     var len=0;
	     var row=0;
	     var b=false;
	     for ( var i = 0; i < f.length; i++) {
	       if(i!=0){
	            len+=1;
	          }
	        len=len+f[i].length;
	        if(startFocus==len){
	             b=true;
	             break;
	         }
	  }
	     return b;
	}
	 
	  //结束焦点是否在下一行开始处位置
	 function endIsStart(endFocus,tags,sp)
	 {
	     var str=[];  str=tags.split(sp);
	     var len=0; var aa=0;  var endRow=0;
	     var b=false;
	     for ( var i = 0; i < str.length; i++) {
	       if(i!=0){
	            len+=1;
	          }
	        aa=len;
	        len=len+str[i].length;
	        if(endFocus==len+1){
	        b=true;
	            break;;
	          }
	  	}
	    return b;
	} 
	 
	  //startRow
	 function getStartRow(startFocus,tags,sp)
	 { 
	    var f=[]; f=tags.split(sp);
	     var len=0;
	     var aa=0;
	     var startRow=0;
	     for ( var i = 0; i < f.length; i++) {
	       if(i!=0){
	            len+=1;
	          }
	        aa=len;
	        len=len+f[i].length;
	        if(aa<=startFocus&&startFocus<=len){
	             startRow=i;
	             break;
	         }
	  }
	    return startRow;
	 } 
	  //engRow
	 function getEndRow(endFocus,tags,sp)
	 { 
	    var str=[];  str=tags.split(sp);
	     var len=0;
	     var aa=0;
	     var endRow=0;
	     for ( var i = 0; i < str.length; i++) {
	       if(i!=0){
	            len+=1;
	          }
	        aa=len;
	        len=len+str[i].length;
	        if(aa<=endFocus&&endFocus<=len){
	             endRow=i;
	             break;
	         }
	  	}
	    return endRow;
	} 





