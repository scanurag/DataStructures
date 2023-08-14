package METHOD;
import java.util.Scanner;
public class Fabenoce {
public static int fb(int n) {
	int a=0;
	int b=1;
	int c;
	for(int i=1; i<=n;i++) {
		c=a+b;System.out.println(a);
		a=b;
		b=c;
	}
	return a;
		}
public static void main(String[] args) {
	Scanner gl=new Scanner(System.in);
	int n=gl.nextInt();
	int h=fb(n);
	System.out.println(h);
}
}
