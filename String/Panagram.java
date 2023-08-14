package String;
public class Panagram {
public static void main(String[] args) {
	String str="anurag";
	char[] a=str.toCharArray();
	for(int i=0;i<a.length;i++) {
	for(char ch='a';ch<='z';ch++) {
		if(a[i]==ch) {
			System.out.println("paligram");
		}
		break;
	}
	}
}
}
