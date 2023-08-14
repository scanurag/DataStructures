package learning.basics;

public class Employee {
	
	String empName;
	static String collegeName="SRM";
	Employee()
	{
		
	}
	Employee(String empName)
	{
		 this.empName=empName;
	}
	void getName()
	{
		System.out.println("EmployeeName is:"+empName);
	
	}
	public static void main(String[] args) {
		System.out.println("collegeName is :" +Employee.collegeName);
		Employee.collegeName="SRMCEM";
		System.out.println("collegeName after modification :" +Employee.collegeName);
		Employee e=new Employee("Anurag");
		e.getName();
		
	}
	
	

}
