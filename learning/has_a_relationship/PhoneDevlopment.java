package learning.has_a_relationship;
import java.util.Scanner;
class Airtel{
	String SimName;
	public Airtel(String SimName) {
		this.SimName=SimName;
	}
	public void callImplemtationforAirtel() {
		System.out.println("Internet can not used by Airtel:"+SimName+":Sim Opretion");
	}
}
class Jio{
	String SimName;
	public Jio(String SimName) {
		this.SimName=SimName;
	}
	public void callImplemtationforJIO() {
		System.out.println("Internet used by JIO:"+SimName+":Sim Opretion");
	}
}
class Battery{
	String BatteryName;
	public Battery(String BatteryName) {
		this.BatteryName=BatteryName;
	}
	public void Display() {
		System.out.println(BatteryName);
	}
}
class Phone{
	String PhoneName;
	Airtel airtel;
	Jio jio;
	Battery battery;
	public Phone(String PhoneName,Battery battery) {
		this.PhoneName=PhoneName;
		this.battery=battery;
	}
	public void Show() {
		System.out.println(PhoneName+" and"+battery);
	}
	public void call() {
		Scanner simcall=new Scanner(System.in);
		System.out.println("1 Airtel \n 2.Jio");
		int SimSelect=simcall.nextInt();
		switch(SimSelect)
		{
		case 1:
			airtel=new Airtel("Airtel");
			airtel.callImplemtationforAirtel();
			break;
		case 2:
			jio=new Jio("Jio");
			jio.callImplemtationforJIO();
			break;
		}
	}
}

public class PhoneDevlopment {
public static void main(String[] args) {
	Battery battery=new Battery("Litheem");
	Phone i=new Phone("Vivo",battery);
	i.call();
	i.Show();
	
	
}
}
