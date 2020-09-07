<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>


</head>
<body>
<form action="AdminServlet" method="post">
<h1>Admin Login</h1>
<label>Enter Username : </label>
<input type="text" name="user" id="uname">
<br><br>
<label>Enter Password : </label>
<input type="password" name="pwd" id="pwd">
<br><br>
<button type="submit">submit</button><br><br>
</form>

</body>
</html>