  package METHOD;
import java.util.Scanner;
public class PerfactByMethod {
 /* public static int  perfactNum(int n) {
	  int sum=0;
	  for(int i=1; i<n; i++) {
		  if(n%i==0) sum+=i;
	  }
	    return sum;
  }*/
  public static void main(String[] args) {
	Scanner lk=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int a=lk.nextInt();
	int b=lk.nextInt();
	for(int i=a;i<=b;i++) {
		if(ParfactNum.NumParf(i)==i) System.out.println(i);
	}
	/*int j=perfactNum(n);
	if(n==j)System.out.println("Perfact Number"+j);
	else System.out.println("Not a perfect Number");*/
}
}
