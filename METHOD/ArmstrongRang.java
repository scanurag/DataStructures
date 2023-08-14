package METHOD;
import java.util.Scanner;
public class ArmstrongRang {
public static void main(String[] args) {
	Scanner df=new Scanner(System.in);
	System.out.println("Enter a Number");
	int a=df.nextInt();
	int b=df.nextInt();
for(int i=a; i<=b; i++) {
	if(amstrongNumByMethod.isArmstrong(i)==i) System.out.println(i);
}
}
}
