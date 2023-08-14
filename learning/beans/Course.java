package learning.beans;

public class Course {
	private String name,duration,id;
	private float fees;//properties
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public Course() {
		
	}
	public Course(String name, String duration, String id, float fees) {
		this.name = name;
		this.duration = duration;
		this.id = id;
		this.fees = fees;
	}


}
