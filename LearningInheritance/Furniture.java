package LearningInheritance;
class AnuragFurniture{
	String color,price,material;
	public AnuragFurniture(String color,String price,String material) {
		this.color=color;
		this.price=price;
		this.material=material;
	}
		void getFurnitureDetails()	
		{
			System.out.println("Furniture color is " +color);
			System.out.println("Furniture price is " +price);
			System.out.println("Furniture material is " +material);
	}
}
class JavaFurniture extends AnuragFurniture
{
String  tabletype;

 JavaFurniture(String color,String price,String material,String tabletype)
 {
     super(color,price,material);
     this.tabletype=tabletype;
 }
 void getFurnitureDetails()
 {
	 super.getFurnitureDetails();
	 System.out.println("tabletype is "+tabletype);
 }
}
     public class Furniture {
    	 public static void main(String[] args) {
    		 JavaFurniture Fw=new JavaFurniture("black","5000","wooden","studytable" );
    		 Fw.getFurnitureDetails();
    				 
			 
		}

}
