package Arrays;
import java.util.*;
public class RemoveElement {
public static void main(String[] args) {
	int[] num= {3,2,2,3};
	int val=3;
	removeElement(num,val);
	for(int a:num)
	{
		System.out.println(a);
	}
}
public static int removeElement(int[] num,int val) {
	if(num.length==0) return 0;
	int count=0;
	int arr[] = {0,0,0,0};
	for(int i=0;i<num.length;i++) {
		if(num[i]!=val) {
			count++;
		}
		if(num[i] ==val) {
			num[i]=arr[i];
		}
	}
	return num[count];
}
}
