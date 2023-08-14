package String;
public class Revers {
public static void main(String[] args) {
	String s1="Anurag";
	char[] a=s1.toCharArray();//ye method hai us karte hai String anurag a uskebad n u r a g
	System.out.println(a);
	int n=a.length;
	String sp="";
	for(int i=n-1;i>=0;i--) {
		sp+=a[i];
		
	}
	System.out.println(sp);
}
}
