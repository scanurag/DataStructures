package LearningInheritance;
abstract class Shape{
	String color;
	void setColor(String color)
	{
		this.color=color;
	}
	void getColor()
	{
		System.out.println("Color is :"+color);
	}
	abstract void area();
	abstract void volume();
}
class Rectangle extends Shape{
	private int width,height;
	Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	void volume()
	{
		
	}
	void area()
	{
		int area=width*height;
		System.out.println("Area of Rectangle is :"+area);
	}
}
class Cube extends Shape
{
	private int side;
	Cube(int side)
	{
		this.side=side;
	}
	void volume()
	{
		int volume=side*side*side;
		System.out.println("volume of cube is :"+volume);
	}
	void area()
		{
		int area=6*side*side;
		System.out.println("Area is :" +area);
		}
	}




public class Abstract_MethodOverriding {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(3,5);
		r.area();
		r.setColor("RED");
		r.getColor();
		Cube c=new Cube(4);
		c.setColor("Green");
		c.area();
		c.volume();
		c.getColor();
	}

}
