package String;
public class ReversString {
public static void main(String[] args) {
	String s = "leetcode";
	System.out.println(reverseVowels(s));
}
public static String reverseVowels(String s) {
    char[] a=s.toCharArray();
    int i=0;
    int j=a.length-1;
    char[] a1="aeiou".toCharArray();
    while(i<j) {
    	if(!cK(a[i])) {
    		i++;
    	}
    	if(!cK(a[j])) {
    		j--;
    	}
    	else {
    		char temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		i++;
    		j--;
    	}
    }
    return new String(a);
}
public static boolean cK(char a) {
	if(a =='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
	{
		return true;
	}
	return false;
}
}
