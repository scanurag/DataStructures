package edu.joy.cardevelopementpack;
public class Audi extends Car {
	@Override
	public void start() {
		System.out.println("Button start ");
	}
	@Override
	public void accelerate() {
		System.out.println("full Clutch Drive");
	}
	@Override
	public void stop()
	{
		System.out.println("Button Stop");
	}
	//specific method
	public void bluetooth() {
		System.out.println("JBL Bluetooth installed for "+this.getClass().getSimpleName()+"Car");
	}
	public void airBag() {
		System.out.println("Ford AirBags Installed");
	}
}
