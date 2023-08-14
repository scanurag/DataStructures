package learning.basics;

public class WebPortal {
	public static void main(String[] args) {
		
		User1 u1= new User1();
		u1.setDetails("scanurag","Abc","Anurag","scanurag@gmail.com","7234020314");
		u1.getDetails();
		u1.login();
		User1 u2= new User1("0.2anurag","Abc","Anurag","scanurag@gmail.com","7234020314");
		
		
	}

}
