package Arrays;
public class MinimumSizeSubarraySum {
public static void main(String[] args) {
  int target=7;
	int[] a= {2,3,1,2,4,3};
	System.out.println(minSizeSubarraySum(target,a));
}
public static int minSizeSubarraySum(int target,int[] a) {
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==target) return 1;
			if((a[i]+a[j])==target) return 2;
			
		}
	}
	return -1;
}
}
