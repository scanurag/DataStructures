package DSA;
import java.util.*;
public class rectangle {
	public static void main(String args[]) {
		int n=5;
		int m=5;
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=m; j++) {
				if(i==n/2+1||j==n/2+1) {
					System.out.print(" *");
				}else {
					System.out.print(" 0");
				}
			}
			System.out.println();
		}
	}

}
