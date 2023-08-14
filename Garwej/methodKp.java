package Garwej;
public class methodKp {
public static void main(String[] args) {
	m1();
	int j=m1()*3;
	System.out.println("j="+j);
	System.out.println(m1());
}
static int m1() {
	System.out.println("exequt");
	return 10;
}
}
