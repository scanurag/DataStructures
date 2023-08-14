package DSA;
import java.util.Scanner;
public class RemoveVowels {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		String input=SC.nextLine();
		input=input.replaceAll("[aeiouAEIOU]","");
		System.out.println(input);
	}
	

}
