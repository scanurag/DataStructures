package DSA;
import java.util.Scanner;
public class InvertedHalfPyramid {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the valu of n:-");
		Scanner gs=new Scanner(System.in);
		n=gs.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
