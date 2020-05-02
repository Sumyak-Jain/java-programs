<%-- 
    Document   : welcomepage
    Created on : 01-May-2020, 10:58:17 pm
    Author     : GAURAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>welcomepage</title>
    </head>
    <body>
        <h1>Welcome Mr./Ms</h1><%=request.getParameter("uname")%>
                
    </body>
</html>
