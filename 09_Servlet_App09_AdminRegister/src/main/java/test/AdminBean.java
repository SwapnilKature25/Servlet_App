package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminBean {
	private String name;
	private String pass;
	private String mid;
	private String fName;
	private String lName;
	private long phno;
	
	
	public AdminBean() {}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}


	@Override
	public String toString() {
		return "AdminBean [name=" + name + ", pass=" + pass + ", mid=" + mid + ", fName=" + fName + ", lName=" + lName
				+ ", phno=" + phno + "]";
	}
	
	
	
	
	
	
}
