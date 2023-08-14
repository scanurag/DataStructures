package ForLoop;
import java.util.Scanner;
public class abc {
public static void main(String[] args) {
Scanner jk=new Scanner(System.in);
System.out.println("Enter Number");
int n=jk.nextInt();
for(int i=n; i>=1; i--) {
	for(int j=1; j<=i; j++) {
		System.out.print(j);
	}
	System.out.println();
}
}
}
