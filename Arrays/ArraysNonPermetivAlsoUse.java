package Arrays;
import java.util.Arrays;
class Circle implements Comparable{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public int compareTo(Object o) {
		return	(radius) - ((Circle)o).radius;
	}
	
}
public class ArraysNonPermetivAlsoUse {
public static void main(String[] args) {
	Circle[] a;
	a=new Circle[3];
	a[0]=new Circle(80);
	a[1]=new Circle(30);
	a[2]=new Circle(10);
	Arrays.sort(a);
	for(Circle c:a ) {
		System.out.println(c);
	}
	
}
}
