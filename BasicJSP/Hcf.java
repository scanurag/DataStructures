package BasicJSP;
import java.util.Scanner;
public class Hcf {
	public static void main(String[] args) {
		Scanner fg=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=fg.nextInt();
		int b=fg.nextInt();
	    int n=1;
	    for(int i=1; i<=a&&i<=b;i++)
	    {
	    	if(a%i==0&&b%i==0) {
	    		n=i;
	    	}
	    }
	    int Lcm=a*b/n;//Lcm ka formula hota hai
	      System.out.println(n);
	      System.out.println(Lcm);
	}
}
