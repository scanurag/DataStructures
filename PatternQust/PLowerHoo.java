package PatternQust;
import java.util.Scanner;
public class PLowerHoo {
public static void main(String[] args) {
	Scanner kj=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=kj.nextInt();
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=5;j++) {
			if(i==1||i==j||j==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
