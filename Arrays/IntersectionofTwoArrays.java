package Arrays;
import java.util.Arrays;
public class IntersectionofTwoArrays {
public static void main(String[] args) {
	int[] nums1= {4,9,5};//4,5,9
	int[] nums2= {9,4,9,8,4};//4,4,8,9,9
	Arrays.sort(nums1);
    Arrays.sort(nums2);
	int[] a1=new int[nums1.length];
	intersection(nums1,nums2,a1);
	for(int n:a1) {
		System.out.println(n);
	}
	}
public static int[] intersection(int[] nums1,int[] nums2, int[] a1) {
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length){
        if(nums1[i]==nums2[j]){
        	while(k<a1.length) {
        		a1[k]=nums1[i];
        		k++;
        		break;
        	}
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return a1;
    }
}
