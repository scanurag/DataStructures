package learning.Streaming;
public class TryCatch {
public static void main(String[] args) {
	System.out.println("Main Start");
	try {
		System.out.println(10/0);//Aritmetic a=new Aritmetic();
		
	}catch(ArithmeticException Exception ) {
		System.out.println("Handill...");
	}
	System.out.println("Main Method");
}
}
