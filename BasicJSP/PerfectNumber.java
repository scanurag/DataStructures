package BasicJSP;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner jky=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=jky.nextInt();
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) sum+=i;
		}
		if(n==sum) System.out.println("it a perfectNumbrt"+sum);
		else System.out.println("Not a perfectNumber");
	}

}
