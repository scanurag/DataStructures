package learning.Streaming;
import java.io.*;
public class FileCopy {
public static void main(String[] agrs)
{
	BufferedReader br=null;
	BufferedWriter bw=null;
	try {
		br=new BufferedReader(new FileReader("d:\\cse\\Demo.txt"));
		bw=new BufferedWriter(new FileWriter("d:\\cse\\copyDemo.txt"));
		long t1=System.currentTimeMillis();
		int ch;
		while((ch=br.read())!=-1)
{
	bw.write(ch);
	long t2=System.currentTimeMillis();
	System.out.println("file copied"+(t2-t1)+"in milliseconds");
}
	}
	catch(FileNotFoundException fe)
	{
		fe.printStackTrace();
}
catch(IOException ie)
{
	ie.printStackTrace();
}
	finally {
		try {
		
		if(br!=null)
			br.close();
		if(bw!=null)
			bw.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
}
	

}
}
