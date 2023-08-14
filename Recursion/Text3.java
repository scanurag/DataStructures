package Recursion;
public class Text3 {
public static void len(int n,int Count) {
	if(n==0) {
		System.out.println(Count);
		return;
	}
	int d=n%10;
	Count++;
	len(n/=10,Count);
}
public static void main(String[] args) {
	int n=2345;
	int Count=0;
	len(2345,0);
}
}
