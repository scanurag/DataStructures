package learning.basics;

public class StringDemo {
	public static void main(String[] args) {
		String s="Anurag";
		System.out.println("Before Modification the value is :"+s);
				s.toUpperCase();
				System.out.println("After Modification the value is :"+s);
				
				s=s.toUpperCase();
				System.out.println("after assigning it with old refrence :"+s);
	}

}
