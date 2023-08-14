package String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex1 {
public static void main(String[] args) {
	String exp="(?=.*[0-9]).{5,10}";//yaha pe pahle 0 se 9 ke bich ka koi ek num hona chahiye 
	String str="abcdef1dsfggd";//
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(str);
	System.out.println(m.matches());
			
}
}
