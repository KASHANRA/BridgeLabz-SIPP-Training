package level_1;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int y = sc.nextInt();
		Leap(y);
	}
	public static void Leap(int a) {
		if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}
}
