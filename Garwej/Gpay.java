package Garwej;
import java.util.Scanner;
public class Gpay {
public static void main(String[] args) {
	Scanner hj=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=hj.nextInt();
	//int m=hj.nextInt();
	 int r=0;
		while(n>0) {
			
			n/=10;
			r++;
		}
	int  num=n;
	 int sum=0;
	for(int i=1; i<=r; i++) {
		int d=n%10;
		sum=(sum*10)+d;
		n/=10;
		
	}
	System.out.println(sum);
}
}
