package ConstructorJSP;
class B{
	int l;
	int b;
	public B(int l ,int b) {
		this.l=l;
		this.b=b;
		}
	public B(int n) {
		this(n,n);
	}
	public B(int p,byte g) {
		l=p;
		b=g;
		}
	int A;
	public void m31() {
		System.out.println(l+" "+b);
		 A=l*b;
		System.out.println(A);
	}
}
public class RectangleTest {
public static void main(String[] args) {
  B	b=new B(5,5);
  b.m31();
  System.out.println("**********************");
  B b1=new B(7);
  b1.m31();
  System.out.println("*****************************");
  B b2=new B(4,6);
  b2.m31();
  
}
}
