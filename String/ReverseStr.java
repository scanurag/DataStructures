 package String;
public class ReverseStr {
public static void main(String[] args) {
	String S="java is my life";
	String[] d=S.split(" ");
	String sv=" ";
	for(int i=d.length-1;i>=0;i--) {
		sv+=d[i];
		if(i>0) sv+=" ";
	}
	System.out.println(sv.trim());//trim method use hota hai space hatne ke liye
}
}
