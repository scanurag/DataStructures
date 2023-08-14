package String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex3 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher m=p.matcher("ancdjjjjjj7234020314jkfg8299173654");
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
