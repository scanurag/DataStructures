package edu.joy.cardevelopementpack;
public class Benz extends Car {
	@Override
	public void start() {
		System.out.println("Touch start ");
	}
	@Override
	public void accelerate() {
		System.out.println("Automated Drive");
	}
	@Override
	public void stop()
	{
		System.out.println("Touch Stop");
	}
	//specific method
	public void bluetooth() {
		System.out.println("JBL Bluetooth installed for "+this.getClass().getSimpleName()+"Car");
	}
}
