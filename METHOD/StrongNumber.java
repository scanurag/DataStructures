package METHOD;
import java.util.Scanner;
public class StrongNumber {
public static int Stro(int n) {
	int sum=0;
	int num=n;
	n=num;
	while(n>0) {
		int d=n%10;
		int prod=1;
		for(int i=1;i<=d;i++) {
			prod*=i;
		}
		sum+=prod;
		n/=10;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int g=Stro(n);
	System.out.println(g);
}
}
