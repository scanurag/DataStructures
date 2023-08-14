package PatternQust;
import java.util.Scanner;
public class Rombus {
public static void main(String[] args) {
	Scanner df=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=df.nextInt();
	for(int i=1; i<=n; i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
