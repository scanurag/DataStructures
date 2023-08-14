package PatternQust;
public class XYz {
public static void main(String[] args) {
	int n=8;
	for(int i=1; i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	int s=n-1;
	for(int i=s;i>=1;i--)
	{
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println(" ");
	}
}
}
