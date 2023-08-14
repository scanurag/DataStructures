package LearningInheritance;
class Player
{
	String name,country;
	void setInfo(String name,String country)
	{
		this.name=name;
		this.country=country;
		}
	void getInfo()
	{
		System.out.println("Player Name is"+name);
		System.out.println(name+" belongs to " +country);
		
	}
}
class CricketPlayer extends Player
{
 String Player_type;
int runs;
void set(String Player_type, int runs)
{
	this.Player_type=Player_type;
	this.runs=runs;

}
void get()
{
	System.out.println(name+" is a "+Player_type);
	System.out.println("Runs scored by "+name+" is "+runs);
}

	
}
public class InheritanceDemo {
public static void main(String[] args) 
{
	CricketPlayer cp=new CricketPlayer();
	
	cp.setInfo(" MSDHONI", "INDIA");
	cp.getInfo();
	cp.set("Batsman",50000); 
	cp.get();
	
}
}

