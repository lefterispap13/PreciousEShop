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
        <jsp:useBean id="customer" class="models.Customer" scope="application"/>
        <jsp:setProperty name="customer" property="email" value="paspa@hotmail.com" />
        
        
        
        <jsp:useBean id="product" class="models.Product" scope="application" />
        <%-- <%! Product product=new Product(); %> --%>
        <%-- <% product.setName("AAA"); %>  --%>
        <jsp:setProperty name="product" property="name" value="KKK" />
        
        <%-- <% product.setName("AAA"); %> --%>
        <%= product %><br/>
        product: ${product} <br/>  <%-- allh lush gia na tupwsoume to product 
                                        edw pou 8a exoume orisei sto beaN--%>
        customer: ${customer}
    </body>
</html>
