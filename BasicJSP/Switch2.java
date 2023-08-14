package BasicJSP;
import java.util.Scanner;
public class Switch2 {
public static void main(String[] args) {
	Scanner h=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=h.nextInt();
	int year=h.nextInt();
	switch(n) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 11:
	case 12: System.out.println("in " +n+ "Months 31 days");
	break;
	case 4:
	case 6:
	case 9: System.out.println("in " +n+ " Months 30 days");	
	break;
	case 2: if(year%400==0||year%4==0&&year%100!=0) System.out.println("in 1 Months 29 days");
	else System.out.println("in 1 Months 28 days");
	}
}
}
