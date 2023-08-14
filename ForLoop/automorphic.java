package ForLoop;
import java.util.Scanner;
public class automorphic {
public static void main(String[] args) {
	Scanner ne=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=ne.nextInt();
	int num=n;
	int fact=n*n;
     n=num;
    int d=1;
    while(n>0) {
    	d*=10;
    	n/=10;
    }
    if(num==fact%d) System.out.println("The value is automorphic: "+num);
    else System.out.println("not a automorphic");
}
}
