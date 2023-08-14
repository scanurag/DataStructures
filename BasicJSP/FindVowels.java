package BasicJSP;
import java.util.Scanner;
public class FindVowels{
public static void main(String[] args) {
	Scanner hj=new Scanner(System.in);
	System.out.println("Enter a Char");
	char ch=hj.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.println("Character is vowel");
	}
	else{
		System.out.println("Character is not vowel");
	}
}
}
