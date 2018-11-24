<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/easyui.css">
 	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/icon.css">
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="prodatagrid" ></table>
	<div id="addProdia" class="easyui-dialog" data-options="closed:true">
	<form id="prof1" style="margin:30px" enctype="multipart/form-data" method="post">
	<table>
	<tr><td>
		图书名字：<input class="easyui-validatebox"  name="book_name" data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
		图书封面：<input class="easyui-filebox" name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>
	</td>
	<td>
		图书原价：<input class="easyui-validatebox" name="book_price" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
		当当价格：<input class="easyui-validatebox"  name="Dangprice" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
		</td></tr>
		<tr><td>
		库存：&nbsp;&nbsp;<input class="easyui-validatebox"  name="inventory" data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>
		作者：&nbsp;&nbsp;<input class="easyui-validatebox" name="author" data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
		</td>
		<td>
		出版社：&nbsp;<input class="easyui-validatebox"  name="press" data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
		&nbsp;销量：&nbsp;&nbsp;<input class="easyui-validatebox"  type="number" name="salenum" data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>
		</td></tr>
		<tr><td>
		顾客评分：<input class="easyui-validatebox"  name="custome_score" data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>
		编辑推荐：<input class="easyui-validatebox"  name="recommend" data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>
		</td>
		<td>
		类别所属：<select id="prosele1" name="cid"></select><br/><br/>
		简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages" ></textarea><br/><br/>
		</td></tr>
		</table>
		<center>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro1()">确认</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
		</center>
	</form>
	</div>
	<div id="updateProdia" class="easyui-dialog" data-options="closed:true">
	<form id="prof2" style="margin:30px" enctype="multipart/form-data" method="post">
	<table>
		<tr>
		<td>
		<input id="proId" name="book_id" type="hidden"/>
		图书名字：<input class="easyui-validatebox" id="proName" name="book_name" data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
		图书封面：<input class="easyui-filebox"  name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>
		</td>
		<td>
		图书原价：<input class="easyui-validatebox" id="proPrice" name="book_price" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
		当当价格：<input class="easyui-validatebox" id="dangPrice" name="Dangprice" type="number" step="0.1" data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
		</td>
		</tr>
		<tr><td colspan="2"><p id="image"></p></td></tr>
		<tr><td>
		库存：&nbsp;&nbsp;<input class="easyui-validatebox" id="inventory" name="inventory" data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>
		作者：&nbsp;&nbsp;<input class="easyui-validatebox" id="author" name="author" data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
			</td>
			<td>
		出版社：&nbsp;<input class="easyui-validatebox" id="press" name="press" data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
		销量：&nbsp;&nbsp;<input class="easyui-validatebox" id="salenum" type="number" name="salenum" data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>
		</td></tr>
		<tr><td>
		顾客评分：<input class="easyui-validatebox" id="custome_core" name="custome_score" data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>
		编辑推荐：<input class="easyui-validatebox" id="recommend" name="recommend" data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>
		</td><td>
		类别所属：<select id="prosele" name="cid"></select><br/><br/>
		简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages" id="messages"></textarea><br/><br/>
			</td>
		</tr>
	</table>
		<center>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro();">确认</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onClick="exit();">取消</a>
		</center>
	</form>
	</div>
	<script type="text/javascript">
	
	</script>
</body>
</html>