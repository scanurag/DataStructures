package Arrays;
import java.util.*;
public class Arrays2D2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int row=sc.nextInt();
	int cols=sc.nextInt();
	int[][] num=new int[row][cols];
	for(int i=0;i<row;i++) {
		for(int j=0;j<cols;j++) {
			num[i][j]=sc.nextInt();
			}
		}
	int x=sc.nextInt();
	for(int i=0;i<row;i++) {
		for(int j=0;j<cols;j++) {
			if(num[i][j]==x) System.out.println("number is found" +i+"="+j);
		
		}
	}
}
}
