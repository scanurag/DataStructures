package learning.multithreading;

public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		Table t=new Table();
		Calculator c=new Calculator("cisco",t,4);
		Mobile m=new Mobile("vivo",t,10);
	}

}
