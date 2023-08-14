package PatternQust;
import java.util.Scanner;
public class PatterH {
public static void main(String[] args) {
	Scanner gh=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=gh.nextInt();
	for(int i=1; i<=n; i++) {
		for(int j=1;j<=n-i+1; j++) {
			if(i==1||j==1||i+j==n+1) {
				System.out.print("*");
			}
			else System.out.print(" ");
		}
		System.out.println( );
	}
}
}
