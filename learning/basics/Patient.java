package learning.basics;

public class Patient {
	String Patname;
	final static String HOSPITAL_NAME="GSVM";
	final static String ADDRESS="KANPUR";
static void showHospitalDetails() {
	System.out.println("HOSPITAL_NAME is"+HOSPITAL_NAME );
	System.out.println("ADDRESS is"+ADDRESS);
}
    Patient()
    {
    	
    }
    Patient(String Patname)
    	{
    		this.Patname=Patname;
    	}
    	void getName()
    	{
    		System.out.println("PatientName is :" +Patname);
    	}
public static void main(String[] args) {
	System.out.println("HOSPITAL_NAME is :"+Patient.HOSPITAL_NAME);
	System.out.println("ADDRESS is :" +Patient.ADDRESS);
	Patient p=new Patient("ANURAG");
	p.getName();
	showHospitalDetails();
	
} 

}




    
