package ForLoop;
import java.util.Scanner;
public class FiboniacciSeries {
public static void main(String[] args) {
	Scanner dk=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=dk.nextInt();
	int a=0,b=1,c;
	for(int i=1; i<=n; i++) {
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}
}
}