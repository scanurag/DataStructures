package PatternQust;

public class Pattern5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i;j++) {
				if(j==1||j==2||j==3||j==4)		System.out.print(" ");
			}
			int S=2*(n-i);
			for(int j=1;j<=S;j++) {
			System.out.print(j);
			}
			for(int j=i; j>=1;j--) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			int D=2*(n-i);
			for(int j=1;j<=D;j++) {
				System.out.print(j);
			}
			for(int j=i; j>=1;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		}
}