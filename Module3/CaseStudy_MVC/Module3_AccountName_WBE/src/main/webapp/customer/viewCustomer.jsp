<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/20/2022
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<table>
    <div class="container-fluid">
        <div class="row">
            <div class="col-3">
            </div>
            <div class="col-9">
                <form method="post">
                    <div class="form-group">
                        <label for="customer-id">Code Customer: </label>
                        <span  class="form-control" id="customer-id" > ${customer.customerId}
                    </div>
                    <div class="form-group">
                        <label for="customer-code">Code Customer: </label>
                        <span class="form-control" id="customer-code"> ${customer.customerCode}
                    </div>
                    <div class="form-group">
                        <label for="customer-name">Name Customer: </label>
                        <span class="form-control" id="customer-name"> ${customer.customerName}
                    </div>
                    <div class="form-group">
                        <label for="customer-birthday">Birthday Customer: </label>
                        <span type="date" class="form-control" id="customer-birthday"> ${customer.customerBirthday}
                    </div>
                    <div class="form-group">
                        <label for="customer-gender">Gender Customer: </label>
                        <span class="form-control" id="customer-gender"> ${customer.customerGender}
                    </div>
                    <div class="form-group">
                        <label for="customer-id-card">IdCard Customer: </label>
                        <span class="form-control" id="customer-id-card" > ${customer.customerIdCard}
                    </div>
                    <div class="form-group">
                        <label for="customer-phone">Phone Customer: </label>
                        <span class="form-control" id="customer-phone" > ${customer.customerPhone}
                    </div>
                    <div class="form-group">
                        <label for="customer-email">Email Customer: </label>
                        <span class="form-control" id="customer-email"> ${customer.customerEmail}
                    </div>
                    <div class="form-group">
                        <label for="customer-address">Address Customer: </label>
                        <span class="form-control" id="customer-address" > ${customer.customerAddress}
                    </div>
                </form>
            </div>
        </div>
    </div>
</table>
<script src="/static/jquery/jquery-3.5.1.min.js"></script>
<script src="/static/bootstrap413/js/popper.min.js"></script>
<script src="/static/datatables/js/jquery.dataTables.min.js"></script>
<script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>
</body>

</html>
