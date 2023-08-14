package learning.basics;

public class VariableArgument {
   void addition(int ...number)//Variable argument
   {
	 
	   int sum=0;
	   for(int i=0;i<number.length;i++)
	   {
		   sum=sum+number[i];
	   }
	   System.out.println("sum of"+number.length+"is"+sum);
   }
   public static void main(String[] args) {
	   VariableArgument va=new VariableArgument ();
	   va.addition(1,2);
	   va.addition(4,5,6,8);
	   va.addition(5,6,7,89,90);
}
}
