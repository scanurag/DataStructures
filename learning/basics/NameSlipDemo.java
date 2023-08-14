package learning.basics;

public class NameSlipDemo {
	public static void main(String[] args) {
		NameSlip ns=new NameSlip("Anurag","SRM",28);
		ns.getDetails();
		
		System.out.println("------instance value modification");
		ns.setDetails("ANU","SRMGPC",22);
		ns.getDetails();
	}


}
