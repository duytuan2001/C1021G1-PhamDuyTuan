<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/6/2022
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="display" method="post" modelAttribute="email">
    <table>
        <tr>
            <td> <form:label path="language">Languages:</form:label></td>
            <td>
                <form:select path="language">
                    <option value="English">English</option>
                    <option value="Vietnamese">Vietnamese</option>
                    <option value="Japanese">Japanese</option>
                    <option value="Chinese">Chinese</option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size:</form:label></td>
            <td>
                Show
                <form:select path="pageSize">
                    <option value="selected">Selected</option>
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <option value="15">15</option>
                    <option value="25">25</option>
                    <option value="50">50</option>
                    <option value="100">100</option>
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <td><form:label path="spamsFilter">Spans filter:</form:label></td>
            <td><form:checkbox path="spamsFilter" value="Enable spans filter"/> Enable spans filter</td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature:</form:label></td>
            <td><form:input path="signature"/></td>
        </tr>
        <tr>
            <td>
                <form:button value="submit">Update</form:button>
            </td>
            <td><input type="reset" value="cancel"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
