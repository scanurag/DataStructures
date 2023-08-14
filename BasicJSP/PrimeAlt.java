package BasicJSP;
import java.util.Scanner;
public class PrimeAlt {
public static void main(String[] args) {
	Scanner fh=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=fh.nextInt();
	int m=fh.nextInt();
	int i,j;
	int count=0;
for( i=n; i<=m; i++) {
	for(  j=2; j<=i;j++) {
		if(i%j==0)
		{
			break;
		}
	}
	if(i==j) 
		{ 
		count++;
		if(count%2==0)System.out.println(j);
		}
}
}
}
