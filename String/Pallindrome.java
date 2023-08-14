package String;
public class Pallindrome {
public static boolean isPallindrom(String s) {
String	s1=s.toLowerCase();
	char[] a=s1.toCharArray();
	int i=0;
	int j=a.length-1;
	//System.out.println(j);
	while(i<j)
	{
		if(a[i] != a[j]) return false;
		i++;
		j--;
	}
	return true;
}
public static void main(String[] args) {
	System.out.println(isPallindrom("amanaplanacanalpanama"));
	//amanaplanacanalpanama
}
}
