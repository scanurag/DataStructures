package ConstructorJSP;
class Gpy{
	{
		System.out.println("Good Day");
	}
	public Gpy() {
		this("Anurag Love Kajol");//man lo tum ko isko iske baad me karna hi to iske baad 
		
		System.out.println("Confusion is ok while Larnig");
	}
	public Gpy(String name) {
		System.out.println(name+"Be good");
		
	}
}
public class ConstructorBlocksDeff {
public static void main(String[] args) {
	Gpy g=new Gpy();
	}
}
//isme dekho arrgument de rahe ho to dono me Good day print ho raha hai
//non static block nhi lagye hote tokya hota dono me jaa ke Sysout("Good Day")
//print karwona padta to koi puchhe defrenc to ya batana
//isme dekh rahe ho ek time pe ek hi constructor kaam kar raha hai
//agar hum ko dono ko print karna hai is case me hum ko call to this key word
//ka use karna pade ga This();
//aur jish bhi constructer me lagwo ge sab se upper lagna padega