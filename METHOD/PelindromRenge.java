package METHOD;
import java.util.Scanner;
public class PelindromRenge {
public static void main(String[] args) {
	Scanner kj=new Scanner(System.in);
	System.out.println("Enter a number:");
	int a=kj.nextInt();
	int b=kj.nextInt();
	for(int i=a;i<=b;i++) {
		if(Pelindrom.pel(i)==i)System.out.println(i);
	}
}
}
