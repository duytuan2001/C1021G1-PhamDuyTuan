<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/23/2022
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid" >
    <h1>Create Customer</h1>
    <a class="btn btn-success" href="/customer">Back to Customer List</a>
    <div class="row">
        <div class="col-12">
            <form action="/product?action=create" method="post">
                <div class="form-group">
                    <label for="name-customer">Name</label>
                    <input type="text" class="form-control" id="name-customer" name="product_id">
                </div>
                <div class="form-group">
                    <input type="hidden" class="form-control" name="product_name">
                </div>
                <div class="form-group">
                    <label for="price">Birthday</label>
                    <input type="date" class="form-control" id="price" name="price">
                </div>

                <div class="form-group">
                    <label for="quality">IdCard</label>
                    <input type="text" class="form-control" id="quality" name="quality">
                </div>


                <div class="form-group">
                    <label for="color">Address</label>
                    <input type="text" class="form-control" id="color" name="color">
                </div>
                <div class="form-group">
                    <label for="category">CustomerType</label>
                    <select class="form-control" id="category" name="category_name">
                        <c:forEach var="type" items="${categoryList}">
                            <option value="${type.idCategory}">${type.nameCategory}</option>
                        </c:forEach>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>