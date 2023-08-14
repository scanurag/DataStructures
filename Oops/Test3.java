package Oops;
class Abc{
	static int i;
			int j;
public void me() {
	i++;
	j++;
	
}
public void me2() {
	System.out.println(i+ " "+j);
}
	}
public class Test3 {
public static void main(String[] args) {
 Abc c1 = new Abc();
 Abc c2 = new Abc();
 Abc c3 = new Abc();
  c1.me();
  c1.me2();
  
  c2.me();
  c2.me2();
  
  c3.me();
  c3.me2();
  
}
}
