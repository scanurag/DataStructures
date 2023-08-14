package LearningInheritance;
class Transport
{
	void move()
	{
		System.out.println("Every transport will move");
	}
}
class AirTransport extends Transport
{
@Override
void move() 
{
System.out.println("move in the air");
}
}
class LandTransport extends Transport
{
	@Override
void move() 
{
System.out.println("maves on land");
}

}


public class MethodOverriding {
	public static void main(String[] args) {
		AirTransport at=new AirTransport();
		at.move();
		LandTransport la=new LandTransport();
		la.move();
		
		
	}
}


