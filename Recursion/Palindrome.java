package Recursion;
public class Palindrome {
public static void Pel(int n,int sum,int L) {
	if(n==0) {
		if(L==sum) System.out.println("it is a Pelindrom"+sum);
		else System.out.println("not a pelindrome");
		return;
	}
	int d=n%10;
	sum=(sum*10)+d;
	Pel(n/10,sum,L);
}
public static void main(String[] args) {
	int n=141;
	int L=n;
	Pel(n,0,L);
}
}
