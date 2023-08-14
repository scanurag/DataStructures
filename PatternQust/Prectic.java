package PatternQust;
import java.util.Scanner;
public class Prectic {
public static void main(String[] args) {
	Scanner j1=new Scanner(System.in);
	System.out.println("Enter Number:");
	int n=j1.nextInt();
	int space=n/2;
	int star=1;
	for(int i=1; i<=n;i++)
	{
		for(int j=1; j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=star; j++) {
			if(j==1||j==star||i==n/2+1)
			System.out.print("*");
			else System.out.print(" ");
		}
		if(i<=n/2) {
			space--;
			star+=2;
		}
		else {
			space++;
			star-=2;
		}
		
		System.out.println();
	}
}
}
