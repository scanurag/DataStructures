package learning.Streaming;
import java.io.*;
public class user_input {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name :");
		try {
		String name=br.readLine();
		System.out.println("Enter your age :");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter your Salary :");
		float salary=Float.parseFloat(br.readLine());
		System.out.println("Name is :"+name+ " Age is " +age+" Salary is " +salary);
	}
     catch(IOException ie)
		{
    	 ie.printStackTrace();
		}
		finally {
			try {
				br.close();
				
			}
			catch(IOException ie)
			{
	    	 ie.printStackTrace();
		}
}
}
}