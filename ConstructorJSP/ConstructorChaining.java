package ConstructorJSP;
class J{
	int i;
	public J() {
		this(20);//yeha dekho this(); laga ke dono constructer ko print kara rahe hai
		
		System.out.println("hi JP");
	}
	public J(int i) {
		this.i=i;//agar iske sath tum ko print karana hon to object creat kiye ho 
		// waha pe ja ke valu do udke baa fist line pe callto this lagwo this();//ye default hi loge hi
		//loge kiw ki ppahte  tumhara cunctrocter defaulat hai
		System.out.println("Anurag");
	}
}
public class ConstructorChaining {
public static void main(String[] args) {
	J j = new J();
}
}
