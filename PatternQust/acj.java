package PatternQust;
import java.util.Scanner;
public class acj {
	public static void main(String[] args) {
		Scanner dk=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=dk.nextInt();
		int b=dk.nextInt();
		int gcd=1;
		for(int i=1; i<=a &&i<=b; i++) {
			if(a%i==0&&b%i==0) gcd=i;
		}
	   int Lcm;
	   Lcm=a*b/gcd;
	   System.out.println(Lcm);
			   
		
	}

}
