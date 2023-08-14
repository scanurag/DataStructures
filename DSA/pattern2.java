package DSA;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner gj = new Scanner(System.in);
		System.out.println("Enter num");
		int n = gj.nextInt();
		// int A=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
				// A++;
			}
			System.out.println();
		}
	}
}