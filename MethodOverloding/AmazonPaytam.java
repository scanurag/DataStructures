package MethodOverloding;
class Amazon{
	String message="hi amazon";
}
class Paytam{
	String message="hi Paytam";
}
class ShowI{
	public void geetCustomer(Amazon amazon) {
		System.out.println(amazon.message);
		
	}
	public void geetCustomer(Paytam paytam) {
		System.out.println(paytam.message);
	}
}

public class AmazonPaytam {
public static void main(String[] args) {
	 Amazon ama = new Amazon();
	 Paytam pay = new Paytam();
	ShowI showI = new ShowI();
	showI.geetCustomer(ama);
	showI.geetCustomer(pay);
	//showI.geetCustomer(new Amazon());
	//showI.geetCustomer(new Paytam());
}
}
