package String;
public class Show {
public static void main(String[] args) {
	String s1="A man, a plan, a canal: Panama";
	System.out.println(findPel(s1));
}
public static boolean findPel(String s1) {
	s1=s1.toLowerCase();
	String s2="abcdefghijklmnopqrstwxyz";
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	String s3=" ";
	for(int i=0;i<c1.length;i++) {
		for(int j=0;j<c2.length;j++) {
			if(c1[i]==c2[j]) {
				s3+=c1[i];
			}
		}
	}
	s3=s3.trim();
	int i=0;
	int j=s3.length()-1;
	while(i<j) {
		if(s3.charAt(i)!=s3.charAt(j)) return false;
		i++;
		j--;
	}return true;
	
}
}
