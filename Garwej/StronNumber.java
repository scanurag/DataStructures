package Garwej;
import java.util.Scanner;
public class StronNumber {
	  public static void main(String[] args) {
		   Scanner ph=new Scanner(System.in);
		   System.out.println("Enter a number");
		   int n=ph.nextInt();
		   int m=ph.nextInt();
		   for(int i=n; i<=m; i++) {
			int   num=i;
		    num=i;
		   int sum=0;
		   while(num>0) {
			   int g=num%10;
			   int fact=1;
			   for(int j=1; j<=g; j++) {
				   fact*=j;
			   }
			   sum+=fact;
			   num/=10;
		   }
		if(sum==i)   System.out.println(i);
		   }
	}
}
