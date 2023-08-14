package learning.basics;
import java.util.Scanner;

public class userRegistration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		System.out.println("Enter name :");
		String name=sc.nextLine();//delimiter enter where as next() delimiter in 
		System.out.println(name);
		System.out.println("Enter email");
		String email=sc.next();
		System.out.println(email);
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println(name+ " You can do registration");
		else
		
			System.out.println(name+"You cannots");
		sc.close();
	}

}
