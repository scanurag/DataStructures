package METHOD;
import java.util.Scanner;
public class ParfactRange {
	 public static void main(String[] args) {
			Scanner lk=new Scanner(System.in);
			System.out.println("Enter a Number:");
			int a=lk.nextInt();
			int b=lk.nextInt();
			for(int i=a;i<=b;i++) {
				if(ParfactNum.NumParf(i)==i) System.out.println(i);
			}
		}
}
