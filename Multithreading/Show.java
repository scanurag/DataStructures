package Multithreading;
class G1 extends Thread{
	@Override
	public void run() {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(800);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
}
public class Show {
public static void main(String[] args)throws InterruptedException {
	G1 g1 = new G1();
	g1.start();
	for(int i=1;i<=10;i++) {
		System.out.println(i+"Main");
	try {
		Thread.sleep(800);
	}catch(InterruptedException e) {
		
	}
	}
}
}
