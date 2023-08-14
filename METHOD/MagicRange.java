package METHOD;
import java.util.Scanner;
public class MagicRange {
public static void main(String[] args) {
	Scanner jk=new Scanner(System.in);
	System.out.println("Enter a number:");
	int a=jk.nextInt();
	int b=jk.nextInt();
	for(int i=a; i<=b; i++) {
		if(MagicNum.Magic(i)==1) System.out.println(i);
	}
}
}
