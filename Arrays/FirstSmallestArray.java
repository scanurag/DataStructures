package Arrays;
public class FirstSmallestArray {
public static void main(String[] args) {
	int[] a= {5,2,3,4,1};
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(min<a[i]) min=a[i];
	}
	System.out.println(min);
}
}
