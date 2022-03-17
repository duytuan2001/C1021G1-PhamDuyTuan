<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/16/2022
  Time: 11:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-9">
            <form action="/customer?action=create" method="post">

                <div class="form-group">
                    <label for="customer_code">Code</label>
                    <input type="text" class="form-control" id="customer_code" name="customer_code">
                </div>

                <div class="form-group">
                    <label for="customer_name">Name</label>
                    <input type="text" class="form-control" id="customer_name" name="customer_name">
                </div>

                <div class="form-group">
                    <label for="customer_birthday">Birthday</label>
                    <input type="date" class="form-control" id="customer_birthday" name="customer_birthday">
                </div>
                <div class="form-group">
                    <label for="customer_gender">Gender</label>
                    <select class="form-control" id="customer_gender" name="customer_gender" required>
                        <option  value="">Chọn...</option>
                        <option value="true" >Nam</option>
                        <option value="fal se" >Nữ</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="customer_id_card">Id Card Customer</label>
                    <input type="text" class="form-control" id="customer_id_card" name="customer_id_card">
                </div>
                <div class="form-group">
                    <label for="customer_phone">Phone</label>
                    <input type="text" class="form-control" id="customer_phone" name="customer_phone">
                </div>
                <div class="form-group">
                    <label for="customer_email">Email</label>
                    <input type="text" class="form-control" id="customer_email" name="customer_email">
                </div>
                <div class="form-group">
                    <label for="customer_address">Address</label>
                    <input type="text" class="form-control" id="customer_address" name="customer_address">
                </div>
                <div class="form-group">
                    <label for="category">CustomerType</label>
                    <select class="form-control" id="category" name="customer_type_id">
                        <c:forEach var="type" items="${customerTypeList}">
                            <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                        </c:forEach>
                    </select>
                </div>
                <a class="btn btn-success" href="/customer">Back to list</a>
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
