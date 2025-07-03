package level_2;
import java.util.*;
public class LeapYear_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int y = sc.nextInt();
		if(y % 4 == 0) {
			if(y % 100 != 0) {
				System.out.println("Leap Year");
			}
			else if(y % 400 == 0) {
				System.out.println("Leap Year");
			}
			else {
				System.out.println("Not a Leap Year");
			}
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}
}
