package METHOD;
public class RevNumber {
public static int RevFas(int n) {
	int sum=0;
	for(;n>0;n/=10) sum=(sum*10)+n%10;
	return sum;
}
public static void main(String[] args) {
	System.out.println(RevFas(12345));
}

}
