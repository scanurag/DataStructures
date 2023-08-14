import java.util.Scanner;
public class Show1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	 
	int i;
	for(i=2;i<=n;i++) {
		if(n%i==0) {
			break;
		}
	}
	if(i==n) System.out.println("it is prime numer");
	else System.out.println("not a prime numbe");
}
}
