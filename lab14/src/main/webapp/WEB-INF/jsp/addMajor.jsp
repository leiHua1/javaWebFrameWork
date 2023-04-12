<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="baseurl" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
    <%--to record pronect Name (contextPath=/jwxt)--%>
    contextPath = "${pageContext.request.contextPath}";
</script>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>添加专业页面</title>
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
                    <a href="${baseurl}/findAllClass"><span class="glyphicons glyphicon-paperclip"></span><span class="sidebar-title">班级管理</span></a>
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
                <li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
                <li class="active">添加专业</li>
            </ol>
        </div>
        <div class="container">

            <div class="row">
                <div class="col-md-10 col-lg-11 center-column">
                    <form action="addMajor" method="post" class="cmxform">
                        <div class="panel">
                            <div class="panel-heading">
                                <div class="panel-title">添加专业</div>
                                <div class="panel-btns pull-right margin-left">
                                    <a href="news_list.html" class="btn btn-default btn-gradient dropdown-toggle"><span class="glyphicon glyphicon-chevron-left"></span></a>
                                </div>
                            </div>
                            <div class="panel-body">
                                <div class="col-md-7">
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">专业ID</span>
                                            <input type="text" name="majorId" value="" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">专业名称</span>
                                            <input type="text" name="majorName" value="" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">学费</span>
                                            <input type="text" name="tuition" value="" class="form-control">
                                        </div>
                                    </div>
                                </div>

                                <div class="col-md-7">
                                    <div class="form-group">
                                        <input type="submit" value="提交" class="submit btn btn-blue">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>

    <!-- End: Content -->
</div>
</body>
</html>
