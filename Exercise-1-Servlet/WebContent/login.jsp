<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
<!--/Exercise-1-Servlet这个前缀是在
/Users/weichenwang/Documents/workspace/web应用练习/Servers/Tomcat v7.0 Server at localhost-config/server.xml文件内的context
也可以将path的名字修改为任意名字。 -->


<form action="LoginServlet" method="post">
<!--指定表单提交目标，表示表单一点提交就会提交给指定资源，并向服务器发生请求
	2. 去web.xml查询调用servlet名称：LoginServlet
	3. 调用并实现LoginServlet.java类的功能代码 -->

<!--name是为了在其他类中能直接调用-->
 username: <input type="text" name="username1"><br>
 password: <input type="password" name="password1"><br>

<input type="submit" value="submit"> 
<input type="reset" value="reset">
</form>





</body>
</html>