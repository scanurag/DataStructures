package learning.multithreading;

public class CustomThread extends Thread
{
public CustomThread(String name)
{
	setName(name);//setting the name of the thread
	start();
}
public void run()//overriding run method for def the task of the thread
{
	System.out.println("thread name is :"+getName());
	for(int i=2;i<=20;i=i+2)
	{
		System.out.println(i);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
		ie.printStackTrace();	
		}
	}
}
	public static void main(String[] args) {
	new CustomThread("even numer");//Anonymous object->because there is no method to call explicity
	System.out.println("total number of threads :"+Thread.activeCount());
		
	}
}

