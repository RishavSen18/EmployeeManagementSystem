<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete Employee</title>
</head>
<body>
<form action="DeleteByIdServlet" method="post">
<label>Enter Employee id to delete : </label>
<input type="text" name="id"><br><br>
<button type="submit">submit</button>
</form>
</body>
</html>