package DSA;
import java.util.Scanner;
public class patterns {
	public static void main(String args[]) {
		int n;
		int m;
		System.out.println("Enter valu of n:");
		System.out.println("Enter valu of m:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||i+j==n+1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
