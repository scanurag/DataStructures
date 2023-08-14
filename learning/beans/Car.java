package learning.beans;

public class Car {
	private String brand,color;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car() {
		
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String color) {
		
		this.brand = brand;
		this.color = color;
	}

}
