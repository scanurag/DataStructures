package BasicJSP;
import java.util.Scanner;
public class RevNum {
public static void main(String[] args) {
Scanner hj=new Scanner(System.in);//12345 //54321//5+4+3=12
System.out.println("Enter a Number:");
int n=hj.nextInt();
int num=n;
int p=0;
while(n>0) {
	int d=n%10;
	p=((p*10)+d);
	n/=10;
	
} 
System.out.println(p);
int fg=p;
int	fi=fg/100; 
 int gf=fi;
 int sum=0;
 while(gf>0) {
	 int xz=gf%10;
	 sum+=xz;
	 gf/=10;
 }
 System.out.println("sum of rev 1st three number:"+sum);
	}

}
