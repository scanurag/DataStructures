package Recursion;
public class PerfectNum {
public static void PerNum(int i,int n,int sum) {
	if(i==n) {
		System.out.println(sum);
		return;
	}
	if(n%i==0) sum+=i;
	PerNum(i+1,n,sum);
}
public static void main(String[] args) {
	PerNum(1,28,0);
}
}
 