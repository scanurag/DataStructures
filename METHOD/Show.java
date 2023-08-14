package METHOD;
public class Show {
public static void main(String[] args) {
	String a= "Anurag Singh";
	char[] s=a.toCharArray();
	String s1=" ";
	String s2=" ";
	
	for(int i=s.length-1;i>=0;i--) {
		if(s[i] == ' ') break;
		s1 +=s[i];
		
	}
	System.out.println(s1.trim());
}
}
