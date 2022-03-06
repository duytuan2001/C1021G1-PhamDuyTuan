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
<h1>Calculator</h1>
<form action="/calculate" method="post">
    <input type="text" name="number1" value="">
    <input type="text" name="number2" value="">

    <button type="submit" name="number" value="Addition (+)">Addition(+)</button>

    <button type="submit" name="number" value="Subtraction (-)">Subtraction(-)</button>

    <button type="submit" name="number" value="Multiplication (x)">Multiplication(x)</button>

    <button type="submit" name="number" value="Division (/)">Division(/)</button>
</form>

<p>Reusult Division: ${result}</p>

</body>
</html>
