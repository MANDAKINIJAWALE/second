<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ub=(AdminBean) (application.getAttribute("bean"));
  out.println("Login Sussessful...");
  out.println("Welcome User "+ub.getFname());
  
%>
<a href="view">ViewProfile</a>
<a href="logout">Logout</a>


</body>
</html>