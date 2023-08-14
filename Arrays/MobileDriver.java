package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MobileDriver {
static Scanner os=new Scanner(System.in);
public static void main(String[] args) {
	Comparator1[] arr= {new Comparator1("Redmi",1000,6),
	new	Comparator1("Poco",11000,6),new Comparator1("Oppo",9000,4),
	new Comparator1("RealMe",8000,4),
	new Comparator1("RealMe",2000,8)
	};
	for(Comparator1 m:arr) {
		System.out.println(m);
	}
	boolean flag = true;
	while(flag) {
		System.out.println("1.Pice: low to high");
		System.out.println("2.pice : High to low");
		System.out.println("3.Brand name");
		System.out.println("4.Exit");
		int choice=os.nextInt();
		switch(choice) {
		case 1:
			Arrays.sort(arr);
			for (Comparator1 obj : arr) {
				System.out.println(obj);
			}
			break;
		case 2:
			Arrays.sort(arr, new SortBy());
			for (Comparator1  obj : arr) {
				System.out.println(obj);
			}
			break; 	
		case 3: Arrays.sort(arr, new SortBy());
		for (Comparator1 obj : arr) {
			System.out.println(obj);
		}
		break;
		case 4:
			// exit
			System.out.println("Are You sure?1.for exit\nany other number to continue");
			int exit = os.nextInt();
			if(exit == 1)
			{
				System.out.println("Thank you");
				flag = false;
			}
			
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}
}
}
