package learning.Streaming;
import java.io.*;
public class FileCopy_ByteStream {
public static void main(String[] agrs)
{
	BufferedInputStream  bis=null;
	BufferedOutputStream  bos=null;
	try {
		bis=new BufferedInputStream (new FileInputStream ("d:\\cse\\Demo.txt"));
		bos=new BufferedOutputStream(new FileOutputStream("d:\\cse\\copyDemo1.txt"));
		long t1=System.currentTimeMillis();
		int ch;
		while((ch=bis.read())!=-1)
{
	bos.write(ch);
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
		
		if(bis!=null)
			bis.close();
		if(bos!=null)
			bos.close();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
}
	

}
}
