package Oops;
class Student2{
	int sid;
	String sname;
	String gender;
	int age;
	String address;
	String PhoneNumber;
	static String College;
	static String CollegeAddress;
	public void m3(int id,String name,String gen,int aget,String addre,String Phone) {
		sid=id;
		sname=name;
		gender=gen;
		age=aget;
		address=addre;
		PhoneNumber=Phone;
	}
	public static void m4(String College2,String CollegeAddress2) {
		College=College2;
		CollegeAddress=CollegeAddress2;
		
	}
	public void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(address);
		System.out.println(PhoneNumber);
	}
	public static void show2() {
		System.out.println(College);
		System.out.println(CollegeAddress);
	}
	
}
public class UsingPremi {
public static void main(String[] args) {
	Student2 s2= new Student2();
	s2.m3(1, "Anurag", "M", 23, "Deoria", "7234020314");
	s2.show();
	Student2.m4("SRm","LUCKNOW");
	s2.show2();
	Student2 s3= new Student2();
	s3.m3(1, "Golu", "M", 23, "Kanpur", "8299173654");
	s3.show();
	Student2.m4("SRMGPC","Gkp");
	s3.show2();
}
}
