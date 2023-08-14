package Oops;
class Ab{
	static int i;
	int j;
	 public void incr() {
		 i++;
		 j++;
	 }
	 public void display() {
		 System.out.println(i+ " " +j);
	 }
}
public class Test2 {
public static void main(String[] args) {
	 Ab a1 = new Ab();
	 Ab a2 = new Ab();
	 Ab a3 = new Ab();
	 
	 a1.incr();
	 a2.incr();
	 a3.incr();
	 
	 a1.display();
	 a2.display();
	 a3.display();
	 
}
}
