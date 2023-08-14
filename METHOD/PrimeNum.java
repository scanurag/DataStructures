package METHOD;
import java.util.Scanner;
public class PrimeNum {
public static boolean isPrime(int n)
{
	if(n<=1) return false;
	for(int i=2; i<=n/2; i++) {
		if(n%i==0) return false;
	}
	return true;
}
public static void main(String[] args) {
Scanner jk=new Scanner(System.in);
System.out.println("Enter a Number:");
int n=jk.nextInt();
if(isPrime(n)) System.out.println("it is Prime");
else System.out.println("not a Prime");
}
}
// isko dekho kai program me use kar sakte hai jayse range wale me use kar rahe hai
//but same package me hona chahiye 
//aur maan lo tum notepad pe likh rahe ho to program same follder me hona cahiye