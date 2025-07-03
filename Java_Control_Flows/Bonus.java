package level_2;
import java.util.*;
public class Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary: ");
		int s = sc.nextInt();
		System.out.print("Enter years of service: ");
		int y = sc.nextInt();
		if(y > 5) {
			System.out.println("Your bonus will be: " + (s * 0.05f));
		}
		else {
			System.out.println("No Bonus");
		}
	}
}
