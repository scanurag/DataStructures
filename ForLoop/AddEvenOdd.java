package ForLoop;
import java.util.Scanner;
public class AddEvenOdd {
public static void main(String[] args) {
	Scanner cse=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=cse.nextInt();
	int even=0;
	int odd=0;
	while(n>0) {
		int d=n%10;
		if(d%2==0) {
			even+=d;
		}else{
			odd+=d;
		}
		n/=10;
	}
	System.out.println("The sum of all even Num is:"+even);
	System.out.println("The sum of all odd Num is:"+odd);
}
}
