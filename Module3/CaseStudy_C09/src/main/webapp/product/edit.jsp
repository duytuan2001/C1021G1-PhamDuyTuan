<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/23/2022
  Time: 6:29 PM
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
    <h1>Update Customer</h1>
    <a class="btn btn-success" href="/customer">Back to Customer List</a>
    <div class="row">
        <div class="col-12">
            <form method="post">
                <div class="form-group">
                    <input type="hidden" class="form-control"  name="id-customer" value="${customer.idCustomer}">
                </div>
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" id="name" name="name-customer" value="${customer.nameCustomer}">
                </div>
                <div class="form-group">
                    <input type="hidden" class="form-control" name="code-customer" value="${customer.customerCode}">
                </div>
                <div class="form-group">
                    <label for="birth">Birthday</label>
                    <input type="date" class="form-control" id="birth" name="birthday" value="${customer.birthday}">
                </div>
                <div class="form-group">
                    <label for="sex">Gender</label>
                    <select class="form-control" id="sex" name="gender" required>
                        <option  value="${customer.gender}">Chọn...</option>
                        <option value="true" >Nam</option>
                        <option value="false" >Nữ</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="cards">IdCard</label>
                    <input type="text" class="form-control" id="cards" name="card" value="${customer.idCard}">
                </div>
                <div class="form-group">
                    <label for="phones">Phone</label>
                    <input type="text" class="form-control" id="phones" name="phone" value="${customer.phone}">
                </div>
                <div class="form-group">
                    <label for="emails">Email</label>
                    <input type="text" class="form-control" id="emails" name="email" value="${customer.email}">
                </div>
                <div class="form-group">
                    <label for="addresss">Address</label>
                    <input type="text" class="form-control" id="addresss" name="address" value="${customer.address}">
                </div>
                <div class="form-group">
                    <label for="ok">CustomerType</label>
                    <select class="form-control" id="ok" name="idCustomerType">
                        <c:forEach var="type" items="${customerTypeList}">
                            <option value="${type.idCustomerType}">${type.nameCustomerType}</option>
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
