package learning.has_a_relationship;
class Yt{
	public void m3() {
		System.out.println("good Logic");
	}
}
class Yte{
	Yt a;
	public void m4() {
		a=new Yt();
		a.m3();
	}                                             
	public void m() {
		a=new Yt();
		a.m3();
	}
}
public class Aggregation {
public static void main(String[] args) {
	Yte y1 = new Yte();
	    y1.m4();
	    y1.m();
	    
}
}
