package PatternQust;
import java.util.Scanner;
public class DiamondPattern2 {
public static void main(String[] args) {
	Scanner jkp=new Scanner(System.in);
	System.out.println("Enter a Nmber");
	int n=jkp.nextInt();
	int spaces=1;
	int stars=n/2;
	for(int i=1; i<=n; i++) {
		if (i==1||i==(n/2)+1) {
			for(int j=1; j<=n; j++) System.out.print("*");
		}else {
		for(int j=1; j<=stars; j++) System.out.print("*");
		for(int j=1; j<=spaces; j++) System.out.print(" ");
		for(int j=1;j<=stars;j++) System.out.print("*");
		}
		System.out.println();
		if(i<=n/2) {
			stars--;
			spaces+=2;
		}else {
			stars++;
			spaces-=2;
			
		}
	}
}
}
