package PatternQust;
import java.util.Scanner;
public class PramidTg {
public static void main(String[] args) {
Scanner gk=new Scanner(System.in);
System.out.println("Enter a Number:");
int n=gk.nextInt();
int s=n/2;
int st=1;
for(int i=1;i<=n;i++) {
	for(int j=1; j<=s; j++) {
		System.out.print(" ");
	}
	for(int j=1; j<=st; j++) {
		System.out.print(j);
	}
	System.out.println();
	if(i<=n/2) {
		s--;
		st+=2;
		
	}
	else break;
	
}
}
}
