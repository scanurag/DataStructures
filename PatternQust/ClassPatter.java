package PatternQust;
import java.util.Scanner;
public class ClassPatter {
public static void main(String[] args) {
	Scanner hj=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=hj.nextInt();
	int fact=n*n;
	int num=n;
	int g=1;
	while(num>0) {
		g*=10;
		num/=10;
	}
	if(n==fact%g) System.out.println(n);
}
}
