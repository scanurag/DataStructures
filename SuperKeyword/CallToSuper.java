package SuperKeyword;
class Sa extends Object{
	public Sa() {
		super();
		System.out.println("Class A No Arg");
	}
	public Sa(int num) {
		System.out.println("Class A1 Arg");
	}
}
class SB extends Sa{
	public SB() {
		super(5);
		System.out.println("Class B No Arg");
	}
	public SB(String name) {
		super();//calltosuper 
		System.out.println("Class B String Arg");
	}
}
public class CallToSuper {
public static void main(String[] args) {
	SB n=new SB("Anu");
}
}
