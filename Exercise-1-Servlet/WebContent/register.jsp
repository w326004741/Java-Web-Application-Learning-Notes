<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

	<form action="RegisterServlet" method="post">
		username: <input type="text" name="username"><br>
		password: <input type="password" name="password"><br>
		repassword: <input type="password" name="repassword"><br>
		age: <input type="text" name="age"><br> <input
			type="submit" value="submit">
	</form>

</body>
</html>