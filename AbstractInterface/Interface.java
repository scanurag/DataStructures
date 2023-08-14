package AbstractInterface;
interface Itr{
	public static final int i=10;//static Constants
	public abstract void m1();//abstrect methods
	void  m2();
}
abstract class Bp implements Itr{ //isko implements class bolte hai

	@Override
	public void m1() {
		System.out.println("hello");
	}

	/*@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	*///agar ye nhi likhte to tumko class abstract karna hoga 
}
class  Cp  extends Bp{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
}
public class Interface {
Cp h=new Cp();

}
