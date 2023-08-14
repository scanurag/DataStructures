package learning.multithreading;

public class Even_Odd {
	
	public static void main(String[] args) {
		Even_Odd1 ed=new Even_Odd1("even");
		
		Even_Odd1 ed1=new Even_Odd1("odd");
		//System.out.println(eda);
	}

}
class Even_Odd1 implements Runnable
{
	Thread t;
	public Even_Odd1(String name)
	{
		t=new Thread(this,name);
		t.start();
	}
	public void run()
	{
		String name=t.getName();
		for(int i=1;i<=20;i++)
		{
			if(name.equalsIgnoreCase("even")&&(i%2==0))
			{
				System.out.println(i+" "+name);
			}
			if(name.equalsIgnoreCase("odd")&&(i%2!=0))
			{
				System.out.println(i+" "+name);
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}

	}
}
