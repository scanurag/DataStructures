package Arrays;
import java.util.*;
public class SearchInsertPosition {
public static void main(String[] args) {
int[] nums = {1,3,5,6};
int	target = 7;
System.out.println(searchInsert(nums,target));
}
public static int searchInsert(int[] nums, int target) {
    if(nums.length==0) return 0;
    int count=0;
    int i;
    for( i=0;i<nums.length;i++){
        if(nums[i]==target) break;
    }
    return i;
}
}
