package BasicJSP;
import java.util.Scanner;
public class StrongNumber {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=scn.nextInt();
	int num=n;//isme yhs dekhs karo number ko stor kara rahe ho 
	int sum=0;
	while(n>0) {
		int d=n%10; //yaha pe wo d 145%10=5 aur iske liye ye factorial nikal raha hai uske
		           //baad 145/10 ho raha hai14 ho gaya 14%10=4 ke liye nila le ga aur 1 ke liye
		int prod=1;
		for(int i=1; i<=d; i++) {
			prod*=i;
		}
		System.out.println("fact of"+d+"="+prod);
		sum+=prod;
		n/=10;//number jo hai usko 145 14 kar de rahi isi tarh ek baar while chal raha hai14 1ho raha hai
	}
	System.out.println("sum="+sum);
	if(sum==num)System.out.println("strong num");
	else System.out.println("not a strong number");
}
}
