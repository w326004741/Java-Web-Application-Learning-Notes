package ie.gmit.sw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGET invoked!");
		// 调用process方法
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPOST invoked!");
		// 调用process方法
		process(req, resp);
	}

	// 重构doGET方法为process，然后让doGET,doPOST分别调用process方法.(Refactor->Extract Method)
	private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// 获得用户的用户名和密码参数，利用HttpServletRequest请求
		// 调用login.jsp内的name属性 e.g. name="username"
		String username = req.getParameter("username1");
		String password = req.getParameter("password1");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// out是PrintWriter客户端，以字符串的形式输出。HelloWorld页面就是客户端
		out.println("<html><head><title>Login Result</title></head>");
		out.println("<body> username: " + username + "<br>");
		out.println("password: " + password + "</body></html>");

		out.flush(); // 缓存清空
		// 结束后，记得配置web.xml文件
	}
}
