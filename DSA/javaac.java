package DSA;
import java.util.*;
class Arraydup{
public  int DupRev(int[] num) {
	int j=1;
	for(int i=0; i<=num.length-1;i++) {
		if(num[i]!=num[i+1]) {
			num[j]=num[i+1];
					j++;
		}
	}
	return j;
}





}


public class javaac {
public static void main(String[] args) {
int[] num= {1,1,2,2};	

	}



}
