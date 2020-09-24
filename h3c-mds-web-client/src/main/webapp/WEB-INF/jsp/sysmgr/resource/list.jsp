<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资源列表</title>
</head>
<body >
    <div id="index" class="userClass">
        <!--布局-->
        <div class="titleClass">资源管理</div>
        
        <table style="width:100%;">
        	<tr>
        		<td style="width:20%;">
        			<div class="index-4">
            			<ul id="tt" class="easyui-tree"
						url="resource/getResourceTree">
						</ul>
       				 </div>
        		</td>
        		<td style="position:fixed;width:80%;margin-left:10px;">
        			<div id="tit" class="easyui-panel" title="资源配置" style="width:400px">
						<div style="padding:10px 60px 20px 60px">
        				<form id="ff" method="post" class="easyui-form" data-options="novalidate:true">
        					<input  type="hidden" name="hresId"  />
        					<input  type="hidden" name="hresPcode" id="hresPcode" />
        					<table >
        						<tr>
        							<td><label for="name">名称:</label></td>
        							<td><input class="easyui-validatebox" type="text" name="hresName" data-options="required:false" /></td>
        						</tr>
        						<tr>
        							<td><label for="name">URL:</label></td>
        							<td><input class="easyui-validatebox" type="text" name="hresContent" data-options="required:false" /></td>
        						</tr>
        						<tr>
        							<td><label for="name">排序号:</label></td>
        							<td><input class="easyui-validatebox" type="text" name="hresSort" data-options="required:false" /></td>
        						</tr>
        						<tr>
        							<td><label for="name">资源类型:</label></td>
        							<td>
        								<select  name="resourceType" style="width:173px;">
        									<option value="1">菜单</option>
        									<option value="0">按钮</option>
        								</select>
        								
        							</td>
        						</tr>
        						<tr>
        							<td><label for="name">状态:</label></td>
        							<td>
        								<select  name="flag" style="width:173px;">
        									<option value="1">启用</option>
        									<option value="0">停用</option>
        								</select>
        								
        							</td>
        						</tr>
        						<tr>
        							<td><label for="name">描述:</label></td>
        							<td>
        								<input class="easyui-textbox" name="remark" data-options="multiline:true" style="height:60px">
        							</td>
        						</tr>
        						
        					</table>
						   
						</form>
						<div style="text-align:center;padding:5px">
	    					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    					<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a>
	   					</div>
        			</div>
        			</div>
        		</td>
        	</tr>
        </table>
        <br><br><br><br><br><br>
    </div>
  <script type="text/javascript">
  		$('#tt').tree({
  			onDblClick: function(node){
  					$('#ff').form('load', 'resource/getById/'+node.id);
  					$('.panel-title').html("资源节点编辑");
				},
  			onClick: function(node){
  				
  				clearForm();
  				$("#hresPcode").val(node.code);
  				$('.panel-title').html("新增资源节点");
  			}
		});
  		function submitForm(){
  			$('#ff').form('submit', {
  			    url:"resource/submit",
  			    onSubmit: function(){
  			    	var pCode = $("#hresPcode").val();
  			    	if(pCode == ''){
  			    		alert("请选择父节点");
  			    		return false;	
  			    	}
  			    	
  			    	return $(this).form('enableValidation').form('validate');
  			    },
  			    success:function(data){
  			    	$('#tt').tree('reload');
  			    	clearForm();
  			    }
  			});
		}
		function clearForm(){
			$('#ff').form('clear');
		}
  </script>
</body>
</html>