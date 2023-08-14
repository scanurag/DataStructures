package String;

public class MergeStringAlternately {
public static void main(String[] args) {
	String word1="ab";
	String word2="pqr";
	System.out.println(findAlter(word1,word2));
}
public  static String findAlter(String word1,String word2) {
	StringBuilder sb=new StringBuilder();
	int s1=word1.length();
	int s2=word2.length();
	int i=0;
	while(i<s1 ||i<s2) {
		if(i<s1)  sb.append(word1.charAt(i));
		if(i<s2)  sb.append(word2.charAt(i));
		i++;
	}
	return sb.toString();
}
}
