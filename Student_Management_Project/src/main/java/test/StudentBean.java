package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentBean implements Serializable
{
	private String rollNo,name,course;
	private MarksBean mb = new MarksBean();
	
	public StudentBean() {}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public MarksBean getMb() {
		return mb;
	}

	public void setMb(MarksBean mb) {
		this.mb = mb;
	}
	
	

}
