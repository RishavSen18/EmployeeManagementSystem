<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add employee</title>
</head>
<body>
<form action="AddServlet" method="post">
<h1>Provide Details</h1>
<label>Name : </label>
<input type="text" name="name" ><br><br>

<label>Gender : </label>
<input type="radio" name="gender" value="male" > male
<input type="radio" name="gender" value="female" > female
<br><br>
<label>Designation : </label>
<input type="text" name="designation" >
<br><br>
<label>salary : </label>
<input type="text" name="salary" >
<br><br>
<label>City : </label>
<input type="text" name="city" >
<br><br>
<label>Email : </label>
<input type="email" name="email" >
<br><br>
<label>mobile : </label>
<input type="text" name="mobile" >
<br><br>

<button type="submit">submit</button>
<br><br>
</form>
</body>
</html>