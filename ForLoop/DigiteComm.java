package ForLoop;
import java.util.Scanner;
public class DigiteComm {
	public static void main(String[] args) {
		Scanner cse=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=cse.nextInt();
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.println(sum);
	}
}
