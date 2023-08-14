package Arrays;
public class MoveZero {
public static void main(String[] args) {
	int[] nums= {0,1,0,3,12};
	moveZero(nums);
	for(int n:nums) {
		System.out.println(n);
		
	}
}
public static void moveZero(int[] nums) {
		int a=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[a]=nums[i];
				a++;
			}
		}
		while(a<nums.length) {
			nums[a++]=0;
		}
	}
}

