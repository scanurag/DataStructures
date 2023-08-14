package String;

public class GreatestCommonDivisorofStrings {
public static void main(String[] args) {
	String str1="ABABAB";//str1 = "ABABAB", str2 = "ABABAB"output:AB
	String str2="ABAB";
	System.out.println(findCommon(str1,str2));
}
public static String findCommon(String str1,String str2) {
	char[] c=str1.toCharArray();
	char[] c1=str2.toCharArray();
	String s1="";
	int j=0 ;
	int k=0;
	for(int i=0;i<c1.length;i++) {
		
		while(j<c.length) {
			if(c1[i]==c[j]) {
				 s1+=c1[i];
				 j++;
			}
			break;
		}
	}
	return s1;
}
}
