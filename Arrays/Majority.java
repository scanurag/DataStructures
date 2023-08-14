package Arrays;
import java.util.*;
public class Majority {
public static void main(String[] args) {
	int[] nums= {1,1,1,2,2,2,2,2};
	System.out.println(majorityElement(nums));
}
public static int majorityElement(int[] nums) {
	for(int i=0;i<nums.length;i++) {
		int count=1;
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]==nums[j]) {
				count++;
			}
		}
		if(count>nums.length/2) {
			return nums[i];
		}
	}
	return -1;
}
}
