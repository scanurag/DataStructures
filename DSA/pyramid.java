package DSA;
import java.util.Scanner;
public class pyramid {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the valu of n:-");
		Scanner gs=new Scanner(System.in);
		n=gs.nextInt();
		char A='A';
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=1; j--){
				System.out.print(A);
				
			}
			A++;
			System.out.println();
		}
	}

}
