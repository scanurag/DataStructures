package learning.has_a_relationship;
import learning.beans.*;
public class ShowRoom {
	public static void main(String[] args) {
		Car c=new Car();
		c.setBrand("I20");
		c.setColor("white");
		Person p=new Person("Anurag",c);
		Car ob=p.getCr();
		System.out.println("brand :"+ob.getBrand());
		System.out.println("Color is :"+ob.getColor());
		System.out.println("Name of the Person is :"+p.getName());
	}

}
