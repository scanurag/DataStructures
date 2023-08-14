package METHOD;
import java.util.Scanner;
public class ArmStrong {
	public static int prime(int n) {
		int i,j;
		for( i=2;i<=n;i++) {
			if(n%i==0) {
				break;
			}
		} return i;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int o=prime(num);
		if(o==num) System.out.println("it is prime"+o);
		else System.out.println("it is not prime");
		
	}

}
