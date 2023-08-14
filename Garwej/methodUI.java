package Garwej;
public class methodUI {
static void m1(int a) {
	a*=3;
	System.out.println("int m1(),a="+a);
}
public static void main(String[] args) {
	int a=5;
	m1(a);
	System.out.println("int main, a=" +a);
}
}
