package test;

import java.sql.Connection;

import java.sql.PreparedStatement;

public class AdminDao 
{
	public  int register(AdminBean bean)
	{
		int k=0;
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement pm=con.prepareStatement("insert into Admin values(?,?,?,?,?,?)");
			pm.setString(1, bean.getAdminName());
			pm.setString(2, bean.getAdminPass());
			pm.setString(3, bean.getFname());
			pm.setString(4, bean.getLname());
			pm.setString(5, bean.getMailid());
			pm.setString(6, bean.getPhno());
			
			 k=pm.executeUpdate();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
		
	}

}
