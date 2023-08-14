package learning.basics;
import java.util.Scanner;

public class CircaleArea {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius :");
		float radius= s.nextFloat();
		float area=3.14f*radius*radius;
		System.out.println("Area of circal for radius :" +radius+ " is " +area);
		s.close();
	}

}
