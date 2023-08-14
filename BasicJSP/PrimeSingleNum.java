package BasicJSP;
import java.util.Scanner;
public class PrimeSingleNum {
	public static void main(String[] args) {
		Scanner kl=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=kl.nextInt();
		int i;
		for( i=2;i<=n;i++) {
			if(n%i==0) {
				break;
			}
		}
		if(i==n) System.out.println("Number is even " +i); 
		else System.out.println("not a prime");
				}
	}
