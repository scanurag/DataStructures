package String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex6 {
public static void main(String[] args) {
	Pattern p=Pattern.compile("([a-z])\\1*");
	Matcher m=p.matcher("abbccccdeee");
	String s2=" ";
	while(m.find()) {
		String temp=m.group();
		s2=s2+temp.length()+temp.charAt(0);
	}
	System.out.println(s2);
}
}
