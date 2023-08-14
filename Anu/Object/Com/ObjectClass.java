package Anu.Object.Com;
class stud{
	int id;
	String name;
	public stud(int id,String name) {
		this.id=id;
		this.name=name;                    
	}
	@Override
	public String toString() {
		return "stud [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class ObjectClass {
public static void main(String[] args) {
	stud h=new stud(12,"Anuj");
	System.out.println(h.toString());
	stud h2=new stud(14,"Golu");
	System.out.println(h2.toString());
}
}
