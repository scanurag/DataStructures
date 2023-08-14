package ForLoop;
import java.util.Scanner;
public class FullPyramid {
	public static void main(String[] args) {
		Scanner hj=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=hj.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j=2; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
