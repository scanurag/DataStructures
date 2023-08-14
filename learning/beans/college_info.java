package learning.beans;

import learning.basics.College;
import learning.beans.*;

public class college_info {
  public static void main(String[] args) {
	
	Course c1= new Course("Anurag","BE18cs","4yrs",100000.0f);
	College c = new College();
	  c.setCollege_Name("SRM");
	  c.set(c1);
	  String nm=c.getCollege_Name();
	  System.out.println("Collegename is "+nm);
	  System.out.println("college name is :"+c.getCollege_Name());
	  
	  
	  
	  
	  
}
}
