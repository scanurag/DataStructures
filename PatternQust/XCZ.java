package PatternQust;
public class XCZ {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n; i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	int s=n-1;
	for(int i=s; i>=1;i--) {
		for(int j=1;j<=s-i+1;j++) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
