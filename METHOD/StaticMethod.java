package METHOD;
public class StaticMethod {
static int i=0,j=0;
  
public static void main(String[] args) {
	StaticMethod.j=m1(i++);
	System.out.println(StaticMethod.i);
	System.out.println(j);
}
static int m1(int a) {
	return a++;
}

}
