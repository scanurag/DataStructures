package String;
public class ReverseWotUseMeth {
public static void main(String[] args) {
	String s1="java is my life";
	char[] a=s1.toCharArray();
  String s2=" ";
  int i=a.length-1;
  int j=a.length-1;
  while(i>=0) {
	  while(i>=0 && a[i] != ' ') //jab i 10 huaa a[i] isko space mila to condtion false ho gayi
		  {
		  i--;//I PAHLE 13 huaa phir 12 huaa phir 11 hua 10 huaa 
		  }
	  int k=i+1;//aab yaha pe k=11 pahle i 10 tha to k=i+1; 11
	  String temp=" ";//yaha tamp naam ka var le raha hai ye is liye le raha hai 
	  //kiw ki isko save karna life ko so
	  while(k<=j){//so yaha pe k index pe isko value mil rahi hai so 11 se 14 tak chale ga aou tamp add kare ga
		  temp+=a[k];
		  k++;
	  }
	  s2=s2+temp;//yaha pe valu save kar raha hai  
	  if(i>-1) s2=s2+ " ";
	  i--;
	  j=i;
  
          
  }
  System.out.println(s2.trim());
}
}
