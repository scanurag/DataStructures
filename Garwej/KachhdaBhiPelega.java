package Garwej;
import java.util.Scanner;
public class KachhdaBhiPelega {
public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=k.nextInt();
	int m=k.nextInt();
	int j,i;
	int count=0;
	for( i=n;i<=m;i++) {
		for(j=2;j<=i;j++) {
			if(i%j==0) {
				break;
			}
			
		}
		if(i==j) {
			count++;
	if(count%2!=0)		System.out.println(count+" "+j);
			
		}
	}
	
}
}
