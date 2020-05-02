<%-- 
    Document   : forward
    Created on : 01-May-2020, 10:47:13 pm
    Author     : GAURAV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.File"%>
<% if(request.getParameter("uname").equals("sumyak")&&request.getParameter("pwd").equals("jain"))
{%>
<jsp:forward page="welcomepage.jsp"/>
<%}else{%>
<h3> Invalid username or password </h3>
<%@include  file="Login.jsp" %>
<%}%>
