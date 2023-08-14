package Oops;
public class StudentDet {
	String id,password,name,email,phone;
	void Student1()
	{
		id="";
		password="";
		name="";
		email="";
		phone="";
		System.out.println("In Default constructor");
	}
	void Student1(String id,String password,String name,String email,String phone)	
	{
		this.id=id;
		this.password=password;
		this.name=name;
		this.email=email;
		this.phone=phone;	
	}
	void getDetails()
	{
	System.out.println("Student1 id is :"+id);
	System.out.println("Student1 password is :"+password);
	System.out.println("Student1 name is :"+name);
	System.out.println("Student1 email is :"+email);
	System.out.println("Student1 phone is :"+phone);
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
