<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div class="pull-left"><a class="navbar-brand" href="#">
        <div class="navbar-logo"><%--<img src="images/logo.png" alt="logo">--%>华软新生注册报到系统</div>
    </a></div>
    <div class="pull-right header-btns">
        <a class="user"><span class="glyphicons glyphicon-user"></span> admin</a>
        <a href="login.html" class="btn btn-default btn-gradient" type="button"><span
                class="glyphicons glyphicon-log-out"></span> 退出</a>
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
                    <a href="index.html"><span class="glyphicons glyphicon-home"></span><span
                            class="sidebar-title">后台首页</span></a>
                </li>
                <li>
                    <a href="news_list.html"><span class="glyphicons glyphicon-file"></span><span class="sidebar-title">系别管理</span></a>
                </li>
                <li>
                    <a href="${baseurl}/findAllMajors"><span class="glyphicons glyphicon-paperclip"></span><span
                            class="sidebar-title">专业管理</span></a>
                </li>
                <li>
                    <a href="category_list.html"><span class="glyphicons glyphicon-paperclip"></span><span
                            class="sidebar-title">班级管理</span></a>
                </li>
                <li>
                    <a href="website.html"><span class="glyphicons glyphicon-paperclip"></span><span
                            class="sidebar-title">用户管理</span></a>
                </li>
            </ul>
        </div>
    </aside>

    <!-- Start: Content -->
    <section id="content">
        <div id="topbar" class="affix">
            <ol class="breadcrumb">
                <li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
                <li class="active">专业管理</li>
            </ol>
        </div>
        <div class="container">

            <div class="row">
                <div class="col-md-12">
                    <div class="panel">
                        <div class="panel-heading">
                            <div class="panel-title">专业列表</div>
                            <a href="toAddMajor" class="btn btn-info btn-gradient pull-right"><span
                                    class="glyphicons glyphicon-plus"></span> 添加专业</a>
                        </div>
                        <form action="" method="post">
                            <div class="panel-body">
                                <table class="table table-striped table-bordered table-hover dataTable">
                                    <tr class="active">
                                        <th class="text-center">
                                            <a class="btn btn-gray btn-sm" id="selectAll">全选</a>
                                        </th>
                                        <th>序号</th>
                                        <th>专业ID</th>
                                        <th>专业名称</th>
                                        <th>专业学费</th>
                                        <th>操作</th>
                                    </tr>

                                    <c:forEach items="${majorList}" var="major" varStatus="s">
                                        <tr class="success">
                                            <td class="text-center"><input type="checkbox" value="1" name="idarr[]"
                                                                           class="cbox"></td>
                                            <td>${s.index+1}</td>
                                            <td>${major.majorId}</td>
                                            <td>${major.majorName}</td>
                                            <td>${major.tuition}</td>
                                            <td>
                                                <div class="btn-group">
                                                    <a href="toupdateMajor?majorId=${major.majorId}">修改</a>
                                                    <a href="deleteMajor?majorId=${major.majorId}">删除</a></div>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                </table>

                                <div class="pull-left">
                                    <button type="submit" class="btn btn-default btn-gradient pull-right delall"><span
                                            class="glyphicons glyphicon-trash"></span></button>
                                </div>

                                <div class="pull-right">
                                    <ul class="pagination" id="paginator-example">
                                        <li><a href="#">&lt;</a></li>
                                        <li><a href="#">&lt;&lt;</a></li>
                                        <li><a href="#">1</a></li>
                                        <li class="active"><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">&gt;</a></li>
                                        <li><a href="#">&gt;&gt;</a></li>
                                    </ul>
                                </div>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End: Content -->
</div>
<!-- End: Main -->


</body>
</html>
