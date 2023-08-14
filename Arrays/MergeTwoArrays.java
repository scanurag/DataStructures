package Arrays;
import java.util.*;
public class MergeTwoArrays {
public static void MergeArrays(int[]arr1,int[] arr2,int n1,int n2,int[] arr3) {
	int i=0,j=0,k=0;
	while(i<n1&&j<n2){
		if(arr1[i]<arr2[j]) {
			arr3[k++]=arr1[i++];
		}else arr3[k++]=arr2[j++];
	}
	
}
public static void main(String[] args) {
	
}
}
