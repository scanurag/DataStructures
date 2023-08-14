package ForLoop;
import java.util.Scanner;
public class gk {
public static void main(String[]args) {
	Scanner hf=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=hf.nextInt();
	int n=num;
	int r=0;
	while(num>0);
	{
		r++;
		num/=10;
	}
	int num1=n;
	int sum=0;
	while(num1>0) {
		int df=num%10;
		int fact=1;
		for(int i=1; i<=r;i++) {
			fact*=df;
		}
		sum+=fact;
		num1/=10;
	}
	if(n==sum)System.out.println(sum);
	
}
}
