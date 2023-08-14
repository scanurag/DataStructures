package DSA;
public class RecursionG {
	public static int ck(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		if(n%2==0) {
			return ck(x, n/2)*ck(x,n/2);//for x*n stack ki hight logn karne ke liyeis method use kar te hai
		}
		else {
			return ck(x,n/2)*ck(x,n/2)*x;
		}
	}
public static void main(String[] args) {
	int x=2,n=5;
	int ans = ck(x,n);
	System.out.println(ans);
}
}
