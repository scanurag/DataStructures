package String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
public static void main(String[] args) {
	Pattern p=Pattern.compile("[0-9]+ ");
	Matcher m=p.matcher("a1ab23a3456");
	while(m.find())
	{
		System.out.println(m.group());
	}
}
}
