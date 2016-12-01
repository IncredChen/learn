<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改商品信息</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
    <script type="text/javascript">
        function searchIteams() {
            document.itemsForm.action = "${pageContext.request.contextPath}/items/editItemsQuery.action";
            document.itemsForm.submit();
        }

        function editItemsAllSubmit() {
            document.itemsForm.action = "${pageContext.request.contextPath}/items/editItemsSubmit1.action";
            document.itemsForm.submit();
        }
    </script>
</head>
<body>

<form name="itemsForm" action="${pageContext.request.contextPath }/items/editItemsSubmit1.action" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td>
                商品名称：<input name="itemsCustom.name" />
            </td>
            <td>
                <input type="button" value="查询" onclick="searchIteams()"/>
                <input type="button" value="批量修改提交" onclick="editItemsAllSubmit()"/>
            </td>
        </tr>
    </table>
    修改商品信息：
    <table width="100%" border=1>
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <%--<td>商品生产日期</td>--%>
            <%--<td>商品图片</td>--%>
            <td>商品简介</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${itemsList}" var="item" varStatus="status">
            <tr>
                <td><input type="text" name="itemsCustomList[${status.index}].name" value="${item.name }"/></td>
                    <%--<td><input type="text" name="price" value="${itemsCustom.name }"/></td>--%>
                <%--<td><input type="text" name="itemsCustomList[${status.index}].createtime" value="${item.createtime }"/></td>--%>
                <td><input type="text" name="itemsCustomList[${status.index}].price" value="${item.price }"/></td>
                <td><input type="text" name="itemsCustomList[${status.index}].detail" value="${item.detail }"/></td>
                <td><a href="${pageContext.request.contextPath}/items/editItems.action?id=${item.id}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>