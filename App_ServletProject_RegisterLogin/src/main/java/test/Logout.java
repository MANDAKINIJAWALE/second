package test;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class Logout extends HttpServlet
{
   protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
	   Cookie c[]=req.getCookies();
	   
	   if(c==null)
	   {
		   req.setAttribute("msg", "Session Expired...");
		   req.getRequestDispatcher("Msg.jsp").forward(req, res);
	   }
	   else
	   {
		   ServletContext sct=req.getServletContext();
		   //AdminBean ub = (AdminBean)sct.getAttribute("bean");
		   sct.removeAttribute("bean");
		   c[0].setMaxAge(0);
		   res.addCookie(c[0]);
		   
		   req.setAttribute("msg", "Logout sucessfully...");
		   req.getRequestDispatcher("Msg.jsp").forward(req, res);
		   
	   }
	   
   }
}


