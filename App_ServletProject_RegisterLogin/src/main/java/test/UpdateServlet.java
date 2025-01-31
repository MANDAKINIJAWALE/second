package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
   protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
	   Cookie c[]=req.getCookies();
	   res.setContentType("text/html");
	   
	   if(c==null)
	   {
		   req.setAttribute("msg", "Session Expired");
		   req.getRequestDispatcher("Msg.jsp").forward(req, res);
	   }
	   else
	   {
		   String fname = c[0].getValue();
		   req.setAttribute("name", fname);
		   ServletContext sct=req.getServletContext();
		   AdminBean ub = (AdminBean)sct.getAttribute("bean");
		   ub.setMailid(req.getParameter("mail"));
		   ub.setPhno(req.getParameter("phno"));
		   
		   UpdateDao updateD=new UpdateDao();
		  int k = updateD.update(ub);
		   res.getWriter().println(k);
		   if(k>0)
		   {
			   
			  req.setAttribute("msg", "Data Updated Successfully...");
			   req.getRequestDispatcher("updated.jsp").forward(req, res);
			   
		   }
		   
	   }
   }
}
