package PatternQust;

import java.util.Scanner;

public class CharPattern2 {
public static void main(String[] args) {
	Scanner jh=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=jh.nextInt();
	for(int i=1, p='A';i<=n; i++, p++) {
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print((char)p);
		}
		System.out.println();
	}
}
}
