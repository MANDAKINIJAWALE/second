package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO
{
    public static AdminBean login(String a,String b)
    {
    	AdminBean bean=null;
    	try
    	{
    	Connection con=DBConnection.getCon();
    	
    	PreparedStatement pm=con.prepareStatement("select * from Admin where UNAME=? and PASS=?");
    	pm.setString(1, a);
    	pm.setString(2, b);
    	ResultSet k=pm.executeQuery();
    	if(k.next())
    			{
    		      bean=new AdminBean();
                  bean.setAdminName(k.getString(1));
                  bean.setAdminPass(k.getString(2));
                  bean.setFname(k.getString(3));
                  bean.setLname(k.getString(4));
                  bean.setMailid(k.getString(5));
                  bean.setPhno(k.getString(6));
    			}
        
    
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return bean;
    }
}
