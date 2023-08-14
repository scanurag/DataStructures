package Oops;
class Da{
	int i;
	
	public void mA()
	{
		System.out.println(i);
		System.out.println(this);
	}
}
public class Mostimp {
public static void main(String[] args) {
	Da a1;
	a1=new Da();
	a1.mA();
	System.out.println(a1);
	a1.i=100;
	a1.mA();
	a1 =new Da();//yaha pe kya ho raha hai dekho ye new onject ho raha same var name a1 se
	//se aur aysa ho sakta hai isme dono object ka output de raha hi.
	a1.mA();
	System.out.println(a1);
	
}
}
