package learning.has_a_relationship;

public class Book {
	private String bookname,subject;
	
public 	void setBook(String bookname,String subject)
	{
		this.bookname=bookname;
		this.subject=subject;
	}
public void getBook()
{
	System.out.println("Book name is" +bookname );
	System.out.println("Subject of the book" +subject);
}
}
