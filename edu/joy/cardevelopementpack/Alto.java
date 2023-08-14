package edu.joy.cardevelopementpack;
public class Alto extends Car {
@Override
public void start() {
	System.out.println("Key start ");
}
@Override
public void accelerate() {
	System.out.println("Half Clutch Drive");
}
@Override
public void stop()
{
	System.out.println("key Stop");
}
//specific method
public void bluetooth() {
	System.out.println("Boat Bluetooth installed for "+this.getClass().getSimpleName()+"Car");
}
}
