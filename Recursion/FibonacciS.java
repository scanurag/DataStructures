package Recursion;
public class FibonacciS {
public static void FibNum(int a,int b,int n) {
	if(n==0) {
		return;
	}
    int	c=a+b;
    System.out.println(c);
    FibNum(b,c,n-1);
}
public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	int n=10;
	FibNum(a,b,n-2);
}
}
