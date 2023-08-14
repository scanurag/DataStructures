package SuperKeyword;
class Hf{
	String name;
	public Hf() {
		System.out.println("hi anurag kya kar rahe ho!");
	}
	public  Hf(String name) {
		System.out.println("hi beta kayse ho");
	}
	public void j() {
		System.out.println("Anura udrna nhi chahiye jade ");
	}
}
class Cpe extends Hf{
	public Cpe() {
		super();
		//super("Anurag");
		System.out.println("ha ha ha ha");
	}
	public void j() {
		super.j();
		System.out.println("aur kisi ka mzak nhi udanna chahiye");
	}
}
public class CKSuper {
public static void main(String[] args) {
	Cpe p=new Cpe();
	p.j();
}
}
