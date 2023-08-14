package String;
public class FistKaCapHoga {
public static void main(String[] args) {
	String s1="java is life";
	char[] a=s1.toCharArray();
	int i=0;
	while(i<a.length) {
		if(i==0) {
			convertToUpper(a,0);
			i++;
		}
		while(i<a.length&&a[i]!=' ') {
			i++;
		}
	
		if(i<a.length-1) convertToUpper(a,i+1);
		i++;
	}
	String s2=new String(a);
	System.out.println(s2);
}
public static void convertToUpper(char[] a,int i)
	{
	if(a[i]>='a' && a[i]<='z') {
		a[i]-=32;
	}
	}
}
