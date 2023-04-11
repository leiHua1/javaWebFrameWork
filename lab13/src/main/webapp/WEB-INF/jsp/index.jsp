<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="baseurl" value="${pageContext.request.contextPath}"></c:set>
<script type="text/javascript">
    <%--to record pronect Name (contextPath=/jwxt)--%>
    contextPath = "${pageContext.request.contextPath}";
</script>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>后台管理-专业管理</title>
    <!-- Core CSS  -->
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/glyphicons.min.css">

    <!-- Theme CSS -->
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/theme.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/pages.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/plugins.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/responsive.css">

    <!-- Boxed-Layout CSS -->
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/boxed.css">


    <!-- Core Javascript - via CDN -->
    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>

</head>
<body>
<!-- Start: Header -->
<header class="navbar navbar-fixed-top" style="background-image: none; background-color: rgb(240, 240, 240);">
    <div class="pull-left"> <a class="navbar-brand" href="#">
        <div class="navbar-logo"><%--<img src="images/logo.png" alt="logo">--%>华软新生注册报到系统</div>
    </a> </div>
    <div class="pull-right header-btns">
        <a class="user"><span class="glyphicons glyphicon-user"></span> admin</a>
        <a href="login.html" class="btn btn-default btn-gradient" type="button"><span class="glyphicons glyphicon-log-out"></span> 退出</a>
    </div>
</header>
<!-- End: Header -->
<!-- Start: Main -->
<div id="main">
    <!-- Start: Sidebar -->
    <aside id="sidebar" class="affix">
        <div id="sidebar-search">

        </div>
        <div id="sidebar-menu">
            <ul class="nav sidebar-nav">
                <li>
                    <a href="index.html"><span class="glyphicons glyphicon-home"></span><span class="sidebar-title">后台首页</span></a>
                </li>
                <li>
                    <a href="news_list.html"><span class="glyphicons glyphicon-file"></span><span class="sidebar-title">系别管理</span></a>
                </li>
                <li>
                    <a href="${baseurl}/findAllMajors"><span class="glyphicons glyphicon-paperclip"></span><span class="sidebar-title">专业管理</span></a>
                </li>
                <li>
                    <a href="category_list.html"><span class="glyphicons glyphicon-paperclip"></span><span class="sidebar-title">班级管理</span></a>
                </li>
                <li>
                    <a href="website.html"><span class="glyphicons glyphicon-paperclip"></span><span class="sidebar-title">用户管理</span></a>
                </li>
            </ul>
        </div>
    </aside>
  <!-- End: Sidebar -->    
  <!-- Start: Content -->
  <section id="content">
    <div id="topbar" class="affix">
      <ol class="breadcrumb">
        <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
      </ol>
    </div>
    <div class="container">


		<div class="col-md-11">
			<div id="docs-content">
				<h2 class="page-header margin-top-none">个人信息</h2>
				<table class="table">
					<tr>
					<td colspan="2">您好，ad,om</td>
					</tr>
					<tr>
					<td width="100">最后登录时间:</td>
					<td>2023-04-08 13：20</td>
					</tr>
					<tr>
					<td>最后登录IP:</td>
					<td>127.0.0.1</td>
					</tr>
				</table>

				<h2 class="page-header margin-top-none">系统信息</h2>
				<table class="table">
				  <tr>
				    <td width="100">操作系统：</td>
				    <td>Windows</td>
				  </tr>
				  <tr>
				    <td>Servlet 版本:</td>
				    <td>4.0.1</td>
				  </tr>
				  <tr>
				    <td>MySQL 版本:</td>
				    <td>8.0.20</td>
				  </tr>
				</table>
			</div>
		</div>
    </div> 
  </section>
  <!-- End: Content --> 
</div>
<!-- End: Main --></body>

</html>