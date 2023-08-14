package BasicJSP;
import java.util.Scanner;
public class primeGr {
	public static void main(String[] args) {
		Scanner pr2=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=pr2.nextInt();
		int m=pr2.nextInt();
		 int i,j;
		 int count=0;
		for( i=m; i>=n; i--) {
			for( j=2;j<=i;j++) {
				if(i%j==0) {
					break;
				}
					
			}
			if(i==j) {
				
				count++;
				
				if(count==1) System.out.println("The gratest Prime Number "+j);
			}
		}
	}

}
