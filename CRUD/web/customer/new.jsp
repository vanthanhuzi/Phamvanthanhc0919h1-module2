<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/28/2019
  Time: 10:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add New Customer</title>
</head>
<body>
<p>
    <a href="list">List All Customer</a>
</p>
<h1 style="text-align: center">Add New Customer</h1>
<div align="center">
<form action="create" method="post" >

    <table border="1" cellpadding="5">
        <caption><h2>New Customer</h2></caption>
        <tr>
            <th>Id</th>
            <td>
                <c:if test="${message != null}">
                    <input style="color: red" value="${message}">

                </c:if>
                <input type="text" name="id" size="45">
            </td>
        </tr>
        <tr>
            <th>Name</th>
            <td>
                <input type="text" name="name" size="45" value="${customer.getName()}" >
            </td>
        </tr>
        <tr>
            <th>Email</th>
            <td>
                <input type="text" name="email" size="45" value="${customer.getEmail()}">
            </td>
        </tr>
        <tr>
            <th>Address</th>
            <td>
                <input type="text" name="address" size="45" value="${customer.getAddress()}">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="save">
            </td>
        </tr>
    </table>


</form>
</div>


</body>
</html>
