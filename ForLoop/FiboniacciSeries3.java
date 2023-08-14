package ForLoop;
import java.util.Scanner;
public class FiboniacciSeries3 {
 public static void main(String[] args) {
	Scanner mb=new Scanner(System.in);
	System.out.println("Enter a range:");
	int n=mb.nextInt();
    int num=n;
    int sum=0;
    while(n>0) {
    	int d=n%10;
    	sum=(sum*10)+d;
    	n/=10;
    }
    if(num==sum) System.out.println(+sum+" is a Palindrome");
    else System.out.println("Not a Palindrome ");
}
}
