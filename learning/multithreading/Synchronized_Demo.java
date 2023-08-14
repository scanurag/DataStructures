package learning.multithreading;

public class Synchronized_Demo 
{
	public static void main(String[] args) {
		
	
	Printer p=new Printer();
	Laptop lap=new Laptop("Dell", p);
	Desktop dsk=new Desktop("HP", p);

}
}