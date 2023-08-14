package DSA;
public class Pattern3 {
	public static void main(String[] args) {
int n=5;
for(int i=1;i<=n;i++) {
	for(int j=1; j<=i;j++) {
		System.out.print(j);
	}
	int S=2*(n-i);
	for(int j=1;j<=S;j++) {
		System.out.print(" ");
	}
	for(int j=i; j>=1;j--) {
		System.out.print(j);
	}
	
	System.out.println();
}
for(int i=n;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
	
	int D=2*(n-i);
	for(int j=1;j<=D;j++) {
		System.out.print(" ");
	}
	for(int j=i; j>=1;j--) {
		System.out.print(j);
	}
	System.out.println();
}
}
}
