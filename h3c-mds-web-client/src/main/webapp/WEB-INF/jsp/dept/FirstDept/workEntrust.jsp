<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增委托人员</title>
    
<style type="text/css">
/*  input[id="user${id_suffix}"]{
line-height:30px;
} */

  input[id="user${id_suffix}"]{
height: 30px;
margin:5px 0px;
vertical-align:middle;
line-height:30px;
}  
</style>   
    
</head>
<body>
<div id="insertWorkPerson${id_suffix}" class="easyui-window" title="新增委托人员" style="width:400px;height:200px"
     data-options="iconCls:'icon-save',modal:true,closed:true" >
    <input id="current_dept_file_index${id_suffix}" type="hidden" value=""/>
    <form></form>
    <form id="deptFileForm${id_suffix}" method="post" >
        <br>

        <table width="100%" id="1111">
            <tr>
            	<td width="88%" align="center">
                    <input type="text" name="user" id="user${id_suffix}" style="width:300px;" data-options="" class="ac_input"/>
                </td> 
            </tr>
        </table>
            
        <br>
        <div align="center">
            <a href="#" class="easyui-linkbutton" onclick="confirmDept${id_suffix}();" id="confirmBomCodeFile${id_suffix}">确认</a>
            <a href="#" class="easyui-linkbutton" onclick="cancleDept${id_suffix}();" id="cancleBomCodeFile${id_suffix}">取消</a>
            <a href="#" class="easyui-linkbutton" style="display:none;" onclick="deleteDept${id_suffix}();" id="deleteBomCodeFile${id_suffix}">移除的委托人</a>
        </div>
              
       
    </form>
</div>

<link rel="stylesheet" type="text/css" href="common/css/jquery.autocomplete.css" />
<script src="easyui/jquery.autocomplete.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="common/js/common.js"></script>
<script type="text/javascript">
$(function(){
	autoUserSingle($("#user${id_suffix}"));	
});
/*
*	导出-----工作委托
*/	
//弹窗文件上传窗口
function toWorkEntrustList${id_suffix}(){     
	var d=new Date().getTime();
	//alert(d);
	$.ajax({
        url:'dept/getWorkPerson?d='+d,
        type:"get",
        dataType:"text",
        success:function(data){
        	 //alert(data);
        	 if(typeof data == "undefined" || data == null || data == ""){
        		 $("#user${id_suffix}").val(data)
        		 $("#deleteBomCodeFile${id_suffix}").attr("style","display:none;width:120px;");
        		 $("#insertWorkPerson${id_suffix}").window('open');
        	 }else{
        		 $("#deleteBomCodeFile${id_suffix}").attr("style","display:block;width:120px;");
        		 $("#user${id_suffix}").val(data)
        		 $("#insertWorkPerson${id_suffix}").window('open');
        	 }
        },
        error :function(data){
        }
    });

}

	
	//移除按钮
	function deleteDept${id_suffix}(){      
		var d=new Date().getTime();
		//alert(d);
		var workPerson=$("input#user${id_suffix}").val(); 
		//alert(workPerson);
		$.ajax({
			type:"GET",
			//dataType:"json",
			url: 'dept/delWorkPerson?workPerson='+workPerson+'&d='+d,
			success: function(data){
				alert(data);
				$("#insertWorkPerson${id_suffix}").window('close');
				//$("#dg${id_suffix}").datagrid("reload");
			}
		}); 
		
	
	}
    //文件提示框取消
    function cancleDept${id_suffix}(){      
        $("#insertWorkPerson${id_suffix}").window('close');

    }

    //文件提示框确认
    function confirmDept${id_suffix}() {
    	//var users="";
		/* $("#1111").find("input").each(function(i){
			var user=$(this).val();
			//alert(user);
			$.each(user.split(','),function(i,item){
				if(item!=null&&item!=undefined&&item!=''&&users.indexOf(item)==-1){
					if(users==""){
						users=item;
					}else{
						users+=','+item;
					}
				}
			});								
		}); */
		var users=$("input#user${id_suffix}").val(); 
		$.post('/dept/setWorkPerson',{users:users},function(data){
			if(data=="infoForP03"){
				//获取P02已存在的部门对应的的中文名
				$.ajax({
					type:"GET",
					//dataType:"json",
					url: 'dept/getdeptNameForP03?users='+users,
					success: function(data1){
						$.messager.confirm('提示','该人员已经是'+data1+'的工作委托人角色，请问是否确认覆盖?',function(r){
				            if (r){
				                //alert("确认的值："+r);
				                $.ajax({
				    				type:"GET",
				    				//dataType:"json",
				    				url: 'dept/reCoverP03?users='+users,
				    				success: function(data){
				    					$("#insertWorkPerson${id_suffix}").window('close');
				    					alert(data);
				    					
				    				}
				    			}); 
				            }else {
				                //alert("取消的值："+r)
				            }
				        });
						
					}
				});
				
			}else{
				$("#insertWorkPerson${id_suffix}").window('close');
				alert(data);
			}
			
		});

    }
    

/*     function autoComplete${id_suffix}(obj){
		$(obj).off('autocomplete').autocomplete("/dept/userlink/list?userCode=liucaixuan", {
			 multiple: false,
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
	} */
    
</script>
</body>
</html>
