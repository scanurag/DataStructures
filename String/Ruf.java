package String;
import java.util.*;
public class Ruf {
public static void main(String[] args) {
	String s="Java is good programing lang";
	String[] s1=s.split(" ");
	String s2=" ";
	for(int i=0; i<s1.length;i++) {
		s2+=revStr(s1[i]);
		if(i<s1.length-1) s2+=" ";
	}
	System.out.println(s2.trim());
	
}
public static String revStr(String s) {
	char[] a=s.toCharArray();
int	i=0;
int	j=a.length-1;
	while(i<j) {
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	return new String(a);
}
}
