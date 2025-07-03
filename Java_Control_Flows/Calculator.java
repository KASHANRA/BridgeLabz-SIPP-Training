package level_2;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice (+, - , * , / ): ");
		String c = sc.nextLine();
		switch(c) {
		case "+": 
			System.out.print("Enter 1st number: ");
			int a = sc.nextInt();
			System.out.print("Enter 2nd number: ");
			int b = sc.nextInt();
			System.out.println(a + b);
			break;
		case "-": 
			System.out.print("Enter 1st number: ");
			int d = sc.nextInt();
			System.out.print("Enter 2nd number: ");
			int e = sc.nextInt();
			System.out.println(d - e);
		    break;
		case "*":
			System.out.print("Enter 1st number: ");
			int f = sc.nextInt();
			System.out.print("Enter 2nd number: ");
			int g = sc.nextInt();
			System.out.println(f * g);
			break;
		case "/":
			System.out.print("Enter 1st number: ");
			int h = sc.nextInt();
			System.out.print("Enter 2nd number: ");
			int i = sc.nextInt();
			System.out.println((double)h / i);
			break;
		default: 
			System.out.println("Invalid choice");
		}
	}
}
