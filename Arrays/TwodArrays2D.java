package Arrays;
import java.util.*;
public class TwodArrays2D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] nums1=new int[row][col];
	int[][] nums2=new int[row][col];
	int[][] sum=new int[row][col];
	for(int i=0; i<row;i++) {
		for(int j=0; j<col;j++) {
		nums1[i][j]=sc.nextInt();
		System.out.println("for nums2 array");
		nums2[i][j]=sc.nextInt();
		}
	}
	for(int i=0; i<row;i++) {
		for(int j=0; j<col;j++) {
		sum[i][j]=nums1[i][j]*nums2[i][j];
		System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
}
}
