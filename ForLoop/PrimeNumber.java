package ForLoop;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner pr=new Scanner(System.in);
	System.out.println("Enter Number:");
	int n=pr.nextInt();
	boolean f=true;
	if(n<=1) f=false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			f=false;
			break;
		}
		
	}
	if(f) {
		System.out.println("PrimeNumber");
	}else {
		System.out.println("not is primeNumber");
	}
}
}
