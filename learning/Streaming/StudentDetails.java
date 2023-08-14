package learning.Streaming;

import java.io.*;

public class StudentDetails {
	public static void main(String[]args)
	{
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			bw=new BufferedWriter(new FileWriter("d:\\student_details.txt",true));
			for(int i=1;i<=3;i++)
			{
			System.out.println("Enter Name");
			String name=br.readLine();
			bw.write(name+"\t");
			System.out.println("Enter email");
			String email=br.readLine();
			bw.write(email+"\t");
			System.out.println("Enter courseName");
			String course_name=br.readLine();
			bw.write(course_name);
			bw.newLine();
			}
			
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		finally {
			try {
				br.close();
				bw.close();
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
		}
	}

}
