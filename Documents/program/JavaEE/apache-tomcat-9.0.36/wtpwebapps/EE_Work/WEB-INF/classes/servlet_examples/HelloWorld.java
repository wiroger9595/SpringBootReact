package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			                     throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<BIG>Hello World , 世界你好 !</BIG>");
		out.println("</BODY></HTML>");
	}

}
