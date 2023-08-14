package ForLoop;
import java.util.Scanner;
public class BinToNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner cs=new Scanner(System.in);
		int bit=cs.nextInt();
		int i=1;
		int sum=0;
		while(bit>0) {
			int bin=bit%10;
		sum=(bin*i)+sum;
			i*=2;
			bit/=10;
		}
		System.out.println(sum);
	}
}
