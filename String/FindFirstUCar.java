package String;
public class FindFirstUCar {
public static void main(String[] args) {
	String s= "leetcode";
	System.out.println(find(s));
}
public static int find(String s) {
	char[] a=s.toCharArray();
	int count=0;
	for(int i=0;i<=a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				return -1;
			}
			else count=i;
			
		}
		break;
	}return count;
}
}
