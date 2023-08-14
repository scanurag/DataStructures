package Oops;
class Fn{
	static int i;
	public void m3() {
		System.out.println("i="+i);
	}
}
public class Text6 {
public static void main(String[] args) {
	Fn fn = new Fn();
	System.out.println(fn.i);
	fn.m3();
	
}
}
//******************jab tumhare pass do chiz ho ek ver static ho methods non static ho us time
