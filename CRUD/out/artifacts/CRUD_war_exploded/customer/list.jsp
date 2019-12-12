<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/28/2019
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manager Customer Application</title>
</head>
<body>
<h1 style="text-align: center">Manager Customer</h1>
<h2 style="text-align: center">
    <a href="/new">Add New Customer </a> <br>
    <a href="/list">List All Customer </a>
</h2>
<div align="center">
    <table  border="1" cellpadding="5">
        <caption><h2>List of Customer</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td><c:out value="${customer.getId()}"></c:out></td>
                <td><c:out value="${customer.getName()}"></c:out></td>
                <td><c:out value="${customer.getEmail()}"></c:out></td>
                <td><c:out value="${customer.getAddress()}"></c:out></td>
                <td>
                    <a href="edit?id=<c:out value='${customer.getId()}'/> "> Edit </a>
                    <a href="deleted?id=<c:out value='${customer.getId()}'/>"> Deleted </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
