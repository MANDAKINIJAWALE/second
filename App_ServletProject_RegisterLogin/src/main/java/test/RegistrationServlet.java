package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
    	AdminBean bean=new AdminBean();
    	bean.setAdminName(req.getParameter("uname"));
    	bean.setAdminPass(req.getParameter("pass"));
    	bean.setFname(req.getParameter("fname"));
    	bean.setLname(req.getParameter("lname"));
    	bean.setMailid(req.getParameter("email"));
    	bean.setPhno(req.getParameter("no"));
    	AdminDao a=new AdminDao();
    	
    	int k=a.register(bean);
    	res.setContentType("text/html");
    	if(k>0)
    	{
    		req.setAttribute("Msg", "Successfully Registerd...");
    		RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
    		rd.forward(req, res);
    	}
    	else
    	{
    		PrintWriter pw=res.getWriter();
    		pw.println("Not Successful register");
    	}
    	
    
    	 
    }
}
