package learning.Streaming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		FileOpretion Opretion=new FileOpretion();
		Opretion.readFile("d:\\cse\\Demo.txt");
	}
}
class FileOpretion
{
	void readFile(String filepath)
	{
		try(
				BufferedReader br=new BufferedReader(new FileReader(filepath));
	)
		{
			String data;
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
		}
	

catch(IOException ie)
{
	ie.printStackTrace();
}
	}
}
