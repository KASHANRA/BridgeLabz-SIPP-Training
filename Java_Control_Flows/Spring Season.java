package level_1;
import java.util.*;
public class Seventh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day: ");
		int d = sc.nextInt();
		System.out.print("Enter month: ");
		int m = sc.nextInt();
		if(m == 3) {
			if(d >= 20 && d <= 31) {
				System.out.println("Its a Spring Season");
			}
			else {
				System.out.println("Its not a Spring Season");
			}
		}
		else if(m == 4) {
			if(d <= 30) {
				System.out.println("Its a Spring Season");
			}
			else {
				System.out.println("Invalid Date");
			}
		}
		else if(m == 5) {
			if(d <= 31) {
				System.out.println("Its a Spring Season");
			}
			else {
				System.out.println("Invalid Date");
			}
		}
		else if(m == 6) {
			if(d <= 20) {
				System.out.println("Its a Spring Season");
			}
			else {
				System.out.println("Its not a Spring Season");
			}
		}
		else {
			System.out.println("Its not a Spring Season");
		}
	}
}
