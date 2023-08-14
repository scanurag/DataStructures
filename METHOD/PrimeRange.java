package METHOD;
import java.util.Scanner;
public class PrimeRange {
public static void main(String[] args) {
	Scanner jk=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int a=jk.nextInt();
	int b=jk.nextInt();
	for(int i=a; i<=b; i++) {
		if(PrimeNum.isPrime(i)) System.out.println(i);//primeNum class namee hai .isPrime ye method name
		//hai jo dusre code me likhe hai hum usko use kar rahe hai usko tum PrimeNum ke program me dekho
	}
}
}
//is ka use kar ke saan ho jata hai isko k