package learning.basics;

public class Hospital 
{
	String hospitalname;
	static final String CITY_NAME="LUCKNOW";
	
	Hospital(String hospitalname)
	{
		this.hospitalname=hospitalname;
	}
	void getName()
	{
		System.out.println("Hospital Name is :"+hospitalname);
	}
		static void checkWeight(int weight)
		{
	     if(weight>=100)
	     System.out.println("overweight");
	     else if(weight>=50 && weight<=70)
	    
	     
	    	 System.out.println("healthy");
	     
	     else
	     
	    	 System.out.println("unhealthy");
	     

		}
}
