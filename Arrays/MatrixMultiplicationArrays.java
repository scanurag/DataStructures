package Arrays;
import java.util.*;
class MatrixMultiplicationArrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ente numbe");
	int[][] arr1= {{3,3},{5,5}};
	int[][] arr5={{3,1},{5,8}};
	int[][] mult={{0,0},{0,0}};
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr5.length;j++) {
			for(int k=0;k<mult.length;k++) {
				mult[i][j] += arr1[i][k]*arr5[k][j];
			}
		}
	}
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr5.length;j++){
			System.out.print(mult[i][j]+" ");
		}
		System.out.println();
	}
}
}//https://ngrok.com/download
//https://www.loom.com/share/1eb6d0ada6a44fc9a08b9a91947b3a5b//node instalet
//https://www.loom.com/share/b2ddeec574424129824e281b36b1195c//Yarn Installation
//https://www.loom.com/share/211f262d27cb4dc59cc98daf7a2949e9// installation ngrok.
