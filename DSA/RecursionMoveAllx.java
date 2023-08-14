package DSA;
public class RecursionMoveAllx {
public static void moveAllx(String str, int idx , int count, String newString) {
	if(idx==str.length()) {
		for(int i=0 ; i<count; i++) {
			newString+='x';
		}
		System.out.println(newString);
		return;
	}
	char currChar=str.charAt(idx);
	if(currChar == 'x') {
		count++;
		moveAllx(str,idx+1, count,newString); //Moving all 'x' to the end of the string
	}else {
		newString=newString+currChar;
		moveAllx(str,idx+1,count,newString);
	}
}
public static void main(String[] args) {
	String str="axbcxxd";
	moveAllx(str,0,0,"");
}
}
