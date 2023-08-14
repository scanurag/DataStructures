package MethodOverloding;
class K{
	public void kl() {
		System.out.println("hi");
	}
	public void kl(int i) {
		System.out.println(i);
	}
	public void kl(String i) {
		System.out.println("Anurag"+i);
	}
}
public class SecndProgram {
public static void main(String[] args) {
	K k = new K();
	k.kl();
	k.kl("ka haal baa");
	k.kl(55);
}
}
//ye jo dekh rahe ho ye tumhar length dekh kar dikhta hai method overloding
//jab bhi tum mekho is me tumhara jo hai method same hai aur asb me difrent defrent 
//chiz diya gya hai methode overloding jisme method name same ho but permeter alg ho usko kate hai
//ye 3 tarike se kiye jate hai 1 length 2 type 3 Ocrence
//