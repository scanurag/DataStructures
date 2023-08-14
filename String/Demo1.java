package String;
public class Demo1 {
public static void main(String[] args) {
	String s="aabbbdfgaab";//length 6
	s=s.toLowerCase();//anurag
while(s.length()>0) {
	char c=s.charAt(0);
	String s1=s.replace(c+"","");//  _nur_g >length 4   
	int count=s.length()-s1.length();//6-4=2
	System.out.println(c+"="+count);//a=2
	//aur ayse hi age ka prossec ho raha hai 
	s=s1;// ab ye s me s1 ki valu save kara de raha hai s=nurg aab ye dubar se kare ga 
	//jaha s me "Anurag" hai waha s="nurg" kare ga aur sab ke liye ayse hi parform kare ga 
}
}
}
