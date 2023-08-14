package String;
public class CountStringNum {
public static void main(String[] args) {
	String s1="Success";
	s1=s1.toLowerCase();
	String s2=" ";
	char[] a=s1.toCharArray();
	int i=0;
	char c;
	int count;
	while(i<a.length) {
		c=a[i];
		count=1;
		i++;
		while(i<a.length && c==a[i] ) {
			
		 count++;
			i++;
		}
		s2=s2+count+c;
	}
	System.out.println(s2);
}
}
