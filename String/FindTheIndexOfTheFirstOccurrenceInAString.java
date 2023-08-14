package String;
public class FindTheIndexOfTheFirstOccurrenceInAString {
public static void main(String[] args) {
	String s1= "leetcode";
	String s2 = "c";
	System.out.println(strStr(s1,s2));
}
public static int strStr(String s1, String s2) {
 /*  for(int i=0; i<s1.length()-s2.length()+1;i++) {
	   if(s1.charAt(i)==s2.charAt(0)){
		   if(s1.substring(i,s2.length()+i).equals(s2)) {
			   return 0;
		   }
	   }
   }
   return -1;*/
	return s1.indexOf(s2); 
	
}
}
