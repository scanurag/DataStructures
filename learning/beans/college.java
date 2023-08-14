package learning.beans;

public class college {
	private String college_name;
	private Course c;
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public college() {
		// TODO Auto-generated constructor stub
	}
	public college(String college_name, Course c) {
		this.college_name = college_name;
		this.c = c;
	}

}
