package www.aur.online.testing.opss;
import java.util.Scanner;
class BankA {
public double rateofInterest()
{
	return 0.0;
}
}
class Hdfc extends BankA
{
	@Override
	public double rateofInterest() {
		return 1.5;
	}
}
class SBI extends BankA
{
@Override
public double rateofInterest() {
	return 3.4;
}
}
class ICIC extends BankA
{
	@Override
	public double rateofInterest() {
		return 1.0;
	}
}
class Salesman extends BankA
{
	public void provideHomeLoans(double amount,BankA bank) {
double roi=bank.rateofInterest();
System.out.println(roi);
int rateInInt=(int) (roi*100);
System.out.println(rateInInt+"% is the rate of interest"+"quoted by"+bank.getClass().getSimpleName()+"bank");
		
double interestAmount=amount*roi;
System.out.println(interestAmount +"INR is the intrtrst"+"quoted by"+ bank.getClass().getSimpleName()+"bank");
double grandTotalAmount=interestAmount+amount;
System.out.println(grandTotalAmount +"INR is the intrtrst"+"quoted by"+ bank.getClass().getSimpleName()+"bank");
	
	
	
	}
}
public class Bank
{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Amount:");
	double amount=scan.nextDouble();
	Salesman salesman=new Salesman();
	salesman .provideHomeLoans(amount,new Hdfc());
	
	}
}