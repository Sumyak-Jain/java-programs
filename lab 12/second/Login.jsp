<%-- 
    Document   : Login
    Created on : 01-May-2020, 10:38:06 pm
    Author     : GAURAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <form action="forward.jsp" method="post">
        <h1>Enter the credentials</h1>
        <h3>Username: <input type="text" name="uname"/></h3>
           <h3>password: <input type="password" name="pwd"/></h3> 
            <input type="submit"  value="Submit">
            <input type="reset"/> 
        </form>
    </body>
</html>
