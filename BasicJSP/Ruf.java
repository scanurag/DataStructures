package BasicJSP;
import java.util.Scanner;
public class Ruf {
public static void main(String[] args) {
	Scanner fc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=fc.nextInt();
	int num=n;
	int sum=0;
	while(num>=10) {
		n=num;
		sum=0;
		while(n>0) {
			int d=n%10;
			int f=d*d;
			sum=sum+f;
			n/=10;
		}
		num=sum;
	}
	if(num==1) System.out.println(sum);

}
}
//strong number kya hota hai jayse ki 145 1foktorial +4ka faktorial +5ka factorial karne pe same nu
//number aye jo pahlr th
//armstrong number kya hota hai 1634 isko count karo kitna hai sab ko us se 
//utna baa squre kar aur sab ko add karo utna hi ana chahiye yahi armstrong number kahla ta hai
