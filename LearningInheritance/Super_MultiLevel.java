package LearningInheritance;
class Vehicle
{
	String color;
	Vehicle() {
}

	Vehicle(String color)
	{
		this.color=color;
	}
void getVehicleInfo()
{
	System.out.println("color is :" +color);
}
}
class TwoWheeler extends Vehicle
{
	String startmode;
	TwoWheeler()
	{
		
	}
	TwoWheeler(String startmode,String color)
	{
		super(color);
		this.startmode=startmode;
		
	}
	void getVehicleInfo()
	{
		super.getVehicleInfo();
		System.out.println("Two Wheeler can starting using" +startmode);
	}
}















public class Super_MultiLevel {

}
