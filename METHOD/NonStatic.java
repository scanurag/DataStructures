package METHOD;
public class NonStatic {
int i=0,j=0;	  
public static void main(String[] args) {
	NonStatic hj=new NonStatic();
		hj.j=m1(hj.i++);
		System.out.println(hj.i);
		System.out.println(hj.j);
	}
static int m1(int a) {
		return a++;
	}
}
