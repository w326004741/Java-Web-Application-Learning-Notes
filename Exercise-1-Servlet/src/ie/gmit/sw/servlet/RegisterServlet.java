package ie.gmit.sw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获得数据 （request.getParameter）
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String repassword = req.getParameter("repassword");
		int age = Integer.parseInt(req.getParameter("age"));

		String result = ""; // 先设置result字符串

		// 判断数据方法
		// && ＝ 并且
		if (password.equals(repassword) && age > 18) {
			result += " success"; // 输出字符串的信息 （result 加一个字符串）
		}
		if (!password.equals(repassword)) {
			result += " password != repass word";
		}
		if (age <= 18) {
			result += " age <= 18";
		}

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>Registration Result</title></head>");
		out.println("<body><h1>Your Result: " + result + " </h1></body></html>");

		out.flush();

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
