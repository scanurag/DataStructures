package www.aur.online.testing.opss;
import java.util.Scanner;
public class MobileDriver {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	boolean r=true;
	Mobile m=null;
	do {
		System.out.println("1.add\n2.fetch\n3.price\n4.change color\n5.Exit");
		int n=s.nextInt();
		switch(n) {
		case 1:{
			System.out.println("Enter Moblie name:");
			String name=s.next();
			System.out.println("Enter Mobile price:");
			double price=s.nextDouble();
			System.out.println("Enter Mobile ram:");
			int ram=s.nextInt();
			System.out.println("Enter Mobile rom:");
			int rom=s.nextInt();
			System.out.println("Enter Mobile color:");
			String color=s.next();
			m=new Mobile(name,price,ram,rom,color);
		}
		break;
		case 2:{
			if(m==null) System.out.println("No Mobile");
			else {
				m.show();
			}
		}
		break;
		case 3:{
			if(m==null) System.out.println("No Price Found:");
			else {
				System.out.println(m.getPrice());
			}
		}
		break;
		case 4:{
			if(m==null) System.out.println("No mobile :(");
			else {
				System.out.println("Enter new color:");
				String color=s.next();
				System.out.println("Old color"+m.getColor());
				m.setColor(color);
				System.out.println("Modifie d color"+m.getColor());
			}
		}
		break;
		case 5:{
			r=false;
			System.out.println("Thank you visit again:)");
		}
		break;
		default:{
			System.out.println("Plz Enter valid Num");
		}
		break;
		}
	}while(r);
}
}
