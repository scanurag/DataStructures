package BasicJSP;
import java.util.Scanner;
public class test {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int num=0;
for(int i=1;i<=n;i++) {
	if(i%2!=0) {
		for(int j=1;j<=n;j++) {
			num=num+1;
			System.out.print(num);
			
		}
	}
	else {
		int temp=num+1;
		for(int j=num+5;j>=temp;j--) {
			num=num+1;
			System.out.print(j);
		
		}
	}
	System.out.println();
}
}
}
