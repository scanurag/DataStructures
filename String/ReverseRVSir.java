package String;
public class ReverseRVSir {
public static void main(String[] args) {
System.out.println(reverse("Kajol"));	
}
public static String reverse(String s1) {
	char[] a=s1.toCharArray();
	String s11=" ";
	for(int i=a.length-1;i>=0;i--) {
		s11+=a[i];
	}
	return s11;
}
}
