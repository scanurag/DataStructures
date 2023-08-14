package learning.has_a_relationship;
public class Student {
	private String name;
	private Book bk;
	public void setStudent_Details(String name,Book bk)
	{
		this.name=name;
		this.bk=bk;
	}
	public void getStudent()
	{
		System.out.println("Student name is :" +name);
		bk.getBook();
	}
	public Book getStudent_Book() {
		return bk;///-> Book class Object
	}

	public static void main(String[] args) {
		Book bk=new Book();
		//System.out.println(b);
		bk.setBook("java", "Anurag");
		bk.getBook();
		Student s=new Student();
		s.setStudent_Details("abcd", bk);
		s.getStudent();
		Book bbk=s.getStudent_Book();
		bbk.getBook();
		
	}
}
