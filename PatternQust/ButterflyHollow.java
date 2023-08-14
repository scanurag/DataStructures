package PatternQust;
import java.util.Scanner;
public class ButterflyHollow {
	public static void main(String[] args) {
		Scanner jp=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=jp.nextInt();
	 for(int i=1; i<=n;i++) {
		 for(int j=1; j<=i;j++) {
			 if(j==1||j==i||i==n) System.out.print("*");
		 else System.out.print(" ");
		 }
		 int Space=2*(n-i);
		 for(int j=1;j<=Space;j++) System.out.print(" ");
		 for(int j=i;j>=1;j--) {
			 if(j==1||j==i|| i==n) System.out.print("*");
			 else System.out.print(" ");
		 }
		 System.out.println();	 
	 }
	 for(int i=n-1; i>=1;i--) {
		 for(int j=1; j<=i;j++) {
			 if(j==1||j==i) System.out.print("*");
			 else System.out.print(" ");
		 }
			 
			 int S=2*(n-i);
		 for(int j=1;j<=S;j++) System.out.print(" ");
		 for(int j=i;j>=1;j--) {
			 if(j==1||j==i) System.out.print("*");
			 else System.out.print(" ");
		 }
		 System.out.println();	 
	 }
	 }
}
