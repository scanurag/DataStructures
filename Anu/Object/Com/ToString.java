package Anu.Object.Com;
class Tpo extends Object{
	int i;
	public Tpo(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		return "Tpo [i=" + i + "]";
	}
	
}
public class ToString {
public static void main(String[] args) {
	Tpo y=new Tpo(12);
	System.out.println(y.toString());
	Tpo t=new Tpo(56);
	System.out.println(t.toString());
}
}
