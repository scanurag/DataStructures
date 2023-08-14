package Multithreading;

class T1 extends Thread{
	static T1 t1;
	public void run() {
		try {
			T2.t2.join();
		}catch(InterruptedException e) {
			
		}
		for(int i=1; i<=5;i++) {
			System.out.println(i+ "T1");
		}try {
			Thread.sleep(800);
		}catch(InterruptedException e) {
			
		}
	}
}
class T2 extends Thread {
	static T2 t2;
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+"T2");
			try {
				Thread.sleep(800);
			}catch(InterruptedException e) {
				
			}
		}
}
}
class T3 extends Thread{
	static T3 t3;
	public void run() {
		try {
			T1.t1.join();
		}catch(InterruptedException e) {
			
		}
		for(int i=1;i<=5;i++) {
			System.out.println(i+ "T3");
			try {
				Thread.sleep(800);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
}
public class JoinMethode {
	public static void main(String[] args)throws InterruptedException {
		T1.t1=new T1();
		T2.t2=new T2();
		T3.t3=new T3();
		T2.t2.start();
		T1.t1.start();
		T3.t3.start();
		T3.t3.join();
		for(int i=1; i<=5;i++) {
			System.out.println(i+"Main");
			Thread.sleep(800);
		}
		
	}

}

