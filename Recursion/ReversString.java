package Recursion;
public class ReversString {
public static void RevString(String str, int Idx) {
if(Idx==0) {
	System.out.println(str.charAt(Idx));
	return;
}
System.out.println(str.charAt(Idx));
RevString(str,Idx-1);
}
public static void main(String[] args) {
String  str="ANURAG";
RevString(str,str.length()-1);
}
}
