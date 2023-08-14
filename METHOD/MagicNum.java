package METHOD;
import java.util.Scanner;
public class MagicNum {
public static int Magic(int n) {
	int num=n;
	int sum;
	while(num>=10) {
		n=num;
		 sum=0;
		while(n>0){
			int d=n%10;
			sum+=d;
			n/=10;
		}
	num=sum;
	}
	return num;
	
}
public static void main(String[] args) {
	Scanner jk=new Scanner(System.in);
	System.out.println("Enter a numbere:");
	int n=jk.nextInt();
	int m=Magic(n);
	System.out.println(m);
}
}
