package Oops;
class EmpDet{
	int Eid;
	String Ename;
	String EPhoneNumber;
	String Email;
    static String Company;
    static String CompanyAddress;
    public void mp3(int Eid,String Ename,String EPhoneNumber,String Email,String Company,String CompanyAddress) {
        this.Eid=Eid;
        this.Ename=Ename;
        this.EPhoneNumber=EPhoneNumber;
        this.Email=Email;
        this.Company=Company;
        this.CompanyAddress=CompanyAddress;
    }
    public void mp4() {
		System.out.println(Eid);
		System.out.println(Ename);
		System.out.println(EPhoneNumber);
		System.out.println(Email);
		System.out.println(Company);
		System.out.println(CompanyAddress);
	} 

}
public class Emp {
public static void main(String[] args) {
	EmpDet empDet = new EmpDet();
	    empDet.mp3(1122, "AnuragSingh", "7234020314","scanurag@gmail.com","TCS", "Pune");
	    empDet.mp4();
}
}
