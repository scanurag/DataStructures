package Oops;
class Ahf{
	 String StudentName;
	 long StudentNumber;
	 int StudentId;
	 static String College;
	 static String Address;
	 public void Studentinfo() {
		 System.out.println(StudentName);
		 System.out.println(StudentNumber);
		 System.out.println(StudentId);
	 }
	 public static void Collegeinfo() {
		 College="Srmcem";
		 Address="Lucknow";
		 System.out.println(College);
		 System.out.println(Address);
	 }
}
public class Student {
public static void main(String[] args) {
	Ahf jh=new Ahf();
	Ahf jh1=new Ahf();
	Ahf jh2=new Ahf();
	Ahf jh3=new Ahf();
	  jh.StudentName="Anurag Singh";
	  jh.StudentNumber=7234020314L;
	  jh.StudentId=1122;
	  jh.Studentinfo();
	  Ahf.Collegeinfo();
	  System.out.println("****************************");
	  jh1.StudentName="0.2anurag";
	  jh1.StudentNumber=8299173654L;
	  jh1.StudentId=1123;
	  jh1.Studentinfo();
	  Ahf.Collegeinfo();
	  System.out.println("***************************");
	  jh2.StudentName="Shri";
	  jh2.StudentNumber=7405203147L;
	  jh2.StudentId=1124;
	  jh2.Studentinfo();
	  Ahf.Collegeinfo();
	  System.out.println("*************************");
	  jh3.StudentName="Amar";
	  jh3.StudentNumber=8299173654L;
	  jh3.StudentId=1125;
	  jh3.Studentinfo();
	  Ahf.Collegeinfo();
}
}

