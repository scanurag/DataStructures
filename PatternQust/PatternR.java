package PatternQust;
import java.util.Scanner;
public class PatternR {
	public static void main(String[] args) {
		Scanner cse=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=cse.nextInt();
		for(int i=n; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=2;j<=n-i+1;j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
