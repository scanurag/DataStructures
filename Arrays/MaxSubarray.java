package Arrays;
public class MaxSubarray {
public static void main(String[] args) {
	int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
	System.out.println(count(nums));
}
public static int count(int[] nums) {
	int sum=0;
	int max=nums[0];
	for(int i=0; i<nums.length;i++) {
		sum+=nums[i];
		if(sum>max) max=sum;
		if(sum<0) sum=0;
	}
	return max;
}
}
