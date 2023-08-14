package Oops;
class KL{
 
	static int i;
	{
		i++;
	}
}
public class RufaWork {
public static void main(String[] args) {
	KL klm1 = new KL();
	KL klm2= new KL();
	KL klm3 = new KL();
	System.out.println(KL.i);
}
}
// ye interviwe me puchha jata hai 
//static me object banye ho  static me memory create ho raha hai to 1 se 2 ho raha hai 
//uske baad me 3 ho jaa raha hai