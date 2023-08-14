package MethodOverriding;
class Parent{
	int i;
	public void call(int i) {
		this.i=i;
		System.out.println("7234020314 number of Anurag"+i);
	}
}
class Child extends Parent{
	int i;
	@Override
	public void call(int i) {
		this.i=i;
		System.out.println("8299173654 hi golu"+i);
	}
}
public class ShowGf {
public static void main(String[] args) {
	Child c = new Child();
	c.call(20);
	
}
}
//Agar @Override lagye hoge to hi ye jo rule hota hai usko dikhaye ga nhi to ye  ek object
//samj ke usko run kara de ga  to jab bhi Override kar rahe ho to @Override kar rahe ho to 
// is chiz ka dhyan rahna hoga