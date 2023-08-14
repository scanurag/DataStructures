package PatternQust;
public class HeartPattern {
public static void main(String[] args) {
	int n=5;
	for(int i=4; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		//ye spaces kitna dena hai uske bhich me uske liye hai
		int S=2*(n-i);
		for(int j=1; j<=S; j++) {
			System.out.print(" ");
		}
		//2nd part * ko print kara rahe hai
		for(int j=i; j>=1; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<i;j++) {
			System.out.print("*");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
