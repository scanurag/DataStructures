package learning.Streaming;
import java.io.*;
public class Account {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter holder_name :");
		try
		{
			String holder_name=br.readLine();
			System.out.println("Enter Account_id :");
			String Account_id=br.readLine();
			System.out.println("Enter your Balance :");
			Long Balance=Long.parseLong(br.readLine());
			System.out.println("holder_name is :"+holder_name+ " Account_id is " +Account_id+" Balance is " +Balance);
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
