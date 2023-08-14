package Garwej;
import java.util.Scanner;
public class CalTotalVowelsInString {
public static void main(String[] args) {
	Scanner kl=new Scanner(System.in);
	System.out.println("Enter a Name");
	String naam=kl.nextLine();
	int count=0;
	for(int i=0; i<naam.length();i++) {
		if(naam.charAt(i)=='a'||naam.charAt(i)=='e'
				||naam.charAt(i)=='o'||naam.charAt(i)=='i'||naam.charAt(i)=='u') count++;
	}
	System.out.println(count);
}
}
