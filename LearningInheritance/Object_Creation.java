package LearningInheritance;
class Animal{
	Animal()
	{
		System.out.println("I am Animal class");
		
	}
}
class Loin extends Animal{
	Loin()
	{
		System.out.println("I am Loin class");
		
	}
}
class Cub extends Loin{
	Cub()
	{
		System.out.println("I am Cub class");
	}
}

public class Object_Creation {
	public static void main(String[] args) {
		Cub c = new Cub();
	}

}
