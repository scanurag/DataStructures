package String;
public class RemoveNum {
public static void main(String[] args) {
String s1="a3f4g2h7";
int sum=0;
for(int i=0;i<s1.length();i++) {
	char c=s1.charAt(i);
	if(c>='0'&& c<='9') {
	int a=Integer.parseInt(String.valueOf(c));
	//sum+=a;
	System.out.println(a);
	}
}

}
}
