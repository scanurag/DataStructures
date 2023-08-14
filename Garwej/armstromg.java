package Garwej;
import java.util.Scanner;
public class armstromg {
public static void main(String[] args) {
	Scanner hp=new Scanner(System.in);
	System.out.println("Enter a number");
	int num1=hp.nextInt();
	int num2=hp.nextInt();
	for(int i=num1;i<=num2; i++) {
		int n=i;
		int count=0;
		while(n>0) {
			count++;
			n/=10;//rishi12345
		}
	//int	r=count;
	      n=i;
		int sum=0;
		while(n>0) {
			int d=n%10;
			int fact=1;
			for(int j=1; j<=count;j++) {
				fact*=d;
			}
			sum+=fact;
			n/=10;
		}
		if(i==sum) System.out.println(sum);
	}
}
}
