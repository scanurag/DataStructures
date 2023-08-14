package learning.has_a_relationship;
class T{
	public void m3() {
		System.out.println("Good Logic");
	}
}
class T1{
	public void m4() {
		T t = new T();
		t.m3();
	}
}
public class HasAAssociate {
public static void main(String[] args) {
	T1 t1 = new T1();
		t1.m4();
}
}
