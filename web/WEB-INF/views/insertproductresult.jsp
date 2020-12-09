<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : errorinsertproduct
    Created on : Dec 9, 2020, 1:19:02 PM
    Author     : George.Pasparakis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! 
    boolean isError;
    String errMsg;
%>
<% 
    isError = (boolean)request.getAttribute("isError"); 
    if(isError) 
        errMsg = "error"; 
    else 
        errMsg = "success"; 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Insert Product - <%= request.getContextPath() %></title>
        <link rel='stylesheet' type='text/css' href='static/css/styles.css'>
    </head>
    <body>
        <%--<c:import url="../../static/menu.jsp"></c:import> perfect for inter comms --%>
        <%--<jsp:include page="../../static/menu.jsp" /> on own web app --%>
        <%@ include file="../../static/menu.jsp" %>
        <h1>Result Insert Product</h1>
        <div class="<%= errMsg %>">
            <p><h4><%= errMsg.toUpperCase() %> Code...:   <%= request.getAttribute("errorCode") %></h4></p>
            <p><h4><%= errMsg.toUpperCase() %> Message:   <%= request.getAttribute("errorMessage") %></h4></p>
            <p><h4>On Product...:   <%= request.getAttribute("product") %></h4></p>
        </div>
        <div class="redirect">
            <!-- link   to the newproduct.jsp == /product
                 button to the newproduct.jsp == /product
            -->
            <a href="<%= request.getContextPath() %>">Visit Home Page</a>
        </div>
    </body>
</html>
