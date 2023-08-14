package String;
public class Split {
public static void main(String[] args) {
	String s="java is an oop lang";
	String[] a=s.split(" ");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
