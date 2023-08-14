package PatternQust;
import java.util.Scanner;
public class PatternABDE {
public static void main(String[] args) {
	Scanner lp=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=lp.nextInt();
	char d='A';
	for(int i=1;i<=n;i++) {
		for(int j=1; j<=i;j++) {
			System.out.print(d);
		}
		int S=2*(n-i);
		for(int j=1;j<=S;j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print(d);
		}
		d++;
		System.out.println();
	}
	char g='A';
	for(int i=n; i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(g);
		}
		int G=2*(n-i);
		for(int j=1;j<=G;j++){
		System.out.print(" ");	
		}
		for(int j=1;j<=i;j++) {
			System.out.print(g);
		}
		g++;
		System.out.println();
	}
}
}
