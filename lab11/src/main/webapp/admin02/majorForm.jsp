<%--
  Created by IntelliJ IDEA.
  User: DSY
  Date: 4/11/2021
  Time: 8:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String baseUrl=request.getScheme() + "://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";

%>
<html>
<head>
    <base href="<%=baseUrl%>">
    <title>专业添加页面</title>
</head>
<body>

<form action="major_save02" method="post">
    <table border="1">
        <tr>
            <td>专业编号:</td>
            <td><input type="text" id="majorId" name="majorId" tabindex="1"></td>
        </tr>
        <tr>
            <td>专业名称:</td>
            <td><input type="text" id="majorName" name="majorName" tabindex="2"></td>
        </tr>
        <tr>
            <td>学费:</td>
            <td><input type="text" id="tuition" name="tuition" tabindex="3"></td>
        </tr>
        <tr>
            <td><input id="reset" type="reset" tabindex="4"></td>
            <td><input id="submit" type="submit" tabindex="5"
                       value="添加专业"></td>
        </tr>
    </table>
</form>
</body>
</html>
