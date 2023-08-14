package DSA;
public class RecursionD {
	public static int calcfactorial(int n) {
		if(n==1||n==0) {
			return 1;
		}
	int B = calcfactorial(n-1);	
	int C=n*B;
	return C;
	}
public static void main(String[] args) {
	int n=5;
	calcfactorial( n);
	int ans= calcfactorial(n);
	System.out.println(ans);
			
}
}
