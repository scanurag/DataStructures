package learning.basics;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]number=new int[3];
		System.out.println("Enter number1 :");
		number[0] = sc.nextInt();
		System.out.println("Enter number2 :");
		number[1] = sc.nextInt();
		System.out.println("Enter number3 :");
		number[2] = sc.nextInt();
		if(number[0]>number[1] && number[0]>number[2])
			System.out.println("largest number is :"+number[0]);
		else if(number[1]>number[0]&&number[1]>number[2])
			System.out.println("largest number is :"+number[1]);
		else if(number[2]>number[0] && number[2]>number[1])
			System.out.println("largest number is :"+number[2]);
	}

}
