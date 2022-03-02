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
    <title>Employee list</title>
    <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.4/css/jquery.dataTables.css">
</head>

<a class="btn btn-success" href="http://localhost:8080/">Back to Home</a>
<body>

<style>
    h1,p {
        text-align: center;
    }
    form {
        display: inline-block;
    }
</style>

<h1>Employee list</h1>
<p>
<a class="btn btn-success" href="/employees?action=create">Add new employee</a>
</p>

<form>
    Search By Id<input type="search" name="search" placeholder="Search">
    <input type="text" name="action" hidden value="search">
    <input type="submit" value="search" hidden>
</form>

<form>
    Search By Name<input type="search" name="search" placeholder="Search">
    <input type="text" name="action" hidden value="search">
    <input type="submit" value="search" hidden>
</form>


<table border="1" id="employee" class="table table-striped table-bordered" style="width:100%">
    <thead>
    <tr>
        <td scope="col">Employee ID:</td>
        <td scope="col">Employee Name:</td>
        <td scope="col">Employee Birthday:</td>
        <td scope="col">Employee IdCard:</td>
        <td scope="col">Employee Salary:</td>
        <td scope="col">Employee Phone:</td>
        <td scope="col">Employee Email:</td>
        <td scope="col">Employee Address:</td>
        <td scope="col">Position Name:</td>
        <td scope="col">Education Degree Name:</td>
        <td scope="col">Division Name:</td>
        <td scope="col">User</td>
        <td scope="col">edit</td>
        <td>Delete</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employeeList}">
    <tr>
        <td>${employee.employeeId}</td>
        <td>${employee.employeeName}</td>
        <td>${employee.employeeBirthday}</td>
        <td>${employee.employeeIdCard}</td>
        <td>${employee.employeeSalary}</td>
        <td>${employee.employeePhone}</td>
        <td>${employee.employeeEmail}</td>
        <td>${employee.employeeAddress}</td>

        <td>${employee.positionName}</td>
        <td>${employee.educationDegreeName}</td>
        <td>${employee.divisionName}</td>
        <td>${employee.user}</td>
        <td>
            <button class="btn btn-warning">Edit</button>
        </td>
        <td>
            <button onclick="deleteEmployee('${employee.employeeId}','${employee.employeeName}')" type="button"
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
                Are you sure delete <span class="text-danger" id="employee-name"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden id="form-delete" method="post" action="/employee?action=delete">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="employee-id">
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
    $(document).ready(function() {
        $('#employee').DataTable();
    } );
</script>


<script>
    function deleteEmployee(id, name) {
        document.getElementById("employee-id").value = id;
        document.getElementById("employee-name").innerText = name;
    }
    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
</script>

</body>
</html>
