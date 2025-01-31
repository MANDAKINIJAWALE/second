package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewprofileServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Cookie []a=req.getCookies();
		res.setContentType("text/html");
		
		if(a==null)
		{
			req.setAttribute("msg", "Session Expired....");
			RequestDispatcher rd=req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
			
		}
		else
		{
			String fname = a[0].getValue();
			res.getWriter().println(fname);
			
			req.setAttribute("name", fname);
			RequestDispatcher rd=req.getRequestDispatcher("viewprofile.jsp");
			rd.include(req, res);
			
		}
		
	}

}
