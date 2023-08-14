package Recursion;
import java.util.Scanner;
public class PrimeNum {
public static void  PrimeNumCal(int i, int n) {
if(n==i) {
	System.out.println(" it is a even number"+i);
	return ;
}else System.out.println("Not a prime number"+i);

 if(n%i==0) return;
   PrimeNumCal(i+1,n);
}
public static void main(String[] args) {
	Scanner jp=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=jp.nextInt();
	if(n<=1) {
		System.out.println("enter value is not prime:)");
	}
PrimeNumCal(2,n); 
}
}
