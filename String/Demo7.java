package String;
public class Demo7 {
public static void main(String[] args) {
	String s="java is an oop lang";
	String[] a=s.split(" ");
	String s1=" ";
	for(int i=0; i<a.length;i++ ) {
		s1+=rev(a[i]);
		if(i<a.length-1) s1+=" ";
	}
	System.out.println(s1.trim());
}
public static String rev(String s) {
	char[] a=s.toCharArray();
	int i=0;
	int j=a.length-1;
	while(i<j) {
		char temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	return new String(a);
}
}
