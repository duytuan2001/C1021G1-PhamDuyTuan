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
    <title>Customer List</title>
    <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.4/css/jquery.dataTables.css">
</head>
<a class="btn btn-success" href="http://localhost:8080/">Back to Home</a>
<body>

<style>
    h1, p {
        text-align: center;
    }

    form {
        display: inline-block;
    }
</style>


<h1>Customer list</h1>
<p>
    <a class="btn btn-success" href="/customer?action=create">Add new Customer</a>
</p>

<form>
    Search By Name<input type="search" name="search" placeholder="Search">
    <input type="text" name="action" hidden value="search">
    <input type="submit" value="search" hidden>
</form>

<table border="1" id="customer" class="table table-striped table-bordered" style="width:100%">
    <thead>
    <tr>

        <td scope="col">Customer Code</td>
        <td scope="col">Customer name</td>
        <td scope="col">Customer birthday</td>
        <td scope="col">customer Gender</td>
        <td scope="col">customer IdCard</td>
        <td scope="col">customer Phone</td>
        <td scope="col">customer Email</td>
        <td scope="col">customer Address</td>
        <td scope="col">Customer Type Id</td>
        <td scope="col">Edit</td>
        <td>Delete</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customer}">
        <tr>
            <td><a href="/customer?action=view&id=${customer.customerId}">${customer.customerCode}</a></td>
            <td>${customer.customerName}</td>
            <td>${customer.customerBirthday}</td>
            <td>${customer.customerGender ? 'Nam':'Nữ'}</td>
            <td>${customer.customerIdCard}</td>
            <td>${customer.customerPhone}</td>
            <td>${customer.customerEmail}</td>
            <td>${customer.customerAddress}</td>

            <td>${customer.customerTypeName}</td>
            <td>
                <button class="btn btn-warning"><a href="/customer?action=edit&id=${customer.customerId}">Edit</a></button>
            </td>
            <td>
                <button onclick="deleteCustomer('${customer.customerId}','${customer.customerName}')" type="button"
                        class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure delete <span class="text-danger" id="customer-name"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>

<form hidden id="form-delete" method="post" action="/customer?action=delete">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="customer-id">
</form>

<script src="/static/jquery/jquery-3.5.1.min.js"></script>
<script src="/static/bootstrap413/js/popper.min.js"></script>
<script src="/static/datatables/js/jquery.dataTables.min.js"></script>
<script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap4.min.js"></script>

<script>
    $(document).ready(function () {
        $('#customer').DataTable();
    });
</script>

<script>
    function deleteCustomer(id, name) {
        document.getElementById("customer-id").value = id;
        document.getElementById("customer-name").innerText = name;
    }

    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
</script>

</body>
</html>
