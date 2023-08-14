package Oops;
class hj{
	int i;
	public void m0() {
		System.out.println(i);
	}
}
public class Mostimp2 {
public static void main(String[] args) {
   hj t1 = new hj();
   hj t2=t1;
   hj t3=t2;
   t2.i=150;
   hj t4=t1;
   t1.m0();
   t2.m0();
   t3.m0();
   t4.m0();
   System.out.println(t1); //dono ka object ref ek hi t1 ka bhi t2 ka output me dekho
   //ek object ke hum n number object reference bana sakte hai
   System.out.println(t2);
   System.out.println(t3);
   System.out.println(t4);
   System.out.println("******tum dekh rahe ho ge ki n number object reference criat kar sakte hai*******");
}
}
