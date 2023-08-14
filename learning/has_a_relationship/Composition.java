package learning.has_a_relationship;
class Fc{
	int sum=1;
	int sum1=3;
	public void m2() {
		System.out.println(" hi Anurag.....");
	}
	public void m7() {
		System.out.println(sum+sum1);
	}
}
class JL{
	Fc c;
	public JL(Fc c) {
		this.c=c;
	}
	public void m5() {
		c.m2();
	}
	public void m6() {
		c.m2();
		c.m7();
	}
}
public class Composition {
public static void main(String[] args) {
	Fc c=new Fc();
	JL j=new JL(c);
	j.m5();
	j.m6();
}
}
