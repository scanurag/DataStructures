package PatternQust;
public class Zpattern {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==1||j==1||i==n) System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
	}
	for(int i=n; i>=1; i--) {
		for(int j=1;j<=n;j++) {
			if(j==n||i==1) System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
	}
	
}
}
