package ForLoop;
import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
	Scanner cse=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=cse.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int j=2;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	for(int i=n; i>=1; i--) {
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int j=i; j>=2;j--) {
			System.out.print(j);
		}
		System.out.println();
		
	}
}
}
