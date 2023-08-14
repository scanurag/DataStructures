package ForLoop;
import java.util.Scanner;
public class DecimalToBinary {//Number se binary hai
public static void main(String[] args) {
	Scanner cs=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=cs.nextInt();
	int i=1;
	int num=n;
	int sum=0;
	while(n>0) {
		int bit=n%2;
		//System.out.print(bit);
		sum=(bit*i)+sum;
		i*=10;
		n/=2;
	
	}
	System.out.println(sum);
}
}
