package Arrays;
import java.util.*;
public class A {
public static void main(String[] args) {
	int[] s= {1,3,9,2,5};
	int s1=s[0];
	int s2=s[0];
	for(int i=0;i<s.length;i++) {
		if(s[i]==s1) continue;
		if(s[i]>s1) {
			s2=s1;
			s1=s[i];
		}
		else if(s2==s1||s[i]>s2) {
			s2=s[i];
		}
	}
	System.out.println(s2);
}
}
