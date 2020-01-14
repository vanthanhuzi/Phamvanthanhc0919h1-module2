<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/25/2019
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String description = request.getParameter("description");
    float price = Float.parseFloat(request.getParameter("listPrice"));
    int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));
    float discount =(float) (price*discountPercent*0.01);
    float total = price - discount;
%>
<h1>Product Description: <%= description %></h1>
<h1>Product price: <%= price %> </h1>
<h1>Product DiscountPercent: <%= discountPercent %> </h1>
<h1>Product Discount: <%= discount %> </h1>
<h1>Product total: <%= total %> </h1>
</body>
</html>
