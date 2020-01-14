<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/25/2019
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" >
</head>
<body>
<h2>Currency Converter</h2>
<form action="/Convert" method="post">
  <label>Rate: </label><br/>
  <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
  <label>USD: </label><br/>
  <input type="text" name="usd" placeholder="USD" value="0"/><br/>
  <p name="kq"></p>
  <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>