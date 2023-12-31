package Sorting;
public class QuickSot {
public static void main(String[] args) {
	int[] a={4,7,1,2,9,5};
	quickSort(a,0,a.length-1);
	for(int n:a) {
		System.out.println(n);
	}
}
public static void quickSort(int[] a,int start,int end) {
	if(start>=end) return;
	int pivot=a[(start+end)/2];
	int i=start;
	int j=end;
	while(i<=j) {
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
		if(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	quickSort(a,start,j);
	quickSort(a,i,end);
}
}
 