package String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex5 {
public static void main(String[] args) {
	Pattern p=Pattern.compile("a[ac]*");
	Matcher m=p.matcher("abadaaca1");
	while(m.find()) {
		System.out.println(m.start()+" "+m.end()+""+m.group());
	}
}
}
