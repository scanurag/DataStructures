package edu.joy.cardevelopementpack;
public class CarTest {
public static void main(String[] args) {
	Driver driver1 = new Driver();
		driver1.drive(new Alto());
		driver1.drive(new Audi());
		driver1.drive(new Benz());
		driver1.accessBluetooth(new Alto());
		driver1.accessBluetooth(new Audi());
		driver1.accessAirBag(new Audi());
}
}
