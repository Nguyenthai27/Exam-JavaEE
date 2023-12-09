<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1> List Product</h1>
<a href="/sale/list">Sale List</a>
<table border="1">
    <tr>
        <th>Prod ID</th>
        <th>ProdName</th>
        <th>Description</th>
        <th>DateOfManf</th>
        <th>Price</th>
    </tr>
    <c:forEach var="product" items="${products}" varStatus="loop">
        <tr>
            <td>${product.prodId}</td>
            <td>${product.prodName}</td>
            <td>${product.description}</td>
            <td>${product.dateOfManf}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>