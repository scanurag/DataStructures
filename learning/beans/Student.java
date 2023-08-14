package learning.beans;
import java.io.Serializable;
public class Student implements Serializable {
	private String name,course;
	private int rollnumber;
	private float fees;
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
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String course, int rollnumber, float fees)
	{
		this.name = name;
		this.course = course;
		this.rollnumber = rollnumber;
		this.fees = fees;
	}
	 
	}


