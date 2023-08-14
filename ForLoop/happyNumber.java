package ForLoop;
import java.util.Scanner;
public class happyNumber {
public static void main(String[] args) {
Scanner gk=new  Scanner(System.in);
 System.out.println("Enter a Number:");
 int n=gk.nextInt();
 int num=n;
 int sum=0;
 while(num>=10) 
	 {
	 	n=num;
		 sum=0;
		 while(n>0) {
			 int d=n%10;
			 sum+=d*d;
			 n/=10;
		 }
		 num=sum;//16,81
	 }
	 if (num==1) System.out.println("Number is happyNumber"+sum);
	 else System.out.println("not a morfic");
 }
}

