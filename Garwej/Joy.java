package Garwej;
import java.util.Scanner;
public class Joy {
public static void main(String[] args) {
	Scanner j1=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=j1.nextInt();
	int a=n*3;
	int b=a+3;
	int c=b*3;
	int v=c;
	int sum=0;
	int num=n;
	v=c;
	while(v>0) {
		int f=v%10;
		sum=sum+f;
		v/=10;
	}
	System.out.println(sum);
}
}
