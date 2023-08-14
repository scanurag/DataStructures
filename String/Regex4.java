package String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Regex4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter phone num");
	String ph=sc.next();
if(isValidPhoneNum(ph)) {
	System.out.println("valid");
}else {
	System.out.println("not a valid");
}
}
public static boolean isValidPhoneNum(String ph) {
	Pattern p=Pattern.compile("[6-9][0-9]{9}");
	Matcher m=p.matcher(ph);
		return m.matches();
}
}
