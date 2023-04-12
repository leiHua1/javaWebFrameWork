<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>专业保存</title>
</head>
<body>
<h2 align="center">后台管理-班级详情</h2>
<hr/>
<h3>Major Details:</h3>
<form  name="editClass" action="editClass" method="post">
    <div id="table_div">
        <table align="center">
            <tr>
                <td>系别ID：</td>
                <td><input type="text" name="classId" value="${clazz.classId}" readonly></td>
            </tr>
            <tr>
                <td>班别名称：</td>
                <td><input type="text" value="${clazz.className}" name="className"></td>
            </tr>
            <tr>
                <td>班级人数：</td>
                <td><input type="text" value="${clazz.classSize}" name="classSize">  </td>
            </tr>
            <tr>
                <td>剩余人数：</td>
                <td><input type="text" value="${clazz.classSurplus}" name="classSurplus"></td>
            </tr>
            <tr>
                <td>deptid：</td>
                <td><input type="text" value="${clazz.deptId}" name="deptId"></td>
            </tr>
            <tr>
                <td>专业id：</td>
                <td><input type="text" value="${clazz.majorId}" name="majorId"></td>
            </tr>
            <tr>
                <td>学生导师：</td>
                <td><input type="text" value="${clazz.tutorId}" name="tutorId"></td>
            </tr>
            <tr>
                <td>辅导员：</td>
                <td><input type="text" value="${clazz.instructorId}" name="instructorId"></td>
            </tr>
            <tr>
                <td>备注：</td>
                <td><input type="text" value="${clazz.bz}" name="bz"></td>
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
