 package learning.basics;

import learning.beans.Course;
public class College {
	String name,code;//instance variable
	
	public College()
	{
		System.out.println("Inside constructor");
		name="SRECEM";
		code="122";
	}
 void setDetails(String name, String code)
 {
	 this.name=name;
	 this.code=code;
 }
 void getDetails()
 {
	 System.out.println("College Name is "+name+" College code is "+code); 
	 
 }
public void setCollege_Name(String string) {
	// TODO Auto-generated method stub
	
}
public String getCollege_Name() {
	return name;
	// TODO Auto-generated method stub
	
}
public void set(Course c1) {
	// TODO Auto-generated method stub
	
}
}
  
