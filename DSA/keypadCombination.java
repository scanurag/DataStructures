package DSA;
import java.util.HashSet;
public class keypadCombination {
public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static void printcomb(String str, int idx, String combination) {
	if(idx==str.length()) {
		System.out.println(combination);
		return;
	}
	char currChar=str.charAt(idx);
	String mapping =keypad[currChar -'0'];
	for(int i=0;i<mapping.length();i++) {
		printcomb(str,idx+1,combination+mapping.charAt(i));
	}
}
public static void main(String[] args) {
	String str="25";
	printcomb(str,0,"");
}
}
