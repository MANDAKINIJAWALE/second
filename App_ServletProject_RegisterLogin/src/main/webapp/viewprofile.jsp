<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="test.AdminBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 String fname= (String)request.getAttribute("name");
 out.println("Page belongs to "+fname);
 AdminBean ub=(AdminBean)application.getAttribute("bean");
 out.println(ub.getAdminName()+"&nbsp&nbsp"+ub.getAdminPass()+"&nbsp&nbsp"+ub.getFname()+"&nbsp&nbsp"+ub.getLname()+"&nbsp&nbsp"+ub.getMailid()+"&nbsp&nbsp"+ub.getPhno());
   
%>
<a href="Edit">Edit</a>
<a href="logout">Logout</a>

</body>
</html>