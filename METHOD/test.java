package METHOD;
import java.util.Scanner;
public class test {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number:");
	int a=s.nextInt();
	int b=s.nextInt();
	for(int i=a;i<=b;i++) {
		if(ArmStrong.prime(i)==i) System.out.println(i);
	}
}
}
