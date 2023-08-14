package learning.beans;

public class Person {
	private String name;
	private Car cr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCr() {
		return cr;
	}
	public void setCr(Car cr) {
		this.cr = cr;
	}
	public Person() {
		
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Car cr) {
		this.name = name;
		this.cr = cr;
	}


}
