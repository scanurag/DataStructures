package SingletionClass;
import java.util.Scanner;
class Theatre{
	int Seats=50;
private static Theatre t=null;
	public Theatre() {
		
	}
	public static Theatre getI() {
		if(t==null) t=new Theatre();
		return t;
	}
	public void reserveSeats(int numSeats) {
	if(numSeats>Seats) {
		System.out.println(numSeats+"Seats are not available");
		System.out.println(Seats+"Seats are available");
		return;
	}
	Seats-=numSeats;
	System.out.println(numSeats+"  "+"Seats are reserved");
	System.out.println("thank you for booking...!");
	System.out.println(Seats+" "+"Seats are available");
	}
}
class BookingApp{
	public void bookTickects() {
	System.out.println("how many Tickets:");
	Scanner sc=new Scanner(System.in);
	int teckets=sc.nextInt();
	Theatre th1 = new Theatre();
	th1.reserveSeats(teckets);
	}
}
public class BookMyShow {
public static void main(String[] args) {
	BookingApp App = new BookingApp();
	App.bookTickects();
}
}
