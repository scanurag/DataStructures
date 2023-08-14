package PatternQust;
public class Demo1 {
public static void main(String[] args) {
	int n=5;
	for(int i=1; i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		int s=2*(n-i);
		for(int j=s;j>=0;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
