package BasicJSP;
import java.util.Scanner;
public class Amount {
	public static void main(String[] args) {
		Scanner ig=new Scanner(System.in);
		System.out.println("Enter a amount:");
		int amount=ig.nextInt();
		if(amount>=2000) {
			System.out.println("2000X"+(amount/2000));
			amount=amount%2000;
			
		
		if(amount>=500) {
			System.out.println("500X"+(amount/500));
			amount=amount%500;
		}
		if(amount>=200) {
			System.out.println("200X"+(amount/200));
			amount=amount%200;
		}
		if(amount>=100) {
			System.out.println("100X"+(amount/100));
			amount=amount%100;
		}
	}

}
}
	
