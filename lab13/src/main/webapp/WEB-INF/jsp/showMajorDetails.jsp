<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>专业保存</title>
</head>
<body>
<h2 align="center">后台管理-专业详情</h2>
<hr/>
<h3>Major Details:</h3>
<form name="majorUpdate" action="updateMajor" method="post">
    <div id="table_div">
        <table align="center">
            <tr>
                <td>系别ID：</td>
                <td></td>
            </tr>
            <tr>
                <td>系别名称：</td>
                <td><input type="text" value="${major.majorName}" name="majorName"></td>
            </tr>
            <tr>
                <td>专业ID：</td>
                <td><input type="text" value="${major.majorId}" name="majorId">  </td>
            </tr>
            <tr>
                <td>专业名称：</td>
                <td><input type="text" value="${major.deptId}" name="deptId"></td>
            </tr>
            <tr>
                <td>专业学费：</td>
                <td><input type="text" value="${major.tuition}" name="tuition"></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input id="btn_submit" type="submit" value="修改"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="btn_reset" type="reset" value="取消"/></td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
