package ForLoop;
import java.util.Scanner;
public class MagicNumber {  
	public static void main(String args[])  
	{  
	int n, num, sum = 0;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter a number you want to check: ");   
	n = sc.nextInt();  
	num = n;   
	while (num >=10 )                 
	{ 
		n=num;
		sum=0;
	while (n > 0)  
	{       
	int rem = n % 10;   
	sum = sum + rem;   
	n = n / 10;     
	}  
	num = sum;  

	}  
	if (num == 1)  
	{  
	System.out.println("The given number is a magic number."+sum);  
	}  
	else  
	{  
	System.out.println("The given number is not a magic number.");  
	}  
}
	}
