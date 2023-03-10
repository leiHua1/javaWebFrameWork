<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="personal.leihua.lab02.pojo.Dept" %>
<%@ page import="personal.leihua.lab02.pojo.Major" %>
<%@ page import="personal.leihua.lab02.pojo.Teacher" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %><%--
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
    // spring 默认扫描的是applicationContext.xml，如果该文件不Import bean.xml文件，则bean文件不起作用
    ApplicationContext ac2 = WebApplicationContextUtils.getWebApplicationContext(application);   // 获取应用容器 ，application 是Jsp的内置独享
    //ClassPathXmlApplicationContext ac2 = new ClassPathXmlApplicationContext("classpath:beans.xml");
    Object s1 = ac2.getBean(Dept.class);
    Object  p1= ac2.getBean(Major.class);
    Object  r1= ac2.getBean(Teacher.class);
    System.out.println("第一个页面 singleton:"+s1);
    System.out.println(" prototype:"+p1);
    System.out.println(" request:"+r1);
%>

<% request.getRequestDispatcher("/second.jsp").forward(request,response);%>
</body>
</html>
