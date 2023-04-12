<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="baseurl" value="${pageContext.request.contextPath}"></c:set>
<script type="text/javascript">
    <%--to record pronect Name (contextPath=/jwxt)--%>
    contextPath = "${pageContext.request.contextPath}";
</script>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="keywords" content="Admin">
    <meta name="description" content="Admin">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Core CSS  -->
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/bootstrap.css">

    <!-- Theme CSS -->
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/theme.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/pages.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}/css/responsive.css">
    <%--    <script type="text/javascript" src="${baseurl}/js/jquery.min.js"></script>--%>
    <script type="text/javascript" src="${baseurl}/js/jquery-1.11.1-min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(window).keydown(function (e) {
                if (e.keyCode == 13) {
                    $("#loginBtn").click(); //模拟点击
                }
            });
            $("#loginBtn").click(function () {
                var account = $("#account").val();
                var password = $("#password").val();
                $.ajax({
                    url: "${baseurl}/login",
                    data: {
                        account: account,
                        password: password
                    },
                    type: 'post',
                    dataType: 'json',
                    success: function (data) {
                        if (data.code== "1") {
                            window.location.href = '${baseurl}/index';
                        } else {
                            alert(data.message);
                        }
                    }

                });
            });
        });
    </script>
</head>

<body class="login-page">

<!-- Start: Main -->
<div id="main">
    <div class="container">
        <div class="row">
            <div id="page-logo"></div>
        </div>
        <div class="row">
            <div class="panel">
                <div class="panel-heading">
                    <div class="panel-title">系统登录入口</div>
                </div>

                <form action="" class="cmxform" id="altForm" method="post">
                    <div class="panel-body">
                        <div class="form-group">
                            <div class="input-group"><span class="input-group-addon">用户名</span>
                                <input type="text" id="account" name="account" class="form-control" autocomplete="off"
                                       placeholder="请输入您的用户名">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group"><span class="input-group-addon">密&nbsp;&nbsp;&nbsp;码</span>
                                <input type="password" id="password" name="password" class="form-control"
                                       autocomplete="off" placeholder="请输入您的密码">
                            </div>
                        </div>
                        <span id="msg"></span>
                    </div>

                    <div class="panel-footer"><span class="panel-title-sm pull-left" style="padding-top: 7px;"></span>
                        <div class="form-group margin-bottom-none">
                            <input type="hidden" value="login" name="action-mark"/>
                            <input id="loginBtn" class="btn btn-primary pull-right" type="button" value="登 录"/>
                            <%--                            <button id="loginBtn"  type="button" >登录</button>--%>
                            <div class="clearfix"></div>
                        </div>
                    </div>

                </form>

            </div>
        </div>
    </div>
</div>
<!-- End: Main -->

</body>

</html>
