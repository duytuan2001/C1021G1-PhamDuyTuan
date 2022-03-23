$(document).ready(function () {

    function deleteCustomer(id, name) {
        document.getElementById("customer-id").value = id;
        document.getElementById("customer-name").innerText = name;
    }

    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
});