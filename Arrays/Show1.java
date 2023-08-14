package Arrays;
import java.util.Arrays;
public class Show1 {
public static void main(String[] args) {
	EmpComparable[] arr1= {
			new EmpComparable("A" ,70) ,
			new EmpComparable("C" ,60) ,
			new EmpComparable("Z" ,30),
			new EmpComparable("M" ,55),
			new EmpComparable("A",30)};
	Arrays.sort(arr1);
	for(EmpComparable e:arr1) {
		System.out.println(e);
	}
}
}
