package DSA;
public class RecursionL {
public static int invitePeople(int n){
	if(n<=1) {
		return 1;
	}
	int ways1=invitePeople(n-1);
	int ways2=(n-1)*invitePeople(n-2);
	
	return ways1+ways2;
	
}
public static void main(String[] args) {
	int n=4;
	System.out.println(invitePeople(n));
}
}
