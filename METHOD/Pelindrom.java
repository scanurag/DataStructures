package METHOD;
import java.util.Scanner;
public class Pelindrom {
public static int pel(int n) {
	int num=n;
	int sum=0;
	n=num;
	while(n>0) {
		int d=n%10;
		sum=(sum*10)+d;
		n/=10;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner gk=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=gk.nextInt();
	int d=pel(n);
	System.out.println(d);
}
}
