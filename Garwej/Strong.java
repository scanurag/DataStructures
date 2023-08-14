package Garwej;
import java.util.Scanner;
public class Strong {
public static void main(String[] args) {
Scanner jk=new Scanner(System.in);
System.out.println("Enter a number:");
int n=jk.nextInt();
int m=jk.nextInt();
	for(int i=n;i<=m;i++) {
		int num=i;
		int sum=0;
		while(num>0) {
			int d=num%10;
			int fact=1;
			for(int j=1; j<=d; j++) {
				fact*=j;
			}
			sum+=fact;
			num/=10;
		}
		if(i==sum) System.out.println(sum);
	}
}
}
