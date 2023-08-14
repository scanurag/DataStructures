package String;
public class PallentraomVelidatio {
public static void main(String[] args) {
	System.out.println(isPallindrom("A man, a plan, a canal: Panama"));
}
public static boolean isPallindrom(String s) {
String	s1=s.toLowerCase();
String s3="abcdefghijklmnopqrstwxyz";
char[] c1=s3.toCharArray();
char[] c2=s1.toCharArray();
String s4=" ";
for(int i=0; i<c2.length;i++) {
	for(int j=0;j<c1.length;j++) {
		if(c2[i]==c1[j]) {
			s4+=c2[i];
		}
	}

}
char[] c3=s4.trim().toCharArray();
int e=0;
int j=c3.length-1;
while(e<j) {
	if(c3[e] != c3[j]) return false;
	e++;
	j--;
}
	return true;
}
}
/*class Solution {
    public boolean isPalindrome(String s) {
			String s4="";
			for(char c:s.toCharArray()){
				if(Character.isDigit(c)||Character.isLetter(c)){
					s4 +=c;
				}
			}
			s4=s4.toLowerCase();
			int i=0;
			int j=s4.length()-1;
			while(i<=j){
				if(s4.charAt(i)!=s4.charAt(j) ) return false;
				i++;
				j--;
			}return true;
}
}*/
