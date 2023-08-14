package DSA;
import java.util.HashSet;
public class RecursionK {
public static void unicsub(String str, int idx, String newString, HashSet<String>Set) {
	if(idx==str.length()) {
		if(Set.contains(newString)) {
			return;
		}else {
			System.out.println(newString);
			Set.add(newString);
			return;
		}
	}
	char currChar= str.charAt(idx);
	unicsub(str, idx+1,newString+currChar,Set);
	unicsub(str,idx+1,newString,Set);
	
}
public static void main(String[] args) {
	String str="aaa";
	HashSet<String> set = new HashSet<>();
	unicsub(str,0,"",set);
}
}
