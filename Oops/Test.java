package Oops;
import Oops.Ahf;//yeha dekho usi package ke dusre class ko use kar rahe hai
class A
{
	String message = "Today is Shivarathri";
}
class B
{
	public void showMessge() {
		System.out.println("Hsi,I wanna wish you Something");
		A a = new A();
		System.out.println(a.message);
	}
}
class C
{
	String wishes ="Good Evening";
	public static String greetings() {
		C c = new C();
		System.out.println(c.wishes);
		return "Have a blessed year and let success follow you,do hard work";
	}
}
class D
{
	public void wishesAndGreettings() {
	    B b=new B();//non static tha method me bhi object bana na padta hai
		b.showMessge();
		String greetings =C.greetings();//iske liye object creat karne ki jarurat nhi padi kiw kiw ki
		//mathod static ths Class name .mathod name kar dete hai
		System.out.println(greetings);
	}
}
public class Test {

	public static void main(String[] args) {
     D d = new D();
     d.wishesAndGreettings();
     Ahf std = new Ahf(); //object create karna jaruri rahta hai jis class ko import kiye ho
     Ahf.Collegeinfo();//ye dekhome isko Student.java ka method ko import kar rahe hai
     //aur ho bhi raha hahahaha ho ga kiw hi bsdk but uper dekho import kiye hai package 
     //import Oops.Ahf;
     //isi tarh tum ko sabka method ko us karna ho to import.packagename.*; package me bahut
     //sare tumhare class ho aur muntipal class ke method ko tum use karna chahte ho.
     //
	}

}
