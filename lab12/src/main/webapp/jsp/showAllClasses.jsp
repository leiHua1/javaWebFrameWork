<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% String baseurl=request.getScheme() + "://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=baseurl%>>">
    <meta charset="utf-8">
    <title>后台管理-班级管理</title>
    <link href="<%=baseurl%>css/bootstrap.min.css" rel="stylesheet">
    <script src="<%=baseurl%>js/jquery.min.js"></script>
    <script src="<%=baseurl%>js/bootstrap.min.js"></script>
</head>
<body>

<h2 align="center">后台管理-班级管理</h2>
<hr/>
<a href=''><img src="${baseurl}/img/add.png"></a>
<div id="logout" align="right"><a href="logout">注销</a></div>
<table class="table  table-bordered" align="center" valign="middle">
    <thead>
    <tr>
        <th scope="col">序号</th>
        <th scope="col">班级ID</th>
        <th scope="col">班级名称</th>
        <th scope="col">班级容量</th>
        <th scope="col">剩余人数</th>
        <th scope="col">专业ID</th>
        <th scope="col">操作</th>
    </tr>
    </thead>
    <tbody>
        <!-- 显示所有班级信息 -->
        <c:forEach items="${classList}" varStatus="status" var="clazz">
            <tr>
            <td>${status.index+1}</td>
            <td>${clazz.class_id}</td>
            <td>${clazz.class_name}</td>
            <td>${clazz.class_size}</td>
            <td>${clazz.class_surplus}</td>
            <td>${clazz.major_id}</td>
            <td><a href="toUpdateClass?id=${clazz.class_id}">修改</a><a href="deleteClass?id=${clazz.class_id}">删除</a></td>
            </tr>
        </c:forEach>

    </tbody>
</table>
</body>
</html>
