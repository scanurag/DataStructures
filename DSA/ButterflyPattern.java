package DSA;
import java.util.*;
public class ButterflyPattern {
	public static void main(String[] args) {
		// ye code uper wale * ke liye kara rahe hai
		int n=5;
		//ye 1st parts ke  liye tha
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//ye spaces kitna dena hai uske bhich me uske liye hai
			int S=2*(n-i);
			for(int j=1; j<=S; j++) {
				System.out.print(" ");
			}
			//2nd part * ko print kara rahe hai
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//ye spaces kitna dena hai uske bhich me uske liye hai
			int S=2*(n-i);
			for(int j=1; j<=S; j++) {
				System.out.print(" ");
			}
			//2nd part * ko print kara rahe hai
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
