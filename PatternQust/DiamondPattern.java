package PatternQust;
import java.util.Scanner;
public class DiamondPattern {
public static void main(String[] args) {
	Scanner jk=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=jk.nextInt();
    int spaces=n/2;
	int stars=1;
	for(int i=1; i<=n; i++){
		for(int j=1; j<=spaces; j++) {
			System.out.print("*");
		}
		for(int j=1; j<=stars; j++) {
			if(stars==9)
				{
				if(i+j==6||i+j==9)System.out.print("*");
				}
			else System.out.print(" ");
		}
		for(int j=1;j<=spaces;j++) System.out.print("*");
		System.out.println();
		if(i<=n/2) {
			spaces--;
			stars+=2;
		}else {
			spaces++;
			stars-=2;
			
		}
	}
}
}
