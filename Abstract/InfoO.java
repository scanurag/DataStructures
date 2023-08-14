package Abstract;
abstract class animal{
	void legs()
	{
		System.out.println("four");
	}
	abstract void Sound();
	abstract void eat();
}
class Dog extends animal{

	@Override
	void Sound() {
		System.out.println("Bow Bow");
		
	}

	@Override
	void eat() {
		System.out.println("meat");
		
	}
	
	
}
class cat extends animal{

	@Override
	void Sound() {
		
		System.out.println("meeyaoo meeyaoo");
	}

	@Override
	void eat() {
		System.out.println("Roti");
		
	}
	
}
public class InfoO {
public static void main(String[] args) {
	Dog d=new Dog();
	d.legs();
	d.Sound();
	d.eat();
	cat c=new cat();
	c.legs();
	c.Sound();
	c.eat();
}
}
