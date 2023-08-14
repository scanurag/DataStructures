package ForLoop;
import java.util.Scanner;
public class sum {
public static void main(String[]args) {
	Scanner h1=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=h1.nextInt();
	 int sum=0;
	for(int i=1;i<=num;i++) {
		sum=sum+i;
	}
	System.out.println("anurag");
	System.out.println(sum);
}
}
