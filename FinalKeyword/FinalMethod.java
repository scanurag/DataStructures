package FinalKeyword;
/*final */class ghj{ //class ko final kar diye to class ko extends nhi kar sakte
	public void m1() {
		System.out.println("I have a good logic");
	}
	public final void m2()
	{
		System.out.println("I have the best loic");
	}
}
class Fz extends ghj{
  public void m3() {
	  System.out.println("I have batter logic");
	  m2();
  }
}
public class FinalMethod {
	public static void main(String[] args) {
		Fz fz = new Fz();
			fz.m1();
			fz.m3();
	}

}
// ye kya dikhata hai ki hum final methode ko extends to kar sakte hai but override nhi kar sakte hai
