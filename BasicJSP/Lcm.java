package BasicJSP;
import java.util.Scanner;
public class Lcm {
public static void main(String[] args) {
	Scanner fg=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int a=fg.nextInt();
	int b=fg.nextInt();
    int  n=a>b? a:b;
      int stp=n;
      while(n>0) {
    	  if(n%a==0&&n%b==0) break;
    	  n+=stp;
      }
      System.out.println(n);
}
}
