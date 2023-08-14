package SuperKeyword;
class Vb{
	int i=500;
	public void m1() {
		System.out.println("Learn Java for Life");
	}
}
class br extends Vb{
	int i=800;
	public void getI() {
		System.out.println("i="+this.i);
		System.out.println("i="+super.i);
	}
	public void m1() {
		super.m1();
		System.out.println("Jspiders will give youlife");
	}
}
public class Super_test {
public static void main(String[] args) {
	br b=new br();
	b.getI();
	b.m1();
}
}
