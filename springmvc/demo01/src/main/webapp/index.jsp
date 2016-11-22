<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>userLiet</title>

    <style type="text/css">
        table tr {
            width: 50px;
        }
    </style>
</head>

<body>
<table width="100%" border=1>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.name }</td>
            <td>${user.age }</td>
            <td>${user.sex }</td>
        </tr>
    </c:forEach>
</table>
<h1>hello</h1>
</body>
</html>
