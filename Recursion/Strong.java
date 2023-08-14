package Recursion;
public class Strong {
public static void Str(int n,int sum,int v) {
	if(n==0) {
if(v==sum)	System.out.println("it is strong number"+sum);
else System.out.println("Not a  Strong Number");
		return;
	}
	int d=n%10;
	int i=Prod(1,d,1);
	Str(n/10,sum+i,v);
}
public static int Prod(int s,int e,int mun) {
	 if(s==e) {
		 mun*=s;
		 //System.out.println(mun);
		 return mun;
	 }
	 mun*=s;
	 return Prod(s+1,e,mun);
}
public static void main(String[] args) {
	int n =14;
	int  v=n;
	Str(n,0,v);
Prod(1,5,1);
	
}
}
