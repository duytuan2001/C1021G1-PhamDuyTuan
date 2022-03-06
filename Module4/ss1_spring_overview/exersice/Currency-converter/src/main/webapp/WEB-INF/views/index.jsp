<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/2/2022
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<form action="/calculator" method="post">
   <label for="usd">usd: </label>
    <input type="text" id="usd" name="usd"> <br>
    <input type="submit" value="submit">
</form>
<h1>ket qua la :${result}</h1>

</body>
</html>
