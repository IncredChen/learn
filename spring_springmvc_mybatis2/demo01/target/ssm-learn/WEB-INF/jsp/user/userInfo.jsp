<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>userInfo</title>
</head>
<body>
<table width="100%" border=1>
    <caption>用户信息表</caption>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <tr>
        <td>${user.id }</td>
        <td>${user.name }</td>
        <td>${user.age }</td>
        <td>${user.sex }</td>
    </tr>
</table>
</body>
</html>
