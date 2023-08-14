package learning.multithreading;

public class Table {
	void printTable(int number)
	{
		System.out.println("Multiplication table");
		Thread t=Thread.currentThread();
		System.out.println("thread name is :"+t.getName());
		synchronized (this) {
			for(int i=1;i<=10;i++)
			{
				System.out.println(number+"*"+i+"="+(number*i));
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
			
		}
	}

}
