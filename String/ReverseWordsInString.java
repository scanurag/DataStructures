package String;
public class ReverseWordsInString {
public static void main(String[] args) {
	System.out.println(reversWord("Java is an oop lang"));
}
public static String reversWord(String s) {
	String[] a=s.split(" +");
	StringBuffer sb=new StringBuffer();
	for(int i=a.length-1;i>=0;i--) {
		sb.append(a[i]);
		sb.append(" ");
	}
	return sb.toString().trim();
}
}
