package ForLoop;
import java.util.Scanner;
public class FiboniacciSeries2 {
public static void main(String[] args) {
		Scanner kl=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=kl.nextInt();
		int m=kl.nextInt();
		int a=0;
		int b=1;
		int c;
		while(a<=m) {
			if(a>=n) System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	}
//isme bahut galti hi pale to a ko 0 lena to 1 le liye aur a<=m chlana tha to 
//m<0 chla rahe the to dekhte rahna padega
//isme hum smjaa rahe the to ek galti hui thi wo ye thi ki bata nhi paa rahe the 
//ki m aur n ki value constent ho jaa rahi hai change to n humesa 1 hi rah raha hai ushi se comper 
//krana hai