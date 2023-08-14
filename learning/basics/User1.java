package learning.basics;

public class User1 {
	String id,password,name,email,phone;
	User1()
	{
		id="";
		password="";
		name="";
		email="";
		phone="";
		System.out.println("In Default constructor");
	}
	User1(String id,String password,String name,String email,String phone)	
	{
		this.id=id;
		this.password=password;
		this.name=name;
		this.email=email;
		this.phone=phone;	
	}
	void getDetails()
	{
	System.out.println("User1 id is :"+id);
	System.out.println("User1 password is :"+password);
	System.out.println("User1 name is :"+name);
	System.out.println("User1 email is :"+email);
	System.out.println("User1 phone is :"+phone);
	}
		
	
	 void setDetails(String id,String password,String name,String email,String phone ) {
		    this.id=id;
			this.password=password;
			this.name=name;
			this.email=email;
			this.phone=phone;
		 
		
	}
	void login()	
	{
		if(id.equals("scanurag") && password.equals("Abc"))
		{
			System.out.println("login"); 
				
				
			}
		else
		{
		  System.out.println("invaild userid");	
		}
		}
		
		}
			


