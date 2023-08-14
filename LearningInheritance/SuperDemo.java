package LearningInheritance;
class Book
{
	String name;
	float price;
	String author="Anurag";
	void setInfo(String name,float price)
	{
	this.name=name;
	this.price=price;
	}
	void show()
	{
		System.out.println("Book Name is" +name+ "and price is"+price);
		System.out.println("author name is :" +author);
	}

	
}
class javaBook extends Book
{
	String author="Anurag";
	String version;
	void setversion(String version)
	{
		this.version=version;
	}
	void show()
	{
		super.show();
		System.out.println("book version is :"+version);
		System.out.println("author name is :" +author);
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		javaBook jb=new javaBook();
		jb.setInfo("Anurag", 500.0f);
		jb.setversion("java17");
		jb.show();
	}

}
