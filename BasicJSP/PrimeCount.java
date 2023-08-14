package BasicJSP;
import java.util.Scanner;
public class PrimeCount {
public static void main(String[] args) {
Scanner	kj=new Scanner(System.in);
System.out.println("Enter a number:");
int n=kj.nextInt();
int m=kj.nextInt();
int i,j;
int count=0;
for(i=m;i>=n;i--) {
	for(j=2;j<=i;j++) {
		if(i%j==0) {
			break;
		}
	
	}
	if(i==j)
		{
		count++;
		if(count==1)
			System.out.println(j);
		}
}
}
}
