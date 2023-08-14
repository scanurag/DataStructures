package BasicJSP;
public class Length {
public static void main(String[] args) {
int n=1234567;
int num=0;
while(n>0) {
	int d=n%10;
	num++;
	n/=10;
}
System.out.println(num);
	}
}
