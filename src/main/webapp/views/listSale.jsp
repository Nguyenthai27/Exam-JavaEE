<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Sale By Product</title>
</head>
<body>
<h1> List Sale</h1>
<a href="/product/list">Product List</a>
<table border="1">
    <tr>
        <th>Sale No.</th>
        <th>Salesman ID</th>
        <th>Product ID</th>
        <th>Salesman Name</th>
        <th>DOS</th>
    </tr>
    <c:forEach var="sale" items="${sales}" varStatus="loop">
        <tr>
            <td>${sale.slNo}</td>
            <td>${sale.salesmanId}</td>
            <td>${sale.product.prodId}</td>
            <td>${sale.salesmanName}</td>
            <td>${sale.dos}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>