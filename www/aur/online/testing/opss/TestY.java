package www.aur.online.testing.opss;

	class Bike{
		
	}
	class KTm extends Bike{
		
	}

class A{
	public void m1(Bike b) {
		System.out.println("Super bike");
	}
	public void m1(KTm k) {
		
		System.out.println("KTm");
	}
}
class B extends A{
	public void m1(Bike b) {
		System.out.println("Sub bike");
	}
	public void m1(KTm k) {
		System.out.println("KTm");
	}
}
public class TestY {
public static void main(String[] args) {
	A a1=new A();
	Bike b=new KTm();
	a1.m1(b);
}
}
