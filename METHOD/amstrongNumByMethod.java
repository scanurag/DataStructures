package METHOD;
import java.util.Scanner;                                                    
public class amstrongNumByMethod {
//method to return length of a number
public	static int length(int n) {
		int len=0;
		while(n>0) {
			len++;
			n/=10;
		}
		return len;
	}
	//method to check given num is armstrong num
public	static int isArmstrong(int n) {
		//int num=n;
		int p=length(n);
		int sum=0;
		while(n>0) {
			int b=n%10;
			int fact=1;
			for(int i=1; i<=p;i++) {
				fact*=b;
			}
			sum+=fact;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		
		if(isArmstrong(n)==n) System.out.println("Enter Number is armsrong "+isArmstrong(n));
		else System.out.println("Enter number is not armstrong");
	}
}
