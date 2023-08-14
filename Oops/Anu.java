package Oops;
class Klm{
	int i;
	public void m1() {
		System.out.println(i);
	}
}

public class Anu {
public static void main(String[] args) {
	Klm a1=new Klm();
	a1.m1();
	a1.i=23;
	System.out.println(a1.i);
}
}
