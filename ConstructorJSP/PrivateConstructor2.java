package ConstructorJSP;
class Gf{
	static int count;
	private Gf() {
		count++;
	}
	public static Gf getI() {//helper method ka help liye hai is  cass me hamesa static method 
		//ka use karete hai kiw ki iske liye object creat karne ki jarurat nhi padti hai
		//bass class name se access kar sakte hai
		//aur return type hamesh class type ka lete hai kiw ki |Gf user defind data type hai
		//to n class type huaa na isliye
		Gf n=new Gf();
		return n;
	}
}
public class PrivateConstructor2 {
public static void main(String[] args) {
	Gf a1=Gf.getI();
	Gf a2=Gf.getI();
	Gf a3=Gf.getI();
	System.out.println(Gf.count);
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
}
}
//private constructro defind kia jaa sakta hai class ke ander na ki out side
//agar out side public constrocter ko dekhna hai to tumko helper methoda ka use lena padta hai
//aur aur iske through n number object bana sakte hai
//
