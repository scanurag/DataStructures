package Garwej;
import java.util.Scanner;
public class decimal {
public static void main(String[] args) {
	Scanner gh=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=gh.nextInt();
	int m=gh.nextInt();
	for(int i=n;i<=m;i++)
	{
		System.out.println(Peal.dpic(i));
	}
}
}
