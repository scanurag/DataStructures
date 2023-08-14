package Recursion;
public class Test1 {
public static void main(String[] args) {
	System.out.println("main start");
	System.out.println(m1(5));
	System.out.println("main end");
}
public static int m1(int i) {
	System.out.println(i++);
	int j=m2(i);
	System.out.println(i);
	System.out.println(j);
	return j;
}
public static int m2(int i) {
	System.out.println(i++);
	int j=m3(i);
	System.out.println(i);
	System.out.println(j);
	return j;
}
public static int m3(int i) {
	System.out.println(i);
	return i;
}
}
