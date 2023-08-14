package learning.basics;

public class UserDetails {
	void showInfo(String name,long...phone)
	{
      System.out.println("Hello"+name);
      for(int i=0;i<phone.length;i++)
      {
    	  System.out.println(phone[i]+"\t");
      }
      System.out.println();
	}
	public static void main(String[] args) {
		UserDetails ud=new UserDetails();
		ud.showInfo("Scott",941559174l);
		ud.showInfo("Mike",998453889l,7234020314l);
		ud.showInfo("Anurag",8299173654l,9984672347l,7234120314l);
	}
		
	}
