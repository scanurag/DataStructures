package Recursion;
public class FactDushara {
public static int Fact(int n) {
	if(n==0) return 1;
	return n*Fact(n-1);
}
public static void main(String[] args) {
	int n=5;
	Fact(n);
}
}
