package ForLoop;
import java.util.Scanner;
public class factorial {
public static void main(String[]args) {
	Scanner h2=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=h2.nextInt();
	 int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println("factorial is ");
	System.out.println(fact);
}
}
