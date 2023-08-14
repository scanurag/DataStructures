package edu.joy.cardevelopementpack;
public class Driver {
public void drive(Car car) {
	car.start();
	car.accelerate();
	car.stop();
	}
	public void accessBluetooth(Car car) {
		if(car instanceof Alto)
			((Alto)car).bluetooth();
		if(car instanceof Alto) {
			Audi audi=(Audi)car;
			audi.bluetooth();
		}
	}
	public void accessAirBag(Car car) {
		if(car instanceof Audi)
			((Audi)car).airBag();
	}
}

