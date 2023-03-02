<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="personal.leihua.lab02.pojo.Dept" %>
<%@ page import="personal.leihua.lab02.pojo.Major" %>
<%@ page import="personal.leihua.lab02.pojo.Teacher" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>

<%--
  Created by IntelliJ IDEA.
  User: LH
  Date: 2023/3/1
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    //ApplicationContext ac2 = WebApplicationContextUtils.getWebApplicationContext(application);
    ClassPathXmlApplicationContext ac2 = new ClassPathXmlApplicationContext("beans.xml");

    Object s1 = ac2.getBean(Dept.class);
    Object  p1= ac2.getBean(Major.class);
    Object  r1= ac2.getBean(Teacher.class);
    System.out.println("第三个页面 singleton:"+s1);
    System.out.println(" prototype:"+p1);
    System.out.println(" request:"+r1);

%>

</body>
</html>
