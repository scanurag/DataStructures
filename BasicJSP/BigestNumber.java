package BasicJSP;
import java.util.Scanner;
public class BigestNumber {
	public static void main(String[] args) {
		Scanner mp=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num1=mp.nextInt();
		int num2=mp.nextInt();
		int num3=mp.nextInt();
		int num4=mp.nextInt();
		int num5=mp.nextInt();
		if(num1>num2&&num1>num3&&num1>num4&&num1>num5) {
			System.out.println("num1 is bigest Number");
		}
		if(num2>num1&&num2>num3&&num2>num4&&num2>num5) {
			System.out.println("num2 is bigest Number");
		}
		if(num3>num2&&num3>num1&&num3>num4&&num3>num5) {
			System.out.println("num3 is bigest Number");
		}
		if(num4>num2&&num4>num3&&num4>num1&&num4>num5) {
			System.out.println("num4 is bigest Number");
		}
		if(num5>num2&&num5>num3&&num5>num4&&num5>num1) {
			System.out.println("num5 is bigest Number");
		}
	}

}
