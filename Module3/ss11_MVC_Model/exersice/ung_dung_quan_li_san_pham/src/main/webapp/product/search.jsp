<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/13/2022
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search product</title>
</head>
<body>
<p>
    <a href="/products">Back to product list</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getIdProduct()}">${product.getNameProduct()}</a></td>
            <td>${product.getPriceProduct()}</td>
            <td>${product.getDescriptionProduct()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="/products?action=edit&id=${product.getIdProduct()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getIdProduct()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
