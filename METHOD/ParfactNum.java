package METHOD;
import java.util.Scanner;
public class ParfactNum {
	public static int NumParf(int n) {
		int num=n;
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) sum+=i;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner jh=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=jh.nextInt();
	int lh=NumParf(n);
	System.out.println(lh);
}
}
