package learning.basics;

public class NameSlip {
	String name,college;
	int rollno;
	
	NameSlip()
	{
		name="";
		college="";
		rollno=0;
		System.out.println("In Default constructor");
	}
	NameSlip(String name,String college,int rollno) //perameterised constructor
	{
		this.name=name;
		this.college=college;
		this.rollno=rollno;
		System.out.println("in Perameterised");
	}
void getDetails()
{
System.out.println("name is " +name+ " collegename is " +college+ " rollno is " +rollno);	
}
 void setDetails(String string, String string2, int i) {
	// TODO Auto-generated method stub
	
}
}
