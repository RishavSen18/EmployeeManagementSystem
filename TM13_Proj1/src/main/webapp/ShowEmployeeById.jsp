<%@page import="com.wipro.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show Employee</title>
</head>
<body>
<form action="ModifyServlet" method="post">
<h1>Employee Details</h1>

<%Employee e=(Employee)request.getAttribute("e");
out.println(e);
%>

<label>Id : </label>
<input type="text" name="id" value=<%=e.getId()%>><br><br>

<label>Name : </label>
<input type="text" name="name" value=<%=e.getName()%>><br><br>

<label>Gender : </label>
<input type="text" name="gender" value=<%=e.getGender() %>><br><br>

<label>Designation : </label>
<input type="text" name="designation" value=<%=e.getDesignation()%>><br><br>

<label>salary : </label>
<input type="text" name="salary" value=<%=e.getSalary()%>><br><br>

<label>City : </label>
<input type="text" name="city" value=<%=e.getCity() %>><br><br>

<label>Email : </label>
<input type="text" name="email" value=<%=e.getEmail() %>><br><br>

<label>mobile : </label>
<input type="text" name="mobile" value=<%=e.getMobile() %>><br><br>
<%
HttpSession s=request.getSession();
s.setAttribute("id", e.getId());
%>

<button type="submit">Modify</button>&nbsp&nbsp
</form>

</body>
</html>