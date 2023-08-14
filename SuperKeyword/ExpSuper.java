package SuperKeyword;
class BX{
	int i;
	int j;
	public BX(int i,int j) {
		this.i=i;
		this.j=j;
		 
	}
	public void displayA() {
		System.out.println(i+" "+j);
	}
}
class Bh extends BX{
	int i;
	int j;
	public Bh(int i,int j) {
		super(i,j);
		this.i=i;
		this.j=j;
		//super.i=i;
		//super.j=j;
	}
	public void ShowN() {
		System.out.println(i+ " "+j);
	}
}
public class ExpSuper {
public static void main(String[] args) {
	Bh j=new Bh(11,22);
	 j.displayA();
	 j.ShowN();
	
}
}
