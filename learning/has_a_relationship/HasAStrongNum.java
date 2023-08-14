package learning.has_a_relationship;
import java.util.Scanner;
class Fact{
	public int FactNum(int n) {
		int Prode=1;
		for(int i=1; i<=n; i++) {
			Prode*=i;
		}
		return Prode;
	}
}
class StrongNum {
	public int StrongNumber(int n) {
		Fact f1=new Fact();
		int sum=0;
		while(n>0){
			int d=n%10;
			sum=sum+f1.FactNum(d);
			n/=10;
		}
		return sum;
	}
}
public class HasAStrongNum {
public static void main(String[] args) {
	StrongNum st1 = new StrongNum();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=scan.nextInt();
	int result=st1.StrongNumber(num);
	if(num==result) System.out.println("num is strong number"+result);
	else System.out.println("not");
}
}
