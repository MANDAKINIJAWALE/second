package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDao
{
	public int k=0;
	
	public int update(AdminBean ub)
	{
		
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement pm = con.prepareStatement("update Admin set mailid=?,phno=? where uname=? and pass=?");
			pm.setString(1, ub.getMailid());
			pm.setString(2, ub.getPhno());
			pm.setString(3, ub.getAdminName());
			pm.setString(4, ub.getAdminPass());
			
		    k=pm.executeUpdate();
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return k;
	}


}
