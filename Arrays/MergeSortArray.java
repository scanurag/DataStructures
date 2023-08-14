package Arrays;
public class MergeSortArray {
public static void main(String[] args) {
int[] nums1 = {1,2,3,0,0,0};
int[] nums2 = {2,5,6};
int m=3,n=3;
mergeSortArray(nums1,m,nums2,n);
for(int n1:nums1) {
	System.out.println(n1);
}
}
public static void mergeSortArray(int[] nums1,int m,int[] nums2,int n) {
	int p=m-1;
	int q=n-1;
	int i=m+n-1;
	while(q>=0) {
		if(p>=0 && nums1[p]>nums2[q]) {
			nums1[i--]=nums1[p--];
		}
		else {
			nums1[i--]=nums2[q--];
		}
	}
}
}
