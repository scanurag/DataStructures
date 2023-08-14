package String;
public class CountVowels {
public static void main(String[] args) {
	String s="aeiou";
	char[] a=s.toCharArray();
	int count=0;
	for(int i=0;i<a.length;i++) {
if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
{
	count++;
}
	}
	System.out.println(count);
}
}
