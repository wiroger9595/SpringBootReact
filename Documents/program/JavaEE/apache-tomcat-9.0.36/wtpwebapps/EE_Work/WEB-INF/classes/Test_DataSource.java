import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.naming.*;
import javax.sql.*;
import java.sql.*;

public class Test_DataSource extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			                     throws ServletException, IOException {

		res.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = res.getWriter();
		Connection con = null;

		try {
			Context ctx = new javax.naming.InitialContext();
			DataSource ds = (DataSource) ctx
					.lookup("java:comp/env/jdbc/TestDB");
			con = ds.getConnection();

			out.println("Got Connection: " + con.toString());
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp2");
			while (rs.next()) {
				out.println("empNo = " + rs.getString(1));
			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException ignored) {}
		}

	}
}