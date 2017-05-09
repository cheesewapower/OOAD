<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据交易平台</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/carousel/logo.jpg" type="image/x-icon">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.test {
	height: 550px;
	background-color:#ffffff;
	margin-top:20px;
	border-radius:5px;
}
</style>
<script type="text/javascript">
	$(function(){
		if(window.top.$("#divHeader").length>0){
			window.top.location.href="${pageContext.request.contextPath}/404_error";
		}
		$('#login').click(function(){
			window.top.location.href="${pageContext.request.contextPath}/index";
		})
	})
</script>
</head>
<body style="padding-top: 50px;background:#E7E8EB">
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="col-md-8 col-md-offset-2 col-lg-8 col-lg-offset-2">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<img alt="Brand" class="navbar-brand"
					src="${pageContext.request.contextPath}/images/carousel/logo.jpg"> <span
					class="navbar-brand" style="font-family: '黑体'; color: black;">数据交易平台</span>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><button id="login" type="button" class="btn btn-success navbar-btn">首页</button></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
	</div>
	</nav>
	<div class="container-fluid">
		<div class="col-md-8 col-md-offset-2 col-lg-8 col-lg-offset-2 test" 
			style="padding: 20px 30px;">
			
			<div style="margin:0 auto;">
				<div class="page-header">
				  <h1 style="color:#555555;">对不起，您访问的页面不存在</h1>
				</div>
				<div class="page-body" style="text-align:center;">
				  <div class="panel-body">
				    <img alt="页面不存在" src="${pageContext.request.contextPath}/images/notexist.png">		 	
				  </div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>