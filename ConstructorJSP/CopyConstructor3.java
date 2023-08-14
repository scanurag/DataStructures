package ConstructorJSP;
class Rect{
	int L;
	int B;
	public Rect(int L,int B) {
		this.L=L;
		this.B=B;
	}
	public void showR() {
		System.out.println(L);
		System.out.println(B);
		int A=L*B;
		System.out.println(A);
		System.out.println("****************");
	}
	public Rect(Rect h,int B) {
		this.L=h.L;
		this.B=B;
	}
	public Rect(Rect K) {
		this.L=K.L;
		this.B=K.B;
	}
	public Rect(int L,Rect s) {
		this.L=L;
		this.B=s.B;
	}
}
public class CopyConstructor3 {
public static void main(String[] args) {
	Rect r1=new Rect(5,7);
	r1.showR();
	Rect r2=new Rect(r1,8);
			r2.showR();
	Rect r3=new Rect(r1);
	   r3.showR();
	Rect r4=new Rect(9,r2);
		r4.showR();
}
}
