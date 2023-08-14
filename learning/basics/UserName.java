package learning.basics;
import java.util.Scanner;

public class UserName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]name=new String[2];
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Enter name :"+(i+1));
			String nam=sc.nextLine();
			name[i]=nam;
		}
		for(String n:name)
		{
			System.out.println(n.toUpperCase());
			
			
			
		}
		for(int i=name.length-1
				;i>0;i--)
			System.out.println(name[i].toUpperCase());
	}
	

}
