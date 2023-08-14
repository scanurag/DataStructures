package Sorting;
public class BinarySerach {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7};
	int ta=6;
	System.out.println(find(a,ta));
}
public static int find(int[] a,int ta) {
	int s=0;
	int e=a.length-1;
	while(s<=e) {
		int mid=s+(e-s)/2;
		if(a[mid]==ta) {
			return mid;
		}
		else if(a[mid] >ta) {
			e=mid-1;
		}
		else {
			s=mid+1;
		}
	//mid=s+(e-s)/2;
	}
	return s;
}
}
