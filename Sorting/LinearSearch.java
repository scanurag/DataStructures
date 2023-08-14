package Sorting;
public class LinearSearch {
public static void main(String[] args) {
	int[] a= {5,2,8,1,9};
	System.out.println( find(a,1));
}
public static int find(int[] a,int c) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==c) return i;
	}
	return -1;
}
}
