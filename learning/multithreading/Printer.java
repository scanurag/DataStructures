package learning.multithreading;

public class Printer {
	public synchronized void printDoc(String type)
	{
		Thread t=Thread.currentThread();
		System.out.println("Thread name is :" +t.getName());
		for(int i=1;i<4;i++)
		{
			System.out.println("Printing"+type+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();	
			}
		}
	}

}
