<%-- 
    Document   : index
    Created on : Dec 10, 2020, 10:15:23 AM
    Author     : Home
--%>

<%@page import="models.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="product" class="models.Product" scope="request" />
        <%! Product product=new Product(); %>
        <% product.setName("AAA"); %>
        <jsp:setProperty name="product" property="name" value="LLL" />
        <%= product %>
    </body>
</html>
