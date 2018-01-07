package ie.gmit.sw.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		// PrintWriter io字符流
		PrintWriter out = resp.getWriter();
		// out是PrintWriter客户端，以字符串的形式输出。HelloWorld页面就是客户端
		out.println("<html><head><title>Hello World Sample</title></head>");
		out.println("<body><h1>Hello World:" + new Date().toLocaleString() + " </h1></body></html>");
		// System.out.println() 永远是输出在命令行的内容(console内)
		System.out.println(new Date().toLocaleString());

		out.flush(); // 缓存清空

	}
}
