package test;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		
	   String un=req.getParameter("uname");
	   String pass=req.getParameter("pass");
	   
	  AdminBean ub=LoginDAO.login(un,pass);
	  
	    res.setContentType("text/html");
	    
	    if(ub==null)
	    {
	    	req.setAttribute("msg", "Login Unsuccessful");
	    	RequestDispatcher rd=req.getRequestDispatcher("Msg.jsp");
	    	rd.forward(req, res);
	    }
	    else
	    {
	    	ServletContext sct=req.getServletContext();
	    	sct.setAttribute("bean", ub);
	    	Cookie a=new Cookie("fname",ub.getFname());
	    	res.addCookie(a);
	    	
	    	RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
	    	rd.forward(req, res);
	    }
	}

}
