package learning.Streaming;
import  java.io.*;

import learning.beans.Student;

public class Write_ReadObject 
{
public static void main(String[] args) {
	Object_Operations op= new Object_Operations();
	op.writesstudentDetails();
}
}

class Object_Operations
{
	public void writeStudentDetails()
	{
		String file_name="d:\\student.txt";
		File f=new File(file_name);
		try {
			if(f.exists())
				{System.out.println("File already created ");
				
				}
			else
			{
			f.createNewFile();
			System.out.println(f.getName());
			}
			Student s=new Student("Anurag","java",122,3000.00f);
			ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream(f));
			oss.writeObject(s);
			System.out.println("Object Written");
		}catch(IOException ie)
		{
			ie.printStackTrace();
	}
}

	public void writesstudentDetails() {
		// TODO Auto-generated method stub
		
	}
	}
