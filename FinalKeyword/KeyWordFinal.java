package FinalKeyword;
class Kajol{
	final int a;
	final static int b;
	static {
		b=100;
	}
	{
		a=55;
	}
	public void change() {
		System.out.println(a);
		System.out.println(b);
	}
}
public class KeyWordFinal {

	public static void main(String[] args) {
		Kajol kajol = new Kajol();
				kajol.change();

	}

}
