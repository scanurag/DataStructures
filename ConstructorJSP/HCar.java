package ConstructorJSP;
class Show{
	static int CarNo;
	String CarName;
	String Color;
	static {
		CarNo=1000;
	}
	{
		CarNo++;
	}
	public Show(String CarName) {
		this.CarName=CarName;
		this.Color="Blue";
	}
	public Show(Show h) {
		this.CarName="Audi";
		this.Color="Red";
		
	}
	public void Display() {
		System.out.println(CarName);
		System.out.println(CarNo);
		System.out.println(Color);
		System.out.println("**************");
	}
}
public class HCar {
public static void main(String[] args) {
Show h=new Show("Bmw");
	h.Display();
Show h1=new Show(h);
	h1.Display();

	
}
}
