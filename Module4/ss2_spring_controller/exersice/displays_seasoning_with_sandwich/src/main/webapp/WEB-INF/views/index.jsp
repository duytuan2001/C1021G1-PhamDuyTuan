<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/2/2022
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="save" method="get">
    <input type="checkbox" name="condiment" value="lettuce">Lettuce
    <input type="checkbox" name="condiment" value="tomato">Tomato
    <input type="checkbox" name="condiment" value="mustard">Mustard
    <input type="checkbox" name="condiment" value="sprouts">Sprouts
    </br>
    <input type="submit" name="save" value="save">
</form>
<table border="1">
    <thead>
    <tr>
        <th>Gia vị bạn đã chọn</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach  var="condiment"  items="${result}">
        <tr>
            <td>${condiment}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
