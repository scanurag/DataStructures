package Anu.Object.Com;
class Appy{
	
}
class Kajol extends Appy{
	
}
public class InstanceKeyword {
public static void main(String[] args) {
	Object obj=new Object();
	System.out.println(obj instanceof Object);
	System.out.println(obj instanceof Appy);
	System.out.println(obj instanceof Kajol);
	Appy ap=new Appy();
	System.out.println(ap instanceof Object);
	System.out.println(ap instanceof Appy);
	System.out.println(ap instanceof Kajol);
	Kajol kj=new Kajol();
	System.out.println(kj instanceof Object);
	System.out.println(kj instanceof Appy);
	System.out.println(kj instanceof Kajol);
}


}
