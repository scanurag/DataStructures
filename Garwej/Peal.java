package Garwej;
import java.util.Scanner;
public class Peal {
	public static int dpic(int n) {
		int sum=0;
		int i=1;
		while(n>0) {
			int d=n%2;
			sum=(d*i)+sum;
				i*=10;
			n/=2;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner hj=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=hj.nextInt();
	int g=dpic(n);
	System.out.println(g);
	
}
}
