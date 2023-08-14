package learning.multithreading;

public class Laptop implements Runnable
{
 Thread t;
private Printer p;
 public Laptop(String name,Printer p)
 {
	 this.p=p;
	 t=new Thread(this,name);
			 t.start();
 }
 public void run()
 {
	 p.printDoc("docfile");
 }
}
