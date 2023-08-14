package Garwej;
import java.util.Scanner;
public class Aparfect {
public static void main(String[] args) {
	Scanner uk=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=uk.nextInt();
	int m=uk.nextInt();
	int sum=0;
	for(int i=n; i<=m;i++) {
		sum=0;
		for(int j=1; j<=i/2; j++) {
			if(i%j==0) {
				sum+=j;
			}
			
		}
		if(sum==i) {
			System.out.println(sum);
		}
	}
}
}
