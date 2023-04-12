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
    <title>添加班级页面</title>
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
                <li class="active">添加班级</li>
            </ol>
        </div>
        <div class="container">

            <div class="row">
                <div class="col-md-10 col-lg-11 center-column">
                    <form action="addClass" method="post" class="cmxform">
                        <div class="panel">
                            <div class="panel-heading">
                                <div class="panel-title">添加班级--------省事把class表中的外键都删了</div>
                                <div class="panel-btns pull-right margin-left">
                                    <a href="news_list.html" class="btn btn-default btn-gradient dropdown-toggle"><span class="glyphicon glyphicon-chevron-left"></span></a>
                                </div>
                            </div>
                            <div class="panel-body">
                                <div class="col-md-7">
                                    <div class="form-group">
<%--                                        <div class="input-group"> <span class="input-group-addon">班级ID</span>--%>
<%--                                            <input type="text" name="classId" value="" class="form-control">--%>
<%--                                        </div>--%>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">班级名称</span>
                                            <input type="text" name="className" value="" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">班级人数</span>
                                            <input type="text" name="classSize" value="" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">班级剩余人数</span>
                                            <input type="text" name="classSurplus" value="" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">学习导师</span>
                                            <input type="text" name="tutorId" value="" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group"> <span class="input-group-addon">辅导员</span>
                                            <input type="text" name="instructorId" value="" class="form-control">
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
