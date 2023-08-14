package String;
public class Encode {
public static void main(String[] args) {
	char[] a="abcdefghijklmnopqrstuvwxyz".toCharArray();
	String s1="java";
	int n=3;
	String s2=" ";
	for(int i=0;  i<s1.length();i++) {
		char c=s1.charAt(i);
		int index=c-97;// j 106-97=9
		index +=n;//index=9+3=12
		index =index%26;//12%26=12
		s2 +=a[index];
	}
	System.out.println(s2.trim());
}
}
