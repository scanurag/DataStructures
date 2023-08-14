package BasicJSP;
import java.util.Scanner;
public class StronNumberReng {
public static void main(String[] args) {
	Scanner hj=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int a=hj.nextInt();
	int b=hj.nextInt();
	int sum=0;
	for(int i=1; i<=a &&i<=b;i++)
	{
		if(a%i==0 && b%i==0) sum=i;
	    
	}
	int dk=sum;
	int lcm=(a*b)/dk;
	System.out.println(dk);

}
}