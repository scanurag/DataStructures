package BasicJSP;
import java.util.Scanner;//1458 ka hoga
public class AddSqu {
public static void main(String[] args) {
Scanner hj=new Scanner(System.in);
System.out.println("Enter a Number:");
int n=hj.nextInt();
int num=n;
int sum=0;
while(n>0) {
	int d=n%10;
	sum=sum+d;
	n/=10;
}
int sp=sum;
int dp=0;
while(sp>0) {
	int d=sp%10;
	dp=(dp*10)+d;
	sp/=10;
}
int kj=sum*dp;
if (num==kj) System.out.println(" is a SpacilNumber" +kj);
else System.out.println("Not a spacilNumber");
}
}
