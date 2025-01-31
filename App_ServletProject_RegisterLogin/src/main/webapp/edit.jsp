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
   String fname=(String)request.getAttribute("name");
   out.println("Page belongs to "+fname);
   AdminBean ub=(AdminBean)application.getAttribute("bean");
%>

<form action="update" method="post">
 <input type="text" name="mail" value=<%=ub.getMailid() %>><br><br>
 <input type="tel" name="phno" value=<%=ub.getPhno() %>><br><br><br>
 <input type="submit" value="UpdateProfile">
</form>

</body>
</html>