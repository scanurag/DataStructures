package PatternQust;
import java.util.*;
public class PascalsTP {
public static void main(String[] args) {
	Scanner h=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=h.nextInt();
	for(int i=1; i<=n;i++)
	{
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		int C=1;
		for(int j=1;j<=i;j++) {
			System.out.print(C+" ");
			C=C*(i-j)/j;
		}
		System.out.println();
	}
}
}
