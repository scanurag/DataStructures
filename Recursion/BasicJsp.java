package Recursion;
//rRyY24
public class BasicJsp {
public static void main(String[] args) {
	int i=1;
	m1(i);
}
public static void m1(int i) {
	System.out.println(i);
	if(i>=3) return;
	m1(++i);
	m1(++i);
	System.out.println(i);
}
}
//9451740469