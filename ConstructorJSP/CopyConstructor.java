package ConstructorJSP;
class Ac{
	int a; String b;
	public Ac(int a,String b) {
		this.a=a;
		this.b=b;
		System.out.println(a+ " "+b);
	}
	public Ac(Ac ref) {
		a=ref.a;
		b=ref.b;		
		System.out.println(a+ " "+b);
	}
}
public class CopyConstructor {
public static void main(String[] args) {
	Ac r=new Ac(10,"Anurag");
	Ac ac = new Ac(r);
	new Ac(ac);
	new Ac(ac);
}
}
