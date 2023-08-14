package SingletionClass;
class Single{
	private static  Single t=null;
	private Single() {
		
	}
	public static Single getI() {
		if(t == null) t=new Single();
		return t;
	}
}
public class SingletionC {
public static void main(String[] args) {
	Single a1=Single.getI();
	Single a2=Single.getI();
	Single a3=Single.getI();
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
}
}
