package ForLoop;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner fg=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=fg.nextInt();
		switch(n) {
		case 1:System.out.println("Day is Monday");
		break;
		case 2:System.out.println("Day is Tuesday");
		break;
		case 3:System.out.println("Day is Wednesday");
		break;
		case 4:System.out.println("Day is Thursday");
		break;
		case 5:System.out.println("Day is Friday");
		break;
		case 6:System.out.println("Day is Saturday");
		break;
		case 7:System.out.println("Day is Sunday");
		break;
		default:System.out.println("not a day");
		}
	}

}
