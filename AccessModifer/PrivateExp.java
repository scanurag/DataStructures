package AccessModifer;
class D{
	private int i=67;
	public void getI() {
		System.out.println("i="+i);
	}
}
class Np extends D{

}
public class PrivateExp {
public static void main(String[] args) {
	Np n=new Np();
	n.getI();
}
}
