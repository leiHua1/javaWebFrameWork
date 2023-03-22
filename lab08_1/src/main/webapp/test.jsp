<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="personal.leihua.servlet.MajorController" %>
<%@ page import="personal.leihua.pojo.Major" %>
<%@ page import="java.util.List" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %><%--
  Created by IntelliJ IDEA.
  User: LH
  Date: 2023/3/22
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //获取Web应用初始化的Spring容器
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    //取容器中id为userController的Bean
    MajorController majorController = ac.getBean("majorController", MajorController.class);
    List<Major> allMajor = majorController.findAllMajor();

%>
<%=allMajor.toString()%>>

</body>
</html>
