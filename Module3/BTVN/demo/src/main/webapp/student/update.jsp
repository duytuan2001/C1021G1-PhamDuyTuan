<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/14/2022
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    Code Student : <input type="text" name="codeStudent" value="${student.codeStudent}" readonly> <br>
    Name Student : <input type="text" name="nameStudent" value="${student.nameStudent}"> <br>
    Birthday : <input type="date" name="birthday" value="${student.birthday}"> <br>
    Email : <input type="text" name="email" value="${student.email}"> <br>
    Point: <input type="number" name="point" value="${student.point}"><br>
    <button type="submit">Update Student</button>
</form>
</body>
</html>
