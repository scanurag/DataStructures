package Multithreading;
class Myth1 implements Runnable
{
@Override
public void run() {
	for(int i=1; i<=10;i++) {
		System.out.println(i+ "Abc");
		try {
			Thread.sleep(800);
		}catch(InterruptedException e) {
			
		}
	}
}
}
public class Test {
public static void main(String[] args) {
	Myth1  m1= new Myth1();
	Thread a=new Thread(m1);
	a.start();
	m1.run();
	a.run();
}
}
