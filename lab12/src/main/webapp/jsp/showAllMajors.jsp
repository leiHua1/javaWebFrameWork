<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% String baseurl=request.getScheme() + "://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=baseurl%>>">
    <meta charset="utf-8">
    <title>后台管理-专业管理</title>
    <link href="<%=baseurl%>css/bootstrap.min.css" rel="stylesheet">
    <script src="<%=baseurl%>js/jquery.min.js"></script>
    <script src="<%=baseurl%>js/bootstrap.min.js"></script>
</head>
<body>

<h2 align="center">后台管理-专业管理</h2>
<hr/>
<a href=''><img src="${baseurl}img/add.png"></a>
<div id="logout" align="right"><a href="logout">注销</a></div>
<table class="table  table-bordered" align="center" valign="middle">
    <thead>
    <tr>
        <th scope="col">序号</th>
        <th scope="col">专业ID</th>
        <th scope="col">专业名称</th>
        <th scope="col">专业学费</th>
        <th scope="col">操作</th>
    </tr>
    </thead>
    <tbody>
            <!-- 显示所有专业信息 -->
        <c:forEach items="${majorList}" var="major" varStatus="status" >
            <tr>
                <td>${status.index+1}</td>
                <td>${major.majorId}</td>
                <td>${major.majorName}</td>
                <td>${major.tuition}</td>
                <td><a href="toUpdateMajor?id=${major.majorId}" >修改</a><a href="deleteMajor?id=${major.majorId}">删除</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
