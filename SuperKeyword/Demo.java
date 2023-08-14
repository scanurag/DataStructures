package SuperKeyword;
class A{
	public void show() {
		System.out.println("hello Viewer");
	}
}
class B extends A{
	public  void show() {
		super.show();
		System.out.println("hello Learner");
	}
}
public class Demo {
public static void main(String[] args) {
	B b = new B();
	b.show();
}
}
//Super Keyword Super class ke object ko refer karta hai
// ye tab use me ata hai jab hum sub class ke  object ke through hum super class ke method aur veriabale
//constructer ko call karana chahte hai to super key word ka use karte hai