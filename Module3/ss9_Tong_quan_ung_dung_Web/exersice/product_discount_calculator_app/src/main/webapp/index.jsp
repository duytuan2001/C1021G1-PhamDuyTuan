<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 1/25/2022
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="display-discount" method="post">
    <label>Product Description : </label>
    <input type="text" name="productDescription"><br>

    <label>List Price : </label><br/>
    <input type="text" name="listPrice" placeholder="List Price" value="0"><br>

    <label>Discount Percent : </label><br/>
    <input type="text" name="discountPercent" placeholder="Discount Percent" value="0"><br>

    <input type="submit" id="submit" value="Calculate Discount">

</form>
</body>
</html>
