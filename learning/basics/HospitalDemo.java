package learning.basics;

public class HospitalDemo 
{
	public static void main(String[] args) {
		Hospital.checkWeight(120);
		System.out.println(Hospital.CITY_NAME);
		Hospital h =new Hospital("ANU");
		h.getName();
	}

}
