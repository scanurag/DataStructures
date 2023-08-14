package ForLoop;
import java.util.Scanner;
public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner pr2=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=pr2.nextInt();
		int m=pr2.nextInt();
		 int i,j;
		for( i=n; i<=m; i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0) 
					break;
			}
			if(i==j) {
				System.out.println(j);
			}
		}
	}

}
