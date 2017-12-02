<%-- 
    Document   : newjsp
    Created on : Nov 26, 2017, 2:16:27 AM
    Author     : akifraza
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! <%out.print (request.getParameter("emailaddress"));%></h1>

    </body>
</html>
