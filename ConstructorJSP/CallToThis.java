package ConstructorJSP;
class Rect12{
	int L,B;
	public Rect12(int L,int B) {
		this.L=L;
		this.B=B;
	}
	public Rect12(int num) {
		this(num,num);
	}
	public void Show() {
		System.out.println(L);
		System.out.println(B);
		int Area=L*B;
		System.out.println("Area of Rect "+" "+Area);
		System.out.println("**************");
	}
}
public class CallToThis {
 public static void main(String[] args) {
	Rect12 rect = new Rect12(4,6);
	 rect.Show();
	Rect12 rect1=new Rect12(7);
	rect1.Show();
}
}
