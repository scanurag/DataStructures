package learning.multithreading;

public class Desktop implements Runnable
{
 Thread t;
private Printer p;
 public Desktop(String name,Printer p)
 {
	 this.p=p;
	 t=new Thread(this,name);
			 t.start();
 }
 public void run()
 {
	 p.printDoc("wordfile");
 }
}
