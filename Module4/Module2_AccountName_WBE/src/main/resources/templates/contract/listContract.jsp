<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/17/2022
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product List</title>
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css">
</head>
<body>
<h1>Products</h1>
<p>
  <a href="/contracts?action=create">Create new product</a>
</p>

<form>
  <input type="text" name="search" placeholder="Search By Name">
  <input type="text" name="action" hidden value="search">
  <button>Search</button>
</form>
<table border="1" id="example" class="table table-striped table-bordered" style="width:70%">
  <thead>
  <tr>
    <td>Name</td>
    <td>Price</td>
    <td>Description</td>
    <td>producer</td>
    <td>Edit</td>
    <td>Delete</td>
  </tr>
  </thead>
  <tbody>
  <c:forEach items='${requestScope["contracts"]}' var="contract">
    <tr>
      <td><a href="/contracts?action=view&id=${contract.getIdProduct()}">${contract.getNameProduct()}</a></td>
      <td>${contract.getPriceProduct()}</td>
      <td>${contract.getDescriptionProduct()}</td>
      <td>${contract.getProducer()}</td>
      <td><a href="/contracts?action=edit&id=${contract.getIdProduct()}">edit</a></td>
      <td><a href="/contracts?action=delete&id=${contract.getIdProduct()}">delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap4.min.js"></script>
<script>
  $(document).ready(function() {
    $('#example').DataTable();
  } );
</script>
  </body>
</html>
