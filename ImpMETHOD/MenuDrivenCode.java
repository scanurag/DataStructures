package ImpMETHOD;
import java.util.Scanner;
public class MenuDrivenCode 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to my software: ");
		
		for(;;)
		{
			System.out.println("1. Factorial\n"
					+ "2. Length of a number\n"
					+ "3. Reverse of a number\n"
					+ "4. Power of a number\n"
					+ "5. Check ArmStrong\n"
					+ "6. Check Strong\n"
					+ "7. Range of ArmStrong\n"
					+ "8. Range of Strong");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Choice: ");
			int choice = scan.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Factorial: ");
				System.out.println("Enter the Number: ");
				int number = scan.nextInt();
				
				if(number < 0) System.out.println("No Negatvies");
				else
				{
					int result  = Utility.factorial(number);
					System.out.println(number + " != " + result);
				}
			}
			else if(choice == 2)
			{
				System.out.println("Length of a Number: ");
				System.out.println("Enter the number: ");
				int number = scan.nextInt();
				
				if(number< 0) System.out.println("No Negatives");
				else
				{
					int resultLen = Utility.length(number);
					System.out.println(number + " length is " + resultLen);
				}
				
			}
			else if(choice == 3)
			{
				System.out.println("Reverse of a Number: ");
				System.out.println("Enter the number: ");
				int number = scan.nextInt();
				
				if(number< 0) System.out.println("No Negatives");
				else
				{
					int resultReverse = Utility.reverse(number);
					System.out.println(number + " reverse is " + resultReverse);
				}
				
			}
			else if(choice == 4)
			{
				System.out.println("Power of a Number: ");
				System.out.println("Enter the Base: ");
				int base = scan.nextInt();
				
				System.out.println("Enter the Exponent: ");
				int exp = scan.nextInt();
				
				int resultPower = Utility.power(base, exp);
				System.out.println("The power is : " + resultPower);
			}
			else if(choice == 5)
			{
				System.out.println("Check ArmStrong");
				System.out.println("Enter the number: ");
				int number = scan.nextInt();
				
				if(number< 0) System.out.println("No Negatives");
				else
				{
					int result = Utility.armStrong(number);
					if(number == result) System.out.println("Im ArmStrong");
					else System.out.println("Im not Armstrong");
				}
				
				
			}
			else if(choice == 6)
			{
				System.out.println("Check Strong");
				
				System.out.println("Enter the number: ");
				int number = scan.nextInt();
				
				if(number< 0) System.out.println("No Negatives");
				else
				{
					int result = Utility.strong(number);
					if(number == result) System.out.println("Im Strong");
					else System.out.println("Im not Strong");
				}
				
			}
			else if(choice == 7)
			{
				System.out.println("Range of ArmStrong");
				
				System.out.println("Enter the range : ");
				int range = scan.nextInt();
				
				for(int i=1;i<=range;i++)
				{
					if(i == Utility.armStrong(i))
						System.out.println(i);
				}
			}
			else if(choice == 8)
			{
				System.out.println("Range of Strong");
				
				System.out.println("Enter the range : ");
				int range = scan.nextInt();
				
				for(int i=1;i<=range;i++)
				{
					if(i == Utility.strong(i))
						System.out.println(i);
				}
			}
			else
			{
				System.out.println("SIR/MADAM your have entered wrong choice: ");
				System.out.println("Thats okay, Try Again...!");
				System.out.println("Thank you");
			}
			
			System.out.println("Do you want to continue: Y/N");
			char ch = scan.next().charAt(0);
			if(ch == 'y' || ch == 'Y')
			{
				continue;
			}
			else
			{
				System.out.println("SIR/MADAM You have done with the software");
				System.out.println("So happy to have your time");
				System.out.println("Thank you, Visit Again...!");
				break;
			}
			
		}
		
		
		
		
	}

}
