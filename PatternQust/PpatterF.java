package PatternQust;
import java.util.Scanner;
public class PpatterF {
public static void main(String[] args) {
	Scanner ho=new Scanner(System.in);
			System.out.println("Enterr a Number");
	int n=ho.nextInt();
	int star=1;
	int spaccc=n/2;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=spaccc;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			if(j==1||j==star||i==n/2+1) {
			System.out.print("*");
			}else System.out.print(" ");
		}
		System.out.println();
		if(i<=n/2) {
			spaccc--;
			star+=2;
		}else break;
	
	}
}
}
