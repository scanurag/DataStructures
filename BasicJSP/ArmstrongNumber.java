package BasicJSP;
import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int num=n;
	int r=0;
	while(n>0) {
		r++;
		n/=10;
	}
	n=num;
	int sum=0;
	while(n>0){
		int d=n%10;
		int fact=1;
		for(int i=1; i<=r; i++) {
			fact*=d;
		}
		sum+=fact;
		n/=10;
	}
	
	if(num==sum)System.out.println("Is a armstrong Number: "+sum);
	else System.out.println("Not a Armstrong Number");
}
}
