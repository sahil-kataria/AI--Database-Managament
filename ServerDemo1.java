import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class ServerDemo1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<link rel='stylesheet' href='abc.css'/>");
		out.println("<body>");
                out.println("<h1> hello world </h1>");
		try
		{
		}

		catch(Exception e)
		{
			out.println(e);
		}

		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}