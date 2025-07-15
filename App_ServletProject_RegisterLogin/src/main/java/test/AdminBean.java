package test;
public class AdminBean 
{
	
	private String AdminName;
	private String AdminPass;
	private String fname;
	private String lname;
	private String mailid;
	private String phno;
	 AdminBean()
	{
		
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPass() {
		return AdminPass;
	}
	public void setAdminPass(String adminPass) {
		AdminPass = adminPass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
       
    
}
