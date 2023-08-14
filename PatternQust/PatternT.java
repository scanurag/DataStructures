package PatternQust;
public class PatternT {
public static void main(String[] args) {
	int n=10;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			if(i==n||i==j||j==1) {
				System.out.print("*");
			}
			else	System.out.print(" ");
		}
		System.out.println();
	}
}
}
