<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/25/2019
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
  <style>
    #content{
      background: white;
      width: 450px;
      margin: 0 auto;
      padding: 0px 20px 20px;
      border: solid navy 2px;
    }
    label{
      width: 10em;
      padding-right: 5em;
      float: left;
    }
    #data input{
      width: 15em;
      margin-bottom: 0.5em;
      float: left;
    }
  </style>


</head>
<body>

<div id="content">

  <h1> Product  DisCount Calculator</h1>
<form action="/display-discount" method="post" >
  <div id="data">
    <label> Product Description: </label>
    <input type="text" name="description" placeholder="Description">
    <br>
    <label> List Price: </label>
    <input type="text" name="listPrice" placeholder="ListPrice" >
    <br>
    <label> Discount Percent </label>
    <input type="text" name="discountPercent" placeholder="DiscountPercent">
  </div>
<div>
  <input type="submit" value="Discount_Product">
</div>


</form>
</div>
</body>
</html>
