package PatternQust;

import java.util.Scanner;

public class CharPattern {
public static void main(String[] args) {
	Scanner df=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=df.nextInt();
	int p='A';
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i;j++) {
			System.out.print((char)p);
			p++;
		}
		System.out.println();
	}
}
}
