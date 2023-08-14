package Recursion;
public class Fact {
 public static void Prod(int s,int e,int mun) {
	 if(s==e) {
		 mun*=s;
		 System.out.println(mun);
		 return;
	 }
	 mun*=s;
	 Prod(s+1,e,mun);
 }
	public static void main(String[] args) {
	Prod(1,5,1);
}
}
