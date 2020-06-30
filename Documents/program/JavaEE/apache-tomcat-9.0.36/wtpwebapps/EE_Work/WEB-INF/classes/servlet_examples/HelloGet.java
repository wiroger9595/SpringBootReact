package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloGet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			                     throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("Hello, 你好: " + name);
		out.println("</BODY></HTML>");
	}

}
