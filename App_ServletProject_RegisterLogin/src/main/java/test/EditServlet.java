package test;
import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/Edit")
public class EditServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Cookie c[]=req.getCookies();
		
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
			
		}
		else
		{
			String fname = c[0].getValue();
			req.setAttribute("name", fname);
			
			
			req.getRequestDispatcher("edit.jsp").forward(req, res);
			
		}
	}

}
