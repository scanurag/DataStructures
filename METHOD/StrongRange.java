package METHOD;
import java.util.Scanner;
public class StrongRange {
public static void main(String[] args) {
	Scanner dg=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=dg.nextInt();
	int b=dg.nextInt();
	for(int i=a; i<=b;i++) {
		if(StrongNumber.Stro(i)==i) System.out.println(i);
	}
}
}
