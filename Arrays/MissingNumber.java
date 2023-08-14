package Arrays;
public class MissingNumber {
public static void main(String[] args) {
	int[] nums= {1,0,3};
	System.out.println(missing(nums));
}
public static int missing(int[] nums) {
	int sum=0;
	for(int i=0;i<nums.length;i++) {
		sum+=nums[i];
	}
	int Ac=nums.length*(nums.length+1)/2;
	int misNum=Ac-sum;
	return misNum;
}
}
