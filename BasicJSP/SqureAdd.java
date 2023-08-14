package BasicJSP;
import java.util.Scanner;
public class SqureAdd {
public static void main(String[] args) {
	Scanner np=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=np.nextInt();
	int num=n,sum=0;
while(n>0) {
	int d=n%10;
	int v=d*d;
	sum+=v;
	n/=10;
}
System.out.println(sum);
}
}
