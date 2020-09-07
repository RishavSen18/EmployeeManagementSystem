<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Designation</th>
<th>Salary</th>
<th>Email</th>
<th>Mobile</th>
</tr>
<c:forEach items="${list}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.gender }</td>
<td>${e.designation }</td>
<td>${e.salary }</td>
<td>${e.email }</td>
<td>${e.mobile }</td>
</tr>
</c:forEach>
</table>
</body>
</html>