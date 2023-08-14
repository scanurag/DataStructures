package Recursion;
public class Test3 {
public static void main(String[] args) {
	System.out.println(m1(1));
}
public static int m1(int n) {
	if(n==10)
		return 0;
	System.out.println(n);
	m1(n+1);
	System.out.println(n);
	m1(n+1);
	return n;
}
}
