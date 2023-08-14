package BasicJSP;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner gf=new Scanner(System.in);
	System.out.println("Enter a year:");
	int Year=gf.nextInt();
	if(Year%400==0||Year%4==0&&Year%100!=0) {
		System.out.println(Year+" Year is LeapYear");
	}else {
		System.out.println(Year+" Year is not a LeapYear");
	}
}
}
