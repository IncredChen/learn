<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>

    <script type="text/javascript">
        function searchIteams(){
            document.ItemsForm.action="${pageContext.request.contextPath }/items/queryItem.action";
            document.ItemsForm.submit();
        }

        function deleteItems(){
            document.ItemsForm.action="${pageContext.request.contextPath }/items/deleteItems.action";
            document.ItemsForm.submit();
        }
    </script>
</head>
<body>
<form name="ItemsForm" action="${pageContext.request.contextPath }/items/queryItem.action" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td>
                <input type="button" value="查询" onclick="searchIteams()"/>
                <input type="button" value="批量删除" onclick="deleteItems()"/>
            </td>
        </tr>
    </table>
    商品列表：
    <table width="100%" border=1>
        <tr>
            <td>选择</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${itemsList}" var="item">
            <tr>
                <td><input type ="checkbox" name="items" value=${item.id}></td>
                <td>${item.name}</td>
                <td>${item.price}</td>
                <td>${item.detail}</td>
                <td><a href="${pageContext.request.contextPath}/items/editItems.action?id=${item.id}">修改</a></td>
            </tr>
        </c:forEach>

    </table>
</form>
</body>
</html>