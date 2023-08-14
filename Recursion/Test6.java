package Recursion;
public class Test6 {
public static void main(String[] args) {
	System.out.println(m1(1));
}
public static int m1(int n) {
	if(n==5)
		return 0;
	System.out.println(n);
	m1(1+n);
	System.out.println(n);
	return n;
}
}
