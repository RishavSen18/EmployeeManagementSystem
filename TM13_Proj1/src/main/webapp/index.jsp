<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>

</head>
<body>
<center>
<h1>Employee Management System</h1>

<form action="addEmployee.jsp">
<button style="color:white; background-color:blue;" type="submit">Add Employee</button>
</form>

<br><br>

<form action="deleteEmployee.jsp">
<button style="color:white; background-color:blue;"; type="submit">Delete Employee</button>
</form>

<br><br>

<form action="modifyEmployee.jsp">
<button style="color:white; background-color:blue;" type="submit">Modify Personal Details</button>
</form>

<br><br>

<form action="showEmployee.jsp">
<button style="color:white; background-color:blue;" type="submit">Select Employee By Id</button>
</form>

<br><br>

<form action="ShowAllServlet" method="post">
<button style="color:white; background-color:blue;" type="submit">Select All Employee</button>
</form>
</center>
</body>
</html>