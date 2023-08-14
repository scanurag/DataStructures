package DSA;
import java.util.HashSet;
public class removeDuplicates2 {
public static void main(String[]args) {
	int[] a= {1,2,1,3,4,3,5};
	HashSet<Integer> hs=new HashSet<>();//hashset duplicates ko hata deta hai
	for(int i=0; i<a.length; i++) {
		hs.add(a[i]);
	}
	for(int no:hs) {//no:hs index 7 pe pahuche ga to uo print nahi hoga  to for each loop laga dege 
		System.out.print(no+"");
	}
}
}
