package learning.basics;
import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.String.*;
public class StaticImport {
public static void main(String[] args) {
	double sq=sqrt(4);
	System.out.println("Square root is :"+sq);
	double x= floor(4.3);
	System.out.println("floor root is :"+x);
	System.out.println(PI);
	out.println("Hello static Import");// using static import
	
	int z=10, y=20;;
	out.println(z*y);
	String str_z= valueOf(z);
	String str_y= valueOf(y);
	System.out.println("value is :"+str_z+str_y);
}
}
