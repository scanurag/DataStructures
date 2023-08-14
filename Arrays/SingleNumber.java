package Arrays;
import java.util.*;
public class SingleNumber {
public static void main(String[] args) {
	int[] nums= {1,1,5,5,8};
	System.out.println(singleNumber(nums));
}
public static int singleNumber(int[] nums) {
	int tamp=0;//pahle tamp 0 tha t=1^0//T=1//1^1//T=0;//5^0//T=5//5^5//T=0//8^0//T=8 
	//so output 8 dega;
	for(int i=0;i<nums.length;i++) {
		tamp=tamp^nums[i];
	}
	return tamp;
}                 
}
//is me dekh rahe ho ge kya ho raha hai pahle baar ye kya kiya 1^0 aab tamp ki value 1 ho gai 
// hai 1^1 pe ye zero dega same^same pe ye 0 dega