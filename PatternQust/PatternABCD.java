package PatternQust;
import java.util.Scanner;
public class PatternABCD{
public static void main(String[] args) {
	Scanner hg=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=hg.nextInt();
	char d='A';
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i;j++) {
			System.out.print(j);
			d++;
		}
	System.out.println();
	}
}
}
